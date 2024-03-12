final class ge_ extends qb_ {
   private float _w;
   private int[] _z;
   private float _r;
   private we_[] _s;
   private float _p;
   private el_[] _y;
   private float _n;
   private we_[] _x = new we_[8];
   private el_[] _u;
   private float _v;
   private float _m;
   private qb_ _t;
   private float _o;
   private float _q;
   private float _A;

   final int a784() {
      return 8;
   }

   final synchronized void d267(float var1) {
      this._r = var1;
      this._p = 1.0F - (float)Math.pow(0.5, 1000000.0 / (double)(this._r * (float)vn_._t));
   }

   final synchronized void b267(float var1) {
      this._n = var1;
   }

   final synchronized void c267(float var1) {
      this._w = var1;
      this._v = (float)((double)this._q * Math.sqrt((double)(1.0F + this._w) * 0.5));
      this._m = (float)((double)this._q * Math.sqrt((double)(1.0F - this._w) * 0.5));
   }

   final synchronized void a150(int var1) {
      if (this._t != null) {
         this._t.a150(var1);
      }

   }

   final synchronized void a267(float var1) {
      this._q = var1;
      this._v = (float)((double)this._q * Math.sqrt((double)(1.0F + this._w) * 0.5));
      this._m = (float)((double)this._q * Math.sqrt((double)(1.0F - this._w) * 0.5));
   }

   final synchronized void b397(int[] var1, int var2, int var3) {
      this.e797();
      var3 += var2;

      while(var2 < var3) {
         int var4 = var3 - var2;
         if (var4 > 256) {
            var4 = 256;
         }

         if (this._t != null) {
            this._t.b397(this._z, 0, var4);
         }

         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < 8; ++var6) {
            var5 = a345(var5, this._x[var6]._c, this._x[var6]._a, var4);
         }

         for(var6 = 0; var6 < 4; ++var6) {
            var5 = a345(var5, this._y[var6]._a, this._y[var6]._b, var4);
         }

         if (vn_._g) {
            for(var6 = 0; var6 < 8; ++var6) {
               var5 = a345(var5, this._s[var6]._c, this._s[var6]._a, var4);
            }

            for(var6 = 0; var6 < 4; ++var6) {
               var5 = a345(var5, this._u[var6]._a, this._u[var6]._b, var4);
            }

            var4 <<= 1;
            var2 <<= 1;
         }

         int var7;
         for(var6 = 0; var6 < var4; ++var6) {
            var7 = this._z[var6];
            if (var7 > 0) {
               var7 = -var7;
            }

            if (var7 < var5) {
               var5 = var7;
            }
         }

         for(var6 = 0; var5 <= -4096; var5 >>= 1) {
            ++var6;
         }

         var7 = (int)(this._A * 4096.0F);
         int var8 = (int)(this._p * 4096.0F);
         int var9 = (int)(this._n * 4096.0F);
         int var10 = (int)(this._o * 65536.0F);
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var10001;
         int var18;
         int var19;
         if (vn_._g) {
            var11 = (int)(this._v * 4096.0F);
            var12 = (int)(this._m * 4096.0F);
            var13 = 0;

            while(true) {
               if (var13 >= var4) {
                  var2 >>= 1;
                  break;
               }

               var14 = this._z[var13++] >> var6;
               var15 = this._z[var13++] >> var6;
               var16 = (var14 + var15) * var10 >> 17;
               int var24 = 0;

               int var20;
               int var21;
               for(var18 = 0; var18 < 8; ++var18) {
                  we_ var25 = this._x[var18];
                  var20 = var25._c[var25._a] >> var6;
                  var21 = var25._b >> var6;
                  var21 += (var20 - var21) * var8 + 2048 >> 12;
                  var25._b = var21 << var6;
                  var25._c[var25._a] = var16 + (var21 * var7 + 2048 >> 12) << var6;
                  if (++var25._a >= var25._c.length) {
                     var25._a = 0;
                  }

                  var24 += var20;
               }

               for(var18 = 0; var18 < 4; ++var18) {
                  el_ var26 = this._y[var18];
                  var20 = var26._a[var26._b] >> var6;
                  var24 = var20 - var24;
                  var26._a[var26._b] = var16 + (var20 * 2048 + 2048 >> 12) << var6;
                  if (++var26._b >= var26._a.length) {
                     var26._b = 0;
                  }
               }

               var18 = 0;

               for(var19 = 0; var19 < 8; ++var19) {
                  we_ var27 = this._s[var19];
                  var21 = var27._c[var27._a] >> var6;
                  int var22 = var27._b >> var6;
                  var22 += (var21 - var22) * var8 + 2048 >> 12;
                  var27._b = var22 << var6;
                  var27._c[var27._a] = var16 + (var22 * var7 + 2048 >> 12) << var6;
                  if (++var27._a >= var27._c.length) {
                     var27._a = 0;
                  }

                  var18 += var21;
               }

               for(var19 = 0; var19 < 4; ++var19) {
                  el_ var28 = this._u[var19];
                  var21 = var28._a[var28._b] >> var6;
                  var18 = var21 - var18;
                  var28._a[var28._b] = var16 + (var21 * 2048 + 2048 >> 12) << var6;
                  if (++var28._b >= var28._a.length) {
                     var28._b = 0;
                  }
               }

               if (var6 > 12) {
                  var10001 = var2++;
                  var1[var10001] += var24 * var11 + var18 * var12 + var14 * var9 << var6 - 12;
                  var10001 = var2++;
                  var1[var10001] += var18 * var11 + var24 * var12 + var15 * var9 << var6 - 12;
               } else {
                  var10001 = var2++;
                  var1[var10001] += var24 * var11 + var18 * var12 + var14 * var9 >> 12 - var6;
                  var10001 = var2++;
                  var1[var10001] += var18 * var11 + var24 * var12 + var15 * var9 >> 12 - var6;
               }
            }
         } else {
            var11 = (int)(this._q * 4096.0F);

            for(var12 = 0; var12 < var4; ++var12) {
               var13 = this._z[var12] >> var6;
               var14 = var13 * var10 >> 16;
               var15 = 0;

               for(var16 = 0; var16 < 8; ++var16) {
                  we_ var17 = this._x[var16];
                  var18 = var17._c[var17._a] >> var6;
                  var19 = var17._b >> var6;
                  var19 += (var18 - var19) * var8 + 2048 >> 12;
                  var17._b = var19 << var6;
                  var17._c[var17._a] = var14 + (var19 * var7 + 2048 >> 12) << var6;
                  if (++var17._a >= var17._c.length) {
                     var17._a = 0;
                  }

                  var15 += var18;
               }

               for(var16 = 0; var16 < 4; ++var16) {
                  el_ var23 = this._y[var16];
                  var18 = var23._a[var23._b] >> var6;
                  var15 = var18 - var15;
                  var23._a[var23._b] = var14 + (var18 * 2048 + 2048 >> 12) << var6;
                  if (++var23._b >= var23._a.length) {
                     var23._b = 0;
                  }
               }

               if (var6 > 12) {
                  var10001 = var2++;
                  var1[var10001] += var15 * var11 + var13 * var9 << var6 - 12;
               } else {
                  var10001 = var2++;
                  var1[var10001] += var15 * var11 + var13 * var9 >> 12 - var6;
               }
            }
         }

         if (this._t != null) {
            cj_.a397(this._z, 0, var4);
         }
      }

   }

   final qb_ c207() {
      return null;
   }

   final synchronized void e267(float var1) {
      this._A = var1;
   }

   final qb_ d207() {
      return this._t;
   }

   private final void e797() {
      int var1;
      if (vn_._g) {
         if (this._s == null) {
            for(var1 = 0; var1 < 8; ++var1) {
               this._x[var1].a797();
            }

            for(var1 = 0; var1 < 4; ++var1) {
               this._y[var1].a797();
            }

            this._s = new we_[8];
            this._s[0] = new we_(1139 * vn_._t / '걄');
            this._s[1] = new we_(1211 * vn_._t / '걄');
            this._s[2] = new we_(1300 * vn_._t / '걄');
            this._s[3] = new we_(1379 * vn_._t / '걄');
            this._s[4] = new we_(1445 * vn_._t / '걄');
            this._s[5] = new we_(1514 * vn_._t / '걄');
            this._s[6] = new we_(1580 * vn_._t / '걄');
            this._s[7] = new we_(1640 * vn_._t / '걄');
            this._u = new el_[4];
            this._u[0] = new el_(579 * vn_._t / '걄');
            this._u[1] = new el_(464 * vn_._t / '걄');
            this._u[2] = new el_(364 * vn_._t / '걄');
            this._u[3] = new el_(248 * vn_._t / '걄');
            this._z = new int[512];
         }
      } else if (this._s != null) {
         for(var1 = 0; var1 < 8; ++var1) {
            this._x[var1].a797();
         }

         for(var1 = 0; var1 < 4; ++var1) {
            this._y[var1].a797();
         }

         this._s = null;
         this._u = null;
         this._z = new int[256];
      }

   }

   private static final int a345(int var0, int[] var1, int var2, int var3) {
      if (var3 > var1.length) {
         var3 = var1.length;
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1[var2];
         if (var5 > 0) {
            var5 = -var5;
         }

         if (var5 < var0) {
            var0 = var5;
         }

         ++var2;
         if (var2 == var1.length) {
            var2 = 0;
         }
      }

      return var0;
   }

   ge_(qb_ var1) {
      this._x[0] = new we_(1116 * vn_._t / '걄');
      this._x[1] = new we_(1188 * vn_._t / '걄');
      this._x[2] = new we_(1277 * vn_._t / '걄');
      this._x[3] = new we_(1356 * vn_._t / '걄');
      this._x[4] = new we_(1422 * vn_._t / '걄');
      this._x[5] = new we_(1491 * vn_._t / '걄');
      this._x[6] = new we_(1557 * vn_._t / '걄');
      this._x[7] = new we_(1617 * vn_._t / '걄');
      this._y = new el_[4];
      this._y[0] = new el_(556 * vn_._t / '걄');
      this._y[1] = new el_(441 * vn_._t / '걄');
      this._y[2] = new el_(341 * vn_._t / '걄');
      this._y[3] = new el_(225 * vn_._t / '걄');
      if (!vn_._g) {
         this._z = new int[256];
      }

      this.e797();
      this.f267(0.045F);
      this.a267(1.0F);
      this.e267(0.84F);
      this.b267(1.0F);
      this.d267(7000.0F);
      this.c267(1.0F);
      this._t = var1;
   }

   final synchronized void f267(float var1) {
      this._o = var1;
   }
}
