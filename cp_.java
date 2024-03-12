import java.applet.Applet;

final class cp_ extends gd_ {
   static String _T = "Login: ";
   static boolean _U = false;
   static String _P = "If the trap here is triggered, the room will almost instantly fill with a gangrenous-looking poison gas.";
   ac_ _S;
   static String[] _Q;
   static int _R = 64;
   static String _O = "Giant Rats";

   final void b326(int var1, int var2, int var3) {
      if (var2 == 8187) {
         int var4 = var1 + (super._t - 3);
         int var5 = var3 + super._i - 3;
         int var6 = 5 + super._q + var4;
         int var7 = 5 + var5 + super._x;
         if (var4 <= gf_._h && gf_._e >= var5 && gf_._j <= var6 && var7 >= gf_._f) {
            gf_.b669(var4, var5, super._q + 5, super._x + 5, 0, 128);
            super.b326(var1, var2 + 0, var3);
            cn_ var8 = this._S._d.a571(40, 0, 40, 0);
            int var9 = super._x + var5 - 42;
            int var10 = var4 + 5;
            if (null == var8) {
               gf_.b050(var10, var9, 32, 32, 0);
            } else {
               var8.c093(var10, var9);
            }

         }
      }
   }

   cp_(int var1, int var2, ac_ var3) {
      super(var1, var2, 0, 0, 0);
      this._S = var3;
      String var4 = this._S._z;
      int var5 = this._S._c;
      String[] var6 = jn_.a782(var4, new int[]{140, 88}, -108, db_._v);
      int var7 = db_._v._H * var6.length + la_._b._H + 42;
      boolean var8 = 0 >= pb_._G && (this._S._j & 1) != 0;
      boolean var9 = 0 == gm_._d._e && (this._S._j & 2) != 0;
      boolean var10 = var8 | var9;
      cn_ var11 = new cn_(140, var7);
      cn_ var12 = new cn_(140, var7);
      cn_ var13 = new cn_(140, var7);
      jh_.a303(var11);
      gf_.a797();
      int var14 = 0;

      int var15;
      for(var15 = 0; var15 < var6.length; ++var15) {
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
      var15 = var7 - 5 - 40;
      gf_.a797();
      var11.e326(0, 0, 16744448);
      al_.a695(52, var14, this._S, 16744448);
      rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, var15);
      var13.e797();
      gf_.a797();
      var11.e326(0, 0, 12690143);
      al_.a695(52, var14, this._S, 10449103);
      rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, var15);
      var11.e797();
      al_.a695(52, var14, this._S, 12632256);
      rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, var15);
      jh_.b797();
      cn_ var16 = rb_.a551(16, var12, 255, (byte)-95);
      cn_ var17 = rb_.a551(16, var12, 16711680, (byte)-75);
      this.a037(var12, var11, var17, var13, (byte)126, var16);
      super._n = new bd_(this._S);
      if (var10) {
         super._w = false;
      }

   }

   static final void a406(int var0, Applet var1, int var2, String[] var3, int var4) {
      mj_._f = var1.getParameter("overxgames");
      if (null == mj_._f) {
         mj_._f = "0";
      }

      dh_._f = var1.getParameter("overxachievements");
      if (dh_._f == null) {
         dh_._f = "0";
      }

      String var5 = var1.getParameter("currency");
      if (null != var5 && sj_.a454(var5, 10)) {
         wo_._g = ri_.a034((byte)87, var5);
      } else {
         wo_._g = 2;
      }

      uj_._d = var4;
      lj_._u = var2;
      ld_._c = var0;
      en_._b = new cn_[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         en_._b[var6] = new cn_(317, 34);
      }

      ec_._l = var3;
   }

   static final int f313(int var0, int var1) {
      int var3 = var1 >>> 31;
      return (var3 + var1) / var0 - var3;
   }

   public static void c423(byte var0) {
      _O = null;
      _Q = null;
      _P = null;
      if (var0 != -66) {
         _U = false;
      }

      _T = null;
   }

   static final void f150(int var0) {
      if (!fm_.a427()) {
         if (cm_._R != null && cm_._R._g) {
            ib_.a150();
            na_._D.a336(new nm_(na_._D, of_._g), -1);
         }

      } else {
         na_._D.a421(am_._e, (byte)66, bp_._d, true);
         na_._D.b487(true);

         while(ha_.b427()) {
            na_._D.a564(var0 + 30335, mm_._t, ob_._Yb);
         }

         if (var0 != -30208) {
            c423((byte)49);
         }

      }
   }
}
