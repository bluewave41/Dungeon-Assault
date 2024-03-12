final class bo_ extends ok_ {
   static eh_ _Lb;
   String _Nb;
   static String _Mb = "Zealot";
   String _Hb;
   static cn_ _Kb;
   static wm_ _Jb;
   int _Ib;
   static String[] _Gb = new String[]{"Harden Raider", "The <%0> imbues another raider with the resilience of oak, doubling their <%defence> in the next room. (Single use)"};

   static final void a286(int var0, gn_ var1, int var2, int var3) {
      if (var1 != null) {
         int var4 = var2;
         if (null != var1._b) {
            ne_._c.a385(var1._b, var3 + 3, var2, 194, 0, 0, -1, 1, 0, ne_._c._H);
            var4 = var2 + var1._g;
            var4 += 7;
            gf_.b115(var3, var4, 200, 0);
            var4 += 5;
         }

         String[] var5 = jn_.a782(var1._f, new int[]{194}, -65, la_._b);
         var4 += var0 + la_._b._H;
         String[] var6 = var5;

         for(int var7 = 0; var7 < var6.length; ++var7) {
            String var8 = var6[var7];
            la_._b.b191(var8, var3 + 3, var4, 0, -1);
            var4 += la_._b._H;
         }

      }
   }

   bo_() {
      super(0L, (ok_)null);
   }

   static final void h150() {
      if (ec_._k != null) {
         ec_.a302(ec_._k, false);
         ec_._k = null;
         nf_.d150(0);
      }

      id_._i = mk_.a923(3, (byte)34);
      mi_._e = mk_.a923(4, (byte)34);
      hj_._Z = bg_.a707(true, 9, false);
      np_._A = mk_.a923(10, (byte)34);
      kf_._p = bg_.a707(true, 11, false);
      sb_._a = bg_.a707(true, 12, false);
      ia_._W = mk_.a923(13, (byte)34);
      ll_._r = mk_.a923(14, (byte)34);
      tl_._k = mk_.a923(15, (byte)34);
      bl_._t = mk_.a923(16, (byte)34);
      be_._s = new wk_(75);
      be_._s.a971(sa_._w, "basic", qk_._c, uc_._I, -108);
      be_._s.a971(sa_._w, "lobby", qk_._c, uc_._I, -110);
      be_._s.a971(sa_._w, "lobby", qk_._c, gh_._c, -83);
      be_._s.a539(qk_._c, 237, sa_._w, hj_._Z);
      be_._s.a539(qk_._c, 237, sa_._w, sb_._a);
      be_._s.a539(uc_._L, 237, nb_._b, kf_._p);
      be_._s.a971(mp_._c, "roman20", rf_._L, uc_._I, -109);
      be_._s.a971(mp_._c, "roman20", rf_._L, gh_._c, -101);
      be_._s.a971(mp_._c, "roman12", rf_._L, uc_._I, -93);
      be_._s.a971(mp_._c, "roman12", rf_._L, gh_._c, -128);
      be_._s.a539(rf_._L, 237, mp_._c, np_._A);
      be_._s.a539(wo_._h, 237, rl_._k, ia_._W);
      be_._s.a539(wo_._h, 237, rl_._k, ll_._r);
      be_._s.a539(id_._f, 237, dg_._P, tl_._k);
      be_._s.a539(id_._f, 237, dg_._P, bl_._t);
      be_._s.a539(fg_._m, 237, kj_._m, id_._i);
      be_._s.a539(fg_._m, 237, kj_._m, mi_._e);
   }

   public static void c423() {
      _Lb = null;
      _Mb = null;
      _Kb = null;
      _Gb = null;
      _Jb = null;
   }

   static final void g150() {
      mc_.a934(8, gb_._e);
      if (!ve_.a491()) {
         mc_.a934(1, in_._B);
      }

   }
}
