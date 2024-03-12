final class ja_ {
   static String[] _d = new String[]{"Circumvent", "Equally adept with the arts of mechanics and deception, the trusty toolkit of the <%0> is enough to disable any obstacle. (Single use)"};
   private int[] _e;
   private int[] _c;
   static cn_[] _b;
   static String _a = "Music: ";

   public static void a487(boolean var0) {
      _a = null;
      if (var0) {
         _b = (cn_[])null;
      }

      _d = null;
      _b = null;
   }

   final int a205(byte[] var1, byte[] var2, byte var3, int var4, int var5, int var6) {
      if (var3 != -88) {
         this.a205((byte[])null, (byte[])null, (byte)93, -112, -52, -44);
      }

      if (0 == var6) {
         return 0;
      } else {
         var6 += var5;
         int var7 = 0;
         int var8 = var4;

         while(true) {
            byte var9 = var1[var8];
            if (var9 >= 0) {
               ++var7;
            } else {
               var7 = this._e[var7];
            }

            int var10;
            if ((var10 = this._e[var7]) < 0) {
               var2[var5++] = (byte)(~var10);
               if (var5 >= var6) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 64) == 0) {
               ++var7;
            } else {
               var7 = this._e[var7];
            }

            if ((var10 = this._e[var7]) < 0) {
               var2[var5++] = (byte)(~var10);
               if (var5 >= var6) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 32) != 0) {
               var7 = this._e[var7];
            } else {
               ++var7;
            }

            if ((var10 = this._e[var7]) < 0) {
               var2[var5++] = (byte)(~var10);
               if (var6 <= var5) {
                  break;
               }

               var7 = 0;
            }

            if (0 == (16 & var9)) {
               ++var7;
            } else {
               var7 = this._e[var7];
            }

            if (0 > (var10 = this._e[var7])) {
               var2[var5++] = (byte)(~var10);
               if (var6 <= var5) {
                  break;
               }

               var7 = 0;
            }

            if (0 == (var9 & 8)) {
               ++var7;
            } else {
               var7 = this._e[var7];
            }

            if ((var10 = this._e[var7]) < 0) {
               var2[var5++] = (byte)(~var10);
               if (var5 >= var6) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 4) == 0) {
               ++var7;
            } else {
               var7 = this._e[var7];
            }

            if ((var10 = this._e[var7]) < 0) {
               var2[var5++] = (byte)(~var10);
               if (var5 >= var6) {
                  break;
               }

               var7 = 0;
            }

            if (0 != (var9 & 2)) {
               var7 = this._e[var7];
            } else {
               ++var7;
            }

            if (0 > (var10 = this._e[var7])) {
               var2[var5++] = (byte)(~var10);
               if (var5 >= var6) {
                  break;
               }

               var7 = 0;
            }

            if (0 != (var9 & 1)) {
               var7 = this._e[var7];
            } else {
               ++var7;
            }

            if (0 > (var10 = this._e[var7])) {
               var2[var5++] = (byte)(~var10);
               if (var5 >= var6) {
                  break;
               }

               var7 = 0;
            }

            ++var8;
         }

         return -var4 + 1 + var8;
      }
   }

   ja_(byte[] var1) {
      int var2 = var1.length;
      this._c = new int[var2];
      this._e = new int[8];
      int[] var3 = new int[33];
      int var4 = 0;

      for(int var5 = 0; var2 > var5; ++var5) {
         byte var6 = var1[var5];
         if (0 != var6) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this._c[var5] = var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if ((var7 & var8) != 0) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for(var10 = var6 - 1; var10 >= 1; --var10) {
                  var11 = var3[var10];
                  if (var11 != var8) {
                     break;
                  }

                  var12 = 1 << -var10 + 32;
                  if (0 != (var12 & var11)) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = mp_.a080(var11, var12);
               }
            }

            var3[var6] = var9;

            for(var10 = var6 + 1; var10 <= 32; ++var10) {
               if (var3[var10] == var8) {
                  var3[var10] = var9;
               }
            }

            var10 = 0;

            for(var11 = 0; var11 < var6; ++var11) {
               var12 = Integer.MIN_VALUE >>> var11;
               if ((var12 & var8) == 0) {
                  ++var10;
               } else {
                  if (0 == this._e[var10]) {
                     this._e[var10] = var4;
                  }

                  var10 = this._e[var10];
               }

               var12 >>>= 1;
               if (this._e.length <= var10) {
                  int[] var13 = new int[2 * this._e.length];

                  for(int var14 = 0; var14 < this._e.length; ++var14) {
                     var13[var14] = this._e[var14];
                  }

                  this._e = var13;
               }
            }

            if (var4 <= var10) {
               var4 = 1 + var10;
            }

            this._e[var10] = ~var5;
         }
      }

   }

   static final void a418(int var0, int var1, byte var2, boolean var3, di_[] var4) {
      bj_._G = false;
      ao_._o = var0;
      hi_._c.b093(4973, ao_._o - 10);
      if (9 < hi_._c._H) {
         hi_._c._H = 9;
      }

      if (fb_._d == null) {
         fb_._d = new di_[10];
      }

      if (var2 == 22) {
         if (hi_._c._D > 9) {
            hi_._c._D = 9;
         }

         int var6;
         if (!var3) {
            int var5 = 0;
            if (og_._f > var1) {
               var5 = -var1 + og_._f;
            }

            var6 = var4.length;
            if (var4.length + var1 > fb_._d.length + og_._f) {
               var6 = fb_._d.length + (og_._f - var1);
            }

            for(int var7 = var5; var7 < var6; ++var7) {
               var4[var7]._b = var7 + var1;
               fb_._d[var7 + var1 - og_._f] = var4[var7];
            }
         } else {
            boolean var8 = false;
            if (null == ip_._j) {
               return;
            }

            pd_ var10000 = hi_._c;
            og_._f = var1;
            vd_._a = var1;
            var10000._z = var1;

            for(var6 = 0; var4.length > var6; ++var6) {
               var4[var6]._b = var1 + var6;
               fb_._d[var6] = var4[var6];
               if (le_.a398(ip_._j, fb_._d[var6]._i, var2 ^ -127)) {
                  qc_._y = var6 + vd_._a;
                  var8 = true;
               }
            }

            if (!var8) {
               qc_._y = -1;
            }

            gg_.a423((byte)-84);
         }

      }
   }
}
