final class bf_ {
   private int[] _n;
   static int _k;
   private int[] _j;
   private int[] _a;
   static qe_[] _f = new qe_[14];
   private int[] _l;
   static ge_ _h;
   private int _g;
   static int _b;
   static cn_ _d;
   static String _o;
   private int[] _c;
   private int[] _i;
   static tf_ _m;
   static cn_[] _e;

   private final void a093(int var1, int var2) {
      this._l = new int[200];
      if (var2 == 31) {
         this._a = new int[200];
         this._g = 0;
         this._j = new int[200];
         this._c = new int[200];
         int var3 = var1 & 16711935;
         int var4 = var1 & '\uff00';
         this._i = new int[64];

         int var5;
         int var6;
         for(var5 = 0; 64 > var5; ++var5) {
            var6 = (var5 << 2) * var3 & -16711936 | 16711680 & (var5 << 2) * var4;
            this._i[var5] = var6 >> 8;
         }

         var4 = var1 & '\uff00';
         var3 = var1 & 16711935;
         this._n = new int[32];

         for(var5 = 0; var5 < 16; ++var5) {
            var6 = var5 * var4 & 1044480 | 267390960 & var3 * var5;
            this._n[31 - var5] = this._n[var5] = var6 >> 4;
         }

      }
   }

   static final void a966(String var0, tg_ var1, int var2, se_ var3) {
      int var4 = 0;
      int var5 = -1;

      for(int var6 = 1; var0.length() > var6; ++var6) {
         char var7 = var0.charAt(var6);
         if (var7 == '<') {
            var5 = var1._k[0] + (var4 >> 8) + var3.b926(var0.substring(0, var6));
         }

         if (-1 == var5) {
            if (var7 == ' ') {
               var4 += var2;
            }

            var1._k[var6] = var1._k[0] + (var4 >> 8) + var3.b926(var0.substring(0, 1 + var6)) - var3.a371(var7);
         } else {
            var1._k[var6] = var5;
         }

         if ('>' == var7) {
            var5 = -1;
         }
      }

   }

   static final void a540(boolean var0) {
      gf_.a331(kd_._g);
      gf_.e115(41, 48, 599, 416);
      int var1;
      if (!var0) {
         for(var1 = 41; 599 > var1; var1 += df_._c._E) {
            df_._c.c093(var1, 48);
         }
      } else {
         var1 = oi_.b080(0, 3);
         int var2 = oi_.b080(0, 3);
         dm_._d[var1].c093(41, 48);
         qi_._f[var2].c093(-qi_._f[0]._y + 599, 48);
         df_._c.c093(41 + dm_._d[var1]._y, 48);
      }

      gf_.b331(kd_._g);
      c_.a842(0, 640, 0);
      c_.a842(0, 640, 40);
      vf_.a483(432, true, 33, 48);
      vf_.a483(432, true, 599, 48);
      vf_.a483(32, true, 164, 8);
      vf_.a483(32, true, 468, 8);
      un_.a770(41, 558, 416);
      ad_._e.h093(41, 48);
      ad_._e.j093(-ad_._e._d + 599, 48);
      ad_._e.f093(164 - ad_._e._d, 40 - ad_._e._b);
      ad_._e.i093(172, -ad_._e._b + 40);
      ad_._e.f093(-ad_._e._d + 468, -ad_._e._b + 40);
      ad_._e.i093(476, -ad_._e._b + 40);
   }

   final void a668(int var1, int var2, boolean var3, int var4) {
      gf_.f115(var2, var1, var4 >> 1, 0);
      gf_.h115(var2, var1, var4 >> 1, this._i[63]);
      int var9 = 0;
      if (var3) {
         for(; 200 > var9; ++var9) {
            int var7 = ((this._l[var9] >> 4) * (this._l[var9] >> 4) + (this._a[var9] >> 4) * (this._a[var9] >> 4)) / 3;
            if (0 < var7) {
               int var8 = var7 >> 4;
               int var5 = (int)((double)(this._l[var9] * var4) / Math.sqrt((double)(3 * var7)));
               if (var8 > 63) {
                  var8 = 63;
               }

               int var6 = (int)((double)(var4 * this._a[var9]) / Math.sqrt((double)(var7 * 3)));
               var7 *= var4;
               gf_.b907((var5 >> 1) + (var2 << 4), (var6 >> 1) + (var1 << 4), var7 >> 10, var8, this._i);
            }
         }

         gf_.g050(var2, var1, var4 >> 1, 0, 50);
         gf_.a907(var2 << 4, var1 << 4, var4 + 2 << 4 >> 1, 192, this._n);
         gf_.a907(var2 << 4, var1 << 4, 2 + var4 << 3, 192, this._n);
         gf_.a907(var2 << 4, var1 << 4, var4 + 2 << 3, 192, this._n);
         gf_.a907(var2 << 4, var1 << 4, 2 + var4 << 3, 192, this._n);
      }
   }

