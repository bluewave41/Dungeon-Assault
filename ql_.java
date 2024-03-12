import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class ql_ extends Canvas {
   static String _k = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
   static cn_ _c;
   private Component _i;
   static String _l = "A knight in ornate black armour, adorned with evil-looking sigils. He has a grim look about him, likely from seeing so many enemies fall before his sword.";
   static String _a;
   static String _h = "Mouse over an icon for details";
   static af_ _f = new af_();
   static String _g = "STANDARD";
   static int _d = 256;
   static Object[] _e = new Object[1];
   static int _j = 0;
   static int _b = 0;

   public final void update(Graphics var1) {
      this._i.update(var1);
   }

   public static void b423() {
      _g = null;
      _a = null;
      _k = null;
      _f = null;
      _c = null;
      _e = null;
      _l = null;
      _h = null;
   }

   static final boolean a726(nh_ var0, nh_ var1, nh_ var2) {
      if (var2.a154(-14354) && var2.a213(false, "commonui")) {
         if (var0.a154(-14354) && var0.a213(false, "commonui")) {
            return var1.a154(-14354) && var1.a213(false, "button.gif");
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static final void a423() {
   }

   ql_(Component var1) {
      this._i = var1;
   }

   public final void paint(Graphics var1) {
      this._i.paint(var1);
   }
}
