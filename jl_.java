import java.applet.Applet;
import java.net.URL;
import java.util.zip.CRC32;

final class jl_ {
   static CRC32 _a = new CRC32();
   static cn_ _c;
   static String _b = "Mercenary Knight";
   static int _d;

   static final void a262(Applet var0) {
      try {
         URL var1 = new URL(var0.getCodeBase(), "tosupport.ws");
         var0.getAppletContext().showDocument(j_.a550(var1, var0), "_top");
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   static final boolean a234(wj_ var0) {
      return var0.j080(-55, 1) == 1;
   }

   public static void a423() {
      _c = null;
      _b = null;
      _a = null;
   }
}
