import java.awt.Component;

final class im_ implements ca_ {
   private int _g;
   private int _c;
   private int _f;
   static String _l = "Unfortunately you are not eligible to create an account.";
   private int _i;
   static boolean _a;
   static volatile boolean _d = true;
   private int _k;
   private se_ _j;
   static cn_ _m;
   static me_ _b;
   private int _h;
   static cn_ _e;

   public final void a623(byte var1, lm_ var2, int var3, int var4, boolean var5) {
      eb_ var6 = (eb_)((eb_)(!(var2 instanceof eb_) ? null : var2));
      gf_.b050(var2._q + var3, var4 + var2._v, var2._x, var2._s, this._k);
      if (null == var6) {
      }

      int var7 = var2._x - var6._J * 2;
      if (var1 != 34) {
         this._c = 108;
      }

      int var8 = var6._J + var3 + var2._q;
      int var9 = var6._N + var2._v + var4;
      gf_.c050(var8, var9, var7 + var8, var9, this._h);

      for(int var10 = var6.i137(97) - 1; var10 >= 0; --var10) {
         gf_.f115(var8 + var7 * var6.a080(-1, var10) / var6.a137(-116), var9, this._f, this._i);
      }

      if (this._j != null) {
         this._j.c191(var6._w, var7 / 2 + var8, this._j._R + var9 + var6._N, this._c, this._g);
      }

   }

   public static void a150() {
      _m = null;
      _b = null;
      _l = null;
      _e = null;
   }

   static final void a249(Component var0) {
      var0.addMouseListener(ib_._f);
      var0.addMouseMotionListener(ib_._f);
      var0.addFocusListener(ib_._f);
   }

   im_(se_ var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this._g = var3;
      this._c = var2;
      this._h = var4;
      this._k = var5;
      this._j = var1;
      this._f = var6;
      this._i = var7;
   }
}
