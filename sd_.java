final class sd_ extends da_ {
   int _H;
   static ef_ _G = new ef_();
   static String _I = "Saurus Warrior";
   static int _J;
   static int[] _F = new int[12];

   sd_(lm_ var1) {
      super(var1._q, var1._v, var1._x, var1._s, (ca_)null, (pg_)null);
      var1.b050(0, super._x, 0, 0, super._s);
      this._H = 256;
      super._D = var1;
   }

   static final void a294(int var0, cn_ var1, int var2, int var3, int var4) {
      var1.h093(var0, var4);
      db_._v.b191(Integer.toString(var3), 20 + var0, var4 + (la_._b._H + var1._v >> 1), var2, -1);
   }

   public static void b487(boolean var0) {
      _F = null;
      _G = null;
      if (var0) {
         b487(true);
      }

      _I = null;
   }

   public sd_() {
      super(0, 0, 0, 0, (ca_)null, (pg_)null);
      this._H = 256;
   }

   final void a115(int var1, int var2, int var3, int var4) {
      if (0 == var1) {
         if (null != super._D) {
            if (0 != this._H) {
               if (this._H != 256) {
                  cn_ var5 = new cn_(super._D._x, super._D._s);
                  lm_.a901(var5);
                  super._D.a115(var1, 0, var3 ^ 0, var3);
                  ti_.c487(true);
                  var5.d326(var2 + super._q, super._v + var4, this._H);
               } else {
                  super._D.a115(var1, super._q + var2, 0, super._v + var4);
               }
            }
         }
      }
   }
}
