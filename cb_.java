import java.math.BigInteger;
import java.security.SecureRandom;

final class cb_ {
   static int _b;
   static md_ _a = new md_();
   static String _c = "Rot Worms";

   static final void a296(BigInteger var0, int var1, byte[] var2, ec_ var3, int var4, BigInteger var5, int var6) {
      int var7 = wk_.a080(var1, 18605);
      if (rp_._g == null) {
         rp_._g = new SecureRandom();
      }

      int[] var8 = new int[4];
      if (var4 != 5471) {
         _a = (md_)null;
      }

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         var8[var9] = rp_._g.nextInt();
      }

      if (null == wa_._b || wa_._b._m.length < var7) {
         wa_._b = new ec_(var7);
      }

      wa_._b._o = 0;
      wa_._b.a263(var2, 1, var1, var6);
      wa_._b.g093(var4 - 5468, var7);
      wa_._b.a041(var8, true);
      if (t_._d == null || t_._d._m.length < 100) {
         t_._d = new ec_(100);
      }

      t_._d._o = 0;
      t_._d.a093(6, 10);

      for(var9 = 0; var9 < 4; ++var9) {
         t_._d.a556((byte)63, var8[var9]);
      }

      t_._d.i093(var1, var4 ^ -5422);
      t_._d.a494(var0, 2, var5);
      var3.a263(t_._d._m, 1, t_._d._o, 0);
      var3.a263(wa_._b._m, var4 ^ 5470, wa_._b._o, 0);
   }

   public static void a150() {
      _a = null;
      _c = null;
   }
}
