final class qd_ {
   static cn_ _d;
   static boolean[] _c;
   static String _a = "Creating your account";
   static String[] _e = new String[]{null, "This is the <%highlight>Dragons of Renown</col> table. It shows a list of all the players in the realm of Dungaria, sorted by their Renown. You can choose to start a raid against any of these players.<br><br><%command>Scroll through the list and examine your potential targets.</col>"};
   static String _b = "This password contains your Player Name, and would be easy to guess";

   static final ad_ a483(int var0) {
      ad_[] var1 = ad_.b265();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var0 == var1[var2]._b) {
            return var1[var2];
         }
      }

      return null;
   }

   static final nh_ a854(boolean var0, boolean var1, int var2, byte var3, int var4) {
      if (var3 != -31) {
         _e = (String[])null;
      }

      return uo_.a385(var0, var4, var1, var2, 27847, false);
   }

   public static void a487() {
      _a = null;
      _e = null;
      _c = null;
      _d = null;
      _b = null;
   }

   static final int a313(int var0, int var1, int var2) {
      int var3 = tg_._f[var2][var0];
      if (var1 != 380) {
         a854(false, false, 41, (byte)-8, 52);
      }

      return !ke_.a097(var1 ^ 280, var3) ? tg_._j[var2] : 380;
   }
}
