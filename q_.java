final class q_ extends lo_ {
   byte[] _j;
   int[] _i;

   final void a115(int var1, int var2, int var3, int var4) {
      int var5 = super._h;
      int var6 = super._e;
      int var7 = 0;
      int var8 = 0;
      int var9 = super._d;
      int var10 = super._g;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (super._b > 0) {
         var13 = ((super._b << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (super._b << 16);
      }

      if (super._a > 0) {
         var13 = ((super._a << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (super._a << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * gf_._i;
      int var14 = gf_._i - var3;
      if (var2 + var4 > gf_._e) {
         var4 -= var2 + var4 - gf_._e;
      }

      int var15;
      if (var2 < gf_._f) {
         var15 = gf_._f - var2;
         var4 -= var15;
         var13 += var15 * gf_._i;
         var8 += var12 * var15;
      }

      if (var1 + var3 > gf_._h) {
         var15 = var1 + var3 - gf_._h;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < gf_._j) {
         var15 = gf_._j - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      a955(gf_._b, this._j, this._i, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   final void b093(int var1, int var2) {
      var1 += super._d - super._h - super._b;
      var2 += super._a;
      int var3 = var1 + var2 * gf_._i;
      int var4 = super._h - 1;
      int var5 = super._e;
      int var6 = super._h;
      int var7 = gf_._i - var6;
      int var8 = var6 + var6;
      int var9;
      if (var2 < gf_._f) {
         var9 = gf_._f - var2;
         var5 -= var9;
         var2 = gf_._f;
         var4 += var9 * var6;
         var3 += var9 * gf_._i;
      }

      if (var2 + var5 > gf_._e) {
         var5 -= var2 + var5 - gf_._e;
      }

      if (var1 < gf_._j) {
         var9 = gf_._j - var1;
         var6 -= var9;
         var1 = gf_._j;
         var4 -= var9;
         var3 += var9;
         var8 -= var9;
         var7 += var9;
      }

      if (var1 + var6 > gf_._h) {
         var9 = var1 + var6 - gf_._h;
         var6 -= var9;
         var8 -= var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         a723(gf_._b, this._j, this._i, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   final void a093(int var1, int var2) {
      var1 += super._b;
      var2 += super._a;
      int var3 = var1 + var2 * gf_._i;
      int var4 = 0;
      int var5 = super._e;
      int var6 = super._h;
      int var7 = gf_._i - var6;
      int var8 = 0;
      int var9;
      if (var2 < gf_._f) {
         var9 = gf_._f - var2;
         var5 -= var9;
         var2 = gf_._f;
         var4 += var9 * var6;
         var3 += var9 * gf_._i;
      }

      if (var2 + var5 > gf_._e) {
         var5 -= var2 + var5 - gf_._e;
      }

      if (var1 < gf_._j) {
         var9 = gf_._j - var1;
         var6 -= var9;
         var1 = gf_._j;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > gf_._h) {
         var9 = var1 + var6 - gf_._h;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         c723(gf_._b, this._j, this._i, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   private static final void c723(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         byte var13;
         for(var12 = var10; var12 < 0; ++var12) {
            var13 = var1[var4++];
            if (var13 != 0) {
               var0[var5++] = var2[var13 & 255];
            } else {
               ++var5;
            }

            var13 = var1[var4++];
            if (var13 != 0) {
               var0[var5++] = var2[var13 & 255];
            } else {
               ++var5;
            }

            var13 = var1[var4++];
            if (var13 != 0) {
               var0[var5++] = var2[var13 & 255];
            } else {
               ++var5;
            }

            var13 = var1[var4++];
            if (var13 != 0) {
               var0[var5++] = var2[var13 & 255];
            } else {
               ++var5;
            }
         }

         for(var12 = var6; var12 < 0; ++var12) {
            var13 = var1[var4++];
            if (var13 != 0) {
               var0[var5++] = var2[var13 & 255];
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   final void a326(int var1, int var2, int var3) {
      var1 += super._b;
      var2 += super._a;
      int var4 = var1 + var2 * gf_._i;
      int var5 = 0;
      int var6 = super._e;
      int var7 = super._h;
      int var8 = gf_._i - var7;
      int var9 = 0;
      int var10;
      if (var2 < gf_._f) {
         var10 = gf_._f - var2;
         var6 -= var10;
         var2 = gf_._f;
         var5 += var10 * var7;
         var4 += var10 * gf_._i;
      }

      if (var2 + var6 > gf_._e) {
         var6 -= var2 + var6 - gf_._e;
      }

      if (var1 < gf_._j) {
         var10 = gf_._j - var1;
         var7 -= var10;
         var1 = gf_._j;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > gf_._h) {
         var10 = var1 + var7 - gf_._h;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         b723(gf_._b, this._j, this._i, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   final cn_ a125() {
      int var1 = super._h * super._e;
      int[] var2 = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = this._i[this._j[var3] & 255];
      }

      return new cn_(super._d, super._g, super._b, super._a, super._h, super._e, var2);
   }

   final q_ c869() {
      q_ var1 = new q_(super._h, super._e, this._i.length);
      var1._d = super._d;
      var1._g = super._g;
      var1._b = super._b;
      var1._a = super._a;
      int var2 = this._j.length;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         var1._j[var3] = this._j[var3];
      }

      var2 = this._i.length;

      for(var3 = 0; var3 < var2; ++var3) {
         var1._i[var3] = this._i[var3];
      }

      return var1;
   }

   private static final void a955(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   final q_ d869() {
      q_ var1 = new q_(super._h, super._e, this._i.length);
      var1._d = super._d;
      var1._g = super._g;
      var1._b = super._d - super._h - super._b;
      var1._a = super._a;
      int var2 = this._i.length;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         var1._i[var3] = this._i[var3];
      }

      for(var3 = 0; var3 < super._e; ++var3) {
         for(int var4 = 0; var4 < super._h; ++var4) {
            var1._j[var3 * super._h + var4] = this._j[var3 * super._h + super._h - 1 - var4];
         }
      }

      return var1;
   }

   private static final void a723(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         for(var12 = var10; var12 < 0; ++var12) {
            var3 = var2[var1[var4--] & 255];
            if (var3 != 0) {
               var0[var5++] = var3;
            } else {
               ++var5;
            }

            var3 = var2[var1[var4--] & 255];
            if (var3 != 0) {
               var0[var5++] = var3;
            } else {
               ++var5;
            }

            var3 = var2[var1[var4--] & 255];
            if (var3 != 0) {
               var0[var5++] = var3;
            } else {
               ++var5;
            }

            var3 = var2[var1[var4--] & 255];
            if (var3 != 0) {
               var0[var5++] = var3;
            } else {
               ++var5;
            }
         }

         for(var12 = var6; var12 < 0; ++var12) {
            var3 = var2[var1[var4--] & 255];
            if (var3 != 0) {
               var0[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   private static final void b723(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            int var13 = var1[var3++];
            if (var13 != 0) {
               var13 = var2[var13 & 255];
               int var14 = var0[var4];
               var0[var4++] = ((var13 & 16711935) * var9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & '\uff00') * var9 + (var14 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   final void b797() {
      int var1 = 0;

      int var2;
      for(var2 = this._j.length - 7; var1 < var2; this._j[var1++] = 0) {
         this._j[var1++] = 0;
         this._j[var1++] = 0;
         this._j[var1++] = 0;
         this._j[var1++] = 0;
         this._j[var1++] = 0;
         this._j[var1++] = 0;
         this._j[var1++] = 0;
      }

      for(var2 += 7; var1 < var2; this._j[var1++] = 0) {
      }

   }

   q_(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int[] var8) {
      super._d = var1;
      super._g = var2;
      super._b = var3;
      super._a = var4;
      super._h = var5;
      super._e = var6;
      this._j = var7;
      this._i = var8;
   }

   q_(int var1, int var2, int var3) {
      super._d = super._h = var1;
      super._g = super._e = var2;
      super._a = 0;
      super._b = 0;
      this._j = new byte[var1 * var2];
      this._i = new int[var3];
   }
}
