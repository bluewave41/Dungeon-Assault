final class hg_ extends qb_ {
   private ug_ _m;
   static md_ _n = new md_();
   static long _s;
   static int[] _t;
   static wi_ _r;
   static String _p = "Skeleton Sentinels";
   md_ _q = new md_();
   mb_ _o = new mb_();

   private final void a633(lp_ var1, int[] var2, int var3, int var4, int var5, boolean var6) {
      if (0 != (4 & this._m._G[var1._p]) && var1._r < 0) {
         int var7 = this._m._Q[var1._p] / vn_._t;

         while(true) {
            int var8 = (-var1._m + 1048575 + var7) / var7;
            if (var8 > var5) {
               var1._m += var5 * var7;
               break;
            }

            var1._v.b397(var2, var4, var8);
            var4 += var8;
            var1._m += var8 * var7 - 1048576;
            var5 -= var8;
            int var9 = vn_._t / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            ni_ var11 = var1._v;
            if (this._m._o[var1._p] != 0) {
               var1._v = ni_.a456(var1._I, var11.l784(), 0, var11.h784());
               this._m.a777(var1, 4917, var1._x._r[var1._y] < 0);
               var1._v.a093(var9, var11.i784());
            } else {
               var1._v = ni_.a456(var1._I, var11.l784(), var11.i784(), var11.h784());
            }

            if (0 > var1._x._r[var1._y]) {
               var1._v.e150(-1);
            }

            var11.f150(var9);
            var11.b397(var2, var4, -var4 + var3);
            if (var11.e801()) {
               this._o.b501(var11);
            }
         }
      }

      var1._v.b397(var2, var4, var5);
      if (!var6) {
         _s = 44L;
      }

   }

   static final void a326(int var0, int var1, int var2) {
      if (null == kc_._Q || kc_._Q.length < var2) {
         kc_._Q = new int[var2 * 2];
      }

      if (i_._t == null || var2 > i_._t.length) {
         i_._t = new int[var2 * 2];
      }

      if (null == mf_._d || var2 > mf_._d.length) {
         mf_._d = new int[var2 * 2];
      }

      if (wa_._m == null || var2 > wa_._m.length) {
         wa_._m = new int[var2 * 2];
      }

      if (null == tc_._w || var2 > tc_._w.length) {
         tc_._w = new int[var2 * 2];
      }

      if (null == ci_._n || var2 > ci_._n.length) {
         ci_._n = new int[var2 * 2];
      }

      if (ol_._k == null || var2 + var1 > ol_._k.length) {
         ol_._k = new int[2 * (var1 + var2)];
      }

      if (tf_._e == null || var2 > tf_._e.length) {
         tf_._e = new boolean[var2 * 2];
      }

      ln_._d = Integer.MIN_VALUE;
      n_._d = Integer.MIN_VALUE;
      ib_._e = Integer.MAX_VALUE;
      da_._B = Integer.MAX_VALUE;
      if (var0 != 31751) {
         a326(59, -22, 8);
      }

      lc_._d = 0;
   }

   private final void a946(int var1, lp_ var2, int var3) {
      if (0 != (4 & this._m._G[var2._p]) && var2._r < 0) {
         int var4 = this._m._Q[var2._p] / vn_._t;
         int var5 = (-var2._m + var4 + 1048575) / var4;
         var2._m = 1048575 & var4 * var3 + var2._m;
         if (var3 >= var5) {
            if (0 != this._m._o[var2._p]) {
               var2._v = ni_.a456(var2._I, var2._v.l784(), 0, var2._v.h784());
               this._m.a777(var2, 4917, var2._x._r[var2._y] < 0);
            } else {
               var2._v = ni_.a456(var2._I, var2._v.l784(), var2._v.i784(), var2._v.h784());
            }

            if (0 > var2._x._r[var2._y]) {
               var2._v.e150(-1);
            }

            var3 = var2._m / var4;
         }
      }

      if (var1 >= -71) {
         _t = (int[])null;
      }

      var2._v.a150(var3);
   }

   final int a784() {
      return 0;
   }

   final void a150(int var1) {
      this._o.a150(var1);

      for(lp_ var3 = (lp_)this._q.e024(-24172); var3 != null; var3 = (lp_)this._q.a024(4)) {
         if (!this._m.a769(var3, -16257)) {
            int var2 = var1;

            do {
               if (var3._H >= var2) {
                  this.a946(-84, var3, var2);
                  var3._H -= var2;
                  break;
               }

               this.a946(-72, var3, var3._H);
               var2 -= var3._H;
            } while(!this._m.a293(-127, 0, var2, var3, (int[])null));
         }
      }

   }

   final qb_ c207() {
      lp_ var1;
      do {
         var1 = (lp_)this._q.a024(4);
         if (var1 == null) {
            return null;
         }
      } while(null == var1._v);

      return var1._v;
   }

   public static void d150() {
      _r = null;
      _p = null;
      _n = null;
      _t = null;
   }

   final qb_ d207() {
      lp_ var1 = (lp_)this._q.e024(-24172);
      if (null == var1) {
         return null;
      } else {
         return (qb_)(null == var1._v ? this.c207() : var1._v);
      }
   }

   final void b397(int[] var1, int var2, int var3) {
      this._o.b397(var1, var2, var3);

      for(lp_ var6 = (lp_)this._q.e024(-24172); null != var6; var6 = (lp_)this._q.a024(4)) {
         if (!this._m.a769(var6, -16257)) {
            int var5 = var3;
            int var4 = var2;

            do {
               if (var5 <= var6._H) {
                  this.a633(var6, var1, var4 + var5, var4, var5, true);
                  var6._H -= var5;
                  break;
               }

               this.a633(var6, var1, var5 + var4, var4, var6._H, true);
               var5 -= var6._H;
               var4 += var6._H;
            } while(!this._m.a293(118, var4, var5, var6, var1));
         }
      }

   }

   hg_(ug_ var1) {
      this._m = var1;
   }
}
