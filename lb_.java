final class lb_ {
   int _w;
   static cn_ _C;
   int _i;
   int _K;
   static cn_ _o;
   static String _O = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
   static cn_ _v;
   int _r;
   int _u;
   private long[] _c;
   private int[] _n;
   int[] _J;
   ai_[] _L;
   int _l;
   private int[] _M;
   wm_ _k;
   static String _E = "Previous";
   boolean _H;
   int _b;
   int _g;
   int _e;
   int _q;
   int _h;
   int _B;
   int _N;
   int[] _F;
   private int[] _G;
   long[] _t;
   int _m;
   int _p;
   static String[] _d = new String[]{null, "When a raider enters a room containing a monster, it will fight to the death. As the raider and monster exchange blows, the <%attack> of one is compared to the <%defence> of the other to see if the strike breaks through the other's guard."};
   static String _x = "Regenerate when raider leaves.";
   int _D;
   int _A;
   int _I;
   private long[] _j;
   hb_[] _a;
   int _f;
   int _y;
   int _z;
   int _s;

   static final void a487() {
      for(int var0 = 0; 8 > var0; ++var0) {
         hb_ var1 = um_._i[var0];
         if (var1 != null) {
            var1._i = qe_.a814(var1, 0);
         }
      }

   }

   private final void a994(ec_ var1, int var2, int var3) {
      int var4 = var1.c474(true);
      this._H = (var4 & 1) != 0;
      if (var3 >= 19) {
         this._N = var1.h137(-46);
      } else {
         this._N = var1.f137(-121);
      }

      if (var3 >= 1) {
         if (var3 < 19) {
            this._l = var1.f137(-128);
            this._s = var1.f137(-98);
            if (var3 >= 5) {
               this._m = var1.f137(-114);
            } else {
               this._m = this._N;
            }
         } else {
            this._l = var1.h137(var2 ^ 13077);
            this._s = var1.h137(-107);
            this._m = var1.h137(-35);
         }

         this._b = -this._N + this._l;
      } else {
         var1.f137(-127);
         this._s = var1.f137(-106);
         this._m = this._N;
         this._l = this._N;
         this._b = 0;
      }

      if (var3 < 6) {
         this._q = -1;
      } else {
         var1.h137(-78);
         this._q = var1.h137(var2 + 13099);
      }

      if (var3 < 8) {
         this._K = 0;
      } else {
         this._K = var1.c474(true);
      }

      this._B = var1.f137(-122);
      this._h = var1.f137(-119);
      this._D = var1.k137(0);
      this._y = var1.f137(var2 + 13077);
      this._r = var1.f137(-121);
      this._I = var1.k137(0);
      if (2 <= var3) {
         this._w = rm_.a616(var1, 6065);
      } else {
         this._w = ek_._c;
      }

      if (4 <= var3) {
         var1.c474(true);
      }

      int var5;
      for(var5 = 0; var5 < this._k._f.length; ++var5) {
         this._k._f[var5] = var1.h137(md_.b080(var2, 13096));
      }

      this._L = new ai_[49];
      this._L[24] = new ai_(2);
      this._L[0] = this._L[6] = this._L[42] = this._L[48] = new ai_(3);

      for(var5 = 0; 49 > var5; ++var5) {
         if (0 != var5 && var5 != 6 && var5 != 24 && var5 != 42 && 48 != var5) {
            this._L[var5] = gk_.a775(var1);
         }
      }

      this._a = new hb_[8];

      for(var5 = 0; 8 > var5; ++var5) {
         this._a[var5] = ai_.a494(var1, var5, -12, var3);
      }

      this._F = new int[6];
      this._e = 0;
      if (var2 == -13182) {
         this._J = new int[6];
         if (13 <= var3) {
            for(var5 = 0; var5 < 6; ++var5) {
               this._J[var5] = var1.k137(0);
            }

            for(var5 = 0; var5 < 6; ++var5) {
               int var6 = var1.c474(true);
               this._F[var5] = var6;
               this._e += var6;
            }

            this._f = var1.k137(var2 + 13182);
            this._A = var1.h137(-75);
            this._z = var1.c474(true);
         } else {
            for(var5 = 0; 6 > var5; ++var5) {
               this._J[var5] = 0;
            }

            for(var5 = 0; var5 < 6; ++var5) {
               this._F[var5] = 0;
            }

            this._f = 0;
            this._z = 0;
            this._A = -1;
         }

         for(var5 = 0; 10 > var5; ++var5) {
            this._c[var5] = var1.c411((byte)56);
            if (var3 < 10) {
               this._G[var5] = 0;
            } else {
               this._G[var5] = var1.e410((byte)114);
            }
         }

         for(var5 = 0; var5 < 10; ++var5) {
            this._t[var5] = var1.c411((byte)113);
            if (10 <= var3) {
               this._n[var5] = var1.e410((byte)-87);
            } else {
               this._n[var5] = 0;
            }
         }

         for(var5 = 0; 10 > var5; ++var5) {
            if (0L == this._c[var5]) {
               this._c[var5] = -1L;
               this._G[var5] = 0;
            }

            if (0L == this._t[var5]) {
               this._t[var5] = -1L;
               this._n[var5] = 0;
            }
         }

         if (var3 >= 14) {
            for(var5 = 0; var5 < 10; ++var5) {
               this._j[var5] = var1.c411((byte)63);
               if (var3 < 15) {
                  this._M[var5] = -1;
               } else {
                  this._M[var5] = var1.h137(-74);
               }
            }
         } else {
            for(var5 = 0; 10 > var5; ++var5) {
               this._j[var5] = -1L;
               this._M[var5] = -1;
            }
         }

         if (var3 >= 18) {
            this._u = var1.c474(true);
            var1.k137(0);
            this._g = var1.h137(-125);
            this._i = var1.h137(-76);
            this._p = var1.h137(var2 ^ 13114);
         }

      }
   }

   public static void a423() {
      _E = null;
      _C = null;
      _O = null;
      _x = null;
      _o = null;
      _d = null;
      _v = null;
   }

   static final void a583(se_ var0, se_ var1, int var2, int var3) {
      wa_._l = var2;
      i_._x = var0;
      n_._c = var1;
      wm_.a679(gf_._i / 2, gf_._c / var3);
      mi_.a050(var0._N, var0._E + var0._N, var1._N, var1._N + var1._E);
   }

   lb_(ec_ var1, int var2) {
      this();
      this.a994(var1, -13182, var2);
   }

   static final char a328(char var0) {
      return var0 != 181 && 402 != var0 ? Character.toTitleCase(var0) : var0;
   }

   lb_() {
      this._n = new int[10];
      this._M = new int[10];
      this._G = new int[10];
      this._p = -1;
      this._t = new long[10];
      this._c = new long[10];
      this._j = new long[10];
      this._w = ek_._c;
      this._b = 0;
      this._m = 2500;
      this._q = -1;
      this._l = 2500;
      this._s = 2500;
      this._N = 2500;
      this._k = new wm_(84);
      this._a = new hb_[8];
      this._L = new ai_[49];

      int var1;
      for(var1 = 0; var1 < 49; ++var1) {
         if (24 == var1) {
            this._L[var1] = new ai_(2);
         } else if (0 != var1 && 6 != var1 && var1 != 42 && var1 != 48) {
            this._L[var1] = new ai_(0);
         } else {
            this._L[var1] = new ai_(3);
         }
      }

      this._J = new int[6];
      this._F = new int[6];
      this._A = -1;

      for(var1 = 0; var1 < 10; ++var1) {
         long[] var2 = this._c;
         this._t[var1] = -1L;
         var2[var1] = -1L;
      }

      for(var1 = 0; 10 > var1; ++var1) {
         this._j[var1] = -1L;
         this._M[var1] = -1;
      }

      this._u = 0;
   }
}
