final class na_ extends hh_ {
   static ji_ _D;
   static cn_ _A;
   static cc_ _y;
   private int _F;
   private cn_[] _x;
   private int _z;
   static tf_ _w;
   private int _E;
   static cn_[] _C;
   static int[] _G = new int[]{28, 234, 513, 709, 950, 1046, 1325, 1430, 1693};

   public static void c150(int var0) {
      _A = null;
      if (var0 < -26) {
         _C = null;
         _G = null;
         _D = null;
         _w = null;
         _y = null;
      }
   }

   static final void a520(boolean var0, int var1, boolean var2) {
      hd_.a164(var1 ^ 2599413, var2, (String)null, var0);
      if (var1 != 2591221) {
         _A = (cn_)null;
      }

   }

   public na_() {
      this(2188450, 2591221, 9543);
   }

   private na_(int var1, int var2, int var3) {
      this._x = _C;
      this._E = var3;
      this._F = var2;
      this._z = var1;
      super._u = hc_._f;
   }

   public final void a623(byte var1, lm_ var2, int var3, int var4, boolean var5) {
      boolean var6 = var2._u || var2.a427((byte)75);
      if (var2 instanceof ck_) {
         var5 &= ((ck_)var2)._B;
      }

      int var7 = !var5 ? this._E : (!var6 ? this._z : this._F);
      ad_.a028(var2._x, var4 + var2._v + (-this._x[0]._G + var2._s >> 1), var3 + var2._q, var7, this._x);
      int var8 = var5 ? 16777215 : 7105644;
      if (var1 != 34) {
         c150(123);
      }

      super._u.a385(var2._w, var3 + var2._q, var4 - (-var2._v + 2), var2._x, var2._s, var8, -1, 1, 1, super._u._H);
   }
}
