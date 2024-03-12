final class ni_ extends qb_ {
   private int _o;
   private int _s;
   private int _u;
   private int _y;
   private int _t;
   private int _v;
   private int _w;
   private int _r;
   private int _x;
   private int _z;
   private int _A;
   private int _q;
   private int _m;
   private int _p;
   private boolean _n;

   final qb_ d207() {
      return null;
   }

   private static final int b072(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ni_ var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9._m += var9._v * (var6 - var3);
      var9._r += var9._o * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9._p = var4 >> 2;
      var9._u = var2 << 8;
      return var3;
   }

   final synchronized void e150(int var1) {
      this._z = var1;
   }

   final synchronized void a093(int var1, int var2) {
      this.a326(var1, var2, this.h784());
   }

   final synchronized void a150(int var1) {
      if (this._s > 0) {
         if (var1 >= this._s) {
            if (this._w == Integer.MIN_VALUE) {
               this._w = 0;
               this._r = 0;
               this._m = 0;
               this._p = 0;
               this.a487(false);
               var1 = this._s;
            }

            this._s = 0;
            this.g797();
         } else {
            this._p += this._x * var1;
            this._m += this._v * var1;
            this._r += this._o * var1;
            this._s -= var1;
         }
      }

      va_ var2 = (va_)super._k;
      int var3 = this._t << 8;
      int var4 = this._y << 8;
      int var5 = var2._k.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this._z = 0;
      }

      if (this._u < 0) {
         if (this._q <= 0) {
            this.k797();
            this.a487(false);
            return;
         }

         this._u = 0;
      }

      if (this._u >= var5) {
         if (this._q >= 0) {
            this.k797();
            this.a487(false);
            return;
         }

         this._u = var5 - 1;
      }

      this._u += this._q * var1;
      if (this._z < 0) {
         if (!this._n) {
            if (this._q < 0) {
               if (this._u >= var3) {
                  return;
               }

               this._u = var4 - 1 - (var4 - 1 - this._u) % var6;
            } else {
               if (this._u < var4) {
                  return;
               }

               this._u = var3 + (this._u - var3) % var6;
            }

         } else {
            if (this._q < 0) {
               if (this._u >= var3) {
                  return;
               }

               this._u = var3 + var3 - 1 - this._u;
               this._q = -this._q;
            }

            while(this._u >= var4) {
               this._u = var4 + var4 - 1 - this._u;
               this._q = -this._q;
               if (this._u >= var3) {
                  return;
               }

               this._u = var3 + var3 - 1 - this._u;
               this._q = -this._q;
            }

         }
      } else {
         if (this._z > 0) {
            if (this._n) {
               label121: {
                  if (this._q < 0) {
                     if (this._u >= var3) {
                        return;
                     }

                     this._u = var3 + var3 - 1 - this._u;
                     this._q = -this._q;
                     if (--this._z == 0) {
                        break label121;
                     }
                  }

                  do {
                     if (this._u < var4) {
                        return;
                     }

                     this._u = var4 + var4 - 1 - this._u;
                     this._q = -this._q;
                     if (--this._z == 0) {
                        break;
                     }

                     if (this._u >= var3) {
                        return;
                     }

                     this._u = var3 + var3 - 1 - this._u;
                     this._q = -this._q;
                  } while(--this._z != 0);
               }
            } else {
               label153: {
                  int var7;
                  if (this._q < 0) {
                     if (this._u >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this._u) / var6;
                     if (var7 >= this._z) {
                        this._u += var6 * this._z;
                        this._z = 0;
                        break label153;
                     }

                     this._u += var6 * var7;
                     this._z -= var7;
                  } else {
                     if (this._u < var4) {
                        return;
                     }

                     var7 = (this._u - var3) / var6;
                     if (var7 >= this._z) {
                        this._u -= var6 * this._z;
                        this._z = 0;
                        break label153;
                     }

                     this._u -= var6 * var7;
                     this._z -= var7;
                  }

                  return;
               }
            }
         }

         if (this._q < 0) {
            if (this._u < 0) {
               this._u = -1;
               this.k797();
               this.a487(false);
            }
         } else if (this._u >= var5) {
            this._u = var5;
            this.k797();
            this.a487(false);
         }

      }
   }

   final qb_ c207() {
      return null;
   }

   private final void g797() {
      this._p = this._w;
      this._m = b080(this._w, this._A);
      this._r = d080(this._w, this._A);
   }

   private static final int b017(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, ni_ var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10._u = var4;
      return var5;
   }

   final synchronized void h150(int var1) {
      this.c093(var1, this.h784());
   }

   final synchronized void b487(boolean var1) {
      this._q = (this._q ^ this._q >> 31) + (this._q >>> 31);
      if (var1) {
         this._q = -this._q;
      }

   }

   private static final int d080(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   private final int a682(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this._s > 0) {
            int var6 = var2 + this._s;
            if (var6 > var4) {
               var6 = var4;
            }

            this._s += var2;
            if (this._q == -256 && (this._u & 255) == 0) {
               if (vn_._g) {
                  var2 = b561(0, ((va_)super._k)._k, var1, this._u, var2, this._m, this._r, this._v, this._o, 0, var6, var3, this);
               } else {
                  var2 = a072(((va_)super._k)._k, var1, this._u, var2, this._p, this._x, 0, var6, var3, this);
               }
            } else if (vn_._g) {
               var2 = b568(0, 0, ((va_)super._k)._k, var1, this._u, var2, this._m, this._r, this._v, this._o, 0, var6, var3, this, this._q, var5);
            } else {
               var2 = b824(0, 0, ((va_)super._k)._k, var1, this._u, var2, this._p, this._x, 0, var6, var3, this, this._q, var5);
            }

            this._s -= var2;
            if (this._s != 0) {
               return var2;
            }

            if (!this.j801()) {
               continue;
            }

            return var4;
         }

         if (this._q == -256 && (this._u & 255) == 0) {
            if (vn_._g) {
               return b175(0, ((va_)super._k)._k, var1, this._u, var2, this._m, this._r, 0, var4, var3, this);
            }

            return a817(((va_)super._k)._k, var1, this._u, var2, this._p, 0, var4, var3, this);
         }

         if (vn_._g) {
            return c824(0, 0, ((va_)super._k)._k, var1, this._u, var2, this._m, this._r, 0, var4, var3, this, this._q, var5);
         }

         return b017(0, 0, ((va_)super._k)._k, var1, this._u, var2, this._p, 0, var4, var3, this, this._q, var5);
      }
   }

   private static final int a817(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, ni_ var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8._u = var2 << 8;
      return var3;
   }

   private static final int a561(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ni_ var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12._p += var12._x * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12._m = var5 >> 2;
      var12._r = var6 >> 2;
      var12._u = var3 << 8;
      return var4 >> 1;
   }

   final synchronized int i784() {
      return this._w == Integer.MIN_VALUE ? 0 : this._w;
   }

   private static final int a568(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, ni_ var13, int var14, int var15) {
      var13._p -= var13._x * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13._p += var13._x * var5;
      var13._m = var6;
      var13._r = var7;
      var13._u = var4;
      return var5;
   }

   final synchronized boolean f801() {
      return this._u < 0 || this._u >= ((va_)super._k)._k.length << 8;
   }

   private final synchronized void c093(int var1, int var2) {
      this._w = var1;
      this._A = var2;
      this._s = 0;
      this.g797();
   }

   private static final int a824(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ni_ var11, int var12, int var13) {
      var11._m -= var11._v * var5;
      var11._r -= var11._o * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11._m += var11._v * var5;
      var11._r += var11._o * var5;
      var11._p = var6;
      var11._u = var4;
      return var5;
   }

   final synchronized void d150(int var1) {
      this.c093(var1 << 6, this.h784());
   }

   final int b784() {
      int var1 = this._p * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this._z == 0) {
         var1 -= var1 * this._u / (((va_)super._k)._k.length << 8);
      } else if (this._z >= 0) {
         var1 -= var1 * this._t / ((va_)super._k)._k.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   final synchronized void a326(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.c093(var2, var3);
      } else {
         int var4 = b080(var2, var3);
         int var5 = d080(var2, var3);
         if (this._m == var4 && this._r == var5) {
            this._s = 0;
         } else {
            int var6 = var2 - this._p;
            if (this._p - var2 > var6) {
               var6 = this._p - var2;
            }

            if (var4 - this._m > var6) {
               var6 = var4 - this._m;
            }

            if (this._m - var4 > var6) {
               var6 = this._m - var4;
            }

            if (var5 - this._r > var6) {
               var6 = var5 - this._r;
            }

            if (this._r - var5 > var6) {
               var6 = this._r - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this._s = var1;
            this._w = var2;
            this._A = var3;
            this._x = (var2 - this._p) / var1;
            this._v = (var4 - this._m) / var1;
            this._o = (var5 - this._r) / var1;
         }
      }
   }

   private static final int b561(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ni_ var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12._p += var12._x * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12._m = var5 >> 2;
      var12._r = var6 >> 2;
      var12._u = var3 << 8;
      return var4 >> 1;
   }

   private static final int c824(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ni_ var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11._u = var4;
      return var5 >> 1;
   }

   final synchronized int h784() {
      return this._A < 0 ? -1 : this._A;
   }

   private static final int b080(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   private static final int b824(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ni_ var11, int var12, int var13) {
      var11._m -= var11._v * var5;
      var11._r -= var11._o * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11._m += var11._v * var5;
      var11._r += var11._o * var5;
      var11._p = var6;
      var11._u = var4;
      return var5;
   }

   private static final int a175(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ni_ var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10._u = var3 << 8;
      return var4 >> 1;
   }

   private final void k797() {
      if (this._s != 0) {
         if (this._w == Integer.MIN_VALUE) {
            this._w = 0;
         }

         this._s = 0;
         this.g797();
      }

   }

   private static final int b817(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, ni_ var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8._u = var2 << 8;
      return var3;
   }

   private final boolean j801() {
      int var1 = this._w;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = b080(var1, this._A);
         var3 = d080(var1, this._A);
      }

      if (this._p == var1 && this._m == var2 && this._r == var3) {
         if (this._w == Integer.MIN_VALUE) {
            this._w = 0;
            this._r = 0;
            this._m = 0;
            this._p = 0;
            this.a487(false);
            return true;
         } else {
            this.g797();
            return false;
         }
      } else {
         if (this._p < var1) {
            this._x = 1;
            this._s = var1 - this._p;
         } else if (this._p > var1) {
            this._x = -1;
            this._s = this._p - var1;
         } else {
            this._x = 0;
         }

         if (this._m < var2) {
            this._v = 1;
            if (this._s == 0 || this._s > var2 - this._m) {
               this._s = var2 - this._m;
            }
         } else if (this._m > var2) {
            this._v = -1;
            if (this._s == 0 || this._s > this._m - var2) {
               this._s = this._m - var2;
            }
         } else {
            this._v = 0;
         }

         if (this._r < var3) {
            this._o = 1;
            if (this._s == 0 || this._s > var3 - this._r) {
               this._s = var3 - this._r;
            }
         } else if (this._r > var3) {
            this._o = -1;
            if (this._s == 0 || this._s > this._r - var3) {
               this._s = this._r - var3;
            }
         } else {
            this._o = 0;
         }

         return false;
      }
   }

   private static final int d824(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ni_ var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11._u = var4;
      return var5 >> 1;
   }

   final synchronized void f150(int var1) {
      if (var1 == 0) {
         this.h150(0);
         this.a487(false);
      } else if (this._m == 0 && this._r == 0) {
         this._s = 0;
         this._w = 0;
         this._p = 0;
         this.a487(false);
      } else {
         int var2 = -this._p;
         if (this._p > var2) {
            var2 = this._p;
         }

         if (-this._m > var2) {
            var2 = -this._m;
         }

         if (this._m > var2) {
            var2 = this._m;
         }

         if (-this._r > var2) {
            var2 = -this._r;
         }

         if (this._r > var2) {
            var2 = this._r;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this._s = var1;
         this._w = Integer.MIN_VALUE;
         this._x = -this._p / var1;
         this._v = -this._m / var1;
         this._o = -this._r / var1;
      }
   }

   final synchronized void g150(int var1) {
      if (this._q < 0) {
         this._q = -var1;
      } else {
         this._q = var1;
      }

   }

   private static final int b175(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ni_ var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10._u = var3 << 8;
      return var4 >> 1;
   }

   static final ni_ a071(va_ var0, int var1, int var2) {
      return var0._k != null && var0._k.length != 0 ? new ni_(var0, var1, var2 << 6) : null;
   }

   static final ni_ a456(va_ var0, int var1, int var2, int var3) {
      return var0._k != null && var0._k.length != 0 ? new ni_(var0, var1, var2, var3) : null;
   }

   final synchronized void i150(int var1) {
      int var2 = ((va_)super._k)._k.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this._u = var1;
   }

   final int a784() {
      return this._w == 0 && this._s == 0 ? 0 : 1;
   }

   final synchronized void b397(int[] var1, int var2, int var3) {
      if (this._w == 0 && this._s == 0) {
         this.a150(var3);
      } else {
         va_ var4 = (va_)super._k;
         int var5 = this._t << 8;
         int var6 = this._y << 8;
         int var7 = var4._k.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this._z = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this._u < 0) {
            if (this._q <= 0) {
               this.k797();
               this.a487(false);
               return;
            }

            this._u = 0;
         }

         if (this._u >= var7) {
            if (this._q >= 0) {
               this.k797();
               this.a487(false);
               return;
            }

            this._u = var7 - 1;
         }

         if (this._z < 0) {
            if (this._n) {
               if (this._q < 0) {
                  var9 = this.a682(var1, var2, var5, var3, var4._k[this._t]);
                  if (this._u >= var5) {
                     return;
                  }

                  this._u = var5 + var5 - 1 - this._u;
                  this._q = -this._q;
               }

               while(true) {
                  var9 = this.b682(var1, var9, var6, var3, var4._k[this._y - 1]);
                  if (this._u < var6) {
                     return;
                  }

                  this._u = var6 + var6 - 1 - this._u;
                  this._q = -this._q;
                  var9 = this.a682(var1, var9, var5, var3, var4._k[this._t]);
                  if (this._u >= var5) {
                     return;
                  }

                  this._u = var5 + var5 - 1 - this._u;
                  this._q = -this._q;
               }
            } else if (this._q < 0) {
               while(true) {
                  var9 = this.a682(var1, var9, var5, var3, var4._k[this._y - 1]);
                  if (this._u >= var5) {
                     return;
                  }

                  this._u = var6 - 1 - (var6 - 1 - this._u) % var8;
               }
            } else {
               while(true) {
                  var9 = this.b682(var1, var9, var6, var3, var4._k[this._t]);
                  if (this._u < var6) {
                     return;
                  }

                  this._u = var5 + (this._u - var5) % var8;
               }
            }
         } else {
            if (this._z > 0) {
               if (this._n) {
                  label131: {
                     if (this._q < 0) {
                        var9 = this.a682(var1, var2, var5, var3, var4._k[this._t]);
                        if (this._u >= var5) {
                           return;
                        }

                        this._u = var5 + var5 - 1 - this._u;
                        this._q = -this._q;
                        if (--this._z == 0) {
                           break label131;
                        }
                     }

                     do {
                        var9 = this.b682(var1, var9, var6, var3, var4._k[this._y - 1]);
                        if (this._u < var6) {
                           return;
                        }

                        this._u = var6 + var6 - 1 - this._u;
                        this._q = -this._q;
                        if (--this._z == 0) {
                           break;
                        }

                        var9 = this.a682(var1, var9, var5, var3, var4._k[this._t]);
                        if (this._u >= var5) {
                           return;
                        }

                        this._u = var5 + var5 - 1 - this._u;
                        this._q = -this._q;
                     } while(--this._z != 0);
                  }
               } else {
                  int var10;
                  if (this._q < 0) {
                     while(true) {
                        var9 = this.a682(var1, var9, var5, var3, var4._k[this._y - 1]);
                        if (this._u >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this._u) / var8;
                        if (var10 >= this._z) {
                           this._u += var8 * this._z;
                           this._z = 0;
                           break;
                        }

                        this._u += var8 * var10;
                        this._z -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.b682(var1, var9, var6, var3, var4._k[this._t]);
                        if (this._u < var6) {
                           return;
                        }

                        var10 = (this._u - var5) / var8;
                        if (var10 >= this._z) {
                           this._u -= var8 * this._z;
                           this._z = 0;
                           break;
                        }

                        this._u -= var8 * var10;
                        this._z -= var10;
                     }
                  }
               }
            }

            if (this._q < 0) {
               this.a682(var1, var9, 0, var3, 0);
               if (this._u < 0) {
                  this._u = -1;
                  this.k797();
                  this.a487(false);
               }
            } else {
               this.b682(var1, var9, var7, var3, 0);
               if (this._u >= var7) {
                  this._u = var7;
                  this.k797();
                  this.a487(false);
               }
            }

         }
      }
   }

   static final ni_ b071(va_ var0, int var1, int var2) {
      return var0._k != null && var0._k.length != 0 ? new ni_(var0, (int)((long)var0._n * 256L * (long)var1 / (long)(100 * vn_._t)), var2 << 6) : null;
   }

   final synchronized int l784() {
      return this._q < 0 ? -this._q : this._q;
   }

   private static final int a072(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ni_ var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9._m += var9._v * (var6 - var3);
      var9._r += var9._o * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9._p = var4 >> 2;
      var9._u = var2 << 8;
      return var3;
   }

   private static final int a017(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, ni_ var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10._u = var4;
      return var5;
   }

   final synchronized boolean e801() {
      return this._s != 0;
   }

   private static final int b568(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, ni_ var13, int var14, int var15) {
      var13._p -= var13._x * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13._p += var13._x * var5;
      var13._m = var6;
      var13._r = var7;
      var13._u = var4;
      return var5;
   }

   private final int b682(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this._s > 0) {
            int var6 = var2 + this._s;
            if (var6 > var4) {
               var6 = var4;
            }

            this._s += var2;
            if (this._q == 256 && (this._u & 255) == 0) {
               if (vn_._g) {
                  var2 = a561(0, ((va_)super._k)._k, var1, this._u, var2, this._m, this._r, this._v, this._o, 0, var6, var3, this);
               } else {
                  var2 = b072(((va_)super._k)._k, var1, this._u, var2, this._p, this._x, 0, var6, var3, this);
               }
            } else if (vn_._g) {
               var2 = a568(0, 0, ((va_)super._k)._k, var1, this._u, var2, this._m, this._r, this._v, this._o, 0, var6, var3, this, this._q, var5);
            } else {
               var2 = a824(0, 0, ((va_)super._k)._k, var1, this._u, var2, this._p, this._x, 0, var6, var3, this, this._q, var5);
            }

            this._s -= var2;
            if (this._s != 0) {
               return var2;
            }

            if (!this.j801()) {
               continue;
            }

            return var4;
         }

         if (this._q == 256 && (this._u & 255) == 0) {
            if (vn_._g) {
               return a175(0, ((va_)super._k)._k, var1, this._u, var2, this._m, this._r, 0, var4, var3, this);
            }

            return b817(((va_)super._k)._k, var1, this._u, var2, this._p, 0, var4, var3, this);
         }

         if (vn_._g) {
            return d824(0, 0, ((va_)super._k)._k, var1, this._u, var2, this._m, this._r, 0, var4, var3, this, this._q, var5);
         }

         return a017(0, 0, ((va_)super._k)._k, var1, this._u, var2, this._p, 0, var4, var3, this, this._q, var5);
      }
   }

   private ni_(va_ var1, int var2, int var3) {
      super._k = var1;
      this._t = var1._l;
      this._y = var1._m;
      this._n = var1._j;
      this._q = var2;
      this._w = var3;
      this._A = 8192;
      this._u = 0;
      this.g797();
   }

   private ni_(va_ var1, int var2, int var3, int var4) {
      super._k = var1;
      this._t = var1._l;
      this._y = var1._m;
      this._n = var1._j;
      this._q = var2;
      this._w = var3;
      this._A = var4;
      this._u = 0;
      this.g797();
   }
}
