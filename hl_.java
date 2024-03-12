abstract class hl_ {
   static cn_ _h;
   static lh_ _a;
   static gd_ _b;
   static volatile int _g = 0;
   static ad_ _c = new ad_(0, 2, 2, 1);
   static int[] _e = new int[]{45, 210, 490, 630, 850, 1010, 1305, 1475, 1665};
   static String _d = "<%col_detect>Detect +1 to all monsters.</col>";
   static int _f;
   static tl_ _i;
   static String _k = "Enter the name of the player you wish to find in the Dragons of Renown table";
   static String _j = "The pit in this room may be shallow, but it's full of metal nails waiting to shred a careless raider.<br><br>Trapped raiders permanently lose 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";

   static final void a857(int var0, al_ var1) {
      wj_ var2 = ac_._B;
      var2.d556((byte)-118, var0);
      var2.a093(6, 5);
      var2.a093(6, 0);
      var2.i093(var1._k, -125);
      var2.a093(6, var1._l);
      var2.a093(6, var1._p);
   }

   static final int a148(CharSequence var0, int var1) {
      return mm_.a978(var0, true, var1);
   }

   public static void a150() {
      _b = null;
      _d = null;
      _a = null;
      _i = null;
      _c = null;
      _e = null;
      _k = null;
      _j = null;
      _h = null;
   }

   abstract void a330(ec_ var1, byte var2);

   abstract fd_ b743(int var1);

   static final void a487() {
      lg_._w.h150(1);
      if (hg_._r == null) {
         hg_._r = new wi_(lg_._w, ub_._o);
      }

      lg_._w.a336(hg_._r, -1);
   }
}
