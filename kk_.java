final class kk_ extends ne_ {
   of_[] _n = new of_[128];
   static gp_ _l;
   static String _s = "Renown: <col=DB0100><%0></col>";
   byte[] _p = new byte[128];
   private int[] _q = new int[128];
   static String _i = "Pit Demon";
   va_[] _k = new va_[128];
   int _j;
   short[] _r = new short[128];
   byte[] _m = new byte[128];
   static String _t = "Please try again in a few minutes.";
   byte[] _o = new byte[128];

   static final boolean d154() {
      return sl_.b154(15000);
   }

   final boolean a920(byte var1, lc_ var2, int[] var3, byte[] var4) {
      boolean var5 = true;
      if (var1 != 45) {
         return true;
      } else {
         int var6 = 0;
         va_ var7 = null;

         for(int var8 = 0; 128 > var8; ++var8) {
            if (var4 == null || 0 != var4[var8]) {
               int var9 = this._q[var8];
               if (0 != var9) {
                  if (var6 != var9) {
                     var6 = var9--;
                     if (0 != (1 & var9)) {
                        var7 = var2.a152(var3, (byte)-97, var9 >> 2);
                     } else {
                        var7 = var2.a319(var3, var9 >> 2, -31164);
                     }

                     if (null == var7) {
                        var5 = false;
                     }
                  }

                  if (var7 != null) {
                     this._k[var8] = var7;
                     this._q[var8] = 0;
                  }
               }
            }
         }

         return var5;
      }
   }

   final void a423(byte var1) {
      this._q = null;
      if (var1 != -97) {
         a150(95);
      }

   }

   public static void a150(int var0) {
      _i = null;
      _t = null;
      _s = null;
      if (var0 != 0) {
         _s = (String)null;
      }

      _l = null;
   }

   static final String a015(String var0, String var1, String var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = var2.length();
      if (var4 == 0) {
         throw new IllegalArgumentException("Key cannot have zero length");
      } else {
         int var6 = var3;
         int var7 = var5 - var4;
         if (var7 != 0) {
            int var8 = 0;

            while(true) {
               var8 = var0.indexOf(var1, var8);
               if (0 > var8) {
                  break;
               }

               var6 += var7;
               var8 += var4;
            }
         }

         StringBuilder var11 = new StringBuilder(var6);
         int var9 = 0;

         while(true) {
            int var10 = var0.indexOf(var1, var9);
            if (0 > var10) {
               var11.append(var0.substring(var9));
               return var11.toString();
            }

            var11.append(var0.substring(var9, var10));
            var11.append(var2);
            var9 = var10 + var4;
         }
      }
   }

   static final tj_ a005(nh_ var0, nh_ var1, String var2, int var3, String var4) {
      int var5 = var1.a913(var4, var3 + 1000);
      int var6 = var1.a026(var3, var2, var5);
      return ef_.a639(var3 + 61, var5, var1, var6, var0);
   }

   static final boolean a283(nh_ var0, int var1, int var2, int var3) {
      byte[] var4 = var0.b337(5, var2, var3);
      if (null == var4) {
         return false;
      } else {
         tn_.a837(var1 + 105, var4);
         if (var1 != 1) {
            a283((nh_)null, -46, 0, -57);
         }

         return true;
      }
   }

   kk_(byte[] var1) {
      ec_ var2 = new ec_(var1);

      int var3;
      for(var3 = 0; var2._m[var2._o + var3] != 0; ++var3) {
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.a403((byte)2);
      }

      ++var3;
      ++var2._o;
      var5 = var2._o;
      var2._o += var3;

      int var6;
      for(var6 = 0; var2._m[var2._o + var6] != 0; ++var6) {
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var6 > var8; ++var8) {
         var7[var8] = var2.a403((byte)2);
      }

      ++var2._o;
      ++var6;
      var8 = var2._o;
      var2._o += var6;

      int var9;
      for(var9 = 0; var2._m[var2._o + var9] != 0; ++var9) {
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.a403((byte)2);
      }

      ++var2._o;
      ++var9;
      byte[] var36 = new byte[var9];
      int var12;
      int var14;
      if (var9 <= 1) {
         var12 = var9;
      } else {
         var36[1] = 1;
         var12 = 2;
         int var13 = 1;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.c474(true);
            if (var15 == 0) {
               var13 = var12++;
            } else {
               if (var13 >= var15) {
                  --var15;
               }

               var13 = var15;
            }

            var36[var14] = (byte)var13;
         }
      }

      of_[] var37 = new of_[var12];

      of_ var38;
      for(var14 = 0; var14 < var37.length; ++var14) {
         var38 = var37[var14] = new of_();
         int var16 = var2.c474(true);
         if (var16 > 0) {
            var38._n = new byte[var16 * 2];
         }

         var16 = var2.c474(true);
         if (var16 > 0) {
            var38._o = new byte[var16 * 2 + 2];
            var38._o[1] = 64;
         }
      }

      var14 = var2.c474(true);
      byte[] var39 = var14 <= 0 ? null : new byte[var14 * 2];
      var14 = var2.c474(true);
      byte[] var40 = 0 < var14 ? new byte[2 * var14] : null;

      int var17;
      for(var17 = 0; 0 != var2._m[var17 + var2._o]; ++var17) {
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var17 > var19; ++var19) {
         var18[var19] = var2.a403((byte)2);
      }

      ++var17;
      ++var2._o;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.c474(true);
         this._r[var20] = (short)var19;
      }

      var19 = 0;

      short[] var46;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.c474(true);
         var46 = this._r;
         var46[var20] = (short)(var46[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; 128 > var23; ++var23) {
         if (var20 == 0) {
            if (var21 >= var18.length) {
               var20 = -1;
            } else {
               var20 = var18[var21++];
            }

            var22 = var2.e137(-651413500);
         }

         var46 = this._r;
         var46[var23] = (short)(var46[var23] + (nb_.a080(var22 - 1, 2) << 14));
         this._q[var23] = var22;
         --var20;
      }

      var21 = 0;
      var20 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if (0 != this._q[var24]) {
            if (0 == var20) {
               var23 = var2._m[var5++] - 1;
               if (var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }
            }

            --var20;
            this._o[var24] = (byte)var23;
         }
      }

      var21 = 0;
      var20 = 0;
      var24 = 0;

      for(int var25 = 0; 128 > var25; ++var25) {
         if (this._q[var25] != 0) {
            if (var20 == 0) {
               var24 = var2._m[var8++] + 16 << 2;
               if (var7.length <= var21) {
                  var20 = -1;
               } else {
                  var20 = var7[var21++];
               }
            }

            this._p[var25] = (byte)var24;
            --var20;
         }
      }

      var21 = 0;
      var20 = 0;
      of_ var42 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if (0 != this._q[var26]) {
            if (0 == var20) {
               var42 = var37[var36[var21]];
               if (var21 >= var10.length) {
                  var20 = -1;
               } else {
                  var20 = var10[var21++];
               }
            }

            this._n[var26] = var42;
            --var20;
         }
      }

      var21 = 0;
      var20 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if (0 == var20) {
            if (var18.length <= var21) {
               var20 = -1;
            } else {
               var20 = var18[var21++];
            }

            if (0 < this._q[var27]) {
               var26 = var2.c474(true) + 1;
            }
         }

         --var20;
         this._m[var27] = (byte)var26;
      }

      this._j = 1 + var2.c474(true);

      of_ var28;
      int var29;
      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28._n != null) {
            for(var29 = 1; var28._n.length > var29; var29 += 2) {
               var28._n[var29] = var2.a403((byte)2);
            }
         }

         if (var28._o != null) {
            for(var29 = 3; var28._o.length - 2 > var29; var29 += 2) {
               var28._o[var29] = var2.a403((byte)2);
            }
         }
      }

      if (var39 != null) {
         for(var27 = 1; var27 < var39.length; var27 += 2) {
            var39[var27] = var2.a403((byte)2);
         }
      }

      if (null != var40) {
         for(var27 = 1; var40.length > var27; var27 += 2) {
            var40[var27] = var2.a403((byte)2);
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28._o != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28._o.length; var29 += 2) {
               var19 = var2.c474(true) + var19 + 1;
               var28._o[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28._n != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28._n.length; var29 += 2) {
               var19 = 1 + var19 + var2.c474(true);
               var28._n[var29] = (byte)var19;
            }
         }
      }

      int var30;
      int var31;
      int var32;
      int var33;
      int var34;
      int var43;
      byte var44;
      if (var39 != null) {
         var19 = var2.c474(true);
         var39[0] = (byte)var19;

         for(var27 = 2; var27 < var39.length; var27 += 2) {
            var19 = var2.c474(true) + 1 + var19;
            var39[var27] = (byte)var19;
         }

         var44 = var39[0];
         var43 = var39[1];

         for(var29 = 0; var29 < var44; ++var29) {
            this._m[var29] = (byte)(32 + this._m[var29] * var43 >> 6);
         }

         for(var29 = 2; var39.length > var29; var44 = (byte)var30) {
            var30 = var39[var29];
            var31 = var39[var29 + 1];
            var32 = (-var44 + var30) / 2 + var43 * (-var44 + var30);

            for(var33 = var44; var30 > var33; ++var33) {
               var34 = cp_.f313(-var44 + var30, var32);
               var32 += var31 - var43;
               this._m[var33] = (byte)(var34 * this._m[var33] + 32 >> 6);
            }

            var29 += 2;
            var43 = var31;
         }

         var38 = null;

         for(var30 = var44; var30 < 128; ++var30) {
            this._m[var30] = (byte)(32 + this._m[var30] * var43 >> 6);
         }
      }

      if (null != var40) {
         var19 = var2.c474(true);
         var40[0] = (byte)var19;

         for(var27 = 2; var27 < var40.length; var27 += 2) {
            var19 = 1 + var19 + var2.c474(true);
            var40[var27] = (byte)var19;
         }

         var44 = var40[0];
         var43 = var40[1] << 1;

         for(var29 = 0; var29 < var44; ++var29) {
            var30 = (this._p[var29] & 255) + var43;
            if (0 > var30) {
               var30 = 0;
            }

            if (128 < var30) {
               var30 = 128;
            }

            this._p[var29] = (byte)var30;
         }

         for(var29 = 2; var29 < var40.length; var29 += 2) {
            byte var45 = var40[var29];
            var31 = var40[var29 + 1] << 1;
            var32 = (var45 - var44) / 2 + var43 * (-var44 + var45);

            for(var33 = var44; var45 > var33; ++var33) {
               var34 = cp_.f313(var45 - var44, var32);
               int var35 = (255 & this._p[var33]) + var34;
               if (0 > var35) {
                  var35 = 0;
               }

               if (128 < var35) {
                  var35 = 128;
               }

               this._p[var33] = (byte)var35;
               var32 += -var43 + var31;
            }

            var43 = var31;
            var44 = var45;
         }

         Object var41 = null;

         for(var30 = var44; var30 < 128; ++var30) {
            var31 = var43 + (this._p[var30] & 255);
            if (0 > var31) {
               var31 = 0;
            }

            if (128 < var31) {
               var31 = 128;
            }

            this._p[var30] = (byte)var31;
         }
      }

      for(var27 = 0; var12 > var27; ++var27) {
         var37[var27]._c = var2.c474(true);
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (null != var28._n) {
            var28._e = var2.c474(true);
         }

         if (null != var28._o) {
            var28._m = var2.c474(true);
         }

         if (var28._c > 0) {
            var28._b = var2.c474(true);
         }
      }

      for(var27 = 0; var12 > var27; ++var27) {
         var37[var27]._i = var2.c474(true);
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28._i > 0) {
            var28._h = var2.c474(true);
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (0 < var28._h) {
            var28._a = var2.c474(true);
         }
      }

   }
}
