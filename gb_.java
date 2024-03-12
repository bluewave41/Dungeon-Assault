import java.applet.Applet;

final class gb_ {
   static int[] _e = new int[]{10};
   private nh_ _d;
   static int _a;
   private nh_ _b;
   private eg_ _c;

   final nf_ a928(int var1, int var2) {
      nf_ var3 = (nf_)this._c.a532(-70, (long)var1);
      if (var3 != null) {
         return var3;
      } else {
         byte[] var4;
         if (var1 < 32768) {
            var4 = this._b.b337(5, 1, var1);
         } else {
            var4 = this._d.b337(5, 1, var1 & 32767);
         }

         if (var2 != -19256) {
            return (nf_)null;
         } else {
            var3 = new nf_();
            if (null != var4) {
               var3.a603(new ec_(var4), var2 + 19255);
            }

            if (32768 <= var1) {
               var3.d423((byte)-74);
            }

            this._c.a577(true, var3, (long)var1);
            return var3;
         }
      }
   }

   static final ba_ a403(Applet var0, int var1) {
      String var2 = en_.a794("jagex-last-login-method", var0);
      if (var2 == null) {
         return rl_._j;
      } else {
         if (var1 >= -74) {
            a403((Applet)null, 18);
         }

         ba_[] var3 = jg_.b428();

         for(int var4 = 0; var4 < var3.length; ++var4) {
            ba_ var5 = var3[var4];
            if (var5.a896(var2, 20886)) {
               return var5;
            }
         }

         return rl_._j;
      }
   }

   public static void a150() {
      _e = null;
   }

   private gb_() throws Throwable {
      throw new Error();
   }
}
