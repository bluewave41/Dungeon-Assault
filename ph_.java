final class ph_ {
   cn_ _a;
   int[] _c;
   int _d;
   int _b;

   private final void e093(int var1, int var2) {
      var1 += this._a._w;
      var2 += this._a._A;
      int var3 = var1 + var2 * gf_._i;
      int var4 = 0;
      int var5 = this._b;
      int var6 = this._d;
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
         a415(jh_._f, this._c, var4, var3, var6, var5, var7, var8);
      }
   }

   private final void g093(int var1, int var2) {
      var1 += this._a._w;
      var2 += this._a._G - this._a._v - this._a._A;
      int var3 = var1 + (var2 + this._b - 1) * gf_._i;
      int var4 = 0;
      int var5 = this._b;
      int var6 = this._d;
      int var7 = -gf_._i - var6;
      int var8 = 0;
      if (var2 < gf_._f) {
         var5 -= gf_._f - var2;
         var2 = gf_._f;
      }

      int var9;
      if (var2 + var5 > gf_._e) {
         var9 = var2 + var5 - gf_._e;
         var5 -= var9;
         var3 -= var9 * gf_._i;
         var4 += var9 * var6;
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
         a663(jh_._f, this._c, 0, var4, var3, 65280, var6, var5, var7, var8);
      }
   }

   final void h093(int var1, int var2) {
      this._a.h093(var1, var2);
      this.d093(var1, var2);
   }

   static final ph_ a343(nh_ var0, String var1, String var2) {
      cn_ var3 = oh_.a825(var0, var1, var2);
      var2 = var2 + "_normals";
      if (var0.b671(var2, var1, (byte)-82)) {
         cn_ var4 = oh_.a825(var0, var1, var2);
         return new ph_(var3, var4);
      } else {
         return new ph_(var3, a389(var3));
      }
   }

   final void f093(int var1, int var2) {
      this._a.b093(var1, var2);
      this.c093(var1, var2);
   }

   private static final void a415(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var0[var3++] = var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   final void i093(int var1, int var2) {
      this._a.g093(var1, var2);
      this.g093(var1, var2);
   }

   private final void c093(int var1, int var2) {
      var1 += this._a._w;
      var2 += this._a._G - this._b - this._a._A;
      int var3 = var1 + (var2 + this._b - 1) * gf_._i;
      int var4 = this._d - 1;
      int var5 = this._b;
      int var6 = this._d;
      int var7 = -gf_._i - var6;
      int var8 = var6 + var6;
      if (var2 < gf_._f) {
         var5 -= gf_._f - var2;
         var2 = gf_._f;
      }

      int var9;
      if (var2 + var5 > gf_._e) {
         var9 = var2 + var5 - gf_._e;
         var5 -= var9;
         var3 -= var9 * gf_._i;
         var4 += var9 * var6;
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
         b663(jh_._f, this._c, 0, var4, var3, 16776960, var6, var5, var7, var8);
      }
   }

   final void d093(int var1, int var2) {
      var1 += this._a._w;
      var2 += this._a._A;
      int var3 = var1 + var2 * gf_._i;
      int var4 = 0;
      int var5 = this._b;
      int var6 = this._d;
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
         a663(jh_._f, this._c, 0, var4, var3, 0, var6, var5, var7, var8);
      }
   }

   private final void a093(int var1, int var2) {
      var1 += this._a._E - this._a._y - this._a._w;
      var2 += this._a._A;
      int var3 = var1 + var2 * gf_._i;
      int var4 = this._a._y - 1;
      int var5 = this._a._v;
      int var6 = this._a._y;
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
         b663(jh_._f, this._c, 0, var4, var3, 16711680, var6, var5, var7, var8);
      }
   }

   final void b093(int var1, int var2) {
      this._a.c093(var1, var2);
      this.e093(var1, var2);
   }

   private static final int[] a389(cn_ var0) {
      int[] var1 = new int[var0._y * var0._v];
      int var2 = 0;
      boolean var3 = true;

      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      for(var4 = 0; var4 < var0._v; ++var4) {
         var5 = 0;

         int var9;
         for(var9 = -1; var5 < var0._y; ++var2) {
            if (var0._B[var2] != 0) {
               int[] var10000 = var0._B;
               var10000[var2] |= Integer.MIN_VALUE;
               if (var9 == -1) {
                  var9 = var5;
               }
            } else {
               if (var9 != -1) {
                  var2 = var4 * var0._y + var9;

                  for(var6 = var9; var6 < var5; ++var6) {
                     var7 = 64 - 128 * (var6 - var9) / (var5 - var9);
                     var8 = (byte)var7 << 16 | 16;
                     var1[var2] = var8;
                     ++var2;
                  }
               }

               var9 = -1;
            }

            ++var5;
         }

         if (var9 != -1) {
            var2 = var4 * var0._y + var9;

            for(var6 = var9; var6 < var5; ++var6) {
               var7 = 64 - 128 * (var6 - var9) / (var5 - var9);
               var8 = (byte)var7 << 16 | 16;
               var1[var2] = var8;
               ++var2;
            }
         }
      }

      boolean var10 = true;

      for(var5 = 0; var5 < var0._y; ++var5) {
         var6 = 0;
         var4 = -1;

         for(var2 = var5; var6 < var0._v; var2 += var0._y) {
            if (var0._B[var2] != 0) {
               if (var4 == -1) {
                  var4 = var6;
               }
            } else {
               if (var4 != -1) {
                  var2 = var4 * var0._y + var5;

                  for(var7 = var4; var7 < var6; ++var7) {
                     var8 = 64 - 128 * (var7 - var4) / (var6 - var4);
                     var1[var2] |= (byte)var8 << 8;
                     var2 += var0._y;
                  }
               }

               var4 = -1;
            }

            ++var6;
         }

         if (var4 != -1) {
            var2 = var4 * var0._y + var5;

            for(var7 = var4; var7 < var6; ++var7) {
               var8 = 64 - 128 * (var7 - var4) / (var6 - var4);
               var1[var2] |= (byte)var8 << 8;
               var2 += var0._y;
            }
         }
      }

      return var1;
   }

   ph_(cn_ var1, cn_ var2) {
      this._a = var1;
      this._c = var2._B;
      this._d = var1._y;
      this._b = var1._v;
   }

   ph_(cn_ var1, int[] var2) {
      this._a = var1;
      this._c = var2;
      this._d = var1._y;
      this._b = var1._v;
   }

   private static final void a663(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         for(var12 = var10; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }
         }

         for(var12 = var6; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }
         }

         var4 += var8;
         var3 += var9;
      }

   }

   final void j093(int var1, int var2) {
      this._a.f093(var1, var2);
      this.a093(var1, var2);
   }

   private static final void b663(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         for(var12 = var10; var12 < 0; ++var12) {
            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }

            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }

            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }

            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }
         }

         for(var12 = var6; var12 < 0; ++var12) {
            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2 ^ var5;
            } else {
               ++var4;
            }
         }

         var4 += var8;
         var3 += var9;
      }

   }
}
