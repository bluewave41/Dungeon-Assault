abstract class lo_ {
   static byte[][][] _c;
   int _a;
   int _h;
   int _e;
   int _b;
   int _d;
   int _g;
   static long _f;

   static final sm_[] a413(wj_ var0, byte var1) {
      int var2 = var0.j080(76, 8);
      if (var2 > 0) {
         return null;
      } else {
         int var3 = var0.j080(-80, 12);
         sm_[] var4 = new sm_[var3];
         if (var1 >= -109) {
            a789(-66, true, (vh_)null, -109, 2);
         }

         for(int var5 = 0; var3 > var5; ++var5) {
            if (!jl_.a234(var0)) {
               int var6 = var0.j080(-117, hh_.a080(1, var5 - 1));
               var4[var5] = var4[var6];
            } else {
               sm_ var7 = new sm_();
               var0.j080(74, 24);
               var0.j080(110, 24);
               var7._d = var0.j080(-66, 24);
               var0.j080(-79, 9);
               var0.j080(-75, 12);
               var0.j080(83, 12);
               var0.j080(-66, 12);
               var4[var5] = var7;
            }
         }

         return var4;
      }
   }

   abstract void a093(int var1, int var2);

   static final void a352(int var0, int var1, int var2, int var3, int var4, int var5, int[] var6, int var7, int var8, int var9) {
      while(true) {
         --var0;
         if (0 > var0) {
            if (var4 != 0) {
               a352(-38, 98, 90, 94, -49, -128, (int[])null, -44, -86, 68);
            }

            return;
         }

         int var15 = (var6[var1] & 16711422) >> 1;
         var6[var1] = var15 - (-nb_.a080(65280, var3 >> 9) + (-nb_.a080(16711680, var5 >> 1) - nb_.a080(var8 >> 17, 255)));
         ++var1;
         var8 += var2;
         var5 += var7;
         var3 += var9;
      }
   }

   public static void a150() {
      _c = (byte[][][])null;
   }

   static final void a789(int var0, boolean var1, vh_ var2, int var3, int var4) {
      ek_._b.a188(22199, 1000000, var3, var2, var4, !var1);
      if (var0 < 65) {
         a413((wj_)null, (byte)71);
      }

   }

   abstract void a326(int var1, int var2, int var3);
}
