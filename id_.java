import java.util.Iterator;

final class id_ implements Iterator {
   private ll_ _a = null;
   static String _k = "MONSTER";
   static long[] _b = new long[32];
   private dh_ _d;
   static rj_ _l;
   static String _c = "Names cannot contain consecutive spaces";
   static String _g = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
   static md_ _e = new md_();
   static int[] _j = new int[0];
   static String _f = "Waiting for music";
   static cn_[] _m;
   static nh_ _i;
   private ll_ _h;

   public final Object next() {
      ll_ var1 = this._h;
      if (this._d._d == var1) {
         var1 = null;
         this._h = null;
      } else {
         this._h = var1._n;
      }

      this._a = var1;
      return var1;
   }

   public final void remove() {
      if (null != this._a) {
         this._a.b423((byte)-2);
         this._a = null;
      } else {
         throw new IllegalStateException();
      }
   }

   static long a833(long var0, long var2) {
      return var0 | var2;
   }

   static final void a150(int var0) {
      sd_._F = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
      int var1 = ih_._w.length;
      int[] var2 = new int[var1];

      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var12;
      int var13;
      for(var3 = 0; var1 > var3; ++var3) {
         qh_ var4 = ih_._w[var3];
         var4.a423((byte)-123);
         bk_.a093(7, var3);
         var5 = var4._i + var4._H >> 1;
         var6 = var4._p + var4._M >> 1;
         var7 = var4._a + var4._b >> 1;
         var8 = sd_._F[9] >> 2;
         var9 = sd_._F[10] >> 2;
         int var10 = sd_._F[11] >> 2;
         int var11 = var10 * pj_._e[5] + var8 * pj_._e[3] + pj_._e[4] * var9 >> 14;
         var12 = pj_._e[8] * var10 + var9 * pj_._e[7] + pj_._e[6] * var8 >> 14;
         var13 = var9 * pj_._e[10] + var8 * pj_._e[9] + pj_._e[11] * var10 >> 14;
         var2[var3] = var13 * var7 + var5 * var11 + var6 * var12 >> 16;
      }

      var3 = sd_._F[9] >> 8;
      int var19 = sd_._F[10] >> 8;
      var5 = sd_._F[11] >> 8;
      var6 = nl_._d << 4;
      var7 = 0;
      var8 = oj_.a353(var6) >> 8;
      var9 = jg_.a080(8191, var6) >> 8;
      if (var0 != 439027688) {
         a524(-29, (String)null);
      }

      if (-1 != hj_._S && eh_._h != -1) {
         var8 = -eh_._h + 240;
         var9 = -128;
         var7 = hj_._S - 320;
      }

      double var20 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 + var9 * var9));
      var7 = (int)((double)var7 * var20);
      var8 = (int)((double)var8 * var20);
      var9 = (int)((double)var9 * var20);
      var12 = var7 - var3;
      var13 = -var19 + var8;
      int var14 = var9 - var5;
      var20 = 256.0 / Math.sqrt((double)(var13 * var13 + var12 * var12 + var14 * var14));
      var14 = (int)((double)var14 * var20);
      var12 = (int)((double)var12 * var20);
      var13 = (int)((double)var13 * var20);

      for(int var15 = 0; ih_._w.length > var15; ++var15) {
         int var16 = 0;

         for(int var17 = 1; var17 < ih_._w.length; ++var17) {
            if (var2[var16] < var2[var17]) {
               var16 = var17;
            }
         }

         var2[var16] = Integer.MIN_VALUE;
         qh_ var21 = ih_._w[var16];
         bk_.a093(7, var16);

         for(int var18 = 0; 3 > var18; ++var18) {
            int[] var10000 = pj_._e;
            var10000[var18] += lk_._R[var15][var18];
         }

         pb_.a560(true, 0, sd_._F, false, var21, pj_._e);
         ad_.a934(var13, var8, var7, var14, -106, var12, var9, var21);
      }

   }

   public static void a423() {
      _e = null;
      _g = null;
      _c = null;
      _b = null;
      _m = null;
      _i = null;
      _k = null;
      _l = null;
      _f = null;
      _j = null;
   }

   public final boolean hasNext() {
      return this._h != this._d._d;
   }

   static final ab_ a524(int var0, String var1) {
      int var2 = var1.length();
      if (var0 != -49) {
         a150(51);
      }

      for(int var3 = 0; var2 > var3; ++var3) {
         char var4 = var1.charAt(var3);
         if (var4 < '0' || var4 > '9') {
            return null;
         }
      }

      return np_._E;
   }

   static final void a728(int var0, int var1, int var2, int var3, int[] var4, int var5, int var6, int[] var7, int var8) {
      for(int var11 = -var2; 0 > var11; ++var11) {
         for(int var12 = -var6; 0 > var12; ++var12) {
            var1 = var4[var5++];
            if (0 != var1 && var1 != 255) {
               int var9 = var7[var0];
               int var10 = 255 & var1;
               var7[var0++] = mp_.a080(nb_.a080(nb_.a080(65280, var9) * var10 >> 8, 65280), mp_.a080(nb_.a080(nb_.a080(16711935, var9) * var10 >> 8, 16711935), nb_.a080(var9, -16777216)));
            } else {
               ++var0;
            }
         }

         var0 += var8;
         var5 += var3;
      }

   }

   id_(dh_ var1) {
      this._d = var1;
      this._h = this._d._d._n;
      this._a = null;
   }
}
