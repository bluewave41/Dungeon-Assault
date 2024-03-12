final class dk_ implements ca_ {
   static int _c;
   static cn_ _b;
   static String _e = "You do not meet the requirements for the title of <%0>.";
   static String _a = "Large, hairy humanoid with a jutting lower jaw, ramshackle plate armour and a two-handed hammer. Ogres are forever hungry, but luckily for them, they can eat almost anything.";
   static int _d;

   public static void a423() {
      _a = null;
      _e = null;
      _b = null;
   }

   public final void a623(byte var1, lm_ var2, int var3, int var4, boolean var5) {
      if (var1 != 34) {
         _b = (cn_)null;
      }

      int var6 = var2._q + var3;
      int var7 = var4 + var2._v;
      ll_.a050(var1 ^ 32, var6, var2._x, var2._s, var7);
      cn_ var8 = sl_._c[1];
      if (var2 instanceof ck_ && ((ck_)var2)._E) {
         var8.b326(var6 + 1 + (-var8._E + var2._x >> 1), 1 + var7 + (-var8._G + var2._s >> 1), 256);
      }

      if (var2.a427((byte)28)) {
         in_.a050(2 + var6, var2._s - 4, var2._x - 4, var7 + 2, var1 - 33);
      }

   }

   static final wh_ a747(int var0, int var1, String var2) {
      vh_ var3 = vh_.a109(bl_._t, "", var2);
      ai_.a085(var1 ^ var1, var3);
      return new wh_(var3, var0);
   }

   public dk_() {
   }
}
