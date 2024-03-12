import java.applet.Applet;
import java.awt.Canvas;

final class pd_ extends rj_ {
   int _H;
   private int _F;
   static od_ _J = new od_();
   int _D;
   int _C;
   int _z;
   static String _E;
   static String _B = "Sound: ";
   static ef_ _A;
   static String _G = "Giant Spider";

   final void a093(int var1, int var2) {
      this._z += this._H * var2;
      if (this._C < this._z) {
         this._z = this._C;
      }

      if (var1 != 1) {
         this.a789(-97, (byte)28, -122);
      }

      if (0 > this._z) {
         this._z = 0;
      }

   }

   public static void c423() {
      _B = null;
      _G = null;
      _A = null;
      _E = null;
      _J = null;
   }

   final void d326(int var1, int var2, int var3) {
      if (0 != this._F) {
         int var4 = this.a417(var3, true);
         if (var4 > this._C) {
            var4 = this._C;
         }

         if (0 > var4) {
            var4 = 0;
         }

         this._z = var4;
         if (var2 != 128) {
            c603(57, 88);
         }

      }
   }

   final void b093(int var1, int var2) {
      if (var1 != 4973) {
         c603(-62, 37);
      }

      this.a115(var2 >> 5, -18566, var2, var2 >> 4);
   }

   static final boolean c603(int var0, int var1) {
      return vf_._w - 16 <= var1 && 16 + vf_._w + 200 > var1 && var0 >= qc_._w - 32 && 32 + wi_._kb + qc_._w > var0;
   }

   private final void a115(int var1, int var2, int var3, int var4) {
      this._H = var1 <= 0 ? 1 : var1;
      if (var2 != -18566) {
         this._F = 45;
      }

      this._D = var4 > 0 ? var4 : 1;
      this._C = var3;
   }

   static final void a035(Canvas var0) {
      ud_.a522(var0, -1);
      gn_.a649(var0);
      if (bn_._j != null) {
         bn_._j.a177(false, var0);
      }

   }

   static final void a587(int var0, Applet var1) {
      sm_.a715(var1, "");
      if (var0 != 5189) {
         c603(66, -39);
      }

      fk_.a587(var0 ^ 5137, var1);
   }

   final void a183(boolean var1, int var2, int var3) {
      if (67 > var3) {
         var3 = 47;
      }

      super.a183(var1, var2, var3);
      this._F = var3 - 20;
   }

   final void b326(int var1, int var2, int var3) {
      int var4 = var1 + super._t;
      int var5 = super._i + var3;
      bp_.a131(var5, hm_._q, var4);
      bp_.a131(this._F + var5 + 10, qf_._f, var4);

      int var6;
      for(var6 = 0; var6 < 7; ++var6) {
         te_.b812(var6 + 6 + var4, var5 + 11, this._F - 2, kc_._M);
      }

      for(var6 = 0; var6 < 3; ++var6) {
         qe_.b050(-var6 + var4 + 5, 11 + var5, this._F - 2, 0, 192 - var6 * 64);
         qe_.b050(var6 + 13 + var4, var5 + 11, this._F - 2, 0, (3 - var6) * 64);
      }

      for(var6 = 1; this._F - 1 > var6; ++var6) {
         qe_.a050(var4 + 7, var5 + 10 + var6, 5, 0, -(var6 * 80 / this._F) + 144);
      }

      bo_._Kb.h093(var4, var5);
      if (var2 == 8187) {
         ud_._y.h093(var4, this._F + var5 + 10);
         if (this._F >= 2 * qh_._q._v) {
            var6 = 0 != this._C ? this._z * (this._F - 46) / this._C : 0;
            bp_.a131(var6 + 10 + var5, ji_._G, 4 + var4);
            qh_._q.h093(var4 + 4, var6 + 10 + var5);
         } else {
            var6 = 0 != this._C ? this._z * (this._F - 23) / this._C : 0;
            gf_.e115(var4 + 4, var6 + var5 + 5, qh_._q._y + 4 + var4, qh_._q._v / 2 + var6 + 10 + var5 + 5);
            bp_.a131(10 + var5 + var6, ji_._G, var4 + 4);
            bp_.a131(var5 - (-10 - var6) - 23, ji_._G, 4 + var4);
            gf_.b797();
            qh_._q.c115(var4 + 4, var6 + var5 + 10, qh_._q._y, qh_._q._v / 2);
         }

      }
   }

   pd_(int var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, 19, var4, var3);
      this._z = var6;
      this._F = var4 - 20;
      this.b093(4973, var5);
   }

   final void a789(int var1, byte var2, int var3) {
      if (var2 <= -59) {
         if (this._F != 0) {
            int var4 = this.a417(var1, true);
            if (var4 <= this._z) {
               if (var4 < this._z) {
                  this._z -= this._D;
               }
            } else {
               this._z += this._D;
            }

            if (this._C < this._z) {
               this._z = this._C;
            }

            if (this._z < 0) {
               this._z = 0;
            }

         }
      }
   }

   private final int a417(int var1, boolean var2) {
      if (!var2) {
         this.b326(34, -43, 108);
      }

      int var3;
      if (qh_._q._v * 2 > this._F) {
         var3 = (var1 - 16) * this._C / (this._F - 23);
      } else {
         var3 = this._C * (var1 - 33) / (this._F - 46);
      }

      return var3;
   }
}
