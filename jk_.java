final class jk_ extends hf_ {
   static String _Cb = "Priest";
   static int[] _Bb;
   static int[] _Db = new int[128];

   final void b340(int var1, lm_ var2) {
      super.b340(var1, var2);
   }

   static final void j423(byte var0) {
      if (var0 != 59) {
         _Db = (int[])null;
      }

      ai_[] var1 = gm_._d._L;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         ai_ var3 = var1[var2];
         var3._c = new wd_(var3._h._d);
      }

      wm_._c = null;
      im_._e = null;
      if (!gl_._Lb) {
         kh_.e150();
         ra_.c150();
      } else {
         li_.b150();
         of_.a150(var0 ^ -98);
      }

      df_.b150();
   }

   static final String a841(String[] var0, String var1, int var2) {
      int var3 = var1.length();
      if (var2 != 30496) {
         a661(21, -86);
      }

      int var4 = var3;
      int var5 = 0;

      while(true) {
         int var6 = var1.indexOf("<%", var5);
         int var8;
         if (var6 < 0) {
            StringBuilder var11 = new StringBuilder(var4);
            int var12 = 0;
            var5 = 0;

            while(true) {
               var8 = var1.indexOf("<%", var5);
               if (var8 < 0) {
                  var11.append(var1.substring(var12));
                  return var11.toString();
               }

               for(var5 = var8 + 2; var5 < var3 && qm_.a331(57, var1.charAt(var5)); ++var5) {
               }

               String var9 = var1.substring(var8 + 2, var5);
               if (sj_.a454(var9, var2 - 30486) && var5 < var3 && var1.charAt(var5) == '>') {
                  ++var5;
                  int var10 = ri_.a034((byte)118, var9);
                  var11.append(var1.substring(var12, var8));
                  var12 = var5;
                  var11.append(var0[var10]);
               }
            }
         }

         for(var5 = var6 + 2; var3 > var5 && qm_.a331(57, var1.charAt(var5)); ++var5) {
         }

         String var7 = var1.substring(2 + var6, var5);
         if (sj_.a454(var7, var2 - 30486) && var3 > var5 && '>' == var1.charAt(var5)) {
            ++var5;
            var8 = ri_.a034((byte)113, var7);
            var4 += var0[var8].length() - var5 + var6;
         }
      }
   }

   public static void n150() {
      _Bb = null;
      _Cb = null;
      _Db = null;
   }

   jk_(ji_ var1, lm_ var2) {
      super(var1, var2, 33, 20, 30);
   }

   static final String a661(int var0, int var1) {
      return var0 <= 110 ? (String)null : k_.a460((byte)-122, 1, 1, var1);
   }
}
