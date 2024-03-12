final class ae_ {
   private int _k;
   static String[] _a;
   static String _h = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
   private int _d;
   int _i;
   int _b = 0;
   private int _j;
   private boolean _f = false;
   private int _g;
   static String _c = "Dwarf Renegade";
   static String _e = "HEAL";

   final void d150(int var1) {
      this._d = 0;
      this._k = 0;
      if (0 == this._g && mm_._t == 98) {
         if (0 >= this._b) {
            this._b = this._i;
         }

         --this._b;
         this._f = false;
      }

      if (this._g == 0) {
         this._d = mm_._t;
      }

      if (var1 == this._g && 99 == mm_._t) {
         ++this._b;
         if (this._b >= this._i) {
            this._b = 0;
         }

         this._f = false;
      }

   }

   final boolean b154(int var1) {
      if (var1 != -1) {
         this._k = -104;
      }

      return this._d == 102;
   }

   public static void a423() {
      _h = null;
      _e = null;
      _c = null;
      _a = null;
   }

   static final void a093(int var0, int var1) {
      to_._g = sj_._cb[var0];
      if (var1 == -5) {
         ec_._r = lc_._k[var0];
         ki_._c = qh_._R[var0];
      }
   }

   final void a366(int var1, byte var2) {
      this._d = 0;
      this._k = 0;
      if (this._g == 0 && 96 == mm_._t) {
         if (this._b <= 0) {
            this._b = this._i;
         }

         this._f = false;
         --this._b;
      }

      if (0 == this._g) {
         this._d = mm_._t;
      }

      if (0 == this._g && mm_._t == 97) {
         ++this._b;
         if (this._i <= this._b) {
            this._b = 0;
         }

         this._f = false;
      }

      if (var2 == -107) {
         if (0 == this._g && (98 == mm_._t || 99 == mm_._t)) {
            if (0 > this._b) {
               this._b = var1;
            }

            this._f = false;
         }

      }
   }

   final boolean b427(byte var1) {
      return this._g != 0;
   }

   final boolean c427(byte var1) {
      return this._d == 97;
   }

   final boolean a154(int var1) {
      if (var1 != 0) {
         this.d150(43);
      }

      return this._d == 96;
   }

   final void a691(boolean var1, boolean var2, int var3, int var4) {
      this._f = var2;
      this._g = 0;
      if (this._f) {
         this._b = var4;
      } else {
         this._b = var3;
      }

      if (var1) {
         this.c427((byte)33);
      }

   }

   final boolean a491(boolean var1) {
      if (var1) {
         a093(53, 54);
      }

      return 103 == this._d;
   }

   final void b093(int var1, int var2) {
      if (var2 != 3) {
         _e = (String)null;
      }

      if (0 == this._g) {
         this._b = var1;
         this._f = false;
      }

   }

   static final void a183(boolean var0, int var1, int var2) {
      nk_._Hb = true;
      kh_._t = var1;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (kh_._t == 0) {
         var3 = og_.a451(n_._c, qj_._e, wa_._l, ql_._k);
         var4 = var3 + 3;
         go_._A = new String[var4];
         to_._c = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            to_._c[var5] = -1;
         }

         n_._g = new int[2];

         for(var5 = 0; var3 > var5; ++var5) {
            go_._A[var5] = qj_._e[var5];
         }

         go_._A[var4 - 3] = "";
         go_._A[var4 - 2] = mn_._a;
         to_._c[var4 - 2] = 0;
         n_._g[0] = 4;
         go_._A[var4 - 1] = sp_._b;
         to_._c[var4 - 1] = 1;
         n_._g[1] = 5;
      } else if (1 != kh_._t) {
         if (2 == kh_._t) {
            var3 = og_.a451(n_._c, qj_._e, wa_._l, jk_.a841(new String[]{"<br><%0><br>"}, ef_._b, var2 ^ -30497));
            var4 = -1;

            for(var5 = 0; var3 > var5; ++var5) {
               if ("<%0>".equals(qj_._e[var5])) {
                  var4 = var5;
                  break;
               }
            }

            if (var4 == -1) {
               throw new IllegalStateException();
            }

            sn_._a = new String[var4];
            cj_.a030(qj_._e, 0, sn_._a, 0, var4);
            cp_._Q = new String[-var4 + var3 - 1];
            cj_.a030(qj_._e, var4 + 1, cp_._Q, 0, var3 - var4 - 1);
            var4 = -1;
            var3 = og_.a451(n_._c, qj_._e, wa_._l, jk_.a841(new String[]{"<br><%0><br>"}, bn_._i, var2 ^ -30497));

            for(var5 = 0; var5 < var3; ++var5) {
               if ("<%0>".equals(qj_._e[var5])) {
                  var4 = var5;
                  break;
               }
            }

            if (var4 == -1) {
               throw new IllegalStateException();
            }

            mo_._g = new String[var4];
            cj_.a030(qj_._e, 0, mo_._g, 0, var4);
            fd_._b = new String[-1 - var4 + var3];
            cj_.a030(qj_._e, var4 + 1, fd_._b, 0, var3 - 1 - var4);
            var5 = sn_._a.length >= mo_._g.length ? sn_._a.length : mo_._g.length;
            var6 = cp_._Q.length >= fd_._b.length ? cp_._Q.length : fd_._b.length;
            var7 = var6 + 7 + var5;
            go_._A = new String[var7];
            to_._c = new int[var7];

            for(var8 = 0; var7 > var8; ++var8) {
               to_._c[var8] = -1;
            }

            to_._c[1] = 0;
            go_._A[0] = mj_._b;
            n_._g = new int[2];
            go_._A[1] = lg_._l;
            go_._A[5] = "";
            n_._g[0] = 5;
            go_._A[2] = ef_._c;
            to_._c[3] = 1;
            go_._A[3] = jg_._d;
            n_._g[1] = 2;
            go_._A[4] = qp_._e;

            for(var8 = 0; var8 < var5; ++var8) {
               go_._A[var8 + 6] = 0 > mo_._g.length + (var8 - var5) ? "" : mo_._g[mo_._g.length + var8 - var5];
            }

            go_._A[6 + var5] = null;
            to_._c[6 + var5] = -2;

            for(var8 = 0; var6 > var8; ++var8) {
               go_._A[7 - (-var5 - var8)] = fd_._b.length > var8 ? fd_._b[var8] : "";
            }

            kg_._d = kd_.c138(-2456);
         } else if (kh_._t == 3) {
            if (!i_._A._j) {
               var3 = og_.a451(n_._c, qj_._e, wa_._l, oh_._a);
            } else {
               var3 = og_.a451(n_._c, qj_._e, wa_._l, fg_._g);
            }

            var4 = 2 + var3;
            go_._A = new String[var4];
            to_._c = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               to_._c[var5] = -1;
            }

            n_._g = new int[1];

            for(var5 = 0; var3 > var5; ++var5) {
               go_._A[var5] = qj_._e[var5];
            }

            go_._A[var4 - 2] = "";
            go_._A[var4 - 1] = sp_._b;
            to_._c[var4 - 1] = 0;
            n_._g[0] = 5;
         } else if (kh_._t == 4) {
            var3 = og_.a451(n_._c, qj_._e, wa_._l, jg_._b);
            var4 = var3 + 2;
            to_._c = new int[var4];
            go_._A = new String[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               to_._c[var5] = -1;
            }

            n_._g = new int[1];

            for(var5 = 0; var5 < var3; ++var5) {
               go_._A[var5] = qj_._e[var5];
            }

            go_._A[var4 - 2] = "";
            go_._A[var4 - 1] = sp_._b;
            to_._c[var4 - 1] = 0;
            n_._g[0] = 5;
         } else {
            if (5 != kh_._t) {
               throw new IllegalArgumentException();
            }

            var3 = og_.a451(n_._c, qj_._e, wa_._l, id_._g);
            var4 = 3 + var3;
            to_._c = new int[var4];
            go_._A = new String[var4];

            for(var5 = 0; var4 > var5; ++var5) {
               to_._c[var5] = -1;
            }

            n_._g = new int[2];

            for(var5 = 0; var3 > var5; ++var5) {
               go_._A[var5] = qj_._e[var5];
            }

            go_._A[var4 - 3] = "";
            go_._A[var4 - 2] = fc_._j;
            to_._c[var4 - 2] = 0;
            n_._g[0] = 3;
            go_._A[var4 - 1] = sp_._b;
            to_._c[var4 - 1] = 1;
            n_._g[1] = 5;
         }
      } else {
         var3 = og_.a451(n_._c, qj_._e, wa_._l, ql_._k);
         var4 = var3 + 2;
         to_._c = new int[var4];
         go_._A = new String[var4];

         for(var5 = 0; var4 > var5; ++var5) {
            to_._c[var5] = -1;
         }

         n_._g = new int[1];

         for(var5 = 0; var5 < var3; ++var5) {
            go_._A[var5] = qj_._e[var5];
         }

         go_._A[var4 - 2] = "";
         go_._A[var4 - 1] = sp_._b;
         to_._c[var4 - 1] = 0;
         n_._g[0] = 5;
      }

      d_._g._i = n_._g.length;
      var3 = 0;
      var4 = 0;
      if (var2 != -1) {
         _e = (String)null;
      }

      for(; var4 < go_._A.length; ++var4) {
         var5 = og_.a571(to_._c[var4] >= 0, go_._A[var4], var2 ^ 30632);
         if (var5 > var3) {
            var3 = var5;
         }
      }

      if (kh_._t == 2) {
         String[] var10 = sn_._a;

         String var9;
         for(var5 = 0; var10.length > var5; ++var5) {
            var9 = var10[var5];
            var7 = og_.a571(false, var9, var2 - 30632);
            if (var7 > var3) {
               var3 = var7;
            }
         }

         var10 = cp_._Q;

         for(var5 = 0; var5 < var10.length; ++var5) {
            var9 = var10[var5];
            var7 = og_.a571(false, var9, -30633);
            if (var3 < var7) {
               var3 = var7;
            }
         }
      }

      d_._e = vo_._r - (-var3 + (var3 >> 1));
      jn_._d = (ci_._j + h_._q << 1) * d_._g._i;
      bf_._b = -(var3 >> 1) + vo_._r;

      for(var4 = 0; go_._A.length > var4; ++var4) {
         jn_._d += to_._c[var4] >= 0 ? mj_._g : ag_._a;
      }

      jm_._c = -(jn_._d >> 1) + bl_._p;
      dg_._L = new int[go_._A.length][];
      var4 = 0;

      for(var5 = jm_._c; go_._A.length > var4; ++var4) {
         var6 = to_._c[var4];
         if (0 > var6) {
            var5 += ag_._a;
         } else {
            var7 = og_.a571(true, go_._A[var4], var2 ^ 30632);
            var8 = -(var7 >> 1) + vo_._r;
            var5 += ci_._j;
            dg_._L[var4] = new int[4];
            dg_._L[var4][0] = -oh_._t + var8;
            dg_._L[var4][1] = var5;
            dg_._L[var4][2] = var7 + (oh_._t << 1);
            var5 += mj_._g + (h_._q << 1) + ci_._j;
            dg_._L[var4][3] = (h_._q << 1) + mj_._g;
         }
      }

      if (kh_._t != 2) {
         d_._g.a691(false, var0, 0, ab_.a313(-776726687, hj_._S, eh_._h));
      } else {
         d_._g.a691(false, var0, -1, -1);
      }

   }

   final void e150(int var1) {
      this._d = 0;
      if (var1 < 88) {
         this._g = -80;
      }

      this._k = 0;
      if (this._g == 0) {
         this._d = mm_._t;
      }

   }

   final void a326(int var1, int var2, int var3) {
      if (var3 < this._i) {
         if (var1 != -7734) {
            this._f = true;
         }

         if (this._i <= var2) {
            throw new IllegalArgumentException();
         } else {
            this._d = 0;
            this._k = 0;
            if (0 != no_._d) {
               this._g = no_._d;
               this._f = true;
               this._b = var2;
               this._k = no_._d;
               this._j = e_._e;
            }

            if (this._g != 0 && la_._g != 0) {
               if (0 >= this._j) {
                  this._j = r_._c;
               }

               --this._j;
            }

            if (no_._d == 0 && la_._g == 0) {
               this._g = 0;
            }

            if (this._g == 0 && (this._f || cp_._U)) {
               if (var3 >= 0) {
                  if (this._b != var3) {
                  }

                  this._f = true;
                  this._b = var3;
               } else if (this._f) {
                  this._b = -1;
               }
            }

         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   final boolean c154(int var1) {
      return this._k != 0 || 84 == this._d || 83 == this._d;
   }

   ae_(int var1) {
      this._i = var1;
   }
}
