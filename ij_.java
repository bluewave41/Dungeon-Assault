import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

final class ij_ extends c_ {
   private Component _i;

   final void a345(byte var1, Component var2, int var3, int var4) {
      super._f = var3;
      super._g = new int[var4 * var3 + 1];
      super._b = var4;
      DataBufferInt var5 = new DataBufferInt(super._g, super._g.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super._b, super._f), var5, (Point)null);
      super._a = new BufferedImage(var6, var7, false, new Hashtable());
      this._i = var2;
      this.a487(true);
   }

   final void a433(int var1, boolean var2, Graphics var3, int var4) {
      if (!var2) {
         this._i = (Component)null;
      }

      var3.drawImage(super._a, var1, var4, this._i);
   }

   public ij_() {
   }
}
