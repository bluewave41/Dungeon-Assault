import java.awt.Component;

class vn_ {
   int[] _q;
   private boolean _u = false;
   private static int _l;
   static boolean _g;
   private static bk_ _e;
   private long _b = kd_.c138(-2456);
   private int _d = 32;
   static int _t;
   private qb_ _h;
   private long _o = 0L;
   private int _a = 0;
   private qb_[] _n = new qb_[8];
   protected int _j;
   private long _m = 0L;
   private int _i = 0;
   private int _r = 0;
   private qb_[] _p = new qb_[8];
   private int _s;
   protected int _f;
   private int _c = 0;
   private boolean _k = true;

   final synchronized void a797() {
      if (!this._u) {
         long var1 = kd_.c138(-2456);

         try {
            if (var1 > this._b + 6000L) {
               this._b = var1 - 6000L;
            }

            while(var1 > this._b + 5000L) {
               this.a150(256);
               this._b += (long)(256000 / _t);
               var1 = kd_.c138(-2456);
            }
         } catch (Exception var6) {
            this._b = var1;
         }

         if (this._q != null) {
            try {
               if (this._o != 0L) {
                  if (var1 < this._o) {
                     return;
                  }

                  this.b150(this._j);
                  this._o = 0L;
                  this._k = true;
               }

               int var3 = this.f784();
               if (this._c - var3 > this._a) {
                  this._a = this._c - var3;
               }

               int var4 = this._f + this._s;
               if (var4 + 256 > 16384) {
                  var4 = 16128;
               }

               if (var4 + 256 > this._j) {
                  this._j += 1024;
                  if (this._j > 16384) {
                     this._j = 16384;
                  }

                  this.d797();
                  this.b150(this._j);
                  var3 = 0;
                  this._k = true;
                  if (var4 + 256 > this._j) {
                     var4 = this._j - 256;
                     this._s = var4 - this._f;
                  }
               }

               while(var3 < var4) {
                  this.a704(this._q, 256);
                  this.b797();
                  var3 += 256;
               }

               if (var1 > this._m) {
                  if (!this._k) {
                     if (this._a == 0 && this._i == 0) {
                        this.d797();
                        this._o = var1 + 2000L;
                        return;
                     }

                     this._s = Math.min(this._i, this._a);
                     this._i = this._a;
                  } else {
                     this._k = false;
                  }

                  this._a = 0;
                  this._m = var1 + 2000L;
               }

               this._c = var3;
            } catch (Exception var5) {
               this.d797();
               this._o = var1 + 2000L;
            }

         }
      }
   }

   final synchronized void c797() {
      if (_e != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (_e._g[var2] == this) {
               _e._g[var2] = null;
            }

            if (_e._g[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            _e._a = true;

            while(_e._d) {
               pj_.a054(0, 50L);
            }

            _e = null;
         }
      }

      this.d797();
      this._q = null;
      this._u = true;
   }

   void d797() {
   }

   final synchronized void a501(qb_ var1) {
      this._h = var1;
   }

   private final void a704(int[] var1, int var2) {
      int var3 = var2;
      if (_g) {
         var3 = var2 << 1;
      }

      cj_.a397(var1, 0, var3);
      this._r -= var2;
      if (this._h != null && this._r <= 0) {
         this._r += _t >> 4;
         b501(this._h);
         this.a312(this._h, this._h.b784());
         int var4 = 0;
         int var5 = 255;

         int var6;
         qb_ var10;
         label106:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  qb_ var11 = this._p[var7];

                  label100:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label100;
                        }

                        ap_ var12 = var11._k;
                        if (var12 != null && var12._i > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11._l;
                        } else {
                           var11._i = true;
                           int var13 = var11.a784();
                           var4 += var13;
                           if (var12 != null) {
                              var12._i += var13;
                           }

                           if (var4 >= this._d) {
                              break label106;
                           }

                           qb_ var14 = var11.d207();
                           if (var14 != null) {
                              for(int var15 = var11._j; var14 != null; var14 = var11.c207()) {
                                 this.a312(var14, var15 * var14.b784() >> 8);
                              }
                           }

                           qb_ var18 = var11._l;
                           var11._l = null;
                           if (var10 == null) {
                              this._p[var7] = var18;
                           } else {
                              var10._l = var18;
                           }

                           if (var18 == null) {
                              this._n[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            qb_ var16 = this._p[var6];
            qb_[] var17 = this._p;
            this._n[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16._l;
               var16._l = null;
            }
         }
      }

      if (this._r < 0) {
         this._r = 0;
      }

      if (this._h != null) {
         this._h.b397(var1, 0, var2);
      }

      this._b = kd_.c138(-2456);
   }

   int f784() throws Exception {
      return this._j;
   }

   private static final void b501(qb_ var0) {
      var0._i = false;
      if (var0._k != null) {
         var0._k._i = 0;
      }

      for(qb_ var1 = var0.d207(); var1 != null; var1 = var0.c207()) {
         b501(var1);
      }

   }

   void b150(int var1) throws Exception {
   }

   static final vn_ a393(qg_ var0, Component var1, int var2, int var3) {
      if (_t == 0) {
         throw new IllegalStateException();
      } else if (var2 >= 0 && var2 < 2) {
         if (var3 < 256) {
            var3 = 256;
         }

         try {
            wn_ var4 = new wn_();
            var4._q = new int[256 * (_g ? 2 : 1)];
            var4._f = var3;
            var4.a963(var1);
            var4._j = (var3 & -1024) + 1024;
            if (var4._j > 16384) {
               var4._j = 16384;
            }

            var4.b150(var4._j);
            if (_l > 0 && _e == null) {
               _e = new bk_();
               _e._h = var0;
               var0.a508(-21432, _l, _e);
            }

            if (_e != null) {
               if (_e._g[var2] != null) {
                  throw new IllegalArgumentException();
               }

               _e._g[var2] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new vn_();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void a773(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         _t = var0;
         _g = var1;
         _l = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   private final void a150(int var1) {
      this._r -= var1;
      if (this._r < 0) {
         this._r = 0;
      }

      if (this._h != null) {
         this._h.a150(var1);
      }

   }

   void a963(Component var1) throws Exception {
   }

   public static void e797() {
      _e = null;
   }

   private final void a312(qb_ var1, int var2) {
      int var3 = var2 >> 5;
      qb_ var4 = this._n[var3];
      if (var4 == null) {
         this._p[var3] = var1;
      } else {
         var4._l = var1;
      }

      this._n[var3] = var1;
      var1._j = var2;
   }

   void b797() throws Exception {
   }
}
