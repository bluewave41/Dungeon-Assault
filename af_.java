import java.awt.Component;

final class af_ {
   static String _a = "Monster";

   static final void a224(boolean var0, tc_ var1, int var2, int var3, Component var4, int var5, qg_ var6) {
      vn_.a773(var2, var0, 10);
      ub_._n = vn_.a393(var6, var4, 0, var3);
      hm_._n = vn_.a393(var6, var4, 1, var5);
      wa_._j = new mb_();
      kc_._U = var5;
      hm_._n.a501(wa_._j);
      ek_._b = var1;
      ek_._b.a093(ql_._d, 256);
      ub_._n.a501(ek_._b);
   }

   public static void a150() {
      _a = null;
   }

   public final String toString() {
      throw new IllegalStateException();
   }

   static final void a423() {
      if (co_._G != null) {
         co_._G = null;
         bd_._f = 0;
         if (gh_._f) {
            ik_._e.c797();
            gh_._f = false;
            nf_._A = false;
            ik_._e = null;
         }

         if (wa_._a) {
            ll_._i = new md_();
            int[] var0 = gj_._c;

            int var1;
            for(var1 = 0; var1 < 8; ++var1) {
               var0[var1] = 0;
            }

            var0 = bp_._e;

            for(var1 = 0; 8 > var1; ++var1) {
               var0[var1] = 0;
            }

            wa_._a = false;
         }

      }
   }
}
