final class r_ {
   static int _c = 4;
   static int[] _b;
   static String _a = "EXIT";

   static final boolean a254(boolean var0, int var1, int var2) {
      if (!var0) {
         if (ci_._n[var1] < ci_._n[var2]) {
            return true;
         }

         if (ci_._n[var1] > ci_._n[var2]) {
            return false;
         }

         if (i_._t[var1] < i_._t[var2]) {
            return true;
         }

         if (i_._t[var1] > i_._t[var2]) {
            return false;
         }
      } else {
         if (i_._t[var1] < i_._t[var2]) {
            return true;
         }

         if (i_._t[var1] > i_._t[var2]) {
            return false;
         }

         if (ci_._n[var1] < ci_._n[var2]) {
            return true;
         }

         if (ci_._n[var2] < ci_._n[var1]) {
            return false;
         }
      }

      int var3 = tc_._w[var1] + mf_._d[var1] + wa_._m[var1];
      int var4 = mf_._d[var2] - (-wa_._m[var2] - tc_._w[var2]);
      if (var4 > var3) {
         return true;
      } else if (var3 > var4) {
         return false;
      } else {
         return var1 < var2;
      }
   }

   public final String toString() {
      throw new IllegalStateException();
   }

   static final void a556(int var0) {
      lm_._k = (var0 & 54) >> 4;
      mp_._d = (12 & var0) >> 2;
      if (2 < lm_._k) {
         lm_._k = 2;
      }

      uk_._c = var0 & 3;
      if (2 < mp_._d) {
         mp_._d = 2;
      }

      if (2 < uk_._c) {
         uk_._c = 2;
      }

   }

   public static void a150() {
      _a = null;
      _b = null;
   }
}
