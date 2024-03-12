import java.io.IOException;
import java.net.Socket;

abstract class um_ {
   static int _h;
   static String _c = "Risk of waking dragon is 10% + proportion of gold taken.";
   static hb_[] _i;
   int _f;
   static String _d = "No";
   static String _e = "The pit in this room prevents raiders from easily crossing it.";
   String _a;
   static rh_ _g;
   static String[] _b = new String[]{"Circumvent", "Defeat any room. (Single use)"};

   final Socket a693(int var1) throws IOException {
      if (var1 != -27549) {
         a430(10);
      }

      return new Socket(this._a, this._f);
   }

   static final void a430(int var0) {
      ql_._d = var0;
      if (null != ob_._Xb) {
         ob_._Xb.c093(var0, 24509);
      }

      if (ek_._b != null) {
         ek_._b.a093(var0, 256);
      }

   }

   abstract Socket b693(int var1) throws IOException;

   public static void a487() {
      _d = null;
      _e = null;
      _g = null;
      _i = null;
      _b = null;
      _c = null;
   }
}
