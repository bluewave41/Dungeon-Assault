import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;
import sun.net.www.protocol.http.AuthenticationInfo;

final class ha_ extends um_ {
   static String[] _n = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
   static String[] _j = new String[]{"Hoard Room", "You have reached the <%highlight>hoard room</col>! You can now select <%highlight>how much gold you wish to steal</col>. For every ten pieces of gold you steal, you will gain <%highlight>one point of Renown</col> - but the chance of waking the dragon increases as your raiders become more ambitious! If the Dragon wakes, <%highlight>some of your raiders may be killed</col>."};
   private ProxySelector _m = ProxySelector.getDefault();
   static String _o = "Connection lost - attempting to reconnect";
   static lc_ _k;
   static String[] _l = new String[]{"Harden Raider", "Double target <%defence> in the next room. (Single use)"};

   static final void d150(int var0) {
      vf_._w = 620;
      qc_._w = 240;
      kn_._g = true;
      id_._l = null;
      gk_._L = null;
      wi_._kb = 0;
      jn_._l = null;
      hc_._b = 0;
      h_._f = null;
      ui_._a = 0;
      ce_._p = -1;
      bl_._l = null;
      pp_._K = new md_();
      ti_._A = sj_.a595(dh_._a, 37);
      ti_._A._v = 1;
      tk_._k = sj_.a595(fl_._i, 107);
      ec_._n = sj_.a595(wm_._h, 59);
      ec_._n._v = var0;
      pp_._K.a865(ti_._A, false);
      pp_._K.a865(tk_._k, false);
      pp_._K.a865(ec_._n, false);
      o_._n.a150(1);
   }

   private final Socket a879(int var1, byte var2, String var3, String var4) throws IOException {
      Socket var5 = new Socket(var3, var1);
      var5.setSoTimeout(10000);
      OutputStream var6 = var5.getOutputStream();
      if (null != var4) {
         var6.write(("CONNECT " + super._a + ":" + super._f + " HTTP/1.0\n" + var4 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
      } else {
         var6.write(("CONNECT " + super._a + ":" + super._f + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
      }

      var6.flush();
      BufferedReader var7 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
      String var8 = var7.readLine();
      if (null != var8) {
         label60: {
            if (!var8.startsWith("HTTP/1.0 200") && !var8.startsWith("HTTP/1.1 200")) {
               if (!var8.startsWith("HTTP/1.0 407") && !var8.startsWith("HTTP/1.1 407")) {
                  break label60;
               }

               int var9 = 0;
               String var10 = "proxy-authenticate: ";

               for(var8 = var7.readLine(); null != var8 && 50 > var9; var8 = var7.readLine()) {
                  if (var8.toLowerCase().startsWith(var10)) {
                     var8 = var8.substring(var10.length()).trim();
                     int var11 = var8.indexOf(32);
                     if (var11 != -1) {
                        var8 = var8.substring(0, var11);
                     }

                     throw new wl_(var8);
                  }

                  ++var9;
               }

               throw new wl_("");
            }

            return var5;
         }
      }

      var6.close();
      var7.close();
      if (var2 < 6) {
         d150(66);
      }

      var5.close();
      return null;
   }

   final Socket b693(int var1) throws IOException {
      boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
      if (var1 != 13905) {
         return (Socket)null;
      } else {
         if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
         }

         boolean var5 = 443 == super._f;

         List var3;
         List var4;
         try {
            var3 = this._m.select(new URI((!var5 ? "http" : "https") + "://" + super._a));
            var4 = this._m.select(new URI((!var5 ? "https" : "http") + "://" + super._a));
         } catch (URISyntaxException var15) {
            return this.a693(-27549);
         }

         var3.addAll(var4);
         Object[] var6 = var3.toArray();
         wl_ var7 = null;
         Object[] var8 = var6;

         for(int var9 = 0; var8.length > var9; ++var9) {
            Object var10 = var8[var9];
            Proxy var11 = (Proxy)var10;

            try {
               Socket var12 = this.a867(var11, var1 - 13285);
               if (null != var12) {
                  return var12;
               }
            } catch (wl_ var13) {
               var7 = var13;
            } catch (IOException var14) {
            }
         }

         if (null == var7) {
            return this.a693(-27549);
         } else {
            throw var7;
         }
      }
   }

   private final Socket a867(Proxy var1, int var2) throws IOException {
      if (var1.type() != Type.DIRECT) {
         SocketAddress var3 = var1.address();
         if (var3 instanceof InetSocketAddress) {
            if (var2 != 620) {
               _o = (String)null;
            }

            InetSocketAddress var4 = (InetSocketAddress)var3;
            if (var1.type() == Type.HTTP) {
               String var15 = null;

               try {
                  Class var6 = AuthenticationInfo.class;
                  Method var7 = var6.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
                  var7.setAccessible(true);
                  Object var8 = var7.invoke((Object)null, var4.getHostName(), new Integer(var4.getPort()));
                  if (var8 != null) {
                     Method var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization");
                     var9.setAccessible(true);
                     if ((Boolean)var9.invoke(var8)) {
                        Method var10 = var6.getDeclaredMethod("getHeaderName");
                        var10.setAccessible(true);
                        Method var11 = var6.getDeclaredMethod("getHeaderValue", URL.class, String.class);
                        var11.setAccessible(true);
                        String var12 = (String)var10.invoke(var8);
                        String var13 = (String)var11.invoke(var8, new URL("https://" + super._a + "/"), "https");
                        var15 = var12 + ": " + var13;
                     }
                  }
               } catch (Exception var14) {
               }

               return this.a879(var4.getPort(), (byte)113, var4.getHostName(), var15);
            } else if (var1.type() == Type.SOCKS) {
               Socket var5 = new Socket(var1);
               var5.connect(new InetSocketAddress(super._a, super._f));
               return var5;
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return this.a693(-27549);
      }
   }

   static final boolean b427() {
      synchronized(in_._C) {
         if (je_._i != pj_._x) {
            mm_._t = jk_._Db[je_._i];
            ob_._Yb = b_._a[je_._i];
            je_._i = 127 & je_._i + 1;
            return true;
         } else {
            return false;
         }
      }
   }

   static final double a405() {
      return ld_._f.nextDouble();
   }

   public static void c150() {
      _o = null;
      _k = null;
      _j = null;
      _n = null;
      _l = null;
   }
}
