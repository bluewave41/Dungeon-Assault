import java.applet.Applet;
import netscape.javascript.JSObject;

final class ee_ {
   static final Object a460(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   static final void a946(String var0, Applet var1) throws Throwable {
      JSObject.getWindow(var1).eval(var0);
   }

   static final Object a008(String var0, Applet var1, int var2, Object[] var3) throws Throwable {
      return var2 != 15647 ? var3[0] : JSObject.getWindow(var1).call(var0, var3);
   }
}
