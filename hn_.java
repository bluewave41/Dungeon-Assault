final class hn_ extends kl_ {
   private pp_ _m;
   private String _p;
   private pp_ _r;
   boolean _s;
   private int _q;
   static int _t = 640;
   int _o;
   int _n;

   hn_(String var1, int var2, int var3, int var4) {
      super(300, 174);
      this._o = var4;
      this._p = var1;
      this._n = var2;
      this._q = var3;
      this._m = tn_.a226((-jm_._i._y + super._a >> 1) + super._k, -(2 * jm_._i._v) + super._i + super._j - 24, ne_._c, jm_._i, -39, "Accept");
      this._r = tn_.a226((super._a - jm_._i._y >> 1) + super._k, super._i + (super._j - jm_._i._v) - 16, ne_._c, jm_._i, -70, "Cancel");
      super._f.a865(this._m, false);
      super._f.a865(this._r, false);
   }

   static final void d423(byte var0) {
      cn_ var1 = new cn_(540, 140);
      lm_.a901(var1);
      re_.b797();
      if (var0 != -117) {
         _t = -63;
      }

      gf_.a797();
      nl_._d = 0;
      id_.a150(var0 ^ -439027613);
      cn_ var2 = var1.d125();

      for(int var3 = 0; var3 < 15; ++var3) {
         var2.e326(-2, -2, 16777215);
         gf_.d669(4, 4, 0, 0, 540, 140);
      }

      ie_._l.e797();
      var1.a093(0, 0);
      ti_.c487(true);
   }

   private final int a666(byte var1, int var2, int var3) {
      int var4 = super._j + 50;
      int var5 = super._k + 32;
      var2 -= var5;
      var3 -= var4;
      if (-10 <= var3 && var3 < 14 && var2 >= -10 && var2 < 10 + (super._a - 64)) {
         int var7 = ((super._a >> 1) - (32 - (this._n - 2) * var2)) / (super._a - 64) + 1;
         if (var7 < 1) {
            var7 = 1;
         }

         if (this._n - 1 < var7) {
            var7 = this._n - 1;
         }

         return var7;
      } else {
         return -1;
      }
   }

   final void a487(boolean var1) {
      super.a487(var1);
      if (null != hh_._s) {
         this._s = hh_._s == this._m;
         super._d = true;
      }

      if (1 == no_._d) {
         int var2 = this.a666((byte)113, lc_._c, hm_._k);
         if (-1 != var2) {
            this._o = var2;
         }
      }

   }

   final void b150(int var1) {
      super.b150(117);
      int var2 = (super._a >> 1) + super._k;
      int var3 = 10 + super._j;
      ne_._c.c191(this._p, var2, var3 + ne_._c._H, 16777215, -1);
      var3 += 10 + ne_._c._H;
      int var4 = 50 + super._j;
      qe_.b370(super._k + 32, var4, super._a - 64, 4, 0, 128, 128);

      int var6;
      int var7;
      int var8;
      for(var6 = 0; this._n - 1 > var6; ++var6) {
         var7 = var6 * (super._a - 64) / (this._n - 2) + 32 + super._k;

         for(var8 = 0; 4 > var8; ++var8) {
            gf_.c115(-var8 + var7, var4 - (2 - var8), 8 - var8 * 2, 16711680);
            gf_.c115(var7 - (-1 - var8), var8 - 2 + var4, -(2 * var8) + 8, 16744576);
         }
      }

      var6 = super._k + 32 + (this._q - 1) * (super._a - 64) / (this._n - 2);

      for(var7 = 0; var7 < 8; ++var7) {
         gf_.b115(-var7 + var6, var7 + var4 - 6, 2, 8421504);
         gf_.b115(var7 + var6, var7 - 6 + var4, 2, 8421504);
         gf_.b115(-var7 + var6, var4 + 9 - var7, 2, 8421504);
         gf_.b115(var7 + var6, 9 + var4 - var7, 2, 8421504);
      }

      var6 = super._k + 32 + (super._a - 64) * (this._o - 1) / (this._n - 2);

      for(var7 = 0; 8 > var7; ++var7) {
         gf_.b115(var6 - var7, var7 + (var4 - 6), 2, 16744576);
         gf_.b115(var6 + var7, var7 + (var4 - 6), 2, 16711680);
         gf_.b115(var6 - var7, -var7 + 9 + var4, 2, 16744576);
         gf_.b115(var7 + var6, -var7 + var4 + 9, 2, 16711680);
      }

      var7 = this.a666((byte)55, hj_._S, eh_._h);
      if (var7 != this._o - 1 && -1 != var7) {
         var6 = 32 + super._k + (super._a - 64) * (var7 - 1) / (this._n - 2);

         for(var8 = 0; var8 < 8; ++var8) {
            gf_.b115(-var8 + var6, var4 + -6 + var8, 2, 16776960);
            gf_.b115(var8 + var6, var4 - 6 + var8, 2, 16776960);
            gf_.b115(var6 - var8, 9 + var4 - var8, 2, 16776960);
            gf_.b115(var8 + var6, -var8 + var4 + 9, 2, 16776960);
         }
      }

      qe_._i[0].h093(var2 - 50, var4 + 20);
      ne_._c.b191(Integer.toString(this._o), var2 - 30, var4 + 36, 16711680, -1);
      qe_._i[1].h093(var2, var4 + 20);
      ne_._c.b191(Integer.toString(this._n - this._o), 20 + var2, 36 + var4, 65280, -1);
      ue_._i[1].h093(super._k + 20, 24 + super._j);
      ue_._i[0].h093(super._a + super._k - 36, super._j + 24);
   }
}
