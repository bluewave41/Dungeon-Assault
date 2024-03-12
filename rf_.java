abstract class rf_ extends ii_ {
   private ji_ _R;
   static String _L = "Waiting for fonts";
   static fm_ _K;
   boolean _T;
   static int _M = 2;
   static cn_ _Q;
   static ob_ _O;
   static byte[][] _P;
   private int _U;
   static boolean _S;
   static String[] _N = new String[]{"Intimidate", "The frenzied, violent babbling of the <%0> does not make it easy for your raiders to sneak around a dungeon, but any monster they do encounter will have their <%attack> reduced by fear."};

   final void a115(int var1, int var2, int var3, int var4) {
      if (this._U != 0) {
         if (256 <= this._U) {
            if (var1 == 0) {
               this.a663(var4 + super._v, var2 + super._q, false);
               super.a115(var1, var2, var3 ^ 0, var4);
            }
         } else {
            if (np_._F == null || super._x > np_._F._y || np_._F._v < super._s) {
               np_._F = new cn_(super._x, super._s);
            }

            lm_.a901(np_._F);
            gf_.a797();
            this.a663(0, 0, false);
            super.a115(var1, -var2 - super._q, var3, -super._v - var4);
            ti_.c487(true);
            np_._F.d326(var2 + super._q, var4 + super._v, this._U);
         }
      }
   }

   final void b326(int var1, int var2, int var3) {
      this.b050(0, var3, -var2 + vf_._x >> 1, -var3 + hn_._t >> 1, var2);
   }

   static final q_[] a007(int var0, byte var1, nh_ var2, int var3) {
      if (kk_.a283(var2, 1, var3, var0)) {
         return var1 != -71 ? (q_[])null : vl_.d461();
      } else {
         return null;
      }
   }

   rf_(ji_ var1, int var2, int var3) {
      super(hn_._t - var2 >> 1, -var3 + vf_._x >> 1, var2, var3, (ca_)null);
      this._R = var1;
      this._U = 0;
      this._T = false;
   }

   static final q_ a102(int var0) {
      if (var0 != 10) {
         return (q_)null;
      } else {
         q_ var1 = new q_(14, 11, 2);
         var1._i[1] = 65793;

         int var2;
         for(var2 = 0; var2 < 6; ++var2) {
            og_.a348(var2 * 2 + 1, 10 - var2, var1, 5 - var2, (byte)1);
         }

         for(var2 = 6; var2 < 11; ++var2) {
            og_.a348(3, -var2 + 10, var1, 4, (byte)1);
         }

         return var1;
      }
   }

   public static void b487(boolean var0) {
      _P = (byte[][])null;
      _N = null;
      _O = null;
      _L = null;
      _Q = null;
      _K = null;
      if (var0) {
         _K = (fm_)null;
      }

   }

   boolean f427(byte var1) {
      int var2 = this.j137(78);
      if (var1 != -90) {
         this._R = (ji_)null;
      }

      int var3 = -this._U + var2;
      if (var3 > 0) {
         this._U += (8 + var3 - 1) / 8;
      }

      if (var3 < 0) {
         this._U += (var3 - 15) / 16;
      }

      return 0 == this._U && 0 == var2 && !this._T;
   }

   private final int j137(int var1) {
      if (var1 < 61) {
         a007(0, (byte)10, (nh_)null, -24);
      }

      return this._T ? (this._R.i149(32) != this ? 0 : 256) : 0;
   }

   boolean i154(int var1) {
      if (var1 != 462) {
         a102(-12);
      }

      this._U = this.j137(98);
      return this._U == 0 && !this._T;
   }

   abstract void a663(int var1, int var2, boolean var3);

   final lm_ g698(int var1) {
      lm_ var2 = super.g698(var1 ^ 0);
      if (var2 == null) {
         if (var1 != -20311) {
            this.f427((byte)104);
         }

         return this;
      } else {
         return var2;
      }
   }
}
