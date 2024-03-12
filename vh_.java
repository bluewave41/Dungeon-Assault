final class vh_ extends ne_ {
   wa_ _j;
   byte[] _i;

   final void b797() {
      this._j = null;
   }

   final void a797() {
      if (this._j == null) {
         this._j = new wa_(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         vm_ var4 = new vm_(this._i);
         int var5 = var4.a784();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.d150(var6);
            var4.b150(var6);
            var4.a150(var6);
         }

         label53:
         do {
            while(true) {
               var6 = var4.b784();
               int var7 = var4._d[var6];

               while(var4._d[var6] == var7) {
                  var4.d150(var6);
                  int var8 = var4.c137(var6);
                  if (var8 == 1) {
                     var4.e797();
                     var4.a150(var6);
                     continue label53;
                  }

                  int var9 = var8 & 240;
                  int var10;
                  int var11;
                  int var12;
                  if (var9 == 176) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var11 == 0) {
                        var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                     }

                     if (var11 == 32) {
                        var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                     }
                  }

                  if (var9 == 192) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var2[var10] = var1[var10] + var11;
                  }

                  if (var9 == 144) {
                     var10 = var8 & 15;
                     var11 = var8 >> 8 & 127;
                     var12 = var8 >> 16 & 127;
                     if (var12 > 0) {
                        int var13 = var2[var10];
                        mk_ var14 = (mk_)this._j.a722((long)var13, 8);
                        if (var14 == null) {
                           var14 = new mk_(new byte[128]);
                           this._j.a102(var14, 12460, (long)var13);
                        }

                        var14._k[var11] = 1;
                     }
                  }

                  var4.b150(var6);
                  var4.a150(var6);
               }
            }
         } while(!var4.f801());

      }
   }

   static final vh_ a109(nh_ var0, String var1, String var2) {
      byte[] var3 = var0.a826(var1, var2, (byte)-122);
      return var3 == null ? null : new vh_(new ec_(var3));
   }

   private vh_(ec_ var1) {
      var1._o = var1._m.length - 3;
      int var2 = var1.c474(true);
      int var3 = var1.k137(0);
      int var4 = 14 + var2 * 10;
      var1._o = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      int var13;
      int var14;
      int var15;
      for(var13 = 0; var13 < var2; ++var13) {
         var14 = -1;

         while(true) {
            var15 = var1.c474(true);
            if (var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if (var15 == 7) {
               break;
            }

            if (var15 == 23) {
               ++var5;
            } else if (var14 == 0) {
               ++var7;
            } else if (var14 == 1) {
               ++var8;
            } else if (var14 == 2) {
               ++var6;
            } else if (var14 == 3) {
               ++var9;
            } else if (var14 == 4) {
               ++var10;
            } else if (var14 == 5) {
               ++var11;
            } else {
               if (var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 += 5 * var5;
      var4 += 2 * (var7 + var8 + var6 + var9 + var11);
      var4 += var10 + var12;
      var13 = var1._o;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.e137(-651413500);
      }

      var4 += var1._o - var13;
      var15 = var1._o;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + var1.c474(true) & 127;
         if (var28 != 0 && var28 != 32) {
            if (var28 == 1) {
               ++var16;
            } else if (var28 == 33) {
               ++var17;
            } else if (var28 == 7) {
               ++var18;
            } else if (var28 == 39) {
               ++var19;
            } else if (var28 == 10) {
               ++var20;
            } else if (var28 == 42) {
               ++var21;
            } else if (var28 == 99) {
               ++var22;
            } else if (var28 == 98) {
               ++var23;
            } else if (var28 == 101) {
               ++var24;
            } else if (var28 == 100) {
               ++var25;
            } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = var1._o;
      var1._o += var26;
      int var31 = var1._o;
      var1._o += var11;
      int var32 = var1._o;
      var1._o += var10;
      int var33 = var1._o;
      var1._o += var9;
      int var34 = var1._o;
      var1._o += var16;
      int var35 = var1._o;
      var1._o += var18;
      int var36 = var1._o;
      var1._o += var20;
      int var37 = var1._o;
      var1._o += var7 + var8 + var11;
      int var38 = var1._o;
      var1._o += var7;
      int var39 = var1._o;
      var1._o += var27;
      int var40 = var1._o;
      var1._o += var8;
      int var41 = var1._o;
      var1._o += var17;
      int var42 = var1._o;
      var1._o += var19;
      int var43 = var1._o;
      var1._o += var21;
      int var44 = var1._o;
      var1._o += var12;
      int var45 = var1._o;
      var1._o += var9;
      int var46 = var1._o;
      var1._o += var22;
      int var47 = var1._o;
      var1._o += var23;
      int var48 = var1._o;
      var1._o += var24;
      int var49 = var1._o;
      var1._o += var25;
      int var50 = var1._o;
      var1._o += var5 * 3;
      this._i = new byte[var4];
      ec_ var51 = new ec_(this._i);
      var51.a556((byte)63, 1297377380);
      var51.a556((byte)63, 6);
      var51.i093(var2 > 1 ? 1 : 0, -117);
      var51.i093(var2, -90);
      var51.i093(var3, -125);
      var1._o = var13;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;

      label221:
      for(int var60 = 0; var60 < var2; ++var60) {
         var51.a556((byte)63, 1297379947);
         var51._o += 4;
         int var61 = var51._o;
         int var62 = -1;

         while(true) {
            while(true) {
               int var63 = var1.e137(-651413500);
               var51.e093(-268435456, var63);
               int var64 = var1._m[var29++] & 255;
               boolean var65 = var64 != var62;
               var62 = var64 & 15;
               if (var64 == 7) {
                  if (var65) {
                     var51.a093(6, 255);
                  }

                  var51.a093(6, 47);
                  var51.a093(6, 0);
                  var51.d093(1, var51._o - var61);
                  continue label221;
               }

               if (var64 == 23) {
                  if (var65) {
                     var51.a093(6, 255);
                  }

                  var51.a093(6, 81);
                  var51.a093(6, 3);
                  var51.a093(6, var1._m[var50++]);
                  var51.a093(6, var1._m[var50++]);
                  var51.a093(6, var1._m[var50++]);
               } else {
                  var52 ^= var64 >> 4;
                  if (var62 == 0) {
                     if (var65) {
                        var51.a093(6, 144 + var52);
                     }

                     var53 += var1._m[var37++];
                     var54 += var1._m[var38++];
                     var51.a093(6, var53 & 127);
                     var51.a093(6, var54 & 127);
                  } else if (var62 == 1) {
                     if (var65) {
                        var51.a093(6, 128 + var52);
                     }

                     var53 += var1._m[var37++];
                     var55 += var1._m[var40++];
                     var51.a093(6, var53 & 127);
                     var51.a093(6, var55 & 127);
                  } else if (var62 == 2) {
                     if (var65) {
                        var51.a093(6, 176 + var52);
                     }

                     var28 = var28 + var1._m[var15++] & 127;
                     var51.a093(6, var28);
                     int var66;
                     if (var28 != 0 && var28 != 32) {
                        if (var28 == 1) {
                           var66 = var1._m[var34++];
                        } else if (var28 == 33) {
                           var66 = var1._m[var41++];
                        } else if (var28 == 7) {
                           var66 = var1._m[var35++];
                        } else if (var28 == 39) {
                           var66 = var1._m[var42++];
                        } else if (var28 == 10) {
                           var66 = var1._m[var36++];
                        } else if (var28 == 42) {
                           var66 = var1._m[var43++];
                        } else if (var28 == 99) {
                           var66 = var1._m[var46++];
                        } else if (var28 == 98) {
                           var66 = var1._m[var47++];
                        } else if (var28 == 101) {
                           var66 = var1._m[var48++];
                        } else if (var28 == 100) {
                           var66 = var1._m[var49++];
                        } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                           var66 = var1._m[var39++];
                        } else {
                           var66 = var1._m[var30++];
                        }
                     } else {
                        var66 = var1._m[var44++];
                     }

                     var66 += var59[var28];
                     var59[var28] = var66;
                     var51.a093(6, var66 & 127);
                  } else if (var62 == 3) {
                     if (var65) {
                        var51.a093(6, 224 + var52);
                     }

                     var56 += var1._m[var45++];
                     var56 += var1._m[var33++] << 7;
                     var51.a093(6, var56 & 127);
                     var51.a093(6, var56 >> 7 & 127);
                  } else if (var62 == 4) {
                     if (var65) {
                        var51.a093(6, 208 + var52);
                     }

                     var57 += var1._m[var32++];
                     var51.a093(6, var57 & 127);
                  } else if (var62 == 5) {
                     if (var65) {
                        var51.a093(6, 160 + var52);
                     }

                     var53 += var1._m[var37++];
                     var58 += var1._m[var31++];
                     var51.a093(6, var53 & 127);
                     var51.a093(6, var58 & 127);
                  } else {
                     if (var62 != 6) {
                        throw new RuntimeException();
                     }

                     if (var65) {
                        var51.a093(6, 192 + var52);
                     }

                     var51.a093(6, var1._m[var44++]);
                  }
               }
            }
         }
      }

   }
}
