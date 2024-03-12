import java.math.BigInteger;

final class kd_ {
   static BigInteger _d = new BigInteger("5718356335657395518331821700519095443885622059651704259708802406811661091006861135294892374371095523138870720024266040385056460362796623317915157483226371");
   static tf_[] _e;
   static String _a = "Fullscreen";
   static cn_ _f;
   static String _b = "Just play";
   static int _c;
   static int[] _g = new int[4];

   static final void a229(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var3 < var6) {
         if (var6 < var5) {
            ue_.a657(var3, gf_._b, var4, var5, var0, var6, var1, var2);
         } else if (var3 < var5) {
            ue_.a657(var3, gf_._b, var4, var6, var2, var5, var1, var0);
         } else {
            ue_.a657(var5, gf_._b, var4, var6, var1, var3, var2, var0);
         }
      } else if (var3 >= var5) {
         if (var5 <= var6) {
            ue_.a657(var5, gf_._b, var4, var3, var0, var6, var2, var1);
         } else {
            ue_.a657(var6, gf_._b, var4, var3, var2, var5, var0, var1);
         }
      } else {
         ue_.a657(var6, gf_._b, var4, var5, var1, var3, var0, var2);
      }

   }

   static final void a150(int var0) {
      hl_.a487();
      sn_.a093(var0 ^ 61, var0);
   }

   static final void a253(nh_ var0) {
      wj_ var1 = new wj_(var0.a826("logo.fo3d", "", (byte)-113));
      int var2 = var1.c474(true);
      var1.e487(false);
      ch_._n = lo_.a413(var1, (byte)-128);
      ih_._w = new qh_[var2];
      lk_._R = new int[var2][];

      int var3;
      for(var3 = 0; var2 > var3; ++var3) {
         ih_._w[var3] = df_.a013(var1);
      }

      var1.f423((byte)32);

      for(var3 = 0; var3 < var2; ++var3) {
         qh_ var4 = ih_._w[var3];
         var4.a483(1, false, 6, 6, 6);
         var4.a423((byte)-127);
         int[] var5 = new int[]{var4._H + var4._i >> 1, var4._p + var4._M >> 1, var4._a + var4._b >> 1};
         lk_._R[var3] = var5;
         var4.a115(0, -var5[0], -var5[2], -var5[1]);
      }

   }

   static final void b150(int var0) {
      l_.a702(false, 0, 0, 0, 0, 0, 0, 0, 0, new int[0][], 0, false, 0);
      l_.a702(false, 0, 0, 1, 0, 0, 0, 0, 0, new int[0][], 0, false, 0);
      l_.a702(false, 0, 0, 2, 0, 0, 0, 0, 0, new int[0][], 0, true, 0);
      l_.a702(false, 0, 0, 3, 0, 0, 0, 0, var0 ^ 0, new int[0][], 0, false, 0);
      l_.a702(false, 0, 0, 5, 1, 1, 0, 100, 0, new int[0][], 0, false, 1);
      l_.a702(true, 0, 0, 4, 4, 1, 0, 200, var0 ^ 0, new int[][]{{11}}, 0, false, 1);
      l_.a702(true, 0, 0, 6, 2, 1, 1, 300, 0, new int[][]{{1, 1}}, 3500, false, 2);
      l_.a702(true, 0, 0, 7, 6, 1, 0, 500, 0, new int[][]{{11}}, 7500, false, 3);
      l_.a702(false, 0, 0, 8, 3, 1, 1, 600, var0 ^ 0, new int[][]{{13}}, 11000, false, 4);
      l_.a702(true, 0, 0, 9, 4, 1, 0, 800, 0, new int[][]{{1, 1}}, 16000, false, 3);
      l_.a702(true, 0, 0, 11, 3, 1, 1, 1100, 0, new int[0][], 20000, true, 7);
      l_.a702(true, 6, 8, 21, 5, 2, 1, 1400, var0 ^ 0, new int[][]{{15}}, 27500, false, 0);
      l_.a702(true, 6, 0, 12, 6, 1, 0, 1500, 0, new int[][]{{14}}, 32000, true, 4);
      l_.a702(true, 0, 0, 13, 7, 1, 1, 1800, 0, new int[][]{{1, 3}}, 39000, false, 7);
      l_.a702(false, 0, 0, 10, 8, 1, 2, 2200, 0, new int[][]{{11}, {12}}, 55000, true, 4);
      l_.a702(false, 0, 0, 14, 6, 1, 3, 2300, 0, new int[0][], 65000, true, 8);
      l_.a702(false, 0, 0, 35, 2, 3, 0, 100, var0 + 0, new int[][]{{9, 1}}, 0, false, 0);
      l_.a702(false, 0, 0, 36, 0, 3, 1, 1100, 0, new int[][]{{10}, {8, 2}}, 23000, false, 6);
      l_.a702(false, 0, 0, 37, 9, 3, -1, 2200, 0, new int[][]{{9, 3}}, 60000, false, 0);
      l_.a702(true, 1, 1, 15, 1, 2, 0, 100, 0, new int[0][], 0, false, 1);
      l_.a702(true, 1, 1, 16, 2, 2, 0, 200, 0, new int[][]{{0, 1}}, 0, false, 0);
      l_.a702(true, 2, 2, 17, 1, 2, 1, 300, 0, new int[0][], 4500, false, 1);
      l_.a702(true, 2, 1, 25, 3, 2, var0, 350, 0, new int[0][], 5500, false, 1);
      l_.a702(true, 2, 3, 18, 1, 2, 0, 400, var0 ^ 0, new int[0][], 6500, false, 1);
      l_.a702(true, 2, 3, 24, 3, 2, 1, 500, 0, new int[][]{{0, 1}, {1, 1}}, 8500, false, 1);
      l_.a702(true, 2, 3, 19, 1, 2, 0, 600, 0, new int[0][], 9500, false, 4);
      l_.a702(true, 2, 4, 20, 3, 2, 0, 700, 0, new int[][]{{2}}, 11500, false, 0);
      l_.a702(true, 5, 2, 23, 4, 2, -1, 800, 0, new int[][]{{5, 2}}, 12500, false, 3);
      l_.a702(true, 2, 2, 27, 5, 2, 0, 850, var0 ^ 0, new int[][]{{0, 2}}, 14000, false, 2);
      l_.a702(true, 3, 5, 30, 1, 2, -1, 900, 0, new int[0][], 18000, true, 4);
      l_.a702(true, 5, 4, 28, 2, 2, 1, 1100, 0, new int[][]{{5, 2}, {0, 1}}, 21500, false, 6);
      l_.a702(true, 6, 6, 31, 2, 2, 1, 1200, 0, new int[0][], 24500, true, 0);
      l_.a702(true, 6, 2, 29, 4, 2, -1, 1300, 0, new int[0][], 26000, true, 6);
      l_.a702(true, 4, 8, 26, 7, 2, 0, 1400, 0, new int[][]{{17}}, 30000, false, 0);
      l_.a702(true, 7, 7, 22, 1, 2, 1, 1800, 0, new int[][]{{1, 2}}, 35000, false, 1);
      l_.a702(true, 5, 4, 32, 7, 2, 1, 1900, 0, new int[][]{{6}}, 42000, true, 4);
      l_.a702(true, 9, 5, 33, 8, 2, 2, 2200, 0, new int[0][], 62000, true, 5);
      l_.a702(true, 10, 6, 34, 10, 2, 3, 3000, var0 + 0, new int[][]{{7}}, 70000, true, 5);
   }

   public static void a423() {
      _g = null;
      _d = null;
      _e = null;
      _f = null;
      _a = null;
      _b = null;
   }

   static final synchronized long c138(int var0) {
      long var1 = System.currentTimeMillis();
      if (var1 < lo_._f) {
         fb_._c += -var1 + lo_._f;
      }

      if (var0 != -2456) {
         b150(-64);
      }

      lo_._f = var1;
      return fb_._c + var1;
   }
}
