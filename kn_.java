final class kn_ {
   static boolean _g;
   static boolean _c;
   static int _b;
   static boolean _e;
   static qg_ _f;
   static String _a = "Retry";
   static String _d = "Open in popup window";

   static final synchronized byte[] a551(int var0) {
      byte[] var3;
      if (var0 == 100 && tg_._g > 0) {
         var3 = to_._d[--tg_._g];
         to_._d[tg_._g] = null;
         return var3;
      } else if (5000 == var0 && 0 < dj_._a) {
         var3 = rp_._c[--dj_._a];
         rp_._c[dj_._a] = null;
         return var3;
      } else if (var0 == 30000 && hm_._s > 0) {
         var3 = lm_._l[--hm_._s];
         lm_._l[hm_._s] = null;
         return var3;
      } else {
         if (lo_._c != null) {
            for(int var1 = 0; var1 < fp_._c.length; ++var1) {
               if (var0 == fp_._c[var1] && 0 < vc_._c[var1]) {
                  byte[] var2 = lo_._c[var1][--vc_._c[var1]];
                  lo_._c[var1][vc_._c[var1]] = null;
                  return var2;
               }
            }
         }

         return new byte[var0];
      }
   }

   public static void a150() {
      _a = null;
      _d = null;
      _f = null;
   }

   static final void a020(int var0, String var1, int var2, int var3, int var4, int var5, String var6, String var7) {
      h_ var8 = hp_._b[var2];
      if (null != var8) {
         var8._p = null == var7 ? null : hd_.a492(var0, "da_raider_" + var7);
         var8._g = var1 != null ? hd_.a492(var3, "da_raider_" + var1) : null;
         if (var4 < 123) {
            a020(19, (String)null, 101, 48, 18, -38, (String)null, (String)null);
         }

         var8._a = var6 == null ? null : hd_.a492(var5, "da_raider_" + var6);
      }
   }

   static final cn_[] a922(nh_ var0, String var1, String var2) {
      int var3 = var0.a913(var1, 1000);
      int var4 = var0.a026(0, var2, var3);
      return oi_.a428(var3, var4, var0);
   }
}
