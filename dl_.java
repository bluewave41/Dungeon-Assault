final class dl_ {
   static String _c = "<col=FF0000>Defence -1</col>";
   static int _b = 0;
   static String _a = "Password is valid";

   static final kk_ a204(int var0, nh_ var1) {
      byte[] var2 = var1.a104(-6635, var0);
      return var2 != null ? new kk_(var2) : null;
   }

   public static void a150() {
      _a = null;
      _c = null;
   }

   static final int a080(int var0, int var1) {
      ba_._f = 0;
      qi_._e = null;
      pe_._l = null;
      int var2 = lk_._T;
      lk_._T = bf_._k;
      if (var1 != 51) {
         if (var1 != 50) {
            hb_._a._c = 1;
         } else {
            hb_._a._c = 5;
         }
      } else {
         hb_._a._c = 2;
      }

      ++hb_._a._h;
      bf_._k = var2;
      if (2 <= hb_._a._h && 51 == var1) {
         return 2;
      } else if (2 <= hb_._a._h && 50 == var1) {
         return 5;
      } else {
         return ~hb_._a._h <= var0 ? 1 : -1;
      }
   }
}
