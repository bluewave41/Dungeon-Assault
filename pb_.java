final class pb_ extends wf_ {
   static int _G;
   private Object _E;
   static String _H = "Continue";
   static String _F = "The changes you have made to your stable have not yet been saved. Would you like them to be saved now?";
   static String _I = "TREASURE:";

   public static void e423() {
      _I = null;
      _H = null;
      _F = null;
   }

   final boolean c427(byte var1) {
      return var1 != 21;
   }

   static final void a560(boolean var0, int var1, int[] var2, boolean var3, qh_ var4, int[] var5) {
      int var6 = Integer.MAX_VALUE;
      int var7 = Integer.MIN_VALUE;
      int var20 = var2[3] >> 2;
      int var21 = var2[4] >> 2;
      int var22 = var2[5] >> 2;
      int var23 = var2[6] >> 2;
      int var24 = var2[7] >> 2;
      int var25 = var2[8] >> 2;
      int var26 = var2[9] >> 2;
      int var27 = var2[10] >> 2;
      int var28 = var2[11] >> 2;
      int var11 = var22 * var5[5] + var21 * var5[4] + var5[3] * var20 >> 14;
      int var12 = var5[3] * var23 - (-(var24 * var5[4]) - var5[5] * var25) >> 14;
      int var19 = var28 * var5[11] + var5[9] * var26 + var27 * var5[10] >> 14;
      int var17 = var20 * var5[9] + var5[10] * var21 + var22 * var5[11] >> 14;
      int var18 = var25 * var5[11] + var23 * var5[9] + var5[10] * var24 >> 14;
      int var14 = var5[7] * var21 + var20 * var5[6] + var22 * var5[8] >> 14;
      int var16 = var27 * var5[7] + var5[6] * var26 + var5[8] * var28 >> 14;
      int var15 = var5[8] * var25 + var23 * var5[6] + var24 * var5[7] >> 14;
      int var13 = var28 * var5[5] + var5[4] * var27 + var26 * var5[3] >> 14;
      var20 = -var2[0] + var5[0];
      var21 = var5[1] - var2[1];
      var22 = var5[2] - var2[2];
      int var8 = var21 * var2[4] + var2[3] * var20 + var2[5] * var22 >> 16 - lh_._t;
      int var10 = var2[9] * var20 + var21 * var2[10] + var2[11] * var22 >> 16;
      int var9 = var2[8] * var22 + var20 * var2[6] + var2[7] * var21 >> -lh_._t + 16;
      var20 = re_._d;
      var21 = re_._h;

      for(var22 = var1; var22 < var4._B; ++var22) {
         short var32 = var4._L[var22];
         short var33 = var4._S[var22];
         short var34 = var4._z[var22];
         var26 = var8 + (var14 * var33 + var11 * var32 + var34 * var17 >> -lh_._t + 16);
         var27 = var9 + (var34 * var18 + var12 * var32 + var33 * var15 >> 16 - lh_._t);
         var28 = (var34 * var19 + var16 * var33 + var32 * var13 >> 16) + var10;
         if (50 > var28) {
            ko_._v[var22] = Integer.MIN_VALUE;
         } else {
            nj_._g[var22] = var20 + var26 / var28;
            ra_._b[var22] = var27 / var28 + var21;
            ko_._v[var22] = var28;
            if (var28 < var6) {
               var6 = var28;
            }

            if (var7 < var28) {
               var7 = var28;
            }
         }
      }

      if (null != var4._k && null != var4._g && null != var4._O && var4._r != null && null != var4._m && null != var4._T && var4._u != null && null != var4._K && null != var4._l) {
         for(var22 = 0; var4._h > var22; ++var22) {
            var23 = var4._k[var22];
            var24 = var4._g[var22];
            var25 = var4._O[var22];
            gi_._L[var22] = (var23 * var11 + var14 * var24 + var17 * var25 >> 16) + var8;
            lp_._B[var22] = var9 + (var12 * var23 + var24 * var15 + var18 * var25 >> 16);
            ok_._S[var22] = var10 + (var16 * var24 + var13 * var23 + var25 * var19 >> 16);
            var23 = var4._r[var22];
            var24 = var4._m[var22];
            var25 = var4._T[var22];
            fg_._d[var22] = var8 + (var11 * var23 - (-(var14 * var24) - var17 * var25) >> 16);
            lm_._m[var22] = var9 + (var15 * var24 + var12 * var23 + var18 * var25 >> 16);
            tc_._m[var22] = (var19 * var25 + var13 * var23 + var16 * var24 >> 16) + var10;
            var23 = var4._u[var22];
            var24 = var4._K[var22];
            var25 = var4._l[var22];
            i_._l[var22] = var8 + (var11 * var23 + var14 * var24 + var17 * var25 >> 16);
            vj_._d[var22] = (var25 * var18 + var23 * var12 + var15 * var24 >> 16) + var9;
            fm_._h[var22] = (var13 * var23 + var16 * var24 + var25 * var19 >> 16) + var10;
         }
      }

      if (var0) {
         var8 = var5[3];
         var9 = var5[4];
         var10 = var5[5];
         var11 = var5[6];
         var12 = var5[7];
         var13 = var5[8];
         var14 = var5[9];
         var15 = var5[10];
         var16 = var5[11];

         for(var17 = 0; var17 < var4._c && hk_._c.length > var17; ++var17) {
            short var29 = var4._d[var17];
            short var30 = var4._P[var17];
            short var31 = var4._v[var17];
            hk_._c[var17] = var31 * var14 + var29 * var8 + var30 * var11 >> 16;
            p_._x[var17] = var9 * var29 - (-(var30 * var12) - var31 * var15) >> 16;
            hd_._j[var17] = var10 * var29 + var30 * var13 + var16 * var31 >> 16;
         }
      }

      b_.a525(var6, var7, var3, var4);
   }

   final Object d092(int var1) {
      return var1 != 22698 ? (Object)null : this._E;
   }

   pb_(Object var1, int var2) {
      super(var2);
      this._E = var1;
   }
}
