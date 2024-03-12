final class dm_ {
   static cn_[] _d;
   static cn_[] _a;
   static cn_ _g;
   static cn_ _f;
   static String _c = "Blinded";
   static String[] _e = new String[]{"First Strike", "Always attacks first."};
   static String _b = "The floor of this room is covered in blood, and the sound of machinery creaking echoes ominously overhead.";

   static final boolean c154(int var0) {
      return kh_._n >= 10 && !tl_._l && !dh_.a427();
   }

   static final String a738(int var0) {
      String var1 = "";
      if (null != wo_._e) {
         var1 = wo_._e.a738(-16);
      }

      if (0 == var1.length()) {
         var1 = dc_.a738(-118);
      }

      if (0 == var1.length()) {
         var1 = fb_._a;
      }

      return var1;
   }

   static final void a731(md_ var0, int[] var1, int var2, int var3, int var4) {
      if (bo_._Jb.a370(var4, (byte)97)) {
         if (var2 <= var1[var3]) {
            var1[var3] = var2;
            a_ var5 = new a_(var3);

            a_ var6;
            for(var6 = (a_)var0.e024(-24172); null != var6; var6 = (a_)var0.a024(4)) {
               if (var1[var6._j] > var2) {
                  so_.a985((byte)60, var6, var5);
                  break;
               }
            }

            if (null == var6) {
               var0.a865(var5, false);
            }

         }
      }
   }

   public static void b150() {
      _g = null;
      _b = null;
      _d = null;
      _a = null;
      _c = null;
      _e = null;
      _f = null;
   }
}
