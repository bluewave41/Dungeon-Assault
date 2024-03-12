final class fh_ {
   int _j;
   private int _h;
   private int _b = 2;
   private int[] _g = new int[2];
   private int[] _k = new int[2];
   int _d;
   private int _i;
   int _c;
   private int _f;
   private int _a;
   private int _e;

   final int a137(int var1) {
      if (this._i >= this._a) {
         this._h = this._g[this._e++] << 15;
         if (this._e >= this._b) {
            this._e = this._b - 1;
         }

         this._a = (int)((double)this._k[this._e] / 65536.0 * (double)var1);
         if (this._a > this._i) {
            this._f = ((this._g[this._e] << 15) - this._h) / (this._a - this._i);
         }
      }

      this._h += this._f;
      ++this._i;
      return this._h - this._f >> 15;
   }

   final void a962(ec_ var1) {
      this._b = var1.c474(true);
      this._k = new int[this._b];
      this._g = new int[this._b];

      for(int var2 = 0; var2 < this._b; ++var2) {
         this._k[var2] = var1.k137(0);
         this._g[var2] = var1.k137(0);
      }

   }

   fh_() {
      this._k[0] = 0;
      this._k[1] = 65535;
      this._g[0] = 0;
      this._g[1] = 65535;
   }

   final void b962(ec_ var1) {
      this._d = var1.c474(true);
      this._c = var1.h137(-97);
      this._j = var1.h137(-128);
      this.a962(var1);
   }

   final void a797() {
      this._a = 0;
      this._e = 0;
      this._f = 0;
      this._h = 0;
      this._i = 0;
   }
}
