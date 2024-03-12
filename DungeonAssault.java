import java.awt.Canvas;
import java.util.Random;

public final class DungeonAssault extends in_ {
   static String _H = "Trap";
   static cn_ _I;
   static String _G = "<col=E5A634>Your title, </col><%0><col=E5A634>, will appear in the Dragons of Renown table.";
   static String _J = "Beastman";
   public static int _K;

   public static void h423() {
      _G = null;
      _J = null;
      _I = null;
      _H = null;
   }

   private final void c813(boolean var1, byte var2) {
      if (fm_._e != fm_._a) {
         if (fm_._a != dg_._H) {
            if (bn_._n == fm_._a) {
               if (!ed_.c491(true)) {
                  vk_.a423();
                  gd_.a778(g_._Hb, 0, sa_._f, false);
                  ll_._k |= nh_._k >= 2;
                  if (tl_._d) {
                     tl_._d = false;
                     a_.a743(320, ne_._c._N, ne_._c, false, 8, 240, 2, 8, ne_._c._E + ne_._c._N, (cn_[])null, (cn_[])null);
                     if (cm_._R != null) {
                        i_._A.a238(cm_._R, (byte)51, false);
                     }
                  }

                  if (fc_.a370(dc_._z)) {
                     af_.a423();
                  }
               }

               fm_._a = ii_._F;
            } else {
               --pk_._t;
               if (pk_._t == 0) {
                  fm_._a = fm_._e;
               }
            }
         } else {
            ++pk_._t;
            if (pk_._t == 16) {
               if (!tl_._d) {
                  bj_.i150(81);
               } else {
                  dn_.b487(false);
               }

               gm_._d = null;
               fm_._a = bn_._n;
            }
         }
      } else {
         if (!var1) {
            if (co_._G != null) {
               ++bd_._f;
               if (bd_._f == 64) {
                  af_.a423();
               }
            } else if (mn_._b != -1) {
               if (fc_.a370(mn_._b)) {
                  bf_._f[mn_._b].c487(true);
               }
            } else if (ik_._e != null) {
               ik_._e.c487(true);

               while(ha_.b427()) {
                  ik_._e.f797();
               }
            }
         }

         if (null != wl_._a.e024(-24172) && ++ke_._e == 335) {
            wl_._a.b081((byte)-124);
            sl_._b = null;
            pa_._a = null;
            ri_._g = null;
         }
      }

      if (ik_._e != null && -1 != mn_._b) {
         ik_._e.a540(false, 251569954);
      }

      if (var2 != -69) {
         this.c813(true, (byte)-64);
      }

      pj_ var3;
      if (dc_._z == -2) {
         var3 = new pj_();
         var3._v = uk_.a651(0, new Random());

         int var4;
         for(var4 = 0; 49 > var4; ++var4) {
            if (0 == oi_.b080(0, 5) && var3._h[var4]._a == 0) {
               var3._h[var4] = new ai_(ji_.a760(37, false, 4));
            }
         }

         var4 = null != gm_._d ? gm_._d._N : 10000;
         var3._y = var4;
         var3._o = var4 / 10;
         var3._A[0] = new hb_(0, 25);
         var3._A[1] = new hb_(1, 27);
         var3._A[2] = new hb_(2, 18);
         var3._A[3] = new hb_(3, 19);
         var3.a540(false, 4);
         ik_._e = new go_(false, var3);
         boolean var5 = cm_._Q;
         gd_.a778(ve_.a491() ? 12 : 0, 0, -1, var5);
      }

      if (-3 == dc_._z) {
         var3 = new pj_();
         if (!ed_.c491(true) && -1 == gm_._d._q) {
            var3._v = new wm_(gm_._d._k);
            var3._h = gm_._d._L;
         } else {
            Random var6 = new Random();
            var3._v = uk_.a651(0, var6);
            var3._h = da_.a734(var3._v, (byte)71, var6);
            if (ed_.c491(true)) {
               gm_._d = new lb_();
               gm_._d._L = var3._h;
               gm_._d._k = var3._v;
            }
         }

         var3._o = 1000;
         var3._A[0] = new hb_(0, 1);
         var3._A[1] = new hb_(1, 3);
         var3._A[2] = new hb_(2, 4);
         var3._A[3] = new hb_(3, 2);
         var3.a540(false, 4);
         ha_.d150(1);
         ik_._e = new go_(false, var3);
         boolean var7 = cm_._Q;
         gd_.a778(ve_.a491() ? 12 : 0, 0, -1, var7);
      }

   }

