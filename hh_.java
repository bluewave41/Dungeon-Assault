import java.awt.Frame;

class hh_ implements ca_, th_ {
   int _e;
   static int _p = 320;
   static cn_ _o;
   static String[] _n = new String[]{"Stable", "The stable shows the <%raiders> currently under your control. It can hold a <%highlight>maximum of eight raiders</col> at any one time. The raiders available for hire are displayed in the panel to the left. As with rooms, <%highlight>more will become available as you gain Renown</col>."};
   int _d;
   int _f;
   static en_ _r;
   int _i;
   static rj_ _s;
   private boolean _m;
   int _g;
   static Frame _k;
   private int _q;
   int _l;
   int _j;
   se_ _u;
   int _v;
   int _t;
   int _a;
   static int _b;
   static boolean _c;
   static String[] _h = new String[]{"Revive", "With great expenditure of effort and numerous dark invocations, the <%0> is able to call the spirit of a dead raider back from the next world. The raider will be teleported back to your stable. (Single use)"};

   public final int a349(lm_ var1, int var2) {
      this.b865(-2, var1);
      return var2 != 8 ? -1 : var1._t.b137(263) + this._e + this._i;
   }

   public static void b150() {
      _r = null;
      _n = null;
      _h = null;
      _o = null;
      _k = null;
      _s = null;
   }

   hh_(se_ var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this(var1, var2, var2, var3, var3, var4, var5, var6, var7, var8, -1, Integer.MAX_VALUE, false);
   }

   static final int a080(int var0, int var1) {
      if (var1 == 0) {
         return 0;
      } else {
         int var2;
         if (var1 <= 0) {
            var2 = 2;
            if (var1 < -65536) {
               var1 >>= 16;
               var2 += 16;
            }

            if (var1 < -256) {
               var1 >>= 8;
               var2 += 8;
            }

            if (var0 != 1) {
               a080(-47, -9);
            }

            if (-16 > var1) {
               var1 >>= 4;
               var2 += 4;
            }

            if (var1 < -4) {
               var1 >>= 2;
               var2 += 2;
            }

            if (var1 < -2) {
               ++var2;
               var1 >>= 1;
            }

            return var2;
         } else {
            var2 = 1;
            if (var1 > 65535) {
               var1 >>= 16;
               var2 += 16;
            }

            if (var1 > 255) {
               var1 >>= 8;
               var2 += 8;
            }

            if (15 < var1) {
               var2 += 4;
               var1 >>= 4;
            }

            if (var1 > 3) {
               var1 >>= 2;
               var2 += 2;
            }

            if (1 < var1) {
               var1 >>= 1;
               ++var2;
            }

            return var2;
         }
      }
   }

   static final void a423() {
      if (ib_.a427()) {
         ae_.a183(false, 4, -1);
      }
   }

   private final int a231(int var1, lm_ var2, int var3, int var4) {
      if (var4 != -16736) {
         this.b865(96, (lm_)null);
      }

      return var2._A + var2._v + var3 + this._e + var1;
   }

   static final gp_ a921(nh_ var0, nh_ var1, int var2, int var3) {
      return !kk_.a283(var1, 1, var2, var3) ? null : wh_.a804(var0.b337(5, var2, var3));
   }

   private final int a669(int var1, int var2, lm_ var3, int var4) {
      return var4 > -63 ? 82 : var2 + var3._q + var1 - (-this._l - var3._j);
   }

   String b424(lm_ var1, int var2) {
      if (var2 != -444136767) {
         this.a669(-67, -5, (lm_)null, 68);
      }

      return var1._w;
   }

   public final int a605(int var1, int var2, int var3, int var4, lm_ var5, int var6) {
      if (var1 != 16) {
         a921((nh_)null, (nh_)null, 60, -28);
      }

      this.b865(-2, var5);
      return var5._t.a586(var3 - this.a437(var5, (byte)93, var4), -this.a387((byte)-85, var2, var5) + var6, (byte)-118);
   }

