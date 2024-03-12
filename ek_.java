import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

final class ek_ extends Canvas implements FocusListener {
   static String[] _j = new String[]{"Defeat", "<%highlight>Your raider has failed!</col> When a raider is defeated in a dungeon, it will be <%highlight>teleported back to your stable to recover</col>. They will be unavailable during the rest of the raid. You can attempt this room with another raider, or try to find a different route to the <%highlight>hoard room.</col><br><br><%command>Try again with another raider, or find another route to the hoard room</col>"};
   static int _c = -1;
   Frame _e;
   volatile boolean _g;
   static String _i;
   static tc_ _b;
   static String _a = "Only triggers once per raid.";
   static uk_ _f = new uk_();
   static String[] _h = new String[]{"<%0> the Warrior", "<%0> the Veteran", "<%0> the Elder", "<%0> the Venerated", "<%0> the Ancient", "<%0> the Immortal"};
   static String _d = "Orb of Preservation";

   static final double a780(int var0, int var1, int var2) {
      double var3 = -((double)var2 / (double)var1) + 0.75;
      if (0.0 > var3) {
         var3 = 0.0;
      }

      var3 += (double)(25 * var0) / 100.0;
      return var3;
   }

   public static void a423() {
      _j = null;
      _h = null;
      _d = null;
      _f = null;
      _b = null;
      _a = null;
      _i = null;
   }

   public final void focusGained(FocusEvent var1) {
   }

   public final void paint(Graphics var1) {
   }

   public final void focusLost(FocusEvent var1) {
      this._g = true;
   }

   static final cn_[] a229(int var0) {
      cn_[] var2 = new cn_[9];
      var2[4] = bl_.a091(var0, 64);
      return var2;
   }

   final void a707(qg_ var1, int var2) {
      ng_.a139(var1, this._e);
      if (var2 != 0) {
         this.focusGained((FocusEvent)null);
      }

   }

   public final void update(Graphics var1) {
   }
}