   final void a150(int var1) {
      ib_.b410();
      mn_.a410();
      if (ef_._h) {
         if (kj_._n != 0 && (5 * kh_._m.length / 2 > kj_._n || 0 == la_._g) && ++kj_._n >= 5 * kh_._m.length) {
            kj_._n = 0;
         }

         if (0 != no_._d) {
            kj_._n = 1;
         }

         if (!ao_.a427()) {
            if (c_._h != gi_._R || di_._e) {
               i_._A.a238(c_._h, (byte)116, false);
               di_._e = false;
               gi_._R = c_._h;
            }
         } else if (!di_._e) {
            i_._A.a238(c_._h, (byte)61, true);
            di_._e = true;
         }
      }

      go_.b423((byte)14);
      if (cm_._R != null && cm_._R._g) {
         ib_.a150();
         hh_.a423();
      }

      this.a813(cm_._R != null, (byte)-74);
      if (ld_._i) {
         bo_.h150();
         ld_._i = false;
      }

      ++mo_._a;
      if (ao_.a427()) {
         this.g423((byte)2);
         if (ao_.a427()) {
            return;
         }
      }

      if (var1 >= -89) {
         this.c813(false, (byte)-112);
      }

      int var2;
      if (!ef_._h) {
         td_.a093(pj_._r, 121);
         if (this.h154(0)) {
            ef_._h = true;
         }
      } else if (!hc_.b154()) {
         nb_.a150();
      } else if (ib_.a427()) {
         up_.c423();
         if (fm_._e != fm_._a) {
            this.c813(false, (byte)-69);
         } else {
            var2 = mf_.b137(12210);
            if (var2 != 2) {
               if (var2 != 3) {
                  if (4 == var2) {
                     tl_._d = true;
                     ik_.a503(ve_._c, 0);
                  }
               } else {
                  tl_._d = false;
                  a_.a743(320, ne_._c._N, ne_._c, true, 8, 240, 2, 8, ne_._c._E + ne_._c._N, (cn_[])null, (cn_[])null);
                  if (cm_._R != null) {
                     i_._A.a238(cm_._R, (byte)86, false);
                  }
               }
            } else {
               ib_.a150();
            }

            this.c813(true, (byte)-69);
         }
      } else if (sl_.b154(15000)) {
         var2 = this.b880((byte)82, null != cm_._R);
         if (1 == var2 || 2 == var2) {
            if (null != cm_._R) {
               ib_.a150();
            }

            if (var2 == 2) {
               eg_.a812(m_.c372(true));
            }
         }

         this.c813(true, (byte)-69);
      } else if (ue_.b427()) {
         if (fm_._a != fm_._e) {
            this.c813(false, (byte)-69);
         } else {
            var2 = l_.d137(4570);
            if (1 == var2) {
               ik_.a503(bh_._Q, 0);
            }

            this.c813(true, (byte)-69);
         }
      } else {
         this.c813(false, (byte)-69);
      }

      if (!ed_.c491(true)) {
         while(true) {
            ak_ var7 = (ak_)ll_._i.b081((byte)-124);
            if (null == var7) {
               break;
            }

            vb_.a405(4, var7);
         }
      }

      while(true) {
         while(true) {
            while(true) {
               while(true) {
                  while(di_.a708(uo_._c, -1)) {
                     int var5;
                     int var6;
                     int var10;
                     if (54 != hc_._c) {
                        if (55 != hc_._c) {
                           int var14;
                           if (56 != hc_._c && 57 != hc_._c) {
                              if (58 == hc_._c) {
                                 hm_.a150();
                              } else if (61 != hc_._c) {
                                 if (hc_._c != 62) {
                                    if (72 == hc_._c) {
                                       if (nf_._A) {
                                          af_.a423();
                                          if (nf_._A) {
                                             nf_._A = false;
                                             ik_._e.a430(17158, false);
                                             gh_._f = true;
                                          }
                                       }

                                       kh_._s = false;
                                    } else if (!nf_._A || null == ik_._e || !ik_._e.j154(0)) {
                                       this.d487(true);
                                    }
                                 } else {
                                    af_.a423();
                                    pj_ var13 = new pj_(ra_._c, true);
                                    if (null != ik_._e && ik_._e._Y._f == var13._f) {
                                       ik_._e = new go_(true, var13, ik_._e);
                                    } else {
                                       ik_._e = new go_(true, var13);
                                    }

                                    gd_.a778(dc_._z, 0, -1, false);
                                    kh_._s = false;
                                    nf_._A = true;
                                 }
                              } else {
                                 String var12 = ra_._c.a738(-21030);
                                 var10 = ra_._c.k137(0);
                                 var14 = ra_._c.c474(true);
                                 var5 = ra_._c.h137(-111);
                                 boolean var17 = ra_._c.c474(true) == 1;
                                 if (2 == dc_._z) {
                                    ((bg_)bf_._f[2]).a545(var17, var14, 0, var5, var10, var12);
                                 }
                              }
                           } else {
                              var2 = ra_._c.f137(-123);
                              var10 = ra_._c.f137(-124);
                              var14 = ra_._c.c474(true);
                              di_[] var16 = new di_[var14];

                              for(var6 = 0; var14 > var6; ++var6) {
                                 var16[var6] = mm_.a282(ra_._c);
                              }

                              ja_.a418(var2, var10, (byte)22, hc_._c == 57, var16);
                           }
                        } else {
                           lb_ var9 = gm_._d;
                           gm_._d = new lb_(ra_._c, 19);
                           if (mn_._b == 4 || dc_._z == 4) {
                              jk_.j423((byte)59);
                           }

                           if (5 == mn_._b || 5 == dc_._z) {
                              u_.a041(var9);
                           }

                           if (2 == mn_._b || 2 == dc_._z) {
                              sh_.a041(27886, var9);
                           }

                           if (mn_._b == 3 || dc_._z == 3) {
                              hi_.b150(1);
                           }
                        }
                     } else {
                        int[] var8 = wa_.b878(-1);
                        int[] var3 = var8;
                        wj_ var4 = ra_._c;
                        var5 = var4.c474(true);

                        for(var6 = 0; var6 < var5; ++var6) {
                           var3[var6] = var4.h137(-48);
                        }

                        int[] var11;
                        if (wh_._d) {
                           var3 = var8;
                           var11 = gj_._c;

                           for(var5 = 0; 8 > var5; ++var5) {
                              var3[var5] = nb_.a080(var3[var5], ~var11[var5]);
                           }

                           for(var10 = 0; var10 < ce_._o.length; ++var10) {
                              if (vl_.a873(var10, -67, var8)) {
                                 wl_._a.a865(new a_(var10), false);
                              }
                           }
                        }

                        var3 = gj_._c;
                        var11 = var8;

                        for(var5 = 0; 8 > var5; ++var5) {
                           var3[var5] = mp_.a080(var3[var5], var11[var5]);
                        }

                        var3 = bp_._e;
                        var11 = var8;

                        for(var5 = 0; var5 < 8; ++var5) {
                           var3[var5] = mp_.a080(var3[var5], var11[var5]);
                        }

                        rf_._S = true;
                     }
                  }

                  op_.a093(0, 0);
                  if (dm_.c154(81)) {
                     var2 = this.f410((byte)101);
                     if (0 == var2 || var2 == 1) {
                        if (!ed_.c491(true)) {
                           gm_._d = null;
                        }

                        if (1 != var2) {
                           if (nf_._A) {
                              gh_._f = true;
                              gd_.a778(0, 0, 0, false);
                           }

                           kh_._s = false;
                        } else {
                           kh_._s = true;
                        }
                     }

                     boolean var15 = false;
                     if (2 == var2) {
                        var15 = true;
                     }

                     if (kh_._s) {
                        var15 = true;
                     }

                     if (!dm_.c154(71)) {
                        var15 = false;
                     }

                     if (var15) {
                        l_.a150(-1);
                     }
                  }

                  return;
               }
            }
         }
      }
   }

