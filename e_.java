final class e_ extends en_ {
   static boolean _l;
   static cn_ _j;
   static int _d;
   static String _g = "Revive this <%0>, allowing them to fight again, at a cost of <%1> Treasure.";
   static String _i = "Fail to spot the dart launchers hidden in this room and a raider will find himself peppered with sharp bits of metal.<br><br>This trap is poisonous, and may kill raiders if they fail a <%defence> roll against this room's <%attack>.";
   private String _h;
   private String _m;
   static String _k = "Death Knight";
   static int _e = 20;
   private String _f;

   e_(String var1) {
      this((String)null, var1, var1);
   }

   public static void c423(byte var0) {
      _k = null;
      _i = null;
      _j = null;
      _g = null;
      if (var0 != 29) {
         c423((byte)-101);
      }

   }

   final cn_ b373(byte var1) {
      if (this._m != null) {
         int var2 = db_._v.b926(this._m);
         int var3 = db_._v._H + db_._v._E;
         cn_ var5 = new cn_(var2, var3);
         jh_.a303(var5);
         db_._v.b191(this._m, 0, db_._v._H, 16777215, -1);
         jh_.b797();
         return var5;
      } else {
         return null;
      }
   }

   e_(String var1, String var2, String var3) {
      this._h = var2;
      this._m = var3;
      this._f = var1;
   }

   final void a185(int var1, sa_ var2) {
      if (var1 != 0) {
         _e = -78;
      }

      var2.a050(false, ck_._H.a803(this._f, (byte)-48), (byte)91, ck_._H.a803(this._h, (byte)-48), 16777215);
   }
}
