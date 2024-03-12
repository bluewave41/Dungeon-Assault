final class kh_ extends ip_ {
   private boolean _p = false;
   private String _o;
   private static long[] _q = new long[256];
   static cn_ _r;
   static int _t;
   static int _n;
   static en_ _u;
   static boolean _s;
   static cn_[] _m;

   final void e487(boolean var1) {
      if (var1) {
         this._o = null;
      }
   }

   public static void e423() {
      _q = null;
      _m = null;
      _r = null;
      _u = null;
   }

   static final void e150() {
      jh_.c797();
      if (null == wm_._c) {
         bn_._f = new cn_(378, 300);
         wm_._c = new cn_(410, 332);
         wm_._c._A = -16;
         wm_._c._w = -16;
      }

      bn_._f.e797();
      gf_.a797();

      int var0;
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var0 = 0; 7 > var0; ++var0) {
         var1 = 27 * (-var0 + 6);
         var2 = 20 * var0;
         var3 = -var0 + 6;

         for(var4 = 0; 1 + var0 > var4; var1 += 54) {
            var5 = 16777215;
            if (null != qj_._c[var3]) {
               if (var3 != 0 && var3 != 6) {
                  rl_._d[5].e326(var1, var2, var5);
               }

               if (var3 != 6 && 48 != var3) {
                  rl_._d[4].e326(27 + var1, var2, var5);
               }

               ed_.a587(var2, var1, var3, var5);
               rl_._d[4].e326(var1, var2 + 20, var5);
               rl_._d[5].e326(27 + var1, 20 + var2, var5);
            }

            var3 += 8;
            ++var4;
         }
      }

      for(var0 = 7; 13 > var0; ++var0) {
         var1 = 27 * var0 - 162;
         var2 = 20 * var0;
         var3 = var0 * 7 - 42;

         for(var4 = 0; 13 - var0 > var4; var1 += 54) {
            var5 = 16777215;
            if (null != qj_._c[var3]) {
               rl_._d[5].e326(var1, var2, var5);
               rl_._d[4].e326(27 + var1, var2, var5);
               ed_.a587(var2, var1, var3, var5);
               rl_._d[5].e326(27 + var1, var2 + 20 + 0, var5);
               rl_._d[4].e326(var1, var2 + 20 - 0, var5);
            }

            var3 += 8;
            ++var4;
         }
      }

      wm_._c.e797();
      gf_.a797();
      bn_._f.e326(16, 16, 8454143);
      gf_.d669(8, 8, 0, 0, wm_._c._y, wm_._c._v);
      bn_._f.e326(16, 16, 0);
      jh_.b797();
   }

   static final boolean d427() {
      if (-1 == nj_._b) {
         if (!oi_.a097(-12929, 1)) {
            return false;
         }

         nj_._b = ra_._c.c474(true);
         ra_._c._o = 0;
      }

      if (nj_._b == -2) {
         if (!oi_.a097(-12929, 2)) {
            return false;
         }

         nj_._b = ra_._c.k137(0);
         ra_._c._o = 0;
      }

      return oi_.a097(-12929, nj_._b);
   }

   static final boolean d491() {
      return null != gi_._S || uc_.g154() || null != mh_._e || ck_.g154(-1);
   }

   final od_ a212(String var1, int var2) {
      if (!o_.a017(var1)) {
         return pd_._J;
      } else {
         if (!var1.equals(this._o)) {
            vk_ var3 = vk_.a041(var1);
            if (null == var3 || null != var3._g) {
               return oc_._A;
            }

            this._p = var3._a;
            this._o = var1;
         }

         return !this._p ? pd_._J : c_._d;
      }
   }

   final String a439(byte var1, String var2) {
      String var3 = jg_.a430(var2);
      if (null != var3) {
         return var3;
      } else {
         if (!var2.equals(this._o)) {
            vk_ var4 = vk_.a041(var2);
            if (null == var4 || null != var4._g) {
               return null;
            }

            this._p = var4._a;
            this._o = var2;
         }

         if (this._p) {
            return var1 < 44 ? (String)null : ng_._N;
         } else {
            return fp_._a;
         }
      }
   }

   kh_(rm_ var1) {
      super(var1);
   }

   static {
      for(int var2 = 0; var2 < 256; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((1L & var0) == 1L) {
               var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
               var0 >>>= 1;
            }
         }

         _q[var2] = var0;
      }

   }
}
