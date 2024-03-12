final class lh_ {
   private boolean _s = true;
   int _j;
   int _h;
   private int _a;
   ca_ _o;
   ca_ _d;
   int _k;
   static int _t = 9;
   ca_ _q;
   ca_ _m;
   static tb_ _p;
   ca_ _c;
   int _l;
   static String _b = "<col=8B1717>Charge</col>";
   int _e;
   static String _r = "Connection timed out. Please try using a different server.";
   se_ _f;
   int _g;
   static String[] _n = new String[]{"<%0> the Feared", "<%0> the Stalwart", "<%0> the Vengeful", "<%0> the Tyrant", "<%0>, Mistress of the Game"};
   int _i;

   private final void a789(int var1, byte var2, String var3, int var4) {
      int var5 = this._e + this._g;
      int var6 = this._h + this._l;
      int var7 = this._i;
      if (var7 == -1) {
         var7 = this._f._E + this._f._H;
      }

      int var8 = gf_._i >> 2;
      int var9 = this._f.b926(var3);
      int var10 = this._f._E + this._f._H;
      boolean var11 = true;
      int var12;
      int var13;
      if (var9 > var8 || var3.indexOf("<br>") != -1) {
         if (var8 < var9) {
            var13 = var9 / var8;
            var12 = var8 + (var9 % var8 + var13 - 1) / var13 * 2;
         } else {
            var12 = var8;
         }

         if (null == pe_._m) {
            pe_._m = new String[16];
         }

         int var15 = this._f.a899(var3, new int[]{var12}, pe_._m);
         var10 += (var15 - 1) * var7;
         var9 = 0;

         for(var13 = 0; var15 > var13; ++var13) {
            int var14 = this._f.b926(pe_._m[var13]);
            if (var14 > var9) {
               var9 = var14;
            }
         }
      }

      var12 = var1;
      if (var1 - (-var9 - var5) > gf_._i) {
         var12 = -var9 + (gf_._i - var5);
      }

      var13 = 32 + -this._f._N + var4;
      if (gf_._c < var6 + var13 + var10) {
         var13 = -var6 - var10 + var4;
      }

      gf_.e050(var12, var13, var9 + var5, var6 + var10, this._k);
      if (var2 == -81) {
         gf_.b050(var12 + 1, 1 + var13, var5 + var9 - 2, var6 + var10 - 2, this._j);
         this._f.a385(var3, this._e + var12, var13 + this._l, var9, var10, this._a, -1, 0, 0, var7);
      }
   }

   final void a021(int var1, se_ var2) {
      hh_ var3 = new hh_(var2, 2, 2, 2236962, 1, 1, 1, var2._H + var2._E + 2);
      var3._g = 16777215;
      this._m = var3;
      an_ var4 = new an_();
      var3.a446((byte)126, var4);
      var4._t = 11711154;
      this._i = -1;
      this._a = 15658734;
      this._f = var2;
      this._j = 5592405;
      this._e = 3;
      this._g = 3;
      this._l = 3;
      this._h = 3;
      var4._j = 15658734;
      this._k = 15658734;
      var4.a970(0, (byte)-115).a913(-7695, 15658734).a316(bb_.a447(8947848, 7829367, 10066329), true);
      var4.a970(1, (byte)-90).a316(bb_.a447(11184810, 13421772, 10066329), true);
      var4.a970(3, (byte)-97).a316(bb_.a447(8947848, 10066329, 7829367), true).b913(1, -114).c913(1, -33);
      cn_[] var5 = new cn_[9];
      ei_ var7 = new ei_(32, 32);

      for(int var8 = 0; var8 < var7._B.length; ++var8) {
         var7._B[var8] = 1077952576;
      }

      var5[4] = var7;
      var4.a970(4, (byte)-115).a479((byte)-110, true).a316(var5, true);
      var4.a970(5, (byte)-86).a316(hj_.a936(0, 65793, 0, 0), true).a479((byte)-116, true).a913(-7695, -1);
      this._o = var4;
      an_ var16 = new an_(var4, true);
      var16._f = 0;
      an_ var17 = new an_(var4, true);
      var17._f = 0;
      var17.a503(ek_.a229(8947848), 0);
      var17.a970(1, (byte)-107).a316(ek_.a229(11184810), true).a913(-7695, 2236962);
      this._q = new oh_(var2, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
      new jn_(var2, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
      new im_(var2, 16777215, -1, 125269879, 4473924, 3, 268435455);
      an_ var9 = new an_();
      var3.a446((byte)126, var9);
      var9.a970(0, (byte)-99).a316(bb_.a447(15658734, 10066329, 7829367), true).a913(-7695, 1118481).d913(-1, 216);
      var9.a970(4, (byte)-91).a479((byte)-111, true).a316(var5, true);
      this._c = var9;
      cn_[] var10 = new cn_[9];
      var10[4] = new cn_(2, 1);
      cn_[] var11 = new cn_[9];
      var11[4] = new cn_(1, 2);
      var11[4]._B = var10[4]._B = new int[]{6710886, 7829367};
      an_ var12 = new an_();
      an_ var13 = new an_();
      var12.a536(0, var10, -116);
      var13.a536(0, var11, -116);
      cn_ var14 = new cn_(7, 4);
      var14._B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
      an_ var15 = new an_(var4, true);
      var15.a587((byte)47, var14.d125());
      var14.g797();
      var15 = new an_(var4, true);
      var15.a587((byte)47, var14.d125());
      var14.g797();
      var15 = new an_(var4, true);
      var15.a587((byte)47, var14.d125());
      var14.g797();
      var15 = new an_(var4, true);
      var15.a587((byte)47, var14);
   }

   final void a370(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      gf_.b669(var2, var3, var1, var7, var4, var6);
      if (var5 > -61) {
         this.a006(-30, 77, 78, 91, 100, false);
      }

   }

   public static void a150(int var0) {
      _r = null;
      _b = null;
      _n = null;
      _p = null;
      if (var0 > -54) {
         a150(6);
      }

   }

   final void a006(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      gf_.c050(var4, var3, var1, var2, var5);
      if (!var6) {
         this._s = true;
      }

   }

   private final void a960(int var1, int var2, int var3, String var4) {
      int var5 = this._f.b926(var4);
      int var6 = this._f._N + this._f._E;
      int var7 = var2;
      if (var3 == 28964) {
         if (6 + var2 + var5 > gf_._i) {
            var7 = -var5 + (gf_._i - 6);
         }

         int var8 = 32 - this._f._N + var1;
         if (6 + var6 + var8 > gf_._c) {
            var8 = gf_._c + (-var6 - 6);
         }

         gf_.e050(var7, var8, 6 + var5, 6 + var6, this._a);
         gf_.b050(var7 + 1, var8 + 1, var5 + 4, var6 + 4, this._j);
         this._f.b191(var4, var7 + 3, this._f._N + var8 + 3, this._a, -1);
      }
   }

   final void a668(String var1, int var2, int var3, int var4) {
      if (!this._s) {
         this.a960(var3, var4, var2 - 6681922, var1);
      } else {
         this.a789(var4, (byte)-81, var1, var3);
      }

      if (var2 != 6710886) {
         _r = (String)null;
      }

   }

   public lh_() {
   }
}
