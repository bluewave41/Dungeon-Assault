import java.text.DateFormat;
import java.util.Date;

final class k_ {
   static ef_ _e = new ef_();
   static cf_ _f;
   k_ _d;
   String _g;
   static eh_ _c;
   String _i;
   static String _b;
   static c_ _h;
   static String[] _a = new String[]{null, "Remember that you will need a varied set of raiders: some with good <%sneak> and <%dodge> levels to handle <%traps>, and some with good <%attack> and <%defence> levels to deal with <%monsters>.<br><br><%command>Recruit a party of raiders, then save your stable and exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>"};

   k_(String var1, String var2, k_ var3) {
      this._g = var1;
      this._d = var3;
      this._i = var2;
   }

   static final String a460(byte var0, int var1, int var2, int var3) {
      if (var0 != -122) {
         a460((byte)65, -82, -76, 109);
      }

      long var4 = 60000L * ((long)var3 + 16912800L);
      String var6 = DateFormat.getDateTimeInstance(var2, var1).format(new Date(var4));
      return var6;
   }

   public static void a487() {
      _f = null;
      _a = null;
      _h = null;
      _c = null;
      _e = null;
      _b = null;
   }
}
