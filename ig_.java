final class ig_ {
   static String[] _b;
   static int _a;

   static final void a430(boolean var0) {
      im_._b.a877(var0, false);
   }

   static final void a722(String[] var0) {
      int var1 = -1;

      for(int var3 = 0; var0.length > var3; ++var3) {
         String var4 = var0[var3];
         if (-1 != var1) {
            var0[var3] = jk_.a841(new String[]{Integer.toString(var1, 16)}, "<col=<%0>>", 30496) + var4;
         }

         int var5 = en_.a031(var4, "<col=");
         int var6 = en_.a031(var4, "</col>");
         if (var5 <= var6) {
            if (var6 != -1) {
               var1 = -1;
            }
         } else {
            int var7 = var4.indexOf(62, var5);
            if (var7 != -1) {
               String var8 = var4.substring(5 + var5, var7);
               var1 = hl_.a148(var8, 16);
            }
         }
      }

   }

   static final void c150() {
      if (oo_._d <= 32) {
         sf_.d093(0);
      } else {
         int var0 = oo_._d % 32;
         if (0 == var0) {
            var0 = 32;
         }

         sf_.d093(-var0 + oo_._d);
      }

   }

   public static void a150() {
      _b = null;
   }

   static final int b137() {
      if (null != dd_._E && dd_._E._w) {
         int var0 = of_._l + 20;
         int var1 = var0 - 452;
         return var1 * dd_._E._F / dd_._E._G;
      } else {
         return 0;
      }
   }
}
