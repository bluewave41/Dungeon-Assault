abstract class qa_ {
   static String _d = "<col=8B8B2E>Flee</col>";
   static ef_ _c = new ef_();
   static int[][] _a;
   static String[] _e = new String[]{"Special Abilities", "Some raiders, such as <%raidertype> possess a <%col_useskill>special ability</col>. You can find out what they are by reviewing the raider's description. When the raider's portrait in the party display is surrounded by a <%highlight>blue glow</col>, the ability is ready to use.<br><br><%command>Click the blue star symbol</col> at the bottom-right of the screen to employ it. Most abilities can only be used at specific times, and most can only be used once per raid.</col>"};
   static String _b = "Visit the Account Management section on the main site to view.";

   abstract byte[] a104(int var1, int var2);

   abstract int b080(int var1, int var2);

   static final q_[] a466(String var0, String var1, nh_ var2) {
      int var3 = var2.a913(var1, 1000);
      int var4 = var2.a026(0, var0, var3);
      return rf_.a007(var4, (byte)-71, var2, var3);
   }

   abstract tm_ a010(int var1);

   public static void b150() {
      _d = null;
      _a = (int[][])null;
      _b = null;
      _c = null;
      _e = null;
   }
}
