import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;

final class oe_ extends ne_ {
   pn_[] _s;
   static String _p = "Employed by the human cities to thin out the population of orcs and goblins in the wilderness, rangers have a well-rounded set of skills and are deadly with a bow.";
   static ph_ _m;
   byte[][][] _k;
   static int _i = 0;
   pn_[] _o;
   int[] _n;
   int _q;
   int[] _r;
   int _j;
   int[] _l;

   static final void a188(boolean var0, Applet var1, String var2) {
      if (!qg_._n.startsWith("win") || !ji_.a896(var2)) {
         try {
            var1.getAppletContext().showDocument(new URL(var2), "_blank");
         } catch (MalformedURLException var4) {
            sm_.a741((Throwable)null, 1, "MGR1: " + var2);
         }

      }
   }

   public static void a150() {
      _m = null;
      _p = null;
   }

   static final void a808(String var0, Applet var1) {
      try {
         URL var2 = new URL(var1.getCodeBase(), var0);
         var2 = j_.a550(var2, var1);
         a188(true, var1, var2.toString());
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }
}
