final class jd_ extends ne_ {
   static double _j = Math.atan2(1.0, 0.0);
   int _k;
   int _m;
   static boolean _l = false;
   static wh_ _o;
   static String _n = "Dryads are tree nymphs, specifically of oak trees; these creatures of trees and wood can move swiftly and unnoticed through dungeons.";
   static String _i = "Select a raider to cast a Glamour upon";

   static final void b487() {
      if (ql_._d <= 32) {
         um_.a430(0);
      } else {
         int var0 = ql_._d % 32;
         if (0 == var0) {
            var0 = 32;
         }

         um_.a430(-var0 + ql_._d);
      }

   }

   private jd_() throws Throwable {
      throw new Error();
   }

   public static void a150(int var0) {
      _o = null;
      _i = null;
      _n = null;
      if (var0 != 1) {
         a150(-38);
      }

   }
}
