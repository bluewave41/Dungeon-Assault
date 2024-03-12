final class bj_ extends da_ {
   static String _J = "Raiders cost you 5 Treasure less to recruit.";
   static boolean _G;
   static String[] _H = new String[]{"Retreat", "Automatically retreat. (Single use)"};
   static String _I = "Waiting for game to start. Select an entrance or use special abilities.";
   static ef_ _K = new ef_();
   static cn_ _F;

   static final String a661(int var0) {
      return 1 + var0 + "/" + en_._a.length;
   }

   private bj_(int var1, int var2, int var3, int var4, ca_ var5, pg_ var6, lm_ var7) {
      super(var1, var2, var3, var4, var5, var6);
      super._D = var7;
   }

   final void a277(int var1, boolean var2, int var3, lm_ var4, int var5, int var6) {
      super.a277(var1, var2, var3, var4, var5, var6);
      oi_ var7 = ah_._b;
      if (var7 != null && this.a046(var6, var5, var1, -1, var3)) {
         if (!(super._n instanceof qo_)) {
            if (var7._n instanceof qo_) {
               ((qo_)var7._n).a045(this, var7, false);
               ah_._b = null;
            }
         } else {
            ((qo_)super._n).a045(this, var7, false);
            ah_._b = null;
         }
      }

   }

   static final void i150(int var0) {
      if (tl_._l) {
         oj_._b = true;
         t_.a540(true, 0);
         if (var0 <= 71) {
            h150(-16);
         }

         kh_._n = 0;
      } else {
         throw new IllegalStateException();
      }
   }

   public static void h150(int var0) {
      _J = null;
      if (var0 != 31029) {
         i150(54);
      }

      _K = null;
      _H = null;
      _I = null;
      _F = null;
   }
}
