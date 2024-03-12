final class b_ extends RuntimeException {
   static String _b = "Unable to connect to the data server. Please check any firewall you are using.";
   static char[] _a = new char[128];
   String _c;
   Throwable _d;

   static final void a525(int var0, int var1, boolean var2, qh_ var3) {
      int var4 = ue_.a080((-var0 + var1) * 3);
      int var5 = 3 * var0;
      int var6 = var4 - 10;
      ea_.c150(0);
      if (0 < var3._w && var3._y != null) {
         uf_.c150();
      }

      ab_._c = 0;

      int var7;
      int var8;
      int var9;
      label72:
      for(var7 = 0; var3._h > var7; ++var7) {
         var8 = var3._A[var7];
         var9 = var3._x[var7];
         short var10 = var3._N[var7];
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if (var2) {
            var11 = nj_._g[var8];
            var12 = ra_._b[var8];
            var13 = -var11 + nj_._g[var9];
            var14 = nj_._g[var10] - var11;
            var15 = -var12 + ra_._b[var9];
            var16 = -var12 + ra_._b[var10];
            if (0 <= -(var14 * var15) + var16 * var13) {
               continue;
            }
         }

         var11 = ko_._v[var8];
         if (var11 != Integer.MIN_VALUE) {
            var12 = ko_._v[var9];
            if (Integer.MIN_VALUE != var12) {
               var13 = ko_._v[var10];
               if (Integer.MIN_VALUE != var13) {
                  var14 = -var5 + var13 + var12 + var11;
                  var15 = -(var6 < 0 ? var14 << -var6 : var14 >> var6) + (gg_._a.length - 1);

                  for(var16 = gg_._a[var15]; 0 != var16 >> 4; var16 = gg_._a[var15]) {
                     --var15;
                     if (var15 < 0) {
                        System.err.println("Out of range!");
                        continue label72;
                     }
                  }

                  int var17 = var16 + (var15 << 4);
                  hf_._yb[var17] = var7;
                  gg_._a[var15] = 1 + var16;
                  if (var3._w > 0 && null != var3._y) {
                     int var10002 = hk_._b[var3._y[var7]]++;
                  }

                  ++ab_._c;
               }
            }
         }
      }

      if (var3._w > 0 && var3._y != null) {
         var7 = 0;

         for(var8 = 0; hk_._b.length > var8; ++var8) {
            var9 = hk_._b[var8];
            hk_._b[var8] = var7;
            var7 += var9;
         }
      }

   }

   static final long a138() {
      return -qm_._o + kd_.c138(-2456);
   }

   public static void b150() {
      _a = null;
      _b = null;
   }

   static final void a895(hl_ var0, boolean var1, int var2, boolean var3) {
      n_._f[0] = bl_._i.nextInt();
      n_._f[1] = bl_._i.nextInt();
      ta_._c._o = 0;
      n_._f[2] = (int)(o_._j >> 32);
      n_._f[3] = (int)o_._j;
      ta_._c.a556((byte)63, n_._f[0]);
      ta_._c.a556((byte)63, n_._f[1]);
      ta_._c.a556((byte)63, n_._f[2]);
      ta_._c.a556((byte)63, n_._f[3]);
      mf_.a897(-30463, ta_._c);
      ta_._c.i093(var2, -112);
      var0.a330(ta_._c, (byte)-79);
      ac_._B._o = 0;
      if (var3) {
         ac_._B.a093(6, 18);
      } else {
         ac_._B.a093(6, 16);
      }

      wj_ var10000 = ac_._B;
      var10000._o += 2;
      int var4 = ac_._B._o;
      ac_._B.a556((byte)63, la_._c);
      ac_._B.a054(58, dn_._Q);
      int var5 = 0;
      if (ld_._g) {
         var5 |= 1;
      }

      if (fa_._j) {
         var5 |= 4;
      }

      if (var1) {
         var5 |= 8;
      }

      if (pd_._E != null) {
         var5 |= 16;
      }

      ac_._B.a093(6, var5);
      String var6 = oj_.a326(m_.c372(true));
      if (null == var6) {
         var6 = "";
      }

      ac_._B.b627(var6, (byte)-20);
      if (null != pd_._E) {
         ac_._B.a984(2, pd_._E);
      }

      of_.a673(ac_._B, kd_._d, om_._c, ta_._c);
      ac_._B.b093(-var4 + ac_._B._o, 1);
      op_.a093(0, -1);
   }

   static final String a772(String var0, int var1) {
      if (var1 != -1) {
         _b = (String)null;
      }

      return "<col=FF0000>" + var0 + "</col>";
   }

   b_(Throwable var1, String var2) {
      this._d = var1;
      this._c = var2;
   }
}
