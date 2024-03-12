import java.util.Random;

final class mp_ {
   static String _e = "Yes";
   static String _b = "Email (Login):";
   static se_ _a;
   static String _c = "Loading fonts";
   static String _f = "Orb coins: ";
   static String _g = "Shapeshifter";
   static int _d;

   public static void a423() {
      _e = null;
      _g = null;
      _b = null;
      _c = null;
      _a = null;
      _f = null;
   }

   static final void a308(Random var0, int[] var1, int var2, int var3, int var4) {
      if (var2 > -126) {
         a308((Random)null, (int[])null, -15, 56, 15);
      }

      for(int var5 = 0; 8 > var5; ++var5) {
         oh_.a093(var4, 7);
         if (!al_._o.a370(var3, (byte)104) || !ll_.a045(var0, hb_.a464(var3), var1)) {
            break;
         }
      }

   }

   static final cf_ a473(String var0, String var1, int var2) {
      return hd_.a492(var2, var1 + "_" + var0);
   }

   static int a080(int var0, int var1) {
      return var0 | var1;
   }
}