   final void a423(byte var1) {
      this.a356(false, 32, 8, 2, 17, 0, 5000, 1);
      tc_ var2 = new tc_();
      var2._A.c679((byte)7, 128, 9);
      var2._B.c679((byte)-120, 128, 9);
      af_.a224(true, var2, 22050, 22050, c_._h, 2048, i_._A);
      cm_.a494(1.6F, 0.92F, -7788, 0.1F, 25.0F);
      he_._p = 16711680;
      dc_._l = 128;
      ui_._b = 4473924;
      il_._a = 255;
      om_._a = 16777215;
      sm_._c = 16776960;
      j_.f423();
      kd_.b150(0);
      this.b813(true, (byte)-67);
      uo_._c[70] = 0;
      uo_._c[55] = 704;
      uo_._c[57] = -2;
      uo_._c[66] = 2;
      uo_._c[54] = -1;
      uo_._c[67] = 9;
      uo_._c[62] = -2;
      uo_._c[59] = 8;
      uo_._c[56] = -2;
      uo_._c[72] = 0;
      uo_._c[65] = -1;
      kj_._n = 0;
      uo_._c[58] = 0;
      uo_._c[61] = -1;
      uo_._c[68] = 3;
      uo_._c[63] = 10;
      if (var1 <= -15) {
         ll_._k = 2 <= nh_._k;
      }
   }

