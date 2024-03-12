import java.applet.Applet;
import java.io.IOException;
import java.net.URL;
import java.util.Hashtable;

class lm_ extends ne_ {
   int _y;
   static byte[][] _l = new byte[50][];
   boolean _u;
   pg_ _n;
   static String _r = "Dryad";
   String _w;
   int _A;
   int _j;
   int _v;
   static int _k;
   static int[] _m = new int[8192];
   int _x;
   l_ _t;
   static String _p = "Type your password again to make sure it's correct";
   ca_ _o;
   int _q;
   int _s;
   static cn_ _z;
   String _i;

   static final void b423() {
      if (hb_._a != null) {
         hb_._a.a150(-1016);
      }

      if (null != na_._y) {
         na_._y.a150(-65);
      }

      if (null != sa_._x) {
         try {
            sa_._x.c423((byte)-118);
         } catch (IOException var4) {
         }
      }

      if (null != cf_._c) {
         for(int var1 = 0; cf_._c.length > var1; ++var1) {
            if (null != cf_._c[var1]) {
               try {
                  cf_._c[var1].c423((byte)-42);
               } catch (IOException var3) {
               }
            }
         }
      }

   }

   void b050(int var1, int var2, int var3, int var4, int var5) {
      this._s = var5;
      this._v = var3;
      this._x = var2;
      if (var1 == 0) {
         this._q = var4;
      }
   }

   static final void a812(byte var0, Applet var1) {
      try {
         URL var2 = var1.getCodeBase();
         String var3 = j_.a550(var2, var1).getFile();
         ee_.a008("updatelinks", var1, var0 ^ -15735, new Object[]{"home", var3 + "home.ws"});
         if (var0 != -106) {
            a890(true, (String)null, 27L, (Applet)null, (String)null);
         }

         ee_.a008("updatelinks", var1, 15647, new Object[]{"gamelist", var3 + "togamelist.ws"});
         ee_.a008("updatelinks", var1, 15647, new Object[]{"serverlist", var3 + "toserverlist.ws"});
         ee_.a008("updatelinks", var1, 15647, new Object[]{"options", var3 + "options.ws"});
         ee_.a008("updatelinks", var1, 15647, new Object[]{"terms", var3 + "terms.ws"});
         ee_.a008("updatelinks", var1, 15647, new Object[]{"privacy", var3 + "privacy.ws"});
      } catch (Throwable var4) {
      }

   }

   boolean a276(int var1, int var2, int var3, int var4, int var5, lm_ var6, byte var7) {
      if (var7 != -84) {
         this._j = -54;
      }

      return false;
   }

   static final void a789(int var0, int var1) {
      for(int var2 = 0; ib_._k > var2; ++var2) {
         if (var0 == ue_._j[var2]) {
            ue_._j[var2] = var1;
         }
      }

   }

   StringBuilder a481(int var1, Hashtable var2, StringBuilder var3, byte var4) {
      if (var4 >= -76) {
         this._t = (l_)null;
      }

      if (this.a597(var2, var1, -113, var3)) {
         this.a801(var1, var3, var2, 1);
      }

      return var3;
   }

   boolean a336(int var1, lm_ var2) {
      if (var1 != 34) {
         this._q = 81;
      }

      return false;
   }

   final void f150(int var1) {
      this.b050(0, this._x, this._v, this._q, this._s);
      if (var1 != 12591) {
         this._y = 64;
      }

   }

   static final void a890(boolean var0, String var1, long var2, Applet var4, String var5) {
      try {
         String var6 = var4.getParameter("cookiehost");
         if (var0) {
            _k = 1;
         }

         String var7 = var1 + "=" + var5 + "; version=1; path=/; domain=" + var6;
         if (var2 >= 0L) {
            var7 = var7 + "; Expires=" + go_.a748(kd_.c138(-2456) + var2 * 1000L) + "; Max-Age=" + var2;
         } else {
            var7 = var7 + "; Discard;";
         }

         ee_.a946("document.cookie=\"" + var7 + "\"", var4);
      } catch (Throwable var8) {
      }

   }

   final void a326(int var1, int var2, int var3) {
      int var4 = this.d137(127);

      for(int var5 = 0; var4 >= var5; ++var5) {
         this.a115(var5, var2, 0, var1);
      }

      if (var3 != 452) {
         this.a946((lm_)null, -108, -48, 123, 4, (byte)-62, -69);
      }

      String var6 = bk_.b738(var3 ^ 453);
      if (null != var6) {
         hl_._a.a668(var6, 6710886, fl_._l, wa_._c);
      }

   }

   public final String toString() {
      return this.a481(0, new Hashtable(), new StringBuilder(), (byte)-89).toString();
   }

   lm_(String var1, pg_ var2) {
      this(var1, hl_._a._m, var2);
   }

   final boolean a597(Hashtable var1, int var2, int var3, StringBuilder var4) {
      if (var1.containsKey(this)) {
         var4.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
         return false;
      } else {
         var1.put(this, this);
         return true;
      }
   }

