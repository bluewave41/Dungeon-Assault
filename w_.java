import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

final class w_ {
   private Robot _a = new Robot();
   private Component _b;

   public final void showcursor(Component var1, boolean var2) {
      if (!var2) {
         if (var1 == null) {
            throw new NullPointerException();
         }
      } else {
         var1 = null;
      }

      if (this._b != var1) {
         if (this._b != null) {
            this._b.setCursor((Cursor)null);
            this._b = null;
         }

         if (null != var1) {
            var1.setCursor(var1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), (String)null));
            this._b = var1;
         }

      }
   }

   public final void setcustomcursor(Component var1, int[] var2, int var3, int var4, Point var5) {
      if (null == var2) {
         var1.setCursor((Cursor)null);
      } else {
         BufferedImage var6 = new BufferedImage(var3, var4, 2);
         var6.setRGB(0, 0, var3, var4, var2, 0, var3);
         var1.setCursor(var1.getToolkit().createCustomCursor(var6, var5, (String)null));
      }

   }

   public final void movemouse(int var1, int var2) {
      this._a.mouseMove(var1, var2);
   }

   public w_() throws Exception {
   }
}
