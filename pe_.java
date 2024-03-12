final class pe_ extends ne_ {
   static fd_ _j = new fd_(3);
   static String _k = "A large, wolf-like creature with brown-black hair and horns.";
   static String _n = "ACCEPT";
   static String _i = "Select a raider to enchant with additional Defence";
   static rk_ _l;
   static String _o;
   static String[] _m;

   public static void a150(int var0) {
      if (var0 != 9) {
         a150(39);
      }

      _n = null;
      _i = null;
      _l = null;
      _o = null;
      _j = null;
      _m = null;
      _k = null;
   }

   static final cn_[] a289(int var0, int var1, int var2, int var3) {
      cn_[] var4 = new cn_[9];
      var4[0] = var4[1] = var4[2] = var4[3] = var4[6] = bl_.a091(var0, var3);
      var4[5] = var4[7] = var4[8] = bl_.a091(var2, var3);
      if (0 != var1) {
         var4[4] = bl_.a091(var1, 64);
      }

      return var4;
   }

   static final boolean a628(CharSequence var0, char var1) {
      if (!il_.a778(var1)) {
         return false;
      } else if (null != var0) {
         int var2 = var0.length();
         if (12 <= var2) {
            return false;
         } else {
            return !jc_.a351(var1) || 0 != var2;
         }
      } else {
         return false;
      }
   }

   private pe_() throws Throwable {
      throw new Error();
   }
}
