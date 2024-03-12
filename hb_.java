final class hb_ {
   h_ _n;
   int _c;
   int _p;
   static String _l = "Search";
   static int[] _m = new int[]{1, 2, 3, 5, 10, 15, 25, 50};
   wb_[] _i;
   int _o;
   wd_ _b;
   int _j;
   int _e;
   int _k;
   int _g;
   int _d;
   int _f;
   static String _h = "Raging Beast";
   static bb_ _a;

   public static void a423(byte var0) {
      _a = null;
      if (var0 != 3) {
         a423((byte)75);
      }

      _h = null;
      _l = null;
      _m = null;
   }

   static final int[] a464(int var0) {
      int var1 = var0;

      int var2;
      for(var2 = 0; -1 != (var1 = jb_._Sb[var1]); ++var2) {
      }

      int[] var3 = new int[var2];

      for(var1 = var0; -1 != jb_._Sb[var1]; var1 = jb_._Sb[var1]) {
         --var2;
         var3[var2] = var1;
      }

      return var3;
   }

   final void a487(boolean var1) {
      this._o &= -3;
      this._p = 255;
      this._o |= 4;
      if (var1) {
         a423((byte)103);
      }

   }

   static final void a245(ec_ var0, qg_ var1, int var2) {
      oe_ var3 = new oe_();
      var3._q = var0.c474(true);
      var3._j = var0.h137(-43);
      var3._o = new pn_[var3._q];
      var3._l = new int[var3._q];
      var3._k = new byte[var3._q][][];
      var3._s = new pn_[var3._q];
      var3._r = new int[var3._q];
      var3._n = new int[var3._q];

      for(int var4 = 0; var4 < var3._q; ++var4) {
         try {
            int var5 = var0.c474(true);
            String var6;
            String var7;
            int var8;
            if (var5 != 0 && var5 != 1 && 2 != var5) {
               if (var5 == 3 || 4 == var5) {
                  var6 = var0.d738(-111);
                  var7 = var0.d738(-127);
                  var8 = var0.c474(true);
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = var0.d738(-116);
                  }

                  byte[][] var18 = new byte[var8][];
                  int var12;
                  if (3 == var5) {
                     for(int var11 = 0; var8 > var11; ++var11) {
                        var12 = var0.h137(-58);
                        var18[var11] = new byte[var12];
                        var0.a286((byte)-98, 0, var12, var18[var11]);
                     }
                  }

                  var3._n[var4] = var5;
                  Class[] var19 = new Class[var8];

                  for(var12 = 0; var8 > var12; ++var12) {
                     var19[var12] = al_.a078(var9[var12]);
                  }

                  var3._o[var4] = var1.a594(var19, al_.a078(var6), -1, var7);
                  var3._k[var4] = var18;
               }
            } else {
               var6 = var0.d738(-119);
               var7 = var0.d738(-114);
               var8 = 0;
               if (var5 == 1) {
                  var8 = var0.h137(-46);
               }

               var3._n[var4] = var5;
               var3._l[var4] = var8;
               var3._s[var4] = var1.a534(65535, al_.a078(var6), var7);
            }
         } catch (ClassNotFoundException var13) {
            var3._r[var4] = -1;
         } catch (SecurityException var14) {
            var3._r[var4] = -2;
         } catch (NullPointerException var15) {
            var3._r[var4] = -3;
         } catch (Exception var16) {
            var3._r[var4] = -4;
         } catch (Throwable var17) {
            var3._r[var4] = -5;
         }
      }

      fe_._k.a865(var3, false);
   }

   static final byte a770(char var0) {
      byte var1;
      if ((0 >= var0 || var0 >= 128) && (var0 < 160 || 255 < var0)) {
         if (8364 != var0) {
            if (8218 != var0) {
               if (402 != var0) {
                  if (var0 != 8222) {
                     if (var0 == 8230) {
                        var1 = -123;
                     } else if (var0 != 8224) {
                        if (8225 == var0) {
                           var1 = -121;
                        } else if (var0 != 710) {
                           if (8240 != var0) {
                              if (var0 != 352) {
                                 if (var0 == 8249) {
                                    var1 = -117;
                                 } else if (var0 != 338) {
                                    if (381 == var0) {
                                       var1 = -114;
                                    } else if (var0 == 8216) {
                                       var1 = -111;
                                    } else if (8217 != var0) {
                                       if (var0 != 8220) {
                                          if (var0 == 8221) {
                                             var1 = -108;
                                          } else if (8226 != var0) {
                                             if (var0 == 8211) {
                                                var1 = -106;
                                             } else if (8212 != var0) {
                                                if (var0 == 732) {
                                                   var1 = -104;
                                                } else if (8482 == var0) {
                                                   var1 = -103;
                                                } else if (353 == var0) {
                                                   var1 = -102;
                                                } else if (var0 != 8250) {
                                                   if (var0 != 339) {
                                                      if (var0 != 382) {
                                                         if (var0 == 376) {
                                                            var1 = -97;
                                                         } else {
                                                            var1 = 63;
                                                         }
                                                      } else {
                                                         var1 = -98;
                                                      }
                                                   } else {
                                                      var1 = -100;
                                                   }
                                                } else {
                                                   var1 = -101;
                                                }
                                             } else {
                                                var1 = -105;
                                             }
                                          } else {
                                             var1 = -107;
                                          }
                                       } else {
                                          var1 = -109;
                                       }
                                    } else {
                                       var1 = -110;
                                    }
                                 } else {
                                    var1 = -116;
                                 }
                              } else {
                                 var1 = -118;
                              }
                           } else {
                              var1 = -119;
                           }
                        } else {
                           var1 = -120;
                        }
                     } else {
                        var1 = -122;
                     }
                  } else {
                     var1 = -124;
                  }
               } else {
                  var1 = -125;
               }
            } else {
               var1 = -126;
            }
         } else {
            var1 = -128;
         }
      } else {
         var1 = (byte)var0;
      }

      return var1;
   }

   final void a150(int var1) {
      this._o |= 2;
      this._p = var1;
   }

   hb_(int var1, int var2) {
      this._j = var1;
      this._c = var2;
      this._n = hp_._b[this._c];
      this._p = 0;
      this._o = 0;
      if (this._n != null) {
         this._k = this._n._o;
         this._g = this._n._r;
         this._e = this._n._m;
         this._f = this._n._b;
      }

   }
}
