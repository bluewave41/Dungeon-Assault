final class ih_ extends qe_ {
   private cn_ _I;
   private cn_ _z;
   private tf_ _B;
   private boolean _E;
   private cn_ _A;
   private cn_ _u;
   static int[] _r = new int[128];
   static String _s = "Spectre";
   private int _C;
   static int[] _J = new int[256];
   private int _t;
   static qh_[] _w;
   private int _G;
   static tf_ _x;
   private rh_ _D;
   static String _v;
   private wd_ _F;
   private rh_ _y;

   private final int a313(int var1, int var2, int var3) {
      int var4 = 0;

      for(int var5 = 0; var5 < 2; ++var5) {
         for(int var6 = 0; var6 < 4; ++var4) {
            int var7 = var6 * 102 + 195;
            int var8 = 104 * var5 + 60;
            if (var5 == 2) {
               var7 += 51;
            }

            if (var7 <= var3 && var2 >= var8 && var3 < 96 + var7 && var8 + 96 > var2) {
               return var4;
            }

            if (var4 == 7) {
               break;
            }

            ++var6;
         }
      }

      if (var1 != -1) {
         return 95;
      } else {
         return -1;
      }
   }

   final void c797() {
      this._A = null;
      this._u = null;
      j_._Q = null;
      ld_._e = null;
      this._z = null;
      this._I = null;
      System.gc();
   }

   private final void d487(boolean var1) {
      if (gm_._d._s >= ac_._s) {
         int var2;
         if (!ed_.c491(true)) {
            ac_._B.d556((byte)-112, 56);

            for(var2 = 0; var2 < 8; ++var2) {
               if (um_._i[var2] != gm_._d._a[var2]) {
                  if (um_._i[var2] != null) {
                     ac_._B.a093(6, um_._i[var2]._c);
                  } else {
                     ac_._B.a093(6, 0);
                  }
               } else {
                  ac_._B.a093(6, -1);
               }
            }
         }

         for(var2 = 0; 8 > var2; ++var2) {
            gm_._d._a[var2] = um_._i[var2];
         }

         lb_ var10000 = gm_._d;
         var10000._s -= ac_._s;
         this.d150(1793);
      }

      if (!var1) {
         _r = (int[])null;
      }

      ho_.b423();
   }

   final void a487(boolean var1) {
      super.a487(var1);
      super._e.b093(0, 0);
      this.b150(-123);
      hb_ var2 = null;
      if (-1 != this._t && null != um_._i[this._t]) {
         var2 = um_._i[this._t];
      } else if (this._C != -1 && um_._i[this._C] != null) {
         var2 = um_._i[this._C];
      }

      h_ var3 = null;
      if (var2 != null) {
         var3 = var2._n;
      } else if (op_._d._l != null) {
         var3 = ((u_)op_._d._l)._Q;
      }

      if (null == var2) {
         a204(216, 275, this._F, kc_._S);
      } else {
         a594(216, 275, var2);
      }

      if (var2 != null) {
         a305(339, 289, var2, 0);
      } else {
         a420(339, 289, var3);
      }

      this.b326(286, 144, 476);

      rj_ var4;
      for(var4 = (rj_)super._p.e024(-24172); var4 != null; var4 = (rj_)super._p.a024(4)) {
         var4.a150(93);
      }

      ad_._e.h093(188, 48);
      ad_._e.i093(188, -ad_._e._b + 40);
      ad_._e.i093(460, -ad_._e._b + 40);
      ad_._e.f093(-ad_._e._d - be_._o._d + 460, -ad_._e._b + 40);
      oe_._m.h093(171, 360);
      oe_._m.j093(-oe_._m._d + 620, 360);
      if (null != super._b) {
         super._b.a423((byte)-101);
      }

      e797();
      super._q.a423((byte)-40);

      for(var4 = (rj_)super._p.e024(-24172); var4 != null; var4 = (rj_)super._p.a024(4)) {
         var4.d150(0);
      }

      this.g150(0);
      this._y.d797();
      this._D.d797();
      if (super._b != null) {
         for(int var5 = 0; gf_._b.length > var5; ++var5) {
            gf_._b[var5] = nb_.a080(-50529028, gf_._b[var5]) >>> 2;
         }

         super._b.b150(108);
      }

      if (kn_._g) {
         ab_.a150(0);
      }

      if (null != op_._d._l) {
         h_ var9 = ((u_)op_._d._l)._Q;
         int var6 = hj_._S;
         int var7 = eh_._h - 40;
         rp_.a857(8, 40, (byte)108, var6, 40, kc_._S, var7);
         cn_ var8 = null == var9._e ? null : var9._e.a571(40, 0, 40, 0);
         if (var8 != null) {
            var8.d326(var6, var7, 128);
         } else {
            gf_.b669(var6, var7, 40, 40, 0, 128);
         }
      }

      oh_.a423();
   }

   static final String[] a640(int var0, char var1, String var2) {
      int var3 = rm_.a901(var2, var1);
      String[] var4 = new String[1 + var3];
      int var5 = 0;
      int var6 = 0;
      if (var0 < 18) {
         return (String[])null;
      } else {
         for(int var7 = 0; var7 < var3; ++var7) {
            int var8;
            for(var8 = var6; var1 != var2.charAt(var8); ++var8) {
            }

            var4[var5++] = var2.substring(var6, var8);
            var6 = var8 + 1;
         }

         var4[var3] = var2.substring(var6);
         return var4;
      }
   }

   private final void f150(int var1) {
      this._t = -1;
      if (!kn_._g || !od_.a427()) {
         if (var1 != -24900) {
            this.c487(true);
         }

         if (!super.d801()) {
            this._t = this.a313(-1, eh_._h, hj_._S);
            hb_ var2;
            if (-1 != this._t && null != um_._i[this._t]) {
               var2 = um_._i[this._t];
               if (ld_._e != var2) {
                  j_._Q = new fc_((pj_)null, var2);
                  ld_._e = var2;
               }

               wb_[] var3 = var2._i;
               en_ var4 = j_._Q;
               if (null != var3) {
                  int var5 = this._t / 4;
                  int var6 = 3 & this._t;
                  int var7 = 102 * var6 + 195;
                  int var8 = 60 + var5 * 104;
                  var8 += 78;
                  byte var9 = 7;
                  var7 += 78;
                  int var10 = var7;
                  int var11 = var8;
                  int var12 = 0;

                  while(var12 < var3.length) {
                     wb_ var13 = var3[var12];
                     if (jg_.a643(var10, 12, 12, var11)) {
                        var4 = var13.a047();
                     }

                     var10 -= 16;
                     ++var12;
                     if (var12 % var9 == 0) {
                        var11 -= 16;
                        var10 = var7;
                     }
                  }
               }

               uj_.a872(var4);
            }

            if (hh_._s == sn_._b) {
               this.d487(true);
               this.a893((byte)-92, true);
            } else if (hh_._s != nl_._a) {
               if (in_._y == hh_._s) {
                  var2 = -1 != this._C ? um_._i[this._C] : null;
                  if (var2 != null) {
                     um_._i[this._C] = new hb_(this._C, var2._c);
                     um_._i[this._C]._b = new wd_(var2._n._e);
                     ho_.b423();
                     this.a556((byte)-112, -1);
                  }
               } else if (hh_._s != null && hh_._s instanceof u_) {
                  h_ var15 = ((u_)hh_._s)._Q;
                  this.a556((byte)-112, -1);
                  if (null == this._F || var15._t != this._F._n) {
                     this._F = new wd_(var15._e, var15._t, rf_._M);
                     if (null != var15._p) {
                        gd_.a364(64, var15._p);
                     }
                  }
               } else if (hh_._s != hl_._b) {
                  if (hh_._s != hi_._a) {
                     if (hh_._s == kl_._h) {
                        this.a093(2, var1 ^ -24900);
                     } else if (cd_._d != hh_._s) {
                        if (hh_._s != am_._f) {
                           int var14;
                           if (no_._d == 1) {
                              var14 = this.a313(-1, hm_._k, lc_._c);
                              if (-1 != var14) {
                                 if (op_._d._l != null) {
                                    h_ var16 = ((u_)op_._d._l)._Q;
                                    um_._i[var14] = new hb_(var14, var16._w);
                                    um_._i[var14]._b = new wd_(var16._e);
                                    ho_.b423();
                                    op_._d.a423((byte)80);
                                 } else if (um_._i[var14] != null) {
                                    op_._d.a423((byte)80);
                                    this._F = null;
                                    this.a556((byte)-112, var14);
                                    hb_ var17 = um_._i[this._C];
                                    h_ var18 = var17._n;
                                    if (null != var17 && var17._p != 255 && var18._u != var17._b._n) {
                                       var17._b.a942(124, var18._u);
                                       if (var17._n._p != null) {
                                          gd_.a364(var1 ^ -24836, var18._p);
                                       }
                                    }
                                 }
                              }
                           } else if (2 == no_._d) {
                              var14 = this.a313(-1, hm_._k, lc_._c);
                              if (var14 != -1) {
                                 um_._i[var14] = gm_._d._a[var14];
                                 if (null != um_._i[var14] && um_._i[var14]._b == null) {
                                    um_._i[var14]._b = new wd_(um_._i[var14]._n._e);
                                 }

                                 ho_.b423();
                              }

                              this._F = null;
                              this.a556((byte)-112, -1);
                              op_._d.a423((byte)80);
                           }
                        } else {
                           this.a093(6, 0);
                        }
                     } else {
                        this.a093(5, 0);
                     }
                  } else {
                     this.a093(1, 0);
                  }
               } else {
                  this.a093(0, 0);
               }
            } else {
               this.d150(var1 + 26693);
               this.a893((byte)-125, true);
            }

         }
      }
   }

   final void b487(boolean var1) {
      super.b487(var1);
      fk_.a261((byte)121, lf_._w);
      bl_.a423();
      b716(super._e, 188, 48, 605, 279);
      b716(super._e, 188, 364, 605, 378);
      b716(super._e, 188, 401, 605, 407);
      jh_.a276(super._e);
      te_.a812(188, 280, 423, kc_._M);
      te_.a812(188, 362, 423, kc_._M);
      te_.a812(188, 378, 423, kc_._M);
      te_.a812(188, 399, 423, kc_._M);
      te_.a812(188, 408, 423, kc_._M);
      a229(188, 281, 433, 80, 256, 32, 8, 128);
      a229(188, 379, 433, 20, 256, 32, 8, 128);
      a229(8, 8, 172, 32, 256, 64, 4, 128);
      a229(188, 8, 264, 32, 256, 64, 4, 128);
      a229(460, 8, 172, 32, 256, 64, 4, 128);
      this._B.b326(12, 32, 640 - this._B._i >> 1);
      h_.a086(false, 425, 618, true, bk_._e._b + 40);
      ke_.a115(180, 480, 0);
      ke_.a115(605, 480, bk_._e._b + 40);
      ke_.a115(640 - be_._o._d, 480, 0);
      ke_.a115(0, 480, 0);
      c_.a842(0, 640, 0);
      c_.a842(0, 640, 40);
      jc_.a669(32, 460 - be_._o._d, 8, 1, 2, 1);
      c_.a842(0, 640, 480 - bk_._e._b);
      b370(be_._o._d, 40 + bk_._e._b, 170, 425, 16777215, 32, 128);
      h_.a086(false, 425, 20, true, bk_._e._b + 40);
      a229(8, 47, 172, 425, 256, 32, 8, 128);
      a115(14, 55, 161, 36);
      jh_.b797();
      this.c150(65);
      u_.a041((lb_)null);
      this._F = null;
      this._A = mf_.a971(10449103, 96, 6, 96);
      this._u = mf_.a971(255, 96, 12, 96);
      this._z = mf_.a971(16711680, 96, 12, 96);
      this._I = mf_.a971(8454143, 96, 12, 96);
      this._y = new rh_(205, 371, 80, 160, 16711680, 768, 249);
      this._D = new rh_(-oe_._m._d + 640, 371, 80, 160, 16711680, 768, 249);
      qh_.a726(-13716, lf_._y[1], 20);
   }

   static final void a423(byte var0) {
      tc_._u = ra_._c.d738(var0 ^ -92);
      nn_._k = jm_.a715(var0, tc_._u);
   }

   private final void b326(int var1, int var2, int var3) {
      a115(var3, var1, var2, 30);
      a115(var3, 40 + var1, 144, 30);
      int var4 = 8 + var1 + la_._b._H;
      db_._v.b191(pb_._I, var3 + 7, var4, 16777215, -1);
      db_._v.a191(Integer.toString(gm_._d._s / 10), 133 + var3, var4, 16777215, -1);
      var4 += 40;
      int var5 = ac_._s > gm_._d._s ? 16711680 : 16777215;
      db_._v.b191(ef_._f, 7 + var3, var4, var5, -1);
      int var6 = ac_._s / 10;
      if (ac_._s % 10 != 0) {
         ++var6;
      }

      db_._v.a191(Integer.toString(var6), var3 + 133, var4, var5, -1);
   }

   private final void c150(int var1) {
      this.b797();
      op_._d = new nn_(true);
      wd_._f = new nn_(false);
      ud_._t = new ed_(8, 90, 180, 382);
      sn_._b = tn_.a226(16, 12, ne_._c, jm_._i, -107, lk_._P);
      nl_._a = tn_.a226(472, 12, ne_._c, jm_._i, -76, be_._r.toUpperCase());
      in_._y = tn_.a226((164 - jm_._i._y >> 1) + 340, 376, ne_._c, jm_._i, -100, sa_._e);
      hl_._b = sj_.a921(22, var1 ^ 38, 65, uj_._c, wd_._f);
      hi_._a = sj_.a921(55, 109, 65, gd_._E, wd_._f);
      kl_._h = sj_.a921(86, 104, 65, jj_._b, wd_._f);
      cd_._d = sj_.a921(117, 87, 65, wl_._d, wd_._f);
      am_._f = sj_.a921(148, var1 + 54, var1, pk_._o, wd_._f);
      super._p.a865(ud_._t, false);
      super._p.a865(sn_._b, false);
      super._p.a865(nl_._a, false);
      super._p.a865(in_._y, false);
      super._p.a865(hl_._b, false);
      super._p.a865(hi_._a, false);
      super._p.a865(kl_._h, false);
      super._p.a865(cd_._d, false);
      super._p.a865(am_._f, false);
      this.a150(-122);
      this._G = 0;
      this._E = false;
      wd_._f.a780(hl_._b, -256);
      this.a093(0, 0);
      super._q = new sa_(262, 412, 280, 56);
      super._q.a050(true, lg_._h, (byte)91, a_._m, 16777215);
      hl_._b._n = new e_(jk_.a841(new String[]{tn_._U}, ib_._c, 30496));
      hi_._a._n = new e_(jk_.a841(new String[]{qk_._d}, ib_._c, 30496));
      kl_._h._n = new e_(jk_.a841(new String[]{dj_._c}, ib_._c, var1 ^ 30561));
      cd_._d._n = new e_(jk_.a841(new String[]{pm_._n}, ib_._c, 30496));
      am_._f._n = new e_(jk_.a841(new String[]{nf_._x}, ib_._c, 30496));
      nl_._a._n = new e_((String)null, pm_._o, nk_._Lb);
      sn_._b._n = new e_((String)null, ud_._u, oi_._M);
      this.a556((byte)-112, -1);
   }

   private final void g150(int var1) {
      int var2 = var1;

      for(int var3 = 0; 2 > var3; ++var3) {
         for(int var4 = 0; var4 < 4; ++var4) {
            int var5 = 195 + 102 * var4;
            int var6 = 104 * var3 + 60;
            if (null != um_._i[var2]) {
               um_._i[var2]._b.a697(86, var6 + 5, (byte)102, 5 + var5, 86);
               a608(var5 + 96, 96 + var6, 3, um_._i[var2], 0);
            }

            int var7 = (int)((te_.c503(mo_._a, var2 * 10273, 0.015625) + 2.0) * 64.0);
            if (var7 < 0) {
               var7 = 0;
            }

            if (this._C == var2) {
               this._z.b326(var5, var6, var7);
            } else if (var2 == this._t) {
               this._A.b326(var5, var6, 64);
               this._u.b326(var5, var6, var7);
            } else if (um_._i[var2] != gm_._d._a[var2]) {
               int var8 = (int)((1.0 + Math.cos((double)((float)mo_._a / 20.0F))) * 64.0) + 128;
               this._I.b326(var5, var6, var8);
            }

            if (var2 == 7) {
               break;
            }

            ++var2;
         }
      }

   }

   private final void a893(byte var1, boolean var2) {
      int var3;
      for(var3 = 0; 8 > var3 && um_._i[var3] == gm_._d._a[var3]; ++var3) {
      }

      if (var3 != 8) {
         super._b = new lf_(oa_._h, pb_._F);
      } else if (kn_._g && gm_._d._K == 0) {
         for(var3 = 0; var3 < 8 && null == gm_._d._a[var3]; ++var3) {
         }

         if (8 != var3) {
            gd_.a778(g_._Hb, 0, 2, var2);
         } else {
            fm_.a093(21);
         }
      } else {
         gd_.a778(g_._Hb, 0, g_._Hb, var2);
      }
   }

   public static void e150() {
      _s = null;
      _x = null;
      _J = null;
      _v = null;
      _r = null;
      _w = null;
   }

   private final void a093(int var1, int var2) {
      int[] var3 = new int[hp_._b.length];
      int var4;
      if (var1 != 0) {
         if (var1 == 1) {
            for(var4 = 0; var3.length > var4; ++var4) {
               if (hp_._b[var4] != null) {
                  var3[var4] = hp_._b[var4]._m;
               }
            }
         } else if (2 != var1) {
            if (var1 == 5) {
               for(var4 = 0; var4 < var3.length; ++var4) {
                  if (hp_._b[var4] != null) {
                     var3[var4] = hp_._b[var4]._b;
                  }
               }
            } else if (6 == var1) {
               for(var4 = 0; var3.length > var4; ++var4) {
                  if (null != hp_._b[var4]) {
                     var3[var4] = hp_._b[var4]._o;
                  }
               }
            }
         } else {
            for(var4 = 0; var3.length > var4; ++var4) {
               if (hp_._b[var4] != null) {
                  var3[var4] = hp_._b[var4]._r;
               }
            }
         }
      } else {
         for(var4 = 0; var4 < var3.length; ++var4) {
            if (null != hp_._b[var4]) {
               var3[var4] = hp_._b[var4]._B;
            }
         }
      }

      if (this._G == var1) {
         this._E = !this._E;
      } else {
         this._E = false;
      }

      this._G = var1;
      if (!this._E) {
         for(var4 = 0; var3.length > var4; ++var4) {
            var3[var4] = -var3[var4];
         }
      }

      if (lf_._y != null) {
         qm_._r = (u_[])((u_[])lf_._y.clone());
         ik_.a019(qm_._r, var3);
      }

      ud_._t._J = null;
      ud_._t.e487(true);
      var4 = var2;
      u_[] var5 = qm_._r;

      for(int var6 = 0; var5.length > var6; ++var6) {
         u_ var7 = var5[var6];
         if (var7 != null) {
            var7.b599(10, var4, (byte)4);
            var4 += 8 + var7._x;
            ud_._t.a720(var7, (byte)-78);
         }
      }

   }

   private final void d150(int var1) {
      if (var1 != 1793) {
         this._t = 120;
      }

      for(int var2 = 0; 8 > var2; ++var2) {
         um_._i[var2] = gm_._d._a[var2];
         if (null != um_._i[var2]) {
            eh_ var3 = um_._i[var2]._p != 255 ? um_._i[var2]._n._e : k_._c;
            um_._i[var2]._b = new wd_(var3);
         }
      }

      ho_.b423();
   }

   private final void b150(int var1) {
      if (var1 >= -100) {
         _w = (qh_[])null;
      }

      int var2 = 0;

      for(int var3 = 0; 2 > var3; ++var3) {
         for(int var4 = 0; 4 > var4; ++var2) {
            int var5 = 195 + 102 * var4;
            int var6 = 60 + 104 * var3;
            gf_.e050(var5, var6, 96, 96, 0);
            byte var7 = 0;
            gf_.b050(var5 + 4, 4 + var6, 88, 88, var7);
            rp_.a857(4, 88, (byte)108, var5 + 4, 88, kc_._S, 4 + var6);
            if (7 == var2) {
               break;
            }

            ++var4;
         }
      }

   }

   private final void a556(byte var1, int var2) {
      this._C = var2;
      if (var1 == -112) {
         hb_ var3 = null;
         if (-1 != this._C) {
            var3 = um_._i[this._C];
         }

         if (var3 != null) {
            h_ var4 = var3._n;
            if (255 == var3._p) {
               mi_.a300(in_._y, sa_._e, ne_._c, jm_._i);
               in_._y._n = new e_((String)null, jk_.a841(new String[]{var4._F.toUpperCase(), gh_.a382(gj_.a498(var4))}, e_._g, 30496), (String)null);
               in_._y._w = true;
            } else if (var4._m <= var3._e && var3._g >= var4._r && var3._f >= var4._b && var3._k >= var4._o) {
               mi_.a300(in_._y, sa_._e, ne_._c, jm_._i);
               in_._y._w = false;
            } else {
               mi_.a300(in_._y, ae_._e, ne_._c, jm_._i);
               in_._y._n = new e_((String)null, jk_.a841(new String[]{var4._F.toUpperCase(), gh_.a382(gj_.a498(var4))}, t_._c, 30496), (String)null);
               in_._y._w = true;
            }
         } else {
            mi_.a300(in_._y, sa_._e, ne_._c, jm_._i);
            in_._y._w = false;
         }

      }
   }

   private final void a150(int var1) {
      if (var1 > -119) {
         this.b326(-128, -72, -101);
      }

      lf_._y = new u_[hp_._b.length];
      int var2 = 0;

      for(int var3 = 0; hp_._b.length > var3; ++var3) {
         h_ var4 = hp_._b[var3];
         if (var4 != null && var4._x != -1 && null != var4._F && var4._c <= gm_._d._m) {
            u_ var5 = new u_(10, var2, var4);
            var2 += 10 + var5._x;
            lf_._y[var3] = var5;
            var5._n = new fc_(var4);
            op_._d.a507(var5, (byte)-20);
         }
      }

   }

   final void c487(boolean var1) {
      super.c487(var1);
      if (!kh_._s && var1) {
         while(ha_.b427()) {
            if (13 != mm_._t) {
               super.f797();
            } else {
               this.a893((byte)-61, false);
            }
         }

         this.f150(-24900);
         if (super._b != null && super._b._d) {
            lf_ var2 = (lf_)super._b;
            if (!var2._u) {
               this.d150(1793);
            } else {
               this.d487(true);
            }

            super._b.c150(-127);
            super._b = null;
            gd_.a778(g_._Hb, 0, g_._Hb, false);
         }

         if (kn_._g) {
            bl_.a150(0);
         }

         hb_[] var5 = um_._i;

         for(int var3 = 0; var5.length > var3; ++var3) {
            hb_ var4 = var5[var3];
            if (var4 != null) {
               var4._b.a556((byte)109, 20);
            }
         }

         if (this._F != null) {
            this._F.a556((byte)109, 20);
         }

      }
   }

   ih_() {
      this._B = new tf_(ne_._c, lg_._h, cm_._M);
      new tf_(db_._v, ak_._m.toUpperCase(), cm_._M);
   }

   static {
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(int var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) != 1) {
               var0 >>>= 1;
            } else {
               var0 = -306674912 ^ var0 >>> 1;
            }
         }

         _J[var1] = var0;
      }

      _v = "Chaos Champion";
   }
}
