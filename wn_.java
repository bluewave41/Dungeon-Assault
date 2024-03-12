import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class wn_ extends vn_ {
   private int _x;
   private AudioFormat _y;
   private SourceDataLine _w;
   private byte[] _v;

   final void b797() {
      int var1 = 256;
      if (vn_._g) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super._q[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this._v[var2 * 2] = (byte)(var3 >> 8);
         this._v[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this._w.write(this._v, 0, var1 << 1);
   }

   final void d797() {
      if (this._w != null) {
         this._w.close();
         this._w = null;
      }

   }

   final int f784() {
      return this._x - (this._w.available() >> (vn_._g ? 2 : 1));
   }

   final void b150(int var1) throws LineUnavailableException {
      try {
         DataLine.Info var2 = new DataLine.Info(SourceDataLine.class, this._y, var1 << (vn_._g ? 2 : 1));
         this._w = (SourceDataLine)AudioSystem.getLine(var2);
         this._w.open();
         this._w.start();
         this._x = var1;
      } catch (LineUnavailableException var3) {
         if (in_.a080(var1) != 1) {
            this.b150(gk_.a080(var1));
         } else {
            this._w = null;
            throw var3;
         }
      }
   }

   final void a963(Component var1) {
      Mixer.Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         Mixer.Info[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            Mixer.Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
               }
            }
         }
      }

      this._y = new AudioFormat((float)vn_._t, 16, vn_._g ? 2 : 1, true, false);
      this._v = new byte[256 << (vn_._g ? 2 : 1)];
   }
}
