import java.util.Random;

final class te_ {
   private static double[] _a;

   static final void a812(int var0, int var1, int var2, int[] var3) {
      if (var1 >= gf_._f && var1 < gf_._e) {
         if (var0 < gf_._j) {
            var2 -= gf_._j - var0;
            var0 = gf_._j;
         }

         if (var0 + var2 > gf_._h) {
            var2 = gf_._h - var0;
         }

         int var4 = var1 * gf_._i + var0;

         while(true) {
            --var2;
            if (var2 < 0) {
               return;
            }

            int var5 = 16 + (int)(32.0 * c503(var0 + 102, var1 - 43, 0.125));
            if (var5 < 0) {
               var5 = 0;
            }

            if (var5 > 31) {
               var5 = 31;
            }

            gf_._b[var4] = var3[var5];
            ++var0;
            ++var4;
         }
      }
   }

   static final int[] b285(int var0, int var1, double var2) {
      int[] var4 = new int[var0 * var1];
      int var7 = 0;
      double[][] var8 = a137(var0, var1, var2);

      for(int var6 = 0; var6 < var1; ++var6) {
         for(int var5 = 0; var5 < var0; ++var7) {
            double var9 = var5 == 0 ? var8[0][var6] : var8[var5 - 1][var6];
            double var11 = var5 == var0 - 1 ? var8[var0 - 1][var6] : var8[var5 + 1][var6];
            double var13 = var11 - var9;
            if (var5 == 0 || var5 == var0 - 1) {
               var13 *= 2.0;
            }

            double var15 = var6 == 0 ? var8[var5][0] : var8[var5][var6 - 1];
            double var17 = var6 == var1 - 1 ? var8[var5][var1 - 1] : var8[var5][var6 + 1];
            double var19 = var17 - var15;
            if (var6 == 0 || var6 == var1 - 1) {
               var19 *= 2.0;
            }

            double var21 = 1.0;
            ve_ var23 = new ve_((int)(var13 * 65536.0), (int)(var19 * 65536.0), (int)(var21 * 65536.0));
            var23.b487(true);
            int var24 = var23._d >> 10;
            int var25 = var23._f >> 10;
            int var26 = var23._b >> 10;
            if (var24 < -256) {
               var24 = -256;
            }

            if (var24 > 255) {
               var24 = 255;
            }

            if (var25 < -256) {
               var25 = -256;
            }

            if (var25 > 255) {
               var25 = 255;
            }

            if (var26 < -256) {
               var26 = -256;
            }

            if (var26 > 255) {
               var26 = 255;
            }

            var24 &= 255;
            var25 &= 255;
            var26 &= 255;
            var4[var7] = -16777216 | var24 << 16 | var25 << 8 | var26;
            ++var5;
         }
      }

      return var4;
   }

   public static void a797() {
      _a = null;
   }

   static final double c503(int var0, int var1, double var2) {
      double var4 = 0.0;
      double var6 = 1.0;

      for(int var8 = 0; var8 < 8; ++var8) {
         double var9 = a315((double)var0 * var2, (double)var1 * var2);
         var4 += var9 * var6;
         var6 *= 0.5;
         var2 *= 2.0;
      }

      return var4;
   }

   private static final double a327(double var0) {
      int var2 = (int)var0;
      double var3 = var0 - (double)var2;
      double var5 = b132(var2);
      double var7 = b132(var2 + 1);
      return var5 + (var7 - var5) * var3;
   }

   private static final double a938(int var0, int var1, int var2, double var3) {
      double var5 = 0.0;
      double var7 = 1.0;

      for(int var9 = 0; var9 < 8; ++var9) {
         double var10 = a943((double)var0 * var3, (double)var1 * var3, (double)var2 * var3);
         var5 += var10 * var7;
         var7 *= 0.5;
         var3 *= 2.0;
      }

      return var5;
   }

   static final cn_ a824(int var0, int var1, int var2, int[] var3, int var4, int var5, double var6) {
      cn_ var8 = new cn_(var0, var1);
      int[] var9 = var8._B;
      int var10 = 0;

      for(int var11 = 0; var11 < var1; ++var11) {
         for(int var12 = 0; var12 < var0; ++var12) {
            int var13 = var4 + (int)((double)var5 * a938(var12, var11, var2, var6));
            if (var13 < 0) {
               var13 = 0;
            }

            if (var13 >= var3.length) {
               var13 = var3.length - 1;
            }

            var9[var10++] = var3[var13];
         }
      }

      return var8;
   }

