final class tc_ extends qb_ {
   private vh_ _z;
   ug_ _A;
   private int _p;
   static int[] _w;
   private int[] _s;
   private vh_ _o;
   private boolean _n;
   private int _r = 0;
   static String _u;
   private int[] _y;
   private vh_ _x;
   private boolean _q = false;
   private ug_ _C;
   static int[] _m = new int[8192];
   ug_ _B;
   private int _t = 256;
   private int _v;

   public static void a423(byte var0) {
      _m = null;
      if (var0 < -12) {
         _w = null;
         _u = null;
      }
   }

   private final void a785(ug_ var1, int var2, int var3, int var4) {
      var1.a599(var2, var4, (byte)-82);
      var1.b093(var3, 0);
   }

   final qb_ c207() {
      return null;
   }

   final qb_ d207() {
      return null;
   }

   final void b397(int[] var1, int var2, int var3) {
      if (0 >= this._t) {
         this.a150(var3);
      } else {
         if (this._n) {
            if (this._p > 0 && !this._A.b427((byte)-126)) {
               this._o = null;
               this._n = false;
               this._p = -this._p;
            } else if (this._p < 0 && !this._B.b427((byte)-123)) {
               this._x = null;
               this._p = -this._p;
               this._n = false;
            }
         }

         int var4 = (this._v >> 12) * this._t / 256;
         int var5 = this._t - var4;
         if (this._p != 0) {
            this._v += this._p * var3;
            if (1048576 <= this._v) {
               this._v = 1048576;
               if (!this._n) {
                  this._p = 0;
                  if (!this._q) {
                     if (null != this._x) {
                        this._B.d150(-128);
                     }

                     this._x = null;
                  }
               }
            } else if (this._v <= 0) {
               this._v = 0;
               if (!this._n) {
                  this._p = 0;
                  if (!this._q) {
                     if (this._o != null) {
                        this._A.d150(-87);
                     }

                     this._o = null;
                  }
               }
            }
         }

         int var6 = !vn_._g ? var3 : var3 << 1;
         int var7;
         int var8;
         if (256 > this._r && (this._o != null || null != this._x)) {
            if (256 != var4) {
               if (var5 == 256) {
                  this._B.b397(var1, var2, var3);
               } else {
                  if (this._s != null && this._s.length >= var6) {
                     cj_.a397(this._s, 0, var6);
                     cj_.a397(this._y, 0, var6);
                  } else {
                     this._s = new int[var6];
                     this._y = new int[var6];
                  }

                  this._A.b397(this._s, 0, var3);
                  this._B.b397(this._y, 0, var3);
                  var7 = vn_._g ? (var2 <<= 1) : var2;

                  for(var8 = 0; var8 < var6; ++var8) {
                     var1[var8 + var7] += var4 * this._s[var8] + this._y[var8] * var5 >> 8;
                  }
               }
            } else {
               this._A.b397(var1, var2, var3);
            }
         }

         if (null != this._z && this._r != 0) {
            if (this._s != null && this._s.length >= var6) {
               cj_.a397(this._s, 0, var6);
            } else {
               this._y = new int[var6];
               this._s = new int[var6];
            }

            this._C.b397(this._s, 0, var3);
            var7 = vn_._g ? (var2 <<= 1) : var2;
            var8 = this._t * this._r / 256;
            int var9 = this._t - var8;

            for(int var10 = 0; var10 < var6; ++var10) {
               var1[var7 + var10] = var8 * this._s[var10] + var1[var7 + var10] * var9 >> 8;
            }
         }

      }
   }

   final synchronized void a188(int var1, int var2, int var3, vh_ var4, int var5, boolean var6) {
      if (this._n && var6) {
         if (this._p <= 0) {
            if (this._x != null) {
               this._B.d150(-79);
            }

            this._x = var4;
            if (var4 != null) {
               this._B.a787(var4, var1 ^ 1917, false);
               this.a785(this._B, var5, var2, var1 ^ -22200);
            }
         } else {
            if (null != this._o) {
               this._A.d150(-82);
            }

            this._o = var4;
            if (null != var4) {
               this._A.a787(var4, var1 ^ 1917, false);
               this.a785(this._A, var5, var2, var1 ^ -22200);
            }
         }

      } else {
         this._n = var6;
         if (this._o == var4) {
            this._p = var3;
            this.a785(this._A, var5, var2, -1);
         } else if (this._x == var4) {
            this._p = -var3;
            this.a785(this._B, var5, var2, -1);
         } else {
            boolean var7;
            if (this._o != null) {
               if (this._x != null) {
                  var7 = this._v < 524288;
               } else {
                  var7 = false;
               }
            } else {
               var7 = true;
            }

            if (var7) {
               if (null != this._o) {
                  this._A.d150(-80);
               }

               this._o = var4;
               if (null != var4) {
                  this._A.a787(var4, var1 - 1261, !var6);
                  this.a785(this._A, var5, var2, -1);
               }

               this._p = var3;
            } else {
               if (this._x != null) {
                  this._B.d150(-83);
               }

               this._x = var4;
               if (var4 != null) {
                  this._B.a787(var4, 20938, !var6);
                  this.a785(this._B, var5, var2, -1);
               }

               this._p = -var3;
            }

            if (var1 != 22199) {
               a423((byte)-5);
            }

         }
      }
   }

   final synchronized void a093(int var1, int var2) {
      if (var2 != 256) {
         this.c207();
      }

      this._t = var1;
   }

   private final void a905(boolean var1, ug_ var2, ug_ var3) {
      this._B = var3;
      this._v = 1048576;
      if (!var1) {
         a423((byte)14);
      }

      this._A = var2;
   }

   final synchronized int a784() {
      return 2;
   }

   final synchronized void a150(int var1) {
      if (0 < this._v && this._o != null) {
         this._A.a150(var1);
      }

      if (this._v < 1048576 && null != this._x) {
         this._B.a150(var1);
      }

      if (0 < this._r && this._z != null) {
         this._C.a150(var1);
      }

      if (this._n) {
         if (0 < this._p && !this._A.b427((byte)-127)) {
            this._o = null;
            this._n = false;
            this._p = -this._p;
         } else if (this._p < 0 && !this._B.b427((byte)-121)) {
            this._x = null;
            this._p = -this._p;
            this._n = false;
         }
      }

      if (this._p != 0) {
         this._v += var1 * this._p;
         if (1048576 <= this._v) {
            this._v = 1048576;
            if (!this._n) {
               this._p = 0;
               if (!this._q) {
                  if (this._x != null) {
                     this._B.d150(-117);
                  }

                  this._x = null;
               }
            }
         } else if (0 >= this._v) {
            this._v = 0;
            if (!this._n) {
               this._p = 0;
               if (!this._q) {
                  if (this._o != null) {
                     this._A.d150(-86);
                  }

                  this._o = null;
               }
            }
         }
      }

   }

   final void b423(byte var1) {
      if (null != this._o) {
         this._A.d150(var1 - 131);
      }

      if (null != this._x) {
         this._B.d150(-96);
      }

      this._o = null;
      if (var1 != 52) {
         this.b423((byte)51);
      }

      this._x = null;
   }

   static final void a366(int var0, byte var1) {
      for(pm_ var2 = (pm_)li_._a.e024(-24172); var2 != null; var2 = (pm_)li_._a.a024(4)) {
         ro_.a585(var2, var0, var1 + 236);
      }

      if (var1 != -112) {
         _u = (String)null;
      }

   }

   public tc_() {
      ug_ var1 = new ug_();
      this.a905(true, var1, new ug_(var1));
   }
}
