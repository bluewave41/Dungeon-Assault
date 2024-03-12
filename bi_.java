final class bi_ {
   private int[] _g = new int[2];
   private static float[][] _h = new float[2][8];
   private static float _f;
   int[] _e = new int[2];
   static int _d;
   private int[][][] _a = new int[2][2][4];
   static int[][] _c = new int[2][8];
   private int[][][] _b = new int[2][2][4];

   final int a197(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this._g[0] + (float)(this._g[1] - this._g[0]) * var2;
         var3 *= 0.0030517578F;
         _f = (float)Math.pow(0.1, (double)(var3 / 20.0F));
         _d = (int)(_f * 65536.0F);
      }

      if (this._e[var1] == 0) {
         return 0;
      } else {
         var3 = this.b427(var1, 0, var2);
         _h[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.a427(var1, 0, var2));
         _h[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this._e[var1]; ++var4) {
            var3 = this.b427(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.a427(var1, var4, var2));
            float var6 = var3 * var3;
            _h[var1][var4 * 2 + 1] = _h[var1][var4 * 2 - 1] * var6;
            _h[var1][var4 * 2] = _h[var1][var4 * 2 - 1] * var5 + _h[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = _h[var1];
               var10000[var7] += _h[var1][var7 - 1] * var5 + _h[var1][var7 - 2] * var6;
            }

            var10000 = _h[var1];
            var10000[1] += _h[var1][0] * var5 + var6;
            var10000 = _h[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this._e[0] * 2; ++var4) {
               var10000 = _h[0];
               var10000[var4] *= _f;
            }
         }

         for(var4 = 0; var4 < this._e[var1] * 2; ++var4) {
            _c[var1][var4] = (int)(_h[var1][var4] * 65536.0F);
         }

         return this._e[var1] * 2;
      }
   }

   private final float b427(int var1, int var2, float var3) {
      float var4 = (float)this._a[var1][0][var2] + var3 * (float)(this._a[var1][1][var2] - this._a[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   public static void a797() {
      _h = (float[][])null;
      _c = (int[][])null;
   }

   private static final float a251(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   private final float a427(int var1, int var2, float var3) {
      float var4 = (float)this._b[var1][0][var2] + var3 * (float)(this._b[var1][1][var2] - this._b[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return a251(var4);
   }

   final void a739(ec_ var1, fh_ var2) {
      int var3 = var1.c474(true);
      this._e[0] = var3 >> 4;
      this._e[1] = var3 & 15;
      if (var3 != 0) {
         this._g[0] = var1.k137(0);
         this._g[1] = var1.k137(0);
         int var4 = var1.c474(true);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this._e[var5]; ++var6) {
               this._b[var5][0][var6] = var1.k137(0);
               this._a[var5][0][var6] = var1.k137(0);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this._e[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this._b[var5][1][var6] = var1.k137(0);
                  this._a[var5][1][var6] = var1.k137(0);
               } else {
                  this._b[var5][1][var6] = this._b[var5][0][var6];
                  this._a[var5][1][var6] = this._a[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this._g[1] != this._g[0]) {
            var2.a962(var1);
         }
      } else {
         int[] var7 = this._g;
         this._g[1] = 0;
         var7[0] = 0;
      }

   }
}
