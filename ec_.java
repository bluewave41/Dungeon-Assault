import java.math.BigInteger;

class ec_ extends ne_ {
   int _o;
   static String _r;
   static String[] _l;
   static fb_ _i = new fb_();
   static String _q = "Basilisk";
   static q_[] _j;
   static pp_ _n;
   static int _p;
   byte[] _m;
   static nh_ _k;

   static final void a021(int var0, int var1, cn_ var2, int var3, int var4) {
      var0 += var2._A;
      var1 += var2._w;
      int var5 = var1 + gf_._i * var0;
      int var6 = 0;
      int var7 = var2._v;
      int var8 = var2._y;
      int var9 = gf_._i - var8;
      int var10 = 0;
      int var11;
      if (gf_._f > var0) {
         var11 = -var0 + gf_._f;
         var6 += var11 * var8;
         var5 += var11 * gf_._i;
         var0 = gf_._f;
         var7 -= var11;
      }

      if (gf_._j > var1) {
         var11 = gf_._j - var1;
         var5 += var11;
         var8 -= var11;
         var9 += var11;
         var6 += var11;
         var1 = gf_._j;
         var10 += var11;
      }

      if (gf_._e < var0 + var7) {
         var7 -= var7 + (var0 - gf_._e);
      }

      if (gf_._h < var8 + var1) {
         var11 = -gf_._h + var1 + var8;
         var9 += var11;
         var10 += var11;
         var8 -= var11;
      }

      if (var8 > 0 && var7 > 0) {
         if (var4 != 256) {
            qj_.a485(var3, 0, 0, var6, var2._B, var9, var4, var10, 0, 0, 0, gf_._b, var8, var5, var7);
         } else {
            he_.a651(gf_._b, 0, var7, var8, var3, 0, var9, var5, var6, var10, 0, 0, 0, var2._B);
         }

      }
   }

   final void i093(int var1, int var2) {
      this._m[this._o++] = (byte)(var1 >> 8);
      if (var2 > -84) {
         this.f137(-64);
      }

      this._m[this._o++] = (byte)var1;
   }

   private static final int a165(int var0, int var1, byte[] var2, int var3, int var4, CharSequence var5) {
      int var6 = -var1 + var0;
      int var7 = 0;
      if (var3 != -1) {
         return 1;
      } else {
         for(; var6 > var7; ++var7) {
            char var8 = var5.charAt(var7 + var1);
            if (0 < var8 && var8 < 128 || 160 <= var8 && var8 <= 255) {
               var2[var4 + var7] = (byte)var8;
            } else if (var8 != 8364) {
               if (var8 != 8218) {
                  if (402 == var8) {
                     var2[var7 + var4] = -125;
                  } else if (8222 != var8) {
                     if (var8 != 8230) {
                        if (var8 == 8224) {
                           var2[var7 + var4] = -122;
                        } else if (var8 == 8225) {
                           var2[var7 + var4] = -121;
                        } else if (var8 != 710) {
                           if (8240 != var8) {
                              if (var8 != 352) {
                                 if (8249 == var8) {
                                    var2[var4 + var7] = -117;
                                 } else if (var8 != 338) {
                                    if (var8 != 381) {
                                       if (var8 == 8216) {
                                          var2[var4 + var7] = -111;
                                       } else if (var8 != 8217) {
                                          if (var8 != 8220) {
                                             if (var8 == 8221) {
                                                var2[var4 + var7] = -108;
                                             } else if (8226 == var8) {
                                                var2[var4 + var7] = -107;
                                             } else if (var8 != 8211) {
                                                if (var8 == 8212) {
                                                   var2[var4 + var7] = -105;
                                                } else if (732 == var8) {
                                                   var2[var7 + var4] = -104;
                                                } else if (8482 != var8) {
                                                   if (var8 == 353) {
                                                      var2[var4 + var7] = -102;
                                                   } else if (8250 != var8) {
                                                      if (var8 != 339) {
                                                         if (var8 != 382) {
                                                            if (376 != var8) {
                                                               var2[var7 + var4] = 63;
                                                            } else {
                                                               var2[var4 + var7] = -97;
                                                            }
                                                         } else {
                                                            var2[var7 + var4] = -98;
                                                         }
                                                      } else {
                                                         var2[var4 + var7] = -100;
                                                      }
                                                   } else {
                                                      var2[var4 + var7] = -101;
                                                   }
                                                } else {
                                                   var2[var7 + var4] = -103;
                                                }
                                             } else {
                                                var2[var7 + var4] = -106;
                                             }
                                          } else {
                                             var2[var7 + var4] = -109;
                                          }
                                       } else {
                                          var2[var4 + var7] = -110;
                                       }
                                    } else {
                                       var2[var7 + var4] = -114;
                                    }
                                 } else {
                                    var2[var7 + var4] = -116;
                                 }
                              } else {
                                 var2[var4 + var7] = -118;
                              }
                           } else {
                              var2[var7 + var4] = -119;
                           }
                        } else {
                           var2[var4 + var7] = -120;
                        }
                     } else {
                        var2[var4 + var7] = -123;
                     }
                  } else {
                     var2[var7 + var4] = -124;
                  }
               } else {
                  var2[var7 + var4] = -126;
               }
            } else {
               var2[var4 + var7] = -128;
            }
         }

         return var6;
      }
   }

   final void a093(int var1, int var2) {
      if (var1 != 6) {
         this.e093(-27, -85);
      }

      this._m[this._o++] = (byte)var2;
   }

   final void a884(long var1, int var3) {
      this._m[this._o++] = (byte)((int)(var1 >> 32));
      this._m[this._o++] = (byte)((int)(var1 >> 24));
      this._m[this._o++] = (byte)((int)(var1 >> 16));
      this._m[this._o++] = (byte)((int)(var1 >> 8));
      this._m[this._o++] = (byte)((int)var1);
      if (var3 != 836) {
         this.c093(-37, -35);
      }

   }

   final void a041(int[] var1, boolean var2) {
      int var3 = this._o / 8;
      this._o = 0;
      int var4 = 0;
      if (!var2) {
         _n = (pp_)null;
      }

      while(var3 > var4) {
         int var5 = this.h137(-56);
         int var6 = this.h137(-54);
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 >>> 5 ^ var5 << 4) ^ var1[1138753539 & var7 >>> 11] + var7) {
            var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var1[3 & var7] + var7;
            var7 += var8;
         }

