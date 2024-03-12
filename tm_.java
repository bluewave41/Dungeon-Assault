final class tm_ {
   int[][] _m;
   ra_ _a;
   int[] _o;
   private int[][] _d;
   int[] _i;
   private int[] _c;
   int[] _k;
   private byte[] _r;
   int[] _q;
   int[] _j;
   private int _h;
   static wh_ _b;
   int _s;
   static int _e;
   static cn_ _p;
   ra_[] _n;
   int _l;
   byte[][] _g;
   int _f;

   private final void a440(byte[] var1, byte var2) {
      ec_ var3 = new ec_(lc_.a266(var1));
      int var4 = var3.c474(true);
      if (5 <= var4 && 7 >= var4) {
         if (var2 > 97) {
            if (6 <= var4) {
               this._s = var3.h137(-42);
            } else {
               this._s = 0;
            }

            int var5 = var3.c474(true);
            boolean var6 = (1 & var5) != 0;
            boolean var7 = 0 != (var5 & 2);
            if (var4 < 7) {
               this._h = var3.k137(0);
            } else {
               this._h = var3.j137(1);
            }

            int var8 = 0;
            int var9 = -1;
            this._j = new int[this._h];
            int var10;
            if (7 <= var4) {
               for(var10 = 0; this._h > var10; ++var10) {
                  this._j[var10] = var8 += var3.j137(1);
                  if (var9 < this._j[var10]) {
                     var9 = this._j[var10];
                  }
               }
            } else {
               for(var10 = 0; this._h > var10; ++var10) {
                  this._j[var10] = var8 += var3.k137(0);
                  if (this._j[var10] > var9) {
                     var9 = this._j[var10];
                  }
               }
            }

            this._l = 1 + var9;
            this._m = new int[this._l][];
            if (var7) {
               this._g = new byte[this._l][];
            }

            this._o = new int[this._l];
            this._i = new int[this._l];
            this._q = new int[this._l];
            this._k = new int[this._l];
            if (var6) {
               this._c = new int[this._l];

               for(var10 = 0; var10 < this._l; ++var10) {
                  this._c[var10] = -1;
               }

               for(var10 = 0; this._h > var10; ++var10) {
                  this._c[this._j[var10]] = var3.h137(-50);
               }

               this._a = new ra_(this._c);
            }

            for(var10 = 0; this._h > var10; ++var10) {
               this._q[this._j[var10]] = var3.h137(-77);
            }

            if (var7) {
               for(var10 = 0; this._h > var10; ++var10) {
                  byte[] var11 = new byte[64];
                  var3.a286((byte)-124, 0, 64, var11);
                  this._g[this._j[var10]] = var11;
               }
            }

            for(var10 = 0; var10 < this._h; ++var10) {
               this._o[this._j[var10]] = var3.h137(-100);
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            if (var4 < 7) {
               for(var10 = 0; var10 < this._h; ++var10) {
                  this._k[this._j[var10]] = var3.k137(0);
               }

               for(var10 = 0; this._h > var10; ++var10) {
                  var16 = this._j[var10];
                  var8 = 0;
                  var12 = this._k[var16];
                  this._m[var16] = new int[var12];
                  var13 = -1;

                  for(var14 = 0; var12 > var14; ++var14) {
                     var15 = this._m[var16][var14] = var8 += var3.k137(0);
                     if (var13 < var15) {
                        var13 = var15;
                     }
                  }

                  this._i[var16] = 1 + var13;
                  if (var12 == 1 + var13) {
                     this._m[var16] = null;
                  }
               }
            } else {
               for(var10 = 0; var10 < this._h; ++var10) {
                  this._k[this._j[var10]] = var3.j137(1);
               }

               for(var10 = 0; var10 < this._h; ++var10) {
                  var16 = this._j[var10];
                  var8 = 0;
                  var12 = this._k[var16];
                  var13 = -1;
                  this._m[var16] = new int[var12];

                  for(var14 = 0; var12 > var14; ++var14) {
                     var15 = this._m[var16][var14] = var8 += var3.j137(1);
                     if (var13 < var15) {
                        var13 = var15;
                     }
                  }

                  this._i[var16] = 1 + var13;
                  if (var12 == 1 + var13) {
                     this._m[var16] = null;
                  }
               }
            }

            if (var6) {
               this._d = new int[1 + var9][];
               this._n = new ra_[var9 + 1];

               for(var10 = 0; var10 < this._h; ++var10) {
                  var16 = this._j[var10];
                  var12 = this._k[var16];
                  this._d[var16] = new int[this._i[var16]];

                  for(var13 = 0; this._i[var16] > var13; ++var13) {
                     this._d[var16][var13] = -1;
                  }

                  for(var13 = 0; var13 < var12; ++var13) {
                     if (this._m[var16] == null) {
                        var14 = var13;
                     } else {
                        var14 = this._m[var16][var13];
                     }

                     this._d[var16][var14] = var3.h137(-81);
                  }

                  this._n[var16] = new ra_(this._d[var16]);
               }
            }

         }
      } else {
         throw new RuntimeException();
      }
   }

   public static void a150() {
      _p = null;
      _b = null;
   }

   tm_(byte[] var1, int var2, byte[] var3) {
      this._f = qh_.a287(var1, var1.length);
      if (var2 != this._f) {
         throw new RuntimeException();
      } else {
         if (null != var3) {
            if (var3.length != 64) {
               throw new RuntimeException();
            }

            this._r = rn_.a288(var1.length, 0, 8, var1);

            for(int var4 = 0; var4 < 64; ++var4) {
               if (var3[var4] != this._r[var4]) {
                  throw new RuntimeException();
               }
            }
         }

         this.a440(var1, (byte)118);
      }
   }
}
