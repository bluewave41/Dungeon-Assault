final class vk_ {
   static int _e;
   String[] _c;
   int _d;
   boolean _a;
   String _g;
   static String _h = "Type your age in years";
   static String _b = "This female demon sports a manic smile and a sadistic look in her wide, wild eyes. She uses her sharp claws to rend flesh and takes pleasure in death.";
   boolean _f;

   static final b_ a353(Throwable var0, String var1) {
      b_ var2;
      if (!(var0 instanceof b_)) {
         var2 = new b_(var0, var1);
      } else {
         var2 = (b_)var0;
         var2._c = var2._c + ' ' + var1;
      }

      return var2;
   }

   static final boolean a154() {
      return 10 <= kh_._n && 13 <= dk_._c;
   }

   static final vk_ a041(String var0) {
      if (wd_._d == ql_._f) {
         return null;
      } else if (wd_._d == dh_._b && var0.equals(bf_._o)) {
         wd_._d = sp_._e;
         return ll_._p;
      } else {
         wd_._d = ql_._f;
         bf_._o = var0;
         ll_._p = null;
         return null;
      }
   }

   static final void a423() {
      d_._f = false;
   }

   public static void b423() {
      _b = null;
      _h = null;
   }

   vk_(boolean var1) {
      this._a = var1;
   }
}
