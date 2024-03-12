final class re_ {
   static int _h;
   private static int[] _a = new int[2048];
   static int[] _f = new int[2048];
   private static int[] _g = new int[512];
   static int[] _e = new int[1024];
   private static int[] _c = new int[2048];
   static int _d;
   static int _i;
   static int _b;

   public static void c797() {
      _e = null;
      _g = null;
      _a = null;
      _f = null;
      _c = null;
   }

   static final void b797() {
      a115(gf_._j, gf_._f, gf_._h, gf_._e);
   }

   private static final void a797() {
      _d = _b / 2;
      _h = _i / 2;
   }

   private static final void a115(int var0, int var1, int var2, int var3) {
      _b = var2 - var0;
      _i = var3 - var1;
      a797();
      if (_e.length < _i) {
         _e = new int[gk_.a080(_i)];
      }

      int var4 = var1 * gf_._i + var0;

      for(int var5 = 0; var5 < _i; ++var5) {
         _e[var5] = var4;
         var4 += gf_._i;
      }

   }

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         _g[var0] = '耀' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         _a[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         _f[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
         _c[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
      }

   }
}
