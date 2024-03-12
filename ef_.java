final class ef_ {
   static cn_ _e;
   static String _f = "COST:";
   static boolean _h;
   static String _c = "to keep fullscreen or";
   static String _g = "Achievements";
   static String _b = "If you do nothing the game will revert to normal view in <%0> second.";
   static String _a = "Create";
   static cf_ _d;

   private final boolean a154(int var1) {
      if (var1 >= -62) {
         a639(92, -86, (nh_)null, 64, (nh_)null);
      }

      return rp_._d == this || k_._e == this || this == qa_._c;
   }

   static final tj_ a639(int var0, int var1, nh_ var2, int var3, nh_ var4) {
      return !kk_.a283(var2, 1, var1, var3) ? null : rj_.a168(var4.b337(5, var1, var3));
   }

   public final String toString() {
      throw new IllegalStateException();
   }

   static final boolean b154() {
      return sp_._c != null && pd_._A.a154(-86);
   }

   static final String a545(int var0, int var1, CharSequence[] var2, int var3) {
      if (var3 != 0) {
         if (var3 != 1) {
            int var9 = var3 + var0;
            int var5 = 0;

            for(int var6 = var0; var9 > var6; ++var6) {
               CharSequence var7 = var2[var6];
               if (var7 == null) {
                  var5 += 4;
               } else {
                  var5 += var7.length();
               }
            }

            StringBuilder var10 = new StringBuilder(var5);

            int var11;
            for(var11 = var0; var9 > var11; ++var11) {
               CharSequence var8 = var2[var11];
               if (null != var8) {
                  var10.append(var8);
               } else {
                  var10.append("null");
               }
            }

            var11 = 74 % ((var1 + 43) / 59);
            return var10.toString();
         } else {
            CharSequence var4 = var2[var0];
            return var4 == null ? "null" : var4.toString();
         }
      } else {
         return "";
      }
   }

   public static void a423() {
      _c = null;
      _g = null;
      _b = null;
      _d = null;
      _e = null;
      _f = null;
      _a = null;
   }
}
