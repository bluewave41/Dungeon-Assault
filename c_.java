import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

abstract class c_ {
   static String _e = "Dragons of Renown";
   int _f;
   int[] _g;
   int _b;
   static Canvas _h;
   static od_ _d = new od_();
   static String _c = "Raider snuck past guardian and disarmed it.";
   Image _a;

   abstract void a345(byte var1, Component var2, int var3, int var4);

   abstract void a433(int var1, boolean var2, Graphics var3, int var4);

   final void a487(boolean var1) {
      if (!var1) {
         _h = (Canvas)null;
      }

      gf_.a397(this._g, this._b, this._f);
   }

   static final void a842(int var0, int var1, int var2) {
      vd_.a669(var1, 0, -14561, 0, var0, var2);
   }

   public static void a150() {
      _h = null;
      _c = null;
      _d = null;
      _e = null;
   }
}
