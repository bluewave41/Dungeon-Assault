import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class hc_ {
   static int _c = -1;
   static se_ _f;
   static int _b;
   static cn_ _a = new cn_(540, 140);
   static String _g = "His face is obscured by the darkness of his hood and most do not notice him until his voice rasps in their ear...or his blade plunges into their back.";
   static se_ _e;
   static int _d;

   static final boolean b154() {
      return wh_._d && null != gm_._d || ed_.c491(true);
   }

   public static void a150() {
      _e = null;
      _a = null;
      _f = null;
      _g = null;
   }

   static final String a505(Throwable var0) throws IOException {
      String var1;
      if (!(var0 instanceof b_)) {
         var1 = "";
      } else {
         b_ var2 = (b_)var0;
         var0 = var2._d;
         var1 = var2._c + " | ";
      }

      StringWriter var12 = new StringWriter();
      PrintWriter var3 = new PrintWriter(var12);
      var0.printStackTrace(var3);
      var3.close();
      String var4 = var12.toString();
      BufferedReader var5 = new BufferedReader(new StringReader(var4));
      String var6 = var5.readLine();

      while(true) {
         String var7 = var5.readLine();
         if (null == var7) {
            var1 = var1 + "| " + var6;
            return var1;
         }

         int var8 = var7.indexOf(40);
         int var9 = var7.indexOf(41, var8 + 1);
         String var10;
         if (-1 == var8) {
            var10 = var7;
         } else {
            var10 = var7.substring(0, var8);
         }

         var10 = var10.trim();
         var10 = var10.substring(var10.lastIndexOf(32) + 1);
         var10 = var10.substring(var10.lastIndexOf(9) + 1);
         var1 = var1 + var10;
         if (-1 != var8 && -1 != var9) {
            int var11 = var7.indexOf(".java:", var8);
            if (var11 >= 0) {
               var1 = var1 + var7.substring(5 + var11, var9);
            }
         }

         var1 = var1 + ' ';
      }
   }
}
