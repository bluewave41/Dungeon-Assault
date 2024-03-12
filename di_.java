final class di_ {
   String _g;
   int _h;
   int _a;
   String _c;
   String _i;
   static boolean _e = true;
   int _f;
   int _j;
   static String _k = "This password contains repeated characters, and would be easy to guess";
   int _b;
   static int _d;
   static cn_[] _l;

   static final boolean a708(int[] var0, int var1) {
      if (pd_._A != qa_._c) {
         return false;
      } else {
         if (var1 != -1) {
            a708((int[])null, -88);
         }

         long var2 = kd_.c138(-2456);
         if (pm_._p != 0 && 0 > pp_._J) {
            ao_ var4 = (ao_)nl_._e.e024(-24172);
            if (null != var4 && var2 > var4._l) {
               var4.a487(false);
               nj_._b = var4._m.length;
               ra_._c._o = 0;

               for(int var8 = 0; var8 < nj_._b; ++var8) {
                  ra_._c._m[var8] = var4._m[var8];
               }

               wl_._f = oc_._E;
               oc_._E = rd_._C;
               rd_._C = hc_._c;
               hc_._c = var4._j;
               return true;
            }
         }

         while(true) {
            if (0 > pp_._J) {
               ra_._c._o = 0;
               if (!oi_.a097(-12929, 1)) {
                  return false;
               }

               pp_._J = ra_._c.m137(255);
               ra_._c._o = 0;
               nj_._b = var0[pp_._J];
            }

            if (!kh_.d427()) {
               return false;
            }

            if (pm_._p == 0) {
               wl_._f = oc_._E;
               oc_._E = rd_._C;
               rd_._C = hc_._c;
               hc_._c = pp_._J;
               pp_._J = -1;
               return true;
            }

            int var7 = pm_._p;
            if (qi_._a != 0.0) {
               var7 = (int)((double)var7 + bl_._i.nextGaussian() * qi_._a);
               if (var7 < 0) {
                  var7 = 0;
               }
            }

            ao_ var5 = new ao_((long)var7 + var2, pp_._J, new byte[nj_._b]);

            for(int var6 = 0; nj_._b > var6; ++var6) {
               var5._m[var6] = ra_._c._m[var6];
            }

            nl_._e.a865(var5, false);
            pp_._J = -1;
         }
      }
   }

   final void a603(ec_ var1, int var2) {
      this._i = var1.a738(-21030);
      if (var2 != -1) {
         this.a603((ec_)null, -21);
      }

      this._g = var1.a738(-21030);
      this._c = var1.a738(-21030);
      var1.a738(var2 ^ 21029);
      this._j = rm_.a616(var1, 6065);
      rm_.a616(var1, 6065);
      rm_.a616(var1, var2 + 6066);
      this._a = var1.f137(var2 - 101);
      this._f = var1.f137(var2 ^ 125);
      this._h = var1.f137(-117);
   }

   public static void a423() {
      _l = null;
      _k = null;
   }
}
