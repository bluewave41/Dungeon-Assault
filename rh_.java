final class rh_ {
   int _g;
   private cn_ _d;
   private int _c;
   int _a;
   int _h;
   int _b;
   int _e;
   private int _f;

   final void b797() {
      this.c797();
   }

   final void a601(cn_ var1, int var2, int var3) {
      int var4 = (int)(32.0 * (1.0 + te_.a132(mo_._a << 4)));
      if (var4 < 0) {
         var4 = 0;
      }

      if (var4 > 64) {
         var4 = 64;
      }

      var2 += var1._w;
      var3 += var1._A;
      int var5 = var2 + var3 * this._c;
      int var6 = 0;
      int var7 = var1._v;
      int var8 = var1._y;
      int var9 = this._c - var8;
      int var10 = 0;
      if (var3 < 0) {
         var7 += var3;
         var6 -= var3 * var8;
         var5 -= var3 * this._c;
         var3 = 0;
      }

      if (var3 + var7 > this._f) {
         var7 -= var3 + var7 - this._f;
      }

      if (var2 < 0) {
         var8 += var2;
         var6 -= var2;
         var5 -= var2;
         var10 -= var2;
         var9 -= var2;
         var2 = 0;
      }

      if (var2 + var8 > this._c) {
         int var11 = var2 + var8 - this._c;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if (var8 > 0 && var7 > 0) {
         for(var3 = -var7; var3 < 0; var6 += var10) {
            for(var2 = -var8; var2 < 0; ++var6) {
               if (var1._B[var6] != 0) {
                  this._d._B[var5] = this._e + oi_.b080(0, var4 + 1) * this._h;
               }

               ++var2;
               ++var5;
            }

            ++var3;
            var5 += var9;
         }

         this.c797();
      }
   }

   final void e797() {
      int var1 = (int)(32.0 * (1.0 + te_.a132(mo_._a << 4)));
      if (var1 < 0) {
         var1 = 0;
      }

      if (var1 > 64) {
         var1 = 64;
      }

      for(int var2 = 0; var2 < 2; ++var2) {
         this._d._B[this._c * this._f - this._c - (this._c >> 1) - 1 + var2] = this._e + oi_.b080(0, var1 + 1) * this._h;
         this._d._B[this._c * this._f - (this._c >> 1) - 1 + var2] = this._e + oi_.b080(0, var1 + 1) * this._h;
      }

      this.c797();
   }

   private final void c797() {
      int[] var1 = this._d._B;
      int var3 = this._d._y;
      int var4 = this._d._v;
      int var2 = var3 + 1;

      int var5;
      int var6;
      int var7;
      for(var5 = 2 - var4; var5 < 0; ++var5) {
         var6 = var1[var2 - 1];
         var7 = var1[var2];
         int var8 = var1[var2 + 1];

         for(int var9 = 2 - var3; var9 < 0; ++var9) {
            int var10 = var1[var2 - var3];
            int var11 = (var10 & '\uff00') + (var6 & '\uff00') + (var7 & '\uff00') + (var8 & '\uff00') >> 2;
            int var12 = (var10 & 16711935) + (var6 & 16711935) + (var7 & 16711935) + (var8 & 16711935) >> 2;
            var1[var2 - var3] = (var11 & '\uff00') + (var12 & 16711935);
            ++var2;
            var6 = var7;
            var7 = var8;
            var8 = var1[var2 + 1];
         }

         var2 += 2;
      }

      for(var5 = var1.length - 1; var5 >= 0; --var5) {
         var6 = var1[var5];
         var7 = var6 & '\uff00';
         var6 &= 16711935;
         var6 *= this._a;
         var7 *= this._a;
         var1[var5] = (var6 & -16711936 | var7 & 16711680) >>> 8;
      }

      this._d.b326(this._g - (this._c >> 1), this._b - this._f, 256);
      this._d.b326(this._g - (this._c >> 1), this._b - this._f, 256);
   }

   final void d797() {
      int var1 = (int)(32.0 * (1.0 + te_.a132(mo_._a << 4)));
      if (var1 < 0) {
         var1 = 0;
      }

      if (var1 > 64) {
         var1 = 64;
      }

      for(int var2 = 0; var2 < 3; ++var2) {
         this._d._B[this._c * this._f - this._c - (this._c >> 1) - 1 + var2] = this._e + oi_.b080(0, var1 + 1) * this._h;
      }

      this.c797();
   }

   final void a797() {
      this._d.b326(this._g - (this._c >> 1), this._b - this._f, 256);
      this._d.b326(this._g - (this._c >> 1), this._b - this._f, 256);
   }

   rh_(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this._g = var1;
      this._b = var2;
      this._c = var3;
      this._f = var4;
      this._d = new cn_(this._c, this._f);
      this._e = var5;
      this._h = var6;
      this._a = var7;
   }
}
