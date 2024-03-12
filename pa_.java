import java.applet.Applet;
import java.net.URL;

final class pa_ {
   static String _b;
   static rj_ _c;
   static cn_ _a;

   static final void a587(int var0, Applet var1) {
      try {
         URL var2 = new URL(var1.getCodeBase(), "toserverlist.ws");
         if (var0 <= 64) {
            return;
         }

         var1.getAppletContext().showDocument(j_.a550(var2, var1), "_top");
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public static void a150() {
      _b = null;
      _c = null;
      _a = null;
   }

   static final q_ a872(nh_ var0, String var1, String var2) {
      int var3 = var0.a913(var1, 1000);
      int var4 = var0.a026(0, var2, var3);
      return fl_.a549(-1, var0, var4, var3);
   }
}