   public final void init() {
      this.a013(32, "dungeonassault", 0);
   }

   final void b487(boolean var1) {
      h423();
      a_.a150();
      md_.h150(-4);
      tc_.a423((byte)-86);
      rl_.a423();
      vj_.a150();
      nb_.a423();
      td_.a150();
      qe_.a797();
      te_.a797();
      gh_.a150();
      og_.a150();
      sb_.a423((byte)-88);
      fo_.a423();
      t_.a150();
      jh_.a797();
      in_.e150(-1);
      b_.b150();
      kg_.a487();
      tl_.a423();
      mh_.a150();
      nl_.a423();
      gf_.c797();
      nh_.a487(var1);
      se_.a797();
      ig_.a150();
      dm_.b150();
      ec_.i150();
      kd_.a423();
      sp_.a487();
      ml_.a423();
      ri_.a150();
      sn_.a150();
      ib_.d150();
      ta_.a150();
      to_.a150();
      kp_.b150();
      cg_.a423();
      la_.c423();
      op_.a423();
      mp_.a423();
      sl_.a150();
      gj_.a423();
      c_.a150();
      wk_.b487();
      ek_.a423();
      bn_.a423();
      go_.f150(10);
      lb_.a423();
      hi_.a150();
      ea_.a150();
      ke_.a150();
      n_.a150();
      hb_.a423((byte)3);
      ai_.a423();
      jc_.a150();
      ua_.a423();
      ne_.b150();
      qj_.a150();
      bc_.a150(24740);
      lc_.a487();
      ja_.a487(var1);
      lg_.a487(true);
      eh_.a150();
      sg_.a423();
      f_.a487(!var1);
      fp_.a150();
      pp_.e150();
      gd_.e150();
      nn_.b423((byte)-80);
      kl_.a150();
      rj_.b487();
      sa_.b487();
      ug_.e150();
      wa_.c150();
      lp_.a423();
      vm_.d797();
      hg_.d150();
      vn_.e797();
      cb_.a150();
      ae_.a423();
      ko_.d150();
      qk_.a423();
      uf_.b150();
      gm_.a150();
      pj_.e150(126);
      mo_.a150();
      ul_.a487();
      jg_.a423();
      hd_.b423();
      uj_.a150();
      cd_.a150(-1);
      vc_.a150();
      mi_.c150();
      fd_.a423();
      hl_.a150();
      rk_.a487(true);
      wj_.n150();
      qc_.a150();
      dd_.c423();
      en_.a150();
      d_.a150();
      p_.d487(!var1);
      ed_.f423();
      ih_.e150();
      bg_.b150(41);
      pd_.c423();
      le_.a150();
      di_.a423();
      db_.c423();
      wo_.a423();
      jm_.a423();
      ud_.a423();
      tk_.b423((byte)10);
      ob_.g150();
      fi_.a423((byte)-106);
      qp_.b423();
      qd_.a487();
      ji_.f423((byte)-98);
      jb_.p150();
      wi_.i423((byte)-97);
      jk_.n150();
      nk_.n150(2121792);
      rg_.h423();
      ia_.b487(!var1);
      dn_.f423();
      gk_.b487(var1);
      lh_.a150(-107);
      so_.a423((byte)95);
      df_.a150();
      fj_.a423();
      ff_.c150(-103);
      hj_.f150();
      lo_.a150();
      ll_.a423((byte)92);
      rd_.b487(true);
      s_.a150(-55);
      pa_.a150();
      ka_.a423();
      bk_.a487(var1);
      il_.a423();
      bb_.a423();
      cc_.b150();
      je_.a487();
      tm_.a150();
      uk_.a150();
      qa_.b150();
      ld_.a487();
      hc_.a150();
      nm_.n150();
      vd_.a423();
      hh_.b150();
      re_.c797();
      jp_.a797();
      sm_.a423((byte)-118);
      qh_.b423((byte)75);
      jj_.a423();
      rn_.b150();
      om_.a150();
      mn_.b423();
      jl_.a423();
      li_.a487();
      ok_.f150(-16218);
      tb_.b423();
      ql_.b423();
      ik_.a150(0);
      ra_.a423();
      un_.a423();
      ej_.a797();
      dc_.a423((byte)108);
      oe_.a150();
      kn_.a150();
      nj_.a423();
      oh_.a150();
      an_.c150(-13023);
      jn_.a150();
      im_.a150();
      l_.a423();
      lm_.d423();
      ck_.b487(!var1);
      da_.a150(6);
      sj_.g423();
      rf_.b487(var1);
      ii_.e423();
      dj_.a423((byte)113);
      am_.a150();
      nd_.b797();
      vb_.a423();
      nf_.e423();
      hk_.a150();
      gb_.a150();
      eg_.d150(-23658);
      hp_.a150();
      no_.a423();
      um_.a487();
      wl_.a150(98);
      fg_.d150(-102);
      kf_.b487();
      ag_.a150();
      ki_.a423((byte)-35);
      sf_.c423();
      lj_.d150();
      ro_.f423();
      oj_.a423((byte)-29);
      uo_.a150();
      gl_.c423();
      oc_.e150(4296);
      dl_.a150();
      tp_.h150(35);
      up_.a487();
      em_.c487(true);
      ln_.b150();
      co_.e150();
      ti_.a487();
      sh_.a487();
      vf_.d150();
      dg_.b487();
      uh_.i423();
      rm_.m150();
      hf_.m150();
      uc_.c487(false);
      gi_.f423();
      bh_.f423();
      ng_.f423();
      tn_.h423();
      rb_.a150(4935);
      ip_.c423();
      mf_.a150();
      cm_.j150();
      mk_.b487();
      wg_.a797();
      kk_.a150(0);
      of_.a423();
      ah_.a150();
      np_.c423();
      fk_.d150();
      j_.g423();
      eb_.f423((byte)86);
      ol_.a423();
      fe_.b423((byte)-34);
      ep_.a150();
      bp_.a150();
      oi_.h150();
      bj_.h150(31029);
      ad_.a150();
      qi_.a487();
      dh_.a150(20);
      wf_.d423((byte)-28);
      pb_.e423();
      ha_.c150();
      rc_.a423();
      rp_.b423();
      g_.g150();
      oo_.a150(13054);
      bi_.a797();
      ho_.a150();
      id_.a423();
      fa_.a150();
      wm_.a423();
      gg_.a150();
      hm_.d150();
      tf_.a150();
      k_.a487();
      fm_.a487(var1);
      cf_.a150(30);
      o_.d150();
      wh_.b150();
      na_.c150(-91);
      oa_.a423();
      mc_.c150();
      ic_.d150();
      dk_.a423();
      sd_.b487(false);
      al_.a423();
      fn_.d150(1);
      mj_.a150();
      bo_.c423();
      pm_.a150();
      bl_.d423();
      jd_.a150(1);
      h_.a423((byte)16);
      ac_.a150();
      af_.a150();
      vk_.b423();
      wd_.a150(115);
      fl_.a423();
      gn_.a150(194);
      ie_.d150();
      lf_.d150();
      pk_.e150();
      ce_.d423();
      bf_.a423((byte)85);
      me_.a150(36);
      ef_.a423();
      ao_.d150();
      ba_.a423();
      ch_.c150();
      sc_.b423((byte)-94);
      vl_.a423();
      e_.c423((byte)29);
      qf_.b150();
      jf_.a487(!var1);
      fc_.b150();
      bd_.b150(76);
      cp_.c423((byte)-66);
      u_.c423();
      lk_.h150();
      kc_.a150();
      pe_.a150(9);
      ak_.a150();
      ve_.a150(-125);
      r_.a150();
      i_.a423();
      kj_.a150();
      mm_.a150();
      ub_.a423();
      ue_.a423();
      pi_.a150(11877);
      tg_.a150(400);
      kh_.e423();
      vo_.e150(1);
      qm_.d487();
      ga_.d423();
      he_.d423();
      be_.e150();
      fb_.a150();
      ci_.a150(116);
      od_.b423();
      m_.d150(-1);
      ab_.b150(1781937827);
      super._p = null;
   }