   public static void a423(byte var0) {
      _o = null;
      _f = null;
      if (var0 == 85) {
         _m = null;
         _d = null;
         _e = null;
         _h = null;
      }
   }

   static final void b150(int var0) {
      wj_ var1 = ra_._c;
      int var2 = var1.c474(true);
      if (var0 != 19664) {
         _k = -97;
      }

      pm_ var3;
      for(var3 = (pm_)li_._a.e024(var0 ^ -4796); null != var3 && var3._j != var2; var3 = (pm_)li_._a.a024(4)) {
      }

      if (null == var3) {
         tl_.a150(var0 ^ -19664);
      } else {
         int var4 = var1.c474(true);
         if (var4 != 0) {
            ah_._c[0] = tc_._u;
            int var5 = var3._i;

            int var6;
            for(var6 = 1; var4 > var6; ++var6) {
               ah_._c[var6] = var1.d738(-108);
            }

            hg_.a326(var0 + 12087, var5, var4);

            for(var6 = 0; var4 > var6; ++var6) {
               dj_.a330(var1, (byte)123);
               if (var6 == 0) {
                  oc_.a802(var6, dh_._g, cm_._P, fm_._g, ln_._e);
               } else {
                  oc_.a802(var6, dh_._g, cm_._P, fm_._g, ln_._e);
               }
            }

            kj_.a093(var5, 0);
            String[][] var12 = new String[2][var5];
            int[][] var7 = new int[2][var5 * 4];
            int var8 = lc_._d;
            int var9 = 0;

            int var10;
            int var11;
            for(var10 = 0; var8 > var9; ++var9) {
               var11 = ol_._k[var9];
               var12[0][var10] = ah_._c[var11];
               var7[0][var10 * 4] = i_._t[var11];
               var7[0][1 + var10 * 4] = mf_._d[var11];
               var7[0][2 + var10 * 4] = wa_._m[var11];
               var7[0][4 * var10 + 3] = tc_._w[var11];
               if (eh_.a213(ah_._c[var11]) && wa_._m[var11] + mf_._d[var11] + tc_._w[var11] == 0) {
                  var12[0][var10] = null;
                  --var10;
               }

               ++var10;
            }

            var9 = 0;

            for(var10 = 0; var9 < var8; ++var10) {
               var11 = ol_._k[var9 + var5];
               var12[1][var10] = ah_._c[var11];
               var7[1][var10 * 4] = i_._t[var11];
               var7[1][4 * var10 + 1] = mf_._d[var11];
               var7[1][4 * var10 + 2] = wa_._m[var11];
               var7[1][var10 * 4 + 3] = tc_._w[var11];
               if (eh_.a213(ah_._c[var11]) && tc_._w[var11] + wa_._m[var11] + mf_._d[var11] == 0) {
                  var12[1][var10] = null;
                  --var10;
               }

               ++var9;
            }
         }

         var3.a487(false);
      }
   }

   final void a150(int var1) {
      if (var1 <= -84) {
         int var2;
         for(var2 = 0; var2 < 200; ++var2) {
            int[] var10000;
            if (this._l[var2] < this._c[var2]) {
               var10000 = this._l;
               var10000[var2] += 6;
            }

            if (this._c[var2] < this._l[var2]) {
               var10000 = this._l;
               var10000[var2] -= 3;
            }

            if (this._j[var2] > this._a[var2]) {
               var10000 = this._a;
               var10000[var2] += 3;
            }

            if (this._a[var2] > this._j[var2]) {
               var10000 = this._a;
               var10000[var2] -= 6;
            }
         }

         var2 = 864 + oi_.b080(0, 160);
         double var3 = 0.01 * (double)oi_.b080(0, 21400);
         this._c[this._g] = (int)((double)var2 * Math.sin(var3));
         this._j[this._g] = (int)((double)var2 * Math.cos(var3));
         ++this._g;
         if (this._g >= 200) {
            this._g = 0;
         }

      }
   }

   static final int a586(int var0, int var1) {
      int var2;
      for(var2 = 1; var0 > 1; var1 *= var1) {
         if ((1 & var0) != 0) {
            var2 *= var1;
         }

         var0 >>= 1;
      }

      if (var0 == 1) {
         return var2 * var1;
      } else {
         return var2;
      }
   }

   static final void a311(int var0, int var1, int var2, int var3, String var4) {
      kn_.a020(var2, var4 + "_defeat", var1, var0, 125, 96, var4 + "_special", var4 + "_reveal");
      if (var3 != -18228) {
         a423((byte)-43);
      }

   }

   bf_(int var1) {
      this.a093(var1, 31);

      for(int var2 = 0; var2 < 100; ++var2) {
         this.a150(-105);
      }

   }
}
