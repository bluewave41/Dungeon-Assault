final class jj_ {
   static cn_ _b;
   static String _d = null;
   static int _c;
   static String _a = "Razor Construct";

   public static void a423() {
      _a = null;
      _d = null;
      _b = null;
   }

   static final void b423() {
      eg_.a537(rl_._h);
   }

   static final void a669(int var0, int var1, int var2, int var3, int var4) {
      if (gf_._j > var1) {
         var4 -= gf_._j - var1;
         var1 = gf_._j;
      }

      if (gf_._f > var2) {
         var3 -= gf_._f - var2;
         var2 = gf_._f;
      }

      if (gf_._h < var1 + var4) {
         var4 = -var1 + gf_._h;
      }

      if (var3 + var2 > gf_._e) {
         var3 = gf_._e - var2;
      }

      if (var4 > 0 && 0 < var3) {
         int var5 = var1 + var2 * gf_._i;
         int var6 = -var4 + gf_._i;

         for(var2 = -var3; var2 < 0; ++var2) {
            for(var1 = -var4; 0 > var1; ++var1) {
               int var7 = gf_._b[var5];
               if (('\uff00' & var7) >> 8 > var0 && (255 & var7 >> 16) <= (255 & var7 >> 8)) {
                  int var8 = ((var7 & 16711680) >> 15) - 60;
                  if (var8 > 255) {
                     var8 = 255;
                  }

                  int var9 = var7 & '\uff00';
                  var9 = '\uff00' & (var9 >> 1) - (var9 >> 5);
                  int var10 = 31 & var7 >> 3;
                  gf_._b[var5] = mp_.a080(var10, mp_.a080(var8 << 16, var9));
               }

               ++var5;
            }

            var5 += var6;
         }

      }
   }
}
