final class ta_ {
   static ec_ _c = new ec_(256);
   static cn_ _b;
   static ab_ _d = new ab_();
   static String _h = "After a string of unfortunate accidents led to his exile from the mountain home of the dwarves, the dwarven renegade seeks somewhere else to indulge his passion for explosives.";
   static String _g = "Select an orc or goblin to sacrifice";
   static se_ _e;
   static jk_ _a;
   static md_ _f = new md_();

   static final String a319(se_ var0, int var1, int var2, String var3, int var4) {
      return var4 <= 103 ? (String)null : ia_.a282(var2, var0, pj_.a022((byte)66, var1, var3));
   }

   public static void a150() {
      _d = null;
      _a = null;
      _c = null;
      _e = null;
      _h = null;
      _f = null;
      _b = null;
      _g = null;
   }

   static final void a268(byte var0, int var1, kj_ var2) {
      if (var0 != 11) {
         a319((se_)null, -96, -112, (String)null, -121);
      }

      wj_ var3 = ac_._B;
      var3.d556((byte)-81, var1);
      var3.a093(6, 2);
      var3.a093(6, 0);
      var3.a093(var0 ^ 13, var2._j);
   }

   static final void b150() {
      wj_ var0 = ac_._B;

      while(mo_.b154()) {
         var0.d556((byte)-102, 8);
         int var1 = ++var0._o;
         ed_.a707(false, var0);
         ac_._B.c093(var0._o - var1, -1);
      }

   }
}
