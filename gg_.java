final class gg_ {
   static ba_ _c = new ba_("usename");
   static long _d;
   int _b;
   int _f;
   static String _e = "Raider";
   static int[] _a = new int[1024];
   static int[] _g = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

   static final void a423(byte var0) {
      k_._b = null;
      int var1;
      if (qc_._y >= 0 && qc_._y < ao_._o) {
         var1 = qc_._y - vd_._a;
         if (0 <= var1 && 10 > var1 && null != fb_._d[var1] && !eh_.a213(fb_._d[var1]._i)) {
            k_._b = fb_._d[var1]._i;
         }
      }

      var1 = 80 % ((-39 - var0) / 42);
      wf_._w._w = null != k_._b;
   }

   public static void a150() {
      _e = null;
      _c = null;
      _a = null;
      _g = null;
   }

   static final void a693(String var0, String var1) {
      if (null != a_._n) {
         a_._n.j423((byte)51);
      }

      wo_._e = new dn_(var1, var0, false, true, true);
      ta_._a.b340(1, wo_._e);
   }

   static final byte[] a553(byte[] var0) {
      int var1 = var0.length;
      byte[] var2 = new byte[var1];
      cj_.a278(var0, 0, var2, 0, var1);
      return var2;
   }

   static final void b150(int var0) {
      if (qc_._t) {
         if (var0 == 0) {
            if (a_._n != null) {
               a_._n.j423((byte)56);
            }

            String var1 = dm_.a738(var0 + 121);
            wo_._e = new dn_(var1, (String)null, true, false, false);
            lg_._w.a336(ta_._a, -1);
            ta_._a.b340(1, wo_._e);
            ta_._a.h423((byte)59);
         }
      } else {
         throw new IllegalStateException();
      }
   }

   gg_(int var1, int var2) {
      this._b = var2;
      this._f = var1;
   }
}