   static final double a132(int var0) {
      double var1 = 0.0;
      double var3 = 1.0;

      for(int var5 = 0; var5 < 8; ++var5) {
         double var6 = (double)(1 << var5);
         double var8 = a327((double)var0 * var6 * 0.015625);
         var1 += var8 * var3;
         var3 *= 0.5;
      }

      return var1;
   }

   private static final double[][] a137(int var0, int var1, double var2) {
      double[][] var4 = new double[var0][var1];
      if (_a == null) {
         b797();
      }

      for(int var5 = 0; var5 < var1; ++var5) {
         for(int var6 = 0; var6 < var0; ++var6) {
            var4[var6][var5] = c503(var6, var5, var2);
         }
      }

      return var4;
   }

   static final void b812(int var0, int var1, int var2, int[] var3) {
      if (var0 >= gf_._j && var0 < gf_._h) {
         if (var1 < gf_._f) {
            var2 -= gf_._f - var1;
            var1 = gf_._f;
         }

         if (var1 + var2 > gf_._e) {
            var2 = gf_._e - var1;
         }

         int var4 = var1 * gf_._i + var0;

         while(true) {
            --var2;
            if (var2 < 0) {
               return;
            }

            int var5 = 16 + (int)(32.0 * c503(var0 + 102, var1 - 43, 0.125));
            if (var5 < 0) {
               var5 = 0;
            }

            if (var5 > 31) {
               var5 = 31;
            }

            gf_._b[var4] = var3[var5];
            ++var1;
            var4 += gf_._i;
         }
      }
   }

   static final cn_ a983(int var0, int var1, int[] var2, int var3, int var4, double var5) {
      cn_ var7 = new cn_(var0, var1);
      int[] var8 = var7._B;
      int var9 = 0;
      if (_a == null) {
         b797();
      }

      for(int var10 = 0; var10 < var1; ++var10) {
         for(int var11 = 0; var11 < var0; ++var11) {
            int var12 = var3 + (int)((double)var4 * c503(var11, var10, var5));
            if (var12 < 0) {
               var12 = 0;
            }

            if (var12 >= var2.length) {
               var12 = var2.length - 1;
            }

            var8[var9++] = var2[var12];
         }
      }

      return var7;
   }

   private static final double b132(int var0) {
      return _a[var0 & 1023];
   }

   static final void b797() {
      short var0 = 1024;
      _a = new double[var0];
      Random var1 = new Random();

      for(int var2 = var0 - 1; var2 >= 0; --var2) {
         _a[var2] = 2.0 * var1.nextDouble() - 1.0;
      }

   }

   private static final double a943(double var0, double var2, double var4) {
      int var6 = (int)var0;
      int var7 = (int)var2;
      int var8 = (int)var4;
      double var9 = var0 - (double)var6;
      double var11 = var2 - (double)var7;
      double var13 = var4 - (double)var8;
      double var15 = a308(var6, var7, var8);
      double var17 = a308(var6 + 1, var7, var8);
      double var19 = a308(var6, var7 + 1, var8);
      double var21 = a308(var6 + 1, var7 + 1, var8);
      double var23 = a308(var6, var7, var8 + 1);
      double var25 = a308(var6 + 1, var7, var8 + 1);
      double var27 = a308(var6, var7 + 1, var8 + 1);
      double var29 = a308(var6 + 1, var7 + 1, var8 + 1);
      double var31 = var15 + (var17 - var15) * var9;
      double var33 = var19 + (var21 - var19) * var9;
      double var35 = var23 + (var25 - var23) * var9;
      double var37 = var27 + (var29 - var27) * var9;
      double var39 = var31 + (var33 - var31) * var11;
      double var41 = var35 + (var37 - var35) * var11;
      return var39 + (var41 - var39) * var13;
   }

   private static final double a308(int var0, int var1, int var2) {
      int var3 = var0 + var1 * 47 + var2 * 19;
      return _a[var3 & 1023];
   }

   private static final double a315(double var0, double var2) {
      int var4 = (int)var0;
      double var5 = var0 - (double)var4;
      int var7 = (int)var2;
      double var8 = var2 - (double)var7;
      double var10 = a075(var4, var7);
      double var12 = a075(var4 + 1, var7);
      double var14 = a075(var4, var7 + 1);
      double var16 = a075(var4 + 1, var7 + 1);
      double var18 = var10 + (var12 - var10) * var5;
      double var20 = var14 + (var16 - var14) * var5;
      return var18 + (var20 - var18) * var8;
   }

   private static final double a075(int var0, int var1) {
      int var2 = var0 + var1 * 47;
      return _a[var2 & 1023];
   }
}
