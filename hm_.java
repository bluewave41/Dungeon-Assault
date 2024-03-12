final class hm_ extends ne_ {
   static boolean[] _m = new boolean[]{false, true, true, true, true, true};
   static String _l = "Order your raider to engage the monster in combat. <br><br><col=2E5D17>Advancing</col> leaves your raider's skill levels unchanged.<br><br>Requires: <col=FF0000>Attack</col>, <col=0A7500>Defence</col>";
   boolean _r;
   int _o;
   static vn_ _n;
   int _p;
   static int _k = 0;
   int _i;
   static String _t = "to over <%0> great games";
   static String _j = "You have <%0> unread messages!";
   static cn_ _q;
   static int _s = 0;

   static final void a668(int var0, int var1, boolean var2, int var3) {
      if (var0 != 2) {
         if (var0 != 4) {
            if (var0 != 9) {
               if (var0 != 17) {
                  if (var0 != 5) {
                     if (var0 != 6) {
                        if (var0 != 15) {
                           if (7 == var0) {
                              md_.a093(0);
                              gd_.a778(dc_._z, 0, 7, var2);
                           } else if (var0 != 10) {
                              if (3 != var0) {
                                 if (13 != var0 && 14 != var0) {
                                    if (8 != var0) {
                                       if (11 != var0) {
                                          if (16 == var0) {
                                             if (10 != mn_._b) {
                                                if (mn_._b == 8) {
                                                   ik_.a503(bh_._Q, mn_._b);
                                                }
                                             } else {
                                                ik_.a503((String)null, 9);
                                             }
                                          } else if (var0 != 18) {
                                             if (19 == var0) {
                                                if (kd_._e.length - 1 > mo_._e) {
                                                   md_.a093(1 + mo_._e);
                                                }
                                             } else if (var0 != 12) {
                                                if (20 == var0) {
                                                   if (ed_.c491(true)) {
                                                      bf_._f[dc_._z]._b = new pk_(ub_._k.toUpperCase(), ub_._r, uo_._e.toUpperCase(), hj_._X, 0);
                                                   } else {
                                                      gd_.a778(ve_.a491() ? 12 : 0, 0, -3, false);
                                                   }
                                                } else if (var0 != 21) {
                                                   if (var0 != 22) {
                                                      if (23 == var0) {
                                                         mh_.b150(-1);
                                                      } else if (28 == var0) {
                                                         gl_._Lb = !gl_._Lb;
                                                         if (null != ik_._e) {
                                                            ik_._e.a423((byte)113);
                                                         }
                                                      }
                                                   } else if (ak_._o[0] <= gm_._d._m) {
                                                      ka_.a150();
                                                   }
                                                } else {
                                                   gd_.a778(dc_._z, 0, 13, false);
                                                }
                                             } else {
                                                eg_.a812(m_.c372(true));
                                             }
                                          } else if (0 < mo_._e) {
                                             md_.a093(mo_._e - 1);
                                          }
                                       } else if (null != ik_._e) {
                                          af_.a423();
                                          if (ik_._e != null) {
                                             ik_._e.a430(17158, var2);
                                             gh_._f = true;
                                          }
                                       }
                                    } else if (null != cm_._R) {
                                       ib_.a150();
                                    } else {
                                       tl_._d = false;
                                       a_.a743(320, ne_._c._N, ne_._c, var2, 8, 240, 2, 8, ne_._c._E + ne_._c._N, (cn_[])null, (cn_[])null);
                                       if (null != cm_._R) {
                                          i_._A.a238(cm_._R, (byte)101, false);
                                       }
                                    }
                                 }
                              } else {
                                 gd_.a778(dc_._z, 0, 2, var2);
                              }
                           } else {
                              int var4 = g_._Hb;
                              gd_.a778(dc_._z, 0, var4, var2);
                           }
                        } else {
                           gd_.a778(dc_._z, 0, 8, var2);
                        }
                     } else {
                        gd_.a778(dc_._z, 0, 5, var2);
                     }
                  } else {
                     gd_.a778(dc_._z, 0, 4, var2);
                  }
               } else {
                  gd_.a778(dc_._z, 0, 12, var2);
                  wa_._a = true;
               }
            } else {
               gd_.a778(dc_._z, 0, 0, var2);
            }
         } else {
            gd_.a778(dc_._z, 0, 3, var2);
         }
      } else {
         gd_.a778(!ve_.a491() ? 0 : 12, 0, -1, var2);
      }

      if (var3 > -18) {
         _l = (String)null;
      }

   }

   public static void d150() {
      _m = null;
      _n = null;
      _j = null;
      _l = null;
      _q = null;
      _t = null;
   }

   static final void a150() {
      if (fb_._d != null) {
         for(int var0 = 0; var0 < fb_._d.length; ++var0) {
            fb_._d[var0] = null;
         }
      }

      bj_._G = true;
   }

   hm_(int var1, boolean var2) {
      this._r = var2;
      this._i = var1;
   }

   static final int a800(boolean var0, byte var1) {
      for(bl_._c += 65536; mh_.a170(bl_._c, am_._d) >= 65536; bl_._c -= am_._d) {
         ++jc_._e;
      }

      int var2 = -1;
      if (null == of_._q) {
         if (en_._b != null) {
            var2 = en_._b.length;
         }
      } else {
         var2 = of_._q.length;
      }

      if (var1 != -20) {
         return -25;
      } else {
         if (-1 != var2) {
            if (am_._c > wf_._x) {
               ++wf_._x;
               if (wf_._x <= am_._g || of_._q != null && null != of_._q[me_._f]) {
                  if (wf_._x >= am_._c && null == of_._q[(me_._f + 1) % var2]) {
                     --wf_._x;
                  }
               } else {
                  --wf_._x;
               }
            }

            if (wf_._x >= am_._c) {
               ai_._n = me_._f;
               wf_._x -= am_._c;
               if (!oo_._a) {
                  --me_._f;
                  if (0 > me_._f) {
                     me_._f += var2;
                  }
               } else {
                  ++me_._f;
                  if (me_._f >= var2) {
                     me_._f -= var2;
                  }
               }
            }

            if (am_._g < wf_._x) {
               oo_._a = true;
            }
         }

         if (ql_._c != null) {
            int var3 = 357 - ql_._c._G / 2;
            boolean var4 = false;
            if (0 != no_._d && _k > var3 && _k < var3 + ql_._c._v) {
               if (-ql_._c._y + 269 < lc_._c && lc_._c < 269) {
                  wf_._x = am_._c;
                  oo_._a = false;
                  var4 = true;
               }

               if (586 < lc_._c && ql_._c._y + 586 > lc_._c) {
                  oo_._a = true;
                  wf_._x = am_._c;
                  var4 = true;
               }
            }

            if (!var4 && wf_._x > am_._g && eh_._h > var3 && ql_._c._v + var3 > eh_._h) {
               if (hj_._S > 269 - ql_._c._y && 269 > hj_._S) {
                  wf_._x = am_._g;
               }

               if (586 < hj_._S && hj_._S < 586 + ql_._c._y) {
                  wf_._x = am_._g;
               }
            }
         }

         if (var0) {
            o_._i.a326(var1 ^ 7718, f_.a313(lc_._c, _k, var1 ^ -19), f_.a313(hj_._S, eh_._h, 1));
            if (o_._i.c154(50)) {
               if (o_._i._b == 0) {
                  return 3;
               }

               if (o_._i._b == 1) {
                  return 2;
               }
            }

            while(ha_.b427()) {
               o_._i.a366(0, (byte)-107);
               if (o_._i.c154(-76)) {
                  if (o_._i._b == 0) {
                     return 3;
                  }

                  if (o_._i._b == 1) {
                     return 1;
                  }
               }

               if (13 == mm_._t) {
                  return 1;
               }
            }
         }

         return 0;
      }
   }

   static final void a531(sa_ var0, int var1) {
      rj_ var2 = wi_._ob;
      if (var2 != null && var2._n != null) {
         uj_.a872(var2._n);
      }

      if (m_._e != null && gn_._h == 20 && var0 != null) {
         m_._e.a185(var1 + 21, var0);
      }

      if (null == m_._e) {
         gn_._h = 0;
         m_._e = rb_._O;
      } else {
         if (rb_._O != m_._e) {
            m_._e = null;
            un_._e = null;
         }

         ++gn_._h;
      }

      if (var1 != -21) {
         _m = (boolean[])null;
      }

      rb_._O = null;
   }
}
