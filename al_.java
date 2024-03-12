final class al_ extends ne_ {
   int _l;
   static cn_ _j;
   static wm_ _o = new wm_(49);
   int _p;
   static String _n = "Your party has been defeated";
   static String[] _i = new String[]{"Thievery", "Reduced chance of waking dragon"};
   int _k;
   static String _m = "Raider dodges.";

   static final Class a078(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (!var0.equals("J")) {
         if (var0.equals("Z")) {
            return Boolean.TYPE;
         } else if (var0.equals("F")) {
            return Float.TYPE;
         } else if (!var0.equals("D")) {
            return !var0.equals("C") ? Class.forName(var0) : Character.TYPE;
         } else {
            return Double.TYPE;
         }
      } else {
         return Long.TYPE;
      }
   }

   static final void a695(int var0, int var1, ac_ var2, int var3) {
      wa_.a374(var2._A, -1, var3, gd_._E, var0, var1);
      wa_.a374(var2._k, -1, var3, jj_._b, 40 + var0, var1);
      wa_.a374(var2._y, -1, var3, tb_._c, var0, 18 + var1);
      wa_.a374(var2._r, -1, var3, kd_._f, var0 + 40, 18 + var1);
   }

   public static void a423() {
      _n = null;
      _j = null;
      _o = null;
      _i = null;
      _m = null;
   }

   private al_() throws Throwable {
      throw new Error();
   }
}
