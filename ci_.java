import java.applet.Applet;

final class ci_ extends ne_ {
   int _k;
   int _r;
   static int[] _s = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
   static int[] _n;
   static int _j;
   static Applet _q;
   ci_ _o;
   int _l;
   static int _m;
   int _p;
   int _i;

   static final va_ a846(String var0, int var1) {
      if (!ll_._r.b671(var0, "", (byte)-82)) {
         if (!ia_._W.b671(var0, "", (byte)-82)) {
            if (var1 != -10396) {
               a846((String)null, 40);
            }

            return null;
         } else {
            return ha_._k.a848(var0, "", var1 + '멠');
         }
      } else {
         return ha_._k.a251(var0, (byte)126, "");
      }
   }

   static final void a423() {
      int var0 = jm_._c;
      int var1 = 0;
      if (kh_._t == 2) {
         long var2 = -kg_._d + kd_.c138(-2456);
         var1 = (int)((-var2 + 10999L) / 1000L);
         if (0 > var1) {
            var1 = 0;
         }
      }

      for(int var9 = 0; var9 < go_._A.length; ++var9) {
         int var3 = to_._c[var9];
         int var4;
         if (0 <= var3) {
            if (d_._g._b != var3) {
               var4 = sm_._c;
            } else {
               var4 = he_._p;
            }
         } else {
            var4 = om_._a;
         }

         String var5 = go_._A[var9];
         int var6;
         int var7;
         if (2 == kh_._t && var1 == 1) {
            var6 = sn_._a.length >= mo_._g.length ? sn_._a.length : mo_._g.length;
            var7 = fd_._b.length > cp_._Q.length ? fd_._b.length : cp_._Q.length;
            if (6 <= var9 && 6 + var6 > var9) {
               var5 = -var6 + sn_._a.length + (var9 - 6) >= 0 ? sn_._a[-var6 + var9 - 6 + sn_._a.length] : "";
            }

            if (var9 >= var6 + 7 && var7 + var6 + 7 > var9) {
               var5 = var9 - 7 - var6 < cp_._Q.length ? cp_._Q[-var6 + (var9 - 7)] : "";
            }
         }

         if (var3 == -2) {
            var5 = Integer.toString(var1);
         }

         var6 = og_.a571(var3 >= 0, var5, -30633);
         var7 = -(var6 >> 1) + vo_._r;
         if (0 <= var3) {
            qk_ var8 = d_._g._b != var3 ? gd_._G : om_._d;
            var0 += _j;
            if (null != var8) {
               var8.a050(var0, (h_._q << 1) + mj_._g, (oh_._t << 1) + var6, 112, var7 - oh_._t);
            }

            var0 += h_._q;
         }

         if (var3 >= 0) {
            i_._x.b191(var5, var7, i_._n + var0, var4, -1);
            var0 += _j + h_._q + mj_._g;
         } else {
            n_._c.b191(var5, var7, li_._g + var0, var4, -1);
            var0 += ag_._a;
         }
      }

   }

   static final long a438(CharSequence var0, int var1) {
      long var2 = 0L;
      int var4 = var0.length();
      int var5 = 0;
      if (var1 != 2) {
         a150(-61);
      }

      while(var4 > var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if ('A' <= var6 && var6 <= 'Z') {
            var2 += (long)(var6 + 1 - 65);
         } else if (var6 >= 'a' && 'z' >= var6) {
            var2 += (long)(1 + var6 - 97);
         } else if ('0' <= var6 && '9' >= var6) {
            var2 += (long)(var6 - 21);
         }

         if (177917621779460413L <= var2) {
            break;
         }

         ++var5;
      }

      while(var2 % 37L == 0L && 0L != var2) {
         var2 /= 37L;
      }

      return var2;
   }

   public static void a150(int var0) {
      _n = null;
      _s = null;
      _q = null;
      if (var0 <= 5) {
         _j = -10;
      }

   }

   ci_(int var1, int var2, int var3, int var4, int var5) {
      this._k = var2;
      this._r = var1;
      this._l = var3;
      this._p = var5;
      this._i = var4;
   }
}
