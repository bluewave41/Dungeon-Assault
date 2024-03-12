final class cd_ {
   private String _a;
   static boolean _b = false;
   static md_ _g = new md_();
   static gd_ _d;
   private boolean _c;
   static String _h = "Quit";
   static int _e;
   static rg_ _f;

   final boolean a427(byte var1) {
      return this._c;
   }

   cd_(String var1) {
      this(var1, false);
   }

   final String b738(int var1) {
      if (var1 != -1) {
         a150(96);
      }

      return this._a;
   }

   public static void a150(int var0) {
      if (var0 == -1) {
         _h = null;
         _d = null;
         _f = null;
         _g = null;
      }
   }

   cd_(String var1, boolean var2) {
      this._a = var1;
      if (null == this._a) {
         this._a = "";
      }

      this._c = var2;
      if (0 == this._a.length()) {
         this._c = false;
      }

   }
}
