final class ve_ {
   int _b;
   static ad_ _e = new ad_(11, 0, 1, 2);
   int _f;
   static volatile boolean _a = false;
   int _d;
   static String _c = "Please log in as a subscribing member to access this feature.";

   static final boolean a491() {
      return ed_.c491(true) || pb_._G <= 0;
   }

   private final void a115(int var1, int var2, int var3, int var4) {
      this._d = var2;
      this._f = var4;
      this._b = var1;
      if (var3 < 72) {
         _e = (ad_)null;
      }

   }

   final void b487(boolean var1) {
      if (var1) {
         while(((Math.abs(this._d) | Math.abs(this._f) | Math.abs(this._b)) & -65536) != 0) {
            this._f >>= 1;
            this._d >>= 1;
            this._b >>= 1;
         }

         int var2 = this.c474(false) >> 1;

         int var3;
         for(var3 = 15; 65536 <= var2; var2 >>= 1) {
            --var3;
         }

         this._d = (this._d << var3) / var2;
         this._f = (this._f << var3) / var2;
         this._b = (this._b << var3) / var2;
         int var4 = this.c474(false);
         if (var4 < 64512 || 66560 < var4) {
            throw new RuntimeException();
         }
      }
   }

   public static void a150(int var0) {
      _e = null;
      if (var0 >= -92) {
         a150(42);
      }

      _c = null;
   }

   static final String a382(int var0, long var1, int var3) {
      char var4 = ',';
      char var5 = '.';
      if (var3 == 0) {
         var5 = ',';
         var4 = '.';
      }

      if (2 == var3) {
         var5 = 160;
      }

      boolean var6 = false;
      if (var1 < 0L) {
         var1 = -var1;
         var6 = true;
      }

      StringBuilder var7 = new StringBuilder(26);
      int var8;
      int var9;
      if (var0 > 0) {
         for(var8 = 0; var0 > var8; ++var8) {
            var9 = (int)var1;
            var1 /= 10L;
            var7.append((char)(-(10 * (int)var1) + var9 + 48));
         }

         var7.append(var4);
      }

      var8 = 0;

      while(true) {
         var9 = (int)var1;
         var1 /= 10L;
         var7.append((char)(48 - (-var9 + 10 * (int)var1)));
         if (var1 == 0L) {
            if (var6) {
               var7.append('-');
            }

            return var7.reverse().toString();
         }

         ++var8;
         if (0 == var8 % 3) {
            var7.append(var5);
         }
      }
   }

   private final int c474(boolean var1) {
      if (var1) {
         this.a115(56, -92, 125, -12);
      }

      int var2 = (this._b >> 2) * (this._b >> 2) + (this._f >> 2) * (this._f >> 2) + (this._d >> 2) * (this._d >> 2);
      if (var2 < 0) {
         throw new RuntimeException();
      } else {
         return ug_.a527(!var1, var2) << 2;
      }
   }

   ve_(int var1, int var2, int var3) {
      this.a115(var3, var1, 124, var2);
   }
}
