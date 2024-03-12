final class oh_ implements ca_ {
   static String _a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
   static md_ _j = new md_();
   private se_ _m;
   private int _g;
   static int _s;
   private int _p;
   private int _f;
   private int _c = 1;
   private int _k;
   private int _d;
   private int _e;
   static String _o = "Recently raided by: ";
   private int _h;
   private int _l;
   static String _q = "Hidden Pit";
   private int _i;
   static String _b = "Reload game";
   private int _r = 1;
   static int _t;
   static String _n = "Play the game without logging in just yet";

   static final void a093(int var0, int var1) {
      al_._o.a150(1);
      al_._o.a093(24, -92);
      jb_._Sb[24] = -1;
      if (var1 != 7) {
         _b = (String)null;
      }

      hf_._ob.b150(-4);
      hf_._ob.a865(new a_(24), false);

      while(!hf_._ob.a427((byte)-88)) {
         int var2 = ((a_)hf_._ob.b081((byte)-124))._j;
         if (me_._g[var2]._h._g == var0) {
            al_._o.b093(var2, var1 + 24);
         } else {
            if (var2 % 7 > 0) {
               me_.a652(var2, var2 - 1, (byte)69, var2 - 1 - var2 / 7);
            }

            if (var2 % 7 < 6) {
               me_.a652(var2, var2 + 1, (byte)114, -(var2 / 7) + var2);
            }

            if (var2 > 6) {
               me_.a652(var2, var2 - 7, (byte)71, var2 - 7 + 42);
            }

            if (42 > var2) {
               me_.a652(var2, 7 + var2, (byte)115, var2 + 42);
            }
         }
      }

   }

   public static void a150() {
      _j = null;
      _a = null;
      _q = null;
      _b = null;
      _n = null;
      _o = null;
   }

   static final me_ a321(String var0) {
      return new me_(var0);
   }

   static final void a423() {
      if (null != m_._e && 20 <= gn_._h) {
         if (m_._e != un_._e) {
            of_._f = m_._e.b373((byte)-114);
            if (of_._f != null) {
               uo_._a = dd_.a510(8, of_._f);
            }
         }

         if (null != of_._f) {
            int var0 = of_._f._y;
            int var1 = of_._f._v;
            int var2 = hj_._S;
            if (var0 + var2 > 640) {
               var2 -= var0;
            }

            int var3 = eh_._h - var1;
            if (0 > var3) {
               var3 += 30 + var1;
            }

            gf_.b669(var2 - 8, var3 - 8, of_._f._y + 16, of_._f._v + 16, 16777215, 16);
            gf_.b669(var2 - 4, var3 - 4, 8 + of_._f._y, of_._f._v + 8, 0, 64);
            bp_.a131(var3, uo_._a, var2);
            of_._f.h093(var2, var3);
         }
      }

   }

   public final void a623(byte var1, lm_ var2, int var3, int var4, boolean var5) {
      rb_ var6 = (rb_)((rb_)(!(var2 instanceof rb_) ? null : var2));
      if (var6 != null) {
         var5 &= var6._B;
      }

      int var7 = 5592405;
      if (var5) {
         var7 = 16777215;
      }

      gf_.b050(var2._q + var3, var2._v + var4, var2._x, var2._s, this._g);
      if (var1 != 34) {
         a331(32, '\ufff4');
      }

      int var8 = var3 + var2._q + this._d;
      int var9 = var4 + var2._v + this._h;
      gf_.a050(var8, var9, this._l, this._e, 5592405);
      gf_.b050(var8, var9, this._l, this._e, var7);
      if (var6._E) {
         gf_.c050(var8, var9, this._l + var8, this._e + var9, 1);
         gf_.c050(var8 + this._l, var9, var8, var9 + this._e, 1);
      }

      if (null != this._m) {
         int var10 = this._k + this._l + this._d;
         this._m.a385(var2._w, var2._q + var3 + var10, this._f + var2._v + var4, -var10 - (this._k - var2._x), -(this._k << 1) + var2._s, this._p, this._i, this._c, this._r, 0);
      }

   }

   static final cn_ a825(nh_ var0, String var1, String var2) {
      int var3 = var0.a913(var1, 1000);
      int var4 = var0.a026(0, var2, var3);
      return jf_.a182(var4, var0, var3, (byte)41);
   }

   static final boolean a331(int var0, char var1) {
      if ((var1 <= 0 || 128 <= var1) && (160 > var1 || 255 < var1)) {
         if (0 != var1) {
            char[] var2 = mh_._d;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               char var4 = var2[var3];
               if (var1 == var4) {
                  return true;
               }
            }
         }

         return var0 != -161;
      } else {
         return true;
      }
   }

   oh_(se_ var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this._k = var2;
      this._h = var7;
      this._p = var4;
      this._g = var10;
      this._e = var8;
      this._d = var6;
      this._i = var5;
      this._f = var3;
      this._m = var1;
      this._l = var9;
   }
}
