import java.applet.Applet;
import java.io.DataInputStream;
import java.net.URL;

final class sm_ {
   static String _f = "Please enter your age in years";
   static String _e = "You woke the sleeping dragon!";
   static cn_ _g;
   int _d;
   static String _b = "A very large, wolf-like creature with burning red eyes.";
   static String _a = "Hidden Darts";
   static int _c;

   static final void a741(Throwable var0, int var1, String var2) {
      try {
         String var3 = "";
         if (null != var0) {
            var3 = hc_.a505(var0);
         }

         if (null != var2) {
            if (var0 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var2;
         }

         sn_.a984(var3);
         var3 = eg_.a793(var3, ":", "%3a", true);
         var3 = eg_.a793(var3, "@", "%40", true);
         var3 = eg_.a793(var3, "&", "%26", true);
         var3 = eg_.a793(var3, "#", "%23", true);
         if (null == ci_._q) {
            return;
         }

         pn_ var4 = kf_._o.a734(var1 ^ -17, new URL(ci_._q.getCodeBase(), "clienterror.ws?c=" + wj_._s + "&u=" + (pe_._o == null ? "" + ne_._g : pe_._o) + "&v1=" + qg_._c + "&v2=" + qg_._p + "&e=" + var3));

         while(var4._c == 0) {
            pj_.a054(0, 1L);
         }

         if (var1 == var4._c) {
            DataInputStream var5 = (DataInputStream)var4._f;
            var5.read();
            var5.close();
         }
      } catch (Exception var6) {
      }

   }

   static final boolean a988(String var0) {
      return null == var0 || var0.length() < wa_._k || var0.length() > md_._b;
   }

   public static void a423(byte var0) {
      _a = null;
      _e = null;
      if (var0 != -118) {
         a423((byte)34);
      }

      _b = null;
      _g = null;
      _f = null;
   }

   static final void a715(Applet var0, String var1) {
      pa_._b = var1;

      try {
         String var2 = var0.getParameter("cookieprefix");
         String var3 = var0.getParameter("cookiehost");
         String var4 = var2 + "session=" + var1 + "; version=1; path=/; domain=" + var3;
         if (var1.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         }

         ee_.a946("document.cookie=\"" + var4 + "\"", var0);
      } catch (Throwable var5) {
      }

      lm_.a812((byte)-106, var0);
   }
}
