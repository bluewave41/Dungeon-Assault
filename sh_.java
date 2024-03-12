final class sh_ {
   static cn_ _a;
   static String _b = "Email is valid";

   static final String a439(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];

      for(int var3 = 0; var1 > var3; ++var3) {
         var2[var1 - (1 + var3)] = var0.charAt(var3);
      }

      return new String(var2);
   }

   static final void a041(int var0, lb_ var1) {
      kl_ var2 = bf_._f[2]._b;
      if (var2 instanceof fk_) {
         ((fk_)var2).a067(var1, 83);
      }

      if (var0 != 27886) {
         _a = (cn_)null;
      }

   }

   static final cf_[] a289(int var0, String var1, int[] var2) {
      int var3 = var2.length;
      cf_[] var4 = new cf_[var3];

      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5] = mp_.a473(Integer.toString(var5 + 1), var1, var2[var5]);
      }

      if (var0 >= -55) {
         a041(-87, (lb_)null);
      }

      return var4;
   }

   static final int a890(int var0, int var1, int[] var2) {
      int var3;
      int var4;
      if ((ib_._j - 1) * ib_._d > var1) {
         var3 = var1 % (ib_._j - 1) + ib_._j * (var1 / (ib_._j - 1));
         var4 = var3 + 1;
      } else {
         var3 = var1 - (ib_._j - 1) * ib_._d;
         var4 = ib_._j + var3;
      }

      int var6 = var2[var3] - var2[var4];
      return 0 >= var6 ? -var6 : var6;
   }

   public static void a487() {
      _b = null;
      _a = null;
   }
}
