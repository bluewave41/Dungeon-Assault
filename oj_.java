import java.applet.Applet;

final class oj_ {
   static cn_ _a;
   static boolean _b;
   static String _c = "An Orb of Mastery takes one week to charge. When finished, its effects will apply to you permanently, but the backlash of power will destroy your dungeon and stable - you must rebuild them!<br><br> Some of your Treasure will survive the blast and can help you shape your new dungeon faster.<br><br>Are you sure you wish to construct an Orb of Mastery now?";

   static final int a170(String var0, int[] var1, se_ var2) {
      if (null == wk_._a) {
         wk_._a = new String[32];
      }

      while(true) {
         try {
            int var3 = var2.a899(var0, var1, wk_._a);
            return var3;
         } catch (ArrayIndexOutOfBoundsException var5) {
            if (wk_._a.length >= 1024) {
               return -1;
            }

            wk_._a = new String[wk_._a.length << 1];
         }
      }
   }

   static final int a353(int var0) {
      var0 &= 8191;
      if (4096 <= var0) {
         return 6144 > var0 ? -jb_._Tb[var0 - 4096] : -jb_._Tb[8192 - var0];
      } else {
         return var0 < 2048 ? jb_._Tb[var0] : jb_._Tb[-var0 + 4096];
      }
   }

   public static void a423(byte var0) {
      _a = null;
      if (var0 != -29) {
         a423((byte)67);
      }

      _c = null;
   }

   static final void a871(int var0, mm_ var1) {
      wj_ var2 = ac_._B;
      var2.d556((byte)-112, var0);
      ++var2._o;
      int var3 = var2._o;
      var2.a093(6, 1);
      var2.a093(6, var1._p);
      var2.f093(-65, var1._r);
      var2.a556((byte)63, var1._i);
      var2.a556((byte)63, var1._l);
      var2.a556((byte)63, var1._n);
      var2.a556((byte)63, var1._o);
      var2.c543((byte)-106, var3);
      var2.c093(-var3 + var2._o, -1);
   }

   static final String a326(Applet var0) {
      try {
         String var1 = var0.getParameter("cookieprefix");
         String var2 = var1 + "settings";
         String var4 = (String)ee_.a460(var0, "getcookies");
         String[] var5 = ih_.a640(115, ';', var4);

         for(int var6 = 0; var6 < var5.length; ++var6) {
            int var7 = var5[var6].indexOf(61);
            if (var7 >= 0 && var5[var6].substring(0, var7).trim().equals(var2)) {
               return var5[var6].substring(1 + var7).trim();
            }
         }
      } catch (Throwable var8) {
      }

      return ql_._a == null ? var0.getParameter("settings") : ql_._a;
   }
}
