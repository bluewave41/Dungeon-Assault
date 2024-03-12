final class ej_ {
   private static dc_ _a = new dc_();

   static final int a265(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(_a) {
         _a._d = var2;
         _a._h = var4;
         _a._G = var0;
         _a._a = 0;
         _a._A = var1;
         _a._F = 0;
         _a._j = 0;
         _a._N = 0;
         _a._P = 0;
         e483(_a);
         var1 -= _a._A;
         _a._d = null;
         _a._G = null;
         return var1;
      }
   }

   private static final void d483(dc_ var0) {
      byte var2 = var0._O;
      int var3 = var0._b;
      int var4 = var0._L;
      int var5 = var0._c;
      int[] var6 = hj_._W;
      int var7 = var0._t;
      byte[] var8 = var0._G;
      int var9 = var0._a;
      int var10 = var0._A;
      int var12 = var0._u + 1;

      label63:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label63;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label63;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label63;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if (var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if (var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label63;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label63;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0._P;
      var0._P += var10 - var10;
      if (var0._P < var13) {
      }

      var0._O = var2;
      var0._b = var3;
      var0._L = var4;
      var0._c = var5;
      hj_._W = var6;
      var0._t = var7;
      var0._G = var8;
      var0._a = var9;
      var0._A = var10;
   }

   public static void a797() {
      _a = null;
   }

   private static final void e483(dc_ var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0._o = 1;
      if (hj_._W == null) {
         hj_._W = new int[var0._o * 100000];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = a503(var0);
            if (var1 == 23) {
               return;
            }

            var1 = a503(var0);
            var1 = a503(var0);
            var1 = a503(var0);
            var1 = a503(var0);
            var1 = a503(var0);
            var1 = a503(var0);
            var1 = a503(var0);
            var1 = a503(var0);
            var1 = a503(var0);
            var1 = c503(var0);
            if (var1 != 0) {
            }

            var0._I = 0;
            var1 = a503(var0);
            var0._I = var0._I << 8 | var1 & 255;
            var1 = a503(var0);
            var0._I = var0._I << 8 | var1 & 255;
            var1 = a503(var0);
            var0._I = var0._I << 8 | var1 & 255;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = c503(var0);
               if (var1 == 1) {
                  var0._n[var35] = true;
               } else {
                  var0._n[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0._E[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0._n[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = c503(var0);
                     if (var1 == 1) {
                        var0._E[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            b483(var0);
            int var38 = var0._M + 2;
            int var39 = a431(3, var0);
            int var40 = a431(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = c503(var0);
                  if (var1 == 0) {
                     var0._g[var35] = (byte)var36;
                     break;
                  }

                  ++var36;
               }
            }

            byte[] var27 = new byte[6];

            int var29;
            for(var29 = 0; var29 < var39; var29 = (byte)(var29 + 1)) {
               var27[var29] = (byte)var29;
            }

            int var28;
            for(var35 = 0; var35 < var40; ++var35) {
               var29 = var0._g[var35];

               for(var28 = var27[var29]; var29 > 0; var29 = (byte)(var29 - 1)) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = (byte)var28;
               var0._J[var35] = (byte)var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var48 = a431(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = c503(var0);
                     if (var1 == 0) {
                        var0._r[var37][var35] = (byte)var48;
                        break;
                     }

                     var1 = c503(var0);
                     if (var1 == 0) {
                        ++var48;
                     } else {
                        --var48;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               byte var2 = 32;
               byte var3 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if (var0._r[var37][var35] > var3) {
                     var3 = var0._r[var37][var35];
                  }

                  if (var0._r[var37][var35] < var2) {
                     var2 = var0._r[var37][var35];
                  }
               }

               a701(var0._f[var37], var0._B[var37], var0._D[var37], var0._r[var37], var2, var3, var38);
               var0._w[var37] = var2;
            }

            int var41 = var0._M + 1;
            int var42 = -1;
            int var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0._s[var35] = 0;
            }

            var29 = 4095;

            int var53;
            for(var53 = 15; var53 >= 0; --var53) {
               for(var28 = 15; var28 >= 0; --var28) {
                  var0._y[var29] = (byte)(var53 * 16 + var28);
                  --var29;
               }

               var0._m[var53] = var29 + 1;
            }

            int var45 = 0;
            byte var52;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var52 = var0._J[var42];
               var22 = var0._w[var52];
               var23 = var0._f[var52];
               var25 = var0._D[var52];
               var24 = var0._B[var52];
            }

            --var43;
            int var49 = var22;

            int var50;
            byte var51;
            for(var50 = a431(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
               ++var49;
               var51 = c503(var0);
            }

            int var44 = var25[var50 - var24[var49]];

            while(true) {
               int[] var10000;
               int var10002;
               while(var44 != var41) {
                  if (var44 != 0 && var44 != 1) {
                     int var33 = var44 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = var0._m[0];

                        for(var1 = var0._y[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0._y[var34] = var0._y[var34 - 1];
                           var0._y[var34 - 1] = var0._y[var34 - 2];
                           var0._y[var34 - 2] = var0._y[var34 - 3];
                           var0._y[var34 - 3] = var0._y[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0._y[var30 + var33] = var0._y[var30 + var33 - 1];
                           --var33;
                        }

                        var0._y[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0._m[var31] + var32;

                        for(var1 = var0._y[var30]; var30 > var0._m[var31]; --var30) {
                           var0._y[var30] = var0._y[var30 - 1];
                        }

                        for(var10002 = var0._m[var31]++; var31 > 0; --var31) {
                           var10002 = var0._m[var31]--;
                           var0._y[var0._m[var31]] = var0._y[var0._m[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0._m[0]--;
                        var0._y[var0._m[0]] = var1;
                        if (var0._m[0] == 0) {
                           var29 = 4095;

                           for(var53 = 15; var53 >= 0; --var53) {
                              for(var28 = 15; var28 >= 0; --var28) {
                                 var0._y[var29] = var0._y[var0._m[var53] + var28];
                                 --var29;
                              }

                              var0._m[var53] = var29 + 1;
                           }
                        }
                     }

                     var10002 = var0._s[var0._C[var1 & 255] & 255]++;
                     hj_._W[var45] = var0._C[var1 & 255] & 255;
                     ++var45;
                     if (var43 == 0) {
                        ++var42;
                        var43 = 50;
                        var52 = var0._J[var42];
                        var22 = var0._w[var52];
                        var23 = var0._f[var52];
                        var25 = var0._D[var52];
                        var24 = var0._B[var52];
                     }

                     --var43;
                     var49 = var22;

                     for(var50 = a431(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
                        ++var49;
                        var51 = c503(var0);
                     }

                     var44 = var25[var50 - var24[var49]];
                  } else {
                     int var46 = -1;
                     int var47 = 1;

                     do {
                        if (var44 == 0) {
                           var46 += 1 * var47;
                        } else if (var44 == 1) {
                           var46 += 2 * var47;
                        }

                        var47 *= 2;
                        if (var43 == 0) {
                           ++var42;
                           var43 = 50;
                           var52 = var0._J[var42];
                           var22 = var0._w[var52];
                           var23 = var0._f[var52];
                           var25 = var0._D[var52];
                           var24 = var0._B[var52];
                        }

                        --var43;
                        var49 = var22;

                        for(var50 = a431(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
                           ++var49;
                           var51 = c503(var0);
                        }

                        var44 = var25[var50 - var24[var49]];
                     } while(var44 == 0 || var44 == 1);

                     ++var46;
                     var1 = var0._C[var0._y[var0._m[0]] & 255];
                     var10000 = var0._s;

                     for(var10000[var1 & 255] += var46; var46 > 0; --var46) {
                        hj_._W[var45] = var1 & 255;
                        ++var45;
                     }
                  }
               }

               var0._b = 0;
               var0._O = 0;
               var0._i[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0._i[var35] = var0._s[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var10000 = var0._i;
                  var10000[var35] += var0._i[var35 - 1];
               }

               for(var35 = 0; var35 < var45; ++var35) {
                  var1 = (byte)(hj_._W[var35] & 255);
                  var10000 = hj_._W;
                  int var10001 = var0._i[var1 & 255];
                  var10000[var10001] |= var35 << 8;
                  var10002 = var0._i[var1 & 255]++;
               }

               var0._t = hj_._W[var0._I] >> 8;
               var0._L = 0;
               var0._t = hj_._W[var0._t];
               var0._c = (byte)(var0._t & 255);
               var0._t >>= 8;
               ++var0._L;
               var0._u = var45;
               d483(var0);
               if (var0._L == var0._u + 1 && var0._b == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   private static final byte c503(dc_ var0) {
      return (byte)a431(1, var0);
   }

   private static final void a701(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   private static final byte a503(dc_ var0) {
      return (byte)a431(8, var0);
   }

   private static final void b483(dc_ var0) {
      var0._M = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0._E[var1]) {
            var0._C[var0._M] = (byte)var1;
            ++var0._M;
         }
      }

   }

   private static final int a431(int var0, dc_ var1) {
      while(var1._F < var0) {
         var1._j = var1._j << 8 | var1._d[var1._h] & 255;
         var1._F += 8;
         ++var1._h;
         ++var1._N;
         if (var1._N == 0) {
         }
      }

      int var2 = var1._j >> var1._F - var0 & (1 << var0) - 1;
      var1._F -= var0;
      return var2;
   }
}
