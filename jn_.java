final class jn_ implements ca_ {
   private se_ _g;
   static int[] _k;
   static int _d;
   private int _b;
   private int _i;
   static boolean _c;
   static gn_ _l;
   private int _f;
   private int _m;
   static cn_ _a;
   private int _j;
   private int _e;
   private int _h;
   static lg_ _n;

   public final void a623(byte var1, lm_ var2, int var3, int var4, boolean var5) {
      j_ var6 = (j_)((j_)(var2 instanceof j_ ? var2 : null));
      gf_.b050(var2._q + var3, var4 + var2._v, var2._x, var2._s, this._i);
      if (null != var6) {
      }

      int var7 = var3 + var2._q + var6._I;
      int var8 = var6._R + var2._v + var4;
      gf_.f115(var7, var8, var6._M, this._h);
      if (var1 == 34) {
         double var9;
         int var11;
         int var12;
         if (var6._P != -1) {
            var9 = 2.0 * (double)var6._P * Math.PI / (double)var6._N;
            var11 = (int)(-Math.sin(var9) * (double)var6._M);
            var12 = (int)(Math.cos(var9) * (double)var6._M);
            gf_.f115(var7 + var11, var8 + var12, 1, this._b);
         }

         gf_.f115(var7, var8, 2, 1);
         var9 = (double)var6._K * Math.PI * 2.0 / (double)var6._N;
         var11 = (int)(-Math.sin(var9) * (double)var6._M);
         var12 = (int)(Math.cos(var9) * (double)var6._M);
         gf_.c050(var7, var8, var11 + var7, var12 + var8, 1);
         if (null != this._g) {
            int var13 = this._e + var6._I + var6._M;
            this._g.a385(var2._w, var2._q + var3 + var13, this._m + var2._v + var4, -this._e - var13 + var2._x, -(this._e << 1) + var2._s, this._f, this._j, 1, 1, 0);
         }

      }
   }

   static final String[] a782(String var0, int[] var1, int var2, se_ var3) {
      if (wk_._a == null) {
         wk_._a = new String[16];
      }

      if (var2 > -59) {
         a782((String)null, (int[])null, -127, (se_)null);
      }

      int var4;
      while(true) {
         try {
            var4 = var3.a899(var0, var1, wk_._a);
            break;
         } catch (ArrayIndexOutOfBoundsException var7) {
            if (wk_._a.length >= 1024) {
               return null;
            }

            wk_._a = new String[wk_._a.length << 1];
         }
      }

      String[] var5 = new String[var4];

      for(int var6 = 0; var6 < var4; ++var6) {
         var5[var6] = new String(wk_._a[var6]);
      }

      ig_.a722(var5);
      return var5;
   }

   public static void a150() {
      _n = null;
      _k = null;
      _l = null;
      _a = null;
   }

   jn_(se_ var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this._f = var4;
      this._j = var5;
      this._e = var2;
      this._h = var6;
      this._m = var3;
      this._g = var1;
      this._b = var7;
      this._i = var8;
   }
}
