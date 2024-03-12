import java.util.Random;

class ll_ extends ne_ {
   static boolean _k;
   static md_ _i = new md_();
   static String[] _j = new String[]{null, "Another option is to <%flee>. If the raider survives at least one combat round, they may be able to escape the room (if they win a <%dodge> roll against the room's <%snare>), allowing you to send a different raider in to face it, or to seek a different route entirely.<br><br><%command>Select one of these strategies now.</col>"};
   static nh_ _r;
   static String _s = "Magical Guardian";
   ll_ _n;
   static String[] _m;
   static vk_ _p;
   static String _u = "Crusher";
   ll_ _l;
   long _o;
   static cn_ _q;
   static String[] _t = new String[]{"Ferocity", "The <%0> is able to channel his fury into a violent flurry of blows; during the first round of each combat, his <%attack> is doubled."};

   static final void a078(int var0, byte[] var1, int var2, int[] var3) {
      for(int var4 = 0; gg_._a.length > var4; ++var4) {
         var0 = gg_._a[var4];

         int var10004;
         for(int var5 = var4 << 4; var0-- != 0; hf_._yb[var10004] = var2) {
            var2 = hf_._yb[var5++];
            byte var10002 = var1[var2];
            var10004 = var3[var1[var2]];
            var3[var10002] = var3[var1[var2]] + 1;
         }
      }

   }

   static final void a150() {
      rf_._K = new fm_(ck_._H);
      le_._b = new gn_[25][];
      le_._b[0] = lc_.a603(new String[][]{bh_._J, nf_._C});
      le_._b[1] = lc_.a603(new String[][]{rl_._e, co_._J});
      le_._b[2] = lc_.a603(new String[][]{p_._J, je_._f, og_._a, h_._y});
      le_._b[3] = lc_.a603(new String[][]{pp_._E, np_._C});
      le_._b[4] = lc_.a603(new String[][]{eg_._b, lp_._q, lb_._d, le_._c});
      le_._b[5] = lc_.a603(new String[][]{bn_._m, lp_._q, ka_._d});
      le_._b[6] = lc_.a603(new String[][]{rl_._i, lb_._d, le_._c});
      le_._b[7] = lc_.a603(new String[][]{tp_._C, lp_._F, nl_._f, _j});
      le_._b[8] = lc_.a603(new String[][]{bb_._t, ka_._d});
      le_._b[9] = lc_.a603(new String[][]{eh_._e, bk_._f});
      le_._b[10] = lc_.a603(new String[][]{hj_._O});
      le_._b[11] = lc_.a603(new String[][]{ek_._j});
      le_._b[12] = lc_.a603(new String[][]{rm_._S});
      le_._b[13] = lc_.a603(new String[][]{wl_._c});
      le_._b[14] = lc_.a603(new String[][]{ha_._j});
      le_._b[15] = lc_.a603(new String[][]{qa_._e});
      le_._b[16] = lc_.a603(new String[][]{tl_._m});
      le_._b[17] = lc_.a603(new String[][]{ug_._M});
      le_._b[18] = lc_.a603(new String[][]{qh_._E, dg_._O});
      le_._b[19] = lc_.a603(new String[][]{tg_._e, uo_._g});
      le_._b[20] = lc_.a603(new String[][]{hh_._n, fj_._a, k_._a});
      le_._b[21] = lc_.a603(new String[][]{rn_._g});
      le_._b[22] = lc_.a603(new String[][]{kg_._e});
      le_._b[23] = lc_.a603(new String[][]{vf_._A, qd_._e, rk_._k, un_._b});
      le_._b[24] = lc_.a603(new String[][]{tp_._A});
      if (kd_._c > 25) {
         kd_._c = 0;
      }

      uo_._f = le_._b[kd_._c];
      if (fc_._d > uo_._f.length) {
         fc_._d = 0;
      }

      og_.a188(false, 0, uo_._f[fc_._d]);
   }

   final void b423(byte var1) {
      if (this._l != null) {
         this._l._n = this._n;
         if (var1 != -2) {
            _t = (String[])null;
         }

         this._n._l = this._l;
         this._l = null;
         this._n = null;
      }
   }

   public static void a423(byte var0) {
      _i = null;
      _t = null;
      _p = null;
      _r = null;
      _j = null;
      if (var0 != 92) {
         a997((String)null, (byte)100);
      }

      _u = null;
      _q = null;
      _s = null;
      _m = null;
   }

   static final void a050(int var0, int var1, int var2, int var3, int var4) {
      gf_.b115(var1, var4, var2 + 1, 10000536);
      gf_.b115(var1, var3 + var4, 1 + var2, 12105912);
      int var5 = 1;
      int var6 = var3;
      if (var0 != 2) {
         _s = (String)null;
      }

      if (gf_._f > var5 + var4) {
         var5 = -var4 + gf_._f;
      }

      if (var3 + var4 > gf_._e) {
         var6 = -var4 + gf_._e;
      }

      for(int var7 = var5; var6 > var7; ++var7) {
         int var8 = 152 + var7 * 48 / var3;
         int var9 = var8 | var8 << 8 | var8 << 16;
         gf_._b[var1 + (var4 + var7) * gf_._i] = var9;
         gf_._b[(var7 + var4) * gf_._i + var1 + var2] = var9;
      }

   }

   static final boolean a045(Random var0, int[] var1, int[] var2) {
      int var3 = uj_.a004(var0, 37, var2.length);
      return mo_.a244(var1, var2[var3], var0);
   }

   static final bo_ a997(String var0, byte var1) {
      if (fk_._v != null && null != var0 && var0.length() != 0) {
         String var2 = jm_.a715((byte)59, var0);
         if (var2 != null) {
            for(bo_ var3 = (bo_)fk_._v.a312((byte)125, (long)var2.hashCode()); var3 != null; var3 = (bo_)fk_._v.c786((byte)5)) {
               String var4 = jm_.a715((byte)59, var3._Hb);
               if (var4.equals(var2)) {
                  return var3;
               }
            }

            if (var1 != -47) {
               a423((byte)52);
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   protected ll_() {
   }
}
