final class to_ {
   static String[] _b = new String[]{"Fragility", "Dies when incapacitated."};
   static String _a = "<col=FF0000><%0> charging</col>";
   static ab_ _e = new ab_();
   static String _f = "A ring of mystic runes glow faintly around the perimeter of this room. The first unwise raider to cross this room might be teleported out of the dungeon.<br><br>This trap will only trigger once per raid.";
   static byte[][] _d = new byte[1000][];
   static String _g;
   static int[] _c;

   static final double a088(int var0, int var1, double var2) {
      double var4 = 1.0 - var2;
      return (double)var0 * var4 + var2 * (double)var1;
   }

   public static void a150() {
      _e = null;
      _f = null;
      _b = null;
      _a = null;
      _g = null;
      _c = null;
      _d = (byte[][])null;
   }

   static final int a789(int var0, CharSequence var1) {
      int var2 = var1.length();
      int var3 = 0;
      int var4 = 0;
      if (var0 < 114) {
         b150(47);
      }

      while(var2 > var4) {
         var3 = hb_.a770(var1.charAt(var4)) + -var3 + (var3 << 5);
         ++var4;
      }

      return var3;
   }

   static final void a124(int var0, int var1, int var2, int var3, String var4, int var5) {
      kn_.a020(var2, var4 + "_defeat", var5, var3, 124, var0, var4 + "_special", var4 + "_reveal");
      if (var1 >= -72) {
         a124(116, 65, -88, 52, (String)null, -97);
      }

   }

   static final rj_ a777(int var0, int var1, md_ var2, int var3) {
      if (var2 != null) {
         rj_ var4 = (rj_)var2.e024(-24172);
         if (var3 != 0) {
            return (rj_)null;
         } else {
            while(var4 != null) {
               rj_ var5;
               if (null != (var5 = var4.a759(var3 - 115, var1, var0))) {
                  return var5;
               }

               var4 = (rj_)var2.a024(4);
            }

            return null;
         }
      } else {
         return null;
      }
   }

   static final void b150(int var0) {
      if (var0 <= 57) {
         b150(-76);
      }

   }
}
