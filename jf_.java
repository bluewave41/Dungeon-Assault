final class jf_ extends en_ {
   static String[] _e = new String[]{"Immortality", "Deaths are treated as incapacitation."};
   static cn_ _f;
   static long[] _g = new long[32];
   private wb_ _d;

   public static void a487(boolean var0) {
      _f = null;
      _e = null;
      _g = null;
      if (!var0) {
         a182(18, (nh_)null, -123, (byte)-39);
      }

   }

   private final cn_ c373(byte var1) {
      if (var1 < 18) {
         this._d = (wb_)null;
      }

      jh_.c797();
      int var2 = 4 + this._d._c._y + la_._b.b926(this._d._b);
      int var3 = la_._b._H + la_._b._E;
      if (this._d._c._v > var3) {
         var3 = this._d._c._v;
      }

      cn_ var4 = new cn_(var2, var3);
      var4.e797();
      this._d._c.c326(0, la_._b._H - this._d._c._v >> 1, this._d._a);
      la_._b.b191(ck_._H.a803(this._d._b, (byte)-48), 4 + this._d._c._y, la_._b._H, this._d._a, -1);
      jh_.b797();
      return var4;
   }

   static final cn_ a182(int var0, nh_ var1, int var2, byte var3) {
      if (var3 != 41) {
         return (cn_)null;
      } else {
         return !kk_.a283(var1, 1, var2, var0) ? null : ff_.a373();
      }
   }

   final void a185(int var1, sa_ var2) {
      cn_ var3 = this.c373((byte)44);
      var2.a098(var3, var1, false, -5, var2._y - var3._v >> 1);
   }

   final cn_ b373(byte var1) {
      return this.c373((byte)25);
   }

   jf_(wb_ var1) {
      this._d = var1;
   }
}
