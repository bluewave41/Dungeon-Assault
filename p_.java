final class p_ extends qe_ {
   private gd_ _L;
   private nn_ _M;
   private tf_ _E;
   private gd_ _C;
   private gd_ _A;
   private int _z;
   private gd_ _w;
   static String _K = "Please wait...";
   private int _F;
   private cl_ _u;
   private gd_ _P;
   private boolean _s;
   static int[] _x = new int[8192];
   private gd_ _y;
   private gd_ _t;
   private pp_ _Q;
   private cp_[] _v;
   private pp_ _O;
   private cp_[] _D;
   private nn_ _R;
   static String[] _J = new String[]{null, "Each <%raider> has four skills - <%attack>, <%defence>, <%dodge> and <%sneak> - displayed as bars above your party selection. Some raiders also possess a special ability."};
   static cn_[] _G;
   private rh_ _N;
   private rh_ _I;
   static String _r = "Raids: ";
   private wd_ _H;

   private static final cn_[] a528(cn_[] var0, int var1) {
      cn_[] var2 = new cn_[var0.length];
      jh_.c797();

      for(int var3 = 0; var0.length > var3; ++var3) {
         cn_ var4 = var0[var3];
         if (var4 != null) {
            cn_ var5 = new cn_(27 * var4._E / 16, var4._G * 20 / 12);
            var5.e797();
            var4.c115(-(var4._w * 27) / 16, -(var4._A * 27) / 16, var5._E, var5._G);
            var4 = var5;
            var5 = new cn_(var5._E / 2, var5._G / 2);
            var5.e797();
            var4.e115(var5._E / 2, var5._G / 2, 0, 2048);
            var5._A = var4._A * 27 >> 5;
            var5.c797();
            var2[var3] = var5;
         }
      }

      jh_.b797();
      if (var1 != 400) {
         return (cn_[])null;
      } else {
         return var2;
      }
   }

   private final void a823(gd_ var1, String var2, byte var3, String var4, String var5) {
      if (var3 < 109) {
         this.a423((byte)-82);
      }

      jh_.c797();
      short var6 = 130;
      int var7 = db_._v._H + db_._v._E;
      cn_ var8 = new cn_(var6, var7);
      var8.e797();
      db_._v.b191(var5, 0, db_._v._H, 12632256, -1);
      db_._v.a191(var4, var6, db_._v._H, 12632256, -1);
      cn_ var9 = new cn_(var6, var7);
      var9.e797();
      db_._v.b191(var5, 0, db_._v._H, 12690143, -1);
      db_._v.a191(var4, var6, db_._v._H, 12690143, -1);
      String var10 = var1._B ? var2 : var4;
      cn_ var11 = new cn_(var6, var7);
      var11.e797();
      db_._v.b191(var5, 0, db_._v._H, 16744448, -1);
      db_._v.a191(var10, var6, db_._v._H, 16744448, -1);
      jh_.b797();
      cn_ var12 = rb_.a551(8, var9, 255, (byte)-13);
      cn_ var13 = rb_.a551(8, var11, 16711680, (byte)78);
      var1.a037(var11, var8, var13, var9, (byte)126, var12);
   }

   private final gd_ a836(String var1, String var2, int var3, int var4, int var5, String var6) {
      jh_.c797();
      short var7 = 130;
      int var8 = db_._v._E + db_._v._H;
      cn_ var9 = new cn_(var7, var8);
      var9.e797();
      db_._v.b191(var2, 0, db_._v._H, 12632256, -1);
      db_._v.a191(var1, var7, db_._v._H, 12632256, var4);
      cn_ var10 = new cn_(var7, var8);
      var10.e797();
      db_._v.b191(var2, 0, db_._v._H, 12690143, -1);
      db_._v.a191(var1, var7, db_._v._H, 12690143, -1);
      cn_ var11 = new cn_(var7, var8);
      var11.e797();
      db_._v.b191(var2, 0, db_._v._H, 16744448, -1);
      db_._v.a191(var6, var7, db_._v._H, 16744448, -1);
      jh_.b797();
      cn_ var12 = rb_.a551(8, var10, 255, (byte)92);
      cn_ var13 = rb_.a551(8, var11, 16711680, (byte)-8);
      return new gd_(var9, var10, var12, var11, var13, var3, (-var8 + 30 >> 1) + var5);
   }

   private final void b423(byte var1) {
      if (var1 == 26) {
         this._v = new cp_[gh_._i.length];
         int var2 = 0;

         for(int var3 = 0; var3 < gh_._i.length; ++var3) {
            ac_ var4 = gh_._i[var3];
            if (var4 != null && -1 != var4._j && 0 != var4._g && var4._z != null && var4._i <= gm_._d._m) {
               cp_ var5 = new cp_(10, var2, var4);
               var2 += var5._x + 10;
               this._v[var3] = var5;
               this._R.a507(var5, (byte)-20);
            }
         }

      }
   }

   private final void a652(int var1, int var2, byte var3, int var4) {
      if (var3 >= 126) {
         lb_ var5 = gm_._d;
         int var6 = var5._L[var4]._a;
         if (qj_._c[var4] != null) {
            var6 = qj_._c[var4]._a;
         }

         if (0 != var6) {
            this.a041(var2, 124, var4, -dm_._a[var6]._v + 56 + var1, dm_._a[var6]);
            if (2 == gh_._i[var6]._g) {
               cn_ var7 = jb_.a574(var6);
               if (null != var7) {
                  int var8 = var7._E * 5 >> 3;
                  int var9 = var7._G * 5 >> 3;
                  var7.c115(var2 + (-var8 + 48 >> 1), 40 + var1 - var9, var8, var9);
               }
            }
         } else {
            int var10 = 0;
            if (0 != var4 % 7 && gm_._d._k.a370(var4 - 1 - var4 / 7, (byte)72)) {
               var10 |= 1;
            }

            if (var4 % 7 != 6 && gm_._d._k.a370(var4 - var4 / 7, (byte)73)) {
               var10 |= 2;
            }

            if (var4 > 6 && gm_._d._k.a370(var4 + 35, (byte)119)) {
               var10 |= 4;
            }

            if (42 > var4 && gm_._d._k.a370(var4 + 42, (byte)80)) {
               var10 |= 8;
            }

            id_._m[var10].h093(var2, var1 + 12);
         }

      }
   }

   final void a487(boolean var1) {
      super.a487(var1);
      super._e.b093(0, 0);
      ai_ var2 = null;
      if (-1 != this._F) {
         var2 = qj_._c[this._F];
         if (null == var2) {
            var2 = gm_._d._L[this._F];
         }
      }

      ac_ var3 = null;
      if (var2 != null) {
         var3 = var2._h;
      } else if (this._R._l != null) {
         var3 = ((cp_)this._R._l)._S;
      }

      a738(200, 65, var3);
      if (null != var2) {
         a484(488, 54, var2);
      } else {
         a204(488, 54, this._H, kc_._V);
      }

      this.a183(false, 484, 327);

      rj_ var4;
      for(var4 = (rj_)super._p.e024(-24172); var4 != null; var4 = (rj_)super._p.a024(4)) {
         var4.a150(68);
      }

      ad_._e.h093(187, 48);
      ad_._e.i093(187, -ad_._e._b + 40);
      ad_._e.f093(604 - ad_._e._d, 40 - ad_._e._b);
      oe_._m.h093(171, 382);
      oe_._m.j093(580, 99);
      if (gl_._Lb) {
         this._u.b423((byte)-55);
      } else {
         this.a326(8, 80, 394);
      }

      if (null != super._b) {
         super._b.a423((byte)-91);
      }

      e797();
      super._q.a423((byte)-61);
      int var5;
      if (!gl_._Lb) {
         var5 = (int)((1.0 + Math.cos((double)((float)mo_._a / 20.0F))) * 128.0);
         wm_._c.b326(205, 83, 256);
         wm_._c.b326(205, 83, var5);
         if (this._w._B) {
            ec_.a021(95, 205, im_._e, 16744448, 192);
         }
      } else {
         var5 = (int)(128.0 * (1.0 + Math.cos((double)((float)mo_._a / 20.0F))));
         wm_._c.b326(-(im_._e._y >> 1) + 356, -(im_._e._v >> 1) + 267, 256);
         wm_._c.b326(356 - (im_._e._y >> 1), 267 - (im_._e._v >> 1), var5);
         if (this._w._B) {
            ec_.a021(-(im_._e._v >> 1) + 265, -(im_._e._y >> 1) + 354, im_._e, 16744448, 96);
         }
      }

      for(var4 = (rj_)super._p.e024(-24172); null != var4; var4 = (rj_)super._p.a024(4)) {
         var4.d150(0);
      }

      if (this._F != -1 && null != this._R._l) {
         var5 = 0;
         if (qj_._c[this._F] == null) {
            if (null != gm_._d._L[this._F]) {
               var5 = gm_._d._L[this._F]._h._c >> 1;
            }
         } else {
            var5 = qj_._c[this._F]._h._c;
         }

         if (var5 != 0) {
            int var6 = this._F / 7;
            int var7 = this._F % 7;
            int var8 = 421 - (189 - (var7 + var6) * 27);
            int var9 = 80 + 20 * (-var7 + var6 + 7);
            if (gl_._Lb) {
               gg_ var10 = this._u.b624(this._F, -15390);
               var8 = var10._f - 1;
               var9 = 7 + var10._b;
            }

            int var11;
            if (t_._a != var5) {
               String var15 = "+" + var5 / 10;
               var11 = db_._v.b926(var15);
               int var12 = db_._v._E + db_._v._H;
               jn_._a = new cn_(var11, var12);
               jh_.a303(jn_._a);
               db_._v.b191(var15, 0, db_._v._H, 16744512, -1);
               jh_.b797();
               dm_._f = dd_.a510(12, jn_._a);
               int[] var13 = dm_._f._B;

               for(int var14 = 0; var14 < var13.length; ++var14) {
                  var13[var14] = nb_.a080(var13[var14], 255);
                  if (0 == var13[var14]) {
                     var13[var14] = 1;
                  }
               }

               t_._a = var5;
            }

            int var16 = var8 - (jn_._a._y >> 1);
            var11 = -jn_._a._v + var9;
            bp_.a131(var11, dm_._f, var16);
            jn_._a.h093(var16, var11);
         }
      }

      this._N.d797();
      this._I.d797();
      if (null != super._b) {
         for(var5 = 0; var5 < gf_._b.length; ++var5) {
            gf_._b[var5] = nb_.a080(gf_._b[var5] >>> 2, 1061109567);
         }

         super._b.b150(112);
      }

      if (kn_._g) {
         ab_.a150(0);
      }

      oh_.a423();
   }

   static final void a467(nh_ var0, nh_ var1, nh_ var2) {
      gn_._i = kn_.a922(var2, "commonui", "frame_top");
      di_._l = kn_.a922(var2, "commonui", "frame_bottom");
      bl_._e = oh_.a825(var2, "commonui", "jagex_logo_grey");
      na_._C = kn_.a922(var2, "commonui", "button");
      sl_._c = da_.a632("commonui", "validation", 0, var2);
      ta_._e = kk_.a005(var1, var2, "arezzo12", 0, "commonui");
      lp_._C = kk_.a005(var1, var2, "arezzo14", 0, "commonui");
      hc_._f = kk_.a005(var1, var2, "arezzo14bold", 0, "commonui");
      cn_ var3 = new cn_(var0.a826("button.gif", "", (byte)-116), c_._h);
      pa_.a872(var2, "commonui", "dropdown");
      q_[] var4 = qa_.a466("screen_options", "commonui", var2);
      d_._c = new q_[4];
      nf_._v = new q_[4];
      wo_._a = new q_[4];
      q_[][] var5 = new q_[][]{d_._c, nf_._v, wo_._a};
      int[][] var6 = new int[4][];
      var6[0] = var4[0]._i;

      for(int var7 = 1; var6.length > var7; ++var7) {
         var6[var7] = (int[])((int[])var6[0].clone());
      }

      byte var12 = var4[0]._j[0];
      var6[2][var12] = 16777215;
      var6[1][var12] = 2394342;
      var6[3][var12] = 4767999;

      int var8;
      for(var8 = 0; var8 < 3; ++var8) {
         q_[] var9 = var5[var8];

         for(int var10 = 0; var10 < var9.length; ++var10) {
            var9[var10] = pi_.a648(1, var4[var8], var6[var10]);
         }
      }

      var8 = var3._v;
      ie_.a150();
      var3.e797();
      gf_.d115(0, 0, gf_._i, gf_._c);
      cn_ var13 = new cn_(var8, var8);
      var13.e797();
      var3.c093(0, 0);
      cn_ var14 = new cn_(var8, var8);
      var14.e797();
      var3.c093(-var3._y + var8, 0);
      cn_ var11 = new cn_(var3._y - var8 * 2, var8);
      var11.e797();
      var3.c093(-var8, 0);
      ti_.c487(true);
      na_._C = new cn_[]{var13, var11, var14};
   }

   static final vk_ a853(int var0, String var1) {
      vk_ var2 = new vk_(false);
      var2._g = var1;
      var2._d = var0;
      return var2;
   }

   private final void a183(boolean var1, int var2, int var3) {
      int var4 = var3 + 8 + la_._b._H;
      db_._v.b191(pb_._I, 7 + var2, var4, 16777215, -1);
      db_._v.a191(Integer.toString(gm_._d._s / 10), 133 + var2, var4, 16777215, -1);
      int var5 = 0 >= jj_._c ? 0 : jj_._c / 10;
      var4 += 37;
      if (!var1) {
         int var6 = gm_._d._s < jj_._c ? 16711680 : 16777215;
         db_._v.b191(ef_._f, 7 + var2, var4, var6, -1);
         db_._v.a191(Integer.toString(var5), var2 + 133, var4, var6, -1);
      }
   }

   private final void d150(int var1) {
      this._F = -1;
      if (!kn_._g || !od_.a427()) {
         if (!super.d801()) {
            this._F = this.b313(hj_._S, eh_._h, 162);
            if (this._F != -1) {
               ai_ var2 = qj_._c[this._F];
               if (var2 == null) {
                  var2 = gm_._d._L[this._F];
               }

               if (var2 != null) {
                  if (var2 != rd_._x) {
                     hh_._r = new bd_(var2._h);
                     rd_._x = var2;
                  }

                  uj_.a872(hh_._r);
               }
            }

            if (this._Q == hh_._s) {
               this.c150(var1 + 1380862290);
               this.a813(true, (byte)-27);
            } else if (this._O != hh_._s) {
               if (this._L != hh_._s) {
                  if (hh_._s == this._A) {
                     this.a556((byte)-47, 0);
                  } else if (this._C != hh_._s) {
                     if (hh_._s == this._y) {
                        this.a556((byte)-88, 4);
                     } else if (this._P != hh_._s) {
                        if (hh_._s != this._w && this._t != hh_._s) {
                           if (!(hh_._s instanceof cp_)) {
                              if (0 != no_._d) {
                                 int var4 = this.b313(lc_._c, hm_._k, var1 + 1380862337);
                                 if (var4 != -1 && var4 != 0 && var4 != 6 && var4 != 24 && 42 != var4 && var4 != 48) {
                                    if (no_._d != 1) {
                                       if (2 == no_._d) {
                                          if (null != qj_._c[var4]) {
                                             jj_._c -= qj_._c[var4]._h._c;
                                             if (gm_._d._L[var4] != null) {
                                                jj_._c += gm_._d._L[var4]._h._c >> 1;
                                             }
                                          }

                                          qj_._c[var4] = null;
                                          this._H = null;
                                       }
                                    } else if (this._R._l != null) {
                                       ac_ var3 = ((cp_)this._R._l)._S;
                                       if (qj_._c[var4] == null || var3 != qj_._c[var4]._h) {
                                          if (null != qj_._c[var4]) {
                                             jj_._c -= qj_._c[var4]._h._c;
                                          } else if (gm_._d._L[var4] != null) {
                                             jj_._c -= gm_._d._L[var4]._h._c >> 1;
                                          }

                                          qj_._c[var4] = new ai_(var3._v);
                                          if (null == qj_._c[var4]._c || qj_._c[var4]._c._i != var3._d) {
                                             qj_._c[var4]._c = new wd_(var3._d);
                                          }

                                          jj_._c += var3._c;
                                          qh_.a726(var1 ^ 1380875597, this._Q, 19);
                                          if (var3._u != qj_._c[var4]._c._n) {
                                             if (null != var3._u) {
                                                qj_._c[var4]._c.a721(rf_._M, var3._u, -10872);
                                             }

                                             if (var3._a != null) {
                                                gd_.a364(64, var3._a);
                                             }
                                          }
                                       }
                                    }

                                    jk_.j423((byte)59);
                                    this.c423((byte)-118);
                                 }
                              }
                           } else {
                              ac_ var5 = ((cp_)hh_._s)._S;
                              this._H = new wd_(var5._d);
                              if (null != var5._u) {
                                 this._H.a721(rf_._M, var5._u, -10872);
                              }
                           }
                        } else {
                           this.a423((byte)-121);
                        }
                     } else {
                        this.a556((byte)-52, 3);
                     }
                  } else {
                     this.a556((byte)-82, 2);
                  }
               } else {
                  this.a556((byte)-50, 1);
               }
            } else {
               this.d423((byte)-76);
               this.a813(true, (byte)-11);
            }

            if (var1 != -1380862175) {
               this.b313(-120, -24, -127);
            }

         }
      }
   }

   private final void a556(byte var1, int var2) {
      int[] var3 = new int[gh_._i.length];
      int var4;
      if (0 == var2) {
         for(var4 = 0; var4 < var3.length; ++var4) {
            if (null != gh_._i[var4]) {
               var3[var4] = gh_._i[var4]._c;
            }
         }
      } else if (var2 == 1) {
         for(var4 = 0; var3.length > var4; ++var4) {
            if (gh_._i[var4] != null) {
               var3[var4] = gh_._i[var4]._A;
            }
         }
      } else if (var2 != 2) {
         if (3 == var2) {
            for(var4 = 0; var4 < var3.length; ++var4) {
               if (gh_._i[var4] != null) {
                  var3[var4] = gh_._i[var4]._y;
               }
            }
         } else if (4 == var2) {
            for(var4 = 0; var3.length > var4; ++var4) {
               if (gh_._i[var4] != null) {
                  var3[var4] = gh_._i[var4]._r;
               }
            }
         }
      } else {
         for(var4 = 0; var3.length > var4; ++var4) {
            if (null != gh_._i[var4]) {
               var3[var4] = gh_._i[var4]._k;
            }
         }
      }

      if (this._z != var2) {
         this._s = false;
      } else {
         this._s = !this._s;
      }

      this._z = var2;
      if (!this._s) {
         for(var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = -var3[var4];
         }
      }

      if (this._v != null) {
         this._D = (cp_[])((cp_[])this._v.clone());
         ik_.a019(this._D, var3);
      }

      if (var1 >= -42) {
         this._R = (nn_)null;
      }

      hf_._nb._J = null;
      hf_._nb.e487(true);
      var4 = 0;
      cp_[] var5 = this._D;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         cp_ var7 = var5[var6];
         if (var7 != null) {
            var7.b599(10, var4, (byte)4);
            var4 += 8 + var7._x;
            hf_._nb.a720(var7, (byte)-48);
         }
      }

   }

   final void c487(boolean var1) {
      super.c487(var1);
      if (!kh_._s && var1) {
         while(ha_.b427()) {
            if (mm_._t == 13) {
               this.a813(false, (byte)-94);
            } else {
               super.f797();
            }
         }

         if (null != super._b && super._b._d) {
            lf_ var2 = (lf_)super._b;
            if (!var2._u) {
               this.d423((byte)-76);
            } else {
               this.c150(65);
            }

            super._b.c150(-127);
            super._b = null;
            this.a813(true, (byte)-11);
         }

         this.d150(-1380862175);
         if (kn_._g) {
            bl_.a150(0);
         }

         if (this._H != null) {
            this._H.a556((byte)109, 20);
         }

         ai_[] var5 = gm_._d._L;

         int var3;
         ai_ var4;
         for(var3 = 0; var3 < var5.length; ++var3) {
            var4 = var5[var3];
            if (null != var4) {
               var4._c.a556((byte)109, 20);
            }
         }

         var5 = qj_._c;

         for(var3 = 0; var3 < var5.length; ++var3) {
            var4 = var5[var3];
            if (var4 != null) {
               var4._c.a556((byte)109, 20);
            }
         }

      }
   }

   public static void d487(boolean var0) {
      _r = null;
      _G = null;
      _K = null;
      _x = null;
      _J = null;
      if (!var0) {
         _K = (String)null;
      }

   }

   private final void c423(byte var1) {
      this._Q._w = gm_._d._s >= jj_._c;
   }

   private final int b313(int var1, int var2, int var3) {
      if (this._u == null) {
         var2 -= 98;
         var1 -= 394;
         int var4 = ((189 + var1) * 3 + 560 - var2 * 4) / 162;
         int var5 = (3 * var1 + var2 * 4) / var3;
         return var4 >= 0 && 0 <= var5 && var4 < 7 && var5 < 7 ? 7 * var5 + var4 : -1;
      } else {
         return this._u.b313(var1, 19091, var2);
      }
   }

   private final void d423(byte var1) {
      for(int var2 = 0; var2 < 49; ++var2) {
         qj_._c[var2] = null;
      }

      jj_._c = 0;
      if (var1 != -76) {
         this.b150(-63);
      }

      this.c423((byte)34);
   }

   private final void a813(boolean var1, byte var2) {
      int var3 = 0;
      if (var2 > -3) {
         this.c423((byte)76);
      }

      while(49 > var3 && null == qj_._c[var3]) {
         ++var3;
      }

      if (var3 == 49) {
         if (!ed_.c491(true) && !gm_._d._H) {
            ac_._B.d556((byte)-106, 58);
         }

         if (kn_._g) {
            gd_.a778(g_._Hb, 0, 5, var1);
         } else {
            gd_.a778(g_._Hb, 0, g_._Hb, var1);
         }
      } else {
         String var4 = wj_._x;
         if (!gm_._d._H) {
            var4 = var4 + dh_._c;
         }

         super._b = new lf_(oa_._h, var4);
      }
   }

   private final void a423(byte var1) {
      this.a823(this._w, dc_._k, (byte)125, ob_._Kb, mm_._s);
      this.a823(this._t, dc_._k, (byte)122, ob_._Kb, cf_._d);
      if (var1 > -65) {
         this.c797();
      }

      if (gl_._Lb == this._t._B) {
         gl_._Lb = !this._t._B;
         this.a150(14);
      }

   }

   private final void b150(int var1) {
      rl_._d = a528(ri_._d, 400);
      dm_._a = a528(i_._r, 400);
      id_._m = a528(mc_._w, var1 - 2398);
      short var2 = 390;
      short var3 = 300;
      bd_._g = new cn_(var2, var3);
      if (var1 != 2798) {
         this._N = (rh_)null;
      }

      jh_.a303(bd_._g);
      nb_._d.a115(0, 0, var2, var3);
      jh_.b797();
   }

   private final void e150(int var1) {
      this.b797();
      this._R = new nn_(true);
      this._M = new nn_(false);
      hf_._nb = new ed_(8, 90, 180, 382);
      this._Q = tn_.a226(16, 12, ne_._c, jm_._i, var1 ^ -18245, lk_._P);
      this._O = tn_.a226(472, 12, ne_._c, jm_._i, var1 ^ -18248, be_._r.toUpperCase());
      this._A = sj_.a921(24, 87, 66, uj_._c, this._M);
      this._L = sj_.a921(55, 96, 66, gd_._E, this._M);
      this._C = sj_.a921(86, 110, 66, jj_._b, this._M);
      this._P = sj_.a921(117, 87, 66, tb_._c, this._M);
      this._y = sj_.a921(148, 91, 66, kd_._f, this._M);
      super._p.a865(hf_._nb, false);
      super._p.a865(this._Q, false);
      super._p.a865(this._O, false);
      super._p.a865(this._A, false);
      super._p.a865(this._L, false);
      super._p.a865(this._C, false);
      super._p.a865(this._P, false);
      super._p.a865(this._y, false);
      this._A._n = new e_(jk_.a841(new String[]{tn_._U}, tp_._w, 30496));
      this._L._n = new e_(jk_.a841(new String[]{qk_._d}, tp_._w, var1 + 12257));
      this._C._n = new e_(jk_.a841(new String[]{dj_._c}, tp_._w, var1 + 12257));
      this._P._n = new e_(jk_.a841(new String[]{rk_._a}, tp_._w, 30496));
      this._y._n = new e_(jk_.a841(new String[]{eg_._f}, tp_._w, 30496));
      this._O._n = new e_((String)null, pm_._o, nk_._Lb);
      this._Q._n = new e_((String)null, ud_._u, oi_._M);
      this.b423((byte)26);
      this._z = 0;
      this._s = false;
      this._M.a780(this._A, -256);
      this.a556((byte)-124, 0);
      this._w = this.a836(ob_._Kb, mm_._s, 491, var1 ^ -18240, 438, dc_._k);
      this._w._B = true;
      super._p.a865(this._w, false);
      this._t = this.a836(ob_._Kb, cf_._d, 491, -1, 401, dc_._k);
      this._t._B = !gl_._Lb;
      super._p.a865(this._t, false);
      if (var1 == 18239) {
         super._q = new sa_(186, 401, 288, 71);
         super._q.a050(true, f_._c, (byte)91, wh_._c, 16777215);
      }
   }

   private final void a150(int var1) {
      ol_._a = new cn_[4];
      ol_._a[0] = me_.a028(32, var1, 14, 0, 14);
      ol_._a[1] = me_.a028(32, 14, 0, 14, 14);
      ol_._a[2] = me_.a028(md_.b080(var1, 46), 0, 14, 14, 14);
      ol_._a[3] = me_.a028(32, 14, 14, 14, 0);
      if (!gl_._Lb) {
         ol_._a = a528(wk_.a528(ol_._a, var1 - 14), 400);
      }

      if (gl_._Lb) {
         this._u = new sf_((go_)null, 350, 261);
      } else {
         this._u = null;
      }

      jk_.j423((byte)59);
   }

   final void c797() {
      im_._e = null;
      rl_._d = null;
      dm_._a = null;
      rd_._x = null;
      jn_._a = null;
      dm_._f = null;
      ol_._a = null;
      wm_._c = null;
      bd_._g = null;
      id_._m = null;
      hh_._r = null;
      bn_._f = null;
      super.c797();
      System.gc();
   }

   private final void c150(int var1) {
      if (var1 < 56) {
         this.a326(-105, -4, 26);
      }

      if (gm_._d._s >= jj_._c) {
         int var2;
         if (!ed_.c491(true)) {
            ac_._B.d556((byte)-127, 57);

            for(var2 = 0; var2 < 49; ++var2) {
               if (0 != var2 && 6 != var2 && 24 != var2 && var2 != 42 && 48 != var2) {
                  if (null != qj_._c[var2]) {
                     ac_._B.a093(6, qj_._c[var2]._a);
                  } else {
                     ac_._B.a093(6, 0);
                  }
               }
            }
         }

         if (jj_._c > 0) {
            lb_ var10000 = gm_._d;
            var10000._s -= jj_._c;
         }

         for(var2 = 0; 49 > var2; ++var2) {
            if (0 != var2 && var2 != 6 && 24 != var2 && var2 != 42 && var2 != 48 && null != qj_._c[var2]) {
               gm_._d._L[var2] = new ai_(qj_._c[var2]._a);
               gm_._d._L[var2]._c = qj_._c[var2]._c;
               qj_._c[var2] = null;
            }
         }

         jj_._c = 0;
         this.c423((byte)-91);
      }

   }

   private final void a041(int var1, int var2, int var3, int var4, cn_ var5) {
      short var6 = 256;
      if (0 == gm_._d._L[var3]._a) {
         var6 = 128;
      }

      int var7 = 10066329;
      int var8 = var6 * (192 + ((var7 & 16711680) >> 18)) / 255;
      int var9 = (((var7 & '\uff00') >> 10) + 192) * var6 / 255;
      int var10 = (((var7 & 255) >> 2) + 192) * var6 / 255;
      int var11 = 0;
      int var12 = (var5._A + var4) * gf_._i + var1 + var5._w;
      int var13 = -var5._y + gf_._i;
      int var15 = -var5._v;
      if (var2 <= 54) {
         this.a823((gd_)null, (String)null, (byte)-123, (String)null, (String)null);
      }

      while(var15 < 0) {
         for(int var14 = -var5._y; 0 > var14; ++var14) {
            int var16 = var5._B[var11];
            if (0 != var16) {
               int var17 = var16 & 16711680;
               int var18 = var16 & '\uff00';
               int var19 = var16 & 255;
               var18 *= var9;
               var17 *= var8;
               var19 *= var10;
               var16 = var17 & -16777216 | var18 & 16711680 | var19 & '\uff00';
               gf_._b[var12] = var16 >>> 8;
            }

            ++var12;
            ++var11;
         }

         var12 += var13;
         ++var15;
      }

   }

   private final void a326(int var1, int var2, int var3) {
      bd_._g.h093(-(bd_._g._y >> 1) + var3 + 2, var2 + 12);
      lb_ var4 = gm_._d;
      if (var1 != 8) {
         _x = (int[])null;
      }

      int var5;
      for(var5 = 0; var5 <= 140; ++var5) {
         gf_.b115(-(var5 * 4 / 3) + var3, var5 + 18 + var2, var5 * 8 / 3, 0);
         gf_.b115(var3 - var5 * 4 / 3, -var5 + 280 + var2 + 18, var5 * 8 / 3, 0);
      }

      int var6;
      int var7;
      int var8;
      int var9;
      boolean var10;
      int var11;
      boolean var12;
      for(var5 = 0; var5 < 7; ++var5) {
         var6 = var3 - (1 + var5) * 27;
         var7 = 20 * var5 + var2;
         var8 = 6 - var5;

         for(var9 = 0; var9 < 1 + var5; var8 += 8) {
            if (0 == var9) {
               if (0 != var8 && var8 != 6) {
                  this.a041(var6, 92, var8, var7 + 4, rl_._d[5]);
               }
            } else {
               var10 = var4._k.a370(35 + var8, (byte)109);
               var11 = 5;
               if (var10) {
                  var12 = false;
                  var11 = !var12 ? 3 : 1;
               }

               this.a041(var6, 97, var8, 4 + var7, rl_._d[var11]);
            }

            if (var5 == var9) {
               if (var8 != 6 && var8 != 48) {
                  this.a041(27 + var6, 119, var8, var7 + 4, rl_._d[4]);
               }
            } else {
               var10 = var4._k.a370(var8 - var8 / 7, (byte)125);
               var11 = 4;
               if (var10) {
                  var12 = false;
                  var11 = !var12 ? 2 : 0;
               }

               this.a041(27 + var6, 110, var8, 4 + var7, rl_._d[var11]);
            }

            this.a652(var7, var6, (byte)127, var8);
            var6 += 54;
            ++var9;
         }
      }

      for(var5 = 7; 13 > var5; ++var5) {
         var6 = -((13 - var5) * 27) + var3;
         var7 = var2 + var5 * 20;
         var8 = 7 * var5 - 42;

         for(var9 = 0; 13 - var5 > var9; ++var9) {
            var10 = var4._k.a370(var8 + 35, (byte)86);
            var11 = 5;
            if (var10) {
               var12 = false;
               var11 = !var12 ? 3 : 1;
            }

            this.a041(var6, 57, var8, 4 + var7, rl_._d[var11]);
            var10 = var4._k.a370(var8 - var8 / 7, (byte)110);
            var11 = 4;
            if (var10) {
               var12 = false;
               var11 = var12 ? 0 : 2;
            }

            this.a041(27 + var6, 124, var8, var7 + 4, rl_._d[var11]);
            this.a652(var7, var6, (byte)127, var8);
            if (0 == var9 && var8 != 0 && 42 != var8) {
               rl_._d[4].h093(var6, 20 + 4 + var7);
            }

            if (-var5 + 12 == var9 && 42 != var8 && var8 != 48) {
               rl_._d[5].h093(27 + var6, 24 + var7);
            }

            var8 += 8;
            var6 += 54;
         }
      }

   }

   final void b487(boolean var1) {
      super.b487(var1);
      fk_.a261((byte)121, lf_._w);
      a268(super._e, 188, 48, 605, 400, 394, 220);
      jh_.a276(super._e);
      b370(8, 46, 180, 427, 16777215, 32, 128);
      h_.a086(false, 388, 15, true, 80);
      h_.a086(false, 426, 617, true, 46);
      a229(8, 47, 172, 425, 256, 32, 8, 128);
      a229(8, 8, 172, 32, 256, 64, 4, 128);
      a229(460, 8, 172, 32, 256, 64, 4, 128);
      a229(188, 8, 264, 32, 256, 64, 4, 128);
      this._E.b326(12, 32, 320 - (this._E._i >> 1));
      ke_.a115(0, 480, 0);
      ke_.a115(180, 480, 0);
      ke_.a115(605, 480, 48);
      jc_.a669(32, 452, 8, 1, 2, 1);
      ke_.a115(-be_._o._d + 640, 480, 0);
      c_.a842(0, 640, 0);
      c_.a842(0, 640, 40);
      c_.a842(0, 640, -bk_._e._b + 480);
      a115(14, 55, 161, 36);
      b370(188, 55, 418, 83, 8421504, 128, 128);
      a229(188, 55, 418, 83, 256, 64, 4, 32);
      a669(188, 55, 418, 11184810, 255, 128);
      a669(188, 137, 418, 11184810, 255, 128);
      b370(186, 400, 418, 87, 8421504, 32, 64);
      a669(186, 399, 418, 0, 255, 128);
      a669(186, 400, 418, 11184810, 255, 128);
      a229(186, 402, 420, 70, 256, 64, 4, 32);
      a115(484, 327, 144, 30);
      a115(484, 364, 144, 30);
      a115(484, 401, 144, 30);
      a115(484, 438, 144, 30);
      jh_.b797();
      this.b150(2798);
      jj_._c = 0;
      qj_._c = new ai_[49];
      t_._a = -1;
      bl_.a423();
      this.e150(18239);
      this.a150(14);
      this._H = null;
      this._N = new rh_(204, 394, 80, 160, 16711680, 768, 249);
      this._I = new rh_(600, 111, 80, 160, 16711680, 768, 249);
      qh_.a726(-13716, this._v[15], 18);
   }

   p_() {
      this._E = new tf_(ne_._c, f_._c, cm_._M);
   }
}
