final class ka_ {
   private static int[] _a = new int[98304];
   static int _c;
   static String[] _b;
   static String[] _d;

   static final void a150() {
      nf_._y = -1;
      of_._k = true;
      ed_ var0 = eh_._o;
      eh_._o._N = false;
      var0._w = false;
      og_._e._N = true;
      ed_ var1 = og_._e;
      var1._w = true;
   }

   public static void a423() {
      _a = null;
      _d = null;
      _b = null;
   }

   static {
      for(int var0 = 92682; var0 >= 46341; --var0) {
         long var6 = (long)(1 + (var0 << 1));
         long var4 = (long)((var0 << 1) - 1);
         int var2 = (int)((var4 * var4 >> 18) - 32768L);
         int var3 = (int)((var6 * var6 >> 18) - 32768L);
         if (var3 >= _a.length) {
            var3 = _a.length - 1;
         }

         for(int var1 = var2 < 0 ? 0 : var2; var1 <= var3; ++var1) {
            _a[var1] = var0;
         }
      }

      _d = new String[]{null, "When a raider encounters a trap, one of several things may happen. The raider may be able to <%highlight>disarm</col> the trap without triggering it - (if your raider's <%sneak> roll beats that of the room's <%detect>).<br><br>If they are unable to <%highlight>disarm</col> it, the trap will be triggered, but an agile <%raider> (that wins a <%dodge> roll against the <%trap>'s <%snare>) may be able to avoid injury. Otherwise, it will be subject to the effects of the trap.<br><br><%command>Click the shield icon (at the bottom-right) to attempt to disarm this trap.</command>"};
      _c = 0;
      _b = new String[]{"6M Crew Member", "Victorius Ultima", "Crystal Monarch", "Starship Commando", "Relentless 2", "Mega Champion", "Insane Pilot", "Master of Magic", "Arch Mage", "Stench of Corruption"};
   }
}
