final class nn_ extends ne_ {
   static String _k;
   gd_ _l;
   private md_ _m = new md_();
   private boolean _i;
   static int[] _j;

   final void a423(byte var1) {
      if (var1 == 80) {
         for(ie_ var2 = (ie_)this._m.e024(var1 ^ -24124); var2 != null; var2 = (ie_)this._m.a024(4)) {
            var2._m._p = mo_._a;
            var2._m._m = mo_._a - 256;
            if (var2._m._B) {
               var2._m._L = mo_._a;
            }

            var2._m._B = false;
         }

         this._l = null;
      }
   }

   nn_(boolean var1) {
      this._i = var1;
   }

   final void a780(gd_ var1, int var2) {
      ie_ var3 = (ie_)this._m.e024(-24172);
      if (var2 != -256) {
         this._l = (gd_)null;
      }

      for(; null != var3; var3 = (ie_)this._m.a024(4)) {
         var3._m._m = mo_._a - 256;
         var3._m._p = mo_._a;
         if (var3._m != var1 && var3._m._B) {
            var3._m._B = false;
            var3._m._L = mo_._a;
         }
      }

      var1._C = mo_._a;
      var1._B = true;
      this._l = var1;
   }

   private final void b780(gd_ var1, int var2) {
      if (this == var1._M) {
         if (var2 != 29339) {
            _k = (String)null;
         }

         for(ie_ var3 = (ie_)this._m.e024(-24172); var3 != null; var3 = (ie_)this._m.a024(4)) {
            if (var3._m == var1) {
               var3.a487(false);
            }
         }

         var1._M = null;
      } else {
         throw new RuntimeException();
      }
   }

   final void a507(gd_ var1, byte var2) {
      if (var1._M != null) {
         var1._M.b780(var1, 29339);
      }

      var1._M = this;

      for(ie_ var3 = (ie_)this._m.e024(var2 ^ 24184); null != var3; var3 = (ie_)this._m.a024(var2 + 24)) {
         if (var1 == var3._m) {
            return;
         }
      }

      this._m.a865(new ie_(var1), false);
      if (var2 != -20) {
         this._l = (gd_)null;
      }

   }

   public static void b423(byte var0) {
      _k = null;
      _j = null;
      if (var0 != -80) {
         b423((byte)94);
      }

   }

   final void a761(byte var1, gd_ var2) {
      if (this._i) {
         for(ie_ var3 = (ie_)this._m.e024(-24172); null != var3; var3 = (ie_)this._m.a024(4)) {
            var3._m._m = mo_._a - 256;
            var3._m._p = mo_._a;
         }

         var2._L = mo_._a;
         if (var2 == this._l) {
            this._l = null;
         }

         var2._B = false;
      }
   }
}
