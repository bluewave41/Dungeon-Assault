import java.applet.Applet;
import java.math.BigInteger;

final class om_ {
   static qk_ _d;
   static int _a;
   static cf_ _b;
   static BigInteger _c = new BigInteger("94985066165976915983695808507103319846654268921925408641703409923983097369857");
   static String _e = "This incorporeal entity is imbued with dark magic; its glowing red eyes wait to drink in the souls of raiders.<br><br>Defeated raiders permanently lose 2 <%attack>.";

   static final cd_ a059(boolean var0) {
      if (!var0) {
         b154();
      }

      return new cd_(co_.e983(), f_.a427());
   }

   static final boolean a595(Applet var0, int var1) {
      if (!mm_._k) {
         try {
            if (var1 != 2) {
               _e = (String)null;
            }

            String var2 = "tuhstatbut";
            String var3 = (String)ee_.a460(var0, "getcookies");
            String[] var4 = ih_.a640(var1 + 121, ';', var3);

            for(int var5 = 0; var4.length > var5; ++var5) {
               int var6 = var4[var5].indexOf(61);
               if (0 <= var6 && var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
               }
            }
         } catch (Throwable var7) {
         }

         return null != var0.getParameter("tuhstatbut");
      } else {
         return true;
      }
   }

   public static void a150() {
      _c = null;
      _e = null;
      _b = null;
      _d = null;
   }

   static final boolean b154() {
      if (bl_._j != null) {
         return true;
      } else if (!hj_._Z.a213(false, "benefits")) {
         return false;
      } else {
         bl_._j = oh_.a825(hj_._Z, "benefits", "members_benefits_borders");
         rj_._s = oh_.a825(hj_._Z, "benefits", "members_benefits_price");
         sh_._a = oh_.a825(hj_._Z, "benefits", "members_benefits_logo");
         g_._Gb = new cn_[4];
         g_._Gb[0] = rc_.a324("", sb_._a, "mb_da_thumbs_01.jpg");
         g_._Gb[1] = rc_.a324("", sb_._a, "mb_da_thumbs_02.jpg");
         g_._Gb[2] = rc_.a324("", sb_._a, "mb_da_thumbs_06.jpg");
         g_._Gb[3] = rc_.a324("", sb_._a, "mb_da_thumbs_05.jpg");

         for(int var1 = g_._Gb.length - 1; var1 >= 0; --var1) {
            g_._Gb[var1].h797();
         }

         bp_.a883(bl_._j, (byte)51, ba_._h);
         eg_.a987(80, 15, 40, rj_._s, 2, 40, -2400, ne_._c, 80);
         ib_.a555(g_._Gb);
         wa_.a238(sh_._a);
         return true;
      }
   }
}
