abstract class gj_ {
   static int[] _c = wa_.b878(-1);
   static String _a = "Orc Warrior";
   static String _b = "Demon Lord";

   static final int a080(int var0) {
      if (0 > var0) {
         return -65536 > var0 ? ib_._g[134217728 / -var0] - 2048 : -ib_._g[-var0 >> 5];
      } else {
         return var0 > 65536 ? -ib_._g[134217728 / var0] + 2048 : ib_._g[var0 >> 5];
      }
   }

   static final void a324(int var0, String[] var1, String var2) {
      ol_._i = dh_._b;
      if (255 == var0) {
         mh_._b = l_.a307(13 > wk_._g);
      } else if (100 <= var0 && 105 >= var0) {
         mh_._b = em_.a953(var1);
      } else {
         mh_._b = p_.a853(var0, var2);
      }

   }

   static final int a498(h_ var0) {
      return ib_.a598(var0) >> 1;
   }

   abstract void b150(int var1);

   static final void a226(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      hp_._b[var3] = new h_(var3, var1, var6, var4, var2, var5, var8, var7, var9, var0);
   }

   abstract long a138(int var1);

   final int a871(long var1, int var3) {
      if (var3 > -54) {
         return -17;
      } else {
         long var4 = this.a138(127);
         if (0L < var4) {
            pj_.a054(0, var4);
         }

         return this.b871(var1, 2048);
      }
   }

   abstract int b871(long var1, int var3);

   public static void a423() {
      _a = null;
      _c = null;
      _b = null;
   }
}
