import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.WaveFormatEx;

final class pl_ implements pc_ {
   private DSBufferDesc[] _b = new DSBufferDesc[2];
   private DSCursors[] _a = new DSCursors[2];

   public pl_() throws Exception {
      new DirectSound();
      new WaveFormatEx();

      int var1;
      for(var1 = 0; 2 > var1; ++var1) {
         this._b[var1] = new DSBufferDesc();
      }

      for(var1 = 0; var1 < 2; ++var1) {
         this._a[var1] = new DSCursors();
      }

   }
}
