final class wo_ {
   static q_[] _a;
   static boolean _c = true;
   static dn_ _e;
   static int _g;
   static String _f = "Monsters";
   static String _h = "Waiting for sound effects";
   static String _d = "Menu";
   static int _b;

   static final cn_ a028(int var0, int var1, int var2, int var3) {
      int var4 = 2 * var2 - 1;
      int var5 = var2 + var1;
      cn_ var6 = new cn_(var4, var5);
      jh_.a303(var6);

      int var7;
      for(var7 = 0; var7 < var2; ++var7) {
         gf_.b115(var2 - var7 - 1, var7, 1 + 2 * var7, var3);
      }

      var7 = -var0 + var4 >> 1;

      for(int var8 = 0; var1 > var8; ++var8) {
         gf_.b115(var7, var2 + var8, var0, var3);
      }

      jh_.b797();
      return var6;
   }

   public static void a423() {
      _h = null;
      _f = null;
      _d = null;
      _e = null;
      _a = null;
   }
}
