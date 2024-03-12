import java.util.Random;

class gd_ extends rj_ {
   cn_ _K;
   nn_ _M;
   cn_ _H;
   int _C;
   static String _D = "Warning: if you quit, you will lose any game you are in the middle of!";
   static String _J = "Connection restored.";
   static qk_ _G;
   static cn_ _A;
   cn_ _z;
   cn_ _I;
   int _L;
   boolean _F;
   static cn_ _E;
   boolean _B;
   cn_ _N;

   private gd_(cn_ var1, cn_ var2, cn_ var3, cn_ var4, cn_ var5, int var6, int var7, int var8) {
      super(var6, var7, var1._y, var1._v, var8);
      this._H = var4;
      this._K = var1;
      this._F = true;
      this._I = var3;
      this._z = var2;
      this._N = var5;
   }

   void b326(int var1, int var2, int var3) {
      if (this._F) {
         int var4 = var1 + super._t;
         int var5 = super._i + var3;
         if (super._w) {
            int var6 = !this._B ? this._L : mo_._a;
            int var7 = var6 - this._C >> 2;
            if (var7 > 64) {
               var7 = 64;
            }

            int var8 = var7 - mo_._a + this._L;
            int var9;
            int var10;
            if (!this._B && 0 >= var8) {
               var9 = this == wi_._ob ? mo_._a : super._p;
               var7 = -super._m + var9 >> 2;
               if (var7 > 64) {
                  var7 = 64;
               }

               var8 = var7 + -mo_._a + super._p;
               if (this != wi_._ob && 0 >= var8) {
                  this._K.h093(var4, var5);
               } else {
                  if (this == wi_._ob) {
                     this._z.h093(var4, var5);
                     var10 = var7;
                  } else {
                     this._K.h093(var4, var3 + super._i);
                     var10 = var8;
                     this._z.d326(var4, var5, 4 * var8);
                  }

                  int var11 = (int)((double)var10 * (te_.c503(mo_._a, this.hashCode(), 0.125) + 2.0));
                  if (var11 < 0) {
                     var11 = 0;
                  }

                  this._I.b326(var4, var5, var11);
               }
            } else {
               this._H.h093(var4, var5);
               if (!this._B) {
                  this._K.h093(var4, var3 + super._i);
                  var9 = var8;
                  this._H.d326(var4, var5, 4 * var8);
               } else {
                  var9 = var7;
               }

               var10 = (int)((double)var9 * (2.0 + te_.c503(mo_._a, this.hashCode(), 0.125)));
               if (var10 < 0) {
                  var10 = 0;
               }

               this._N.b326(var4, var5, var10);
            }
         } else {
            this._K.h093(var4, var5);
         }

         if (var2 != 8187) {
            a364(31, (cf_)null);
         }

      }
   }

   static final o_ a364(int var0, cf_ var1) {
      if (var0 != 64) {
         a364(119, (cf_)null);
      }

      fa_ var2 = cf_.a319(var1._e, var1._a);
      return new o_(var2, var1._a);
   }

   static final void a778(int var0, int var1, int var2, boolean var3) {
      g_._Hb = var0;
      if (fc_.a370(mn_._b)) {
         bf_._f[mn_._b].c797();
      }

      a364(64, mh_._f);
      te_.b797();
      co_._G = new vj_(0, var1, 640, 480, 64);
      mn_._b = var2;
      dc_._z = var2;
      bd_._f = 0;
      if (!fc_.a370(dc_._z)) {
         if (dc_._z == -1 && null != ik_._e) {
            ik_._e.f423((byte)-127);
         }
      } else {
         System.gc();
         bf_._f[dc_._z].b487(var3);
         if (12 == dc_._z) {
            m_.a430(var1 ^ 115, var3);
         }
      }

   }

   private final void a451(boolean var1, cn_ var2) {
      this._K = this._z = var2;
      super.a183(!var1, this._K._y, this._K._v);
      if (!var1) {
         this.a789(127, (byte)31, -35);
      }

   }

   final void a183(boolean var1, int var2, int var3) {
      if (var1) {
         this._F = true;
      }

      throw new RuntimeException("Unsupported");
   }

   static final int a518(Random var0) {
      int var1 = uj_.a004(var0, 37, h_._j);
      int var2 = wl_._e[var1];
      wl_._e[var1] = wl_._e[--h_._j];
      return var2;
   }

   final void a789(int var1, byte var2, int var3) {
      if (var2 >= -59) {
         this._K = (cn_)null;
      }

      super.a789(var1, (byte)-113, var3);
      if (this._B) {
         if (this._M != null) {
            this._M.a761((byte)-86, this);
         } else {
            this._L = mo_._a;
            this._B = false;
         }
      } else if (null != this._M) {
         this._M.a780(this, -256);
      } else {
         this._C = mo_._a;
         this._B = true;
      }

   }

   gd_(int var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      this._F = true;
   }

   gd_(cn_ var1, cn_ var2, cn_ var3, cn_ var4, cn_ var5, int var6, int var7) {
      this(var1, var2, var3, var4, var5, var6, var7, 0);
   }

   public static void e150() {
      _A = null;
      _D = null;
      _J = null;
      _E = null;
      _G = null;
   }

   final void a037(cn_ var1, cn_ var2, cn_ var3, cn_ var4, byte var5, cn_ var6) {
      this.a451(true, var2);
      this._H = var1;
      this._z = var4;
      this._N = var3;
      if (var5 > 101) {
         this._I = var6;
      }
   }
}
