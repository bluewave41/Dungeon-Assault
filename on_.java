import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;

final class on_ extends Callback {
   private boolean _d;
   private int _c;
   private volatile int _a;
   private volatile boolean _e = true;
   private volatile int _b;

   final synchronized int callback(int var1, int var2, int var3, int var4) {
      int var5;
      if (this._b != var1) {
         var5 = User32.GetWindowLong(var1, -4);
         return User32.CallWindowProc(var5, var1, var2, var3, var4);
      } else {
         if (32 == var2) {
            var5 = var4 & '\uffff';
            if (1 == var5) {
               User32.SetCursor(this._e ? this._c : 0);
               return 0;
            }
         }

         if (101024 == var2) {
            User32.SetCursor(this._e ? this._c : 0);
            return 0;
         } else {
            if (1 == var2) {
               this._b = 0;
               this._e = true;
            }

            return User32.CallWindowProc(this._a, var1, var2, var3, var4);
         }
      }
   }

   final void a834(int var1, Component var2, boolean var3) {
      WComponentPeer var4 = (WComponentPeer)var2.getPeer();
      int var5 = var4.getTopHwnd();
      if (var5 != this._b || !this._e != !var3) {
         if (!this._d) {
            this._c = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this._d = true;
         }

         if (var1 != -14677) {
            this._b = -126;
         }

         if (this._b != var5) {
            if (this._b != 0) {
               this._e = true;
               User32.SendMessage(var5, 101024, 0, 0);
               synchronized(this) {
                  User32.SetWindowLong(this._b, -4, this._a);
               }
            }

            synchronized(this) {
               this._b = var5;
               this._a = User32.SetWindowLong(this._b, -4, this);
            }
         }

         this._e = var3;
         User32.SendMessage(var5, 101024, 0, 0);
      }
   }

   final void a773(int var1, boolean var2, int var3) {
      User32.SetCursorPos(var1, var3);
      if (!var2) {
         this._e = false;
      }

   }
}
