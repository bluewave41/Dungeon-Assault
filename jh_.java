final class jh_ {
   static cn_ _l = new cn_(640, 480);
   static int[] _d;
   static int[] _f;
   private static int[] _j;
   private static int _b;
   private static int[][] _e;
   private static int[] _c;
   private static int[][] _h;
   private static int[] _g;
   private static int[] _a;
   private static int[] _i;
   private static int[] _k;

   public static void a797() {
      _l = null;
      _d = null;
      _f = null;
      _e = (int[][])null;
      _h = (int[][])null;
      _j = null;
      _c = null;
      _i = null;
      _a = null;
      _g = null;
      _k = null;
   }

   static final void b797() {
      --_b;
      gf_.a397(_e[_b], _g[_b], _k[_b]);
      gf_._j = _j[_b];
      gf_._h = _i[_b];
      gf_._f = _c[_b];
      gf_._e = _a[_b];
      _f = _h[_b];
      _l._B = _h[_b];
      _l._y = _g[_b];
      _l._v = _k[_b];
   }

   static final void a276(ph_ var0) {
      c797();
      b276(var0);
   }

   private static final void b276(ph_ var0) {
      a839(var0._a, var0._c);
   }

   static final void c797() {
      _e[_b] = gf_._b;
      _h[_b] = _f;
      _j[_b] = gf_._j;
      _i[_b] = gf_._h;
      _c[_b] = gf_._f;
      _a[_b] = gf_._e;
      _g[_b] = gf_._i;
      _k[_b] = gf_._c;
      ++_b;
   }

   static final void a303(cn_ var0) {
      c797();
      var0.e797();
   }

   private static final void a839(cn_ var0, int[] var1) {
      var0.e797();
      _f = var1;
      _l._B = var1;
      _l._y = var0._y;
      _l._v = var0._v;
   }

   static {
      _d = _l._B;
      _f = _d;
      _j = new int[4];
      _b = 0;
      _a = new int[4];
      _i = new int[4];
      _c = new int[4];
      _h = new int[4][];
      _g = new int[4];
      _e = new int[4][];
      _k = new int[4];
   }
}
