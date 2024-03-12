final class u_ extends gd_ {
   static ad_ _U = new ad_(7, 0, 1, 1);
   static cf_[] _T;
   static int _P;
   static String _S = "<col=8B1717>Disarm</col>";
   h_ _Q;
   static boolean _O;
   static String _R = "Monster attacks.";

   static final int a650(int var0, int var1) {
      if (var0 != 0) {
         if (var0 >= 0) {
            if (0 == var1) {
               return 0;
            } else {
               return 0 <= var1 ? d_.a313(-103, var0, var1) : -d_.a313(-120, var0, -var1);
            }
         } else if (0 == var1) {
            return 4096;
         } else {
            return 0 <= var1 ? -d_.a313(-81, -var0, var1) + 4096 : d_.a313(-89, -var0, -var1) - 4096;
         }
      } else if (0 != var1) {
         return 0 > var1 ? -2048 : 2048;
      } else {
         return 0;
      }
   }

   u_(int var1, int var2, h_ var3) {
      super(var1, var2, 0, 0, 0);
      this._Q = var3;
      String var4 = this._Q._F;
      int var5 = ib_.a598(this._Q);
      String[] var6 = jn_.a782(var4, new int[]{140, 88}, -78, db_._v);
      int var7 = var6.length * db_._v._H + la_._b._H + 42;
      boolean var8 = 0 >= pb_._G && 0 != (1 & this._Q._x);
      boolean var9 = 0 == gm_._d._e && 0 != (this._Q._x & 2);
      boolean var10 = var8 | var9;
      cn_ var11 = new cn_(140, var7);
      cn_ var12 = new cn_(140, var7);
      cn_ var13 = new cn_(140, var7);
      jh_.a303(var11);
      gf_.a797();
      int var14 = 0;

      int var15;
      for(var15 = 0; var6.length > var15; ++var15) {
         var14 += la_._b._H;
         la_._b.b191(var6[var15], var15 == 0 ? 0 : la_._b._H, var14, var10 ? 8421504 : 16760832, -1);
      }

      var14 += la_._b._H + 2;
      if (var8) {
         la_._b.b191(dn_._T, 52, var14, 16711680, -1);
      } else if (var9) {
         la_._b.b191(be_._q, 52, var14, 16711680, -1);
      } else {
         la_._b.b191(jk_.a841(new String[]{Integer.toString(var5 / 10)}, n_._a, 30496), 52, var14, 12632256, -1);
      }

      var14 += 4;
      var12.e797();
      var15 = var7 - 45;
      gf_.a797();
      var11.e326(0, 0, 16744448);
      gk_.a560(52, this._Q, 16744448, var14);
      rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, var15);
      var13.e797();
      gf_.a797();
      var11.e326(0, 0, 12690143);
      gk_.a560(52, this._Q, 10449103, var14);
      rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, var15);
      var11.e797();
      gk_.a560(52, this._Q, 12632256, var14);
      rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, var15);
      jh_.b797();
      cn_ var16 = rb_.a551(16, var12, 255, (byte)99);
      cn_ var17 = rb_.a551(16, var12, 16711680, (byte)-128);
      this.a037(var12, var11, var17, var13, (byte)106, var16);
      super._n = new fc_(this._Q);
      if (var10) {
         super._w = false;
      }

   }

   static final void a041(lb_ var0) {
      if (um_._i == null) {
         um_._i = new hb_[8];
      }

      for(int var1 = 0; 8 > var1; ++var1) {
         if (null == var0 || um_._i[var1] == var0._a[var1]) {
            um_._i[var1] = gm_._d._a[var1];
            if (null != um_._i[var1]) {
               eh_ var2 = 255 == um_._i[var1]._p ? k_._c : um_._i[var1]._n._e;
               um_._i[var1]._b = new wd_(var2);
            }
         }
      }

      ho_.b423();
   }

   final void b326(int var1, int var2, int var3) {
      int var4 = super._t - 3 + var1;
      int var5 = var3 + super._i - 3;
      int var6 = super._q + var4 + 5;
      int var7 = super._x + var5 + 5;
      if (var4 <= gf_._h && gf_._e >= var5 && gf_._j <= var6 && gf_._f <= var7) {
         gf_.b669(var4, var5, 5 + super._q, super._x + 5, 0, 128);
         super.b326(var1, var2, var3);
         cn_ var8 = null == this._Q._e ? null : this._Q._e.a571(40, 0, 40, 0);
         int var9 = super._x + var5 - 2 - 40;
         int var10 = 5 + var4;
         if (var8 == null) {
            gf_.b050(var10, var9, 32, 32, 0);
         } else {
            var8.c093(var10, var9);
         }

      }
   }

   static final String a975(se_ var0, String var1, int var2, int var3, int var4) {
      return ia_.a282(var4, var0, an_.a537(var3, var2, var1));
   }

   public static void c423() {
      _R = null;
      _S = null;
      _T = null;
      _U = null;
   }
}
