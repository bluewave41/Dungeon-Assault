final class em_ extends vf_ {
   ec_ _D;
   static volatile int _C = 0;
   byte _E;
   static String _F = "Select a goblin to sacrifice";
   int _G;

   public static void c487(boolean var0) {
      _F = null;
      if (!var0) {
         _C = 45;
      }

   }

   static final String e738(int var0) {
      if (ol_._i == ql_._f) {
         return td_._d;
      } else {
         if (var0 != 7142) {
            e738(-19);
         }

         return ek_._i;
      }
   }

   final int d410(byte var1) {
      if (var1 < 98) {
         this._G = -32;
      }

      return this._D == null ? 0 : 100 * this._D._o / (-this._E + this._D._m.length);
   }

   static final vk_ a953(String[] var0) {
      vk_ var1 = new vk_(false);
      var1._c = var0;
      return var1;
   }

   final byte[] b318(boolean var1) {
      if (!var1) {
         c487(false);
      }

      if (!super._v && this._D._o >= this._D._m.length - this._E) {
         return this._D._m;
      } else {
         throw new RuntimeException();
      }
   }
}
