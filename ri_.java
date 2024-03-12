final class ri_ {
   private static int[] _a = wa_.b878(-1);
   static cn_ _g;
   static String _c = "Raider attacks.";
   static ab_ _e;
   static cn_[] _d;
   static int _b;
   static String _f;

   static final hh_ a754() {
      if (null == ne_._b) {
         ne_._b = new hh_(ta_._e, 20, 0, 0, 0, 11579568, -1, 0, 0, ta_._e._H, -1, Integer.MAX_VALUE, true);
      }

      return ne_._b;
   }

   static final void a392(String var0, String[] var1, int var2) {
      wd_._d = dh_._b;
      if (var2 != 255) {
         if (var2 >= 100 && var2 <= 105) {
            ok_.a009(var1);
            ll_._p = em_.a953(var1);
         } else {
            ll_._p = p_.a853(var2, var0);
         }
      } else {
         ll_._p = l_.a307(wk_._g < 13);
         ok_.a009((String[])null);
      }

   }

   public static void a150() {
      _f = null;
      _a = null;
      _d = null;
      _g = null;
      _e = null;
      _c = null;
   }

   static final void a900(String var0, int var1) {
      jn_._c = true;
      ip_._j = var0.trim();
      oh_._s = 10;
      if (var1 >= -64) {
         a034((byte)-116, (CharSequence)null);
      }

      jm_.a150(-17573);
   }

   static final int a034(byte var0, CharSequence var1) {
      if (var0 <= 10) {
         a900((String)null, 93);
      }

      return mm_.a978(var1, true, 10);
   }

   static {
      int[] var0 = _a;
      var0[0] = mp_.a080(var0[0], 67108864);
      var0 = _a;
      var0[0] = mp_.a080(var0[0], 134217728);
      var0 = _a;
      var0[1] = mp_.a080(var0[1], 4);
      var0 = _a;
      var0[1] = mp_.a080(var0[1], 16);
      var0 = _a;
      var0[1] = mp_.a080(var0[1], 32);
      var0 = _a;
      var0[1] = mp_.a080(var0[1], 128);
      var0 = _a;
      var0[1] = mp_.a080(var0[1], 256);
      var0 = _a;
      var0[1] = mp_.a080(var0[1], 512);
      _e = new ab_();
   }
}
