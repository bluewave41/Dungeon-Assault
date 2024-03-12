final class jg_ {
   static ef_ _a = new ef_();
   static String _d = "Cancel";
   static cn_[] _c;
   static String _b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
   static String _e = "Discard";

   static final String a430(CharSequence var0) {
      return ug_.a776(false, -44, var0);
   }

   static final int a080(int var0, int var1) {
      var1 &= var0;
      if (var1 < 4096) {
         return var1 < 2048 ? jb_._Tb[2048 - var1] : -jb_._Tb[var1 - 2048];
      } else {
         return var1 >= 6144 ? jb_._Tb[var1 - 6144] : -jb_._Tb[-var1 + 6144];
      }
   }

   static final ba_[] b428() {
      return new ba_[]{ba_._e, gg_._c, rl_._j};
   }

   static final boolean a643(int var0, int var1, int var2, int var3) {
      return var0 <= hj_._S && hj_._S < var2 + var0 && var3 <= eh_._h && var1 + var3 > eh_._h;
   }

   public static void a423() {
      _b = null;
      _d = null;
      _c = null;
      _e = null;
      _a = null;
   }
}
