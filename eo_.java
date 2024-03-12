import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

final class eo_ {
   private GraphicsDevice _a;
   private DisplayMode _b;

   private final void a050(Frame var1, int var2) {
      try {
         this._a.setFullScreenWindow(var1);
         if (var2 != 0) {
            this.listmodes();
         }

      } finally {
         ;
      }
   }

   public final void enter(Frame var1, int var2, int var3, int var4, int var5) {
      this._b = this._a.getDisplayMode();
      if (this._b == null) {
         throw new NullPointerException();
      } else {
         var1.setUndecorated(true);
         var1.enableInputMethods(false);
         this.a050(var1, 0);
         if (var5 == 0) {
            int var6 = this._b.getRefreshRate();
            DisplayMode[] var7 = this._a.getDisplayModes();
            boolean var8 = false;

            for(int var9 = 0; var9 < var7.length; ++var9) {
               if (var2 == var7[var9].getWidth() && var7[var9].getHeight() == var3 && var4 == var7[var9].getBitDepth()) {
                  int var10 = var7[var9].getRefreshRate();
                  if (!var8 || Math.abs(var10 - var6) < Math.abs(var5 - var6)) {
                     var8 = true;
                     var5 = var10;
                  }
               }
            }

            if (!var8) {
               var5 = var6;
            }
         }

         this._a.setDisplayMode(new DisplayMode(var2, var3, var4, var5));
      }
   }

   public final int[] listmodes() {
      DisplayMode[] var1 = this._a.getDisplayModes();
      int[] var2 = new int[var1.length << 2];

      for(int var3 = 0; var3 < var1.length; ++var3) {
         var2[var3 << 2] = var1[var3].getWidth();
         var2[(var3 << 2) + 1] = var1[var3].getHeight();
         var2[2 + (var3 << 2)] = var1[var3].getBitDepth();
         var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
      }

      return var2;
   }

   public final void exit() {
      if (this._b != null) {
         this._a.setDisplayMode(this._b);
         if (!this._a.getDisplayMode().equals(this._b)) {
            throw new RuntimeException("");
         }

         this._b = null;
      }

      this.a050((Frame)null, 0);
   }

   public eo_() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this._a = var1.getDefaultScreenDevice();
      if (!this._a.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; var3.length > var4; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if (var5 != null && var5.isFullScreenSupported()) {
               this._a = var5;
               return;
            }
         }

         throw new Exception();
      }
   }
}
