final class o_ extends ne_ {
   static String _l = "Thief";
   static long _j;
   static wm_ _n = new wm_(25);
   int _p;
   fa_ _k;
   static ae_ _i;
   static String _q = "Single-player game";
   static int _m;
   static gj_ _o;

   static final void a218(int var0, jd_ var1) {
      wj_ var2 = ac_._B;
      var2.d556((byte)-122, var0);
      var2.a093(6, var1._m);
      var2.i093(var1._k, -128);
   }

   public static void d150() {
      _n = null;
      _l = null;
      _o = null;
      _i = null;
      _q = null;
   }

   static final boolean a017(CharSequence var0) {
      return ua_.a141(false, var0);
   }

   static final void a013(int var0, String var1, int var2) {
      ac_ var3 = gh_._i[var2];
      if (var0 == 11404) {
         if (null != var3) {
            var3._d = tp_.a267(kf_._p, "idle", var1, var0 ^ -11074);
            var3._u = tp_.a267(kf_._p, "victory", var1, -1998);
            var3._m = tp_.a267(kf_._p, "defeat", var1, -1998);
         }
      }
   }

   static final int a681(int var0, boolean var1, int var2) {
      return wk_.c474(false);
   }

   static final int a776(int var0, int var1) {
      int var2 = tg_._f[var0][var1];
      return !ke_.a097(57, var2) ? var1 * tg_._d[var0] + tg_._h[var0] : 439;
   }

   static final boolean a091(int[] var0, int[] var1, int var2, lb_ var3) {
      if (!mh_.a097(var2)) {
         return false;
      } else if (var2 != ek_._c) {
         var2 &= 127;
         if (wh_._a <= var2) {
            return false;
         } else if (var2 < cp_._R) {
            if (ok_._z <= var2) {
               return vl_.a873(bl_._n[-ok_._z + var2], -93, var0);
            } else if (gn_._d <= var2) {
               return ci_._s[var2 - gn_._d] <= var3._z;
            } else if (uf_._a > var2) {
               if (wm_._a > var2) {
                  return false;
               } else {
                  return dc_._p[-wm_._a + var2] <= var3._f;
               }
            } else {
               int var4 = 0;

               for(int var5 = 0; var5 < 6; ++var5) {
                  var4 += var3._J[var5];
               }

               return var4 >= hb_._m[var2 - uf_._a];
            }
         } else {
            return null != var1 && vl_.a873(var2 - cp_._R, -109, var1);
         }
      } else {
         return true;
      }
   }

   o_(fa_ var1, int var2) {
      this._p = var2;
      this._k = var1;
   }

   static final void a270(int var0, int var1, int[] var2, int var3, int[] var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -var6 + 256;

      for(int var11 = -var5; 0 > var11; ++var11) {
         for(int var12 = -var0; 0 > var12; ++var12) {
            var1 = var4[var3++];
            int var13 = var2[var7];
            var2[var7++] = mp_.a080(nb_.a080(var6 * nb_.a080(65280, var1) + nb_.a080(var13, 65280) * var10, 16711680), nb_.a080(-16711936, nb_.a080(16711935, var1) * var6 + nb_.a080(16711935, var13) * var10)) >>> 8;
         }

         var7 += var8;
         var3 += var9;
      }

   }

   static final void a150() {
      kn_._g = false;
   }
}