   private final int d353(int var1, lm_ var2) {
      return -this._i + -this._e + var2._s;
   }

   public final int a437(lm_ var1, byte var2, int var3) {
      return this.a669(var3, 0, var1, -120);
   }

   public void a623(byte var1, lm_ var2, int var3, int var4, boolean var5) {
      if (this._u != null) {
         this.a089(var2, var3, (byte)111, var4);
         if (var1 != 34) {
            this._j = 71;
         }

      }
   }

   private final void a941(byte var1, int var2, int var3, int var4, int var5, lm_ var6, int var7, int var8) {
      d_.a713(var6._q + var4, var8 + var6._v + var6._s, var6._q + var4 + var6._x, var6._v + var8);
      int var9 = this.c353(4, var6);
      int var10 = this.d353(-106, var6);
      if (!this._m) {
         int var13 = this._d;
         int var12;
         if (var13 != 0) {
            if (var13 != 2) {
               if (var13 != 3 && 1 == var13) {
               }

               var12 = (-this._u._E + var10 - this._u._H >> 1) + this._u._H;
            } else {
               var12 = var10 - this._u._E;
            }
         } else {
            var12 = this._u._H;
         }

         var13 = this._f;
         if (0 != var13 && var13 != 3) {
            if (var13 != 1) {
               if (var13 == 2) {
                  this._u.a191(this.b424(var6, -444136767), this.a669(var4, var7, var6, -104) + var9, this.a231(var5, var6, var8, -16736) + var12, var3, var2);
               }
            } else {
               this._u.c191(this.b424(var6, -444136767), (var9 >> 1) + this.a669(var4, var7, var6, -102), this.a231(var5, var6, var8, -16736) + var12, var3, var2);
            }
         } else {
            this._u.b191(this.b424(var6, -444136767), this.a669(var4, var7, var6, -109), this.a231(var5, var6, var8, -16736) + var12, var3, var2);
         }
      } else {
         this._u.a385(this.b424(var6, -444136767), this.a669(var4, var7, var6, -64), this.a231(var5, var6, var8, -16736), var9, var10, var3, var2, this._f, this._d, this._a);
      }

      ti_.c487(true);
   }

   public final int a137(int var1) {
      if (var1 <= 11) {
         this.a137(85);
      }

      return this._u._E + this._u._H;
   }

   public final void a923(lm_ var1, int var2, int var3, int var4, int var5) {
      if (var1.a427((byte)122)) {
         l_ var6 = this.b865(-2, var1);
         int var7 = var6.a080(0, var2);
         tg_ var8 = var6._e[var7];
         int var9 = var6.a543((byte)-128, var2);
         int var10 = this.a669(var5, var9, var1, var4 ^ 64);
         int var11 = this.a387((byte)-73, var3, var1) + Math.max(0, var8._m);
         int var12 = this.a387((byte)81, var3, var1) + Math.min(this.d353(92, var1), Math.min(var8._c, var6._e.length > var7 + 1 ? var6._e[var7 + 1]._m : var8._c));
         d_.a713(var1._q + var5, var1._v + var3 + var1._s, var1._q + var5 + var1._x, var3 + var1._v);
         hl_._a.a006(var10, var12, var11, var10, this._j, true);
         ti_.c487(true);
      }

      if (var4 != -1) {
         _h = (String[])null;
      }

   }

   public final int c353(int var1, lm_ var2) {
      if (var1 != 4) {
         this._l = -97;
      }

      return -this._v + -this._l + var2._x;
   }

   final void a446(byte var1, hh_ var2) {
      var2._d = this._d;
      var2._a = this._a;
      var2._i = this._i;
      var2._g = this._g;
      var2._u = this._u;
      var2._e = this._e;
      var2._j = this._j;
      var2._q = this._q;
      var2._t = this._t;
      var2._m = this._m;
      var2._v = this._v;
      var2._f = this._f;
      if (var1 > 124) {
         var2._l = this._l;
      }
   }

