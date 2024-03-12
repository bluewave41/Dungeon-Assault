final class ia_ extends ii_ implements vg_ {
   private ck_ _T;
   static boolean _O = false;
   static int[] _S = new int[4];
   static int _X = 0;
   static String _N = "The <%0> lets loose his first attack with ferocious rage!";
   static nh_ _U;
   static cn_ _R;
   static nh_ _W;
   private ck_ _Z;
   static tk_ _K;
   static String _Y = "RAID";
   static cn_ _Q;
   static int _M = 0;
   static int[] _P = wa_.b878(-1);
   private ck_ _V;

   public ia_() {
      super(0, 0, 476, 225, (ca_)null);
      this._V = new ck_(qp_._c, (pg_)null);
      this._Z = new ck_(pp_._I, (pg_)null);
      this._T = new ck_(kd_._b, (pg_)null);
      na_ var1 = new na_();
      this._V._o = var1;
      this._Z._o = var1;
      this._T._o = var1;
      byte var2 = 4;
      short var3 = 326;
      int var4 = -var2 + var3 >> 1;
      this._Z.b050(0, var4, -var2 + (super._s - 48), -var3 + super._x >> 1, 30);
      this._T.b050(0, var4, super._s - var2 - 48, (super._x - var3 >> 1) - (-var4 - var2), 30);
      this._V.b050(0, var3, super._s - 78 - 2 * var2, super._x - var3 >> 1, 30);
      this._Z._n = this;
      this._V._n = this;
      this._T._n = this;
      this._V._i = hj_._U;
      this._T._i = oh_._n;
      this.b485((byte)-69, this._Z);
      this.b485((byte)-75, this._V);
      this.b485((byte)-120, this._T);
   }

   public final void a475(ck_ var1, byte var2, int var3, int var4, int var5) {
      if (var2 != 98) {
         this.a401((lm_)null, 'ﾀ', -77, (byte)92);
      }

      if (this._Z == var1) {
         rc_.b150(112);
      } else if (this._V == var1) {
         nh_.c487();
      } else if (var1 == this._T) {
         kd_.a150(var2 ^ 102);
      }

   }

   final void a115(int var1, int var2, int var3, int var4) {
      int var5 = var2 + super._q;
      int var6 = var4 + super._v;
      lp_._C.a385(he_._q, var5 + 20, 20 + var6, super._x - 40, super._s - 50, 16777215, -1, 1, 0, lp_._C._H);
      super.a115(var1, var2, var3, var4);
   }

   static final cn_ a059(String var0, int var1, String var2, int var3, int var4, String var5, nh_ var6) {
      if (var3 != 2316) {
         _M = -95;
      }

      byte[] var7 = pi_.a640(var2, var3 - 2316, var5, var0, var4, var1, var6);
      if (null == var7) {
         return null;
      } else {
         cn_ var8 = new cn_(var7, fi_.d602());

         for(int var9 = 0; var8._B.length > var9; ++var9) {
            var8._B[var9] = nb_.a080(var8._B[var9], 16777215);
         }

         return var8;
      }
   }

   public static void b487(boolean var0) {
      _Y = null;
      _W = null;
      if (!var0) {
         _O = true;
      }

      _K = null;
      _N = null;
      _S = null;
      _U = null;
      _Q = null;
      _P = null;
      _R = null;
   }

   static final String a282(int var0, se_ var1, String var2) {
      if (var0 >= var1.b926(var2)) {
         return var2;
      } else {
         String var3 = "...";

         do {
            var2 = var2.substring(0, var2.length() - 1);
         } while(var0 < var1.b926(var2 + var3));

         return var2 + var3;
      }
   }

   final boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (super.a401(var1, var2, var3, (byte)126)) {
         return true;
      } else if (98 != var3) {
         if (var4 < 55) {
            _U = (nh_)null;
         }

         return 99 == var3 ? this.a489((byte)-5, var1) : false;
      } else {
         return this.a059(var1, (byte)71);
      }
   }

   static {
      int[] var0 = _P;
      var0[0] = mp_.a080(var0[0], 131072);
      var0 = _P;
      var0[1] = mp_.a080(var0[1], 8);
   }
}
