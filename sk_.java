import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class sk_ extends nl_ implements MouseWheelListener {
   private int _h = 0;

   final void a649(byte var1, Component var2) {
      var2.addMouseWheelListener(this);
   }

   final synchronized int a137(int var1) {
      int var2 = this._h;
      this._h = 0;
      return var1 != 6 ? -79 : var2;
   }

   public final synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this._h += var1.getWheelRotation();
      var1.consume();
   }

   final void a177(boolean var1, Component var2) {
      if (var1) {
         this.mouseWheelMoved((MouseWheelEvent)null);
      }

      var2.removeMouseWheelListener(this);
   }
}
