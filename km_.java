final class km_ {
   private float[][] _d;
   private int[] _f;
   private int _e;
   int _c;
   private int[] _b;
   private int[] _a;

   private static final int a080(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0 / (double)var1) + 1; bf_.a586(var1, var2) > var0; --var2) {
      }

      return var2;
   }

   private final void a797() {
      int[] var1 = new int[this._e];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this._e; ++var3) {
         var4 = this._b[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this._a = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this._e; ++var3) {
         var4 = this._b[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this._a[var6] == 0) {
                     this._a[var6] = var11;
                  }

                  var6 = this._a[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this._a.length) {
                  int[] var12 = new int[this._a.length * 2];

                  for(var10 = 0; var10 < this._a.length; ++var10) {
                     var12[var10] = this._a[var10];
                  }

                  this._a = var12;
               }

               var8 >>>= 1;
            }

            this._a[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   final float[] c932() {
      return this._d[this.b784()];
   }

   final int b784() {
      int var1;
      for(var1 = 0; this._a[var1] >= 0; var1 = jp_.b784() != 0 ? this._a[var1] : var1 + 1) {
      }

      return ~this._a[var1];
   }

   km_() {
      jp_.a137(24);
      this._c = jp_.a137(16);
      this._e = jp_.a137(24);
      this._b = new int[this._e];
      boolean var1 = jp_.b784() != 0;
      int var2;
      int var3;
      int var5;
      if (var1) {
         var2 = 0;

         for(var3 = jp_.a137(5) + 1; var2 < this._e; ++var3) {
            int var4 = jp_.a137(ue_.a080(this._e - var2));

            for(var5 = 0; var5 < var4; ++var5) {
               this._b[var2++] = var3;
            }
         }
      } else {
         boolean var14 = jp_.b784() != 0;

         for(var3 = 0; var3 < this._e; ++var3) {
            if (var14 && jp_.b784() == 0) {
               this._b[var3] = 0;
            } else {
               this._b[var3] = jp_.a137(5) + 1;
            }
         }
      }

      this.a797();
      var2 = jp_.a137(4);
      if (var2 > 0) {
         float var15 = jp_.d134(jp_.a137(32));
         float var16 = jp_.d134(jp_.a137(32));
         var5 = jp_.a137(4) + 1;
         boolean var6 = jp_.b784() != 0;
         int var7;
         if (var2 == 1) {
            var7 = a080(this._e, this._c);
         } else {
            var7 = this._e * this._c;
         }

         this._f = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this._f[var8] = jp_.a137(var5);
         }

         this._d = new float[this._e][this._c];
         float var9;
         int var10;
         int var11;
         if (var2 == 1) {
            for(var8 = 0; var8 < this._e; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this._c; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this._f[var12] * var16 + var15 + var9;
                  this._d[var8][var11] = var13;
                  if (var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this._e; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this._c;

               for(var11 = 0; var11 < this._c; ++var11) {
                  float var17 = (float)this._f[var10] * var16 + var15 + var9;
                  this._d[var8][var11] = var17;
                  if (var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }
}
