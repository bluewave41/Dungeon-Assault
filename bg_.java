final class bg_ extends qe_ {
   private rh_ _w;
   private cn_ _u;
   static md_ _s = new md_();
   private rh_ _r;
   static String _x = "Buy";
   private cn_ _v;
   static String _t = "Loading...";

   final void a487(boolean var1) {
      super.a487(var1);
      super._e.b093(0, 0);
      gf_.e115(41, 48, 599, 416);

      for(int var2 = 41; var2 < 599; var2 += df_._c._E) {
         df_._c.c093(var2, 48);
      }

      gf_.b797();
      this.a093(117, 122);
      this.a326(20, 84, 117);

      rj_ var5;
      for(var5 = (rj_)super._p.e024(-24172); null != var5; var5 = (rj_)super._p.a024(4)) {
         var5.a150(126);
      }

      oe_._m.h093(24, 383);
      oe_._m.j093(560, 383);
      if (null != super._b) {
         super._b.a423((byte)-126);
      }

      e797();
      this._r.d797();
      this._w.d797();

      for(var5 = (rj_)super._p.e024(-24172); var5 != null; var5 = (rj_)super._p.a024(4)) {
         var5.d150(0);
      }

      int var3;
      if (0 <= rb_._N && ao_._o > rb_._N) {
         var3 = -vd_._a + rb_._N;
         if (0 <= var3 && var3 < 10) {
            int var4 = 121 + var3 * 24;
            this.a992(432, rb_._N, var4, fb_._d[var3]);
         }
      }

      this.c150(1);
      ih_._x.a326(320, 25, 1699);
      if (null != super._b) {
         for(var3 = 0; gf_._b.length > var3; ++var3) {
            gf_._b[var3] = nb_.a080(gf_._b[var3], -50529028) >>> 2;
         }

         super._b.b150(111);
      }

      if (kn_._g) {
         ab_.a150(0);
      }

      oh_.a423();
   }

   final void c487(boolean var1) {
      super.c487(var1);
      if (!kh_._s && var1) {
         while(ha_.b427()) {
            if (mm_._t != 13) {
               super.f797();
            } else {
               gd_.a778(g_._Hb, 0, g_._Hb, false);
            }
         }

         if (kn_._g) {
            bl_.a150(0);
         }

         if (super._b != null && super._b._d) {
            boolean var2 = false;
            if (super._b instanceof ce_) {
               ce_ var3 = (ce_)super._b;
               if (var3._u != null) {
                  ri_.a900(var3._u.toString(), -109);
               }
            } else if (!(super._b instanceof pk_)) {
               if (super._b instanceof fk_) {
               }
            } else {
               pk_ var4 = (pk_)super._b;
               var2 = var4._r;
            }

            super._b.c150(-123);
            super._b = null;
            if (var2) {
               super._b = new fk_(hj_._Q, li_._j);
            }
         }

         this.a150(5458);
      }
   }

   final void b487(boolean var1) {
      super.b487(var1);
      jh_.a276(super._e);
      c_.a842(0, 640, 0);
      c_.a842(0, 640, 40);
      vf_.a483(432, true, 33, 48);
      vf_.a483(432, true, 599, 48);
      vf_.a483(32, true, 164, 8);
      vf_.a483(32, true, 468, 8);
      un_.a770(41, 558, 416);
      this.a326(40, 70, 117);
      jh_.b797();
      fk_.a261((byte)121, wj_._u);
      ao_._o = 0;
      if (fb_._d == null) {
         fb_._d = new di_[10];
      }

      bj_._G = false;
      if (ed_.c491(true)) {
         oi_.f423((byte)100);
      } else {
         ri_.a900(tc_._u, -113);
      }

      this._r = new rh_(58, 394, 80, 160, 255, 197376, 240);
      this._w = new rh_(580, 394, 80, 160, 255, 197376, 240);
      this.a423((byte)-111);
      this.a556((byte)-124, 0);
      if (!ed_.c491(true)) {
         gh_.a093(23, 11);
      } else {
         gh_.a093(22, 11);
      }

      vl_.a366(1, (byte)-49);
   }

   private final void a992(int var1, int var2, int var3, di_ var4) {
      if (null != var4) {
         if (null == this._u) {
            this.a628(var4, var1 ^ 461);
         }

         var3 += 24 - la_._b._H >> 1;
         this._u.b326(s_._b[0], var3, 64);
         int var5 = (int)((te_.a132(mo_._a) + 1.0) * 128.0);
         if (var1 != 432) {
            this.a405(124, (byte)59, (di_)null, 121);
         }

         if (0 > var5) {
            var5 = 0;
         }

         if (var5 > 256) {
            var5 = 256;
         }

         this._v.b326(s_._b[0], var3, var5);
      }
   }

   private final int a760(int var1, boolean var2, int var3) {
      if (var1 >= s_._b[0] && s_._b[4] > var1) {
         if (!var2) {
            _x = (String)null;
         }

         int var4 = (var3 - 117 - 4) / 24;
         return 0 <= var4 && 10 > var4 ? var4 : -1;
      } else {
         return -1;
      }
   }

   private final void a448(int var1, int var2, int var3, di_ var4, int var5, int var6) {
      int var7 = this.a368(var4, (byte)-98);
      int var8 = var7 == 0 ? 0 : 10 + var7 * 5;
      var5 -= var8;
      String var9 = ta_.a319(la_._b, var4._j, var5, var4._g, 115);
      int var10 = la_._b.b926(var9);
      var2 -= (var10 >> 1) + 5;

      for(int var11 = 0; var11 < var7; ++var11) {
         fb_._f.a093(var2, var6 - 10);
         var2 += 5;
      }

      if (var3 <= 4) {
         this.a348(-30, -105, (di_)null, 82);
      }

      var2 += 15;
      la_._b.b191(var9, var2, var6, var1, -1);
   }

   private final int b313(int var1, int var2, int var3) {
      int var4 = this.a760(var3, true, var2);
      if (var4 != -1) {
         if (var1 > -72) {
            _s = (md_)null;
         }

         return vd_._a + var4;
      } else {
         return -1;
      }
   }

   private final void a423(byte var1) {
      this.b797();
      le_._g = tn_.a226(-jm_._i._y + 164 >> 1, 8 + (32 - jm_._i._v >> 1), ne_._c, jm_._i, -62, l_._d);
      wf_._w = tn_.a226(580 - jm_._i._y, (-jm_._i._v + 56 >> 1) + 424, ne_._c, jm_._i, -52, ia_._Y);
      ic_._y = tn_.a226(60, (-jm_._i._v + 56 >> 1) + 424, ne_._c, jm_._i, -61, hb_._l.toUpperCase());
      wf_._w._w = false;
      ic_._y._w = !ed_.c491(true);
      int var2 = ao_._o - 10;
      if (var2 < 0) {
         var2 = 0;
      }

      hi_._c = new pd_(552, 84, 0, 295, var2, vd_._a);
      super._p.a865(le_._g, false);
      super._p.a865(wf_._w, false);
      super._p.a865(ic_._y, false);
      super._p.a865(hi_._c, false);
   }

   private final void a326(int var1, int var2, int var3) {
      int var4 = var2 + (db_._v._H + var1 >> 1) + 2;
      if (var3 == 117) {
         for(int var5 = 0; var5 < rb_._J.length; ++var5) {
            String var6 = rb_._J[var5].toUpperCase();
            int var7 = s_._b[var5 + 1] + s_._b[var5] >> 1;
            int var8 = db_._v.b926(var6);
            if (var5 == 1 || 3 == var5) {
               var8 -= 18;
            }

            int var9 = var7 - (var8 >> 1);
            if (2 == var5) {
               var9 -= 2;
            }

            db_._v.b191(var6, var9, var4, 16629550, -1);
            if (1 == var5) {
               ue_._i[0].h093(var9 - 18, var4 - 12);
            }

            if (3 == var5) {
               ue_._i[1].h093(var9 - 18, var4 - 12);
            }
         }

      }
   }

   private final void a492(int var1, int var2, int var3, byte var4, int var5, di_ var6, int var7) {
      int var8 = this.a368(var6, (byte)-119);
      int var9 = var8 != 0 ? 10 + 5 * var8 : 0;
      var2 -= var9;
      if (var4 >= 122) {
         String var10 = u_.a975(la_._b, var6._g, var6._j, var3, var2);
         int var11 = la_._b.b926(var10);
         var1 -= (var11 >> 1) + 5;

         for(int var12 = 0; var12 < var8; ++var12) {
            fb_._f.a093(var1, var5 - 10);
            var1 += 5;
         }

         var1 += 15;
         la_._b.b191(var10, var1, var5, var7, -1);
      }
   }

   private final void a093(int var1, int var2) {
      am_._a.h093(41, 48);

      int var3;
      for(var3 = 0; 4 > var3; ++var3) {
         b370(s_._b[var3], 85, s_._b[1 + var3] - s_._b[var3] - 2, 25, 0, 48, 128);
         b370(s_._b[var3], 112, -2 - s_._b[var3] + s_._b[1 + var3], 256, 0, 48, 128);
      }

      if (bj_._G) {
         la_._b.c191(ac_._D, 320, 240, 16777215, -1);
      } else {
         var3 = 4 + var1;
         int var4 = ao_._o <= 10 + vd_._a ? -vd_._a + ao_._o : 10;

         int var5;
         int var6;
         for(var5 = 0; var4 > var5; ++var5) {
            var6 = vd_._a + var5;
            if (var6 != qc_._y) {
               this.a405(var6, (byte)-79, fb_._d[var5], var3);
            }

            var3 += 24;
         }

         if (qc_._y >= 0 && qc_._y < ao_._o) {
            var5 = qc_._y - vd_._a;
            if (0 <= var5 && var5 < 10) {
               var6 = 4 + var1 + var5 * 24;
               this.a348(var6, 48, fb_._d[var5], qc_._y);
            }
         }
      }

      if (var2 >= 44) {
         a229(66, 76, 507, 306, 256, 32, 8, 128);
      }
   }

   private final void a348(int var1, int var2, di_ var3, int var4) {
      int var5 = 8421616;
      int[] var6 = new int[32];
      var1 += 2;

      int var7;
      int var8;
      for(var7 = 0; 32 > var7; ++var7) {
         var8 = 32 + var7 * 1;
         var6[var7] = 65793 * var8;
      }

      for(var7 = 3; 24 > var7; ++var7) {
         gf_.d050(66, var1 + var7, 490, 1285 * (-var7 + 24) + (14614528 - 131072 * var7), 128);
      }

      gf_.b115(66, 2 + var1, 490, 7895160);
      gf_.b115(66, 24 + var1, 490, 6771538);
      if (var2 != 48) {
         this.a545(false, 22, -55, 111, 82, (String)null);
      }

      var1 -= 2;
      var1 += la_._b._H + 24 >> 1;
      if (null == var3) {
         la_._b.c191(nl_._c, s_._b[1] + s_._b[2] >> 1, var1, 16777215, -1);
      } else {
         la_._b.c191(Integer.toString(var3._b + 1), s_._b[0] + s_._b[1] >> 1, var1, 16777215, -1);
         var7 = -s_._b[1] + (s_._b[2] - 5);
         var8 = s_._b[1] + s_._b[2] >> 1;
         this.a492(var8, var7, 16777215, (byte)126, var1, var3, var5);
         la_._b.c191(gh_.a382(var3._a), s_._b[2] + s_._b[3] >> 1, var1, 16777215, -1);
         if (var3._c.equals("")) {
            la_._b.c191("-", s_._b[3] + s_._b[4] >> 1, var1, 16777215, -1);
         } else {
            String var9 = u_.a975(la_._b, var3._c, ek_._c, 16777215, -s_._b[3] + (s_._b[4] - 25));
            int var10 = s_._b[3] + 10;
            cn_ var11;
            if (0 >= var3._f) {
               if (0 <= var3._f) {
                  var11 = ue_._i[8];
               } else {
                  var11 = ue_._i[1];
               }
            } else {
               var11 = ue_._i[0];
            }

            var11.h093(var10, var1 - la_._b._H);
            la_._b.b191(var9, var10 + 20, var1, var5, -1);
         }
      }

   }

   final void a545(boolean var1, int var2, int var3, int var4, int var5, String var6) {
      if (var3 == 0) {
         hj_._Q = var6;
         li_._j = var5;
         if (!var1) {
            if (0 != var2) {
               int var7 = 25 * var2;
               if (100 < var7) {
                  var7 = 100;
               }

               String var8 = var7 + "%";
               String var9 = jk_.a661(var3 + 127, var4);
               super._b = new pk_(ia_._Y, jk_.a841(new String[]{var8, var9}, no_._e, 30496), 0);
            } else {
               super._b = new fk_(var6, var5);
            }
         } else {
            super._b = new pk_(ia_._Y, kc_._P, 0);
         }

      }
   }

   private final int a368(di_ var1, byte var2) {
      if (var2 > -48) {
         this.a093(-90, 71);
      }

      if (var1._h == 0) {
         return 0;
      } else {
         int var3 = (20 * var1._h - 1) / gm_._d._N + 1;
         return 3 >= var3 ? var3 : 3;
      }
   }

   private final void c150(int var1) {
      di_ var2 = null;
      if (0 <= qc_._y && ao_._o > qc_._y) {
         int var3 = -vd_._a + qc_._y;
         if (var3 >= 0 && 10 > var3 && fb_._d[var3] != null && !eh_.a213(fb_._d[var3]._i)) {
            var2 = fb_._d[var3];
         }
      }

      short var10 = 430;
      int var4 = gm_._d._N / 40;
      int var6 = 16777215;
      String var5;
      if (var2 == null) {
         var5 = ai_._e;
      } else {
         double var7 = ek_.a780(0, gm_._d._N, var2._a);
         String var9;
         if (0 >= var2._h) {
            if (0.0 < var7) {
               var9 = gh_.a382((int)(var7 * 1000.0));
               var5 = jk_.a841(new String[]{var9, gh_.a382(var4)}, vl_._l, 30496);
            } else {
               var5 = jk_.a841(new String[]{gh_.a382(var4)}, le_._a, 30496);
            }
         } else if (var7 > 0.0) {
            var9 = gh_.a382((int)(1000.0 * var7));
            var5 = jk_.a841(new String[]{gh_.a382(var2._h), var9, gh_.a382(var4)}, ra_._a, 30496);
         } else {
            var5 = jk_.a841(new String[]{gh_.a382(var2._h)}, mi_._c, 30496);
         }
      }

      db_._v.a385(var5, 215, var10, 210, 45, var6, -1, var1, 1, db_._v._H);
   }

   private final void a628(di_ var1, int var2) {
      if (null != var1) {
         gp_ var3 = var1._b == qc_._y ? la_._b : la_._b;
         int var4 = -s_._b[0] + s_._b[4];
         int var5 = var3._E + var3._H;
         cn_ var6 = new cn_(var4, var5);
         jh_.a303(var6);
         var3.c191(Integer.toString(var1._b + 1), -s_._b[0] + (s_._b[1] + s_._b[0] >> 1), la_._b._H, 12690143, -1);
         this.a448(12690143, -s_._b[0] + (s_._b[2] + s_._b[1] >> 1), 120, var1, s_._b[2] - 5 - s_._b[1], la_._b._H);
         var3.c191(gh_.a382(var1._a), -s_._b[0] + (s_._b[2] + s_._b[3] >> 1), la_._b._H, 12690143, -1);
         if (var1._c.equals("")) {
            var3.c191("-", (s_._b[4] + s_._b[3] >> 1) - s_._b[0], la_._b._H, 12690143, -1);
         } else {
            String var7 = u_.a975(var3, var1._c, ek_._c, 12690143, -s_._b[3] + s_._b[4] - 25);
            int var8 = 10 - s_._b[0] + s_._b[3];
            cn_ var9;
            if (var1._f <= 0) {
               if (var1._f >= 0) {
                  var9 = ue_._i[8];
               } else {
                  var9 = ue_._i[1];
               }
            } else {
               var9 = ue_._i[0];
            }

            var9.h093(var8, 0);
            var3.b191(var7, var8 + 20, var3._H, 12690143, -1);
         }

         if (var2 > 117) {
            jh_.b797();
            this._u = rb_.a551(8, var6, 12690143, (byte)-38);
            this._v = rb_.a551(16, var6, 255, (byte)-74);
         }
      } else {
         this._u = null;
         this._v = null;
      }
   }

   static final nh_ a707(boolean var0, int var1, boolean var2) {
      return uo_.a385(var0, 1, var2, var1, 27847, false);
   }

   public static void b150(int var0) {
      _x = null;
      _t = null;
      _s = null;
      if (var0 != 41) {
         b150(-1);
      }

   }

   private final void a556(byte var1, int var2) {
      if (vd_._a != var2) {
         if (var1 >= -96) {
            this._w = (rh_)null;
         }

         di_[] var3 = new di_[10];
         int var4 = 0;
         int var5 = vd_._a - var2;
         int var6 = 10;
         if (0 > var5) {
            var6 += var5;
            var4 -= var5;
            var5 = 0;
         }

         if (var5 + var6 > 10) {
            var6 = 10 - var5;
         }

         for(int var7 = 0; var7 < var6; ++var7) {
            var3[var5++] = fb_._d[var4++];
         }

         fb_._d = var3;
         og_._f = var2;
         vd_._a = var2;
         if (hi_._c != null) {
            hi_._c._z = vd_._a;
            if (hi_._c._z > hi_._c._C) {
               hi_._c._z = hi_._c._C;
            }
         }

      }
   }

   private final void a405(int var1, byte var2, di_ var3, int var4) {
      int var5 = var1 != rb_._N ? 16777215 : 16760960;
      int var6 = 3446736;
      var4 += db_._v._H + 24 >> 1;
      if (var2 > -37) {
         this.a423((byte)111);
      }

      if (var3 != null) {
         la_._b.c191(Integer.toString(1 + var3._b), s_._b[0] + s_._b[1] >> 1, var4, var5, -1);
         int var7 = -s_._b[1] + s_._b[2] - 5;
         int var8 = s_._b[1] + s_._b[2] >> 1;
         this.a492(var8, var7, var5, (byte)125, var4, var3, var6);
         la_._b.c191(gh_.a382(var3._a), s_._b[3] + s_._b[2] >> 1, var4, var5, -1);
         if (0 >= var3._c.length()) {
            la_._b.c191("-", s_._b[4] + s_._b[3] >> 1, var4, var5, -1);
         } else {
            String var9 = u_.a975(la_._b, var3._c, ek_._c, var5, -s_._b[3] + (s_._b[4] - 25));
            la_._b.b926(var9);
            int var10 = s_._b[3] + 10;
            cn_ var11;
            if (var3._f <= 0) {
               if (0 > var3._f) {
                  var11 = ue_._i[1];
               } else {
                  var11 = ue_._i[8];
               }
            } else {
               var11 = ue_._i[0];
            }

            var11.h093(var10, var4 - la_._b._H);
            la_._b.b191(var9, 20 + var10, var4, var6, -1);
         }
      } else {
         la_._b.c191(Integer.toString(1 + var1), s_._b[0] + s_._b[1] >> 1, var4, var5, -1);
         la_._b.c191(nl_._c, s_._b[2] + s_._b[1] >> 1, var4, var5, -1);
      }

   }

   private final void a150(int var1) {
      if (!kn_._g || !od_.a427()) {
         if (!super.d801()) {
            if (vd_._a != hi_._c._z) {
               this.a556((byte)-104, hi_._c._z);
               oi_.f423((byte)100);
            }

            int var2 = this.b313(-73, eh_._h, hj_._S);
            int var3 = -1;
            if (no_._d == 1) {
               var3 = this.b313(-119, hm_._k, lc_._c);
            }

            if (hh_._s != le_._g) {
               if (hh_._s == wf_._w) {
                  if (ed_.c491(true)) {
                     throw new RuntimeException((String)null);
                  }

                  if (eh_.a213(k_._b)) {
                     throw new RuntimeException((String)null);
                  }

                  if (null == gm_._d) {
                     throw new RuntimeException((String)null);
                  }

                  if (!gm_._d._H) {
                     ac_._B.d556((byte)-112, 58);
                  }

                  ac_.a900(k_._b, 0);
               } else if (ic_._y == hh_._s && !ed_.c491(true)) {
                  super._b = new ce_(tc_._u.toLowerCase());
               }
            } else {
               gd_.a778(dc_._z, 0, 0, true);
            }

            if (var2 != -1) {
               if (rb_._N != var2) {
                  this.a628(fb_._d[var2 - vd_._a], 120);
               }

               rb_._N = var2;
            }

            if (var3 != -1) {
               qc_._y = var3;
               if (rb_._N == qc_._y) {
                  this.a628(fb_._d[-vd_._a + rb_._N], 125);
               }

               gg_.a423((byte)-96);
            }

            if (-1 != var2 && 0 != pj_._r) {
               hi_._c.a093(1, pj_._r);
            }

            if (var1 != 5458) {
               this.a628((di_)null, -127);
            }

         }
      }
   }
}
