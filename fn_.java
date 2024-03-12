final class fn_ extends ne_ {
   int _n;
   int _r;
   static String _j = "The path between the nails on the floor of this room is difficult and treacherous. A misstep could cause severe injury.<br><br>Trapped raiders permanently lose 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";
   int[] _p;
   static cn_ _o;
   static String _q = "You have earned a total of <%0> Treasure";
   int _k;
   int _s;
   int _m;
   int _i;
   int _l;

   static final cn_ a316() {
      cn_ var0 = new cn_(11, 11);
      jh_.a303(var0);

      int var1;
      for(var1 = 0; 6 > var1; ++var1) {
         gf_.c115(var1, -var1 + 5, 2 * var1 + 1, 65793);
      }

      for(var1 = 6; var1 < 11; ++var1) {
         gf_.c115(var1, 4, 3, 65793);
      }

      jh_.b797();
      return var0;
   }

   public static void d150(int var0) {
      _q = null;
      _j = null;
      if (var0 != 1) {
         d150(-32);
      }

      _o = null;
   }

   private fn_() throws Throwable {
      throw new Error();
   }
}
