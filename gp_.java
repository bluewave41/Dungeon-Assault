final class gp_ extends se_ {
   private byte[][] _T = new byte[256][];

   gp_(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, byte[][] var6) {
      super(var1, var2, var3, var4, var5);
      this._T = var6;
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
         if (gf_._g != null) {
            a493(gf_._b, this._T[var1], var2, var3, var4, var5, var6, var11, var8, var9, var10, gf_._g, gf_._l);
         } else {
            a111(gf_._b, this._T[var1], var6, var11, var8, var4, var5, var9, var10);
         }

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
         a038(gf_._b, this._T[var1], var6, var12, var9, var4, var5, var10, var11, var7);
      }
   }

   static final void a038(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static final void a111(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   private static final void a493(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
      int var13 = var2 - gf_._j;
      int var14 = var3 - gf_._f;

      for(int var15 = var14; var15 < var14 + var5; ++var15) {
         int var16 = var11[var15];
         int var17 = var12[var15];
         int var18 = var4;
         int var19;
         if (var13 > var16) {
            var19 = var13 - var16;
            if (var19 >= var17) {
               var7 += var4 + var10;
               var8 += var4 + var9;
               continue;
            }

            var17 -= var19;
         } else {
            var19 = var16 - var13;
            if (var19 >= var4) {
               var7 += var4 + var10;
               var8 += var4 + var9;
               continue;
            }

            var7 += var19;
            var18 = var4 - var19;
            var8 += var19;
         }

         var19 = 0;
         if (var18 < var17) {
            var17 = var18;
         } else {
            var19 = var18 - var17;
         }

         for(int var20 = -var17; var20 < 0; ++var20) {
            if (var1[var7++] != 0) {
               gf_._b[var8++] = var6;
            } else {
               ++var8;
            }
         }

         var7 += var19 + var10;
         var8 += var19 + var9;
      }

   }
}
