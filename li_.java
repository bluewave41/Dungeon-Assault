final class li_ {
   static md_ _a = new md_();
   static cn_[] _l;
   static int _j;
   static int _k;
   static String[] _b = new String[6];
   static int _h = 3;
   static String _d = "Try not to get snared in this spider's webs; the gigantic tarantula is always alert; it likes nothing more than the sweet meat of a raider or two.";
   static String _c = "Select two rooms to spy out";
   static int _g;
   static String _e = "Risk of waking dragon: ";
   static String _i = "More suggestions";
   static String[] _f = new String[]{"Scout", "A creature born to the labyrinth, the enhanced senses of the <%0> can sometimes be used to determine what lies beyond the next door. (Single use)"};

   static final void c150(int var0) {
      ta_._a.b340(1, new ia_());
      if (var0 != 316) {
         _j = 24;
      }

   }

   static final void a150() {
      np_.a812((byte)-123, m_.c372(true));
   }

   public static void a487() {
      _e = null;
      _b = null;
      _d = null;
      _i = null;
      _f = null;
      _a = null;
      _c = null;
      _l = null;
   }

   static final cn_[] a298(int var0, int var1, nh_ var2, int var3) {
      if (!kk_.a283(var2, var3 - 3, var0, var1)) {
         return null;
      } else {
         return var3 != 4 ? (cn_[])null : ib_.b033();
      }
   }

   static final void b150() {
      jh_.c797();
      if (null == wm_._c) {
         bn_._f = new cn_(256, 256);
         wm_._c = new cn_(316, 316);
         wm_._c._w = -16;
         wm_._c._A = -16;
      }

      bn_._f.e797();
      gf_.a797();
      int var0 = 0;

      for(int var1 = 0; var1 < 7; ++var1) {
         for(int var2 = 0; var2 < 7; ++var2) {
            if (null != qj_._c[var0]) {
               gf_.b050(var2 * 36 + 4, 4 + 36 * var1, 32, 32, 16777215);
            }

            ++var0;
         }
      }

      wm_._c.e797();
      gf_.a797();
      bn_._f.e326(16, 16, 8454143);
      gf_.d669(8, 8, 0, 0, wm_._c._y, wm_._c._v);
      bn_._f.e326(16, 16, 0);
      gf_.d669(4, 4, 0, 0, wm_._c._y, wm_._c._v);
      jh_.b797();
   }
}
