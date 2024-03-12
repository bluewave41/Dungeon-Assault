final class rn_ {
   static String[] _g = new String[]{null, "You need to recruit some raiders in order to raid another dungeon.<br><br><%command>Recruit a party of raiders, then exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>"};
   static cn_ _c;
   static String _d = "Use special abilities before combat begins.";
   static String _f = "Troglodytes may well be less evolved creatures and not too bright, but that doesn't stop their clubs from crushing raiders' bones.";
   static int _a;
   static String _e = "From only <%0>/month";
   static volatile boolean _b = true;

   public static void b150() {
      _g = null;
      _d = null;
      _c = null;
      _f = null;
      _e = null;
   }

   static final byte[] a288(int var0, int var1, int var2, byte[] var3) {
      byte[] var4;
      if (0 < var1) {
         var4 = new byte[var0];

         for(int var5 = 0; var5 < var0; ++var5) {
            var4[var5] = var3[var1 + var5];
         }
      } else {
         var4 = var3;
      }

      ol_ var7 = new ol_();
      var7.b150(var2 ^ 116);
      var7.a453((long)(var0 * var2), 17567, var4);
      byte[] var6 = new byte[64];
      var7.a331((byte)-88, var6, 0);
      return var6;
   }

   static final int a137() {
      return wk_._g;
   }
}
