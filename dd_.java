final class dd_ extends rj_ {
   static dd_ _E;
   static String _z = "Bottomless Pit";
   static int[] _A;
   static int[] _C = new int[]{45, 187, 495, 660, 885, 1039, 1230, 1410, 1674};
   int _G;
   int _F;
   private int _D;
   static wh_ _B;

   final void a183(boolean var1, int var2, int var3) {
      if (67 > var2) {
         var2 = 67;
      }

      super.a183(var1, var2, var3);
      this._D = var2 - 20;
   }

   static final int a417(int var0, boolean var1) {
      if (var1) {
         a417(44, true);
      }

      if (var0 >= 65536) {
         if (16777216 <= var0) {
            if (var0 < 268435456) {
               return 67108864 > var0 ? i_._u[var0 >> 18] >> 17 : i_._u[var0 >> 20] >> 18;
            } else {
               return 1073741824 > var0 ? i_._u[var0 >> 22] >> 19 : i_._u[var0 >> 24] >> 20;
            }
         } else if (var0 >= 1048576) {
            return var0 >= 4194304 ? i_._u[var0 >> 16] >> 16 : i_._u[var0 >> 14] >> 15;
         } else {
            return 262144 <= var0 ? i_._u[var0 >> 12] >> 14 : i_._u[var0 >> 10] >> 13;
         }
      } else if (var0 >= 256) {
         if (4096 <= var0) {
            return 16384 > var0 ? i_._u[var0 >> 6] >> 11 : i_._u[var0 >> 8] >> 12;
         } else {
            return 1024 > var0 ? i_._u[var0 >> 2] >> 9 : i_._u[var0 >> 4] >> 10;
         }
      } else {
         return 0 > var0 ? -1 : i_._u[var0] >> 8;
      }
   }

   public static void c423() {
      _A = null;
      _C = null;
      _E = null;
      _z = null;
      _B = null;
   }

   final void d326(int var1, int var2, int var3) {
      if (0 != this._D) {
         int var4 = (var1 - 33) * this._G / (this._D - 46);
         if (var4 > this._G) {
            var4 = this._G;
         }

         if (var2 != 128) {
            this.a093(41, -14);
         }

         if (0 > var4) {
            var4 = 0;
         }

         this._F = var4;
      }
   }

   final void b326(int var1, int var2, int var3) {
      int var4 = var1 + super._t;
      int var5 = super._i + var3;
      bp_.a131(var5, bl_._o, var4);
      bp_.a131(this._D + var5 + 10, go_._S, var4);

      int var6;
      for(var6 = 0; var6 < 7; ++var6) {
         te_.a812(var4 + 11, var6 + var5 + 6, this._D - 2, kc_._M);
      }

      for(var6 = 0; var6 < 3; ++var6) {
         qe_.a050(11 + var4, var5 + 5 - var6, this._D - 2, 0, 64 * (-var6 + 3));
         qe_.a050(11 + var4, var5 + 13 + var6, this._D - 2, 0, (3 - var6) * 64);
      }

      for(var6 = 1; this._D - 1 > var6; ++var6) {
         qe_.b050(var6 + 10 + var4, var5 + 7, 5, 0, -(var6 * 80 / this._D) + 144);
      }

      var6 = this._G == 0 ? 0 : (this._D - 46) * this._F / this._G;
      bp_.a131(4 + var5, im_._m, var6 + var4 + 10);
      tn_._W.h093(var4, var5);
      if (var2 != 8187) {
         _C = (int[])null;
      }

      dc_._x.h093(this._D + var4 + 10, var5);
      ml_._a.h093(var4 + 10 + var6, 4 + var5);
   }

   final void a093(int var1, int var2) {
      this._F += var2 * this._G >> 5;
      if (this._F > this._G) {
         this._F = this._G;
      }

      if (var1 != 1) {
         _z = (String)null;
      }

      if (0 > this._F) {
         this._F = 0;
      }

   }

   static final cn_ a510(int var0, cn_ var1) {
      cn_ var2 = new cn_(var0 * 2 + var1._y, 2 * var0 + var1._v);
      jh_.a303(var2);
      gf_.b050(0, 0, var2._y, var2._v, 16777215);

      for(int var3 = 0; var0 > var3; ++var3) {
         var1.e326(var0 - var1._w, var0 - var1._A, 0);
         gf_.d669(1, 1, 0, 0, var2._y, var2._v);
      }

      var2.h797();
      var1.e326(var0 - var1._w, var0 - var1._A, 0);
      jh_.b797();
      var2._w = var1._w - var0;
      var2._A = var1._A - var0;
      return var2;
   }

   final void a789(int var1, byte var2, int var3) {
      if (this._D != 0) {
         int var4 = this._G * (var3 - 33) / (this._D - 46);
         if (this._F < var4) {
            this._F += this._G >> 4;
         }

         if (var4 < this._F) {
            this._F -= this._G >> 4;
         }

         if (this._G < this._F) {
            this._F = this._G;
         }

         if (this._F < 0) {
            this._F = 0;
         }

         if (var2 > -59) {
            _C = (int[])null;
         }

      }
   }

   dd_(int var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var4, 19, var3);
      this._F = var6;
      this._G = var5;
      this._D = var4 - 20;
   }
}
