final class gl_ extends ok_ {
   static String _Jb = "Continue";
   static wh_ _Ib;
   static r_ _Gb = new r_();
   static String[] _Kb = new String[]{"Glamour", "Monster <%attack> and <%defence> halved in the next room. (Single use)"};
   static String _Hb = "Incapacitated";
   static boolean _Lb = false;

   static final boolean a014(String var0, int var1, String var2) {
      if (var1 != 0) {
         return false;
      } else {
         var0 = tg_.a955('_', var0, "");
         String var3 = sh_.a439(var2);
         return var0.indexOf(var2) != -1 || var0.indexOf(var3) != -1;
      }
   }

   public static void c423() {
      _Jb = null;
      _Ib = null;
      _Gb = null;
      _Hb = null;
      _Kb = null;
   }

   private gl_() throws Throwable {
      super(0L, (ok_)null);
      throw new Error();
   }
}
