final class le_ {
   static String _a = "<%0> of your Renown will be lost if you fail to reach the hoard room in a raid.";
   static cn_ _d;
   static cn_ _f;
   static String[] _c = new String[]{null, "There are a number of different strategies a raider can employ against a monster, displayed in the bottom-right, below the room's statistics. For now, we'll use <%advance>.<br><br><%command>Click the shield icon - <%advance> - to begin combat.</col>"};
   static gn_[][] _b;
   static pp_ _g;
   static String _e = "The heavy armour of the <%0> deflects the blow!";

   static final boolean a398(String var0, String var1, int var2) {
      String var3 = jm_.a715((byte)59, var0);
      if (var2 >= -22) {
         return true;
      } else {
         String var4 = jm_.a715((byte)59, var1);
         if (var3 == null && null == var4) {
            return true;
         } else {
            return var3 != null && var4 != null ? var3.equals(var4) : false;
         }
      }
   }

   public static void a150() {
      _g = null;
      _f = null;
      _e = null;
      _c = null;
      _a = null;
      _b = (gn_[][])null;
      _d = null;
   }
}
