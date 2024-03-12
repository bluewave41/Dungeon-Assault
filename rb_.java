final class rb_ extends ck_ {
   static String[] _J = new String[]{"Rank", "Name", "Renown", "Last Raided"};
   static String _M = "Defences: ";
   static int _N = -1;
   static en_ _O;
   static int _L = 0;
   static String _K = "The attack of this monster is lethal.";
   static String _I = "<col=8B1717>Disarm</col>";

   rb_(String var1, pg_ var2, boolean var3) {
      this(var1, var2);
      super._E = var3;
   }

   static final int[] b330(int var0, int var1, int var2) {
      int[] var3 = new int[var2];

      for(int var4 = 0; var4 < 64; ++var4) {
         var3[var4] = hj_.a185(var0, var4 << 2, var1);
      }

      return var3;
   }

   static final cn_ a551(int var0, cn_ var1, int var2, byte var3) {
      cn_ var4 = new cn_(var1._y + var0 * 2, var1._v + var0 * 2);
      jh_.a303(var4);

      int var5;
      for(var5 = 0; var5 < var0; ++var5) {
         var1.e326(-var1._w + var0, var0 - var1._A, var2);
         gf_.d669(1, 1, 0, 0, var4._y, var4._v);
      }

      var1.e326(var0 - var1._w, -var1._A + var0, 0);
      jh_.b797();
      var4._A = var1._A - var0;
      var4._w = var1._w - var0;
      var5 = 64 / ((34 - var3) / 42);
      return var4;
   }

   public static void a150(int var0) {
      _O = null;
      if (var0 != 4935) {
         a150(39);
      }

      _I = null;
      _J = null;
      _M = null;
      _K = null;
   }

   static final int a218(byte var0, String var1) {
      if (var0 <= 91) {
         a218((byte)-6, (String)null);
      }

      return mp_._a.b926(var1);
   }

   private rb_(String var1, pg_ var2) {
      this(var1, hl_._a._o, var2);
      super._o = hl_._a._q;
   }

   private rb_(String var1, ca_ var2, pg_ var3) {
      super(var1, var2, var3);
      super._o = hl_._a._q;
   }

   final void b115(int var1, int var2, int var3, int var4) {
      super._E = !super._E;
      super.b115(var1, var2, var3, var4);
   }
}
