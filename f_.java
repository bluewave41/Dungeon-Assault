final class f_ {
   static cn_ _a;
   static String _c = "DUNGEON BUILDER";
   static cn_ _f;
   static String _e = "A large, snarling wolf; it's grey fur is matted with blood.<br><br>If this monster detects a raider, its howl will alert monsters in adjacent rooms, increasing their <%detect> by 2.";
   static String _b = "<%0>: <col=<%1>><%2></col>";
   static boolean _d;

   public static void a487(boolean var0) {
      _f = null;
      _e = null;
      _b = null;
      if (!var0) {
         _b = (String)null;
      }

      _a = null;
      _c = null;
   }

   static final boolean a427() {
      return !im_._b.b154(36);
   }

   static final int a313(int var0, int var1, int var2) {
      if (null != nl_._g) {
         if (var2 != 1) {
            _f = (cn_)null;
         }

         if (wk_._h <= var0 && var0 < wk_._h + nl_._g._y && var1 >= fo_._b && fo_._b + nl_._g._v > var1) {
            return 0;
         } else {
            return var0 >= rm_._T && var0 < nl_._g._y + rm_._T && var1 >= mi_._f && nl_._g._v + mi_._f > var1 ? 1 : -1;
         }
      } else {
         return -1;
      }
   }

   static final void a366(int var0) {
      for(jd_ var2 = (jd_)ta_._f.e024(-24172); var2 != null; var2 = (jd_)ta_._f.a024(4)) {
         o_.a218(var0, var2);
      }

   }
}
