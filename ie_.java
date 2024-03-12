final class ie_ extends ne_ {
   gd_ _m;
   static int[] _k = new int[8192];
   static cn_ _l = new cn_(270, 70);
   static cn_ _i;
   static String _n = "Unknown";
   static String[] _j = new String[]{"Introduction", "Story", "Renown", "Raiders", "Dungeon Rooms", "Finding Dungeons", "Raiding Dungeons", "Building Dungeons"};

   ie_(gd_ var1) {
      this._m = var1;
   }

   static final void a150() {
      i_ var0 = (i_)cd_._g.c024(0);
      if (null == var0) {
         var0 = new i_();
      }

      var0.a211(gf_._c, gf_._e, gf_._j, gf_._f, gf_._h, gf_._i, false, gf_._b);
      id_._e.a865(var0, false);
   }

   public static void d150() {
      _j = null;
      _i = null;
      _n = null;
      _k = null;
      _l = null;
   }
}
