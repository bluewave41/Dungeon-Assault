final class od_ {
   static String _c = "<col=FF8000><%0></col> of your raiders were caught and eaten.";
   static String _a = "This is the active raider.";
   static String[] _b = new String[]{"<%0> the Warrior", "<%0> the Veteran", "<%0> the Elder", "<%0> the Venerated", "<%0> the Ancient", "<%0> the Immortal"};

   static final boolean a427() {
      if (null == gk_._L && null == jn_._l && no_._d != 0) {
         if (pd_.c603(hm_._k, lc_._c)) {
            og_.a188(false, 0, uo_._f[fc_._d]);
            return true;
         } else {
            return false;
         }
      } else {
         if (la_._g != 0 && ii_._G != -1) {
            int var0 = -ii_._G + hj_._S;
            int var1 = eh_._h - a_._i;
            hh_._p += var0;
            ed_._P += var1;
            if (hh_._p < 0) {
               hh_._p = 0;
            }

            if (640 < hh_._p) {
               hh_._p = 640;
            }

            if (ed_._P < 0) {
               ed_._P = 0;
            }

            ii_._G = hj_._S;
            if (480 < ed_._P) {
               ed_._P = 480;
            }

            a_._i = eh_._h;
         } else {
            ii_._G = -1;
            a_._i = -1;
         }

         if (pd_.c603(eh_._h, hj_._S)) {
            if (no_._d != 0 && -1 == ii_._G) {
               ii_._G = lc_._c;
               a_._i = hm_._k;
            }

            eg_.a537(pp_._K);
            if (ec_._n == hh_._s) {
               if (++fc_._d >= uo_._f.length) {
                  fc_._d = 0;
               }

               og_.a188(false, 0, uo_._f[fc_._d]);
            } else if (tk_._k == hh_._s) {
               if (0 > --fc_._d) {
                  fc_._d = uo_._f.length - 1;
               }

               og_.a188(true, 0, uo_._f[fc_._d]);
            } else if (ti_._A == hh_._s) {
               og_.a188(false, 0, (gn_)null);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static void b423() {
      _c = null;
      _b = null;
      _a = null;
   }

   public final String toString() {
      throw new IllegalStateException();
   }

   public od_() {
   }
}
