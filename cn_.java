import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

class cn_ extends rd_ {
   int[] _B;

   final void g797() {
      int[] var1 = new int[super._y * super._v];
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super._y; ++var3) {
         for(int var4 = super._v - 1; var4 >= 0; --var4) {
            var1[var2++] = this._B[var3 + var4 * super._y];
         }
      }

      this._B = var1;
      var3 = super._A;
      super._A = super._w;
      super._w = super._G - super._v - var3;
      var3 = super._v;
      super._v = super._y;
      super._y = var3;
      var3 = super._G;
      super._G = super._E;
      super._E = var3;
   }

   void a669(int var1, int var2, int var3, int var4, int var5, int var6) {
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
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += gf_._i) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (super._y << 12) < 0 && var31 - (super._v << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this._B[(var36 >> 12) * super._y + (var35 >> 12)];
                              if (var38 != 0) {
                                 gf_._b[var34++] = var38;
                              } else {
                                 ++var34;
                              }
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
                              var38 = this._B[(var36 >> 12) * super._y + (var35 >> 12)];
                              if (var38 != 0) {
                                 gf_._b[var34++] = var38;
                              } else {
                                 ++var34;
                              }

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
                              var38 = this._B[(var36 >> 12) * super._y + (var35 >> 12)];
                              if (var38 != 0) {
                                 gf_._b[var34++] = var38;
                              } else {
                                 ++var34;
                              }

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
                              var38 = this._B[(var36 >> 12) * super._y + (var35 >> 12)];
                              if (var38 != 0) {
                                 gf_._b[var34++] = var38;
                              } else {
                                 ++var34;
                              }

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
                           var38 = this._B[(var36 >> 12) * super._y + (var35 >> 12)];
                           if (var38 != 0) {
                              gf_._b[var34++] = var38;
                           } else {
                              ++var34;
                           }

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
                           var38 = this._B[(var36 >> 12) * super._y + (var35 >> 12)];
                           if (var38 != 0) {
                              gf_._b[var34++] = var38;
                           } else {
                              ++var34;
                           }

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
                           var38 = this._B[(var36 >> 12) * super._y + (var35 >> 12)];
                           if (var38 != 0) {
                              gf_._b[var34++] = var38;
                           } else {
                              ++var34;
                           }

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
                        var38 = this._B[(var36 >> 12) * super._y + (var35 >> 12)];
                        if (var38 != 0) {
                           gf_._b[var34++] = var38;
                        } else {
                           ++var34;
                        }

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
                        var38 = this._B[(var36 >> 12) * super._y + (var35 >> 12)];
                        if (var38 != 0) {
                           gf_._b[var34++] = var38;
                        } else {
                           ++var34;
                        }

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

   private static final void c983(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var11 & 16711935;
      int var13 = var11 >> 8 & 255;

      for(var6 = -var8; var6 < 0; ++var6) {
         for(var5 = -var7; var5 < 0; ++var5) {
            var2 = var1[var3++];
            if (var2 != 0) {
               if (var2 >> 8 == (var2 & '\uffff')) {
                  var2 &= 255;
                  var0[var4++] = (var2 * var12 >> 8 & 16711934) + (var2 * var13 & '\uff00') + 1;
               } else {
                  var0[var4++] = var2;
               }
            } else {
               ++var4;
            }
         }

         var4 += var9;
         var3 += var10;
      }

   }

   private static final void b650(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   final cn_ d125() {
      cn_ var1 = new cn_(super._y, super._v);
      var1._E = super._E;
      var1._G = super._G;
      var1._w = super._w;
      var1._A = super._A;
      int var2 = this._B.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1._B[var3] = this._B[var3];
      }

      return var1;
   }

   final void f797() {
      int[] var1 = new int[super._y * super._v];
      int var2 = 0;

      int var3;
      for(var3 = super._y - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < super._v; ++var4) {
            var1[var2++] = this._B[var3 + var4 * super._y];
         }
      }

      this._B = var1;
      var3 = super._w;
      super._w = super._A;
      super._A = super._E - super._y - var3;
      var3 = super._v;
      super._v = super._y;
      super._y = var3;
      var3 = super._G;
      super._G = super._E;
      super._E = var3;
   }

   void e093(int var1, int var2) {
      int var3 = super._y >> 2;
      int var4 = super._v >> 2;
      var1 += super._w / 4;
      var2 += super._A / 4;
      int var5 = var1 < gf_._j ? gf_._j - var1 << 2 : 0;
      int var6 = var1 + var3 > gf_._h ? (gf_._h - var1 << 2) - 4 : super._y - 4;
      int var7 = var2 < gf_._f ? gf_._f - var2 << 2 : 0;
      int var8 = var2 + var4 > gf_._e ? (gf_._e - var2 << 2) - 4 : super._v - 4;

      for(int var9 = var7; var9 <= var8; var9 += 4) {
         int var10 = var9 * super._y + var5;
         int var11 = (var2 + (var9 >> 2)) * gf_._i + var1 + (var5 >> 2);

         for(int var12 = var5; var12 <= var6; ++var11) {
            boolean var13 = false;
            int var14 = 0;
            int var15 = 0;

            for(int var16 = 0; var16 < 4; ++var16) {
               for(int var17 = 0; var17 < 4; ++var17) {
                  int var18 = this._B[var10 + var16 * super._y + var17];
                  if (var18 == 0) {
                     var18 = gf_._b[var11];
                  }

                  var14 += var18 & 16711935;
                  var15 += var18 & '\uff00';
               }
            }

            gf_._b[var11] = (var14 & 267390960 | var15 & 1044480) >> 4;
            var12 += 4;
            var10 += 4;
         }
      }

   }

   private static final void a590(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   final void a797() {
      if (super._y != super._E || super._v != super._G) {
         int[] var1 = new int[super._E * super._G];

         for(int var2 = 0; var2 < super._v; ++var2) {
            for(int var3 = 0; var3 < super._y; ++var3) {
               var1[(var2 + super._A) * super._E + var3 + super._w] = this._B[var2 * super._y + var3];
            }
         }

         this._B = var1;
         super._y = super._E;
         super._v = super._G;
         super._w = 0;
         super._A = 0;
      }
   }

   final void e797() {
      gf_.a397(this._B, super._y, super._v);
   }

   void b093(int var1, int var2) {
      var1 += super._E - super._y - super._w;
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
         c650(gf_._b, this._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   final void e326(int var1, int var2, int var3) {
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
         a650(gf_._b, this._B, var3, var5, var4, var7, var6, var8, var9);
      }
   }

   final cn_ b125() {
      cn_ var1 = new cn_(super._y, super._v);
      var1._E = super._E;
      var1._G = super._G;
      var1._w = super._E - super._y - super._w;
      var1._A = super._A;

      for(int var2 = 0; var2 < super._v; ++var2) {
         for(int var3 = 0; var3 < super._y; ++var3) {
            var1._B[var2 * super._y + var3] = this._B[var2 * super._y + super._y - 1 - var3];
         }
      }

      return var1;
   }

   final void e115(int var1, int var2, int var3, int var4) {
      int var5 = super._E << 3;
      int var6 = super._G << 3;
      var1 = (var1 << 4) + (var5 & 15);
      var2 = (var2 << 4) + (var6 & 15);
      this.b669(var5, var6, var1, var2, var3, var4);
   }

   void d326(int var1, int var2, int var3) {
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
         a663(gf_._b, this._B, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   final void b115(int var1, int var2, int var3, int var4) {
      if (var3 <= super._E && var4 <= super._G) {
         int var5 = var1 + super._w * var3 / super._E;
         int var6 = var1 + ((super._w + super._y) * var3 + super._E - 1) / super._E;
         int var7 = var2 + super._A * var4 / super._G;
         int var8 = var2 + ((super._A + super._v) * var4 + super._G - 1) / super._G;
         if (var5 < gf_._j) {
            var5 = gf_._j;
         }

         if (var6 > gf_._h) {
            var6 = gf_._h;
         }

         if (var7 < gf_._f) {
            var7 = gf_._f;
         }

         if (var8 > gf_._e) {
            var8 = gf_._e;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * gf_._i + var5;
            int var10 = gf_._i - (var6 - var5);

            for(int var11 = var7; var11 < var8; ++var11) {
               for(int var12 = var5; var12 < var6; ++var12) {
                  int var13 = var12 - var1 << 4;
                  int var14 = var11 - var2 << 4;
                  int var15 = var13 * super._E / var3 - (super._w << 4);
                  int var16 = (var13 + 16) * super._E / var3 - (super._w << 4);
                  int var17 = var14 * super._G / var4 - (super._A << 4);
                  int var18 = (var14 + 16) * super._G / var4 - (super._A << 4);
                  int var19 = (var16 - var15) * (var18 - var17);
                  if (var19 != 0) {
                     if (var15 < 0) {
                        var15 = 0;
                     }

                     if (var16 > super._y << 4) {
                        var16 = super._y << 4;
                     }

                     if (var17 < 0) {
                        var17 = 0;
                     }

                     if (var18 > super._v << 4) {
                        var18 = super._v << 4;
                     }

                     --var16;
                     --var18;
                     int var20 = 16 - (var15 & 15);
                     int var21 = (var16 & 15) + 1;
                     int var22 = 16 - (var17 & 15);
                     int var23 = (var18 & 15) + 1;
                     var15 >>= 4;
                     var16 >>= 4;
                     var17 >>= 4;
                     var18 >>= 4;
                     int var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = gf_._b[var9];

                     int var29;
                     for(var29 = var17; var29 <= var18; ++var29) {
                        int var30 = 16;
                        if (var29 == var17) {
                           var30 = var22;
                        }

                        if (var29 == var18) {
                           var30 = var23;
                        }

                        for(int var31 = var15; var31 <= var16; ++var31) {
                           int var32 = this._B[var29 * super._y + var31];
                           if (var32 == 0) {
                              var32 = var28;
                           }

                           int var33;
                           if (var31 == var15) {
                              var33 = var30 * var20;
                           } else if (var31 == var16) {
                              var33 = var30 * var21;
                           } else {
                              var33 = var30 << 4;
                           }

                           var27 += var33;
                           var24 += (var32 >> 16 & 255) * var33;
                           var25 += (var32 >> 8 & 255) * var33;
                           var26 += (var32 & 255) * var33;
                        }
                     }

                     if (var27 < var19) {
                        var29 = var19 - var27;
                        var24 += (var28 >> 16 & 255) * var29;
                        var25 += (var28 >> 8 & 255) * var29;
                        var26 += (var28 & 255) * var29;
                     }

                     var29 = (var24 / var19 << 16) + (var25 / var19 << 8) + var26 / var19;
                     if (var29 == 0) {
                        var29 = 1;
                     }

                     gf_._b[var9] = var29;
                     ++var9;
                  }
               }

               var9 += var10;
            }

         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   void c115(int var1, int var2, int var3, int var4) {
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

         b983(gf_._b, this._B, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   void c093(int var1, int var2) {
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
         a415(gf_._b, this._B, var4, var3, var6, var5, var7, var8);
      }
   }

   void a326(int var1, int var2, int var3) {
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
         c663(gf_._b, this._B, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   void f093(int var1, int var2) {
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
         c650(gf_._b, this._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   void a093(int var1, int var2) {
      var1 += super._w >> 1;
      var2 += super._A >> 1;
      int var3 = var1 < gf_._j ? gf_._j - var1 << 1 : 0;
      int var4 = var1 + (super._y >> 1) > gf_._h ? gf_._h - var1 << 1 : super._y;
      int var5 = var2 < gf_._f ? gf_._f - var2 << 1 : 0;
      int var6 = var2 + (super._v >> 1) > gf_._e ? gf_._e - var2 << 1 : super._v;
      a600(this._B, var5 * super._y + var3, (var2 + (var5 >> 1)) * gf_._i + var1 + (var3 >> 1), (super._y << 1) - (var4 - var3) + (super._y & 1), gf_._i - (var4 - var3 >> 1), super._y, var4 - var3 >> 1, var6 - var5 >> 1);
   }

   final void a115(int var1, int var2, int var3, int var4) {
      if (var3 <= super._E && var4 <= super._G) {
         int var5 = var1 + super._w * var3 / super._E;
         int var6 = var1 + ((super._w + super._y) * var3 + super._E - 1) / super._E;
         int var7 = var2 + super._A * var4 / super._G;
         int var8 = var2 + ((super._A + super._v) * var4 + super._G - 1) / super._G;
         if (var5 < gf_._j) {
            var5 = gf_._j;
         }

         if (var6 > gf_._h) {
            var6 = gf_._h;
         }

         if (var7 < gf_._f) {
            var7 = gf_._f;
         }

         if (var8 > gf_._e) {
            var8 = gf_._e;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * gf_._i + var5;
            int var10 = gf_._i - (var6 - var5);

            for(int var11 = var7; var11 < var8; ++var11) {
               for(int var12 = var5; var12 < var6; ++var12) {
                  int var13 = var12 - var1 << 4;
                  int var14 = var11 - var2 << 4;
                  int var15 = var13 * super._E / var3 - (super._w << 4);
                  int var16 = (var13 + 16) * super._E / var3 - (super._w << 4);
                  int var17 = var14 * super._G / var4 - (super._A << 4);
                  int var18 = (var14 + 16) * super._G / var4 - (super._A << 4);
                  int var19 = (var16 - var15) * (var18 - var17) >> 1;
                  if (var19 != 0) {
                     if (var15 < 0) {
                        var15 = 0;
                     }

                     if (var16 > super._y << 4) {
                        var16 = super._y << 4;
                     }

                     if (var17 < 0) {
                        var17 = 0;
                     }

                     if (var18 > super._v << 4) {
                        var18 = super._v << 4;
                     }

                     --var16;
                     --var18;
                     int var20 = 16 - (var15 & 15);
                     int var21 = (var16 & 15) + 1;
                     int var22 = 16 - (var17 & 15);
                     int var23 = (var18 & 15) + 1;
                     var15 >>= 4;
                     var16 >>= 4;
                     var17 >>= 4;
                     var18 >>= 4;
                     int var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;

                     int var28;
                     for(var28 = var17; var28 <= var18; ++var28) {
                        int var29 = 16;
                        if (var28 == var17) {
                           var29 = var22;
                        }

                        if (var28 == var18) {
                           var29 = var23;
                        }

                        for(int var30 = var15; var30 <= var16; ++var30) {
                           int var31 = this._B[var28 * super._y + var30];
                           if (var31 != 0) {
                              int var32;
                              if (var30 == var15) {
                                 var32 = var29 * var20;
                              } else if (var30 == var16) {
                                 var32 = var29 * var21;
                              } else {
                                 var32 = var29 << 4;
                              }

                              var27 += var32;
                              var24 += (var31 >> 16 & 255) * var32;
                              var25 += (var31 >> 8 & 255) * var32;
                              var26 += (var31 & 255) * var32;
                           }
                        }
                     }

                     if (var27 >= var19) {
                        var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                        if (var28 == 0) {
                           var28 = 1;
                        }

                        gf_._b[var9] = var28;
                     }

                     ++var9;
                  }
               }

               var9 += var10;
            }

         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   private static final void b983(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
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

   private static final void c650(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3--];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   final void b669(int var1, int var2, int var3, int var4, int var5, int var6) {
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
               int var24 = gf_._i + var20;
               double var25 = 1.6777216E7 / (double)var6;
               int var27 = (int)Math.floor(Math.sin(var7) * var25 + 0.5);
               int var28 = (int)Math.floor(Math.cos(var7) * var25 + 0.5);
               int var29 = (var19 << 4) + 8 - var3;
               int var30 = (var21 << 4) + 8 - var4;
               int var31 = (var1 << 8) - 2048 - (var30 * var27 >> 4);
               int var32 = (var2 << 8) - 2048 + (var30 * var28 >> 4);
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               int var39;
               if (var28 < 0) {
                  if (var27 < 0) {
                     for(var36 = var22; var36 < 0; var23 += var24) {
                        label250: {
                           var37 = var31 + (var29 * var28 >> 4);
                           var38 = var32 + (var29 * var27 >> 4);
                           var39 = var20;
                           if ((var35 = var37 - (super._y << 12)) >= 0) {
                              if (var28 == 0) {
                                 var23 -= var20;
                                 break label250;
                              }

                              var35 = (var28 - var35) / var28;
                              var39 = var20 + var35;
                              var37 += var28 * var35;
                              var38 += var27 * var35;
                              var23 += var35;
                           }

                           if ((var35 = var38 - (super._v << 12)) >= 0) {
                              if (var27 == 0) {
                                 var23 -= var39;
                                 break label250;
                              }

                              var35 = (var27 - var35) / var27;
                              var39 += var35;
                              var37 += var28 * var35;
                              var38 += var27 * var35;
                              var23 += var35;
                           }

                           while(var39 < 0 && var37 >= -4096 && var38 >= -4096) {
                              var33 = var37 >> 12;
                              var34 = var38 >> 12;
                              this.c050(var23, var33, var34, var37, var38);
                              ++var39;
                              var37 += var28;
                              var38 += var27;
                              ++var23;
                           }

                           var23 -= var39;
                        }

                        ++var36;
                        var31 -= var27;
                        var32 += var28;
                     }
                  } else {
                     for(var36 = var22; var36 < 0; var23 += var24) {
                        label252: {
                           var37 = var31 + (var29 * var28 >> 4);
                           var38 = var32 + (var29 * var27 >> 4);
                           var39 = var20;
                           if ((var35 = var37 - (super._y << 12)) >= 0) {
                              if (var28 == 0) {
                                 var23 -= var20;
                                 break label252;
                              }

                              var35 = (var28 - var35) / var28;
                              var39 = var20 + var35;
                              var37 += var28 * var35;
                              var38 += var27 * var35;
                              var23 += var35;
                           }

                           if ((var35 = var38 + 4096) < 0) {
                              if (var27 == 0) {
                                 var23 -= var39;
                                 break label252;
                              }

                              var35 = (var27 - 1 - var35) / var27;
                              var39 += var35;
                              var37 += var28 * var35;
                              var38 += var27 * var35;
                              var23 += var35;
                           }

                           while(var39 < 0 && var37 >= -4096 && (var34 = var38 >> 12) < super._v) {
                              var33 = var37 >> 12;
                              this.c050(var23, var33, var34, var37, var38);
                              ++var39;
                              var37 += var28;
                              var38 += var27;
                              ++var23;
                           }

                           var23 -= var39;
                        }

                        ++var36;
                        var31 -= var27;
                        var32 += var28;
                     }
                  }
               } else if (var27 < 0) {
                  for(var36 = var22; var36 < 0; var23 += var24) {
                     label254: {
                        var37 = var31 + (var29 * var28 >> 4);
                        var38 = var32 + (var29 * var27 >> 4);
                        var39 = var20;
                        if ((var35 = var37 + 4096) < 0) {
                           if (var28 == 0) {
                              var23 -= var20;
                              break label254;
                           }

                           var35 = (var28 - 1 - var35) / var28;
                           var39 = var20 + var35;
                           var37 += var28 * var35;
                           var38 += var27 * var35;
                           var23 += var35;
                        }

                        if ((var35 = var38 - (super._v << 12)) >= 0) {
                           if (var27 == 0) {
                              var23 -= var39;
                              break label254;
                           }

                           var35 = (var27 - var35) / var27;
                           var39 += var35;
                           var37 += var28 * var35;
                           var38 += var27 * var35;
                           var23 += var35;
                        }

                        while(var39 < 0 && var38 >= -4096 && (var33 = var37 >> 12) < super._y) {
                           var34 = var38 >> 12;
                           this.c050(var23, var33, var34, var37, var38);
                           ++var39;
                           var37 += var28;
                           var38 += var27;
                           ++var23;
                        }

                        var23 -= var39;
                     }

                     ++var36;
                     var31 -= var27;
                     var32 += var28;
                  }
               } else {
                  for(var36 = var22; var36 < 0; var23 += var24) {
                     label256: {
                        var37 = var31 + (var29 * var28 >> 4);
                        var38 = var32 + (var29 * var27 >> 4);
                        var39 = var20;
                        if ((var35 = var37 + 4096) < 0) {
                           if (var28 == 0) {
                              var23 -= var20;
                              break label256;
                           }

                           var35 = (var28 - 1 - var35) / var28;
                           var39 = var20 + var35;
                           var37 += var28 * var35;
                           var38 += var27 * var35;
                           var23 += var35;
                        }

                        if ((var35 = var38 + 4096) < 0) {
                           if (var27 == 0) {
                              var23 -= var39;
                              break label256;
                           }

                           var35 = (var27 - 1 - var35) / var27;
                           var39 += var35;
                           var37 += var28 * var35;
                           var38 += var27 * var35;
                           var23 += var35;
                        }

                        while(var39 < 0 && (var33 = var37 >> 12) < super._y && (var34 = var38 >> 12) < super._v) {
                           this.c050(var23, var33, var34, var37, var38);
                           ++var39;
                           var37 += var28;
                           var38 += var27;
                           ++var23;
                        }

                        var23 -= var39;
                     }

                     ++var36;
                     var31 -= var27;
                     var32 += var28;
                  }
               }

            }
         }
      }
   }

   void h093(int var1, int var2) {
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
         b650(gf_._b, this._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   private static final void a057(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
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

   final void d093(int var1, int var2) {
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
         a871(0, gf_._b, this._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   void g093(int var1, int var2) {
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
         b650(gf_._b, this._B, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   void b326(int var1, int var2, int var3) {
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
         if (var3 == 256) {
            a138(0, 0, 0, gf_._b, this._B, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            a057(0, 0, 0, gf_._b, this._B, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   private static final void a663(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   void d050(int var1, int var2, int var3, int var4, int var5) {
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

         a590(gf_._b, this._B, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   private static final void a871(int var0, int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for(int var10 = -var7; var10 < 0; ++var10) {
         for(int var11 = -var6; var11 < 0; ++var11) {
            var3 = var2[var4++];
            if (var3 != 0) {
               var0 = var1[var5];
               if (var0 != 0) {
                  int var12 = ((var3 & 16711680) >>> 16) * ((var0 & 16711680) >>> 16) >>> 8;
                  int var13 = (var3 & '\uff00') * (var0 & '\uff00') >>> 24;
                  int var14 = (var3 & 255) * (var0 & 255) >>> 8;
                  var1[var5++] = (var12 << 16) + (var13 << 8) + var14;
               } else {
                  ++var5;
               }
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   private static final void a415(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
         }

         var3 += var6;
         var2 += var7;
      }

   }

   private static final void a600(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var7; var2 += var4) {
         for(int var9 = 0; var9 < var6; var1 += 2) {
            int var11 = gf_._b[var2] & 16711935;
            int var12 = gf_._b[var2] & '\uff00';
            int var13 = 0;
            int var14 = 0;
            int var10;
            if ((var10 = var0[var1]) == 0) {
               var13 += var11;
               var14 += var12;
            } else {
               var13 += var10 & 16711935;
               var14 += var10 & '\uff00';
            }

            if ((var10 = var0[var1 + 1]) == 0) {
               var13 += var11;
               var14 += var12;
            } else {
               var13 += var10 & 16711935;
               var14 += var10 & '\uff00';
            }

            if ((var10 = var0[var1 + var5]) == 0) {
               var13 += var11;
               var14 += var12;
            } else {
               var13 += var10 & 16711935;
               var14 += var10 & '\uff00';
            }

            if ((var10 = var0[var1 + var5 + 1]) == 0) {
               var13 += var11;
               var14 += var12;
            } else {
               var13 += var10 & 16711935;
               var14 += var10 & '\uff00';
            }

            gf_._b[var2++] = (var13 & 66847740 | var14 & 261120) >> 2;
            ++var9;
         }

         ++var8;
         var1 += var3;
      }

   }

   final void h797() {
      int var1 = -1;
      int var2 = super._y * super._v - 4;

      while(var1 < var2) {
         ++var1;
         if (this._B[var1] == 0) {
            this._B[var1] = 1;
         }

         ++var1;
         if (this._B[var1] == 0) {
            this._B[var1] = 1;
         }

         ++var1;
         if (this._B[var1] == 0) {
            this._B[var1] = 1;
         }

         ++var1;
         if (this._B[var1] == 0) {
            this._B[var1] = 1;
         }
      }

      var2 += 3;

      while(var1 < var2) {
         ++var1;
         if (this._B[var1] == 0) {
            this._B[var1] = 1;
         }
      }

   }

   void d115(int var1, int var2, int var3, int var4) {
      if (super._v != 0) {
         var1 += super._w;
         var2 += super._A;
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
            var9 += (gf_._f - var2) * super._y;
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
            int var14 = 256 - var13;
            if (var13 >= 0) {
               int var15;
               if (var13 > 255) {
                  for(var1 = -var6; var1 < 0; ++var1) {
                     var15 = this._B[var9++];
                     if (var15 != 0) {
                        gf_._b[var12++] = var15;
                     } else {
                        ++var12;
                     }
                  }
               } else {
                  for(var1 = -var6; var1 < 0; ++var1) {
                     var15 = this._B[var9++];
                     if (var15 != 0) {
                        int var16 = gf_._b[var12];
                        int var17 = (var16 & 16711935) * var14 + (var15 & 16711935) * var13 >> 8 & 16711935;
                        gf_._b[var12++] = var17 + ((var16 & '\uff00') * var14 + (var15 & '\uff00') * var13 >> 8 & '\uff00');
                     } else {
                        ++var12;
                     }
                  }
               }

               var12 += var10;
               var9 += var11;
               var7 += var8;
            }
         }

      }
   }

   final void d150(int var1) {
      int[] var2 = new int[super._y * super._v];
      int var3 = 0;

      for(int var4 = 0; var4 < super._v; ++var4) {
         for(int var5 = 0; var5 < super._y; ++var5) {
            int var6 = this._B[var3];
            if (var6 == 0) {
               if (var5 > 0 && this._B[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this._B[var3 - super._y] != 0) {
                  var6 = var1;
               } else if (var5 < super._y - 1 && this._B[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < super._v - 1 && this._B[var3 + super._y] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this._B = var2;
   }

   private static final void b663(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var12 = (var2 & 16711935) * var9 & -16711936;
               int var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = (var12 | var13) >>> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   private static final void a983(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            if (var1[(var3 >> 16) + var14] != 0) {
               var0[var5++] = var2;
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

   final void c797() {
      int var1;
      int var2;
      int var3;
      label108:
      for(var1 = super._v - 1; var1 >= 0; --var1) {
         var2 = var1 * super._y;

         for(var3 = 0; var3 < super._y; ++var3) {
            if (this._B[var2 + var3] != 0) {
               break label108;
            }
         }
      }

      int var4;
      label96:
      for(var2 = 0; var2 < var1; ++var2) {
         var3 = var2 * super._y;

         for(var4 = 0; var4 < super._y; ++var4) {
            if (this._B[var3 + var4] != 0) {
               break label96;
            }
         }
      }

      label84:
      for(var3 = super._y - 1; var3 >= 0; --var3) {
         for(var4 = var2; var4 <= var1; ++var4) {
            if (this._B[var4 * super._y + var3] != 0) {
               break label84;
            }
         }
      }

      int var5;
      label72:
      for(var4 = 0; var4 < var3; ++var4) {
         for(var5 = var2; var5 <= var1; ++var5) {
            if (this._B[var5 * super._y + var4] != 0) {
               break label72;
            }
         }
      }

      if (var4 != 0 || var3 != super._y - 1 || var2 != 0 || var1 != super._v - 1) {
         var5 = var3 + 1 - var4;
         int var6 = var1 + 1 - var2;
         int[] var7 = new int[var5 * var6];

         for(int var8 = 0; var8 < var6; ++var8) {
            for(int var9 = 0; var9 < var5; ++var9) {
               var7[var8 * var5 + var9] = this._B[(var8 + var2) * super._y + var9 + var4];
            }
         }

         this._B = var7;
         super._y = var5;
         super._v = var6;
         super._w += var4;
         super._A += var2;
      }
   }

   private static final void c663(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var9 >> 16 & 255;
      int var11 = var9 >> 8 & 255;
      int var12 = var9 & 255;
      int var13 = -(var5 >> 2);
      var5 = -(var5 & 3);
      int var14 = var13 + var13 + var13 + var13 + var5;

      for(int var15 = -var6; var15 < 0; ++var15) {
         for(int var16 = var14; var16 < 0; ++var16) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var17 = var2 >> 16 & 255;
               int var18 = var2 >> 8 & 255;
               int var19 = var2 & 255;
               if (var17 == var18 && var18 == var19) {
                  if (var17 <= 128) {
                     var0[var4++] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                  } else {
                     var0[var4++] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                  }
               } else {
                  var0[var4++] = var2;
               }
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   void c326(int var1, int var2, int var3) {
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
         c983(gf_._b, this._B, 0, var5, var4, 0, 0, var7, var6, var8, var9, var3);
      }
   }

   private static final void a650(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   final void b050(int var1, int var2, int var3, int var4, int var5) {
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

         a983(gf_._b, this._B, var5, var8, var9, var14, var15, var3, var4, var12, var13, var6);
      }
   }

   private static final void a138(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
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

   void f326(int var1, int var2, int var3) {
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
            b663(gf_._b, this._B, 0, var5, var4, var7, var6, var8, var9, var3);
         }
      }
   }

   private final void c050(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var3 * super._y + var2;
      var4 &= 4095;
      var5 &= 4095;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var3 >= 0) {
         if (var2 >= 0) {
            var7 = this._B[var6];
            var11 = var7 != 0 ? (4096 - var4) * (4096 - var5) : 0;
         } else {
            var11 = 0;
            var7 = 0;
         }

         if (var2 < super._y - 1) {
            var8 = this._B[var6 + 1];
            var12 = var8 != 0 ? var4 * (4096 - var5) : 0;
         } else {
            var12 = 0;
            var8 = 0;
         }
      } else {
         var12 = 0;
         var11 = 0;
         var8 = 0;
         var7 = 0;
      }

      int var9;
      int var10;
      int var13;
      int var14;
      if (var3 < super._v - 1) {
         if (var2 >= 0) {
            var9 = this._B[var6 + super._y];
            var13 = var9 != 0 ? (4096 - var4) * var5 : 0;
         } else {
            var13 = 0;
            var9 = 0;
         }

         if (var2 < super._y - 1) {
            var10 = this._B[var6 + super._y + 1];
            var14 = var10 != 0 ? var4 * var5 : 0;
         } else {
            var14 = 0;
            var10 = 0;
         }
      } else {
         var14 = 0;
         var13 = 0;
         var10 = 0;
         var9 = 0;
      }

      var11 >>= 16;
      var12 >>= 16;
      var13 >>= 16;
      var14 >>= 16;
      int var15 = var11 + var12 + var13 + var14;
      int var16;
      int var17;
      int var18;
      if (var15 >= 256) {
         var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
         var16 += (var9 & 16711935) * var13 + (var10 & 16711935) * var14;
         var17 = (var7 & '\uff00') * var11 + (var8 & '\uff00') * var12;
         var17 += (var9 & '\uff00') * var13 + (var10 & '\uff00') * var14;
         var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & '\uff00');
         if (var18 == 0) {
            var18 = 1;
         }

         gf_._b[var1] = var18;
      } else if (var15 >= 128) {
         var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
         var16 += (var9 & 16711935) * var13 + (var10 & 16711935) * var14;
         var17 = (var7 & '\uff00') * var11 + (var8 & '\uff00') * var12;
         var17 += (var9 & '\uff00') * var13 + (var10 & '\uff00') * var14;
         var18 = ((var16 >>> 16) / var15 << 16) + (var17 / var15 & '\uff00') + (var16 & '\uffff') / var15;
         if (var18 == 0) {
            var18 = 1;
         }

         gf_._b[var1] = var18;
      }

   }

   cn_(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      super._E = var1;
      super._G = var2;
      super._w = var3;
      super._A = var4;
      super._y = var5;
      super._v = var6;
      this._B = var7;
   }

   cn_(int var1, int var2) {
      this._B = new int[var1 * var2];
      super._y = super._E = var1;
      super._v = super._G = var2;
      super._A = 0;
      super._w = 0;
   }

   cn_(byte[] var1, Component var2) {
      try {
         Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
         MediaTracker var4 = new MediaTracker(var2);
         var4.addImage(var3, 0);
         var4.waitForAll();
         super._y = var3.getWidth(var2);
         super._v = var3.getHeight(var2);
         super._E = super._y;
         super._G = super._v;
         super._w = 0;
         super._A = 0;
         this._B = new int[super._y * super._v];
         PixelGrabber var5 = new PixelGrabber(var3, 0, 0, super._y, super._v, this._B, 0, super._y);
         var5.grabPixels();
      } catch (InterruptedException var6) {
      }

   }
}
