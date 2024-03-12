import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class kg_ extends Applet implements Runnable, FocusListener, WindowListener {
   static long _d;
   boolean _i = false;
   static cn_ _a;
   static nh_ _b;
   static String[] _e = new String[]{"Dragons of Renown", "<%highlight>You've reached the end of the Just Play tutorial. To continue, and battle in the realm of Dungaria, please log in or create an account.<br><br><%command>Exit this page and return to the main menu."};
   static int _f;
   static String _m = "Dead";
   static String _k = "Order your raider to disarm the guardian. <br><br>If the raider is detected by the guardian, nearby monsters will be alerted.<br><br>Requires: <col=21634A>Dodge</col>, <col=00A7D2>Sneak</col>";
   public static boolean _j;
   public static boolean _g;
   public static int _h;
   public static int _n;
   public static boolean _c;
   public static boolean _o;
   public static int _l;

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   final boolean hostNameCheck(int var1) {
      /*String var3 = this.getDocumentBase().getHost().toLowerCase();
      if (!var3.equals("jagex.com") && !var3.endsWith(".jagex.com")) {
         if (!var3.equals("funorb.com") && !var3.endsWith(".funorb.com")) {
            if (var3.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var3.length() > 0 && '0' <= var3.charAt(var3.length() - 1) && '9' >= var3.charAt(var3.length() - 1)) {
                  var3 = var3.substring(0, var3.length() - 1);
               }

               if (!var3.endsWith("192.168.1.")) {
                  this.a407((byte)-112, "invalidhost");
                  return false;
               } else {
                  return true;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }*/
	   return true;
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   abstract void c487(boolean var1);

   abstract void b487(boolean var1);

   public final URL getCodeBase() {
      if (ad_._d == null) {
         return rc_._b != null && rc_._b != this ? rc_._b.getCodeBase() : super.getCodeBase();
      } else {
         return null;
      }
   }

   public final void stop() {
      if (ba_._c == this && !cc_._c) {
         nj_._e = 4000L + kd_.c138(-2456);
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public abstract void init();

   public final void destroy() {
      if (ba_._c == this && !cc_._c) {
         nj_._e = kd_.c138(-2456);
         pj_.a054(0, 5000L);
         kf_._o = null;
         this.a893((byte)116, false);
      }
   }

   public final void run() {
      try {
         label136: {
            int var3;
            if (qg_._c != null) {
               String var1 = qg_._c.toLowerCase();
               if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                  String var2 = qg_._p;
                  if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                     this.a407((byte)-112, "wrongjava");
                     break label136;
                  }

                  if (var2.startsWith("1.6.0_")) {
                     for(var3 = 6; var3 < var2.length() && qm_.a331(57, var2.charAt(var3)); ++var3) {
                     }

                     String var4 = var2.substring(6, var3);
                     if (sj_.a454(var4, 10) && 10 > ri_.a034((byte)96, var4)) {
                        this.a407((byte)-112, "wrongjava");
                        break label136;
                     }
                  }
               }
            }

            if (qg_._p != null && qg_._p.startsWith("1.")) {
               int var7 = 2;

               int var9;
               for(var9 = 0; var7 < qg_._p.length(); ++var7) {
                  char var11 = qg_._p.charAt(var7);
                  if ('0' > var11 || var11 > '9') {
                     break;
                  }

                  var9 = var9 * 10 + (var11 - 48);
               }

               if (5 <= var9) {
                  ia_._O = true;
               }
            }

            Object var8 = ba_._c;
            if (null != rc_._b) {
               var8 = rc_._b;
            }

            Method var10 = qg_._g;
            if (var10 != null) {
               try {
                  var10.invoke(var8, Boolean.TRUE);
               } catch (Throwable var5) {
               }
            }

            eg_.b150(116);
            this.d423((byte)114);
            k_._h = bn_.a788(-1, c_._h, up_._d, eg_._d);
            this.a423((byte)-80);
            o_._o = fd_.b653();

            while(0L == nj_._e || nj_._e > kd_.c138(-2456)) {
               nk_._Kb = o_._o.a871(hk_._e, -108);

               for(var3 = 0; var3 < nk_._Kb; ++var3) {
                  this.c150(-1);
               }

               this.c423((byte)-68);
               ho_.a246(i_._A, c_._h);
            }
         }
      } catch (Throwable var6) {
         sm_.a741(var6, 1, (String)null);
         this.a407((byte)-112, "crash");
      }

      this.a893((byte)116, true);
   }

   public static final void provideLoaderApplet(Applet var0) {
      rc_._b = var0;
   }

   public final void windowIconified(WindowEvent var1) {
   }

   final void a407(byte var1, String var2) {
      if (!this._i) {
         this._i = true;
         System.out.println("error_game_" + var2);

         try {
            ee_.a460(m_.c372(true), "loggedout");
            if (var1 != -112) {
               this.c150(116);
            }
         } catch (Throwable var5) {
         }

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var2 + ".ws"), "_top");
         } catch (Exception var4) {
         }

      }
   }

   public final void focusLost(FocusEvent var1) {
      rn_._b = false;
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public final AppletContext getAppletContext() {
      if (null == ad_._d) {
         return rc_._b != null && rc_._b != this ? rc_._b.getAppletContext() : super.getAppletContext();
      } else {
         return null;
      }
   }

   final synchronized void d423(byte var1) {
      if (c_._h != null) {
         c_._h.removeFocusListener(this);
         c_._h.getParent().setBackground(Color.black);
         c_._h.getParent().remove(c_._h);
      }

      Object var2;
      if (null != hh_._k) {
         var2 = hh_._k;
      } else if (ad_._d != null) {
         var2 = ad_._d;
      } else if (rc_._b != null) {
         var2 = rc_._b;
      } else {
         var2 = ba_._c;
      }

      ((Container)var2).setLayout((LayoutManager)null);
      c_._h = new ql_(this);
      ((Container)var2).add(c_._h);
      c_._h.setSize(up_._d, eg_._d);
      c_._h.setVisible(true);
      if (ad_._d == var2) {
         Insets var3 = ad_._d.getInsets();
         c_._h.setLocation(aj_._Gb + var3.left, rb_._L + var3.top);
      } else {
         c_._h.setLocation(aj_._Gb, rb_._L);
      }

      c_._h.addFocusListener(this);
      c_._h.requestFocus();
      rj_._o = true;
      rn_._b = true;
      im_._d = true;
      ve_._a = false;
      if (var1 >= 111) {
         pj_._z = kd_.c138(-2456);
      }
   }

   abstract void a150(int var1);

   public final void start() {
      if (this == ba_._c && !cc_._c) {
         nj_._e = 0L;
      }
   }

   public final synchronized void paint(Graphics var1) {
      if (ba_._c == this && !cc_._c) {
         im_._d = true;
         if (ia_._O && -pj_._z + kd_.c138(-2456) > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= sf_._h && var2.height >= sl_._d) {
               ve_._a = true;
            }
         }

      }
   }

   private final void c150(int var1) {
      if (var1 != -1) {
         this.b423((byte)-82);
      }

      long var2 = kd_.c138(var1 - 2455);
      long var4 = jf_._g[jl_._d];
      jf_._g[jl_._d] = var2;
      if (0L != var4 && var4 < var2) {
      }

      jl_._d = 1 + jl_._d & 31;
      synchronized(this) {
         rj_._o = rn_._b;
      }

      this.a150(-100);
   }

   abstract void b423(byte var1);

   public final void focusGained(FocusEvent var1) {
      rn_._b = true;
      im_._d = true;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final String getParameter(String var1) {
      if (null != ad_._d) {
         return null;
      } else {
         return null != rc_._b && rc_._b != this ? rc_._b.getParameter(var1) : super.getParameter(var1);
      }
   }

   private final void c423(byte var1) {
      long var2 = kd_.c138(-2456);
      long var4 = id_._b[np_._K];
      if (var1 != -68) {
         this._i = false;
      }

      id_._b[np_._K] = var2;
      if (var4 != 0L && var2 > var4) {
         int var6 = (int)(var2 - var4);
         bc_._a = (32000 + (var6 >> 1)) / var6;
      }

      np_._K = 31 & np_._K + 1;
      if (sb_._b++ > 50) {
         im_._d = true;
         sb_._b -= 50;
         c_._h.setSize(up_._d, eg_._d);
         c_._h.setVisible(true);
         if (null != ad_._d && null == hh_._k) {
            Insets var7 = ad_._d.getInsets();
            c_._h.setLocation(var7.left + aj_._Gb, rb_._L + var7.top);
         } else {
            c_._h.setLocation(aj_._Gb, rb_._L);
         }
      }

      this.b423((byte)38);
   }

   protected kg_() {
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   abstract void a423(byte var1);

   private final void a893(byte var1, boolean var2) {
      synchronized(this) {
         if (cc_._c) {
            return;
         }

         cc_._c = true;
      }

      if (null != rc_._b) {
         rc_._b.destroy();
      }

      try {
         this.c487(true);
         if (var1 != 116) {
            _d = 31L;
         }
      } catch (Exception var8) {
      }

      if (c_._h != null) {
         try {
            c_._h.removeFocusListener(this);
            c_._h.getParent().remove(c_._h);
         } catch (Exception var7) {
         }
      }

      if (i_._A != null) {
         try {
            i_._A.a423((byte)-119);
         } catch (Exception var6) {
         }
      }

      this.b487(false);
      if (ad_._d != null) {
         try {
            System.exit(0);
         } catch (Throwable var5) {
         }
      }

      System.out.println("Shutdown complete - clean:" + var2);
   }

   public static void a487() {
      _a = null;
      _e = null;
      _b = null;
      _k = null;
      _m = null;
   }

   public final URL getDocumentBase() {
      if (null == ad_._d) {
         return null != rc_._b && rc_._b != this ? rc_._b.getDocumentBase() : super.getDocumentBase();
      } else {
         return null;
      }
   }

   final void a248(int var1, byte var2, String var3, int var4, int var5, int var6, int var7) {
      try {
         if (null != ba_._c) {
            ++ql_._b;
            if (3 > ql_._b) {
               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
               return;
            }

            this.a407((byte)-112, "alreadyloaded");
            return;
         }

         eg_._d = var4;
         sl_._d = var4;
         rb_._L = 0;
         up_._d = var5;
         sf_._h = var5;
         wj_._s = var7;
         ba_._c = this;
         aj_._Gb = 0;
         ci_._q = m_.c372(true);
         kf_._o = i_._A = new qg_(var1, var3, var6, true);
         pn_ var8 = i_._A.a508(-21432, 1, this);

         while(var8._c == 0) {
            pj_.a054(0, 10L);
         }

         if (var2 < 83) {
            this._i = false;
         }
      } catch (Throwable var9) {
         sm_.a741(var9, 1, (String)null);
         this.a407((byte)-112, "crash");
      }

   }
}
