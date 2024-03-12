final class cf_ {
   static boolean[] _b = new boolean[]{true, true, true, true, false, false};
   int _a;
   static hd_[] _c;
   static String _d = "3D VIEW: ";
   va_ _e;
   static cn_ _f;

   public static void a150(int var0) {
      _b = null;
      _d = null;
      if (var0 != 30) {
         a150(45);
      }

      _c = null;
      _f = null;
   }

   static final void a548(boolean var0, int var1, int var2) {
      nl_._g.h093(var1, var2);
      if (var0) {
         int var3 = jc_._e % nl_._g._y * 2;
         if (var3 >= nl_._g._y) {
            var3 = nl_._g._y - (var3 - nl_._g._y);
         }

         if (10 <= var3) {
            if (nl_._g._y - 40 < var3) {
               var3 = nl_._g._y - 40;
            }
         } else {
            var3 = 10;
         }

         rk_.a161(30, 80, var3, 0, var2, var1, 0, 116, nl_._g);
      }

   }

   cf_(va_ var1, int var2) {
      this._a = var2;
      this._e = var1;
   }

   static final fa_ a319(va_ var0, int var1) {
      return l_.a472(ni_.b071(var0, 100, var1));
   }
}
