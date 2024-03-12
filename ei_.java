final class ei_ extends cn_ {
   ei_(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   private static final void e650(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -var5;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            int var12 = var2 >>> 24;
            if (var12 != 0) {
               int var13 = 256 - var12;
               int var14 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var14 & '\uff00') * var13 & 16711680) >>> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   final void b326(int var1, int var2, int var3) {
      var1 += super._w;
      var2 += super._A;
      int var4 = var1 + var2 * gf_._i;
      int var5 = 0;
      int var6 = super._v;
      int var7 = super._y;
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
         b057(0, 0, 0, gf_._b, super._B, var5, 0, var4, 0, var7, var6, var8, var9, var3);
      }
   }

   final void g093(int var1, int var2) {
      var1 += super._w;
      var2 += super._G - super._v - super._A;
      int var3 = var1 + (var2 + super._v - 1) * gf_._i;
      int var4 = 0;
      int var5 = super._v;
      int var6 = super._y;
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
         e650(gf_._b, super._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   final void b093(int var1, int var2) {
      var1 += super._w;
      var2 += super._G - super._v - super._A;
      int var3 = var1 + (var2 + super._v - 1) * gf_._i;
      int var4 = super._y - 1;
      int var5 = super._v;
      int var6 = super._y;
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
         d650(gf_._b, super._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   final void a093(int var1, int var2) {
      int var3 = super._y >> 1;
      int var4 = super._v >> 1;
      var1 += super._w / 2;
      var2 += super._A / 2;
      int var5 = var1 < gf_._j ? gf_._j - var1 << 1 : 0;
      int var6 = var1 + var3 > gf_._h ? (gf_._h - var1 << 1) - 2 : super._y - 2;
      int var7 = var2 < gf_._f ? gf_._f - var2 << 1 : 0;
      int var8 = var2 + var4 > gf_._e ? (gf_._e - var2 << 1) - 2 : super._v - 2;

      for(int var9 = var7; var9 <= var8; var9 += 2) {
         int var10 = var9 * super._y + var5;
         int var11 = (var2 + (var9 >> 1)) * gf_._i + var1 + (var5 >> 1);

         for(int var12 = var5; var12 <= var6; var10 += 2) {
            boolean var13 = false;
            boolean var14 = false;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;

            int var19;
            for(var19 = 0; var19 < 4; ++var19) {
               int var22 = super._B[var10 + (var19 & 1) + ((var19 & 2) == 0 ? super._y : 0)];
               int var23 = var22 >>> 24;
               var18 += var23;
               var15 += var23 * (var22 >> 16 & 255);
               var16 += var23 * (var22 >> 8 & 255);
               var17 += var23 * (var22 & 255);
            }

            if (var18 != 0) {
               var15 = (var15 / var18 << 16) + var17 / var18;
               var16 = var16 / var18 << 8;
               var19 = var18 >> 2;
               int var20 = 256 - var19;
               int var21 = gf_._b[var11];
               gf_._b[var11] = (var19 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19 * var16 + var20 * (var21 & '\uff00') & 16711680) >>> 8;
            }

            var12 += 2;
            ++var11;
         }
      }

   }

   final void f093(int var1, int var2) {
      var1 += super._E - super._y - super._w;
      var2 += super._A;
      int var3 = var1 + var2 * gf_._i;
      int var4 = super._y - 1;
      int var5 = super._v;
      int var6 = super._y;
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
         d650(gf_._b, super._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   final void c326(int var1, int var2, int var3) {
      var1 += super._w;
      var2 += super._A;
      int var4 = var1 + var2 * gf_._i;
      int var5 = 0;
      int var6 = super._v;
      int var7 = super._y;
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
         d983(gf_._b, super._B, 0, var5, var4, 0, 0, var7, var6, var8, var9, var3);
      }
   }

   private static final void e663(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var9 >> 16 & 255;
      int var11 = var9 >> 8 & 255;
      int var12 = var9 & 255;
      int var13 = -(var5 >> 2);
      var5 = -(var5 & 3);
      int var14 = var13 + var13 + var13 + var13 + var5;

      for(int var15 = -var6; var15 < 0; ++var15) {
         for(int var16 = var14; var16 < 0; ++var16) {
            var2 = var1[var3++];
            int var17 = var2 >>> 24;
            if (var17 == 0) {
               ++var4;
            } else {
               int var19 = var2 >> 16 & 255;
               int var20 = var2 >> 8 & 255;
               int var21 = var2 & 255;
               int var18;
               if (var19 == var20 && var20 == var21) {
                  if (var19 <= 128) {
                     var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
                  } else {
                     var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
                  }
               } else {
                  var18 = var2;
               }

               int var22 = 256 - var17;
               int var23 = var0[var4];
               var0[var4++] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & '\uff00') * var17 + (var23 & '\uff00') * var22 & 16711680) >>> 8;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   final void a669(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= super._w << 4;
         var2 -= super._A << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((super._y << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((super._y << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((super._v << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((super._v << 4) - var2) * var10;
         int var17 = ((super._y << 4) - var1) * var10 + ((super._v << 4) - var2) * var9;
         int var18 = -((super._y << 4) - var1) * var9 + ((super._v << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < gf_._j) {
            var19 = gf_._j;
         }

         if (var20 > gf_._h) {
            var20 = gf_._h;
         }

         if (var21 < gf_._f) {
            var21 = gf_._f;
         }

         if (var22 > gf_._e) {
            var22 = gf_._e;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * gf_._i + var19;
               double var24 = 1.6777216E7 / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               int var39;
               int var40;
               int var41;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += gf_._i) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (super._y << 12) < 0 && var31 - (super._v << 12) < 0) {
                           while(var37 < 0) {
                              var38 = super._B[(var36 >> 12) * super._y + (var35 >> 12)];
                              var39 = gf_._b[var34];
                              var40 = var38 >>> 24;
                              var41 = 256 - var40;
                              gf_._b[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & '\uff00') * var40 + (var39 & '\uff00') * var41 & 16711680) >>> 8;
                              ++var37;
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += gf_._i) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (super._y << 12) < 0) {
                           if ((var32 = var36 - (super._v << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = super._B[(var36 >> 12) * super._y + (var35 >> 12)];
                              var39 = gf_._b[var34];
                              var40 = var38 >>> 24;
                              var41 = 256 - var40;
                              gf_._b[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & '\uff00') * var40 + (var39 & '\uff00') * var41 & 16711680) >>> 8;
                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += gf_._i) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (super._y << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (1 + var36 - (super._v << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = super._B[(var36 >> 12) * super._y + (var35 >> 12)];
                              var39 = gf_._b[var34];
                              var40 = var38 >>> 24;
                              var41 = 256 - var40;
                              gf_._b[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & '\uff00') * var40 + (var39 & '\uff00') * var41 & 16711680) >>> 8;
                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += gf_._i) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (super._v << 12) < 0) {
                           if ((var32 = var35 - (super._y << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = super._B[(var36 >> 12) * super._y + (var35 >> 12)];
                              var39 = gf_._b[var34];
                              var40 = var38 >>> 24;
                              var41 = 256 - var40;
                              gf_._b[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & '\uff00') * var40 + (var39 & '\uff00') * var41 & 16711680) >>> 8;
                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += gf_._i) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (super._y << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (super._v << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = super._B[(var36 >> 12) * super._y + (var35 >> 12)];
                           var39 = gf_._b[var34];
                           var40 = var38 >>> 24;
                           var41 = 256 - var40;
                           gf_._b[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & '\uff00') * var40 + (var39 & '\uff00') * var41 & 16711680) >>> 8;
                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += gf_._i) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (super._y << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (1 + var36 - (super._v << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = super._B[(var36 >> 12) * super._y + (var35 >> 12)];
                           var39 = gf_._b[var34];
                           var40 = var38 >>> 24;
                           var41 = 256 - var40;
                           gf_._b[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & '\uff00') * var40 + (var39 & '\uff00') * var41 & 16711680) >>> 8;
                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += gf_._i) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (super._v << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (1 + var35 - (super._y << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = super._B[(var36 >> 12) * super._y + (var35 >> 12)];
                           var39 = gf_._b[var34];
                           var40 = var38 >>> 24;
                           var41 = 256 - var40;
                           gf_._b[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & '\uff00') * var40 + (var39 & '\uff00') * var41 & 16711680) >>> 8;
                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += gf_._i) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (super._y << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (super._v << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = super._B[(var36 >> 12) * super._y + (var35 >> 12)];
                        var39 = gf_._b[var34];
                        var40 = var38 >>> 24;
                        var41 = 256 - var40;
                        gf_._b[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & '\uff00') * var40 + (var39 & '\uff00') * var41 & 16711680) >>> 8;
                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += gf_._i) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (1 + var35 - (super._y << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (1 + var36 - (super._v << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = super._B[(var36 >> 12) * super._y + (var35 >> 12)];
                        var39 = gf_._b[var34];
                        var40 = var38 >>> 24;
                        var41 = 256 - var40;
                        gf_._b[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & '\uff00') * var40 + (var39 & '\uff00') * var41 & 16711680) >>> 8;
                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   private static final void d983(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var11 & 16711935;
      int var13 = var11 >> 8 & 255;

      for(var6 = -var8; var6 < 0; ++var6) {
         for(var5 = -var7; var5 < 0; ++var5) {
            var2 = var1[var3++];
            int var14 = var2 >>> 24;
            var2 &= 16777215;
            if (var14 != 0) {
               boolean var15 = false;
               int var18;
               if (var2 >> 8 == (var2 & '\uffff')) {
                  var2 &= 255;
                  var18 = (var2 * var12 >> 8 & 16711934) + (var2 * var13 & '\uff00') + 1;
               } else {
                  var18 = var2;
               }

               int var16 = 256 - var14;
               int var17 = var0[var4];
               var0[var4++] = ((var18 & 16711935) * var14 + (var17 & 16711935) * var16 & -16711936) + ((var18 & '\uff00') * var14 + (var17 & '\uff00') * var16 & 16711680) >>> 8;
            } else {
               ++var4;
            }
         }

         var4 += var9;
         var3 += var10;
      }

   }

   final void e093(int var1, int var2) {
      int var3 = super._y >> 2;
      int var4 = super._v >> 2;
      var1 += super._w / 4;
      var2 += super._A / 4;
      int var5 = var1 < gf_._j ? gf_._j - var1 << 2 : 0;
      int var6 = var1 + var3 > gf_._h ? (gf_._h - var1 << 2) - 4 : super._y - 4;
      int var7 = var2 < gf_._f ? gf_._f - var2 << 2 : 0;
      int var8 = var2 + var4 > gf_._e ? (gf_._e - var2 << 2) - 4 : super._v - 4;
      int[] var9 = new int[16];

      for(int var10 = var7; var10 <= var8; var10 += 4) {
         for(int var11 = var5; var11 <= var6; var11 += 4) {
            int var12 = var10 * super._y + var11;
            int var13 = (var2 + (var10 >> 2)) * gf_._i + var1 + (var11 >> 2);

            int var14;
            int var15;
            for(var14 = 0; var14 < 4; ++var14) {
               for(var15 = 0; var15 < 4; ++var15) {
                  var9[(var14 << 2) + var15] = super._B[var12 + var14 * super._y + var15];
               }
            }

            boolean var22 = false;
            var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;

            int var19;
            for(var19 = 0; var19 < 16; ++var19) {
               var14 = var9[var19] >>> 24;
               var15 += var14;
               var16 += var14 * (var9[var19] >> 16 & 255);
               var17 += var14 * (var9[var19] >> 8 & 255);
               var18 += var14 * (var9[var19] & 255);
            }

            if (var15 != 0) {
               var16 = (var16 / var15 << 16) + var18 / var15;
               var17 = var17 / var15 << 8;
               var19 = var15 >> 4;
               int var20 = 256 - var19;
               int var21 = gf_._b[var13];
               gf_._b[var13] = (var19 * var16 + var20 * (var21 & 16711935) & -16711936) + (var19 * var17 + var20 * (var21 & '\uff00') & 16711680) >>> 8;
            }
         }
      }

   }

   private static final void b590(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var2;

      for(int var13 = -var7; var13 < 0; ++var13) {
         int var14 = (var3 >> 16) * var10;

         for(int var15 = -var6; var15 < 0; ++var15) {
            int var16 = var1[(var2 >> 16) + var14];
            int var17 = var0[var4];
            int var18 = (var16 >>> 24) * var11 >> 8;
            int var19 = 256 - var18;
            var0[var4++] = ((var16 & 16711935) * var18 + (var17 & 16711935) * var19 & -16711936) + ((var16 & '\uff00') * var18 + (var17 & '\uff00') * var19 & 16711680) >>> 8;
            var2 += var8;
         }

         var3 += var9;
         var2 = var12;
         var4 += var5;
      }

   }

   final void d115(int var1, int var2, int var3, int var4) {
      if (super._v != 0) {
         int var5 = super._v;
         int var6 = super._y;
         int var7 = var3 << 8;
         int var8 = (var4 - var3 << 8) / var5;
         int var9 = 0;
         if (var1 < gf_._j) {
            var6 -= gf_._j - var1;
            var9 += gf_._j - var1;
            var1 = gf_._j;
         }

         if (var2 < gf_._f) {
            var7 += (gf_._f - var2) * var8;
            var5 -= gf_._f - var2;
            var9 += (gf_._f - var2) * gf_._i;
            var2 = gf_._f;
         }

         if (var1 + var6 > gf_._h) {
            var6 = gf_._h - var1;
         }

         if (var2 + var5 > gf_._e) {
            var5 = gf_._e - var2;
         }

         int var10 = gf_._i - var6;
         int var11 = super._y - var6;
         int var12 = var1 + var2 * gf_._i;

         for(var2 = -var5; var2 < 0; ++var2) {
            int var13 = var7 >> 8;
            if (var13 >= 0) {
               for(var1 = -var6; var1 < 0; ++var1) {
                  int var14 = (super._B[var9] >>> 24) * var13 >> 8;
                  int var15 = 256 - var14;
                  int var16 = super._B[var9++];
                  int var17 = gf_._b[var12];
                  gf_._b[var12++] = ((var16 & 16711935) * var14 + (var17 & 16711935) * var15 & -16711936) + ((var16 & '\uff00') * var14 + (var17 & '\uff00') * var15 & 16711680) >>> 8;
               }

               var12 += var10;
               var9 += var11;
               var7 += var8;
            }
         }

      }
   }

   final void f326(int var1, int var2, int var3) {
      if (var3 == 256) {
         this.h093(var1, var2);
      } else {
         var1 += super._w;
         var2 += super._A;
         int var4 = var1 + var2 * gf_._i;
         int var5 = 0;
         int var6 = super._v;
         int var7 = super._y;
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
            d663(gf_._b, super._B, 0, var5, var4, var7, var6, var8, var9, var3);
         }
      }
   }

   final void d326(int var1, int var2, int var3) {
      var1 += super._w;
      var2 += super._A;
      int var4 = var1 + var2 * gf_._i;
      int var5 = 0;
      int var6 = super._v;
      int var7 = super._y;
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
         f663(gf_._b, super._B, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   private static final void d663(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            int var12 = var2 >>> 24;
            if (var12 != 0) {
               int var13 = var0[var4];
               int var14 = 256 - var12;
               int var15 = (var2 & 16711935) * var9 & -16711936;
               int var16 = (var2 & '\uff00') * var9 & 16711680;
               var2 = (var15 | var16) >>> 8;
               var0[var4++] = ((var2 & 16711935) * var12 + (var13 & 16711935) * var14 & -16711936) + ((var2 & '\uff00') * var12 + (var13 & '\uff00') * var14 & 16711680) >>> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   private static final void f663(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = -var5; var9 < 0; ++var9) {
         for(int var10 = -var4; var10 < 0; ++var10) {
            int var11 = (var1[var2] >>> 24) * var8 >> 8;
            int var12 = 256 - var11;
            int var13 = var1[var2++];
            int var14 = var0[var3];
            var0[var3++] = ((var13 & 16711935) * var11 + (var14 & 16711935) * var12 & -16711936) + ((var13 & '\uff00') * var11 + (var14 & '\uff00') * var12 & 16711680) >>> 8;
         }

         var3 += var6;
         var2 += var7;
      }

   }

   final void c115(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = super._y;
         int var6 = super._v;
         int var7 = 0;
         int var8 = 0;
         int var9 = super._E;
         int var10 = super._G;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (super._w > 0) {
            var13 = ((super._w << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (super._w << 16);
         }

         if (super._A > 0) {
            var13 = ((super._A << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (super._A << 16);
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

         e983(gf_._b, super._B, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   final void h093(int var1, int var2) {
      var1 += super._w;
      var2 += super._A;
      int var3 = var1 + var2 * gf_._i;
      int var4 = 0;
      int var5 = super._v;
      int var6 = super._y;
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
         e650(gf_._b, super._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   private static final void b057(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               int var14 = var13 * (var0 >>> 24) >> 8 & 255;
               var1 = (var0 & 16711935) * var14;
               var0 = (var1 & -16711936) + (var0 * var14 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   final void c093(int var1, int var2) {
      var1 += super._w;
      var2 += super._A;
      int var3 = var1 + var2 * gf_._i;
      int var4 = 0;
      int var5 = super._v;
      int var6 = super._y;
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
         e650(gf_._b, super._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   private static final void e983(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            int var16 = var2 >>> 24;
            if (var16 != 0) {
               int var17 = 256 - var16;
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var2 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >>> 8;
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

   final void a326(int var1, int var2, int var3) {
      var1 += super._w;
      var2 += super._A;
      int var4 = var1 + var2 * gf_._i;
      int var5 = 0;
      int var6 = super._v;
      int var7 = super._y;
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
         e663(gf_._b, super._B, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   final void d050(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = super._y;
         int var7 = super._v;
         int var8 = 0;
         int var9 = 0;
         int var10 = super._E;
         int var11 = super._G;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (super._w > 0) {
            var14 = ((super._w << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (super._w << 16);
         }

         if (super._A > 0) {
            var14 = ((super._A << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (super._A << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * gf_._i;
         int var15 = gf_._i - var3;
         if (var2 + var4 > gf_._e) {
            var4 -= var2 + var4 - gf_._e;
         }

         int var16;
         if (var2 < gf_._f) {
            var16 = gf_._f - var2;
            var4 -= var16;
            var14 += var16 * gf_._i;
            var9 += var13 * var16;
         }

         if (var1 + var3 > gf_._h) {
            var16 = var1 + var3 - gf_._h;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < gf_._j) {
            var16 = gf_._j - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         b590(gf_._b, super._B, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   private static final void d650(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -var5;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3--];
            int var12 = var2 >>> 24;
            if (var12 != 0) {
               int var13 = 256 - var12;
               int var14 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var14 & '\uff00') * var13 & 16711680) >>> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   ei_(int var1, int var2) {
      super(var1, var2);
   }
}
