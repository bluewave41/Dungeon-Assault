final class oc_ extends kl_ {
   static int _E = -1;
   go_ _w;
   private ai_ _F;
   static od_ _A = new od_();
   private boolean _s;
   private int _H;
   private int _r;
   int _q;
   boolean _t;
   private cn_ _m;
   private hb_ _n;
   private String _D;
   private pp_ _z;
   private wd_ _p;
   int _B;
   private cn_ _y;
   private cn_ _o;
   private int _C;
   static String _v = "You are charging 1 Orb of Mastery!";
   private boolean _u;
   private cn_ _I;
   private boolean _x;

   static final void a802(int var0, int var1, int var2, int var3, int var4) {
      kc_._Q[lc_._d] = var0;
      ol_._k[lc_._d] = lc_._d;
      i_._t[lc_._d] = var4;
      if (var4 > ln_._d) {
         n_._d = var4;
      }

      if (var4 < ib_._e) {
         da_._B = var4;
      }

      mf_._d[lc_._d] = var1;
      wa_._m[lc_._d] = var2;
      tc_._w[lc_._d] = var3;
      int var5 = var3 + var1 + var2;
      int var6 = 0 == var5 ? 0 : 1000 * var1 / var5;
      ci_._n[lc_._d] = var6;
      if (var6 < da_._B) {
         da_._B = var6;
      }

      ++lc_._d;
      if (var6 > n_._d) {
         n_._d = var6;
      }

   }

   final void c423(byte var1) {
      super.c423((byte)-113);
      ++this._C;
      if (this._C == 100) {
         this.d150(126);
      }

      if (this._C == 115) {
         this.d487(true);
      }

      this._p.a556((byte)109, 20);
   }

   final void a487(boolean var1) {
      super.a487(var1);
      if (this._z == hh_._s) {
         if (100 > this._C) {
            this._C = 100;
            this.d150(127);
         } else if (this._C > 175) {
            super._d = true;
            if (null != this._n._n._e) {
               this._n._n._e.a423((byte)-19);
            }

            if (null != this._n._n._t) {
               this._n._n._t.a423((byte)-19);
            }

            if (null != this._n._n._v) {
               this._n._n._v.a423((byte)-19);
            }

            System.gc();
            this._w.a668(this._B, this._q, this._t, -1);
         }
      }

   }

   public static void e150(int var0) {
      _v = null;
      if (var0 != 4296) {
         e150(-11);
      }

      _A = null;
   }

   private final void d150(int var1) {
      this._p.a721(ga_._n, this._x ? this._n._n._t : this._n._n._v, -10872);
      if (var1 > 124) {
         if (this._x) {
            t_.a124(1024, dd_._B, false);
         }

         if (this._x) {
            qh_.a726(-13716, this._z, 10);
         } else if (this._F._h._g != 3) {
            qh_.a726(-13716, this._z, 11);
         }

      }
   }

   final void b423(byte var1) {
      int[] var2 = new int[64];

      for(int var3 = 0; var3 < 64; ++var3) {
         var2[var3] = mp_.a080(Integer.MIN_VALUE, 1579032 + 65793 * var3);
      }

      cn_ var9 = te_.a983(super._a - 32, super._i - 28, var2, 16, 8, 0.125);
      int[] var4 = te_.b285(super._a - 32, super._i - 28, 0.125);
      cn_ var5 = new cn_(0, 0);
      var5._v = super._i - 28;
      var5._y = super._a - 32;
      var5._B = var4;
      ph_ var6 = new ph_(var9, var5);
      cn_ var7 = new cn_(super._a, super._i);
      cn_ var8 = new cn_(super._a, super._i);
      super._l = new ph_(var7, var8);
      jh_.a276(super._l);
      var6.b093(16, 16);
      if (var1 != 37) {
         this.c423((byte)-26);
      }

      qe_.a229(23, 13, super._a - 46, super._i - 34, 256, 32, 8, 128);
      jc_.a669(super._i - 26, 16, 14, 1, 2, 1);
      jc_.a669(super._i - 26, super._a - 24, 14, 1, var1 - 35, 1);
      vd_.a669(super._a - 16, 2, -14561, 2, 8, 0);
      vd_.a669(super._a, 2, var1 ^ -14534, 2, 0, 6);
      vd_.a669(super._a, 2, var1 - 14598, 2, 0, 54);
      vd_.a669(super._a - 16, 2, -14561, 2, 8, super._i - 16);
      vd_.a669(super._a, 2, var1 ^ -14534, 2, 0, super._i - 22);
      jc_.a669(40, 80, 14, 1, 2, 1);
      jc_.a669(40, super._a - 88, 14, 1, 2, 1);
      oe_._m.h093(8, 21);
      oe_._m.j093(super._a - 63, 21);
      ad_._e.i093(23, super._i - 38);
      ad_._e.f093(super._a - 39, super._i - 38);
      da_.a563(bb_._q, cm_._M, super._a >> 1, var1 + 1917623580, 14 + (ne_._c._H + 36 >> 1), ne_._c);
      jh_.b797();
   }

   oc_(hb_ var1, ai_ var2, boolean var3, String var4) {
      super(350, 400);
      this._F = var2;
      this._D = var4;
      this._n = var1;
      this._x = var3;
      this._C = 0;
      this._r = oi_.b080(0, 4);
      ub_.a543(this._r);
      this._H = oi_.b080(0, 4);
      ub_.a543(this._H);
      this._s = 0 == oi_.b080(0, 2);
      this._u = oi_.b080(0, 2) == 0;
      this._p = new wd_(this._n._n._e);
      this._z = tn_.a226((super._a - jm_._i._y >> 1) + super._k, super._i + super._j - jm_._i._v, ne_._c, jm_._i, -75, hj_._X);
      super._f.a865(this._z, false);
      int var5 = super._a - 64;
      String[] var6 = jn_.a782(this._D, new int[]{var5}, -105, la_._b);
      int var7 = var6.length * la_._b._H + la_._b._E;
      jh_.c797();
      this._m = new cn_(var5, var7);
      this._m.e797();
      int var8 = la_._b._H;
      String[] var9 = var6;

      int var10;
      for(var10 = 0; var9.length > var10; ++var10) {
         String var11 = var9[var10];
         la_._b.c191(var11, var5 >> 1, var8, 16777215, -1);
         var8 += la_._b._H;
      }

      this._o = new cn_(var5 + 4, 4 + var7);
      this._o.e797();
      this._m.e326(2, 2, 12690143);
      gf_.d669(2, 2, 0, 0, 4 + var5, 4 + var7);
      String var12 = this._x ? ac_._h : lp_._n;
      var10 = !this._x ? 8421504 : 16744448;
      var5 = ne_._c.b926(var12);
      var7 = ne_._c._E + ne_._c._H;
      this._y = new cn_(var5, var7);
      this._y.e797();
      ne_._c.b191(var12, 0, ne_._c._H, var10, -1);
      this._I = rb_.a551(16, this._y, var10, (byte)100);
      this._y.d150(65793);
      jh_.b797();
      gd_.a364(64, bc_._b);
   }

   private final void d487(boolean var1) {
      if (!var1) {
         this.c423((byte)56);
      }

      if (this._x) {
         if (this._n._n._p != null) {
            gd_.a364(64, this._n._n._p);
         }
      } else if (this._n._n._g != null) {
         gd_.a364(64, this._n._n._g);
      }

   }

   final void b150(int var1) {
      super.b150(105);
      double var2 = Math.log(0.02) * -0.005;
      double var4 = 0.5 / var2;
      int var6 = (int)(-0.5 + var4 * (1.0 - Math.exp(-var2 * (double)this._C)) + (double)this._r);
      var6 %= hf_._ib._c;
      if (this._s) {
         var6 = hf_._ib._c - var6 - 1;
      }

      cn_ var7 = hf_._ib.a571(108, var6, 108, 0);
      if (var7 != null) {
         var7.c093(10, 57);
      }

      var6 = (int)(-0.5 + (1.0 - Math.exp(-var2 * (double)this._C)) * var4 + (double)this._H);
      var6 %= hf_._ib._c;
      if (this._u) {
         var6 = hf_._ib._c + (-1 - var6);
      }

      var7 = hf_._ib.a571(108, var6, 108, 0);
      if (null != var7) {
         var7.c093(518, 57);
      }

      int[] var8 = new int[64];

      for(int var9 = 0; 64 > var9; ++var9) {
         var8[var9] = mp_.a080(65793 * (24 + var9), Integer.MIN_VALUE);
      }

      cn_ var18 = null;
      if (this._C < 250) {
         var18 = te_.a824(224, 224, this._C, var8, 32, 24, 0.03125);
      }

      int var10 = (super._a - 216 >> 1) + super._k;
      int var11 = super._j + 80;
      int var12 = super._k + (-this._o._y + super._a >> 1);
      int var14 = 230 + var11 + (60 - this._o._v >> 1);
      gf_.b050(var10 - 8, var11 - 8, 232, 232, 0);
      rp_.a857(4, 224, (byte)108, var10 - 4, 224, kc_._S, var11 - 4);
      if (this._C < 100) {
         this._p.a697(216, var11, (byte)102, var10, 216);
         var18.d326(var10 - 4, var11 - 4, 192);
      } else {
         this._p.a697(216, var11, (byte)102, var10, 216);
         int var15;
         int var16;
         if (this._C < 250) {
            var15 = 192 - 192 * (this._C - 100) / 150;
            var18.d326(var10 - 4, var11 - 4, var15);
            var15 = (this._C - 100 << 8) / 150;
            var16 = var10 + (216 - this._y._y >> 1);
            int var17 = var11 + -this._y._v + 208;
            this._I.b326(var16, var17, var15);
            this._y.d326(var16, var17, var15);
         } else {
            var15 = var10 + (-this._y._y + 216 >> 1);
            var16 = var11 + 208 - this._y._v;
            this._I.b326(var15, var16, 256);
            this._y.h093(var15, var16);
         }

         if (175 <= this._C) {
            if (this._C < 250) {
               this._o.b326(var12 - 2, var14 - 2, -((256 * (this._C - 100) - 19200) / 75) + 256);
               this._m.b326(var12, var14, (this._C - 100 - 150 - 75) * 256 / 75);
            } else {
               this._m.b326(var12, var14, 256);
            }
         } else {
            this._o.b326(var12 - 2, var14 - 2, (this._C * 256 - 25600) / 75);
         }
      }

   }
}
