final class ui_ {
   static int _b;
   static int _a;

   static final String a661(int var0, int var1) {
      if (var1 != 19435) {
         a661(65, -11);
      }

      String var2 = ll_._m[var0];
      if (var0 == 10 && (g_._Hb == 0 || 0 == dc_._z || g_._Hb == 12 || 12 == dc_._z || 1 == g_._Hb || dc_._z == 1)) {
         var2 = ll_._m[9];
      }

      if (28 == var0) {
         String var3 = gl_._Lb ? go_._V : ql_._g;
         var2 = uf_._b + var3;
      }

      return var2;
   }

   static final void a150(int var0) {
      if (var0 == 30592) {
         wj_ var1 = ra_._c;
         int var2 = var1.c474(true);
         int var3;
         if (var2 == 0) {
            var3 = var1.k137(var0 - 30592);

            al_ var4;
            for(var4 = (al_)hg_._n.e024(-24172); null != var4 && var3 != var4._k; var4 = (al_)hg_._n.a024(var0 ^ 30596)) {
            }

            if (null == var4) {
               tl_.a150(-68);
               return;
            }

            int var5 = var1.c474(true);
            if (0 != var5) {
               int var6 = var4._l;
               lg_._x[0]._d = null;
               lg_._x[0]._e = false;
               lg_._x[0]._a = tc_._u;
               int var7 = var4._p;

               for(int var8 = 1; var5 > var8; ++var8) {
                  lg_._x[var8]._a = var1.d738(-122);
                  lg_._x[var8]._e = false;
                  if (var1.c474(true) == 1) {
                     lg_._x[var8]._d = var1.d738(-125);
                  } else {
                     lg_._x[var8]._d = null;
                  }
               }

               String[][] var27 = new String[3][var6];
               String[][] var9 = new String[3][var6];
               long[][] var10 = new long[3][var6];
               int[][] var11 = new int[3][var7 * var6];
               int var12 = 0;
               int var13 = 0;
               int var14 = 0;
               int var15 = 0;
               int var16 = 0;
               int var17 = 0;
               int var18 = var1.c474(true);
               if (var18 > 0) {
                  for(int var19 = 0; var18 > var19; ++var19) {
                     int var20 = var1.c474(true);
                     String var21 = lg_._x[var20]._a;
                     long var22 = var1.c411((byte)89);
                     int var24 = var1._o;
                     int var25;
                     if (var19 < var6) {
                        var27[0][var12] = var21;
                        var9[0][var12] = lg_._x[var20]._d;
                        var10[0][var12] = var22;
                        ++var12;

                        for(var25 = 0; var7 > var25; ++var25) {
                           var11[0][var15++] = var1.h137(-99);
                        }
                     }

                     if (null != var21 && eh_.a213(var21)) {
                        var27[1][var13] = tc_._u;
                        var9[1][var13] = null;
                        var10[1][var13] = var22;
                        var1._o = var24;
                        ++var13;

                        for(var25 = 0; var7 > var25; ++var25) {
                           var11[1][var16++] = var1.h137(-37);
                        }
                     }

                     if (var14 < var6 && !lg_._x[var20]._e) {
                        lg_._x[var20]._e = true;
                        var27[2][var14] = var21;
                        var9[2][var14] = lg_._x[var20]._d;
                        var10[2][var14] = var22;
                        var1._o = var24;
                        ++var14;

                        for(var25 = 0; var25 < var7; ++var25) {
                           var11[2][var17++] = var1.h137(md_.b080(var0, -30643));
                        }
                     }
                  }
               }
            }

            var4.a487(false);
         } else if (var2 != 1) {
            sm_.a741((Throwable)null, 1, "HS1: " + sj_.l738(192));
            tl_.a150(-33);
         } else {
            var3 = var1.k137(var0 - 30592);
            var1.c411((byte)68);

            fn_ var26;
            for(var26 = (fn_)cb_._a.e024(-24172); var26 != null && var3 != var26._r; var26 = (fn_)cb_._a.a024(4)) {
            }

            if (null == var26) {
               tl_.a150(-96);
               return;
            }

            var26.a487(false);
         }

      }
   }
}
