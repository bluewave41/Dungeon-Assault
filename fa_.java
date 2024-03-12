final class fa_ extends ne_ {
   static String _k = "A vast pit occupies almost all of this room, except for a narrow ledge. There is no way to gauge its depth. A raider who falls here will continue falling for some time.<br><br>This trap will kill defeated raiders, even if they have abilities that would normally prevent death.";
   static boolean _j;
   int _l;
   ne_ _o;
   static String _m = "Achieved";
   static int _i;
   ni_ _n;

   static final int a666(int var0, int var1) {
      if (-1 != ce_._p) {
         double var2 = (double)ce_._p / 50.0;
         double var5 = (-Math.cos(Math.PI * var2) + 1.0) / 2.0;
         return (int)(var5 * (double)(var1 - var0)) + var0;
      } else {
         return hc_._b;
      }
   }

   static final cn_ a727(int var0, int var1, int var2, int var3, cn_ var4) {
      int var5 = 0;
      int var6 = 0;
      if (0 > var2) {
         var5 -= var2;
         var3 += var2;
         var2 = 0;
      }

      if (var0 < 0) {
         var1 += var0;
         var6 -= var0;
         var0 = 0;
      }

      if (gf_._i < var3 + var2) {
         var3 = gf_._i - var2;
      }

      if (var0 + var1 > gf_._c) {
         var1 = -var0 + gf_._c;
      }

      if (var3 >= 0 && 0 <= var1) {
         if (null == var4 || var4._y < var3 || var4._v < var1) {
            var4 = new cn_(var3, var1);
         }

         int var7 = -var3 + gf_._i;
         int var8 = -var3 + var4._y;
         int var9 = var2 + gf_._i * var0;
         int var10 = -1;

         for(int var11 = -var1; 0 > var11; ++var11) {
            for(int var12 = -var3; 0 > var12; ++var9) {
               ++var10;
               var4._B[var10] = gf_._b[var9];
               ++var12;
            }

            var10 += var8;
            var9 += var7;
         }

         var4._w = var5;
         var4._A = var6;
         return var4;
      } else {
         return null;
      }
   }

   public static void a150() {
      _k = null;
      _m = null;
   }

   final void a093(int var1, int var2) {
      this._l = var1;
      this._n.h150(128 + oo_._d * var1 >> 8);
   }

   fa_(ni_ var1, ne_ var2) {
      this._n = var1;
      this._l = var1.i784();
      this._o = var2;
      this._n.h150(oo_._d * this._l + 128 >> 8);
   }
}
