import java.util.Random;

final class tk_ {
   int[] _n;
   private cn_[] _p;
   int[] _z;
   int[] _m;
   int[] _s;
   boolean[] _i;
   int[] _x;
   int[] _e;
   int[] _h;
   int[] _c;
   int _g;
   private se_ _o;
   static pp_ _k;
   static String _b = "<col=FF0000>Lethal</col>. Can cause party to flee in terror.";
   int[] _y;
   int[] _a;
   int[] _u;
   int[] _A;
   boolean[] _B;
   private cn_[] _l;
   int[] _j;
   int[] _f;
   private String[] _t;
   int[] _q;
   int[] _d;
   int _w;
   int _r;
   static String _v;

   final void a487(boolean var1) {
      if (var1) {
         ++this._w;
      }
   }

   static final void a423() {
      tn_.a150(-1);
      he_._s = true;
      qc_._t = true;
      lg_._w.h150(1);
      gh_.a676(ha_._o, false);
   }

   private final int a634(cn_[] var1, cn_[] var2, int[] var3, se_ var4, int var5, String[] var6, int var7) {
      int var8 = var2.length;
      this._z = new int[var8];
      this._d = new int[var8];
      this._i = new boolean[var8];
      this._q = new int[var8];
      this._y = new int[var8];
      this._p = var1;
      this._w = 0;
      this._B = new boolean[var8];
      this._m = new int[var8];
      this._j = new int[var8];
      this._o = var4;
      this._a = new int[var8];
      this._A = new int[var8];
      this._u = new int[var8];
      this._t = var6;
      this._l = var2;
      this._e = new int[var8];
      this._n = new int[var8];
      this._f = new int[var8];
      if (var7 != 2048) {
         b423((byte)-101);
      }

      this._x = new int[var8];
      this._c = new int[var8];
      this._s = new int[var8];
      this._h = new int[var8];
      Random var9 = new Random(416516L);
      int var10 = 0;

      for(int var11 = 0; var11 < var8; ++var11) {
         int var12 = var2[var11]._y << 4;
         int var13 = var2[var11]._v << 4;
         int var14 = var12 / 2;
         int var15 = var13 / 2;
         this._c[var11] = -1024 + uj_.a004(var9, 37, 2048);
         this._n[var11] = 6000 + uj_.a004(var9, md_.b080(var7, 2085), 2048);
         this._A[var11] = -var14 / 2;
         this._y[var11] = -var15 / 2;
         this._j[var11] = -(var14 * this._n[var11]) >> 12;
         this._q[var11] = -(var15 * this._n[var11]) >> 12;
         this._h[var11] = -1024 + uj_.a004(var9, 37, 2048);
         this._s[var11] = uj_.a004(var9, 37, 2048) + 6000;
         this._e[var11] = -var14 / 4;
         this._m[var11] = -var15 / 4;
         this._f[var11] = -(var14 * this._n[var11]) >> 12;
         this._x[var11] = -(this._n[var11] * var15 >> 12) + 2000;
         this._z[var11] = var10;
         var10 += var3[var11];
         this._d[var11] = var10 + var5;
         boolean[] var16 = this._i;
         this._B[var11] = false;
         var16[var11] = false;
         int[] var18 = this._u;
         this._a[var11] = 0;
         var18[var11] = 0;
      }

      return this._d[var8 - 1];
   }

   public static void b423(byte var0) {
      _v = null;
      _k = null;
      if (var0 == 10) {
         _b = null;
      }
   }

   static final void a115(int var0, int var1, int var2) {
      sm_._c = var1;
      om_._a = var0;
      he_._p = var2;
   }

   final void a150(int var1) {
      int var2 = 0;
      if (var1 > -1) {
         this._w = -24;
      }

      for(; var2 < this._l.length; ++var2) {
         if (this._w >= this._z[var2] && this._d[var2] >= this._w) {
            int var3 = this._w - this._z[var2];
            int var4 = this._d[var2] - this._z[var2];
            double var5 = (double)var3 / (double)var4;
            if (12 > bc_._a) {
               this._l[var2].a669((int)to_.a088(this._A[var2], this._e[var2], var5), (int)to_.a088(this._y[var2], this._m[var2], var5), (int)to_.a088(this._j[var2], this._f[var2], var5), (int)to_.a088(this._q[var2], this._x[var2], var5), (int)to_.a088(this._c[var2], this._h[var2], var5), (int)to_.a088(this._n[var2], this._s[var2], var5));
            } else {
               this._l[var2].b669((int)to_.a088(this._A[var2], this._e[var2], var5), (int)to_.a088(this._y[var2], this._m[var2], var5), (int)to_.a088(this._j[var2], this._f[var2], var5), (int)to_.a088(this._q[var2], this._x[var2], var5), (int)to_.a088(this._c[var2], this._h[var2], var5), (int)to_.a088(this._n[var2], this._s[var2], var5));
            }

            gf_.b050(0, 0, gf_._i, this._r, 0);
            gf_.b050(0, gf_._c - this._r, gf_._i, this._r, 0);
            if (this._o != null && this._t[var2] != null) {
               int var7 = this._o._E + this._o._H;
               int var8 = this._o.b913(this._t[var2], 616);
               int var9 = this._o.c913(this._t[var2], 616);
               if (this._p != null) {
                  sn_.a311(116, (var9 < 2 ? var7 : 100) + 2, this._p, 4, 460 - (var9 < 2 ? 0 : var7) - this._o._H, var8 + 22);
               }

               this._o.a385(this._t[var2], 12, 415, 616, 60, 16777215, 0, 1, 1, var7);
            }

            if (25 > var3 && this._B[var2]) {
               gf_.b669(0, 0, gf_._i, gf_._c, this._a[var2], 256 - var3 * 10);
            }

            var3 = -var3 + var4;
            if (25 > var3 && this._i[var2]) {
               gf_.b669(0, 0, gf_._i, gf_._c, this._u[var2], 256 - 10 * var3);
            }
         }
      }

   }

   tk_(cn_[] var1, int[] var2, int var3, se_ var4, String[] var5, cn_[] var6) {
      this._g = this.a634(var6, var1, var2, var4, var3, var5, 2048);
   }
}
