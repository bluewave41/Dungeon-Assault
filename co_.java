final class co_ extends vf_ {
   byte[] _D;
   ln_ _K;
   static md_ _I = new md_();
   int _L;
   static int _H;
   static vj_ _G = null;
   static String _E = "Use postcombat abilities.";
   static String _C;
   static cn_ _F;
   static String[] _J = new String[]{"Raiders", "You control a party of between one and four <%raiders>, displayed at the bottom-left of the screen.<br><br><%command>Select one of these raiders now.</col>"};

   static final String e983() {
      if (ol_._i != ql_._f) {
         if (im_._b.b154(36)) {
            return wd_._d == ql_._f ? im_._b.c738(-2085) : _C;
         } else {
            return im_._b.c738(-2085);
         }
      } else {
         return he_._m;
      }
   }

   final byte[] b318(boolean var1) {
      if (!var1) {
         _E = (String)null;
      }

      if (super._v) {
         throw new RuntimeException();
      } else {
         return this._D;
      }
   }

   public static void e150() {
      _I = null;
      _J = null;
      _G = null;
      _C = null;
      _F = null;
      _E = null;
   }

   final int d410(byte var1) {
      if (var1 <= 98) {
         return -12;
      } else {
         return !super._v ? 100 : 0;
      }
   }
}
