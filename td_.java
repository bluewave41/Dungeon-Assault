import java.awt.Font;

final class td_ {
   static String _b = "Passwords must be between 5 and 20 letters and numbers";
   static boolean _c = false;
   static String _d;
   static Font _a;

   public static void a150() {
      _a = null;
      _b = null;
      _d = null;
   }

   static final void a093(int var0, int var1) {
      wk_.c474(false);
      if (var1 <= 120) {
         a742((String)null, true, false, (String)null, (rg_)null, -5, (String)null);
      }

   }

   static final boolean a742(String var0, boolean var1, boolean var2, String var3, rg_ var4, int var5, String var6) {
      if (ol_._i == sp_._e) {
         if (!var2) {
            a150();
         }

         jb_ var7 = new jb_(lg_._w, var4);
         lg_._w.a336(var7, -1);
         if (rg_.i427()) {
            var7.r150(102);
         } else {
            _d = var0;
            mh_._b = null;
            in_._E = var1;
            wk_._g = var5;
            he_._m = var6;
            ol_._i = ql_._f;
            ho_._i = var3;
         }

         return true;
      } else {
         return false;
      }
   }
}
