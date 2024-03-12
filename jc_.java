import java.awt.Color;

final class jc_ {
   static Color _d = new Color(10040319);
   static String _b = "<col=8B8B2E>Flee</col> - Attempt to avoid combat";
   static int[] _f;
   static cn_ _c;
   static int _e = 0;
   static String _a = "Renown lost: ";

   static final void a669(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = wh_._g._d;
      if (var3 == var4) {
         var2 += var6;
         var0 -= var6;
      }

      jh_.c797();
      if (2 == var5) {
         var0 -= var6;
      }

      gf_.e115(var1, var2, 8 + var1, var0 + var2);

      int var7;
      for(var7 = 0; var7 < var0; var7 += be_._o._b) {
         be_._o.b093(var1, var2 + var7);
      }

      jh_.b797();
      if (2 == var3) {
         ac_._w.j093(var1, -var6 + var2);
      }

      if (var5 == 2) {
         ac_._w.h093(var1, var0 + var2);
      }

      if (1 == var3) {
         for(var7 = 0; 8 > var7; ++var7) {
            gf_.d050(var1, var7 + var2, 8, 0, -(var7 * 24) + 192);
         }
      }

      if (1 == var5) {
         for(var7 = 0; 8 > var7; ++var7) {
            gf_.d050(var1, var2 + (var0 - 1) - var7, 8, 0, 192 - var7 * 24);
         }
      }

   }

   static final boolean a351(char var0) {
      return var0 == 160 || ' ' == var0 || var0 == '_' || var0 == '-';
   }

   public static void a150() {
      _f = null;
      _a = null;
      _c = null;
      _b = null;
      _d = null;
   }
}
