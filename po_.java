final class po_ {
   private int _e = jp_.a137(16);
   private int _f = jp_.a137(24);
   private int _b = jp_.a137(24);
   private int _g = jp_.a137(24) + 1;
   private int _c = jp_.a137(6) + 1;
   private int _a = jp_.a137(8);
   private int[] _d;

   final void a623(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = jp_._x[this._a]._c;
         int var5 = this._b - this._f;
         int var6 = var5 / this._g;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = jp_._x[this._a].b784();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this._c;
                     }

                     var10 /= this._c;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this._d[var11 * 8 + var8];
                  if (var12 >= 0) {
                     int var13 = this._f + var9 * this._g;
                     km_ var14 = jp_._x[var12];
                     int var15;
                     if (this._e == 0) {
                        var15 = this._g / var14._c;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.c932();

                           for(int var18 = 0; var18 < var14._c; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this._g) {
                           float[] var16 = var14.c932();

                           for(int var17 = 0; var17 < var14._c; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   po_() {
      int[] var1 = new int[this._c];

      int var2;
      for(var2 = 0; var2 < this._c; ++var2) {
         int var3 = 0;
         int var4 = jp_.a137(3);
         boolean var5 = jp_.b784() != 0;
         if (var5) {
            var3 = jp_.a137(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this._d = new int[this._c * 8];

      for(var2 = 0; var2 < this._c * 8; ++var2) {
         this._d[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? jp_.a137(8) : -1;
      }

   }
}
