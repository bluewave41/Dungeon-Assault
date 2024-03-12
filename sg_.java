final class sg_ {
   static int[] _c = new int[46];
   static String _f = "Daemonette";
   static int[] _d = new int[46];
   static cn_ _b;
   static String _a = "These work in the same way as trap rooms, but the consequences of a failed roll are that any monsters in the dungeon will be much harder to surprise when starting combat. Some guardians require a raider to make a successful Sneak roll (against the Guardian's Detect), while others require a Dodge roll (against the Guardian's Snare)";
   static String[] _e;

   static final boolean a330(int var0, int var1, int var2) {
      if (var1 == var0) {
         int var3 = tg_._f[3][var2];
         if (var3 == 23) {
            return ak_._o[0] <= gm_._d._m;
         }
      }

      return true;
   }

   static final void a876(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (var3 >= 0 && re_._i > var8) {
         if (var13 >= 0 || var5 >= 0 || 0 <= var15) {
            if (var13 < re_._b || re_._b > var5 || re_._b > var15) {
               int var33 = -var8 + var3;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               int var24;
               int var25;
               int var26;
               int var27;
               int var28;
               int var29;
               int var30;
               int var31;
               boolean var32;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               int var39;
               if (var8 != var7) {
                  var24 = var25 = var2 << 16;
                  var20 = var21 = var9 << 16;
                  var16 = var17 = var13 << 16;
                  var28 = var29 = var12 << 16;
                  var34 = -var8 + var7;
                  var18 = (-var13 + var5 << 16) / var34;
                  var19 = (var15 - var13 << 16) / var33;
                  if (var19 <= var18) {
                     var30 = (var6 - var12 << 16) / var33;
                     var35 = var18;
                     var18 = var19;
                     var19 = var35;
                     var32 = true;
                     var27 = (-var2 + var11 << 16) / var34;
                     var26 = (var1 - var2 << 16) / var33;
                     var23 = (-var9 + var10 << 16) / var34;
                     var31 = (-var12 + var4 << 16) / var34;
                     var22 = (var14 - var9 << 16) / var33;
                  } else {
                     var26 = (var11 - var2 << 16) / var34;
                     var32 = false;
                     var31 = (var6 - var12 << 16) / var33;
                     var23 = (var14 - var9 << 16) / var33;
                     var27 = (-var2 + var1 << 16) / var33;
                     var30 = (var4 - var12 << 16) / var34;
                     var22 = (-var9 + var10 << 16) / var34;
                  }

                  label141: {
                     if (0 > var8) {
                        if (0 > var7) {
                           var8 = -var8 + var7;
                           var17 += var8 * var19;
                           var28 += var30 * var8;
                           var24 += var26 * var8;
                           var29 += var31 * var8;
                           var20 += var8 * var22;
                           var16 += var18 * var8;
                           var21 += var23 * var8;
                           var25 += var27 * var8;
                           var8 = var7;
                           break label141;
                        }

                        var8 = -var8;
                        var16 += var8 * var18;
                        var24 += var8 * var26;
                        var29 += var31 * var8;
                        var21 += var8 * var23;
                        var20 += var22 * var8;
                        var25 += var8 * var27;
                        var28 += var8 * var30;
                        var17 += var8 * var19;
                        var8 = 0;
                     }

                     for(var35 = re_._e[var8]; var7 > var8; var24 += var26) {
                        var36 = var16 >> 16;
                        if (var36 < re_._b) {
                           var37 = (var17 >> 16) - (var16 >> 16);
                           if (var37 != 0) {
                              var38 = (-var20 + var21) / var37;
                              var39 = (-var24 + var25) / var37;
                              int var40 = (var29 - var28) / var37;
                              if (var37 + var36 >= re_._b) {
                                 var37 = re_._b - var36 - 1;
                              }

                              if (var36 >= 0) {
                                 lo_.a352(var37, var35 + var36, var40, var24, 0, var20, var0, var38, var28, var39);
                              } else {
                                 lo_.a352(var36 + var37, var35, var40, var24 - var39 * var36, 0, var20 - var38 * var36, var0, var38, var28 - var36 * var40, var39);
                              }
                           } else if (var36 >= 0 && re_._b > var36) {
                              lo_.a352(var37, var36 + var35, 0, var24, 0, var20, var0, 0, var28, 0);
                           }
                        }

                        ++var8;
                        if (var8 >= re_._i) {
                           return;
                        }

                        var20 += var22;
                        var29 += var31;
                        var25 += var27;
                        var35 += gf_._i;
                        var28 += var30;
                        var21 += var23;
                        var17 += var19;
                        var16 += var18;
                     }
                  }

                  var35 = -var7 + var3;
                  if (var35 == 0) {
                     var26 = 0;
                     var18 = 0;
                     var22 = 0;
                     var19 = 0;
                     var30 = 0;
                     var27 = 0;
                     var23 = 0;
                     var31 = 0;
                  } else {
                     var36 = var15 << 16;
                     var37 = var14 << 16;
                     var38 = var1 << 16;
                     var39 = var6 << 16;
                     if (!var32) {
                        var28 = var4 << 16;
                        var24 = var11 << 16;
                        var16 = var5 << 16;
                        var20 = var10 << 16;
                     } else {
                        var17 = var5 << 16;
                        var21 = var10 << 16;
                        var29 = var4 << 16;
                        var25 = var11 << 16;
                     }

                     var18 = (var36 - var16) / var35;
                     var26 = (var38 - var24) / var35;
                     var30 = (var39 - var28) / var35;
                     var23 = (var37 - var21) / var35;
                     var27 = (var38 - var25) / var35;
                     var19 = (-var17 + var36) / var35;
                     var31 = (var39 - var29) / var35;
                     var22 = (-var20 + var37) / var35;
                  }
               } else {
                  if (var3 == var8) {
                     var27 = 0;
                     var25 = var11;
                     var30 = 0;
                     var26 = 0;
                     var22 = 0;
                     var23 = 0;
                     var28 = var12;
                     var31 = 0;
                     var24 = var2;
                     var17 = var5 << 16;
                     var20 = var9;
                     var16 = var13 << 16;
                     var21 = var10;
                     var29 = var4;
                     var19 = 0;
                     var18 = 0;
                  } else {
                     var34 = var3 - var7;
                     if (var5 > var13) {
                        var20 = var9 << 16;
                        var27 = (-var11 + var1 << 16) / var34;
                        var26 = (-var2 + var1 << 16) / var33;
                        var22 = (var14 - var9 << 16) / var33;
                        var29 = var4 << 16;
                        var18 = (var15 - var13 << 16) / var33;
                        var30 = (var6 - var12 << 16) / var33;
                        var24 = var2 << 16;
                        var28 = var12 << 16;
                        var25 = var11 << 16;
                        var21 = var10 << 16;
                        var19 = (var15 - var5 << 16) / var34;
                        var16 = var13 << 16;
                        var23 = (-var10 + var14 << 16) / var34;
                        var31 = (-var4 + var6 << 16) / var34;
                        var17 = var5 << 16;
                     } else {
                        var29 = var12 << 16;
                        var23 = (var14 - var9 << 16) / var33;
                        var30 = (-var4 + var6 << 16) / var34;
                        var21 = var9 << 16;
                        var27 = (var1 - var2 << 16) / var33;
                        var20 = var10 << 16;
                        var19 = (-var13 + var15 << 16) / var33;
                        var22 = (var14 - var10 << 16) / var34;
                        var24 = var11 << 16;
                        var16 = var5 << 16;
                        var18 = (var15 - var5 << 16) / var34;
                        var17 = var13 << 16;
                        var28 = var4 << 16;
                        var31 = (-var12 + var6 << 16) / var33;
                        var25 = var2 << 16;
                        var26 = (var1 - var11 << 16) / var34;
                     }
                  }

                  if (0 > var8) {
                     var8 = Math.min(-var8, -var8 + var7);
                     var16 += var18 * var8;
                     var21 += var23 * var8;
                     var20 += var8 * var22;
                     var28 += var8 * var30;
                     var24 += var8 * var26;
                     var25 += var27 * var8;
                     var29 += var8 * var31;
                     var17 += var19 * var8;
                     var8 = 0;
                  }

                  var32 = false;
               }

               if (var8 < 0) {
                  var8 = -var8;
                  var16 += var8 * var18;
                  var20 += var22 * var8;
                  var29 += var31 * var8;
                  var24 += var26 * var8;
                  var21 += var23 * var8;
                  var17 += var19 * var8;
                  var25 += var27 * var8;
                  var28 += var8 * var30;
                  var8 = 0;
               }

               for(var34 = re_._e[var8]; var8 < var3; var25 += var27) {
                  var35 = var16 >> 16;
                  if (re_._b > var35) {
                     var36 = (var17 >> 16) - (var16 >> 16);
                     if (var36 == 0) {
                        if (0 <= var35 && var35 < re_._b) {
                           lo_.a352(var36, var35 + var34, 0, var24, 0, var20, var0, 0, var28, 0);
                        }
                     } else {
                        var37 = (-var20 + var21) / var36;
                        var38 = (-var24 + var25) / var36;
                        var39 = (-var28 + var29) / var36;
                        if (var35 + var36 >= re_._b) {
                           var36 = -var35 + re_._b - 1;
                        }

                        if (0 > var35) {
                           lo_.a352(var36 + var35, var34, var39, var24 - var38 * var35, 0, -(var35 * var37) + var20, var0, var37, var28 - var35 * var39, var38);
                        } else {
                           lo_.a352(var36, var34 + var35, var39, var24, 0, var20, var0, var37, var28, var38);
                        }
                     }
                  }

                  ++var8;
                  if (var8 >= re_._i) {
                     return;
                  }

                  var28 += var30;
                  var29 += var31;
                  var20 += var22;
                  var17 += var19;
                  var34 += gf_._i;
                  var16 += var18;
                  var24 += var26;
                  var21 += var23;
               }

            }
         }
      }
   }

   public static void a423() {
      _a = null;
      _c = null;
      _f = null;
      _b = null;
      _e = null;
      _d = null;
   }

   static {
      _d[0] = 1;
      _c[0] = 100;
      _d[1] = 1;
      _c[1] = 100;
      _d[2] = 1;
      _c[2] = 100;
      _d[3] = 1;
      _c[3] = 100;
      _d[4] = 2;
      _d[5] = 2;
      _c[4] = 200;
      _c[5] = 200;
      _d[6] = 3;
      _c[6] = 300;
      _d[7] = 2;
      _d[8] = 1;
      _c[7] = 200;
      _c[8] = 100;
      _d[9] = 1;
      _c[9] = 100;
      _d[10] = 2;
      _d[11] = 2;
      _c[10] = 200;
      _d[12] = 2;
      _c[11] = 200;
      _c[12] = 200;
      _d[13] = 3;
      _d[14] = 3;
      _c[13] = 300;
      _d[15] = 1;
      _c[14] = 300;
      _c[15] = 100;
      _d[16] = 1;
      _c[16] = 100;
      _d[17] = 1;
      _d[18] = 3;
      _c[17] = 100;
      _d[19] = 1;
      _c[18] = 300;
      _d[20] = 1;
      _c[19] = 100;
      _d[21] = 1;
      _c[20] = 100;
      _d[22] = 10;
      _c[21] = 100;
      _d[23] = 5;
      _c[22] = 1000;
      _c[23] = 500;
      _d[24] = 5;
      _c[24] = 500;
      _d[25] = 3;
      _c[25] = 300;
      _d[26] = 3;
      _c[26] = 300;
      _d[27] = 3;
      _d[28] = 3;
      _c[27] = 300;
      _c[28] = 300;
      _d[29] = 3;
      _d[30] = 5;
      _c[29] = 300;
      _c[30] = 500;
      _d[31] = 10;
      _d[32] = 10;
      _c[31] = 1000;
      _c[32] = 1000;
      _d[33] = 5;
      _d[34] = 3;
      _c[33] = 500;
      _c[34] = 300;
      _d[35] = 5;
      _d[36] = 3;
      _c[35] = 500;
      _d[37] = 10;
      _c[36] = 300;
      _d[38] = 3;
      _c[37] = 1000;
      _c[38] = 300;
      _d[39] = 5;
      _c[39] = 500;
      _d[40] = 5;
      _c[40] = 500;
      _d[41] = 10;
      _d[42] = 10;
      _c[41] = 1000;
      _d[43] = 3;
      _c[42] = 1000;
      _c[43] = 300;
      _d[44] = 5;
      _d[45] = 10;
      _c[44] = 500;
      _c[45] = 1000;
      _e = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   }
}
