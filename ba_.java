import java.applet.Applet;

final class ba_ {
   private String _g;
   static int _f;
   static String _d = "Your raider was detected by trap, but avoided it.";
   static kg_ _c = null;
   static int[] _b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   static ba_ _e = new ba_("email");
   static String _a = "Notoriously dimwitted, the ogres share the highlands with the goblin and orc tribes. What this particular ogre thug lacks in intellect and subtlety, he compensates for with raw force.";
   static String _h = "Dungeon Assault";

   public static void a423() {
      _d = null;
      _a = null;
      _h = null;
      _b = null;
      _e = null;
   }

   static final void a787(rj_ var0, byte var1, int var2) {
      kd_._c = var2;
      uo_._f = le_._b[kd_._c];
      fc_._d = 0;
      id_._l = var0;
      if (var1 >= 40) {
         og_.a188(false, 0, uo_._f[fc_._d]);
      }
   }

   final void a587(int var1, Applet var2) {
      if (var1 != 64) {
         a787((rj_)null, (byte)20, -83);
      }

      lm_.a890(false, "jagex-last-login-method", 31536000L, var2, this._g);
   }

   final boolean a896(String var1, int var2) {
      return var2 != 20886 ? true : this._g.equals(var1);
   }

   public final String toString() {
      throw new IllegalStateException();
   }

   static final cn_[] a089(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var5 + var4 + var7;
      cn_[] var9 = new cn_[]{new cn_(var8, var8), new cn_(var1, var8), new cn_(var8, var8), new cn_(var8, var1), new cn_(64, 64), new cn_(var8, var1), new cn_(var8, var8), new cn_(var1, var8), new cn_(var8, var8)};
      cn_[] var10 = var9;

      int var11;
      for(var11 = 0; var10.length > var11; ++var11) {
         cn_ var12 = var10[var11];

         for(int var13 = 0; var12._B.length > var13; ++var13) {
            var12._B[var13] = var2;
         }
      }

      int var14;
      for(var14 = 0; var5 > var14; ++var14) {
         for(var11 = 0; var11 < var8; ++var11) {
            var9[6]._B[var11 + var8 * (-var14 + (var8 - 1))] = var3;
            var9[8]._B[(var8 - 1 - var14) * var8 + var11] = var3;
            var9[2]._B[var11 * var8 + -var14 - 1 + var8] = var3;
            var9[8]._B[var8 - 1 - var14 + var11 * var8] = var3;
         }
      }

      for(var14 = 0; var14 < var5; ++var14) {
         for(var11 = 0; var8 > var11; ++var11) {
            var9[0]._B[var14 * var8 + var11] = var0;
            var9[0]._B[var14 + var8 * var11] = var0;
            if (-var14 + var8 > var11) {
               var9[2]._B[var8 * var14 + var11] = var0;
               var9[6]._B[var14 + var11 * var8] = var0;
            }
         }
      }

      for(var14 = 0; var14 < var1; ++var14) {
         for(var11 = 0; var5 > var11; ++var11) {
            var9[7]._B[var14 + (-var11 + var8 - 1) * var1] = var3;
            var9[5]._B[var14 * var8 - (-var8 + 1) - var11] = var3;
            var9[1]._B[var1 * var11 + var14] = var0;
            var9[3]._B[var11 + var14 * var8] = var0;
         }
      }

      for(var14 = 0; var14 < var1 >> 1; ++var14) {
         for(var11 = 0; var7 > var11; ++var11) {
            var9[1]._B[var14 + (var8 - var11 - 1) * var1] = var6;
            var9[3]._B[-var11 - (-var8 + 1) + var8 * var14] = var6;
            var9[7]._B[var14 + var11 * var1] = var6;
            var9[5]._B[var14 * var8 + var11] = var6;
         }
      }

      return var9;
   }

   ba_(String var1) {
      this._g = var1;
   }
}