   void a115(int var1, int var2, int var3, int var4) {
      if (var3 != 0) {
         a901((cn_)null);
      }

      if (var1 == 0 && null != this._o) {
         this._o.a623((byte)34, this, var2, var4, true);
      }

   }

   public static void d423() {
      _p = null;
      _l = (byte[][])null;
      _m = null;
      _z = null;
      _r = null;
   }

   String c983(byte var1) {
      if (var1 <= 3) {
         this.a336(12, (lm_)null);
      }

      return this._u ? this._i : null;
   }

   final boolean a564(int var1, int var2, char var3) {
      if (this.a427((byte)117) && this.a401(this, var3, var2, (byte)63)) {
         return true;
      } else if (var2 == 80) {
         return this.a336(34, this);
      } else {
         int var4 = -107 % ((82 - var1) / 44);
         return false;
      }
   }

   final void a801(int var1, StringBuilder var2, Hashtable var3, int var4) {
      var2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this._q).append(",").append(this._v).append(" ").append(this._x).append("x").append(this._s);
      if (this._w != null) {
         var2.append(" text=\"").append(this._w).append('"');
      }

      if (this._u) {
         var2.append(" mouseover");
      }

      if (this.a427((byte)31)) {
         var2.append(" focused");
      }

      if (this._o != null) {
         var2.append(" renderer=");
         if (!(this._o instanceof lm_)) {
            var2.append(this._o);
         } else {
            var2 = this.a481(1 + var1, var3, var2, (byte)-99);
         }
      }

      if (var4 == 1) {
         if (this._n != null) {
            var2.append(" listener=");
            if (!(this._n instanceof lm_)) {
               var2.append(this._n);
            } else {
               this.a481(1 + var1, var3, var2, (byte)-81);
            }
         }

      }
   }

   boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (var4 < 55) {
         this._t = (l_)null;
      }

      return false;
   }

   void a277(int var1, boolean var2, int var3, lm_ var4, int var5, int var6) {
      this._y = 0;
      if (!var2) {
         this._i = (String)null;
      }

   }

   final boolean a046(int var1, int var2, int var3, int var4, int var5) {
      if (var4 != -1) {
         return false;
      } else {
         return var1 >= this._q + var2 && var3 + this._v <= var5 && var2 + this._q + this._x > var1 && var5 < this._v + var3 + this._s;
      }
   }

   boolean a946(lm_ var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      if (this.a046(var5, var4, var7, -1, var3)) {
         this._y = var2;
      }

      return false;
   }

   int d137(int var1) {
      return 0;
   }

   static final void a901(cn_ var0) {
      ie_.a150();
      gf_.a397(var0._B, var0._E, var0._G);
   }

   void a319(int var1, int var2, lm_ var3, boolean var4) {
      boolean var5 = this.a046(hj_._S, var1, var2, -1, eh_._h);
      if (var4) {
         if (var5 != this._u) {
            this._u = var5;
            if (null != this._n && this._n instanceof de_) {
               ((de_)this._n).a343(true, this, var5);
            }
         }

      }
   }

   void e150(int var1) {
      if (var1 < 1) {
         this.toString();
      }

   }

   final boolean a421(int var1, byte var2, int var3, boolean var4) {
      if (var2 != 66) {
         this._A = -58;
      }

      this.a319(var3, var1, this, true);
      boolean var5 = this.a427((byte)95);
      if (!var4) {
         if (var5 && no_._d != 0) {
            this.e150(23);
         }
      } else {
         if (0 != pj_._r && var5) {
            this.a276(var3, var1, hj_._S, pj_._r, eh_._h, this, (byte)-84);
         }

         if (0 != no_._d) {
            if (!this.a946(this, no_._d, hm_._k, var3, lc_._c, (byte)0, var1)) {
               if (var5) {
                  this.e150(127);
               }
            } else {
               var4 = false;
            }
         }

         if (0 == la_._g && oe_._i != 0) {
            this.a277(var1, true, eh_._h, this, var3, hj_._S);
            oi_ var6 = ah_._b;
            if (var6 != null) {
               if (var6._n instanceof qo_) {
                  ((qo_)var6._n).a045((bj_)null, var6, false);
               }

               ah_._b = null;
            }
         }
      }

      oe_._i = la_._g;
      nk_.a627(this.c983((byte)34), (byte)23);
      return var4;
   }

   protected lm_() {
      this._A = 0;
      this._j = 0;
   }

   boolean a427(byte var1) {
      if (var1 <= 6) {
         this.a326(42, 36, -17);
      }

      return false;
   }

   lm_(String var1, ca_ var2, pg_ var3) {
      this._A = 0;
      this._j = 0;
      this._n = var3;
      this._o = var2;
      this._w = var1;
      if (this._o instanceof th_) {
         th_ var4 = (th_)this._o;
         this._x = var4.a353(82, this);
         this._s = var4.a349(this, 8);
      }

   }

   lm_(int var1, int var2, int var3, int var4, ca_ var5, pg_ var6) {
      this._A = 0;
      this._j = 0;
      this._s = var4;
      this._x = var3;
      this._o = var5;
      this._n = var6;
      this._v = var2;
      this._q = var1;
   }
}
