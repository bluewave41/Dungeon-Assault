import java.awt.Component;

final class gn_ {
   private String _j;
   String _f;
   String _b;
   static cn_[] _i;
   static int _d = 32;
   int _a;
   private String _e;
   int _g;
   static int _h;
   static cn_ _c;

   static final void a649(Component var0) {
      var0.removeMouseListener(ib_._f);
      var0.removeMouseMotionListener(ib_._f);
      var0.removeFocusListener(ib_._f);
      ua_._a = 0;
   }

   public static void a150(int var0) {
      if (var0 != 194) {
         a150(3);
      }

      _i = null;
      _c = null;
   }

   final void a423(byte var1) {
      this._b = rf_._K.a803(this._e, (byte)-48);
      this._f = rf_._K.a803(this._j, (byte)-48);
      int var2 = oj_.a170(this._f, new int[]{194}, la_._b);
      this._a = 10 + la_._b._H * var2;
      if (var1 > -68) {
         a649((Component)null);
      }

      if (null != this._b) {
         int var3 = null != this._b ? oj_.a170(this._b, new int[]{194}, ne_._c) : 0;
         this._g = var3 * ne_._c._H;
         this._a += ne_._c._H * var3 + 10;
      } else {
         this._g = 0;
      }

   }

   gn_(String var1, String var2) {
      this._j = var2;
      this._e = var1;
   }
}
