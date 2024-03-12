final class wd_ {
   static af_ _d;
   eh_ _i;
   private int _c;
   static nn_ _f;
   static int _j;
   int _e;
   private int _a;
   private int _b;
   static bf_[] _l;
   private int _h;
   private eh_ _g;
   eh_ _n;
   int _k;
   private int _m;

   final void a556(byte var1, int var2) {
      if (var1 == 109) {
         if (this._k != ga_._n) {
            if (this._k != li_._h) {
               this._c -= var2;

               do {
                  if (0 <= this._c) {
                     return;
                  }
               } while(this.b154(0));

            } else {
               this._e -= var2 >> 2;
               if (0 >= this._e) {
                  this._e = 0;
                  this._k = ga_._n;
               }

            }
         }
      }
   }

   final void a697(int var1, int var2, byte var3, int var4, int var5) {
      if (null != this._n) {
         if (this._e > 0) {
            this.a050(var2, 1, var1, var4, var5);
         }

         if (var3 == 102) {
            if (256 > this._e) {
               gf_.b669(var4, var2, var1, var5, 0, 256 - this._e);
            }

         }
      } else {
         gf_.b050(var4, var2, var1, var5, 0);
      }
   }

   final void a942(int var1, eh_ var2) {
      if (var1 < 8) {
         this.a556((byte)98, 50);
      }

      this.a721(rf_._M, var2, -10872);
   }

   private final void a423(byte var1) {
      if (this._n != null) {
         this._g = this._n;
         this._h = this._m + 1;
         if (var1 != 28) {
            _f = (nn_)null;
         }

         if (this._h >= this._n._c) {
            if (this._a != rl_._b) {
               if (this._a != rf_._M) {
                  this._g = null;
                  return;
               }

               this._h = 0;
               this._g = this._i;
            } else {
               this._h = 0;
            }
         }

      } else {
         this._g = null;
      }
   }

   static final void a013(byte var0, int var1, ue_ var2) {
      wj_ var3 = ac_._B;
      var3.d556((byte)-126, var1);
      ++var3._o;
      int var4 = var3._o;
      var3.a093(6, 1);
      if (null != var2._l) {
         var3.a093(6, var2._l.length);
         var3.a263(var2._l, 1, var2._l.length, 0);
      } else {
         var3.a093(6, 0);
      }

      var3.c543((byte)-106, var4);
      var3._o -= 4;
      if (var0 >= -68) {
         a013((byte)-67, -90, (ue_)null);
      }

      var2._k = var3.h137(-31);
      var3.c093(var3._o - var4, -1);
   }

   final void a721(int var1, eh_ var2, int var3) {
      this._a = var1;
      this._e = 256;
      this._m = 0;
      this._n = var2;
      if (null == this._n) {
         this._k = ga_._n;
      } else {
         this._b = this._n._j[0] * ji_.a760(320, false, 192) >>> 8;
         this._c = this._b;
         this._k = rl_._f;
         this.a423((byte)28);
      }

      if (var3 != -10872) {
         this.a050(39, -38, 55, 112, -35);
      }

   }

   private final boolean b154(int var1) {
      ++this._m;
      if (this._n._c <= this._m) {
         if (this._a != rl_._b) {
            if (rf_._M != this._a) {
               --this._m;
               this._e = 256;
               this._k = this._a;
               return false;
            }

            this.a721(rl_._b, this._i, -10872);
            return false;
         }

         this._m = 0;
      }

      if (var1 != 0) {
         a150(-49);
      }

      this._b = this._n._j[this._m] * ji_.a760(320, false, 192) >>> 8;
      this._c += this._b;
      this.a423((byte)28);
      return true;
   }

   wd_(eh_ var1) {
      this._i = var1;
      this.a721(rl_._b, this._i, -10872);
      if (null != this._i) {
         this.a556((byte)109, oi_.b080(0, this._i._f));
      }

   }

   private final void a050(int var1, int var2, int var3, int var4, int var5) {
      cn_ var6 = this._n.a571(var3, this._m, var5, 0);
      if (var6 != null) {
         if (var2 != 1) {
            this._a = -66;
         }

         var6.c093(var4, var1);
         if (null != this._g && (this._n != this._g || this._h != this._m)) {
            var6 = this._g.a571(var3, this._h, var5, var2 - 1);
            if (null != var6) {
               int var7 = -((this._c << 8) / this._b) + 256;
               ob_.a578(var6, var4, var7, var1, true);
            }
         }

      } else {
         gf_.b050(var4, var1, var3, var5, 0);
      }
   }

   public static void a150(int var0) {
      _f = null;
      _d = null;
      _l = null;
      if (var0 < 5) {
         a013((byte)-55, -32, (ue_)null);
      }

   }

   wd_(eh_ var1, eh_ var2, int var3) {
      this._i = var1;
      this.a721(var3, var2, -10872);
   }
}
