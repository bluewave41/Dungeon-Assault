final class rg_ extends ii_ implements pf_, vg_, mg_ {
   static int[] _P = new int[]{197379, 768, 771, 197376, 196611};
   private uh_ _K = new uh_("", (pg_)null, 20);
   gi_ _W;
   private uh_ _U = new uh_("", (pg_)null, 100);
   private ck_ _V;
   private uh_ _S = new uh_("", (pg_)null, 3);
   static eh_[] _M;
   private rb_ _T;
   private uh_ _R = new uh_("", (pg_)null, 12);
   private uh_ _L = new uh_("", (pg_)null, 20);
   private uh_ _O = new uh_("", (pg_)null, 100);
   private ck_ _N;
   private bh_ _Q;

   static final boolean i427() {
      return om_.a595(m_.c372(true), 2);
   }

   private final String j983(byte var1) {
      return var1 != -115 ? (String)null : "</col></u>";
   }

   private final int a499(String var1, lm_ var2, int var3, String var4, int var5, int var6) {
      return this.a886(101, var6, var1, var4, var5, var2, 35);
   }

   public final void a475(ck_ var1, byte var2, int var3, int var4, int var5) {
      if (this._V != var1) {
         if (this._N == var1) {
            this.f427((byte)-124);
         }
      } else {
         li_.c150(var2 + 218);
      }

      if (var2 != 98) {
         this._W = (gi_)null;
      }

   }

   public static void h423() {
      _M = null;
      _P = null;
   }

   private final int a585(int var1, String var2, lm_ var3, int var4, int var5) {
      dg_ var6 = new dg_(20, var4, 120 + var5, 25, var3, false, 120, var1, lp_._C, 16777215, var2);
      this.b485((byte)-54, var6);
      return var6._s;
   }

   static final void a924(int var0, ec_ var1, int var2, int var3, int var4) {
      var1.a093(6, 12);
      var1.i093(17, -119);
      var1.i093(var2, -90);
      var1.i093(var0, -95);
      if (var3 <= 4) {
         a984(62, (String)null);
      }

      var1.a093(6, var4);
   }

   public final void a271(int var1, bh_ var2, int var3, int var4) {
      if (var1 == 0) {
         lk_.a627("terms.ws");
      } else if (var1 != 1) {
         if (var1 == 2) {
            lk_.a627("conduct.ws");
         }
      } else {
         lk_.a627("privacy.ws");
      }

      if (var3 != 126) {
         this._K = (uh_)null;
      }

   }

   private final int a103(String var1, int var2, int var3, lm_ var4, int var5) {
      dg_ var6 = new dg_(20, var3, var2 + 120, 25, var4, false, 120, 3, lp_._C, 16777215, var1);
      this.b485((byte)-117, var6);
      ng_ var7 = new ng_(((qn_)var4).a293(-87));
      this.b485((byte)-126, var7);
      var7.b050(0, 15, var6._v + (var6._s - 15 >> 1), var5 + var6._q + var6._x, 15);
      return var6._s;
   }

   private final int a886(int var1, int var2, String var3, String var4, int var5, lm_ var6, int var7) {
      dg_ var8 = new dg_(20, var2, var5 + 120, 25, var6, false, 120, 3, lp_._C, 16777215, var3);
      this.b485((byte)-119, var8);
      tn_ var9 = new tn_(((qn_)var6).a293(-83), var4, 126, var2 + var8._s, 50 + var5, var7);
      var9._n = this;
      this.b485((byte)-60, var9);
      return var9._s + var8._s;
   }

   private final boolean b491(boolean var1) {
      if (!var1) {
         this.a271(31, (bh_)null, -50, -67);
      }

      return this.a940(23786, this._R) && this.a940(23786, this._O) && this.a940(23786, this._U) && this.a940(23786, this._K) && this.a940(23786, this._L) && this.a940(23786, this._S);
   }

   private final boolean f427(byte var1) {
      if (!this.b491(true)) {
         return false;
      } else {
         int var2 = -1;
         if (var1 != -124) {
            this._T = (rb_)null;
         }

         try {
            var2 = Integer.parseInt(this._S._w);
         } catch (NumberFormatException var4) {
         }

         return td_.a742(this._K._w, this._T._E, true, this._R._w, this, var2, this._O._w);
      }
   }

   static final void a984(int var0, String var1) {
      if (var0 != 15) {
         a924(65, (ec_)null, -49, -86, -120);
      }

   }

   private final String g983(byte var1) {
      if (var1 > -17) {
         a924(76, (ec_)null, -91, 62, -13);
      }

      return "<u=2164A2><col=2164A2>";
   }

   public final void a407(byte var1, String var2) {
      if (var1 > -26) {
         this.a103((String)null, 104, -13, (lm_)null, -83);
      }

      uh_ var3 = this._R;
      var3.a223(var2, false, (byte)91);
   }

   static final void i150() {
      int var0 = sn_._c.length;
      r_._b = new int[var0];
      ud_._w = new int[var0];

      for(int var1 = 0; var1 < var0; ++var1) {
         int[] var2 = sn_._c[var1]._B;
         int var3 = sn_._c[var1]._y;

         int var4;
         for(var4 = var2.length - 1; 0 <= var4 && 16776960 != var2[var4]; --var4) {
         }

         var2[var4] = 0;
         var2[var4 - 1] = 0;
         var2[-var3 + var4] = 0;
         var2[-1 - var3 + var4] = 0;
         ud_._w[var1] = sn_._c[var1]._w + var4 / var3 - 1;
         r_._b[var1] = var4 % var3 - 1 + sn_._c[var1]._A;
      }

   }

   public final void a150(int var1) {
      ((kh_)this._R.a293(-115)).e487(true);
      if (var1 <= 121) {
         this.g983((byte)69);
      }

   }

   public rg_() {
      super(0, 0, 496, 0, (ca_)null);
      boolean var1 = true;
      this._T = new rb_("", (pg_)null, var1);
      this._N = new ck_(ef_._a, (pg_)null);
      this._V = new ck_(pp_._I, (pg_)null);
      this._R._i = un_._d;
      this._O._i = lk_._Q;
      this._U._i = bk_._c;
      this._K._i = ce_._t;
      this._L._i = lm_._p;
      this._S._i = vk_._h;
      this._T._i = sa_._h;
      this._R.a981(new kh_(this._R), 10508);
      this._O.a981(new qm_(this._O), 10508);
      this._U.a981(new ga_(this._U, this._O), 10508);
      this._K.a981(new vo_(this._K, this._R, this._O), 10508);
      this._L.a981(new be_(this._L, this._K), 10508);
      this._S.a981(new he_(this._S), 10508);
      this._N._B = false;
      this._N._o = new na_();
      this._V._o = new oa_();
      this._R._o = new mc_(10000536);
      this._O._o = this._U._o = new mc_(10000536);
      this._S._o = new mc_(10000536);
      this._T._o = new dk_();
      this._K._o = this._L._o = new ic_(10000536);
      String var2 = jk_.a841(new String[]{this.g983((byte)-47), this.j983((byte)-115)}, ae_._h, 30496);
      int var3 = 20;
      var3 += this.a585(3, mp_._b, this._O, var3, 170);
      var3 += this.a886(-96, var3, hp_._a, "", 170, this._U, 20) + 5;
      var3 += this.a585(3, fk_._r, this._K, var3, 170);
      var3 += 5 + this.a499(qj_._a, this._L, -126, td_._b, 170, var3);
      var3 += 5 + this.a499(wf_._B, this._R, -123, an_._z, 170, var3);
      var3 += this.a103(fl_._o, 170, var3, this._S, 3);
      dg_ var4 = new dg_(46, var3, super._x - 90, 25, this._T, true, super._x - 120, 5, ta_._e, 11579568, lf_._q);
      this.b485((byte)-117, var4);
      var3 += var4._s;
      hh_ var5 = new hh_(lp_._C, 0, 0, 0, 0, 16777215, -1, 0, 0, lp_._C._H, -1, Integer.MAX_VALUE, true);
      this._Q = new bh_(var2, var5);
      this._Q._i = "";
      this._Q.a871(8, 0, kn_._d);
      this._Q.a871(8, 1, kn_._d);
      this._Q._n = this;
      this._Q.a762(46, (byte)-70, super._x - 90, var3);
      var3 += 15 + this._Q._s;
      this.b485((byte)-46, this._Q);
      byte var6 = 4;
      short var7 = 200;
      this._N.b050(0, var7, var3, -var7 + 496 >> 1, 40);
      this._V.b050(0, 60, var3 + 15, var6 + 3, 40);
      this._V._n = this;
      this._N._n = this;
      this.b485((byte)-84, this._N);
      this.b485((byte)-73, this._V);
      this._W = new gi_(this);
      this._W.b050(0, -this._R._q + super._x + (-this._R._x - 60), 20 + this._R._v, this._R._q + this._R._x + 60, 150);
      this.b485((byte)-88, this._W);
      this.b050(0, 496, 0, 0, 55 + var3 + var6);
   }

   final void a319(int var1, int var2, lm_ var3, boolean var4) {
      super.a319(var1, var2, var3, var4);
      this._N._B = this.b491(var4);
   }

   final boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (!super.a401(var1, var2, var3, (byte)112)) {
         if (98 == var3) {
            return this.a059(var1, (byte)71);
         } else {
            if (var4 < 55) {
               this.a940(108, (qn_)null);
            }

            return 99 != var3 ? false : this.a489((byte)-5, var1);
         }
      } else {
         return true;
      }
   }

   private final boolean a940(int var1, qn_ var2) {
      dp_ var3 = var2.a293(var1 - 23901);
      if (null == var3) {
         return true;
      } else {
         od_ var4 = var3.a151((byte)-93);
         if (var1 != 23786) {
            this._S = (uh_)null;
         }

         if (pd_._J != var4) {
            if (ub_._s != var4) {
               return var4 != hd_._g;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }
}
