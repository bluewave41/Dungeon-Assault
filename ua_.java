import java.awt.Container;

final class ua_ {
   static ph_[] _b;
   static volatile int _a = 0;
   static String[] _c = new String[]{"Fickle", "Leaves stable if fail any raid."};
   static String _d = "Cave Troll";

   static final boolean a141(boolean var0, CharSequence var1) {
      if (!mk_.a827(var0, var1)) {
         return false;
      } else {
         for(int var2 = 0; var1.length() > var2; ++var2) {
            if (!rp_.a624(var1.charAt(var2))) {
               return false;
            }
         }

         return true;
      }
   }

   static final Container a332(int var0) {
      if (null != ad_._d) {
         return ad_._d;
      } else {
         if (var0 != 0) {
            a332(-74);
         }

         return m_.c372(true);
      }
   }

   public static void a423() {
      _d = null;
      _c = null;
      _b = null;
   }
}
