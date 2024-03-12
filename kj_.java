final class kj_ extends ne_ {
   int[] _l;
   static ad_ _p = new ad_(6, 0, 4, 2);
   static int _n = 0;
   static String _m = "Loading extra data";
   int _j;
   static String _k = "Checking";
   static String _i = "A knight in very nasty-looking, black, skeletal armour, holding a shield with a skull on it and a magical sword. Through countless victorious battles, this raider has gained a mastery over death.";
   static wh_ _o;

   static final Object a534(boolean var0, byte[] var1) {
      if (null != var1) {
         if (136 >= var1.length) {
            return !var0 ? var1 : gg_.a553(var1);
         } else {
            ep_ var2 = new ep_();
            var2.a167(var1, 105);
            return var2;
         }
      } else {
         return null;
      }
   }

   static final void a093(int var0, int var1) {
      ii_.a490(ln_._d, (byte)93, ib_._e, var1, var0, lc_._d, true);

      for(int var2 = 0; var2 < lc_._d; ol_._k[var0 + var2] = var2++) {
      }

      ii_.a490(n_._d, (byte)-65, da_._B, var0, var0 + var0, lc_._d + var0, false);
      if (var0 < lc_._d) {
         lc_._d = var0;
      }

   }

   static final void a642(String var0, boolean var1, float var2) {
      if (null == hg_._r) {
         hg_._r = new wi_(lg_._w, ub_._o);
         lg_._w.a336(hg_._r, -1);
      }

      hg_._r.a189(var1, var0, var2, (byte)45);
      gf_.a797();
      un_.a813(true);
   }

   public static void a150() {
      _m = null;
      _p = null;
      _o = null;
      _k = null;
      _i = null;
   }

   private kj_() throws Throwable {
      throw new Error();
   }
}
