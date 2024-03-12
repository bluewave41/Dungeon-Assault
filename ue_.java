final class ue_ extends ne_ {
   static String _m = "Instructions";
   byte[] _l;
   static cn_[] _i;
   int _k;
   static int[] _j;

   static final boolean b427() {
      return d_._f;
   }

   static final void a150(int var0) {
      sn_.a093(97, 4);
   }

   static final int a080(int var0) {
      int var1 = 0;
      if (0 > var0 || 65536 <= var0) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (16 <= var0) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (4 <= var0) {
         var1 += 2;
         var0 >>>= 2;
      }

      if (var0 >= 1) {
         ++var1;
         var0 >>>= 1;
      }

      return var1 + var0;
   }

   public static void a423() {
      _j = null;
      _m = null;
      _i = null;
   }

   private ue_() throws Throwable {
      throw new Error();
   }

   static final void a657(int var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var3 >= 0 && re_._i > var0) {
         if (var6 >= 0 || 0 <= var4 || var7 >= 0) {
            if (re_._b > var6 || re_._b > var4 || re_._b > var7) {
               int var13 = -var0 + var3;
               int var8;
               int var9;
               int var10;
               int var11;
               boolean var12;
               int var14;
               int var15;
               int var16;
               if (var0 != var5) {
                  var8 = var9 = var6 << 16;
                  var14 = var5 - var0;
                  var11 = (var7 - var6 << 16) / var13;
                  var10 = (-var6 + var4 << 16) / var14;
                  if (var10 < var11) {
                     var12 = false;
                  } else {
                     var15 = var10;
                     var10 = var11;
                     var11 = var15;
                     var12 = true;
                  }

                  label138: {
                     if (0 > var0) {
                        if (0 > var5) {
                           var0 = var5 - var0;
                           var9 += var11 * var0;
                           var8 += var0 * var10;
                           var0 = var5;
                           break label138;
                        }

                        var0 = -var0;
                        var9 += var0 * var11;
                        var8 += var10 * var0;
                        var0 = 0;
                     }

                     for(var15 = re_._e[var0]; var0 < var5; var9 += var11) {
                        var16 = var8 >> 16;
                        if (var16 < re_._b) {
                           int var17 = -(var8 >> 16) + (var9 >> 16);
                           if (var17 != 0) {
                              if (re_._b <= var16 + var17) {
                                 var17 = re_._b - var16 - 1;
                              }

                              if (var16 < 0) {
                                 sa_.a846((byte)45, var17 + var16, var15, var2, var1);
                              } else {
                                 sa_.a846((byte)45, var17, var16 + var15, var2, var1);
                              }
                           } else if (0 <= var16 && var16 < re_._b) {
                              sa_.a846((byte)45, var17, var15 + var16, var2, var1);
                           }
                        }

                        ++var0;
                        if (re_._i <= var0) {
                           return;
                        }

                        var15 += gf_._i;
                        var8 += var10;
                     }
                  }

                  var15 = var3 - var5;
                  if (var15 != 0) {
                     if (!var12) {
                        var8 = var4 << 16;
                     } else {
                        var9 = var4 << 16;
                     }

                     var16 = var7 << 16;
                     var10 = (-var8 + var16) / var15;
                     var11 = (-var9 + var16) / var15;
                  } else {
                     var10 = 0;
                     var11 = 0;
                  }
               } else {
                  if (var0 == var3) {
                     var9 = var4 << 16;
                     var10 = 0;
                     var11 = 0;
                     var8 = var6 << 16;
                  } else {
                     var14 = var3 - var5;
                     if (var4 <= var6) {
                        var8 = var4 << 16;
                        var11 = (var7 - var6 << 16) / var13;
                        var9 = var6 << 16;
                        var10 = (var7 - var4 << 16) / var14;
                     } else {
                        var10 = (var7 - var6 << 16) / var13;
                        var11 = (-var4 + var7 << 16) / var14;
                        var9 = var4 << 16;
                        var8 = var6 << 16;
                     }
                  }

                  var12 = false;
                  if (var0 < 0) {
                     var0 = Math.min(-var0, -var0 + var5);
                     var8 += var10 * var0;
                     var9 += var0 * var11;
                     var0 = 0;
                  }
               }

               if (0 > var0) {
                  var0 = -var0;
                  var8 += var10 * var0;
                  var9 += var11 * var0;
                  var0 = 0;
               }

               for(var14 = re_._e[var0]; var3 > var0; var9 += var11) {
                  var15 = var8 >> 16;
                  if (re_._b > var15) {
                     var16 = (var9 >> 16) - (var8 >> 16);
                     if (var16 != 0) {
                        if (var16 + var15 >= re_._b) {
                           var16 = re_._b - var15 - 1;
                        }

                        if (0 > var15) {
                           sa_.a846((byte)45, var15 + var16, var14, var2, var1);
                        } else {
                           sa_.a846((byte)45, var16, var15 + var14, var2, var1);
                        }
                     } else if (0 <= var15 && var15 < re_._b) {
                        sa_.a846((byte)45, var16, var15 + var14, var2, var1);
                     }
                  }

                  ++var0;
                  if (re_._i <= var0) {
                     return;
                  }

                  var8 += var10;
                  var14 += gf_._i;
               }

            }
         }
      }
   }
}
