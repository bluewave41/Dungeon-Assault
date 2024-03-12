final class fm_ {
   static int _e = 0;
   static md_ _b;
   private fm_ _c;
   static int[] _h;
   static gb_ _f;
   static String _l = "May avoid combat.";
   static String _j;
   static String _d = "The orc warrior's weapon and armour may be battered from his years of war, he remains a competent if unspectacular fighter.";
   static int _a;
   static int _g;
   static int _i;
   private k_ _k;

   static final cn_ b251(int var0, int var1) {
      if (0 != var1) {
         if (1 != var1) {
            if (var0 != -29092) {
               return (cn_)null;
            } else if (2 == var1) {
               return qd_._d;
            } else if (3 == var1) {
               return hl_._h;
            } else if (var1 == 4) {
               return lj_._o;
            } else if (5 != var1) {
               if (6 == var1) {
                  return ia_._R;
               } else if (7 == var1) {
                  return sp_._a;
               } else if (8 == var1) {
                  return ub_._j;
               } else if (9 == var1) {
                  return cg_._b;
               } else if (10 == var1) {
                  return kf_._k;
               } else if (11 != var1) {
                  if (12 != var1) {
                     if (13 == var1) {
                        return ef_._e;
                     } else if (var1 != 14) {
                        if (var1 == 15) {
                           return na_._A;
                        } else if (var1 == 16) {
                           return le_._d;
                        } else if (17 == var1) {
                           return gd_._A;
                        } else if (18 == var1) {
                           return df_._e;
                        } else if (19 != var1) {
                           if (var1 != 20) {
                              if (var1 == 21) {
                                 return up_._b;
                              } else if (var1 == 22) {
                                 return ll_._q;
                              } else if (23 == var1) {
                                 return jc_._c;
                              } else if (24 == var1) {
                                 return ef_._e;
                              } else if (25 == var1) {
                                 return DungeonAssault._I;
                              } else if (var1 != 27) {
                                 if (var1 != 28) {
                                    if (var1 != 31) {
                                       if (33 == var1) {
                                          return oo_._c;
                                       } else if (var1 != 34) {
                                          return 21 == var1 ? up_._b : tn_._I;
                                       } else {
                                          return fp_._b;
                                       }
                                    } else {
                                       return ld_._d;
                                    }
                                 } else {
                                    return fn_._o;
                                 }
                              } else {
                                 return ld_._d;
                              }
                           } else {
                              return m_._c;
                           }
                        } else {
                           return bj_._F;
                        }
                     } else {
                        return ie_._i;
                     }
                  } else {
                     return g_._Ib;
                  }
               } else {
                  return jl_._c;
               }
            } else {
               return in_._D;
            }
         } else {
            return tn_._I;
         }
      } else {
         return null;
      }
   }

   static final void a974(int[][] var0, int var1, int var2) {
      int var4;
      if (null == uc_._E || var2 * var1 != uc_._E._c.length) {
         int[] var3 = new int[64];

         for(var4 = 0; var4 < 64; ++var4) {
            var3[var4] = mp_.a080(65793 * (var4 + 24), Integer.MIN_VALUE);
         }

         cn_ var24 = te_.a983(var1, var2, var3, 16, 8, 0.125);
         uc_._E = new ph_(var24, te_.b285(var1, var2, 0.125));
      }

      int var23 = -(var1 / 2) + 320;
      var4 = -(var2 / 2) + 240;
      uc_._E.b093(var23, var4);
      gf_.b050(var23, var4, var1, var2, 6637335);
      qe_.b370(var23, var4, var1, var2, 8421504, 128, 128);
      int var5 = be_._o._d / 2;
      int var6 = bk_._e._b / 2;
      un_.a770(var23, var1, var4 - var6);
      un_.a770(var23, var1, -var6 + var4 + var2);
      vf_.a483(var2, true, var23 - var5, var4);
      vf_.a483(var2, true, var23 - (var5 - var1), var4);
      byte var7 = 37;
      byte var8 = 20;
      int var9 = -var8 + var23;
      int var10 = -var7 + var4;
      int var11 = -oe_._m._d + var8 + var1 + var23;
      oe_._m.h093(var9, var10);
      int var12 = var4 - var7;
      oe_._m.j093(var11, var12);
      jn_._n.b150(486513968);
      byte var13 = 14;
      byte var14 = 37;
      int var15 = jn_._n._j >> 16;
      int var16 = jn_._n._t >> 16;
      jn_._n._v.a093(var9 + var14 - var16, var13 + var10 - var15);
      int var17 = var11 + oe_._m._d;
      var17 -= jn_._n._v._h;
      var17 -= var14;
      var17 += var16;
      jn_._n._v.b093(var17, -var15 + var13 + var12);
      if (var0 != null) {
         for(int var18 = 0; var0.length > var18; ++var18) {
            if (var0[var18] != null) {
               int var19 = var0[var18][0];
               int var20 = var0[var18][1];
               int var21 = var0[var18][2];
               var21 -= 4;
               var20 += 2;
               int var22 = var0[var18][3];
               var19 += 2;
               var22 -= 4;
               gf_.e115(var19, var20, var21 + var19, var20 + var22);
               en_.a775(var19, var21, 4 + var22, var20);
               gf_.b797();
               rp_.a857(4, var21, (byte)108, var19, var22, kc_._S, var20);
            }
         }
      }

      qe_ var10000 = bf_._f[mn_._b];
      qe_.e797();
   }

   static final boolean a599(ec_ var0) {
      int var1 = var0.c474(true);
      boolean var2 = 1 == var1;
      return var2;
   }

   static final boolean a427() {
      return null != na_._D && na_._D.i149(32) != null;
   }

   static final int a552(int var0, int var1, byte[] var2) {
      int var3 = -1;

      for(int var4 = var1; var0 > var4; ++var4) {
         var3 = var3 >>> 8 ^ ih_._J[255 & (var3 ^ var2[var4])];
      }

      var3 = ~var3;
      return var3;
   }

   public static void a487(boolean var0) {
      _f = null;
      _l = null;
      _d = null;
      _b = null;
      _h = null;
      if (!var0) {
         _j = null;
      }
   }

   final String a772(String var1, int var2) {
      k_ var3 = this._k;
      if (var2 > -45) {
         b251(104, -22);
      }

      while(var3 != null) {
         if (var1.equals(var3._g)) {
            return var3._i;
         }

         var3 = var3._d;
      }

      if (null == this._c) {
         return null;
      } else {
         return this._c.a772(var1, -96);
      }
   }

   final void a018(String var1, int var2, String var3) {
      for(k_ var4 = this._k; null != var4; var4 = var4._d) {
         if (var3.equals(var4._g)) {
            var4._i = var1;
            return;
         }
      }

      this._k = new k_(var3, var1, this._k);
   }

   final String a803(String var1, byte var2) {
      if (null == var1) {
         return null;
      } else {
         StringBuilder var3 = new StringBuilder(var1.length());
         if (var2 != -48) {
            b251(-93, -72);
         }

         String var4 = "<%";
         String var5 = ">";
         int var6 = 0;

         int var8;
         for(int var7 = var1.length(); var6 < var7; var6 = var8 + 1) {
            var8 = var1.indexOf(var4, var6);
            if (0 > var8) {
               var3.append(var1.substring(var6, var7));
               break;
            }

            var3.append(var1.substring(var6, var8));
            var6 = var8;
            var8 = var1.indexOf(var5, var8 + 2);
            if (var8 < 0) {
               var3.append(var1.substring(var6, var7));
               break;
            }

            String var9 = var1.substring(2 + var6, var8);
            String var10 = this.a772(var9, var2 ^ 91);
            if (var10 != null) {
               var3.append(var10);
            }
         }

         return var3.toString();
      }
   }

   static final void a093(int var0) {
      ba_.a787((rj_)null, (byte)59, var0);
   }

   public fm_() {
   }

   fm_(fm_ var1) {
      this._c = var1;
   }

   static {
      _a = _e;
      _h = new int[8192];
      _j = "Passwords must be between 5 and 20 characters long";
      _i = 10080;
   }
}
