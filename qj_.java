import java.applet.Applet;

final class qj_ {
   static ai_[] _c;
   static String _a = "Confirm Password: ";
   static String _b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
   static String[] _f = new String[]{"Thievery", "Drawing on a lifetime of experience, the <%0> can coordinate great acts of larceny. With his skills to assist, the likelihood of waking the dungeon's master when stealing its gold is reduced."};
   static String[] _e = new String[16];
   static String _d = "Your party sneaks past the monster.";

   public static void a150() {
      _b = null;
      _a = null;
      _c = null;
      _d = null;
      _e = null;
      _f = null;
   }

   static final void a423() {
      hl_._a = ea_.b853();
      lg_._w = new ji_();
      na_.a520(true, 2591221, true);
   }

   static final void a326(Applet var0, byte var1) {
      if (var1 != 89) {
         _e = (String[])null;
      }

      String var2 = var0.getParameter("username");
      if (null == var2 || ci_.a438(var2, var1 ^ 91) == 0L) {
         ;
      }
   }

   static final void a485(int var0, int var1, int var2, int var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int var12, int var13, int var14) {
      int var15 = var0 & 16711935;
      int var16 = '\uff00' & var0;

      for(var10 = -var14; var10 < 0; ++var10) {
         for(var8 = -var12; var8 < 0; ++var8) {
            var2 = var4[var3++];
            if (0 != var2) {
               var2 >>= 16;
               var2 = (var15 * var2 & -16711936 | 16711680 & var16 * var2) >>> 8;
               var9 = (var2 & 16711935) * var6;
               var2 = (-var9 + var2 * var6 & 16711680) + (-16711936 & var9) >>> 8;
               var9 = var11[var13];
               var1 = var2 + var9;
               var2 = (16711935 & var2) + (16711935 & var9);
               var9 = (65536 & -var2 + var1) + (16777472 & var2);
               var11[var13++] = mp_.a080(var9 - (var9 >>> 8), -var9 + var1);
            } else {
               ++var13;
            }
         }

         var13 += var5;
         var3 += var7;
      }

   }
}
