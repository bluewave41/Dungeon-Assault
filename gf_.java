final class gf_ {
   static int[] _l;
   static int _e = 0;
   static int _i;
   static int[] _g;
   private static int[] _k;
   static int _f = 0;
   static int _h = 0;
   private static int[] _a;
   private static int[] _d;
   static int _j = 0;
   static int _c;
   static int[] _b;

   public static void c797() {
      _b = null;
      _g = null;
      _l = null;
      _k = null;
      _a = null;
      _d = null;
   }

   private static final void a412(int var0, int[] var1, int var2, int var3, int var4, int var5) {
      while(var4 < 0) {
         for(var2 = var0 + var3 - 7; var0 < var2; ++var0) {
            var1[var0] = (var1[var0] & 16711422) >> 1;
            ++var0;
            var1[var0] = (var1[var0] & 16711422) >> 1;
            ++var0;
            var1[var0] = (var1[var0] & 16711422) >> 1;
            ++var0;
            var1[var0] = (var1[var0] & 16711422) >> 1;
            ++var0;
            var1[var0] = (var1[var0] & 16711422) >> 1;
            ++var0;
            var1[var0] = (var1[var0] & 16711422) >> 1;
            ++var0;
            var1[var0] = (var1[var0] & 16711422) >> 1;
            ++var0;
            var1[var0] = (var1[var0] & 16711422) >> 1;
         }

         for(var2 += 7; var0 < var2; ++var0) {
            var1[var0] = (var1[var0] & 16711422) >> 1;
         }

         var0 += var5;
         ++var4;
      }

   }

   static final void c669(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var7 = 65536 / var3;
      if (var0 < _j) {
         var2 -= _j - var0;
         var0 = _j;
      }

      if (var1 < _f) {
         var6 += (_f - var1) * var7;
         var3 -= _f - var1;
         var1 = _f;
      }

      if (var0 + var2 > _h) {
         var2 = _h - var0;
      }

      if (var1 + var3 > _e) {
         var3 = _e - var1;
      }

      int var8 = _i - var2;
      int var9 = var0 + var1 * _i;

      for(int var10 = -var3; var10 < 0; ++var10) {
         int var11 = 65536 - var6 >> 8;
         int var12 = var6 >> 8;
         int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

         for(int var14 = -var2; var14 < 0; ++var14) {
            _b[var9++] = var13;
         }

         var9 += var8;
         var6 += var7;
      }

   }

   static final void b797() {
      _j = 0;
      _f = 0;
      _h = _i;
      _e = _c;
      d797();
   }

   static final void b907(int var0, int var1, int var2, int var3, int[] var4) {
      int var5 = var2 * var2;
      int var6 = var0 - var2 >> 4;
      int var7 = var0 + var2 + 15 >> 4;
      int var8 = var1 - var2 >> 4;
      int var9 = var1 + var2 + 15 >> 4;
      if (var6 < _j) {
         var6 = _j;
      }

      if (var7 > _h) {
         var7 = _h;
      }

      if (var8 < _f) {
         var8 = _f;
      }

      if (var9 > _e) {
         var9 = _e;
      }

      int var10 = (var6 << 4) - var0;
      var10 *= var10;
      int var11 = (var6 + 1 << 4) - var0;
      var11 *= var11;
      int var12 = (var6 + 2 << 4) - var0;
      var12 *= var12;
      int var13 = var11 - var10;
      int var14 = var12 - var11;
      int var15 = var14 - var13;
      int var16 = (var8 << 4) - var1;
      var16 *= var16;
      int var17 = (var8 + 1 << 4) - var1;
      var17 *= var17;
      int var18 = (var8 + 2 << 4) - var1;
      var18 *= var18;
      int var19 = var17 - var16;
      int var20 = var18 - var17;
      int var21 = var20 - var19;
      int var22 = var6 + var8 * _i;
      int var23 = _i + var6 - var7;
      a555(0, 0, 0, 0, 0, var15, var5, var22, _b, var3, var4, var23, var13, var6 - var7, var16 + var10, var19, var21, var8 - var9);
   }

   static final void c115(int var0, int var1, int var2, int var3) {
      if (var0 >= _j && var0 < _h) {
         if (var1 < _f) {
            var2 -= _f - var1;
            var1 = _f;
         }

         if (var1 + var2 > _e) {
            var2 = _e - var1;
         }

         int var4 = var0 + var1 * _i;

         for(int var5 = 0; var5 < var2; var4 += _i) {
            _b[var4] = var3;
            ++var5;
         }

      }
   }

   static final void e115(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > _i) {
         var2 = _i;
      }

      if (var3 > _c) {
         var3 = _c;
      }

      _j = var0;
      _f = var1;
      _h = var2;
      _e = var3;
      d797();
   }

   static final void a797() {
      int var0 = 0;

      int var1;
      for(var1 = _i * _c - 7; var0 < var1; _b[var0++] = 0) {
         _b[var0++] = 0;
         _b[var0++] = 0;
         _b[var0++] = 0;
         _b[var0++] = 0;
         _b[var0++] = 0;
         _b[var0++] = 0;
         _b[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; _b[var0++] = 0) {
      }

   }

   static final void d115(int var0, int var1, int var2, int var3) {
      if (var0 < _j) {
         var2 -= _j - var0;
         var0 = _j;
      }

      if (var0 + var2 > _h) {
         var2 = _h - var0;
      }

      if (var1 < _f) {
         var3 -= _f - var1;
         var1 = _f;
      }

      if (var1 + var3 > _e) {
         var3 = _e - var1;
      }

      int var4 = var0 + var1 * _i;
      if (var2 > 0 && var3 > 0) {
         for(int var5 = 0; var5 < var3; ++var5) {
            for(int var6 = 0; var6 < var2; ++var6) {
               int var7 = _b[var4];
               int var8 = var7 >> 15 & 510;
               int var9 = var7 >> 8 & 255;
               int var10 = var7 & 255;
               int var11 = (var10 + var8) / 3 + var9 >> 1;
               _b[var4++] = (var11 << 16) + (var11 << 8) + var11;
            }

            var4 += _i - var2;
         }

      }
   }

   private static final void a600(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 16384 / (2 * var3 + 1);
      int var9 = 1 + var3 - var5 - var4;
      if (0 < var9) {
         var9 = 0;
      }

      int var10 = _i - var4 - var5 - var3;
      if (0 < var10) {
         var10 = 0;
      }

      int var11 = 0;
      int var12 = var4 + var3 + 1;
      if (_i < var12) {
         var11 = var12 - _i;
         var12 = _i;
      }

      for(int var13 = -var7; var13 < 0; ++var13) {
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         int var17 = var2 - var3;
         int var18 = var17 - (var3 << 1) - 1;
         int var19 = var4 - var3;
         if (var19 < 0) {
            var17 -= var19;
            var18 -= var19;
            var19 = 0;
         }

         int var20;
         for(var20 = var12 - var19; var19 < var12; ++var19) {
            var1 = var0[var17];
            var14 += var1 >> 16 & 255;
            var15 += var1 >> 8 & 255;
            var16 += var1 & 255;
            ++var17;
            ++var18;
         }

         var18 += var11;
         var0[var2++] = (var14 / var20 << 16) + (var15 / var20 << 8) + var16 / var20;

         int var21;
         int var22;
         int var23;
         for(var19 = 1 - var5; var19 < var9; ++var19) {
            ++var18;
            if (var4 + var5 + var19 + var3 < _h) {
               var1 = var0[var17];
               ++var17;
               var14 += var1 >> 16 & 255;
               var15 += var1 >> 8 & 255;
               var16 += var1 & 255;
               ++var20;
            }

            var21 = var14 / var20;
            var22 = var15 / var20;
            var23 = var16 / var20;
            var0[var2++] = (var21 << 16) + (var22 << 8) + var23;
         }

         while(var19 < var10) {
            var1 = var0[var18++];
            var14 -= var1 >> 16 & 255;
            if (var14 < 0) {
               var14 = 0;
            }

            var15 -= var1 >> 8 & 255;
            if (var15 < 0) {
               var15 = 0;
            }

            var16 -= var1 & 255;
            if (var16 < 0) {
               var16 = 0;
            }

            var1 = var0[var17];
            ++var17;
            var14 += var1 >> 16 & 255;
            var15 += var1 >> 8 & 255;
            var16 += var1 & 255;
            var21 = var14 * var8 >> 14;
            var22 = var15 * var8 >> 14;
            var23 = var16 * var8 >> 14;
            if (var21 > 255) {
               var21 = 255;
            }

            if (var22 > 255) {
               var22 = 255;
            }

            if (var23 > 255) {
               var23 = 255;
            }

            var0[var2++] = (var21 << 16) + (var22 << 8) + var23;
            ++var19;
         }

         while(var19 < 0) {
            var1 = var0[var18++];
            var14 -= var1 >> 16 & 255;
            var15 -= var1 >> 8 & 255;
            var16 -= var1 & 255;
            --var20;
            var21 = var14 / var20;
            var22 = var15 / var20;
            var23 = var16 / var20;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 255) {
               var21 = 255;
            }

            if (var22 < 0) {
               var22 = 0;
            } else if (var22 > 255) {
               var22 = 255;
            }

            if (var23 < 0) {
               var23 = 0;
            } else if (var23 > 255) {
               var23 = 255;
            }

            var0[var2++] = (var21 << 16) + (var22 << 8) + var23;
            ++var19;
         }

         var2 += var6;
      }

   }

   static final void b050(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < _j) {
         var2 -= _j - var0;
         var0 = _j;
      }

      if (var1 < _f) {
         var3 -= _f - var1;
         var1 = _f;
      }

      if (var0 + var2 > _h) {
         var2 = _h - var0;
      }

      if (var1 + var3 > _e) {
         var3 = _e - var1;
      }

      int var5 = _i - var2;
      int var6 = var0 + var1 * _i;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            _b[var6++] = var4;
         }

         var6 += var5;
      }

   }

   private static final void d797() {
      _g = null;
      _l = null;
   }

   static final void b331(int[] var0) {
      _j = var0[0];
      _f = var0[1];
      _h = var0[2];
      _e = var0[3];
      d797();
   }

   static final void a326(int var0, int var1, int var2) {
      if (var0 >= _j && var1 >= _f && var0 < _h && var1 < _e) {
         _b[var0 + var1 * _i] = var2;
      }
   }

   private static final void a621(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (_k == null || _k.length < var8) {
         _k = new int[var8];
         _a = new int[var8];
         _d = new int[var8];
      }

      int[] var9 = _k;
      int[] var10 = _a;
      int[] var11 = _d;
      cj_.a397(var9, 0, var8);
      cj_.a397(var10, 0, var8);
      cj_.a397(var11, 0, var8);
      int var12 = 16384 / (2 * var3 + 1);
      int var13 = var4 - var3;
      if (var13 < 0) {
         var13 = 0;
      }

      int var14 = var7 + var13 * _i;
      int var15 = var4 + var3;
      int var16 = 0;
      if (var15 >= _c) {
         var16 = var15 - _c + 1;
         var15 = _c - 1;
      }

      int var17;
      int var18;
      for(var17 = var15 - var13 + 1; var13 <= var15; ++var13) {
         for(var18 = 0; var18 < var8; ++var18) {
            var1 = var0[var14++];
            var9[var18] += var1 >> 16 & 255;
            var10[var18] += var1 >> 8 & 255;
            var11[var18] += var1 & 255;
         }

         var14 += var6;
      }

      var14 += var16 * _i;

      for(var18 = 0; var18 < var8; ++var18) {
         var0[var2++] = (var9[var18] / var17 << 16) + (var10[var18] / var17 << 8) + var11[var18] / var17;
      }

      var2 += var6;
      var13 = 1 - var5;
      var18 = 1 + var3 - var5 - var4;
      if (0 < var18) {
         var18 = 0;
      }

      int var19 = var7 + (var4 - var3) * _i;
      if (var13 < var18) {
         var19 += (var18 - var13) * _i;
      }

      int var20;
      int var21;
      int var22;
      int var23;
      while(var13 < var18) {
         if (var13 + var4 + var5 + var3 >= _e) {
            var14 += _i;
         } else {
            for(var20 = 0; var20 < var8; ++var20) {
               var1 = var0[var14++];
               var9[var20] += var1 >> 16 & 255;
               var10[var20] += var1 >> 8 & 255;
               var11[var20] += var1 & 255;
            }

            var14 += var6;
            ++var17;
         }

         for(var20 = 0; var20 < var8; ++var20) {
            var21 = var9[var20] / var17;
            var22 = var10[var20] / var17;
            var23 = var11[var20] / var17;
            var0[var2++] = (var21 << 16) + (var22 << 8) + var23;
         }

         var2 += var6;
         ++var13;
      }

      var18 = _c - var4 - var5 - var3;
      if (0 < var18) {
         var18 = 0;
      }

      while(var13 < var18) {
         for(var20 = 0; var20 < var8; ++var20) {
            var1 = var0[var19++];
            var21 = var9[var20] - (var1 >> 16 & 255);
            var9[var20] = var21 < 0 ? 0 : var21;
            var21 = var10[var20] - (var1 >> 8 & 255);
            var10[var20] = var21 < 0 ? 0 : var21;
            var21 = var11[var20] - (var1 & 255);
            var11[var20] = var21 < 0 ? 0 : var21;
         }

         var19 += var6;

         for(var20 = 0; var20 < var8; ++var20) {
            var1 = var0[var14++];
            var9[var20] += var1 >> 16 & 255;
            var10[var20] += var1 >> 8 & 255;
            var11[var20] += var1 & 255;
         }

         var14 += var6;

         for(var20 = 0; var20 < var8; ++var20) {
            var21 = var9[var20] * var12 >> 14;
            var22 = var10[var20] * var12 >> 14;
            var23 = var11[var20] * var12 >> 14;
            if (var21 > 255) {
               var21 = 255;
            }

            if (var22 > 255) {
               var22 = 255;
            }

            if (var23 > 255) {
               var23 = 255;
            }

            var0[var2++] = (var21 << 16) + (var22 << 8) + var23;
         }

         var2 += var6;
         ++var13;
      }

      while(var13 < 0) {
         for(var20 = 0; var20 < var8; ++var20) {
            var1 = var0[var19++];
            var9[var20] -= var1 >> 16 & 255;
            var10[var20] -= var1 >> 8 & 255;
            var11[var20] -= var1 & 255;
         }

         var19 += var6;
         --var17;

         for(var20 = 0; var20 < var8; ++var20) {
            var21 = var9[var20] / var17;
            var22 = var10[var20] / var17;
            var23 = var11[var20] / var17;
            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 255) {
               var21 = 255;
            }

            if (var22 < 0) {
               var22 = 0;
            } else if (var22 > 255) {
               var22 = 255;
            }

            if (var23 < 0) {
               var23 = 0;
            } else if (var23 > 255) {
               var23 = 255;
            }

            var0[var2++] = (var21 << 16) + (var22 << 8) + var23;
         }

         var2 += var6;
         ++var13;
      }

   }

   static final void b669(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < _j) {
         var2 -= _j - var0;
         var0 = _j;
      }

      if (var1 < _f) {
         var3 -= _f - var1;
         var1 = _f;
      }

      if (var0 + var2 > _h) {
         var2 = _h - var0;
      }

      if (var1 + var3 > _e) {
         var3 = _e - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = _i - var2;
      int var8 = var0 + var1 * _i;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = _b[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            _b[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   static final void g050(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            f115(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < _f) {
               var12 = _f;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > _e) {
               var13 = _e;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < _j) {
                  var20 = _j;
               }

               var21 = var0 + var16;
               if (var21 > _h) {
                  var21 = _h;
               }

               var22 = var20 + var14 * _i;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (_b[var22] >> 16 & 255) * var5;
                  var10 = (_b[var22] >> 8 & 255) * var5;
                  var11 = (_b[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  _b[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < _j) {
                  var20 = _j;
               }

               var21 = var0 + var16;
               if (var21 > _h - 1) {
                  var21 = _h - 1;
               }

               var22 = var20 + var14 * _i;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (_b[var22] >> 16 & 255) * var5;
                  var10 = (_b[var22] >> 8 & 255) * var5;
                  var11 = (_b[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  _b[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   static final void b115(int var0, int var1, int var2, int var3) {
      if (var1 >= _f && var1 < _e) {
         if (var0 < _j) {
            var2 -= _j - var0;
            var0 = _j;
         }

         if (var0 + var2 > _h) {
            var2 = _h - var0;
         }

         int var4 = var0 + var1 * _i;

         for(int var5 = 0; var5 < var2; ++var5) {
            _b[var4 + var5] = var3;
         }

      }
   }

   static final void a331(int[] var0) {
      var0[0] = _j;
      var0[1] = _f;
      var0[2] = _h;
      var0[3] = _e;
   }

   static final void e669(int var0, int var1, int var2, int var3, int var4, int var5) {
      d050(var0, var1, var2, var4, var5);
      d050(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         f050(var0, var1 + 1, var3 - 2, var4, var5);
         f050(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   static final void d050(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= _f && var1 < _e) {
         if (var0 < _j) {
            var2 -= _j - var0;
            var0 = _j;
         }

         if (var0 + var2 > _h) {
            var2 = _h - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * _i;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (_b[var12] >> 16 & 255) * var5;
            int var10 = (_b[var12] >> 8 & 255) * var5;
            int var11 = (_b[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            _b[var12++] = var14;
         }

      }
   }

   static final void a370(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 == 256) {
         a669(var0, var1, var2, var3, var4, var5);
      } else if (var4 == 0) {
         b669(var0, var1, var2, var3, var5, var6);
      } else {
         int var7 = 256 - var6;
         var5 = ((var5 & 16711935) * var6 >> 8 & 16711935) + ((var5 & '\uff00') * var6 >> 8 & '\uff00');
         if (var4 < 0) {
            var4 = -var4;
         }

         int var8 = var0 + var4;
         int var9 = var1 + var4;
         int var10 = var1;
         if (var1 < _f) {
            var10 = _f;
         }

         int var11 = var1 + var3;
         if (var11 > _e) {
            var11 = _e;
         }

         int var12 = var2 - var4 - var4 - 1;
         int var13 = var10;
         int var14 = var4 * var4;
         int var15 = 0;
         int var16 = var9 - var10;
         int var17 = var16 * var16;
         int var18 = var17 - var16;
         if (var9 > var11) {
            var9 = var11;
         }

         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         while(var13 < var9) {
            while(var18 <= var14 || var17 <= var14) {
               var17 += var15 + var15;
               var18 += var15++ + var15;
            }

            var19 = var8 - var15 + 1;
            if (var19 < _j) {
               var19 = _j;
            }

            var20 = var8 + var12 + var15;
            if (var20 > _h) {
               var20 = _h;
            }

            var21 = var19 + var13 * _i;

            for(var22 = var19; var22 < var20; ++var22) {
               var23 = _b[var21];
               var23 = ((var23 & 16711935) * var7 >> 8 & 16711935) + ((var23 & '\uff00') * var7 >> 8 & '\uff00');
               _b[var21++] = var5 + var23;
            }

            ++var13;
            var17 -= var16-- + var16;
            var18 -= var16 + var16;
         }

         int var10000 = var13 - var9;
         var19 = var0;
         if (var0 < _j) {
            var19 = _j;
         }

         var20 = var0 + var2;
         if (var20 > _h) {
            var20 = _h;
         }

         var21 = var19 + var13 * _i;
         var22 = _i + var19 - var20;
         var23 = var1 + var3 - var4 - 1;
         if (var23 > _e) {
            var23 = _e;
         }

         while(var13 < var23) {
            for(int var24 = var19; var24 < var20; ++var24) {
               int var25 = _b[var21];
               var25 = ((var25 & 16711935) * var7 >> 8 & 16711935) + ((var25 & '\uff00') * var7 >> 8 & '\uff00');
               _b[var21++] = var5 + var25;
            }

            ++var13;
            var21 += var22;
         }

         var16 = 0;
         var15 = var4;
         var18 = var16 * var16 + var14;
         var17 = var18 - var4;

         for(var18 -= var16; var13 < var11; var17 += var16++ + var16) {
            while(var18 > var14 && var17 > var14) {
               var18 -= var15-- + var15;
               var17 -= var15 + var15;
            }

            var19 = var8 - var15;
            if (var19 < _j) {
               var19 = _j;
            }

            var20 = var8 + var12 + var15;
            if (var20 > _h - 1) {
               var20 = _h - 1;
            }

            var21 = var19 + var13 * _i;

            for(var22 = var19; var22 <= var20; ++var22) {
               var23 = _b[var21];
               var23 = ((var23 & 16711935) * var7 >> 8 & 16711935) + ((var23 & '\uff00') * var7 >> 8 & '\uff00');
               _b[var21++] = var5 + var23;
            }

            ++var13;
            var18 += var16 + var16;
         }

      }
   }

   static final void g115(int var0, int var1, int var2, int var3) {
      if (var0 < _j) {
         var2 -= _j - var0;
         var0 = _j;
      }

      if (var1 < _f) {
         var3 -= _f - var1;
         var1 = _f;
      }

      if (var0 + var2 > _h) {
         var2 = _h - var0;
      }

      if (var1 + var3 > _e) {
         var3 = _e - var1;
      }

      int var4 = _i - var2;
      int var5 = var0 + var1 * _i;
      a412(var5, _b, 0, var2, -var3, var4);
   }

   static final void d669(int var0, int var1, int var2, int var3, int var4, int var5) {
      a600(_b, 0, var2 + var3 * _i, var0, var2, var4, _i - var4, var5);
      a621(_b, 0, var2 + var3 * _i, var1, var3, var5, _i - var4, var2, var4);
   }

   static final void h115(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         a326(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         if (_h > _j && _e > _f) {
            if (var0 + var2 >= _j && var0 - var2 < _h && var1 + var2 >= _f && var1 - var2 < _e) {
               int var4 = var0 + var1 * _i;
               int var5 = var4;
               int var6 = var4 - var2 * _i;
               int var7 = var4 + var2 * _i;
               int var8 = var2;
               int var9 = 0;
               var2 *= var2;
               int var10 = var2 - var8;
               if (var0 - var8 >= _j && var0 + var8 < _h && var1 - var8 >= _f && var1 + var8 < _e) {
                  _b[var4 - var8] = var3;
                  _b[var4 + var8] = var3;
                  _b[var6] = var3;
                  _b[var7] = var3;

                  while(true) {
                     var10 += var9++ + var9;
                     var4 -= _i;
                     var5 += _i;
                     if (var10 > var2) {
                        --var8;
                        var10 -= var8 + var8;
                        var6 += _i;
                        var7 -= _i;
                     }

                     if (var8 < var9) {
                        break;
                     }

                     _b[var6 - var9] = var3;
                     _b[var6 + var9] = var3;
                     _b[var4 - var8] = var3;
                     _b[var4 + var8] = var3;
                     _b[var5 - var8] = var3;
                     _b[var5 + var8] = var3;
                     _b[var7 - var9] = var3;
                     _b[var7 + var9] = var3;
                  }
               } else {
                  if (var0 - var8 >= _j && var1 >= _f && var1 < _e) {
                     _b[var4 - var8] = var3;
                  }

                  if (var0 + var8 < _h && var1 >= _f && var1 < _e) {
                     _b[var4 + var8] = var3;
                  }

                  if (var1 - var8 >= _f && var0 >= _j && var0 < _h) {
                     _b[var6] = var3;
                  }

                  if (var1 + var8 < _e && var0 >= _j && var0 < _h) {
                     _b[var7] = var3;
                  }

                  while(true) {
                     var10 += var9++ + var9;
                     var4 -= _i;
                     var5 += _i;
                     if (var10 > var2) {
                        --var8;
                        var10 -= var8 + var8;
                        var6 += _i;
                        var7 -= _i;
                     }

                     if (var8 < var9) {
                        break;
                     }

                     if (var1 - var8 >= _f && var1 - var8 < _e) {
                        if (var0 - var9 >= _j && var0 - var9 < _h) {
                           _b[var6 - var9] = var3;
                        }

                        if (var0 + var9 >= _j && var0 + var9 < _h) {
                           _b[var6 + var9] = var3;
                        }
                     }

                     if (var1 - var9 >= _f && var1 - var9 < _e) {
                        if (var0 - var8 >= _j && var0 - var8 < _h) {
                           _b[var4 - var8] = var3;
                        }

                        if (var0 + var8 >= _j && var0 + var8 < _h) {
                           _b[var4 + var8] = var3;
                        }
                     }

                     if (var1 + var9 >= _f && var1 + var9 < _e) {
                        if (var0 - var8 >= _j && var0 - var8 < _h) {
                           _b[var5 - var8] = var3;
                        }

                        if (var0 + var8 >= _j && var0 + var8 < _h) {
                           _b[var5 + var8] = var3;
                        }
                     }

                     if (var1 + var8 >= _f && var1 + var8 < _e) {
                        if (var0 - var9 >= _j && var0 - var9 < _h) {
                           _b[var7 - var9] = var3;
                        }

                        if (var0 + var9 >= _j && var0 + var9 < _h) {
                           _b[var7 + var9] = var3;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static final void f115(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         a326(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < _f) {
            var4 = _f;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > _e) {
            var5 = _e;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if (var12 < _j) {
               var12 = _j;
            }

            var13 = var0 + var8;
            if (var13 > _h) {
               var13 = _h;
            }

            var14 = var12 + var6 * _i;

            for(var15 = var12; var15 < var13; ++var15) {
               _b[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if (var12 < _j) {
               var12 = _j;
            }

            var13 = var0 + var8;
            if (var13 > _h - 1) {
               var13 = _h - 1;
            }

            var14 = var12 + var6 * _i;

            for(var15 = var12; var15 <= var13; ++var15) {
               _b[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   static final void a397(int[] var0, int var1, int var2) {
      _b = var0;
      _i = var1;
      _c = var2;
      e115(0, 0, var1, var2);
   }

   static final void e050(int var0, int var1, int var2, int var3, int var4) {
      b115(var0, var1, var2, var4);
      b115(var0, var1 + var3 - 1, var2, var4);
      c115(var0, var1, var3, var4);
      c115(var0 + var2 - 1, var1, var3, var4);
   }

   private static final void a555(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int var9, int[] var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17) {
      while(var17 < 0) {
         var3 = var14;
         var4 = var12;

         for(int var18 = var13; var18 < 0; ++var18) {
            if (var3 < var6) {
               var0 = var10[(var6 - var3) * var9 / var6];
               var1 = var8[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var8[var7] = var2 - var1 | var1 - (var1 >>> 8);
            }

            ++var7;
            var3 += var4;
            var4 += var5;
         }

         var7 += var11;
         var14 += var15;
         var15 += var16;
         ++var17;
      }

   }

   static final void a669(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var4 == 0) {
         b050(var0, var1, var2, var3, var5);
      } else {
         if (var4 < 0) {
            var4 = -var4;
         }

         int var6 = var0 + var4;
         int var7 = var1 + var4;
         int var8 = var1;
         if (var1 < _f) {
            var8 = _f;
         }

         int var9 = var1 + var3;
         if (var9 > _e) {
            var9 = _e;
         }

         int var10 = var2 - var4 - var4 - 1;
         int var11 = var8;
         int var12 = var4 * var4;
         int var13 = 0;
         int var14 = var7 - var8;
         int var15 = var14 * var14;
         int var16 = var15 - var14;
         if (var7 > var9) {
            var7 = var9;
         }

         int var17;
         int var18;
         int var19;
         int var20;
         while(var11 < var7) {
            while(var16 <= var12 || var15 <= var12) {
               var15 += var13 + var13;
               var16 += var13++ + var13;
            }

            var17 = var6 - var13 + 1;
            if (var17 < _j) {
               var17 = _j;
            }

            var18 = var6 + var10 + var13;
            if (var18 > _h) {
               var18 = _h;
            }

            var19 = var17 + var11 * _i;

            for(var20 = var17; var20 < var18; ++var20) {
               _b[var19++] = var5;
            }

            ++var11;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
         }

         int var10000 = var11 - var7;
         var17 = var0;
         if (var0 < _j) {
            var17 = _j;
         }

         var18 = var0 + var2;
         if (var18 > _h) {
            var18 = _h;
         }

         var19 = var17 + var11 * _i;
         var20 = _i + var17 - var18;
         int var21 = var1 + var3 - var4 - 1;
         if (var21 > _e) {
            var21 = _e;
         }

         while(var11 < var21) {
            for(int var22 = var17; var22 < var18; ++var22) {
               _b[var19++] = var5;
            }

            ++var11;
            var19 += var20;
         }

         var14 = 0;
         var13 = var4;
         var16 = var14 * var14 + var12;
         var15 = var16 - var4;

         for(var16 -= var14; var11 < var9; var15 += var14++ + var14) {
            while(var16 > var12 && var15 > var12) {
               var16 -= var13-- + var13;
               var15 -= var13 + var13;
            }

            var17 = var6 - var13;
            if (var17 < _j) {
               var17 = _j;
            }

            var18 = var6 + var10 + var13;
            if (var18 > _h - 1) {
               var18 = _h - 1;
            }

            var19 = var17 + var11 * _i;

            for(var20 = var17; var20 <= var18; ++var20) {
               _b[var19++] = var5;
            }

            ++var11;
            var16 += var14 + var14;
         }

      }
   }

   static final void a050(int var0, int var1, int var2, int var3, int var4) {
      for(int var6 = 0; var6 < 4; ++var6) {
         int var5 = 128 - (var6 << 5);
         d050(var0 + var6, var1 + var3 + var6, var2, var4, var5);
         f050(var0 + var2 + var6, var1 + var6, var3 + 1, var4, var5);
      }

   }

   private static final void f050(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= _j && var0 < _h) {
         if (var1 < _f) {
            var2 -= _f - var1;
            var1 = _f;
         }

         if (var1 + var2 > _e) {
            var2 = _e - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * _i;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (_b[var12] >> 16 & 255) * var5;
            int var10 = (_b[var12] >> 8 & 255) * var5;
            int var11 = (_b[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            _b[var12] = var14;
            var12 += _i;
         }

      }
   }

   static final void a907(int var0, int var1, int var2, int var3, int[] var4) {
      int var5 = var2 * var2;
      int var6 = var1 - var2 >> 4;
      int var7 = var1 + var2 + 15 >> 4;
      if (var6 < _f) {
         var6 = _f;
      }

      if (var7 > _e) {
         var7 = _e;
      }

      int var8 = (var6 << 4) - var1;
      var8 *= var8;
      int var9 = (var6 + 1 << 4) - var1;
      var9 *= var9;
      int var10 = (var6 + 2 << 4) - var1;
      var10 *= var10;
      int var11 = var9 - var8;
      int var12 = var10 - var9;
      int var13 = var12 - var11;
      int var14 = var6 * _i;
      int var15 = _i;

      for(int var16 = var6 - var7; var16 < 0; ++var16) {
         int var17 = var0 - var2 >> 4;
         int var18 = var0 + var2 + 15 >> 4;
         if (var17 < _j) {
            var17 = _j;
         }

         if (var18 > _h) {
            var18 = _h;
         }

         int var19 = var0 + 15 >> 4;
         int var20 = var19;

         int var21;
         int var22;
         while(var17 < var19) {
            var21 = var17 + var19 >> 1;
            var22 = (var21 << 4) - var0;
            var22 *= var22;
            if (var8 + var22 < var5) {
               var19 = var21;
            } else {
               var17 = var21 + 1;
            }
         }

         while(var18 > var20) {
            var21 = var20 + var18 >> 1;
            var22 = (var21 << 4) - var0;
            var22 *= var22;
            if (var8 + var22 < var5) {
               var20 = var21 + 1;
            } else {
               var18 = var21;
            }
         }

         var21 = (var17 << 4) - var0;
         var21 *= var21;
         var22 = (var17 + 1 << 4) - var0;
         var22 *= var22;
         int var23 = (var17 + 2 << 4) - var0;
         var23 *= var23;
         int var24 = var22 - var21;
         int var25 = var23 - var22;
         int var26 = var25 - var24;
         int var27 = (var18 - 1 << 4) - var0;
         var27 *= var27;
         int var28 = (var18 - 2 << 4) - var0;
         var28 *= var28;
         int var29 = var28 - var27;
         boolean var30 = a398(0, 0, 0, 0, 0, var26, var5, var14 + var17, var17 - var18, _b, var3, var4, 1, var24, var8 + var21);
         if (var30) {
            a398(0, 0, 0, 0, 0, var26, var5, var14 + var18 - 1, var17 - var18, _b, var3, var4, -1, var29, var8 + var27);
         }

         var14 += var15;
         var8 += var11;
         var11 += var13;
      }

   }

   private static final boolean a398(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int var10, int[] var11, int var12, int var13, int var14) {
      var3 = var14;

      for(var4 = var13; var8 < 0; ++var8) {
         var1 = (var6 - var3) * var10 / var6;
         if (var1 >= var11.length) {
            return true;
         }

         var0 = var11[var1];
         var1 = var9[var7];
         var2 = var0 + var1;
         var0 = (var0 & 16711935) + (var1 & 16711935);
         var1 = (var0 & 16777472) + (var2 - var0 & 65536);
         var9[var7] = var2 - var1 | var1 - (var1 >>> 8);
         var7 += var12;
         var3 += var4;
         var4 += var5;
      }

      return false;
   }

   static final void a115(int var0, int var1, int var2, int var3) {
      if (_j < var0) {
         _j = var0;
      }

      if (_f < var1) {
         _f = var1;
      }

      if (_h > var2) {
         _h = var2;
      }

      if (_e > var3) {
         _e = var3;
      }

      d797();
   }

   static final void c050(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            b115(var0, var1, var2 + 1, var4);
         } else {
            b115(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            c115(var0, var1, var3 + 1, var4);
         } else {
            c115(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5);
            var2 += var0;
            if (var0 < _j) {
               var1 += var5 * (_j - var0);
               var0 = _j;
            }

            if (var2 >= _h) {
               var2 = _h - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= _f && var6 < _e) {
                  _b[var0 + var6 * _i] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5);
            var3 += var1;
            if (var1 < _f) {
               var0 += var5 * (_f - var1);
               var1 = _f;
            }

            if (var3 >= _e) {
               var3 = _e - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= _j && var6 < _h) {
                  _b[var6 + var1 * _i] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }
}
