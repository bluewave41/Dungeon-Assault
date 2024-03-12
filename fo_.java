final class fo_ {
   static int[] _c = rb_.b330(16777215, 8421504, 64);
   static nn_ _d;
   static int _b;
   static cn_ _a;

   public static void a423() {
      _c = null;
      _d = null;
      _a = null;
   }

   static final cn_[] a033(int var0) {
      cn_[] var1 = new cn_[dk_._d];

      for(int var2 = var0; var2 < dk_._d; ++var2) {
         int var3 = jn_._k[var2] * jc_._f[var2];
         byte[] var4 = ub_._q[var2];
         int[] var5 = new int[var3];

         for(int var6 = 0; var6 < var3; ++var6) {
            var5[var6] = uo_._b[nb_.a080(255, var4[var6])];
         }

         var1[var2] = new cn_(ce_._x, tb_._i, hg_._t[var2], fe_._g[var2], jc_._f[var2], jn_._k[var2], var5);
      }

      sb_.a150();
      return var1;
   }

   static final void a093(int var0) {
      int var1;
      int var2;
      if (var0 < ib_._d * (ib_._j - 1)) {
         var1 = ib_._j * (var0 / (ib_._j - 1)) + var0 % (ib_._j - 1);
         var2 = 1 + var1;
      } else {
         var1 = -(ib_._d * (ib_._j - 1)) + var0;
         var2 = var1 + ib_._j;
      }

      int var3 = ue_._j[var1];
      int var4 = ue_._j[var2];
      if (var4 != var3) {
         bo_._Jb.a093(var0, -116);
         lm_.a789(var4, var3);
      }

   }
}