   private final boolean h154(int var1) {
      he_.e150(var1 - 23487);
      if (tf_.a595(this, 1041792321)) {
         ai_.a150(var1 - 78);

         for(int var2 = var1; 14 > var2; ++var2) {
            if (var2 != 4) {
               if (var2 != 5) {
                  if (var2 != 2) {
                     if (3 == var2) {
                        bf_._f[var2] = new db_();
                     } else if (var2 != 13) {
                        if (var2 != 7) {
                           bf_._f[var2] = new qc_(var2);
                        } else {
                           bf_._f[var2] = new fi_();
                        }
                     } else {
                        bf_._f[var2] = new ud_();
                     }
                  } else {
                     bf_._f[var2] = new bg_();
                  }
               } else {
                  bf_._f[var2] = new ih_();
               }
            } else {
               bf_._f[var2] = new p_();
            }
         }

         mn_._b = 13;
         dc_._z = 13;
         bf_._f[13].b487(false);
         if (ed_.c491(true)) {
            gm_._d = null;
         }

         ag_.a093(50);
         nf_.d150(var1 + 0);
         i_._A.a238(c_._h, (byte)25, false);
         gi_._R = c_._h;
         ll_.a150();
         ll_._k = nh_._k >= 2;
         return true;
      } else {
         return false;
      }
   }

