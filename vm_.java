final class vm_ {
   private ec_ _a = new ec_((byte[])null);
   private static byte[] _g = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   private long _b;
   int[] _d;
   private int[] _e;
   private int[] _i;
   private int _h;
   int _c;
   private int[] _f;

   final void e797() {
      this._a._o = -1;
   }

   final boolean g801() {
      return this._a._m != null;
   }

   final void d150(int var1) {
      this._a._o = this._f[var1];
   }

   final void c797() {
      this._a._m = null;
      this._i = null;
      this._f = null;
      this._d = null;
      this._e = null;
   }

   private final int a080(int var1, int var2) {
      int var3;
      int var4;
      if (var2 == 255) {
         var3 = this._a.c474(true);
         var4 = this._a.e137(-651413500);
         ec_ var10000;
         if (var3 == 47) {
            var10000 = this._a;
            var10000._o += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this._a.f137(-116);
            var4 -= 3;
            int var6 = this._d[var1];
            this._b += (long)var6 * (long)(this._h - var5);
            this._h = var5;
            var10000 = this._a;
            var10000._o += var4;
            return 2;
         } else {
            var10000 = this._a;
            var10000._o += var4;
            return 3;
         }
      } else {
         var3 = _g[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this._a.c474(true) << 8;
         }

         if (var3 >= 2) {
            var4 |= this._a.c474(true) << 16;
         }

         return var4;
      }
   }

   final void b150(int var1) {
      int var2 = this._a.e137(-651413500);
      int[] var10000 = this._d;
      var10000[var1] += var2;
   }

   final void a604(byte[] var1) {
      this._a._m = var1;
      this._a._o = 10;
      int var2 = this._a.k137(0);
      this._c = this._a.k137(0);
      this._h = 500000;
      this._i = new int[var2];

      ec_ var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000._o += var5) {
         int var4 = this._a.h137(-62);
         var5 = this._a.h137(-61);
         if (var4 == 1297379947) {
            this._i[var3] = this._a._o;
            ++var3;
         }

         var10000 = this._a;
      }

      this._b = 0L;
      this._f = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this._f[var3] = this._i[var3];
      }

      this._d = new int[var2];
      this._e = new int[var2];
   }

   final int a784() {
      return this._f.length;
   }

   final int b784() {
      int var1 = this._f.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this._f[var4] >= 0 && this._d[var4] < var3) {
            var2 = var4;
            var3 = this._d[var4];
         }
      }

      return var2;
   }

   final void a150(int var1) {
      this._f[var1] = this._a._o;
   }

   final void a111(long var1) {
      this._b = var1;
      int var3 = this._f.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this._d[var4] = 0;
         this._e[var4] = 0;
         this._a._o = this._i[var4];
         this.b150(var4);
         this._f[var4] = this._a._o;
      }

   }

   final int c137(int var1) {
      int var2 = this.f137(var1);
      return var2;
   }

   private final int f137(int var1) {
      int var2 = this._a._m[this._a._o];
      if (var2 < 0) {
         var2 &= 255;
         this._e[var1] = var2;
         ++this._a._o;
      } else {
         var2 = this._e[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.a080(var1, var2);
      } else {
         int var3 = this._a.e137(-651413500);
         if (var2 == 247 && var3 > 0) {
            int var4 = this._a._m[this._a._o] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this._a._o;
               this._e[var1] = var4;
               return this.a080(var1, var4);
            }
         }

         ec_ var10000 = this._a;
         var10000._o += var3;
         return 0;
      }
   }

   public static void d797() {
      _g = null;
   }

   final long e138(int var1) {
      return this._b + (long)var1 * (long)this._h;
   }

   final boolean f801() {
      int var1 = this._f.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this._f[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   vm_() {
   }

   vm_(byte[] var1) {
      this.a604(var1);
   }
}
