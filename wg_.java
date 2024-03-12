import java.util.Random;

final class wg_ {
   private int[] _h = new int[]{0, 0, 0, 0, 0};
   private int _t = 100;
   private static int[] _r;
   int _o = 0;
   private int[] _g = new int[]{0, 0, 0, 0, 0};
   private static int[] _q = new int['耀'];
   private fh_ _n;
   private fh_ _f;
   private fh_ _m;
   private fh_ _d;
   private int _k = 0;
   private fh_ _i;
   private bi_ _x;
   private fh_ _v;
   private int[] _u = new int[]{0, 0, 0, 0, 0};
   private fh_ _c;
   private fh_ _p;
   private static int[] _b;
   int _s = 500;
   private fh_ _l;
   private static int[] _y;
   private static int[] _j;
   private static int[] _a;
   private static int[] _e;
   private static int[] _w;

   final int[] a111(int var1, int var2) {
      cj_.a397(_r, 0, var1);
      if (var2 < 10) {
         return _r;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0);
         this._d.a797();
         this._m.a797();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this._n != null) {
            this._n.a797();
            this._v.a797();
            var5 = (int)((double)(this._n._j - this._n._c) * 32.768 / var3);
            var6 = (int)((double)this._n._c * 32.768 / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this._p != null) {
            this._p.a797();
            this._c.a797();
            var8 = (int)((double)(this._p._j - this._p._c) * 32.768 / var3);
            var9 = (int)((double)this._p._c * 32.768 / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this._g[var11] != 0) {
               _w[var11] = 0;
               _a[var11] = (int)((double)this._u[var11] * var3);
               _e[var11] = (this._g[var11] << 14) / 100;
               _j[var11] = (int)((double)(this._d._j - this._d._c) * 32.768 * Math.pow(1.0057929410678534, (double)this._h[var11]) / var3);
               _y[var11] = (int)((double)this._d._c * 32.768 / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this._d.a137(var1);
            var13 = this._m.a137(var1);
            if (this._n != null) {
               var14 = this._n.a137(var1);
               var15 = this._v.a137(var1);
               var12 += this.a313(var7, var15, this._n._d) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this._p != null) {
               var14 = this._p.a137(var1);
               var15 = this._c.a137(var1);
               var13 = var13 * ((this.a313(var10, var15, this._p._d) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this._g[var14] != 0) {
                  var15 = var11 + _a[var14];
                  if (var15 < var1) {
                     var10000 = _r;
                     var10000[var15] += this.a313(_w[var14], var13 * _e[var14] >> 15, this._d._d);
                     var10000 = _w;
                     var10000[var14] += (var12 * _j[var14] >> 16) + _y[var14];
                  }
               }
            }
         }

         int var16;
         if (this._i != null) {
            this._i.a797();
            this._l.a797();
            var11 = 0;
            boolean var18 = false;
            boolean var19 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this._i.a137(var1);
               var16 = this._l.a137(var1);
               if (var19) {
                  var12 = this._i._c + ((this._i._j - this._i._c) * var15 >> 8);
               } else {
                  var12 = this._i._c + ((this._i._j - this._i._c) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var19 = !var19;
               }

               if (var19) {
                  _r[var14] = 0;
               }
            }
         }

         if (this._k > 0 && this._t > 0) {
            var11 = (int)((double)this._k * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = _r;
               var10000[var12] += _r[var12 - var11] * this._t / 100;
            }
         }

         if (this._x._e[0] > 0 || this._x._e[1] > 0) {
            this._f.a797();
            var11 = this._f.a137(var1 + 1);
            var12 = this._x.a197(0, (float)var11 / 65536.0F);
            var13 = this._x.a197(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)_r[var14 + var12] * (long)bi_._d >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)_r[var14 + var12 - 1 - var17] * (long)bi_._c[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)_r[var14 - 1 - var17] * (long)bi_._c[1][var17] >> 16);
                  }

                  _r[var14] = var16;
                  var11 = this._f.a137(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  while(var14 < var15) {
                     var16 = (int)((long)_r[var14 + var12] * (long)bi_._d >> 16);

                     for(var17 = 0; var17 < var12; ++var17) {
                        var16 += (int)((long)_r[var14 + var12 - 1 - var17] * (long)bi_._c[0][var17] >> 16);
                     }

                     for(var17 = 0; var17 < var13; ++var17) {
                        var16 -= (int)((long)_r[var14 - 1 - var17] * (long)bi_._c[1][var17] >> 16);
                     }

                     _r[var14] = var16;
                     var11 = this._f.a137(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var16 = 0;

                        for(var17 = var14 + var12 - var1; var17 < var12; ++var17) {
                           var16 += (int)((long)_r[var14 + var12 - 1 - var17] * (long)bi_._c[0][var17] >> 16);
                        }

                        for(var17 = 0; var17 < var13; ++var17) {
                           var16 -= (int)((long)_r[var14 - 1 - var17] * (long)bi_._c[1][var17] >> 16);
                        }

                        _r[var14] = var16;
                        this._f.a137(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this._x.a197(0, (float)var11 / 65536.0F);
                  var13 = this._x.a197(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (_r[var11] < -32768) {
               _r[var11] = -32768;
            }

            if (_r[var11] > 32767) {
               _r[var11] = 32767;
            }
         }

         return _r;
      }
   }

   private final int a313(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return _b[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? _q[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void a962(ec_ var1) {
      this._d = new fh_();
      this._d.b962(var1);
      this._m = new fh_();
      this._m.b962(var1);
      int var2 = var1.c474(true);
      if (var2 != 0) {
         --var1._o;
         this._n = new fh_();
         this._n.b962(var1);
         this._v = new fh_();
         this._v.b962(var1);
      }

      var2 = var1.c474(true);
      if (var2 != 0) {
         --var1._o;
         this._p = new fh_();
         this._p.b962(var1);
         this._c = new fh_();
         this._c.b962(var1);
      }

      var2 = var1.c474(true);
      if (var2 != 0) {
         --var1._o;
         this._i = new fh_();
         this._i.b962(var1);
         this._l = new fh_();
         this._l.b962(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.d410((byte)58);
         if (var4 == 0) {
            break;
         }

         this._g[var3] = var4;
         this._h[var3] = var1.l137(0);
         this._u[var3] = var1.d410((byte)58);
      }

      this._k = var1.d410((byte)58);
      this._t = var1.d410((byte)58);
      this._s = var1.k137(0);
      this._o = var1.k137(0);
      this._x = new bi_();
      this._f = new fh_();
      this._x.a739(var1, this._f);
   }

   public static void a797() {
      _r = null;
      _q = null;
      _b = null;
      _w = null;
      _a = null;
      _e = null;
      _j = null;
      _y = null;
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         _q[var1] = (var0.nextInt() & 2) - 1;
      }

      _b = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         _b[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
      }

      _r = new int[220500];
      _y = new int[5];
      _j = new int[5];
      _a = new int[5];
      _e = new int[5];
      _w = new int[5];
   }
}
