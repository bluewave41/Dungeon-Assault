final class v_ {
   private int _b;
   private int _a;
   private wg_[] _c = new wg_[10];

   static final v_ a141(nh_ var0, int var1, int var2) {
      byte[] var3 = var0.b337(5, var1, var2);
      return var3 == null ? null : new v_(new ec_(var3));
   }

   final va_ a981() {
      byte[] var1 = this.b928();
      return new va_(22050, var1, 22050 * this._a / 1000, 22050 * this._b / 1000);
   }

   private final byte[] b928() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this._c[var2] != null && this._c[var2]._s + this._c[var2]._o > var1) {
            var1 = this._c[var2]._s + this._c[var2]._o;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this._c[var4] != null) {
               int var5 = this._c[var4]._s * 22050 / 1000;
               int var6 = this._c[var4]._o * 22050 / 1000;
               int[] var7 = this._c[var4].a111(var5, this._c[var4]._s);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   private v_(ec_ var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.c474(true);
         if (var3 != 0) {
            --var1._o;
            this._c[var2] = new wg_();
            this._c[var2].a962(var1);
         }
      }

      this._a = var1.k137(0);
      this._b = var1.k137(0);
   }
}
