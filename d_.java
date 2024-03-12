final class d_ {
   static String _b = "Invalid password.";
   static int _e;
   static q_[] _c;
   static nh_ _d;
   static String _a = "Goblin Runt";
   static ae_ _g = new ae_(1);
   static boolean _f = false;

   static final int a313(int var0, int var1, int var2) {
      if (var0 >= -72) {
         a313(48, -124, 86);
      }

      return var1 < var2 ? 2048 - gj_.a080((var1 << 16) / var2) : gj_.a080((var2 << 16) / var1);
   }

   static final la_ a627(boolean var0) {
      wj_ var1 = ra_._c;
      int var2 = var1.c474(true);
      uk_._a = 127 & var2;
      ac_._l = (128 & var2) != 0;
      wd_._j = var1.c474(true);
      gg_._d = var1.c411((byte)69);
      if (2 == uk_._a) {
         di_._d = var1.k137(0);
         ce_._w = var1.f137(-114);
      } else {
         di_._d = 0;
         ce_._w = 0;
      }

      boolean var3 = var1.c474(true) == 1;
      ri_._f = var1.d738(-124);
      if (var3) {
         tk_._v = var1.d738(-96);
      } else {
         tk_._v = ri_._f;
      }

      if (1 == uk_._a || uk_._a == 4) {
         var1.k137(0);
         var1.d738(-101);
      }

      if (var0) {
         int var4 = var1.k137(0);

         try {
            nf_ var5 = fm_._f.a928(var4, -19256);
            sa_._t = var5.c983((byte)-122);
            kp_._a = !tk_._v.equals(tc_._u) ? var5._D : null;
         } catch (Exception var6) {
            sm_.a741(var6, 1, "CC1");
            kp_._a = null;
            sa_._t = null;
         }
      } else {
         sa_._t = sc_.a756(80, var1);
         kp_._a = null;
      }

      return new la_(var0);
   }

   static final void a713(int var0, int var1, int var2, int var3) {
      ie_.a150();
      gf_.a115(var0, var3, var2, var1);
   }

   public static void a150() {
      _g = null;
      _d = null;
      _a = null;
      _b = null;
      _c = null;
   }
}
