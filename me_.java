final class me_ {
   static ai_[] _g;
   private boolean _b = false;
   private String _d;
   private boolean _h = false;
   static String _e = "Email: ";
   static int _f;
   static String _c = "Return to game";
   static String _a = "Names can only contain letters, numbers, spaces and underscores";

   final boolean a427(byte var1) {
      if (var1 <= 36) {
         a150(-118);
      }

      return this._b;
   }

   public static void a150(int var0) {
      if (var0 != 36) {
         a150(95);
      }

      _e = null;
      _g = null;
      _a = null;
      _c = null;
   }

   static final void a652(int var0, int var1, byte var2, int var3) {
      if (a_._o.a370(var3, (byte)99) && !al_._o.a370(var1, (byte)118)) {
         jb_._Sb[var1] = var0;
         al_._o.a093(var1, -128);
         if (var2 <= 65) {
            _a = (String)null;
         }

         hf_._ob.a865(new a_(var1), false);
      }
   }

   final boolean b154(int var1) {
      return var1 != 36 ? false : this._h;
   }

   final void a877(boolean var1, boolean var2) {
      this._h = true;
      this._b = var1;
      if (var2) {
         a652(118, -45, (byte)-83, -85);
      }

   }

   me_(String var1) {
      this._d = var1;
   }

   static final cn_ a028(int var0, int var1, int var2, int var3, int var4) {
      int var5 = !gl_._Lb ? 32 : 36;
      if (var0 != 32) {
         return (cn_)null;
      } else {
         cn_ var6 = new cn_(var5, var5);
         jh_.a303(var6);
         gf_.b050(var3, var2, -var3 - (var1 - var5), -var2 + -var4 + var5, 16777215);
         jh_.b797();
         return var6;
      }
   }

   final String c738(int var1) {
      return var1 != -2085 ? (String)null : this._d;
   }
}
