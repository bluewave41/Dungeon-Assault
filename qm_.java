final class qm_ extends ip_ {
   static md_ _q = new md_();
   static String _p = "<col=FF0000>Attack -2</col>";
   static cn_ _m;
   static long _o;
   static cf_ _n;
   static u_[] _r;

   final String a439(byte var1, String var2) {
      if (var1 < 44) {
         return (String)null;
      } else {
         return this.a212(var2, 52) != pd_._J ? sh_._b : uj_._a;
      }
   }

   static final boolean a331(int var0, char var1) {
      if (var0 != 57) {
         a331(-9, 'ￅ');
      }

      return '0' <= var1 && var1 <= '9';
   }

   public static void d487() {
      _q = null;
      _m = null;
      _r = null;
      _p = null;
      _n = null;
   }

   final od_ a212(String var1, int var2) {
      boolean var3 = null == kc_.a263(var1, true);
      return var3 ? c_._d : pd_._J;
   }

   qm_(rm_ var1) {
      super(var1);
   }

   static final int a581(int var0, int var1, boolean var2, String var3, String var4, int var5, String var6) {
      if (var5 != 57) {
         _q = (md_)null;
      }

      cd_ var7 = new cd_(var4);
      cd_ var8 = new cd_(var6);
      return op_.a489(var7, var0, var1, var8, var3, ~var5, var2);
   }
}
