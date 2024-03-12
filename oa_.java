final class oa_ implements ca_ {
   private int _f;
   static String[] _g = new String[]{"Gift of the Trees", "The <%0> channels the power of the great forests that were once her home to double the <%sneak> of a raider in the next room. (Single use)"};
   private se_ _b;
   static String _i = "Ranger of the North";
   private int _a;
   static String[] _d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
   static int[] _e = new int[]{5, 4};
   static String _h = "Confirm changes?";
   static String[] _c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};

   public final void a623(byte var1, lm_ var2, int var3, int var4, boolean var5) {
      int var6 = !var2._u && !var2.a427((byte)127) ? 2188450 : 3249872;
      if (var1 != 34) {
         a423();
      }

      this._b.a385("<u=" + Integer.toString(var6, 16) + ">" + var2._w + "</u>", var2._q + var3, var2._v + var4, var2._x, var2._s, var6, -1, this._a, this._f, this._b._H + this._b._E);
      if (var2.a427((byte)20)) {
         int var7 = this._b.b926(var2._w);
         int var8 = this._b._E + this._b._H;
         int var9 = var3 + var2._q;
         int var10 = var2._v + var4;
         if (this._a == 2) {
            var9 += -var7 + var2._x;
         } else if (1 == this._a) {
            var9 += var2._x - var7 >> 1;
         }

         if (2 == this._f) {
            var10 += -var8 + var2._s;
         } else if (1 == this._f) {
            var10 += -var8 + var2._s >> 1;
         }

         in_.a050(var9 - 2, var8, var7 + 4, 2 + var10, 1);
      }

   }

   public static void a423() {
      _g = null;
      _i = null;
      _e = null;
      _h = null;
      _d = null;
      _c = null;
   }

   public oa_() {
      this._b = lp_._C;
      this._a = 1;
      this._f = 1;
   }

   oa_(se_ var1, int var2, int var3) {
      this._b = var1;
      this._f = var3;
      this._a = var2;
   }
}
