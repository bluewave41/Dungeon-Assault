import java.awt.Frame;

final class ad_ {
   int _a;
   static ph_ _e;
   static Frame _d;
   int _b;
   static String _c = "Passwords can only contain letters and numbers";

   static final ad_[] b265() {
      return new ad_[]{hl_._c, am_._b, tp_._y, m_._d, kj_._p, u_._U, og_._c, ib_._h, cm_._T, ve_._e, pm_._l, hf_._wb, sj_._hb, lg_._n};
   }

   static final void a028(int var0, int var1, int var2, int var3, cn_[] var4) {
      if (null != var4 && var0 > 0) {
         int var5 = var4[0]._E;
         int var6 = var4[2]._E;
         int var8 = var4[1]._E;
         var4[0].a326(var2, var1, var3);
         var4[2].a326(-var6 + var2 + var0, var1, var3);
         gf_.a331(mk_._i);
         gf_.a115(var5 + var2, var1, var0 + var2 - var6, var4[1]._G + var1);
         int var9 = var2 + var5;
         int var10 = var0 + (var2 - var6);

         for(var2 = var9; var10 > var2; var2 += var8) {
            var4[1].a326(var2, var1, var3);
         }

         gf_.b331(mk_._i);
      }
   }

   public final String toString() {
      throw new IllegalStateException();
   }

   public static void a150() {
      _e = null;
      _d = null;
      _c = null;
   }

   ad_(int var1, int var2, int var3, int var4) {
      this._b = var1;
      this._a = var4;
   }

   static final void a934(int var0, int var1, int var2, int var3, int var4, int var5, int var6, qh_ var7) {
      if (null != var7._y && 1 < var7._w) {
         byte[] var9 = var7._y;
         ll_.a078(0, var9, 0, hk_._b);
      } else {
         sf_.d150();
      }

      int[] var8 = new int[var7._c];
      int[] var40 = new int[var7._c];
      int[] var10 = hk_._c;
      int[] var11 = p_._x;
      int[] var12 = hd_._j;

      int var13;
      int var14;
      for(var13 = 0; var7._c > var13; ++var13) {
         var14 = var6 * var12[var13] + var1 * var11[var13] + var10[var13] * var2 >> 8;
         if (var14 < 0) {
            var14 = -var14;
         }

         var14 = var14 >= 0 ? (var14 >= 128 ? 256 : 128 + var14) : 128;
         int var15 = var12[var13] * var3 + var0 * var11[var13] + var10[var13] * var5 >> 8;
         var15 = jk_._Bb[0 > var15 ? -var15 : var15];
         var14 = (-var15 + 256) * var14 >>> 8;
         var8[var13] = var14;
         var40[var13] = var15;
      }

      for(var13 = 0; ab_._c > var13; ++var13) {
         var14 = hf_._yb[var13];
         short var41 = var7._A[var14];
         short var16 = var7._x[var14];
         short var17 = var7._N[var14];
         short var18 = var7._e[var14] < hk_._c.length ? var7._e[var14] : -1;
         short var19 = hk_._c.length > var7._s[var14] ? var7._s[var14] : -1;
         short var20 = var7._F[var14] >= hk_._c.length ? -1 : var7._F[var14];
         sm_ var21 = ch_._n != null && null != var7._o && var7._o.length > var14 && -1 != var7._o[var14] && ch_._n.length > var7._o[var14] ? ch_._n[var7._o[var14]] : null;
         int var22 = nj_._g[var41];
         int var23 = ra_._b[var41];
         int var24 = nj_._g[var16];
         int var25 = ra_._b[var16];
         int var26 = nj_._g[var17];
         int var27 = ra_._b[var17];
         int var28;
         int var29;
         int var30;
         int var31;
         int var32;
         int var33;
         if (var19 == var18 && var19 == var20) {
            var28 = var8[var18];
            var29 = var40[var18];
            var30 = var21 == null ? 8355711 : var21._d;
            var31 = var30 & 16711935;
            var32 = var30 & '\uff00';
            var33 = var31 * var28 >>> 8 & -352386817 | (var32 * var28 & 16711692) >>> 8;
            var33 += 65793 * var29;
            kd_.a229(var24, var22, var26, var23, 8355711 & var33 >> 1, var27, var25);
         } else {
            var28 = var8[var18];
            var29 = var8[var19];
            var30 = var8[var20];
            var31 = var40[var18];
            var32 = var40[var19];
            var33 = var40[var20];
            int var34 = null == var21 ? 8355711 : var21._d;
            int var35 = 16711935 & var34;
            int var36 = var34 & '\uff00';
            int var37 = 1040122111 & var35 * var28 >>> 8 | var28 * var36 >>> 8 & 218169088;
            int var38 = -889257729 & var35 * var29 >>> 8 | (var29 * var36 & 16711759) >>> 8;
            int var39 = var36 * var30 >>> 8 & -436142336 | (-16711837 & var30 * var35) >>> 8;
            var37 += var31 * 65793;
            var38 += 65793 * var32;
            var39 += var33 * 65793;
            fg_.a044(var27, var39 & 255, var25, var23, 255 & var37 >> 8, var39 >> 16, var38 >> 16, var39 >> 8 & 255, (var38 & 'ﾺ') >> 8, var37 >> 16, 255 & var38, var22, 255 & var37, var24, var26);
         }
      }

      var14 = -34 / ((-24 - var4) / 58);
   }
}
