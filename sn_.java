final class sn_ {
   static cn_[] _c;
   static String[] _a;
   static pp_ _b;

   static final void a984(String var0) {
      System.out.println("Error: " + eg_.a793(var0, "%0a", "\n", true));
   }

   public static void a150() {
      _b = null;
      _c = null;
      _a = null;
   }

   static final void a311(int var0, int var1, cn_[] var2, int var3, int var4, int var5) {
      if (null != var2) {
         if (0 < var5 && var1 > 0) {
            int var6 = var2[3] != null ? var2[3]._E : 0;
            int var8 = null != var2[5] ? var2[5]._E : 0;
            int var9 = null != var2[1] ? var2[1]._G : 0;
            int var10 = var2[7] == null ? 0 : var2[7]._G;
            int var11 = var3 + var5;
            int var12 = var4 + var1;
            int var13 = var6 + var3;
            int var14 = var11 - var8;
            int var15 = var9 + var4;
            int var16 = var12 - var10;
            int var17 = var13;
            int var18 = var14;
            if (var13 > var14) {
               var17 = var18 = var3 + var5 * var6 / (var8 + var6);
            }

            int var19 = var15;
            int var20 = var16;
            gf_.a331(fc_._g);
            if (var16 < var15) {
               var19 = var20 = var4 + var9 * var1 / (var9 + var10);
            }

            if (null != var2[0]) {
               gf_.a115(var3, var4, var17, var19);
               var2[0].h093(var3, var4);
               gf_.b331(fc_._g);
            }

            if (null != var2[2]) {
               gf_.a115(var18, var4, var11, var19);
               var2[2].h093(var14, var4);
               gf_.b331(fc_._g);
            }

            if (var2[6] != null) {
               gf_.a115(var3, var20, var17, var12);
               var2[6].h093(var3, var16);
               gf_.b331(fc_._g);
            }

            if (var2[8] != null) {
               gf_.a115(var18, var20, var11, var12);
               var2[8].h093(var14, var16);
               gf_.b331(fc_._g);
            }

            int var21;
            if (var2[1] != null && var2[1]._E != 0) {
               gf_.a115(var17, var4, var18, var19);

               for(var21 = var13; var14 > var21; var21 += var2[1]._E) {
                  var2[1].h093(var21, var4);
               }

               gf_.b331(fc_._g);
            }

            if (null != var2[7] && 0 != var2[7]._E) {
               gf_.a115(var17, var20, var18, var12);

               for(var21 = var13; var14 > var21; var21 += var2[7]._E) {
                  var2[7].h093(var21, var16);
               }

               gf_.b331(fc_._g);
            }

            if (var2[3] != null && 0 != var2[3]._G) {
               gf_.a115(var3, var19, var17, var20);

               for(var21 = var15; var16 > var21; var21 += var2[3]._G) {
                  var2[3].h093(var3, var21);
               }

               gf_.b331(fc_._g);
            }

            if (null != var2[5] && 0 != var2[5]._G) {
               gf_.a115(var18, var19, var11, var20);

               for(var21 = var15; var21 < var16; var21 += var2[5]._G) {
                  var2[5].h093(var14, var21);
               }

               gf_.b331(fc_._g);
            }

            if (var2[4] != null && var2[4]._E != 0 && 0 != var2[4]._G) {
               gf_.a115(var17, var19, var18, var20);

               for(var21 = var15; var21 < var16; var21 += var2[4]._G) {
                  for(int var22 = var13; var14 > var22; var22 += var2[4]._E) {
                     var2[4].h093(var22, var21);
                  }
               }

               gf_.b331(fc_._g);
            }

         }
      }
   }

   static final void a093(int var0, int var1) {
      if (var0 > 2) {
         ki_._f = var1;
      }
   }
}
