import java.security.SecureRandom;

final class rp_ {
   static ef_ _d = new ef_();
   static byte[][] _c = new byte[250][];
   static String[] _b = new String[]{"Gift of the Trees", "Double target <%sneak> in the next room. (Single use)"};
   static String _a = "Your <col=FF8000><%0></col> was caught and eaten.";
   static SecureRandom _g;
   static String[] _f = new String[]{"Revive", "Return a killed raider to your stable. (Single use)"};
   static String _h = "Members' Benefits";
   static int[] _e = new int[4];

   static final boolean a624(char var0) {
      if (!Character.isISOControl(var0)) {
         if (!pp_.a331(var0)) {
            return var0 == '-' || var0 == 160 || var0 == ' ' || var0 == '_';
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   static final void a857(int var0, int var1, byte var2, int var3, int var4, int[][] var5, int var6) {
      jh_.a303(jh_._l);
      if (var2 == 108) {
         int var7;
         for(var7 = 0; var7 < var5.length / var0 + 1; ++var7) {
            gf_.b115(-var7 + var3 - 1, var6 - (1 + var7), var1 + 2 * var7 + 2, 59416);
            gf_.c115(var3 + (-var7 - 1), var6 - var7, var4 + var7 * 2, 15204376);
            gf_.b115(var3 - var7 - 1, var4 + var6 + var7, 2 + var1 + var7 * 2, 6168);
            gf_.c115(var7 + var3 + var1, -var7 + var6, 2 * var7 + var4, 1572888);
         }

         jh_.b797();

         for(var7 = 0; var7 < var5.length; var1 += 2) {
            te_.a812(var3 - 1, var6 - 1, 2 + var1, var5[var7]);
            te_.b812(var3 - 1, var6, var4, var5[var7]);
            te_.a812(var3 - 1, var6 + var4, 2 + var1, var5[var7]);
            te_.b812(var1 + var3, var6, var4, var5[var7]);
            var7 += var0;
            --var6;
            var4 += 2;
            --var3;
         }

      }
   }

   static final void a423() {
      if (null != a_._n) {
         a_._n.j423((byte)73);
      }

      pj_._c = new gk_();
      ta_._a.b340(1, pj_._c);
   }

   static final boolean a097(int var0, int var1) {
      if (var0 != 15204376) {
         a097(-31, -32);
      }

      if (4 != var1 && 3 != var1) {
         if (22 != var1) {
            return 23 != var1 ? true : of_._k;
         } else {
            return gm_._d._m >= ak_._o[0] && !of_._k;
         }
      } else {
         return null != gm_._d && gm_._d._K != 0;
      }
   }

   static final byte[] a281(String var0, int var1) {
      if (var1 < 39) {
         a857(-93, 97, (byte)-14, 21, 98, (int[][])((int[][])null), 14);
      }

      return bb_._b.a826("", var0, (byte)-113);
   }

   public static void b423() {
      _g = null;
      _h = null;
      _d = null;
      _f = null;
      _c = (byte[][])null;
      _a = null;
      _b = null;
      _e = null;
   }
}