   private final void a089(lm_ var1, int var2, byte var3, int var4) {
      this.a941((byte)-64, this._q, this._g, var2, 0, var1, 0, var4);
      if (var3 < 91) {
         this.a089((lm_)null, -119, (byte)-24, -82);
      }

   }

   public final l_ b865(int var1, lm_ var2) {
      if (null == var2._t) {
         var2._t = new fe_();
      }

      if (var1 != -2) {
         _b = -86;
      }

      if (!this._m) {
         this.a063(var2, (byte)-113);
      } else {
         ((fe_)var2._t).a804(this.b424(var2, -444136767), 0, this._d, this.d353(var1 - 118, var2), this._f, this.c353(var1 + 6, var2), this._a, this._u);
      }

      return var2._t;
   }

   private final void a063(lm_ var1, byte var2) {
      if (var1._t == null) {
         var1._t = new fe_();
      }

      int var3 = this.c353(4, var1);
      int var4 = this.d353(68, var1);
      int var7 = this._d;
      int var5;
      if (var7 == 0) {
         var5 = this._u._H;
      } else if (var7 != 2) {
         if (3 != var7 && 1 != var7) {
         }

         var5 = this._u._H + (-this._u._H + (var4 - this._u._E) >> 1);
      } else {
         var5 = var4 - this._u._E;
      }

      var7 = this._f;
      if (0 != var7 && 3 != var7) {
         if (var7 != 1) {
            if (2 == var7 && var1._t instanceof fe_) {
               ((fe_)var1._t).a950(var3, (byte)81, this.b424(var1, -444136767), this._u, var5);
            }
         } else if (var1._t instanceof fe_) {
            ((fe_)var1._t).a972(var5, this.b424(var1, -444136767), this._u, (byte)-78, var3 >> 1);
         }
      } else if (var1._t instanceof fe_) {
         ((fe_)var1._t).a777(this.b424(var1, -444136767), -74, this._u, 0, var5);
      }

   }

   public final int a387(byte var1, int var2, lm_ var3) {
      return this.a231(0, var3, var2, -16736);
   }

   protected hh_() {
   }

   public final void a308(int var1, int var2, int var3, lm_ var4, int var5, int var6) {
      if (var6 != var1) {
         if (var4.a427((byte)18)) {
            l_ var8 = this.b865(-2, var4);
            int var9;
            int var10;
            if (var6 <= var1) {
               var9 = var6;
               var10 = var1;
            } else {
               var9 = var1;
               var10 = var6;
            }

            int var11 = var8.a080(0, var9);
            int var12 = var8.a080(0, var10);
            d_.a713(var2 + var4._q, var3 + var4._v + var4._s, var2 + var4._q + var4._x, var3 + var4._v);

            for(int var13 = var11; var13 <= var12; ++var13) {
               tg_ var14 = var8._e[var13];
               int var15 = var13 != var11 ? var14._k[0] : var8.a543((byte)-126, var9);
               int var16 = var12 == var13 ? var8.a543((byte)-127, var10) : (null != var14 ? var14._k[var14._k.length - 1] : 0);
               hl_._a.a370(var16 - var15, this.a669(var2, var15, var4, -75), var4._A + this._e + (var3 - (-var4._v - var14._m)), this._t, -85, this._t >>> 24, var14._c);
            }

            ti_.c487(true);
         }

      }
   }

   public final int a353(int var1, lm_ var2) {
      this.b865(-2, var2);
      return var1 < 59 ? 78 : var2._t.c137(-76) + this._l + this._v;
   }

   hh_(se_ var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      this._q = var7;
      this._d = var9;
      this._m = var13;
      this._e = var4;
      this._j = var11;
      this._l = var2;
      this._i = var5;
      this._t = var12;
      this._u = var1;
      this._f = var8;
      this._a = var10;
      this._v = var3;
      this._g = var6;
   }
}
