import java.util.Random;

final class md_ {
   static int _b = 20;
   static int _f;
   static Random _d = new Random(6L);
   ne_ _c = new ne_();
   static String _a = "FULL ACCESS";
   private ne_ _e;

   static int b080(int var0, int var1) {
      return var0 ^ var1;
   }

   final ne_ b081(byte var1) {
      ne_ var2 = this._c._e;
      if (var1 != -124) {
         this.a024(80);
      }

      if (var2 == this._c) {
         return null;
      } else {
         var2.a487(false);
         return var2;
      }
   }

   final void b150(int var1) {
      while(true) {
         ne_ var2 = this._c._e;
         if (var2 == this._c) {
            if (var1 != -4) {
               this.b865((ne_)null, false);
            }

            this._e = null;
            return;
         }

         var2.a487(false);
      }
   }

   final ne_ g024(int var1) {
      ne_ var2 = this._e;
      if (this._c != var2) {
         this._e = var2._a;
         if (var1 != 20) {
            this.a865((ne_)null, false);
         }

         return var2;
      } else {
         this._e = null;
         return null;
      }
   }

   static final void a093(int var0) {
      mo_._e = var0;
      if (nk_._Jb._b >= 0 && !nl_.a370(nk_._Jb._b)) {
         nk_._Jb._b = 1;
      }

   }

   final boolean a427(byte var1) {
      if (var1 > -55) {
         this._c = (ne_)null;
      }

      return this._c._e == this._c;
   }

   static final void a368(float var0, float var1, float var2, float var3, float var4, float var5) {
      if (null == bf_._h) {
         bf_._h = new ge_(wa_._j);
         hm_._n.a501(bf_._h);
      }

      bf_._h.f267(var4);
      bf_._h.e267(var1);
      bf_._h.d267(var5);
      bf_._h.a267(var3);
      bf_._h.b267(var0);
      bf_._h.c267(var2);
   }

   static final boolean f154() {
      return null == cm_._R ? rj_._o : true;
   }

   public static void h150(int var0) {
      _a = null;
      _d = null;
      if (var0 != -4) {
         h150(69);
      }

   }

   final void a865(ne_ var1, boolean var2) {
      if (var1._a != null) {
         var1.a487(var2);
      }

      var1._a = this._c._a;
      var1._e = this._c;
      var1._a._e = var1;
      var1._e._a = var1;
      if (var2) {
         _d = (Random)null;
      }

   }

   final ne_ a024(int var1) {
      if (var1 != 4) {
         a238(-3, (cn_)null);
      }

      ne_ var2 = this._e;
      if (var2 != this._c) {
         this._e = var2._e;
         return var2;
      } else {
         this._e = null;
         return null;
      }
   }

   final ne_ e024(int var1) {
      if (var1 != -24172) {
         _d = (Random)null;
      }

      ne_ var2 = this._c._e;
      if (var2 == this._c) {
         this._e = null;
         return null;
      } else {
         this._e = var2._e;
         return var2;
      }
   }

   final ne_ c024(int var1) {
      ne_ var2 = this._c._a;
      if (var1 != 0) {
         this._c = (ne_)null;
      }

      if (this._c != var2) {
         var2.a487(false);
         return var2;
      } else {
         return null;
      }
   }

   static final void a238(int var0, cn_ var1) {
      if (0 != (3 & (var1._A | var1._w | var1._v | var1._y))) {
         int var2 = (3 & var1._w) + var1._y;
         var2 += -(3 & var2) + 4;
         int var3 = (var1._A & 3) + var1._v;
         var3 -= (3 & var3) - 4;
         int[] var4 = new int[var3 * var2];
         int var5 = 0;
         int var6 = (3 & var1._w) + var2 * (var1._A & 3);
         int var7 = 0;
         if (var0 <= 42) {
            _f = -7;
         }

         while(var1._v > var7) {
            for(int var8 = 0; var1._y > var8; ++var8) {
               var4[var6++] = var1._B[var5++];
            }

            var6 += var2 - var1._y;
            ++var7;
         }

         var1._y = var2;
         var1._w &= -4;
         var1._v = var3;
         var1._A &= -4;
         var1._B = var4;
      }
   }

   final void b865(ne_ var1, boolean var2) {
      if (null != var1._a) {
         var1.a487(false);
      }

      if (var2) {
         _a = (String)null;
      }

      var1._a = this._c;
      var1._e = this._c._e;
      var1._a._e = var1;
      var1._e._a = var1;
   }

   final ne_ d024(int var1) {
      if (var1 != -14205) {
         _a = (String)null;
      }

      ne_ var2 = this._c._a;
      if (var2 != this._c) {
         this._e = var2._a;
         return var2;
      } else {
         this._e = null;
         return null;
      }
   }

   public md_() {
      this._c._e = this._c;
      this._c._a = this._c;
   }
}
