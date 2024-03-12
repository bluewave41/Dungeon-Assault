abstract class wf_ extends ll_ {
   static String _v = "Stone Golem";
   static String _y = "You must have charged <%0> Orbs of Mastery in total to earn the title of <%1>.";
   static int _x;
   static int _C;
   int _A;
   static String _D = "Select a raider to sacrifice";
   static String[] _z = new String[]{"Dark Arts", "Readjust <%attack>/<%defence> balance. (Single use)"};
   static String _B = "Player Name: ";
   static pp_ _w;

   abstract boolean c427(byte var1);

   abstract Object d092(int var1);

   public static void d423(byte var0) {
      _w = null;
      if (var0 != -28) {
         d423((byte)-46);
      }

      _v = null;
      _B = null;
      _z = null;
      _D = null;
      _y = null;
   }

   wf_(int var1) {
      this._A = var1;
   }
}
