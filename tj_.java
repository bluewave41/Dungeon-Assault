final class tj_ extends se_ {
   private byte[][] _T = new byte[256][];

   private static final void a038(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            int var12 = (255 & var1[var3++]) * var9 >> 8;
            if (var12 != 0) {
               int var13 = ((var2 & 16711935) * var12 & -16711936) + ((var2 & '\uff00') * var12 & 16711680) >> 8;
               var12 = 256 - var12;
               int var14 = var0[var4];
               var0[var4++] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & '\uff00') * var12 & 16711680) >> 8) + var13;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   final void a566(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = var2 + var3 * gf_._i;
      int var10 = gf_._i - var4;
      int var11 = 0;
      int var12 = 0;
      int var13;
      if (var3 < gf_._f) {
         var13 = gf_._f - var3;
         var5 -= var13;
         var3 = gf_._f;
         var12 += var13 * var4;
         var9 += var13 * gf_._i;
      }

      if (var3 + var5 > gf_._e) {
         var5 -= var3 + var5 - gf_._e;
      }

      if (var2 < gf_._j) {
         var13 = gf_._j - var2;
         var4 -= var13;
         var2 = gf_._j;
         var12 += var13;
         var9 += var13;
         var11 += var13;
         var10 += var13;
      }

      if (var2 + var4 > gf_._h) {
         var13 = var2 + var4 - gf_._h;
         var4 -= var13;
         var11 += var13;
         var10 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         if (var8) {
            gp_.a038(gf_._b, this._T[var1], var6, var12, var9, var4, var5, var10, var11, var7);
         } else {
            a038(gf_._b, this._T[var1], var6, var12, var9, var4, var5, var10, var11, var7);
         }

      }
   }

   tj_(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5);
      this._T = a675(var6, var7);
   }

   private static final byte[][] a675(int[] var0, byte[][] var1) {
      int var3;
      for(int var2 = 0; var2 < var0.length; ++var2) {
         var3 = var0[var2];
         int var4 = (var3 >> 15 & 510) + (var3 & 255);
         var0[var2] = var4 / 3 + (var3 >> 8 & 255) >> 1;
      }

      byte[][] var7 = var1;

      for(var3 = 0; var3 < var7.length; ++var3) {
         byte[] var8 = var7[var3];

         for(int var5 = 0; var5 < var8.length; ++var5) {
            byte var6 = var8[var5];
            if (var6 != 0) {
               var8[var5] = (byte)var0[var6];
            }
         }
      }

      return var1;
   }

   final void a033(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2 + var3 * gf_._i;
      int var9 = gf_._i - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < gf_._f) {
         var12 = gf_._f - var3;
         var5 -= var12;
         var3 = gf_._f;
         var11 += var12 * var4;
         var8 += var12 * gf_._i;
      }

      if (var3 + var5 > gf_._e) {
         var5 -= var3 + var5 - gf_._e;
      }

      if (var2 < gf_._j) {
         var12 = gf_._j - var2;
         var4 -= var12;
         var2 = gf_._j;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > gf_._h) {
         var12 = var2 + var4 - gf_._h;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         if (var7) {
            gp_.a111(gf_._b, this._T[var1], var6, var11, var8, var4, var5, var9, var10);
         } else {
            a111(gf_._b, this._T[var1], var6, var11, var8, var4, var5, var9, var10);
         }

      }
   }

   private static final void a111(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = -var6; var9 < 0; ++var9) {
         for(int var10 = -var5; var10 < 0; ++var10) {
            int var11 = 255 & var1[var3++];
            if (var11 != 0) {
               int var12 = ((var2 & 16711935) * var11 & -16711936) + ((var2 & '\uff00') * var11 & 16711680) >> 8;
               var11 = 256 - var11;
               int var13 = var0[var4];
               var0[var4++] = (((var13 & 16711935) * var11 & -16711936) + ((var13 & '\uff00') * var11 & 16711680) >> 8) + var12;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