   final void c487(boolean var1) {
      wh_.a150();
      if (null != cm_._R) {
         ib_.a150();
      }

      kp_.a150(1);
      if (!var1) {
         _G = (String)null;
      }

   }

   final void b423(byte var1) {
      Canvas var2 = fi_.d602();
      if (!ao_.a427()) {
         if (!ef_._h) {
            g_.a035(var2, 18131);
         } else {
            if (var1 != 38) {
               this.c813(true, (byte)-98);
            }

            if (hc_.b154()) {
               ++li_._k;
               if (fm_._a != bn_._n) {
                  qp_.a016(mn_._b, true);
                  if (co_._G != null) {
                     co_._G.a540(true, bd_._f);
                     ++bd_._f;
                     if (bd_._f == 64) {
                        af_.a423();
                     }
                  }
               }

               int var3;
               if (ib_.a427()) {
                  gf_.g115(0, 0, gf_._i, gf_._c);
                  var3 = 15 + la_.a410();
                  int var4 = 30 + og_.b137();
                  fm_.a974(ea_.a202((byte)13), var3, var4);
                  ci_.a423();
               }

               if (sl_.b154(15000)) {
                  fl_.a813(cm_._R != null ? true : rj_._o);
               } else if (ue_.b427() && !ib_.a427()) {
                  gf_.g115(0, 0, gf_._i, gf_._c);
                  rc_.a150();
               }

               if (fm_._a != fm_._e) {
                  var3 = pk_._t * 256 / 16;
                  if (0 < var3) {
                     gf_.b669(0, 0, gf_._i, gf_._c, 0, var3);
                  }
               }

               a_ var10 = (a_)wl_._a.e024(-24172);
               if (var10 != null) {
                  if (null == sl_._b) {
                     ah_.a540(var10._j);
                  }

                  boolean var11 = false;
                  int var5;
                  if (40 <= ke_._e) {
                     if (80 <= ke_._e) {
                        if (230 > ke_._e) {
                           ec_._j[var10._j].a115(8, 0, 32, 32);
                        } else if (ke_._e < 270) {
                           var5 = (-ke_._e + 270 << 8) / 40;
                           var11 = true;
                           ri_._g.d050(8, 0, 32, 32, var5);
                        } else {
                           var11 = true;
                        }
                     } else {
                        var5 = (ke_._e - 40 << 8) / 40;
                        ri_._g.d050(8, 0, 32, 32, var5);
                     }
                  }

                  if ((1 & li_._k) == 0) {
                     if (var11) {
                        sl_._b.b797();
                     } else {
                        sl_._b.a601(pa_._a, 0, 0);
                     }
                  } else {
                     sl_._b.a797();
                  }

                  if (40 <= ke_._e) {
                     if (80 > ke_._e) {
                        var5 = (ke_._e - 40 << 8) / 40;
                        ne_._c.a068(ce_._o[var10._j], 48, 32 + ne_._c._H >> 1, 0, -1, var5 >> 1);
                     } else if (ke_._e >= 230) {
                        if (270 > ke_._e) {
                           var5 = (-ke_._e + 270 << 8) / 40;
                           ne_._c.a068(ce_._o[var10._j], 48, 32 + ne_._c._H >> 1, 0, -1, var5 >> 1);
                        }
                     } else {
                        ne_._c.a068(ce_._o[var10._j], 48, 32 + ne_._c._H >> 1, 0, -1, 128);
                     }
                  }
               }

               if (nh_._k >= 2 && ld_._b) {
                  ne_._c.b191(Integer.toString(bc_._a), 20, 20, 16777215, 1);
                  long var12 = Runtime.getRuntime().totalMemory();
                  long var6 = Runtime.getRuntime().freeMemory();
                  long var8 = var12 - var6;
                  ne_._c.b191((int)(var8 >> 10) + "kb", 4, ne_._c._H * 2 + 8, 16777215, -1);
                  ne_._c.b191(tc_._u, 20, 80, 16777215, 1);
               }

               cn_ var13 = kh_._m[kj_._n / 5];
               cn_ var14 = jg_._c[kj_._n / 5];
               if (-1 != hj_._S) {
                  int var15 = (int)((3.0 + Math.cos((double)((float)mo_._a / 20.0F))) * 64.0);
                  var14.b326(hj_._S, eh_._h, var15);
                  var13.h093(hj_._S, eh_._h);
               }

               ob_.a749(0, var1 - 161, var2, 0);
            } else {
               tp_.a132(10, 100.0F, kj_._m);
               g_.a035(var2, var1 + 18093);
            }
         }
      } else {
         mf_.a166(md_.f154(), var2);
      }
   }
}
