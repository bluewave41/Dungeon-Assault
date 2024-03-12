import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.com._Guid;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;
import java.awt.Frame;

final class ma_ implements IEnumModesCallback {
   private static int[] _a;
   private DirectDraw _b = new DirectDraw();
   private static int _c;

   public final void callbackEnumModes(DDSurfaceDesc var1, IUnknown var2) {
      if (null != _a) {
         _a[_c++] = var1.width;
         _a[_c++] = var1.height;
         _a[_c++] = var1.rgbBitCount;
         _a[_c++] = var1.refreshRate;
      } else {
         _c += 4;
      }

   }

   final void a121(byte var1, Frame var2, int var3, int var4, int var5, int var6) {
      var2.setVisible(true);
      WComponentPeer var7 = (WComponentPeer)var2.getPeer();
      int var8 = var7.getHwnd();
      if (var1 != 6) {
         this._b = (DirectDraw)null;
      }

      User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
      User32.SetWindowLong(var8, -20, 8);
      this._b.setCooperativeLevel(var2, 17);
      this._b.setDisplayMode(var3, var4, var5, var6, 0);
      var2.setBounds(0, 0, var3, var4);
      var2.toFront();
      var2.requestFocus();
   }

   public ma_() {
      this._b.initialize((_Guid)null);
   }

   final int[] a878(int var1) {
      if (var1 != 10127) {
         this._b = (DirectDraw)null;
      }

      this._b.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      _a = new int[_c];
      _c = 0;
      this._b.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      int[] var2 = _a;
      _c = 0;
      _a = null;
      return var2;
   }

   final void a266(int var1, Frame var2) {
      this._b.restoreDisplayMode();
      this._b.setCooperativeLevel(var2, 8);
   }
}
