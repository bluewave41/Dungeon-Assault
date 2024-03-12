final class qc_ extends qe_ {
   private rh_ _r;
   static cn_ _z;
   private rh_ _v;
   private cn_[] _s;
   static boolean _t;
   private int _B;
   static int _w;
   private cn_[] _A;
   private ae_ _x;
   static int _y = -1;
   private tf_[] _u;

   private final void a540(boolean var1, int var2) {
      int var3 = tg_._f[this._B][var2];
      int var4 = bh_.b650(var2, this._B, var1);
      int var5 = qd_.a313(var2, 380, this._B);
      int var6 = o_.a776(this._B, var2);
      int var7 = kf_.a313(var2, this._B, -96);
      if (!ke_.a097(105, var3) && this._B != 3) {
         of_._j.h093(640 - of_._j._y >> 1, var6);
         var6 += 4;
      } else {
         gf_.e050(var4 - 4, var6 - 6, var5 + -var4 + 8, var7 + 8, 0);
         b370(var4, var6 - 2, var5 - var4, var7, 8421504, 128, 128);
         rp_.a857(4, var5 - var4, (byte)108, var4, var7, kc_._S, var6 - 2);
         a229(var4, var6 - 2, var5 - var4, var7, 224, 64, 3, 128);
      }

      if (var3 == 13 || var3 == 14) {
         int var8 = qi_._b + 120;
         int var9 = var5 - (-var4 + var8) >> 1;
         var9 += qi_._b;
         int var10 = var3 == 13 ? oo_._d * 120 / 256 : 120 * ql_._d / 256;
         int var11 = (var7 - bk_._e._b) / 2;
         vd_.a669(120, 2, -14561, 2, var9, var11 + var6);
         jc_.a669(var7 - 6, var10 + var9 - 1, var6 + 3, 2, 2, 2);
      }

   }

   final void f797() {
      if (super._b != null) {
         super._b.b487(false);
      } else {
         if (ll_._k && qk_._e[82] && mm_._t == 49) {
            gd_.a778(ve_.a491() ? 12 : 0, 0, -2, false);
         } else {
            this._x.d150(0);
         }

      }
   }

   private final int a080(int var1, int var2) {
      return o_.a776(this._B, var1);
   }

   private final void c050(int var1, int var2, int var3, int var4, int var5) {
      gf_.b669(var4, var2, var5, var3, 1, var1);
   }

   private final void c093(int var1, int var2) {
      sf_.d093(var1);
      go_ var3 = ik_._e;
      if (var3 != null) {
         if (var2 != -2) {
            this._v = (rh_)null;
         }

         var3._D.d150(var1);
         var3._L.d150(var1);
      }
   }

   final void a487(boolean var1) {
      super.a487(var1);
      if (this._B == 12) {
         gf_.a797();
         if (om_.b154()) {
            he_.e423();
         }

      } else {
         this.a423((byte)-107);
         int var2 = tg_._h[this._B];
         int var3 = 640 - tm_._p._y >> 1;

         int var4;
         for(var4 = 0; this._x._i > var4; ++var4) {
            if (this.d097(var4, -7228)) {
               this.a540(false, var4);
            }
         }

         if (8 != mn_._b && 9 != mn_._b) {
            le_._f.h093(4 + var3, var2 - 28);
            e_._j.h093(var3 + 198, var2 - 28);
            wj_._w.h093(var3 + 214, (this._x._i - 3) * tg_._d[this._B] + (var2 - 5));
            oj_._a.h093(var3 + 4, 293 + var2);
         } else {
            am_._a.h093(-(am_._a._E / 2) + 320, 48);
         }

         if (8 == this._B) {
            this.b540(false, -11931);
         } else if (9 == this._B) {
            this.b540(true, -11931);
         } else if (this._B != 10) {
            if (11 != this._B) {
               if (0 == this._B) {
                  fp_._d.a326(320, 25, 1699);
                  if (ll_._k) {
                     kk_._l.c191("Press CTRL-S to start a random single player debug test game", 320, 44, 16777215, 0);
                  }
               }
            } else {
               ne_._c.a385(ul_._d, 80, 80, 480, 1000, 16777215, -1, 0, 0, ne_._c._R);
            }
         } else {
            this.b423((byte)59);
         }

         if (super._b != null) {
            super._b.a423((byte)-61);
         }

         oe_._m.h093(24, 383);
         oe_._m.j093(560, 383);
         if (!ib_.a427()) {
            e797();
         }

         for(var4 = 0; this._x._i > var4; ++var4) {
            if (this.d097(var4, -7228)) {
               this.a126(var4, (byte)-31, this._x._b == var4);
            }
         }

         if (8 != this._B) {
            if (this._B == 9) {
               this.c540(true, 127);
            }
         } else {
            this.c540(false, 127);
         }

         if (super._b != null) {
            gf_.g115(0, 0, 640, 480);
            super._b.b150(-113);
         }

         oh_.a423();
         this._r.d797();
         this._v.d797();
      }
   }

   private final void a016(byte var1, int var2, boolean var3) {
      int var4 = tg_._f[this._B][var2];
      if (var1 >= -101) {
         _w = 68;
      }

      if (this._x.c154(31) && this.d097(var2, -7228) && rp_.a097(15204376, var4)) {
         hm_.a668(var4, var2, var3, -28);
      }

      int var6;
      int var7;
      int var8;
      if (13 != var4) {
         if (14 == var4) {
            if (this._x.b154(-1)) {
               um_.a430(0);
            }

            if (this._x.a491(false)) {
               um_.a430(256);
            }

            if (this._x.b427((byte)-87)) {
               var6 = this.e080(var2, 82) + this.f080(76, var2) + qi_._b - 120 >> 1;
               var7 = hj_._S - var6;
               var8 = 256 * var7 / 120;
               if (var8 <= 0) {
                  um_.a430(0);
               } else if (var8 < 256) {
                  um_.a430(var8);
               } else {
                  um_.a430(256);
               }
            }

            if (this._x.a154(0)) {
               jd_.b487();
            }

            if (this._x.c427((byte)66)) {
               mi_.b150();
            }
         }
      } else {
         boolean var5 = false;
         if (this._x.b154(-1) && oo_._d > 0) {
            var5 = true;
            this.c093(0, -2);
         }

         if (this._x.a491(false) && 256 > oo_._d) {
            var5 = true;
            this.c093(256, -2);
         }

         if (this._x.b427((byte)-48)) {
            var6 = this.e080(var2, 82) + this.f080(-77, var2) - 120 + qi_._b >> 1;
            var7 = hj_._S - var6;
            var8 = 256 * var7 / 120;
            if (var8 > 0) {
               if (var8 < 256) {
                  this.c093(var8, -2);
               } else {
                  this.c093(256, -2);
               }
            } else {
               this.c093(0, -2);
            }

            var5 = true;
         }

         if (this._x.a154(0) && oo_._d > 0) {
            ig_.c150();
            var5 = true;
         }

         if (this._x.c427((byte)109) && 256 > oo_._d) {
            m_.b423();
            var5 = true;
         }

         if (var5 && (!this._x.b427((byte)127) || mo_._a > ia_._X)) {
            cf_[] var9 = eb_._O;
            var7 = oi_.b080(0, var9.length);
            cf_ var10 = var9[var7];
            cf_.a319(var10._e, var10._a << 2);
            ia_._X = 20 + mo_._a;
         }
      }

   }

   private final cn_ a896(int var1, q_ var2) {
      if (var1 != 120) {
         this.f797();
      }

      return this.a040(var2.a125(), 320);
   }

   private final int a760(int var1, boolean var2, int var3) {
      for(int var4 = 0; var4 < tg_._f[this._B].length; ++var4) {
         int var5 = this.a080(var4, 125);
         if (this.d097(var4, -7228) && this.e080(var4, 82) <= var3 && this.f080(97, var4) > var3 && var5 <= var1 && var1 < var5 + this.b080(394, var4)) {
            return var4;
         }
      }

      if (!var2) {
         this.b540(true, -7);
      }

      return -1;
   }

   private final void a423(byte var1) {
      if (var1 > -91) {
         this.a016((byte)26, 60, true);
      }

      super._e.b093(0, 0);
   }

   private final boolean d097(int var1, int var2) {
      return var2 != -7228 ? false : sg_.a330(3, this._B, var1);
   }

   private final void a556(byte var1, int var2) {
      int var3 = tg_._f[this._B][var2];
      String var4 = ui_.a661(var3, 19435);
      int var5 = ne_._c.b926(var4);
      int var6 = ne_._c._H + ne_._c._E;
      cn_ var7 = new cn_(var5, var6);
      jh_.a303(var7);
      if (var1 == -125) {
         ne_._c.b191(var4, 0, ne_._c._H, 16760960, -1);
         jh_.b797();
         this._A[var2] = rb_.a551(8, var7, 16760960, (byte)105);
         this._s[var2] = rb_.a551(16, var7, 6307840, (byte)-124);
      }
   }

   private final void b540(boolean var1, int var2) {
      this.c050(var2 ^ -11995, 90, 94, 82, 476);
      this.c050(64, 186, 180, 82, 142);
      if (var2 == -11931) {
         this.c050(var2 + 11995, 186, 180, 226, 332);
         cg_._a.a326(320, 25, 1699);
      }
   }

   final void c797() {
      super.c797();
      um_._g = null;
      this._s = null;
      fj_._f = null;
      this._A = null;
      ud_._s = null;
      this._u = null;
      if (dd_._E != null) {
         dd_._E.b423((byte)30);
         dd_._E = null;
      }

      if (nj_._f != null) {
         nj_._f.b150(-4);
         nj_._f = null;
      }

      u_._P = -1;
      tf_._j = null;
   }

   private final cn_ a040(cn_ var1, int var2) {
      jh_.c797();
      cn_ var3 = new cn_(var1._E >> 1, var1._G >> 1);
      var3.e797();
      var1.b050(var1._E >> 3, var1._G >> 3, var1._E >> 2, var1._G >> 2, 16777215);
      if (var2 != 320) {
         this._A = (cn_[])null;
      }

      var3.d150(16777215);
      var3.e797();
      var1.b050(var1._E >> 3, var1._G >> 3, var1._E >> 2, var1._G >> 2, 0);
      jh_.b797();
      return var3;
   }

   static final int a890(int var0, int[] var1) {
      int var3;
      int var4;
      if (var0 < ib_._d * (ib_._j - 1)) {
         var3 = var0 % (ib_._j - 1) + var0 / (ib_._j - 1) * ib_._j;
         var4 = var3 + 1;
      } else {
         var3 = var0 - (ib_._j - 1) * ib_._d;
         var4 = var3 + ib_._j;
      }

      return var1[var3] >= var1[var4] ? var1[var4] : var1[var3];
   }

   public static void a150() {
      _z = null;
   }

   private final int b080(int var1, int var2) {
      return var1 != 394 ? 54 : kf_.a313(var2, this._B, -116);
   }

   private final void c540(boolean var1, int var2) {
      if (var2 < 114) {
         this.e080(6, 36);
      }

      int var3;
      if (nj_._f != null) {
         gf_.a331(kd_._g);
         gf_.e115(94, 90, 546, 184);
         var3 = ig_.b137();

         for(hm_ var4 = (hm_)nj_._f.e024(-24172); null != var4; var4 = (hm_)nj_._f.a024(4)) {
            cn_ var5 = f_._a;
            if (var4._r) {
               if (var4._i != u_._P) {
                  tf_._j = ec_._j[var4._i].a125();
                  u_._P = var4._i;
               }

               var5 = tf_._j;
            }

            var5.e093(94 + var4._o - var3, var4._p);
            cn_ var6;
            if (!var4._r) {
               var6 = ud_._s[46];
            } else {
               var6 = ud_._s[var4._i];
            }

            if (var4._i == kg_._f) {
               um_._g._g = -var3 + 94 + 16 + var4._o;
               um_._g._b = var4._p + 32;
               if (0 != (li_._k & 1)) {
                  um_._g.a797();
               } else {
                  um_._g.a601(var6, -12, 32);
               }
            }

            if (ak_._n == var4._i) {
               fj_._f._b = 32 + var4._p;
               fj_._f._g = 94 - var3 + 16 + var4._o;
               if ((1 & li_._k) == 0) {
                  fj_._f.a601(var6, -12, 32);
               } else {
                  fj_._f.a797();
               }
            }
         }

         gf_.b331(kd_._g);
      }

      if (null != dd_._E && dd_._E._w) {
         dd_._E.d150(0);
      }

      var3 = kg_._f != -1 ? kg_._f : ak_._n;
      int[] var17 = !var1 ? gj_._c : bp_._e;
      if (var3 == -1) {
         la_._b.c191(ql_._h, 392, 260, 16777215, -1);
         if (ed_.c491(true)) {
            short var18 = 300;
            db_._v.a385(ld_._a, 239, var18, 306, 100, 16777215, -1, 1, 0, db_._v._H);
         }
      } else {
         boolean var19 = vl_.a873(var3, -121, var17);
         int var20 = la_._b._E + la_._b._H;
         String var7 = jk_.a841(new String[]{ce_._o[var3], Integer.toString(!var19 ? 16744576 : 8454016, 16), !var19 ? fi_._x : fa_._m}, f_._b, 30496);
         db_._v.b191(var7, 239, var20 + 195, 16777215, -1);
         int var8 = 210;
         if (!var19) {
            f_._a.h093(89, var8);
         } else {
            ec_._j[var3].a093(89, var8);
         }

         var8 += la_._b._H;
         var8 += la_._b._H;
         StringBuilder var9 = new StringBuilder(bb_._k[var3]);
         if (null != gm_._d && !var19) {
            String var10 = null;
            if (var3 != 18) {
               if (var3 == 41) {
                  var10 = jk_.a841(new String[]{ve_.a382(1, (long)gm_._d._g, hc_._d)}, fn_._q, 30496);
               } else if (var3 == 42 && df_.a410() < gm_._d._p && gm_._d._p >= gm_._d._i) {
                  var10 = jk_.a841(new String[]{np_.b661(gm_._d._p), np_.b661(gm_._d._i)}, wl_._b, 30496);
               }
            } else if (0 < gm_._d._u) {
               var10 = jk_.a841(new String[]{Integer.toString(gm_._d._u)}, gm_._d._u != 1 ? ji_._H : i_._y, 30496);
            }

            if (null != var10) {
               var9.append("<br><br>");
               var9.append(var10);
            }
         }

         String[] var21 = new String[16];
         int var11 = la_._b.a899(var9.toString(), new int[]{306}, var21);

         int var12;
         for(var12 = 0; var12 < var11; ++var12) {
            la_._b.b191(var21[var12], 239, var8, 16777215, -1);
            var8 += var20;
         }

         var12 = 355 - cf_._f._G;
         int var13 = (2 * var12 + cf_._f._G) / 2 + ne_._c._E;
         gf_.b115(239, var12 - 6, 306, 8421504);
         la_._b.b191(op_._a + sg_._c[var3], 239, var13, 16777215, -1);
         byte var14 = 120;
         la_._b.b191(mp_._f, var14 + 239, var13, 16777215, -1);
         int var15 = 239 + var14 + la_._b.b926(mp_._f);

         for(int var16 = 0; sg_._d[var3] > var16; ++var16) {
            cf_._f.h093(var15, var12);
            var15 += cf_._f._y / 3;
         }
      }

   }

   private final void a126(int var1, byte var2, boolean var3) {
      int var4 = tg_._f[this._B][var1];
      String var5 = ui_.a661(var4, 19435);
      int var6 = ne_._c.b926(var5);
      if (var2 != -31) {
         this._x = (ae_)null;
      }

      int var7 = bh_.b650(var1, this._B, false);
      int var8 = qd_.a313(var1, 380, this._B);
      int var9 = o_.a776(this._B, var1);
      if (var4 == 13 || var4 == 14) {
         var6 = 120 + qi_._b;
      }

      kf_.a313(var1, this._B, var2 - 46);
      int var10 = -var6 + var8 + var7 >> 1;
      if (!ke_.a097(var2 + 105, var4) && this._B != 3) {
         var9 += 4;
      }

      boolean var11 = rp_.a097(var2 + 15204407, var4);
      if (20 == var4 && -1 != this._x._b && tg_._f[this._B].length > this._x._b) {
         int var12 = tg_._f[this._B][this._x._b];
         var3 |= !rp_.a097(15204376, var12);
      }

      int[] var14 = var3 ? (!var11 ? ug_._E : ml_._b) : (var11 ? ag_._c : tf_._k);
      if (null == this._u[var1] || this._u[var1]._f != var5 && !this._u[var1]._f.equals(var5) || this._u[var1]._h != var14) {
         this._u[var1] = new tf_(ne_._c, var5, var14);
         this._A[var1] = null;
      }

      this._u[var1].b326(var9, 32, var10);
      if (!var11) {
         hj_._T.h093(var10 - 20, ne_._c._H + (var9 - 15));
      }

      if (var3) {
         if (null == this._A[var1]) {
            this.a556((byte)-125, var1);
         }

         this._A[var1].b326(var10, var9, 64);
         int var13 = (int)(128.0 * (1.0 + te_.a132(mo_._a)));
         if (0 > var13) {
            var13 = 0;
         }

         if (var13 > 256) {
            var13 = 256;
         }

         this._s[var1].b326(var10, var9, var13);
      }

   }

   private final int f080(int var1, int var2) {
      return qd_.a313(var2, 380, this._B);
   }

   final void b487(boolean var1) {
      super.b487(var1);
      if (this._B == 0) {
         o_.a150();
         if (ed_.c491(true)) {
            gm_._d = null;
         }
      }

      fk_.a261((byte)121, lf_._w);
      int var2 = 0 >= this._x._i ? -1 : 0;
      if (-1 != this._x._b) {
         var2 = this._x._b;
      }

      this._x.a691(false, var1, var2, this.a760(eh_._h, true, hj_._S));
      kg_._f = -1;
      um_._g = null;
      fj_._f = null;
      ia_._X = mo_._a;
      ak_._n = -1;
      if (this._B == 8 || this._B == 9) {
         ud_._s = new cn_[47];
         u_._P = -1;

         for(int var3 = 0; var3 < 46; ++var3) {
            ud_._s[var3] = this.a896(120, ec_._j[var3]);
         }

         jh_.c797();
         cn_ var15 = new cn_(64, 64);
         var15.e797();
         gf_.h115(32, 31, 14, 16777215);
         ud_._s[46] = var15;
         jh_.b797();
         boolean var4 = 9 == this._B;
         int[] var5 = !var4 ? gj_._c : bp_._e;
         nj_._f = new md_();
         int var6 = 0;

         int var7;
         boolean var8;
         boolean var9;
         for(var7 = 0; var7 < 46; ++var7) {
            var8 = vl_.a873(var7, -124, var5);
            if (var4) {
               if (var8) {
                  nj_._f.a865(new hm_(var7, var8), false);
                  ++var6;
               }
            } else {
               var9 = !vl_.a873(var7, -63, ia_._P);
               if (var9 || var8) {
                  ++var6;
                  nj_._f.a865(new hm_(var7, var8), false);
               }
            }
         }

         var7 = var6 < 8 ? var6 : (1 + var6) / 2;
         var8 = 0 != (var6 & 1);
         var9 = false;
         int var16;
         if (var7 > 11) {
            dd_._E = new dd_(82, 176, 0, 476, 65536, 0);
            var16 = 12;
         } else {
            var16 = (8 + -(var7 * 40) + 452) / 2;
         }

         of_._l = 0;
         int var10 = var16;
         int var11 = 100;
         int var12 = 0;
         int var13 = 0;
         hm_ var14 = (hm_)nj_._f.e024(-24172);

         while(null != var14) {
            var14._o = var10;
            var14._p = var11;
            var13 += 40;
            var10 += 40;
            if (var13 > of_._l) {
               of_._l = var13;
            }

            var14 = (hm_)nj_._f.a024(4);
            ++var12;
            if (var12 == var7) {
               var13 = 0;
               var10 = var16;
               if (var8) {
                  var10 = var16 + 20;
                  var13 += 20;
               }

               var11 += 40;
            }
         }
      }

      this._r = new rh_(58, 394, 80, 160, 255, 197376, 240);
      this._v = new rh_(580, 394, 80, 160, 255, 197376, 240);
      this._s = new cn_[this._x._i];
      this._u = new tf_[this._x._i];
      this._A = new cn_[this._x._i];
      jh_.a276(super._e);
      bf_.a540(mn_._b != 8 && 9 != mn_._b);
      gf_.a331(kd_._g);
      gf_.e115(41, 48, 599, 416);
      if (mn_._b != 8 && 9 != mn_._b) {
         tm_._p.h093(640 - tm_._p._y >> 1, 0);
      }

      gf_.b331(kd_._g);
      jh_.b797();
   }

   final void c487(boolean var1) {
      super.c487(var1);
      if (12 == this._B) {
         int var4 = hm_.a800(!kk_.d154(), (byte)-20);
         if (var4 == 3) {
            if (null != cm_._R) {
               ib_.a150();
            }

            sf_.a284(m_.c372(true));
         }

         if (1 == var4) {
            gd_.a778(dc_._z, 0, 0, false);
         }

         if (var4 == 2) {
            gd_.a778(dc_._z, 0, 0, true);
         }

      } else {
         if (!kh_._s || !var1) {
            while(ha_.b427()) {
               if (mm_._t == 13) {
                  if (this._B != 1) {
                     if (10 != mn_._b && 0 != mn_._b) {
                        gd_.a778(g_._Hb, 0, g_._Hb, false);
                     }
                  } else {
                     gd_.a778(!ve_.a491() ? 0 : 12, 0, -1, false);
                  }
               } else {
                  this.f797();
                  if (this._x._b != -1) {
                     this.a016((byte)-127, this._x._b, false);
                  }
               }
            }

            if (!this.d801()) {
               this._x.a326(-7734, this.a760(hm_._k, true, lc_._c), this.a760(eh_._h, true, hj_._S));
               if (this._x._b != -1) {
                  this.a016((byte)-112, this._x._b, true);
               }
            }
         }

         if (null != super._b && super._b._d) {
            pk_ var2 = (pk_)super._b;
            boolean var3 = var2._r;
            super._b.c150(-121);
            super._b = null;
            if (var3) {
               tl_._d = false;
               ik_.a503(ve_._c, -3);
            } else {
               gd_.a778(ve_.a491() ? 12 : 0, 0, -3, false);
            }
         }

         if (8 == this._B || this._B == 9 || 10 == mn_._b) {
            ra_.a150();
         }

      }
   }

   private final void b423(byte var1) {
      boolean var2 = en_.a568(-1, bp_._e);
      String var3 = kp_._d;
      if (var1 <= 49) {
         this.a080(-114, 14);
      }

      var3 = var3 + " " + tg_.a955('#', jk_.a841(new String[]{jg_._e}, g_.a157(false, var2), 30496), "<br><br>");
      ne_._c.a385(var3, 80, 80, 480, 10 * ne_._c._R, 16777215, -1, 1, 0, ne_._c._R);
   }

   private final int e080(int var1, int var2) {
      if (var2 != 82) {
         this._u = (tf_[])null;
      }

      return bh_.b650(var1, this._B, false);
   }

   qc_(int var1) {
      this._B = var1;
      this._x = new ae_(tg_._f[this._B].length);
   }
}
