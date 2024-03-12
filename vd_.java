final class vd_ {
   static String _c = "ACHIEVEMENTS";
   static String _d = "End Game";
   static int _a = 94;
   static String _b = "<col=8B1717>Disarm</col>";

   public static void a423() {
      _b = null;
      _c = null;
      _d = null;
   }

   static final void a669(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = wh_._g._d;
      if (2 == var3) {
         var0 -= var6;
         var4 += var6;
      }

      jh_.c797();
      if (2 == var1) {
         var0 -= var6;
      }

      gf_.e115(var4, var5, var4 + var0, 8 + var5);
      int var7 = 0;
      if (var2 != -14561) {
         a669(-78, 112, -21, -44, 75, -60);
      }

      while(var0 > var7) {
         bk_._e.b093(var7 + var4, var5);
         var7 += bk_._e._d;
      }

      jh_.b797();
      if (var3 == 2) {
         wh_._g.j093(-var6 + var4, var5);
      }

      if (2 == var1) {
         wh_._g.h093(var0 + var4, var5);
      }

      if (var3 == 1) {
         for(var7 = 0; 8 > var7; ++var7) {
            qe_.b050(var4 + var7, var5, 8, 0, -(24 * var7) + 192);
         }
      }

      if (var1 == 1) {
         for(var7 = 0; var7 < 8; ++var7) {
            qe_.b050(var0 + (var4 - (1 + var7)), var5, 8, 0, 192 - 24 * var7);
         }
      }

   }
}