         this._o -= 8;
         this.a556((byte)63, var5);
         this.a556((byte)63, var6);
         ++var4;
      }

   }

   final void a627(String var1, byte var2) {
      long var3 = 0L;
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 19; var8 >= 0; --var8) {
         var3 *= 38L;
         if (var7 > var8) {
            char var9 = var1.charAt(var8);
            if (var9 >= 'A' && 'Z' >= var9) {
               var3 += (long)(var9 - 63);
            } else if ('a' <= var9 && 'z' >= var9) {
               var3 += (long)(2 + var9 - 97);
            } else if (var9 >= '0' && '9' >= var9) {
               var3 += (long)(28 + var9 - 48);
            } else {
               ++var3;
            }
         }

         if (var8 == 10) {
            var5 = var3;
            var3 = 0L;
         }
      }

      this.a157(var3, (byte)-123);
      this.a157(var5, (byte)-104);
      if (var2 <= 84) {
         this.c411((byte)18);
      }

   }

   private final void a157(long var1, byte var3) {
      this._m[this._o++] = (byte)((int)(var1 >> 48));
      this._m[this._o++] = (byte)((int)(var1 >> 40));
      this._m[this._o++] = (byte)((int)(var1 >> 32));
      this._m[this._o++] = (byte)((int)(var1 >> 24));
      this._m[this._o++] = (byte)((int)(var1 >> 16));
      if (var3 >= -26) {
         _l = (String[])null;
      }

      this._m[this._o++] = (byte)((int)(var1 >> 8));
      this._m[this._o++] = (byte)((int)var1);
   }

   final void g093(int var1, int var2) {
      if (var1 != 3) {
         _p = 126;
      }

      while(this._o < var2) {
         this._m[this._o++] = 0;
      }

   }

   static final q_ g102(int var0) {
      q_ var1 = new q_(ce_._x, tb_._i, hg_._t[0], fe_._g[0], jc_._f[var0], jn_._k[0], ub_._q[0], uo_._b);
      sb_.a150();
      return var1;
   }

   final long b411(byte var1) {
      long var3 = (long)this.f137(-112) & 4294967295L;
      long var5 = 4294967295L & (long)this.h137(-111);
      return (var3 << 32) + var5;
   }

   final void a054(int var1, long var2) {
      this._m[this._o++] = (byte)((int)(var2 >> 56));
      this._m[this._o++] = (byte)((int)(var2 >> 48));
      this._m[this._o++] = (byte)((int)(var2 >> 40));
      this._m[this._o++] = (byte)((int)(var2 >> 32));
      this._m[this._o++] = (byte)((int)(var2 >> 24));
      this._m[this._o++] = (byte)((int)(var2 >> 16));
      this._m[this._o++] = (byte)((int)(var2 >> 8));
      this._m[this._o++] = (byte)((int)var2);
      if (var1 <= 26) {
         this.k137(3);
      }

   }

   public static void i150() {
      _n = null;
      _k = null;
      _r = null;
      _l = null;
      _i = null;
      _q = null;
      _j = null;
   }

   final int h137(int var1) {
      if (var1 > -29) {
         this.f137(30);
      }

      this._o += 4;
      return (this._m[this._o - 2] << 8 & '\uff00') + ((this._m[this._o - 3] & 255) << 16) + (this._m[this._o - 4] << 24 & -16777216) + (this._m[this._o - 1] & 255);
   }

   final int e410(byte var1) {
      this._o += 3;
      int var3 = (this._m[this._o - 1] & 255) + ((this._m[this._o - 3] & 255) << 16) + ((this._m[this._o - 2] & 255) << 8);
      if (var3 > 8388607) {
         var3 -= 16777216;
      }

      return var3;
   }

   final void f093(int var1, int var2) {
      if (var1 < ~var2 && var2 >= -64) {
         this.a093(6, 64 + var2);
      } else if (var2 < 16384 && -16384 <= var2) {
         this.i093(var2 + '쀀', -104);
      } else {
         throw new IllegalArgumentException();
      }
   }

   final String a738(int var1) {
      byte var2 = this._m[this._o++];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this._o;
         if (var1 != -21030) {
            _p = 56;
         }

         while(0 != this._m[this._o++]) {
         }

         int var4 = this._o - var3 - 1;
         return 0 == var4 ? "" : mk_.a046(this._m, var4, var3);
      }
   }

   final void a286(byte var1, int var2, int var3, byte[] var4) {
      for(int var5 = var2; var2 + var3 > var5; ++var5) {
         var4[var5] = this._m[this._o++];
      }

      if (var1 >= -86) {
         this._m = (byte[])null;
      }

   }

   static final void a302(nh_ var0, boolean var1) {
      d_._d = var0;
      byte[] var2 = gm_.a728("text_game_name", false);
      if (var2 != null) {
         ba_._h = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_benefits,0", false);
      if (var2 != null) {
         qk_._b[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_benefits,1", false);
      if (null != var2) {
         qk_._b[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_benefits,2", false);
      if (var2 != null) {
         qk_._b[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_benefits,3", false);
      if (null != var2) {
         qk_._b[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,0", false);
      if (null != var2) {
         ce_._o[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,1", var1);
      if (var2 != null) {
         ce_._o[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,2", false);
      if (var2 != null) {
         ce_._o[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,3", false);
      if (var2 != null) {
         ce_._o[3] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,4", var1);
      if (var2 != null) {
         ce_._o[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,5", var1);
      if (null != var2) {
         ce_._o[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,6", false);
      if (null != var2) {
         ce_._o[6] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,7", false);
      if (var2 != null) {
         ce_._o[7] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,8", false);
      if (var2 != null) {
         ce_._o[8] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,9", false);
      if (var2 != null) {
         ce_._o[9] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,10", var1);
      if (var2 != null) {
         ce_._o[10] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,11", var1);
      if (var2 != null) {
         ce_._o[11] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,12", false);
      if (null != var2) {
         ce_._o[12] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,13", false);
      if (var2 != null) {
         ce_._o[13] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,14", false);
      if (null != var2) {
         ce_._o[14] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,15", false);
      if (null != var2) {
         ce_._o[15] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,16", false);
      if (null != var2) {
         ce_._o[16] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,17", false);
      if (var2 != null) {
         ce_._o[17] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,18", var1);
      if (null != var2) {
         ce_._o[18] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,19", false);
      if (var2 != null) {
         ce_._o[19] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,20", false);
      if (var2 != null) {
         ce_._o[20] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,21", false);
      if (null != var2) {
         ce_._o[21] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,22", false);
      if (var2 != null) {
         ce_._o[22] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,23", false);
      if (null != var2) {
         ce_._o[23] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,24", false);
      if (null != var2) {
         ce_._o[24] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,25", false);
      if (null != var2) {
         ce_._o[25] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,26", false);
      if (null != var2) {
         ce_._o[26] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,27", var1);
      if (var2 != null) {
         ce_._o[27] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,28", false);
      if (null != var2) {
         ce_._o[28] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,29", false);
      if (null != var2) {
         ce_._o[29] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,30", var1);
      if (var2 != null) {
         ce_._o[30] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,31", var1);
      if (var2 != null) {
         ce_._o[31] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,32", false);
      if (null != var2) {
         ce_._o[32] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,33", false);
      if (var2 != null) {
         ce_._o[33] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,34", false);
      if (var2 != null) {
         ce_._o[34] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,35", var1);
      if (var2 != null) {
         ce_._o[35] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,36", false);
      if (var2 != null) {
         ce_._o[36] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,37", false);
      if (null != var2) {
         ce_._o[37] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,38", var1);
      if (null != var2) {
         ce_._o[38] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,39", var1);
      if (var2 != null) {
         ce_._o[39] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,40", var1);
      if (null != var2) {
         ce_._o[40] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,41", false);
      if (var2 != null) {
         ce_._o[41] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,42", false);
      if (var2 != null) {
         ce_._o[42] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,43", false);
      if (null != var2) {
         ce_._o[43] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_names,44", false);
      if (var2 != null) {
         ce_._o[44] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_names,45", var1);
      if (null != var2) {
         ce_._o[45] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,0", false);
      if (var2 != null) {
         bb_._k[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,1", false);
      if (null != var2) {
         bb_._k[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,2", false);
      if (null != var2) {
         bb_._k[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,3", false);
      if (var2 != null) {
         bb_._k[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,4", var1);
      if (null != var2) {
         bb_._k[4] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,5", var1);
      if (var2 != null) {
         bb_._k[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,6", false);
      if (null != var2) {
         bb_._k[6] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,7", false);
      if (var2 != null) {
         bb_._k[7] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,8", false);
      if (var2 != null) {
         bb_._k[8] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,9", false);
      if (var2 != null) {
         bb_._k[9] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,10", var1);
      if (null != var2) {
         bb_._k[10] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,11", var1);
      if (var2 != null) {
         bb_._k[11] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,12", false);
      if (null != var2) {
         bb_._k[12] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,13", false);
      if (null != var2) {
         bb_._k[13] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,14", var1);
      if (null != var2) {
         bb_._k[14] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,15", false);
      if (null != var2) {
         bb_._k[15] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,16", false);
      if (var2 != null) {
         bb_._k[16] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,17", false);
      if (var2 != null) {
         bb_._k[17] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,18", false);
      if (null != var2) {
         bb_._k[18] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,19", false);
      if (var2 != null) {
         bb_._k[19] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,20", false);
      if (null != var2) {
         bb_._k[20] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,21", false);
      if (null != var2) {
         bb_._k[21] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,22", false);
      if (var2 != null) {
         bb_._k[22] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,23", false);
      if (var2 != null) {
         bb_._k[23] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,24", false);
      if (null != var2) {
         bb_._k[24] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,25", var1);
      if (null != var2) {
         bb_._k[25] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,26", false);
      if (var2 != null) {
         bb_._k[26] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,27", false);
      if (var2 != null) {
         bb_._k[27] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,28", false);
      if (var2 != null) {
         bb_._k[28] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,29", var1);
      if (null != var2) {
         bb_._k[29] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,30", false);
      if (var2 != null) {
         bb_._k[30] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,31", false);
      if (var2 != null) {
         bb_._k[31] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,32", false);
      if (null != var2) {
         bb_._k[32] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,33", false);
      if (var2 != null) {
         bb_._k[33] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,34", false);
      if (null != var2) {
         bb_._k[34] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,35", false);
      if (var2 != null) {
         bb_._k[35] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,36", false);
      if (var2 != null) {
         bb_._k[36] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,37", false);
      if (null != var2) {
         bb_._k[37] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,38", false);
      if (var2 != null) {
         bb_._k[38] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,39", false);
      if (var2 != null) {
         bb_._k[39] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,40", false);
      if (var2 != null) {
         bb_._k[40] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("achievement_criteria,41", false);
      if (var2 != null) {
         bb_._k[41] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,42", false);
      if (null != var2) {
         bb_._k[42] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,43", false);
      if (null != var2) {
         bb_._k[43] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,44", false);
      if (var2 != null) {
         bb_._k[44] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_criteria,45", var1);
      if (null != var2) {
         bb_._k[45] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("intro_captions,0", false);
      if (var2 != null) {
         qh_._J[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("intro_captions,1", false);
      if (null != var2) {
         qh_._J[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("intro_captions,2", false);
      if (null != var2) {
         qh_._J[2] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("intro_captions,3", var1);
      if (null != var2) {
         qh_._J[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("intro_captions,4", false);
      if (null != var2) {
         qh_._J[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("intro_captions,5", false);
      if (var2 != null) {
         qh_._J[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("intro_captions,6", false);
      if (var2 != null) {
         qh_._J[6] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("intro_captions,7", var1);
      if (var2 != null) {
         qh_._J[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("intro_captions,8", false);
      if (var2 != null) {
         qh_._J[8] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("instructions_pages,0", false);
      if (var2 != null) {
         en_._a[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("instructions_pages,1", var1);
      if (null != var2) {
         en_._a[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_pages,2", var1);
      if (null != var2) {
         en_._a[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_pages,3", false);
      if (var2 != null) {
         en_._a[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_pages,4", false);
      if (null != var2) {
         en_._a[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_pages,5", false);
      if (var2 != null) {
         en_._a[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_pages,6", false);
      if (var2 != null) {
         en_._a[6] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("instructions_pages,7", var1);
      if (var2 != null) {
         en_._a[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_monsterroom", false);
      if (var2 != null) {
         uj_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_traproom", false);
      if (null != var2) {
         an_._D = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("instructions_guardianroom", false);
      if (var2 != null) {
         sg_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_subtitles_text,0", false);
      if (null != var2) {
         ie_._j[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_subtitles_text,1", false);
      if (null != var2) {
         ie_._j[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_subtitles_text,2", false);
      if (var2 != null) {
         ie_._j[2] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("instructions_subtitles_text,3", var1);
      if (null != var2) {
         ie_._j[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_subtitles_text,4", false);
      if (var2 != null) {
         ie_._j[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_subtitles_text,5", false);
      if (var2 != null) {
         ie_._j[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_subtitles_text,6", var1);
      if (null != var2) {
         ie_._j[6] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("instructions_subtitles_text,7", false);
      if (var2 != null) {
         ie_._j[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_welcome1,0", false);
      if (var2 != null) {
         bh_._J[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_welcome1,1", false);
      if (var2 != null) {
         bh_._J[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_welcome2,0", var1);
      if (null != var2) {
         nf_._C[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_welcome2,1", false);
      if (null != var2) {
         nf_._C[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_raiding1,1", var1);
      if (null != var2) {
         rl_._e[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_raiding2,0", var1);
      if (null != var2) {
         co_._J[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_raiding2,1", false);
      if (var2 != null) {
         co_._J[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_raiders1,1", false);
      if (var2 != null) {
         p_._J[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_raiders2,1", var1);
      if (null != var2) {
         je_._f[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_raiders3,1", var1);
      if (var2 != null) {
         og_._a[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_raiders4,0", false);
      if (null != var2) {
         h_._y[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_raiders4,1", false);
      if (var2 != null) {
         h_._y[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_rooms1,0", var1);
      if (null != var2) {
         pp_._E[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_rooms1,1", var1);
      if (null != var2) {
         pp_._E[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_rooms2,1", var1);
      if (var2 != null) {
         np_._C[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_firstroom1a,0", var1);
      if (var2 != null) {
         eg_._b[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_firstroom1a,1", var1);
      if (null != var2) {
         eg_._b[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_firstroom1b,0", false);
      if (null != var2) {
         bn_._m[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_firstroom1b,1", false);
      if (var2 != null) {
         bn_._m[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_firstroom2,1", false);
      if (var2 != null) {
         lp_._q[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_monster1,0", var1);
      if (var2 != null) {
         rl_._i[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_monster1,1", false);
      if (null != var2) {
         rl_._i[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_monster2,1", false);
      if (var2 != null) {
         lb_._d[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_monster3,1", false);
      if (var2 != null) {
         le_._c[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_strategies1,0", var1);
      if (null != var2) {
         tp_._C[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_strategies1,1", false);
      if (null != var2) {
         tp_._C[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_strategies2,1", false);
      if (var2 != null) {
         lp_._F[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_strategies3,1", false);
      if (null != var2) {
         nl_._f[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_strategies4,1", false);
      if (null != var2) {
         ll_._j[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_trap1,0", false);
      if (null != var2) {
         bb_._t[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_trap1,1", false);
      if (var2 != null) {
         bb_._t[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_trap2,1", false);
      if (null != var2) {
         ka_._d[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_guardian1,0", false);
      if (var2 != null) {
         eh_._e[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_guardian1,1", false);
      if (null != var2) {
         eh_._e[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_guardian2,1", var1);
      if (var2 != null) {
         bk_._f[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_victory,0", false);
      if (var2 != null) {
         hj_._O[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_victory,1", false);
      if (var2 != null) {
         hj_._O[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_defeat,0", false);
      if (var2 != null) {
         ek_._j[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_defeat,1", var1);
      if (null != var2) {
         ek_._j[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_defeat_repeated,0", var1);
      if (null != var2) {
         rm_._S[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_defeat_repeated,1", var1);
      if (null != var2) {
         rm_._S[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_death,0", false);
      if (null != var2) {
         wl_._c[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_death,1", var1);
      if (var2 != null) {
         wl_._c[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_hoardroom,0", false);
      if (null != var2) {
         ha_._j[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_hoardroom,1", false);
      if (null != var2) {
         ha_._j[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_abilities,0", false);
      if (null != var2) {
         qa_._e[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_abilities,1", false);
      if (var2 != null) {
         qa_._e[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_modifiers,0", var1);
      if (var2 != null) {
         tl_._m[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_modifiers,1", var1);
      if (var2 != null) {
         tl_._m[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_raid_complete,0", false);
      if (null != var2) {
         ug_._M[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_raid_complete,1", false);
      if (var2 != null) {
         ug_._M[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_construction1,0", var1);
      if (var2 != null) {
         qh_._E[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_construction1,1", false);
      if (null != var2) {
         qh_._E[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_construction2,1", false);
      if (null != var2) {
         dg_._O[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_placeroom1,1", false);
      if (var2 != null) {
         tg_._e[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_placeroom2,1", var1);
      if (null != var2) {
         uo_._g[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_stable1,0", false);
      if (null != var2) {
         hh_._n[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_stable1,1", false);
      if (null != var2) {
         hh_._n[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_stable2,1", false);
      if (null != var2) {
         fj_._a[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_stable3,1", false);
      if (null != var2) {
         k_._a[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_stable_noraider,1", false);
      if (var2 != null) {
         rn_._g[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_end_justplay,0", var1);
      if (null != var2) {
         kg_._e[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_end_justplay,1", false);
      if (var2 != null) {
         kg_._e[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_dragonsofrenown1,0", false);
      if (var2 != null) {
         vf_._A[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_dragonsofrenown1,1", var1);
      if (var2 != null) {
         vf_._A[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_dragonsofrenown2,1", false);
      if (var2 != null) {
         qd_._e[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_dragonsofrenown3,1", false);
      if (var2 != null) {
         rk_._k[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_dragonsofrenown4,1", false);
      if (null != var2) {
         un_._b[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tutorial_selectraiders,1", var1);
      if (var2 != null) {
         tp_._A[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tutorial_justplay_warning", var1);
      if (null != var2) {
         ub_._r = dj_.a064(var2, false);
      }

      var2 = gm_.a728("goblin_runt", var1);
      if (null != var2) {
         d_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("saurus_spawn", false);
      if (null != var2) {
         ng_._J = dj_.a064(var2, false);
      }

      var2 = gm_.a728("goblin_cleaver", false);
      if (null != var2) {
         ub_._l = dj_.a064(var2, false);
      }

      var2 = gm_.a728("orc_warrior", false);
      if (null != var2) {
         gj_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("witch", false);
      if (var2 != null) {
         ml_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("beastman", var1);
      if (null != var2) {
         DungeonAssault._J = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("saurus_slink", false);
      if (var2 != null) {
         fb_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("mercenary_knight", false);
      if (var2 != null) {
         jl_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("priest", false);
      if (null != var2) {
         jk_._Cb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("orc_blademaster", false);
      if (null != var2) {
         dc_._H = dj_.a064(var2, false);
      }

      var2 = gm_.a728("goblin_scout", false);
      if (null != var2) {
         dn_._W = dj_.a064(var2, false);
      }

      var2 = gm_.a728("necromancer", false);
      if (null != var2) {
         df_._g = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ogre_thug", false);
      if (var2 != null) {
         lf_._v = dj_.a064(var2, false);
      }

      var2 = gm_.a728("enchantress", false);
      if (null != var2) {
         ok_._jb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("saurus_warrior", false);
      if (null != var2) {
         sd_._I = dj_.a064(var2, false);
      }

      var2 = gm_.a728("orc_shaman", false);
      if (null != var2) {
         ik_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("cave_troll", false);
      if (var2 != null) {
         ua_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("northman_ranger", false);
      if (var2 != null) {
         oa_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("dwarf_renegade", false);
      if (null != var2) {
         ae_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("thief", false);
      if (null != var2) {
         o_._l = dj_.a064(var2, false);
      }

      var2 = gm_.a728("zealot", false);
      if (var2 != null) {
         bo_._Mb = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("dark_elf_assassin", false);
      if (var2 != null) {
         op_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("berserker", false);
      if (null != var2) {
         lf_._p = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ogre_brute", false);
      if (var2 != null) {
         sp_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("spy", false);
      if (var2 != null) {
         hp_._d = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("shapeshifter", false);
      if (null != var2) {
         mp_._g = dj_.a064(var2, false);
      }

      var2 = gm_.a728("black_knight", var1);
      if (var2 != null) {
         ro_._m = dj_.a064(var2, false);
      }

      var2 = gm_.a728("minotaur", false);
      if (var2 != null) {
         uf_._c = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("warlock", false);
      if (null != var2) {
         kf_._i = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("death_knight", var1);
      if (var2 != null) {
         e_._k = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("chaos_champion", false);
      if (var2 != null) {
         ih_._v = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("centaur", false);
      if (var2 != null) {
         gh_._e = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("daemonette", false);
      if (var2 != null) {
         sg_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("dryad", false);
      if (null != var2) {
         lm_._r = dj_.a064(var2, false);
      }

      var2 = gm_.a728("none", false);
      if (null != var2) {
         ic_._A = dj_.a064(var2, false);
      }

      var2 = gm_.a728("unknown", false);
      if (var2 != null) {
         ie_._n = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("hoard", false);
      if (null != var2) {
         cm_._S = dj_.a064(var2, false);
      }

      var2 = gm_.a728("entrance", var1);
      if (null != var2) {
         wi_._mb = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("pit", false);
      if (var2 != null) {
         go_._F = dj_.a064(var2, false);
      }

      var2 = gm_.a728("snakes", var1);
      if (var2 != null) {
         ce_._m = dj_.a064(var2, false);
      }

      var2 = gm_.a728("nails", false);
      if (var2 != null) {
         i_._w = dj_.a064(var2, false);
      }

      var2 = gm_.a728("hidden_pit", false);
      if (null != var2) {
         oh_._q = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("teleport", var1);
      if (var2 != null) {
         ld_._h = dj_.a064(var2, false);
      }

      var2 = gm_.a728("hidden_nails", var1);
      if (null != var2) {
         nm_._mb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("bottomless_pit", false);
      if (null != var2) {
         dd_._z = dj_.a064(var2, false);
      }

      var2 = gm_.a728("crusher", false);
      if (null != var2) {
         ll_._u = dj_.a064(var2, false);
      }

      var2 = gm_.a728("hidden_darts", false);
      if (var2 != null) {
         sm_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("whirling_blades", false);
      if (null != var2) {
         fg_._o = dj_.a064(var2, false);
      }

      var2 = gm_.a728("poison_gas", false);
      if (null != var2) {
         ea_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("giant_rats", false);
      if (null != var2) {
         cp_._O = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("rot_worms", false);
      if (null != var2) {
         cb_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("troglodytes", false);
      if (null != var2) {
         jb_._Ub = dj_.a064(var2, false);
      }

      var2 = gm_.a728("giant_snake", false);
      if (var2 != null) {
         wi_._rb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("giant_spider", false);
      if (null != var2) {
         pd_._G = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("skeleton_sentinels", false);
      if (var2 != null) {
         hg_._p = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("corrosive_slime", false);
      if (null != var2) {
         gi_._P = dj_.a064(var2, false);
      }

      var2 = gm_.a728("razor_construct", var1);
      if (var2 != null) {
         jj_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("rabid_wolf", var1);
      if (var2 != null) {
         g_._Kb = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("vampire_bats", false);
      if (var2 != null) {
         sf_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("imp", var1);
      if (var2 != null) {
         jb_._Vb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("stone_golem", false);
      if (var2 != null) {
         wf_._v = dj_.a064(var2, false);
      }

      var2 = gm_.a728("spectre", false);
      if (null != var2) {
         ih_._s = dj_.a064(var2, false);
      }

      var2 = gm_.a728("banshee", false);
      if (var2 != null) {
         cc_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("raging_beast", var1);
      if (null != var2) {
         hb_._h = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("basilisk", var1);
      if (null != var2) {
         _q = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("pit_demon", false);
      if (null != var2) {
         kk_._i = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("vampire_lord", false);
      if (null != var2) {
         ea_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("hell_beast", false);
      if (var2 != null) {
         kf_._q = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("demon_lord", false);
      if (var2 != null) {
         gj_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tripwire_bell", var1);
      if (var2 != null) {
         mi_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("hall_of_glass", var1);
      if (null != var2) {
         nj_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("magical_guardian_room", false);
      if (null != var2) {
         ll_._s = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_goblin_runt", false);
      if (var2 != null) {
         nm_._lb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_saurus_spawn", false);
      if (var2 != null) {
         a_._p = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_goblin_cleaver", false);
      if (null != var2) {
         mm_._m = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_orc_warrior", false);
      if (var2 != null) {
         fm_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_witch", var1);
      if (var2 != null) {
         fj_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_beastman", false);
      if (null != var2) {
         gh_._j = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_saurus_slink", false);
      if (var2 != null) {
         in_._t = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_mercenary_knight", false);
      if (null != var2) {
         hj_._ab = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_priest", false);
      if (null != var2) {
         fc_._h = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_orc_blademaster", var1);
      if (var2 != null) {
         tb_._h = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_goblin_scout", false);
      if (null != var2) {
         uc_._Q = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_necromancer", false);
      if (var2 != null) {
         lg_._r = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_ogre_thug", false);
      if (null != var2) {
         ba_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_enchantress", false);
      if (var2 != null) {
         a_._l = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_saurus_warrior", false);
      if (null != var2) {
         df_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_orc_shaman", false);
      if (var2 != null) {
         ik_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_cave_troll", var1);
      if (null != var2) {
         h_._n = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_northman_ranger", false);
      if (var2 != null) {
         oe_._p = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_dwarf_renegade", false);
      if (var2 != null) {
         ta_._h = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_thief", false);
      if (var2 != null) {
         ai_._k = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_zealot", false);
      if (var2 != null) {
         pk_._q = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_dark_elf_assassin", false);
      if (var2 != null) {
         he_._r = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_berserker", var1);
      if (var2 != null) {
         gh_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_ogre_brute", false);
      if (var2 != null) {
         dk_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_spy", false);
      if (var2 != null) {
         hc_._g = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_shapeshifter", var1);
      if (var2 != null) {
         eb_._M = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_black_knight", false);
      if (var2 != null) {
         ql_._l = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_minotaur", false);
      if (var2 != null) {
         jm_._g = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_warlock", false);
      if (null != var2) {
         qi_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_death_knight", false);
      if (null != var2) {
         kj_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_chaos_champion", false);
      if (null != var2) {
         no_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_centaur", false);
      if (null != var2) {
         oo_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_daemonette", var1);
      if (var2 != null) {
         vk_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_dryad", var1);
      if (var2 != null) {
         jd_._n = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_none", false);
      if (var2 != null) {
         nh_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_unknown", false);
      if (var2 != null) {
         s_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_pit", false);
      if (null != var2) {
         um_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_snakes", false);
      if (var2 != null) {
         fj_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_nails", false);
      if (null != var2) {
         fn_._j = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_hidden_pit", false);
      if (var2 != null) {
         bh_._L = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_teleport", false);
      if (var2 != null) {
         to_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_hidden_nails", var1);
      if (var2 != null) {
         hl_._j = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_bottomless_pit", var1);
      if (var2 != null) {
         fa_._k = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_crusher", false);
      if (var2 != null) {
         dm_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_hidden_darts", false);
      if (var2 != null) {
         e_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_whirling_blades", false);
      if (var2 != null) {
         nb_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_poison_gas", var1);
      if (var2 != null) {
         cp_._P = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_giant_rats", false);
      if (null != var2) {
         il_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_rot_worms", false);
      if (null != var2) {
         ul_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_troglodytes", false);
      if (var2 != null) {
         rn_._f = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_giant_snake", false);
      if (var2 != null) {
         ke_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_giant_spider", false);
      if (var2 != null) {
         li_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_skeleton_sentinels", false);
      if (null != var2) {
         tn_._Y = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_corrosive_slime", false);
      if (null != var2) {
         bc_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_razor_construct", var1);
      if (null != var2) {
         qh_._D = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_rabid_wolf", false);
      if (var2 != null) {
         f_._e = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_vampire_bats", false);
      if (var2 != null) {
         ed_._R = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_imp", var1);
      if (var2 != null) {
         ti_._n = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_stone_golem", false);
      if (var2 != null) {
         wi_._lb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_spectre", var1);
      if (var2 != null) {
         om_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_banshee", false);
      if (var2 != null) {
         mj_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_raging_beast", var1);
      if (var2 != null) {
         pe_._k = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_basilisk", var1);
      if (var2 != null) {
         jm_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_pit_demon", false);
      if (var2 != null) {
         sj_._eb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_vampire_lord", false);
      if (null != var2) {
         an_._x = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_hell_beast", false);
      if (null != var2) {
         sm_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_demon_lord", var1);
      if (null != var2) {
         fg_._f = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_tripwire_bell", var1);
      if (null != var2) {
         jb_._Nb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("desc_hall_of_glass", false);
      if (null != var2) {
         tg_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("desc_magical_guardian_room", false);
      if (null != var2) {
         ic_._z = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tip_nails", false);
      if (null != var2) {
         gm_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_teleport", false);
      if (var2 != null) {
         ek_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_hidden_nails", var1);
      if (null != var2) {
         dl_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_bottomless_pit", var1);
      if (var2 != null) {
         nf_._w = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tip_lethal", var1);
      if (var2 != null) {
         dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_hidden_darts", false);
      if (var2 != null) {
         fb_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_whirling_blades", false);
      if (null != var2) {
         ho_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_rot_worms", false);
      if (null != var2) {
         vc_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_skeleton_sentinels", var1);
      if (var2 != null) {
         lb_._x = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_corrosive_slime", false);
      if (var2 != null) {
         fm_._l = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_razor_construct", false);
      if (var2 != null) {
         ub_._m = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_rabid_wolf", false);
      if (var2 != null) {
         lg_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_vampire_bats", false);
      if (var2 != null) {
         df_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tip_stone_golem", false);
      if (null != var2) {
         ko_._w = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_spectre", var1);
      if (null != var2) {
         qm_._p = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_banshee", var1);
      if (var2 != null) {
         eb_._L = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("tip_vampire_lord", false);
      if (var2 != null) {
         ai_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_demon_lord", var1);
      if (var2 != null) {
         tk_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_tripwire_bell", false);
      if (var2 != null) {
         hl_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_hall_of_glass", var1);
      if (var2 != null) {
         eg_._g = dj_.a064(var2, false);
      }

      var2 = gm_.a728("tip_magical_guardian_room", false);
      if (var2 != null) {
         ii_._J = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_pitimmunity,0", false);
      if (var2 != null) {
         ao_._i[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_pitimmunity,1", false);
      if (null != var2) {
         ao_._i[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_boostdef,0", var1);
      if (var2 != null) {
         bo_._Gb[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_boostdef,1", false);
      if (var2 != null) {
         bo_._Gb[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_boostsneak,0", false);
      if (null != var2) {
         oa_._g[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_boostsneak,1", false);
      if (null != var2) {
         oa_._g[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_tough,0", var1);
      if (null != var2) {
         vc_._d[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_tough,1", false);
      if (var2 != null) {
         vc_._d[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_retreat,0", false);
      if (var2 != null) {
         up_._c[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_retreat,1", var1);
      if (var2 != null) {
         up_._c[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_sacrifice_green,0", false);
      if (var2 != null) {
         lg_._d[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_sacrifice_green,1", false);
      if (null != var2) {
         lg_._d[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_thief,0", var1);
      if (null != var2) {
         qj_._f[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_thief,1", false);
      if (var2 != null) {
         qj_._f[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_summon,0", var1);
      if (var2 != null) {
         jm_._a[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_summon,1", false);
      if (var2 != null) {
         jm_._a[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_revive,0", var1);
      if (var2 != null) {
         hh_._h[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_revive,1", false);
      if (null != var2) {
         hh_._h[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_circumvent,0", false);
      if (var2 != null) {
         ja_._d[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_circumvent,1", false);
      if (null != var2) {
         ja_._d[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_scout,0", false);
      if (var2 != null) {
         li_._f[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_scout,1", false);
      if (null != var2) {
         li_._f[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_spy,0", false);
      if (null != var2) {
         sp_._g[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_spy,1", false);
      if (var2 != null) {
         sp_._g[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_glamour,0", false);
      if (null != var2) {
         hj_._P[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_glamour,1", false);
      if (null != var2) {
         hj_._P[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_intimidate,0", var1);
      if (null != var2) {
         rf_._N[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_intimidate,1", var1);
      if (null != var2) {
         rf_._N[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_ferocity,0", false);
      if (var2 != null) {
         ll_._t[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_ferocity,1", false);
      if (null != var2) {
         ll_._t[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_firststrike,0", var1);
      if (null != var2) {
         an_._F[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_firststrike,1", false);
      if (null != var2) {
         an_._F[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fragility,0", false);
      if (var2 != null) {
         ob_._oc[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fragility,1", false);
      if (var2 != null) {
         ob_._oc[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_armoured,0", false);
      if (var2 != null) {
         np_._z[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_armoured,1", var1);
      if (var2 != null) {
         np_._z[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fireimmunity,0", false);
      if (null != var2) {
         qp_._f[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fireimmunity,1", false);
      if (var2 != null) {
         qp_._f[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_immortal,0", false);
      if (var2 != null) {
         vb_._b[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_immortal,1", false);
      if (null != var2) {
         vb_._b[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_chaos_champion,0", false);
      if (null != var2) {
         ob_._Rb[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_chaos_champion,1", false);
      if (var2 != null) {
         ob_._Rb[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fickle,0", var1);
      if (null != var2) {
         pm_._k[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_fickle,1", false);
      if (null != var2) {
         pm_._k[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_redistribute,0", false);
      if (var2 != null) {
         j_._S[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_redistribute,1", var1);
      if (var2 != null) {
         j_._S[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_pitimmunity_brief,0", var1);
      if (null != var2) {
         ne_._f[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_pitimmunity_brief,1", false);
      if (null != var2) {
         ne_._f[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_boostdef_brief,0", false);
      if (var2 != null) {
         ha_._l[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_boostdef_brief,1", false);
      if (var2 != null) {
         ha_._l[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_boostsneak_brief,0", false);
      if (var2 != null) {
         rp_._b[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_boostsneak_brief,1", false);
      if (var2 != null) {
         rp_._b[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_tough_brief,0", false);
      if (var2 != null) {
         rk_._f[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_tough_brief,1", false);
      if (null != var2) {
         rk_._f[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_retreat_brief,0", false);
      if (var2 != null) {
         bj_._H[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_retreat_brief,1", false);
      if (null != var2) {
         bj_._H[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_sacrifice_green_brief,0", false);
      if (var2 != null) {
         bb_._l[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_sacrifice_green_brief,1", false);
      if (null != var2) {
         bb_._l[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_thief_brief,0", false);
      if (var2 != null) {
         al_._i[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_thief_brief,1", false);
      if (null != var2) {
         al_._i[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_summon_brief,0", false);
      if (var2 != null) {
         hk_._d[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_summon_brief,1", false);
      if (var2 != null) {
         hk_._d[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_revive_brief,0", var1);
      if (null != var2) {
         rp_._f[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_revive_brief,1", var1);
      if (var2 != null) {
         rp_._f[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_circumvent_brief,0", false);
      if (var2 != null) {
         um_._b[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_circumvent_brief,1", false);
      if (var2 != null) {
         um_._b[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_scout_brief,0", false);
      if (var2 != null) {
         gi_._K[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_scout_brief,1", false);
      if (var2 != null) {
         gi_._K[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_spy_brief,0", false);
      if (null != var2) {
         fe_._n[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_spy_brief,1", false);
      if (null != var2) {
         fe_._n[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_glamour_brief,0", false);
      if (null != var2) {
         gl_._Kb[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_glamour_brief,1", false);
      if (null != var2) {
         gl_._Kb[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_intimidate_brief,0", false);
      if (var2 != null) {
         uf_._d[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_intimidate_brief,1", var1);
      if (null != var2) {
         uf_._d[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_ferocity_brief,0", var1);
      if (null != var2) {
         mi_._a[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_ferocity_brief,1", false);
      if (var2 != null) {
         mi_._a[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_firststrike_brief,0", false);
      if (null != var2) {
         dm_._e[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_firststrike_brief,1", var1);
      if (var2 != null) {
         dm_._e[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fragility_brief,0", var1);
      if (var2 != null) {
         to_._b[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fragility_brief,1", false);
      if (var2 != null) {
         to_._b[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_armoured_brief,0", false);
      if (null != var2) {
         rj_._j[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_armoured_brief,1", false);
      if (null != var2) {
         rj_._j[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fireimmunity_brief,0", false);
      if (null != var2) {
         dn_._N[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fireimmunity_brief,1", false);
      if (null != var2) {
         dn_._N[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_immortal_brief,0", false);
      if (var2 != null) {
         jf_._e[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_immortal_brief,1", false);
      if (null != var2) {
         jf_._e[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_chaos_champion_brief,0", var1);
      if (var2 != null) {
         bh_._N[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_chaos_champion_brief,1", false);
      if (null != var2) {
         bh_._N[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fickle_brief,0", var1);
      if (null != var2) {
         ua_._c[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_fickle_brief,1", false);
      if (var2 != null) {
         ua_._c[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_redistribute_brief,0", false);
      if (null != var2) {
         wf_._z[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("ability_redistribute_brief,1", var1);
      if (var2 != null) {
         wf_._z[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_ferocity_message", false);
      if (var2 != null) {
         ia_._N = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_armoured_message", false);
      if (null != var2) {
         le_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("ability_room_armoured_message", false);
      if (null != var2) {
         qi_._h = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("fatal_monster", var1);
      if (var2 != null) {
         rb_._K = dj_.a064(var2, false);
      }

      var2 = gm_.a728("fatal_trap", false);
      if (null != var2) {
         gm_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("fatal_guardian", var1);
      if (var2 != null) {
         lf_._m = dj_.a064(var2, false);
      }

      var2 = gm_.a728("fatal_brief", false);
      if (null != var2) {
         lg_._s = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("orb_preservation", false);
      if (null != var2) {
         ek_._d = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("orb_majesty", var1);
      if (null != var2) {
         tp_._z = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("orb_brilliance", false);
      if (var2 != null) {
         df_._d = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("orb_war", false);
      if (null != var2) {
         tg_._n = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("orb_preservation_desc", false);
      if (var2 != null) {
         da_._E = dj_.a064(var2, false);
      }

      var2 = gm_.a728("orb_majesty_desc", false);
      if (var2 != null) {
         lj_._j = dj_.a064(var2, false);
      }

      var2 = gm_.a728("orb_brilliance_desc", false);
      if (null != var2) {
         an_._C = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("orb_war_desc", false);
      if (null != var2) {
         bj_._J = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_male,0", false);
      if (null != var2) {
         od_._b[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_male,1", false);
      if (null != var2) {
         od_._b[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_male,2", false);
      if (null != var2) {
         od_._b[2] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_age_male,3", false);
      if (null != var2) {
         od_._b[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_male,4", var1);
      if (var2 != null) {
         od_._b[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_male,5", false);
      if (null != var2) {
         od_._b[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_female,0", false);
      if (null != var2) {
         ek_._h[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_female,1", var1);
      if (var2 != null) {
         ek_._h[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_female,2", false);
      if (null != var2) {
         ek_._h[2] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_age_female,3", false);
      if (var2 != null) {
         ek_._h[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_female,4", false);
      if (var2 != null) {
         ek_._h[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_age_female,5", false);
      if (null != var2) {
         ek_._h[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_male,0", var1);
      if (null != var2) {
         j_._O[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_male,1", false);
      if (var2 != null) {
         j_._O[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_male,2", var1);
      if (null != var2) {
         j_._O[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_male,3", false);
      if (var2 != null) {
         j_._O[3] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_mastery_male,4", var1);
      if (var2 != null) {
         j_._O[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_male,5", false);
      if (var2 != null) {
         j_._O[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_male,6", false);
      if (null != var2) {
         j_._O[6] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_male,7", false);
      if (var2 != null) {
         j_._O[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_female,0", false);
      if (null != var2) {
         ff_._f[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_female,1", false);
      if (var2 != null) {
         ff_._f[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_female,2", var1);
      if (var2 != null) {
         ff_._f[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_female,3", var1);
      if (null != var2) {
         ff_._f[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_female,4", var1);
      if (var2 != null) {
         ff_._f[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_female,5", false);
      if (null != var2) {
         ff_._f[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_mastery_female,6", false);
      if (var2 != null) {
         ff_._f[6] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_mastery_female,7", false);
      if (var2 != null) {
         ff_._f[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_male,0", var1);
      if (var2 != null) {
         hd_._m[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_aggression_male,1", false);
      if (null != var2) {
         hd_._m[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_male,2", false);
      if (null != var2) {
         hd_._m[2] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_aggression_male,3", false);
      if (var2 != null) {
         hd_._m[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_male,4", var1);
      if (var2 != null) {
         hd_._m[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_male,5", false);
      if (var2 != null) {
         hd_._m[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_male,6", false);
      if (var2 != null) {
         hd_._m[6] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_aggression_male,7", false);
      if (null != var2) {
         hd_._m[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_male,8", false);
      if (null != var2) {
         hd_._m[8] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_aggression_female,0", false);
      if (var2 != null) {
         ki_._h[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_aggression_female,1", false);
      if (null != var2) {
         ki_._h[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_female,2", false);
      if (var2 != null) {
         ki_._h[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_female,3", false);
      if (var2 != null) {
         ki_._h[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_female,4", var1);
      if (var2 != null) {
         ki_._h[4] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_aggression_female,5", false);
      if (var2 != null) {
         ki_._h[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_female,6", false);
      if (null != var2) {
         ki_._h[6] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_female,7", var1);
      if (var2 != null) {
         ki_._h[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_aggression_female,8", false);
      if (null != var2) {
         ki_._h[8] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_achievements_male,0", false);
      if (null != var2) {
         nj_._c[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_achievements_male,1", false);
      if (null != var2) {
         nj_._c[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_achievements_male,2", false);
      if (null != var2) {
         nj_._c[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_achievements_male,3", false);
      if (null != var2) {
         nj_._c[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_achievements_male,4", false);
      if (null != var2) {
         nj_._c[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_achievements_female,0", false);
      if (var2 != null) {
         lh_._n[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_achievements_female,1", false);
      if (var2 != null) {
         lh_._n[1] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_achievements_female,2", false);
      if (var2 != null) {
         lh_._n[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_achievements_female,3", false);
      if (null != var2) {
         lh_._n[3] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_achievements_female,4", false);
      if (null != var2) {
         lh_._n[4] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_external_male,0", var1);
      if (var2 != null) {
         wm_._i[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_male,1", false);
      if (var2 != null) {
         wm_._i[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_male,2", var1);
      if (var2 != null) {
         wm_._i[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_male,3", false);
      if (var2 != null) {
         wm_._i[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_male,4", false);
      if (null != var2) {
         wm_._i[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_male,5", var1);
      if (var2 != null) {
         wm_._i[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_male,6", false);
      if (null != var2) {
         wm_._i[6] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_external_male,7", false);
      if (var2 != null) {
         wm_._i[7] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_external_male,8", false);
      if (null != var2) {
         wm_._i[8] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_male,9", false);
      if (var2 != null) {
         wm_._i[9] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_female,0", var1);
      if (var2 != null) {
         wm_._d[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_female,1", false);
      if (null != var2) {
         wm_._d[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_female,2", false);
      if (var2 != null) {
         wm_._d[2] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_external_female,3", false);
      if (null != var2) {
         wm_._d[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_female,4", false);
      if (var2 != null) {
         wm_._d[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_female,5", false);
      if (null != var2) {
         wm_._d[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_female,6", false);
      if (var2 != null) {
         wm_._d[6] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_external_female,7", false);
      if (null != var2) {
         wm_._d[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_female,8", false);
      if (null != var2) {
         wm_._d[8] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_female,9", false);
      if (null != var2) {
         wm_._d[9] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_game,0", false);
      if (var2 != null) {
         ab_._d[0] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_external_game,1", false);
      if (null != var2) {
         ab_._d[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_game,2", var1);
      if (null != var2) {
         ab_._d[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_game,3", false);
      if (var2 != null) {
         ab_._d[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_game,4", false);
      if (null != var2) {
         ab_._d[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_game,5", false);
      if (var2 != null) {
         ab_._d[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_game,6", false);
      if (var2 != null) {
         ab_._d[6] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_game,7", var1);
      if (var2 != null) {
         ab_._d[7] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_external_game,8", false);
      if (var2 != null) {
         ab_._d[8] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_game,9", false);
      if (null != var2) {
         ab_._d[9] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_achievement,0", false);
      if (null != var2) {
         ka_._b[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_achievement,1", false);
      if (var2 != null) {
         ka_._b[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_achievement,2", false);
      if (var2 != null) {
         ka_._b[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_achievement,3", var1);
      if (var2 != null) {
         ka_._b[3] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_external_achievement,4", false);
      if (null != var2) {
         ka_._b[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_achievement,5", false);
      if (null != var2) {
         ka_._b[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_achievement,6", false);
      if (null != var2) {
         ka_._b[6] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_achievement,7", var1);
      if (var2 != null) {
         ka_._b[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_achievement,8", false);
      if (var2 != null) {
         ka_._b[8] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_external_achievement,9", false);
      if (var2 != null) {
         ka_._b[9] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_purchased,0", var1);
      if (null != var2) {
         ce_._q[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,1", var1);
      if (var2 != null) {
         ce_._q[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,2", var1);
      if (var2 != null) {
         ce_._q[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,3", false);
      if (null != var2) {
         ce_._q[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,4", false);
      if (null != var2) {
         ce_._q[4] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,5", var1);
      if (var2 != null) {
         ce_._q[5] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,6", false);
      if (var2 != null) {
         ce_._q[6] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,7", false);
      if (var2 != null) {
         ce_._q[7] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,8", false);
      if (var2 != null) {
         ce_._q[8] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,9", false);
      if (var2 != null) {
         ce_._q[9] = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("titles_purchased,10", false);
      if (null != var2) {
         ce_._q[10] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,11", var1);
      if (var2 != null) {
         ce_._q[11] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,12", false);
      if (null != var2) {
         ce_._q[12] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,13", false);
      if (var2 != null) {
         ce_._q[13] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,14", false);
      if (var2 != null) {
         ce_._q[14] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("titles_purchased,15", false);
      if (var2 != null) {
         ce_._q[15] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_initiate_raid", var1);
      if (var2 != null) {
         t_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_dragons_of_renown", false);
      if (null != var2) {
         c_._e = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_my_profile", false);
      if (null != var2) {
         sj_._W = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_construction", false);
      if (null != var2) {
         uc_._C = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_stable", false);
      if (null != var2) {
         rl_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_result", false);
      if (null != var2) {
         bb_._q = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_continue", false);
      if (var2 != null) {
         hj_._X = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_dungeon_assault", false);
      if (var2 != null) {
         tp_._u = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_instructions", var1);
      if (var2 != null) {
         bn_._q = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_achievements", false);
      if (null != var2) {
         vd_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_profile", var1);
      if (var2 != null) {
         gk_._K = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_dungeon_builder", var1);
      if (var2 != null) {
         f_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_cost_colon", false);
      if (var2 != null) {
         ef_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_treasure_colon", var1);
      if (var2 != null) {
         pb_._I = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_menu", var1);
      if (null != var2) {
         l_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_rooms", false);
      if (var2 != null) {
         dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_commit", var1);
      if (null != var2) {
         lk_._P = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_cancel", false);
      if (var2 != null) {
         be_._r = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_members_only", false);
      if (var2 != null) {
         dn_._T = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_orbmode", false);
      if (var2 != null) {
         be_._q = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_x_renown", false);
      if (null != var2) {
         n_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_exit", false);
      if (null != var2) {
         r_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_raid", var1);
      if (var2 != null) {
         ia_._Y = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_search", var1);
      if (var2 != null) {
         hb_._l = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_search_tip", false);
      if (var2 != null) {
         hl_._k = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_recently_raided", false);
      if (null != var2) {
         no_._e = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_dismiss", false);
      if (null != var2) {
         dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_revive", var1);
      if (null != var2) {
         sa_._e = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_heal", false);
      if (var2 != null) {
         ae_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raid_fatal", false);
      if (null != var2) {
         kc_._P = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_recruit", false);
      if (null != var2) {
         dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider_recruitment", false);
      if (var2 != null) {
         lg_._h = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_raider_selection", var1);
      if (null != var2) {
         pi_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_inst_trap", var1);
      if (var2 != null) {
         an_._y = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_inst_monster", false);
      if (null != var2) {
         id_._k = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_inst_guardian", false);
      if (null != var2) {
         og_._d = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_renowntable_hint", false);
      if (var2 != null) {
         ai_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_stake", var1);
      if (null != var2) {
         le_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_protection", false);
      if (null != var2) {
         vl_._l = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_bounty", var1);
      if (null != var2) {
         mi_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_bounty_protection", false);
      if (null != var2) {
         ra_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_bounty_claimed", var1);
      if (var2 != null) {
         wm_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_please_wait", false);
      if (null != var2) {
         nl_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_gold_stolen", var1);
      if (null != var2) {
         eh_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_renown_lost", false);
      if (var2 != null) {
         jc_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_spendable_renown", var1);
      if (var2 != null) {
         nm_._jb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_renown_gained", false);
      if (var2 != null) {
         kl_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_risk_of_waking", false);
      if (null != var2) {
         li_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_too_heavy", false);
      if (null != var2) {
         oo_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_steal_gold", false);
      if (var2 != null) {
         ab_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_claim_bounty", var1);
      if (null != var2) {
         dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_hoard_room", var1);
      if (null != var2) {
         ak_._p = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_accept", var1);
      if (var2 != null) {
         pe_._n = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_close", false);
      if (null != var2) {
         tf_._g = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_orbs_of_mastery", false);
      if (var2 != null) {
         ag_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_renown_and_raids", false);
      if (null != var2) {
         uj_._e = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_cost_x", false);
      if (null != var2) {
         ho_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_plan", false);
      if (var2 != null) {
         mm_._s = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_3dview", false);
      if (null != var2) {
         cf_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_viewstyle", var1);
      if (var2 != null) {
         uf_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_isometric", false);
      if (var2 != null) {
         ql_._g = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_topdown", false);
      if (var2 != null) {
         go_._V = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_buy", false);
      if (null != var2) {
         bg_._x = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_orb_warning", false);
      if (var2 != null) {
         oj_._c = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_charging_hint_none", false);
      if (var2 != null) {
         ng_._L = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_charging_hint_x", false);
      if (var2 != null) {
         dg_._G = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_charging_hint_one", false);
      if (null != var2) {
         oc_._v = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_dungeon_reset", false);
      if (null != var2) {
         fl_._n = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_orbs_active_x", var1);
      if (null != var2) {
         nh_._i = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_orbs_charging_x", false);
      if (null != var2) {
         to_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_limit_reached", false);
      if (null != var2) {
         qh_._j = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_limit_reached_long", false);
      if (var2 != null) {
         bl_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_stole_gold", var1);
      if (var2 != null) {
         wi_._qb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_woke_dragon", false);
      if (var2 != null) {
         sm_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raiders_died_none", false);
      if (null != var2) {
         l_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raiders_died_one", var1);
      if (var2 != null) {
         rp_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raiders_died_x", false);
      if (var2 != null) {
         od_._c = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_status_postcombat", var1);
      if (null != var2) {
         co_._E = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_status_pregame", false);
      if (null != var2) {
         bj_._I = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_flee_tooltip", false);
      if (var2 != null) {
         eb_._I = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_advance_tooltip", false);
      if (var2 != null) {
         hm_._l = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_charge_tooltip", false);
      if (null != var2) {
         mo_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_disarm_trap_tooltip", false);
      if (var2 != null) {
         ai_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_disarm_guardian_tooltip", false);
      if (var2 != null) {
         kg_._k = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_sneak_past_tooltip", false);
      if (null != var2) {
         a_._k = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_continue_tooltip", false);
      if (var2 != null) {
         pb_._H = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_flee_coloured", false);
      if (null != var2) {
         qa_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_advance_coloured", false);
      if (var2 != null) {
         dn_._L = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_charge_coloured", var1);
      if (null != var2) {
         lh_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_disarm_trap_coloured", false);
      if (null != var2) {
         vd_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_disarm_guardian_coloured", false);
      if (null != var2) {
         u_._S = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_useskill_coloured", false);
      if (var2 != null) {
         dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_flee_minitip", false);
      if (null != var2) {
         jc_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_advance_minitip", var1);
      if (null != var2) {
         gi_._Q = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_charge_minitip", false);
      if (var2 != null) {
         fp_._e = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_disarm_trap_minitip", var1);
      if (null != var2) {
         vo_._o = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_disarm_guardian_minitip", var1);
      if (var2 != null) {
         rb_._I = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_useskill_minitip", false);
      if (null != var2) {
         dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_guardian_detected_alerted", false);
      if (var2 != null) {
         nh_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider_snuck_past_guardian", var1);
      if (null != var2) {
         c_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_guardian_trapped_alerted", var1);
      if (var2 != null) {
         ah_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_raider_avoided_guardian", false);
      if (null != var2) {
         np_._G = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_monster_wins", var1);
      if (var2 != null) {
         h_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_monster_attacks", false);
      if (var2 != null) {
         u_._R = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider_wins", var1);
      if (null != var2) {
         lj_._p = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider_escapes", var1);
      if (null != var2) {
         cm_._K = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_raider_attacks", false);
      if (var2 != null) {
         ri_._c = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_raider_dodges", false);
      if (var2 != null) {
         al_._m = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_success", false);
      if (var2 != null) {
         ac_._h = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_failure", var1);
      if (var2 != null) {
         lp_._n = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_party_sneaks_past", false);
      if (var2 != null) {
         qj_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_monster_failed_to_trap", false);
      if (null != var2) {
         fc_._e = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_raider_detected", var1);
      if (var2 != null) {
         uo_._d = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_raider_avoided_detection", var1);
      if (var2 != null) {
         mo_._h = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raiders_flee_in_terror", false);
      if (var2 != null) {
         ep_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider_trapped_incap", false);
      if (null != var2) {
         bp_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider_trapped_killed", var1);
      if (null != var2) {
         vb_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider_avoided_trap", false);
      if (null != var2) {
         ba_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider_disarmed_trap", var1);
      if (null != var2) {
         ch_._l = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_status_precombat", var1);
      if (var2 != null) {
         rn_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_select_room", false);
      if (null != var2) {
         pi_._g = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_select_raider", var1);
      if (var2 != null) {
         ho_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_party_defeated", false);
      if (null != var2) {
         al_._n = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hoardroom_hint", false);
      if (null != var2) {
         um_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_cost", false);
      if (var2 != null) {
         tn_._U = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_attack", false);
      if (null != var2) {
         qk_._d = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_defence", false);
      if (null != var2) {
         dj_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_dodge", false);
      if (var2 != null) {
         pm_._n = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_sneak", var1);
      if (var2 != null) {
         nf_._x = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_snare", false);
      if (null != var2) {
         rk_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_detect", var1);
      if (null != var2) {
         eg_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_sort_raiders_by", false);
      if (var2 != null) {
         ib_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_sort_rooms_by", false);
      if (null != var2) {
         tp_._w = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_modifier_stat_increased", false);
      if (var2 != null) {
         so_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_modifier_stat_decreased", var1);
      if (null != var2) {
         vc_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_modifier_glamour", false);
      if (var2 != null) {
         kl_._b = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_dead", false);
      if (null != var2) {
         kg_._m = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_incapacitated", false);
      if (var2 != null) {
         gl_._Hb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_ability_used", false);
      if (null != var2) {
         wi_._nb = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_disarmed", false);
      if (var2 != null) {
         fi_._t = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_defeated", var1);
      if (var2 != null) {
         ii_._C = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_modifier_blinded", false);
      if (null != var2) {
         dm_._c = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_passive_ability", var1);
      if (null != var2) {
         rm_._J = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_ability_ready", var1);
      if (null != var2) {
         g_._Jb = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_active_ability", var1);
      if (null != var2) {
         lc_._g = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_activeraider", var1);
      if (var2 != null) {
         od_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_useskill", false);
      if (var2 != null) {
         vo_._m = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider", var1);
      if (null != var2) {
         gg_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_monster", false);
      if (var2 != null) {
         af_._a = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_trap", false);
      if (var2 != null) {
         DungeonAssault._H = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_guardian", false);
      if (var2 != null) {
         ki_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raiders", false);
      if (null != var2) {
         ak_._m = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_monsters", var1);
      if (null != var2) {
         wo_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_traps", false);
      if (var2 != null) {
         dh_._e = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_guardians", false);
      if (var2 != null) {
         wm_._j = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_no_defences", false);
      if (var2 != null) {
         uh_._V = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_defences", false);
      if (null != var2) {
         rb_._M = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_no_raids", false);
      if (var2 != null) {
         wa_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_outcome", false);
      if (null != var2) {
         ip_._k = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_raids", false);
      if (null != var2) {
         p_._r = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_income_rate", false);
      if (var2 != null) {
         la_._j = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_unspent_x", false);
      if (null != var2) {
         bp_._h = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_highest_x", false);
      if (var2 != null) {
         mm_._j = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_renown_x", false);
      if (null != var2) {
         kk_._s = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_confirm_changes", false);
      if (null != var2) {
         oa_._h = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_confirm_changes_dungeon", false);
      if (var2 != null) {
         wj_._x = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_confirm_changes_stable", false);
      if (var2 != null) {
         pb_._F = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_save_and_exit", var1);
      if (null != var2) {
         ud_._u = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_exit_without_saving", false);
      if (var2 != null) {
         pm_._o = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_save_and_exit_brief", false);
      if (var2 != null) {
         oi_._M = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_exit_without_saving_brief", false);
      if (var2 != null) {
         nk_._Lb = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_warning_activate_dungeon", false);
      if (var2 != null) {
         dh_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_dungeon_builder_hint", false);
      if (var2 != null) {
         wh_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_activate_dungeon_dialog_title", false);
      if (var2 != null) {
         dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_activate_dungeon_dialog_body", var1);
      if (null != var2) {
         dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_raider_recruitment_hint", var1);
      if (var2 != null) {
         a_._m = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_dismiss_tooltip", false);
      if (null != var2) {
         dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_revive_tooltip", var1);
      if (null != var2) {
         e_._g = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_heal_tooltip", false);
      if (null != var2) {
         t_._c = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_recruit_tooltip", false);
      if (null != var2) {
         dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_title_heading", var1);
      if (null != var2) {
         fd_._a = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_title_requirements_age_x", false);
      if (null != var2) {
         vj_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_title_requirements_age_one", var1);
      if (var2 != null) {
         be_._m = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_title_requirements_mastery_x", false);
      if (null != var2) {
         wf_._y = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_title_requirements_mastery_one", false);
      if (null != var2) {
         tl_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_title_requirements_aggression", false);
      if (var2 != null) {
         ac_._f = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_title_requirements_achievement", false);
      if (var2 != null) {
         l_._c = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_title_requirements_external", false);
      if (var2 != null) {
         uk_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_title_requirements_unknown", false);
      if (var2 != null) {
         dk_._e = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_title_hint", var1);
      if (var2 != null) {
         DungeonAssault._G = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_recently_raided_by", false);
      if (null != var2) {
         oh_._o = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_redistribute", false);
      if (null != var2) {
         eb_._P = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_spy", false);
      if (var2 != null) {
         li_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_sacrifice_raider", false);
      if (null != var2) {
         wf_._D = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_sacrifice_greenskin", var1);
      if (var2 != null) {
         ta_._g = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_sacrifice_goblin", var1);
      if (var2 != null) {
         em_._F = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_scout_room", false);
      if (var2 != null) {
         rl_._c = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_revive", false);
      if (var2 != null) {
         mo_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_ability_glamour", false);
      if (null != var2) {
         jd_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_hint_ability_boostsneak", var1);
      if (null != var2) {
         bb_._r = dj_.a064(var2, var1);
      }

      var2 = gm_.a728("text_hint_ability_boostdef", var1);
      if (var2 != null) {
         pe_._i = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_acv_hunter_singleton", false);
      if (var2 != null) {
         i_._y = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_acv_hunter", false);
      if (var2 != null) {
         ji_._H = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_acv_riches", false);
      if (null != var2) {
         fn_._q = dj_.a064(var2, false);
      }

      var2 = gm_.a728("text_acv_habit", var1);
      if (var2 != null) {
         wl_._b = dj_.a064(var2, false);
      }

      var2 = gm_.a728("title_dtdtdt", var1);
      if (var2 != null) {
         ng_._K = dj_.a064(var2, false);
      }

      var2 = gm_.a728("renowntable_column_text,0", false);
      if (null != var2) {
         rb_._J[0] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("renowntable_column_text,1", false);
      if (null != var2) {
         rb_._J[1] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("renowntable_column_text,2", var1);
      if (var2 != null) {
         rb_._J[2] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("renowntable_column_text,3", false);
      if (null != var2) {
         rb_._J[3] = dj_.a064(var2, false);
      }

      var2 = gm_.a728("renowntable_error", false);
      if (var2 != null) {
         ac_._D = dj_.a064(var2, false);
      }

      var2 = gm_.a728("achievement_title", false);
      if (var2 != null) {
         f_._b = dj_.a064(var2, false);
      }

      d_._d = null;
   }

   final void d093(int var1, int var2) {
      this._m[-var2 + this._o - 4] = (byte)(var2 >> 24);
      this._m[this._o + (-var2 - 3)] = (byte)(var2 >> 16);
      this._m[-var2 + (this._o - 2)] = (byte)(var2 >> 8);
      this._m[-var2 + this._o - var1] = (byte)var2;
   }

   final int d410(byte var1) {
      if (var1 != 58) {
         this.a041((int[])null, true);
      }

      int var2 = this._m[this._o] & 255;
      return 128 <= var2 ? this.k137(var1 ^ 58) - '耀' : this.c474(true);
   }

   final int f137(int var1) {
      this._o += 3;
      if (var1 >= -93) {
         this.b411((byte)41);
      }

      return ((this._m[this._o - 3] & 255) << 16) + ((this._m[this._o - 2] & 255) << 8) + (255 & this._m[this._o - 1]);
   }

   static final boolean a366(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 < 54) {
         return true;
      } else {
         return var4 <= var2 && var4 + var3 > var2 && var5 >= var0 && var0 + var1 > var5;
      }
   }

   final void b093(int var1, int var2) {
      this._m[-var1 + this._o - 2] = (byte)(var1 >> 8);
      this._m[-var1 + this._o - var2] = (byte)var1;
   }

   final void b627(String var1, byte var2) {
      int var3 = var1.indexOf(0);
      if (0 <= var3) {
         throw new IllegalArgumentException("");
      } else {
         this._o += a165(var1.length(), 0, this._m, -1, this._o, var1);
         this._m[this._o++] = 0;
         if (var2 != -20) {
            _k = (nh_)null;
         }

      }
   }

   final void a494(BigInteger var1, int var2, BigInteger var3) {
      int var4 = this._o;
      this._o = 0;
      byte[] var5 = new byte[var4];
      this.a286((byte)-126, 0, var4, var5);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var3, var1);
      if (var2 != 2) {
         _l = (String[])null;
      }

      byte[] var8 = var7.toByteArray();
      this._o = 0;
      this.i093(var8.length, -97);
      this.a263(var8, 1, var8.length, 0);
   }

   final int l137(int var1) {
      int var2 = this._m[this._o] & 255;
      if (var1 != 0) {
         return 78;
      } else {
         return 128 > var2 ? this.c474(true) - 64 : this.k137(0) - '쀀';
      }
   }

   final String b791(boolean var1) {
      if (0 == this._m[this._o]) {
         ++this._o;
         return null;
      } else {
         if (!var1) {
            this.a494((BigInteger)null, 11, (BigInteger)null);
         }

         return this.d738(-100);
      }
   }

   final void c093(int var1, int var2) {
      this._m[var2 - var1 + this._o] = (byte)var1;
   }

   final int k137(int var1) {
      this._o += 2;
      return var1 != 0 ? -80 : ((255 & this._m[this._o - 2]) << 8) + (255 & this._m[this._o - 1]);
   }

   final void e093(int var1, int var2) {
      if (0 != (var2 & -128)) {
         if (0 != (var2 & -16384)) {
            if (0 != (var2 & -2097152)) {
               if ((var2 & -268435456) != 0) {
                  this.a093(6, 128 | var2 >>> 28);
               }

               this.a093(6, var2 >>> 21 | 128);
            }

            this.a093(6, (var2 | 2102129) >>> 14);
         }

         this.a093(var1 + 268435462, 128 | var2 >>> 7);
      }

      if (var1 == -268435456) {
         this.a093(6, var2 & 127);
      }
   }

   final void a332(int var1, int[] var2, int var3, int var4) {
      if (var4 != -10708) {
         _q = (String)null;
      }

      int var5 = this._o;
      this._o = var3;
      int var6 = (var1 - var3) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.h137(-52);
         int var9 = this.h137(var4 + 10677);
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; 0 < var12--; var8 -= var2[3 & var10] + var10 ^ (var9 << 4 ^ var9 >>> 5) + var9) {
            var9 -= var10 + var2[(7507 & var10) >>> 11] ^ var8 + (var8 >>> 5 ^ var8 << 4);
            var10 -= var11;
         }

         this._o -= 8;
         this.a556((byte)63, var8);
         this.a556((byte)63, var9);
      }

      this._o = var5;
   }

   final void a556(byte var1, int var2) {
      this._m[this._o++] = (byte)(var2 >> 24);
      this._m[this._o++] = (byte)(var2 >> 16);
      this._m[this._o++] = (byte)(var2 >> 8);
      this._m[this._o++] = (byte)var2;
      if (var1 != 63) {
         _p = 0;
      }

   }

   final String d738(int var1) {
      int var2 = this._o;

      while(0 != this._m[this._o++]) {
      }

      int var3 = -var2 + this._o - 1;
      if (var1 >= -88) {
         return (String)null;
      } else {
         return var3 == 0 ? "" : mk_.a046(this._m, var3, var2);
      }
   }

   final int c543(byte var1, int var2) {
      if (var1 != -106) {
         return -109;
      } else {
         int var3 = fm_.a552(this._o, var2, this._m);
         this.a556((byte)63, var3);
         return var3;
      }
   }

   final long c411(byte var1) {
      if (var1 <= 45) {
         this._m = (byte[])null;
      }

      long var2 = 4294967295L & (long)this.h137(-86);
      long var4 = (long)this.h137(-94) & 4294967295L;
      return (var2 << 32) + var4;
   }

   final int j137(int var1) {
      if (var1 != 1) {
         return 73;
      } else {
         return 0 > this._m[this._o] ? Integer.MAX_VALUE & this.h137(var1 - 95) : this.k137(0);
      }
   }

   final byte a403(byte var1) {
      if (var1 != 2) {
         _l = (String[])null;
      }

      return this._m[this._o++];
   }

   final int c474(boolean var1) {
      return !var1 ? -37 : 255 & this._m[this._o++];
   }

   static final int[] h111(int var0, int var1) {
      int[] var2 = new int[ib_._k];

      for(int var3 = 0; var3 < ib_._k; ++var3) {
         var2[var3] = Integer.MAX_VALUE;
      }

      var2[var0] = 0;
      if (var1 != 5) {
         _p = -121;
      }

      md_ var6 = new md_();
      var6.a865(new a_(var0), false);

      while(!var6.a427((byte)-87)) {
         int var4 = ((a_)var6.b081((byte)-124))._j;
         int var5 = 1 + var2[var4];
         if (var4 % ib_._j > 0) {
            dm_.a731(var6, var2, var5, var4 - 1, var4 + (-1 - var4 / ib_._j));
         }

         if (ib_._j - 1 > var4 % ib_._j) {
            dm_.a731(var6, var2, var5, 1 + var4, var4 - var4 / ib_._j);
         }

         if (var4 >= ib_._j) {
            dm_.a731(var6, var2, var5, var4 - ib_._j, (ib_._l >> 1) + var4 - ib_._j);
         }

         if (ib_._k - ib_._j > var4) {
            dm_.a731(var6, var2, var5, ib_._j + var4, var4 + (ib_._l >> 1));
         }
      }

      return var2;
   }

   final void b556(byte var1, int var2) {
      this._m[this._o++] = (byte)(var2 >> 16);
      this._m[this._o++] = (byte)(var2 >> 8);
      this._m[this._o++] = (byte)var2;
      if (var1 != -106) {
         this.e410((byte)-94);
      }

   }

   final int e137(int var1) {
      byte var2 = this._m[this._o++];
      if (var1 != -651413500) {
         _q = (String)null;
      }

      int var3;
      for(var3 = 0; 0 > var2; var2 = this._m[this._o++]) {
         var3 = (127 & var2 | var3) << 7;
      }

      return var3 | var2;
   }

   final boolean d491(boolean var1) {
      this._o -= 4;
      if (!var1) {
         return true;
      } else {
         int var2 = fm_.a552(this._o, 0, this._m);
         int var3 = this.h137(-80);
         return var2 == var3;
      }
   }

   final void a984(int var1, String var2) {
      int var3 = var2.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this._m[this._o++] = 0;
         this._o += a165(var2.length(), 0, this._m, var1 ^ -3, this._o, var2);
         this._m[this._o++] = 0;
         if (var1 != 2) {
            this.b093(-99, -104);
         }

      }
   }

   ec_(int var1) {
      this._o = 0;
      this._m = kn_.a551(var1);
   }

   final void a263(byte[] var1, int var2, int var3, int var4) {
      if (var2 != 1) {
         _j = (q_[])null;
      }

      for(int var5 = var4; var3 + var4 > var5; ++var5) {
         this._m[this._o++] = var1[var5];
      }

   }

   ec_(byte[] var1) {
      this._m = var1;
      this._o = 0;
   }
}
