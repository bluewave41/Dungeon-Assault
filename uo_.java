import java.io.IOException;

final class uo_ {
   static String _d = "Your raider was detected by the monster.";
   static String[] _g = new String[]{null, "Spend some of your initial Treasure building your dungeon, but save some for recruiting <%raiders> (about 50-100 Treasure should be sufficient). When you're finished, <col=FF0000>save your dungeon and exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>"};
   static int[] _b;
   static int[] _c = new int[256];
   static gn_[] _f;
   static String _e = "Log in";
   static cn_ _a;

   public static void a150() {
      _f = null;
      _c = null;
      _d = null;
      _a = null;
      _e = null;
      _g = null;
      _b = null;
   }

   static final boolean a689(String var0, String var1) {
      var0 = tg_.a955('_', var0, "");
      String var2 = sh_.a439(var0);
      return -1 != var1.indexOf(var0) || var1.indexOf(var2) != -1;
   }

   static final void a557(int var0, int var1, int[] var2, Object[] var3, int var4) {
      if (var0 != 256) {
         a385(false, 117, false, -61, 4, ((boolean[])((boolean[])var3[1]))[6]);
      }

      if (var4 < var1) {
         int var5 = (var1 + var4) / 2;
         int var6 = var4;
         int var7 = var2[var5];
         var2[var5] = var2[var1];
         var2[var1] = var7;
         Object var8 = var3[var5];
         var3[var5] = var3[var1];
         var3[var1] = var8;
         int var9 = Integer.MAX_VALUE == var7 ? 0 : 1;

         for(int var10 = var4; var10 < var1; ++var10) {
            if ((var9 & var10) + var7 > var2[var10]) {
               int var11 = var2[var10];
               var2[var10] = var2[var6];
               var2[var6] = var11;
               Object var12 = var3[var10];
               var3[var10] = var3[var6];
               var3[var6++] = var12;
            }
         }

         var2[var1] = var2[var6];
         var2[var6] = var7;
         var3[var1] = var3[var6];
         var3[var6] = var8;
         a557(var0 ^ 0, var6 - 1, var2, var3, var4);
         a557(256, var1, var2, var3, 1 + var6);
      }

   }

   private uo_() throws Throwable {
      throw new Error();
   }

   static final nh_ a385(boolean var0, int var1, boolean var2, int var3, int var4, boolean var5) {
      try {
         ln_ var6 = null;
         ln_ var7 = null;
         if (null != kn_._f._x) {
            sa_._x = new hd_(kn_._f._x, 5200, 0);
            kn_._f._x = null;
            var6 = new ln_(255, sa_._x, new hd_(kn_._f._q, 12000, 0), 2097152);
         }

         if (sa_._x != null) {
            if (null == cf_._c) {
               cf_._c = new hd_[kn_._f._v.length];
            }

            if (null == cf_._c[var3]) {
               cf_._c[var3] = new hd_(kn_._f._v[var3], 12000, 0);
               kn_._f._v[var3] = null;
            }

            var7 = new ln_(var3, sa_._x, cf_._c[var3], 2097152);
         }

         ti_ var8 = bl_._r.a407(var5, 4210752, var3, var6, var7);
         if (var4 != 27847) {
            return (nh_)null;
         } else {
            if (var0) {
               var8.d150(var4 ^ 30326);
            }

            return new nh_(var8, var2, var1);
         }
      } catch (IOException var9) {
         throw new RuntimeException(var9.toString());
      }
   }
}
