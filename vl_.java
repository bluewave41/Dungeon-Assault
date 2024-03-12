final class vl_ extends hl_ {
   private String _n;
   private String _o;
   static int _m = -1;
   static String _l = "This target is much less powerful than you, and is <%0>% more likely to wake.<br>(Renown gambled: <%1>)";

   final void a330(ec_ var1, byte var2) {
      if (var2 < -5) {
         var1.a984(2, this._o);
         var1.a627(this._n, (byte)101);
      }
   }

   static final String c738(int var0) {
      if (ql_._f == ol_._i) {
         return ho_._i;
      } else if (ql_._f != wd_._d) {
         if (var0 != -29455) {
            a366(32, (byte)15);
         }

         return !im_._b.b154(36) ? bf_._o : co_._C;
      } else {
         return bf_._o;
      }
   }

   public static void a423() {
      _l = null;
   }

   static final q_[] d461() {
      q_[] var0 = new q_[dk_._d];

      for(int var1 = 0; dk_._d > var1; ++var1) {
         var0[var1] = new q_(ce_._x, tb_._i, hg_._t[var1], fe_._g[var1], jc_._f[var1], jn_._k[var1], ub_._q[var1], uo_._b);
      }

      sb_.a150();
      return var0;
   }

   final fd_ b743(int var1) {
      return pe_._j;
   }

   static final void a366(int var0, byte var1) {
      if (!ed_.c491(true)) {
         if (var0 <= gm_._d._K) {
            return;
         }

         gm_._d._K = var0;
         ac_._B.d556((byte)-78, 72);
         ac_._B.a093(6, gm_._d._K);
      }

      if (var1 != -49) {
         a873(105, 115, (int[])null);
      }

   }

   static final boolean a873(int var0, int var1, int[] var2) {
      if (var1 > -58) {
         _l = (String)null;
      }

      return 0 != (var2[var0 >> 5] & 1 << (var0 & 31));
   }

   vl_(String var1, String var2) {
      this._o = var1;
      this._n = var2;
   }
}
