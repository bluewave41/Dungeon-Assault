import java.awt.Canvas;

final class g_ extends ok_ {
   static int _Hb;
   static cn_ _Ib;
   static wh_ _Lb;
   static cn_[] _Gb;
   static String _Jb = "(Ready)";
   static String _Kb = "Rabid Wolf";

   static final cn_ a983(cn_ var0) {
      if (var0 != null && var0._y != 0 && var0._v != 0) {
         cn_ var1 = new cn_(64, 48);

         for(int var2 = 0; 48 > var2; ++var2) {
            for(int var3 = 0; var3 < 64; ++var3) {
               int var4 = (var3 * 3 - var2 * 4 << 4) / 6 + 256;
               int var5 = (4 * var2 + 3 * var3 << 4) / 6 - 256;
               int var6 = var4 >> 4;
               int var7 = var4 & 15;
               int var8 = var5 >> 4;
               int var9 = var5 & 15;
               if (0 <= var6 && 0 <= var8 && 32 > var6 && var8 < 32) {
                  int var10 = 32 * var8 + var6;
                  int var11 = var0._B[var10];
                  int var12 = 16711935 & var11;
                  int var13 = var11 & '\uff00';
                  int var14;
                  int var15;
                  int var16;
                  if (0 < var7 && var6 < 31) {
                     var14 = var0._B[var10 + 1];
                     var15 = 16711935 & var14;
                     var12 = (-var7 + 16) * var12 + var15 * var7;
                     var16 = '\uff00' & var14;
                     var13 = (-var7 + 16) * var13 + var16 * var7;
                     var12 = var12 >> 4 & 16711935;
                     var13 = (1044489 & var13) >> 4;
                     if (0 < var9 && 31 > var8) {
                        var14 = var0._B[32 + var10];
                        var16 = '\uff00' & var14;
                        var15 = 16711935 & var14;
                        int var17 = var0._B[33 + var10];
                        int var18 = 16711935 & var17;
                        int var19 = var17 & '\uff00';
                        var15 = (-var7 + 16) * var15 + var18 * var7;
                        var16 = var16 * (-var7 + 16) + var7 * var19;
                        var15 = (267390963 & var15) >> 4;
                        var12 = var9 * var15 + var12 * (16 - var9);
                        var16 = '\uff00' & var16 >> 4;
                        var12 = 16711935 & var12 >> 4;
                        var13 = var13 * (16 - var9) + var16 * var9;
                        var13 = (1044481 & var13) >> 4;
                     }
                  } else if (0 < var9 && 31 > var8) {
                     var14 = var0._B[var10 + 32];
                     var15 = 16711935 & var14;
                     var12 = (16 - var9) * var12 + var15 * var9;
                     var16 = var14 & '\uff00';
                     var13 = (-var9 + 16) * var13 + var16 * var9;
                     var12 = (267390970 & var12) >> 4;
                     var13 = '\uff00' & var13 >> 4;
                  }

                  var14 = var2 * 64 + var3;
                  var1._B[var14] = mp_.a080(var13, var12);
               }
            }
         }

         var1._A = 17;
         return var1;
      } else {
         return null;
      }
   }

   public static void g150() {
      _Jb = null;
      _Kb = null;
      _Gb = null;
      _Lb = null;
      _Ib = null;
   }

   static final void a035(Canvas var0, int var1) {
      if (11 == kh_._n) {
         to_.b150(113);
      }

      if (var1 != 18131) {
         _Hb = -115;
      }

      kj_.a642(lj_._e, u_._O, lc_._e);
      ob_.a749(0, -102, var0, 0);
   }

   private g_() throws Throwable {
      super(0L, (ok_)null);
      throw new Error();
   }

   static final String a157(boolean var0, boolean var1) {
      int var2 = 0;
      if (var1) {
         var2 += 4;
      }

      if (var0) {
         ++var2;
      }

      return oa_._c[var2];
   }

   static final void a953(int var0, ak_ var1) {
      wj_ var2 = ac_._B;
      var2.d556((byte)-118, var0);
      ++var2._o;
      int var3 = var2._o;
      var2.a093(6, 1);
      var2.a093(6, var1._q);
      var2.a093(6, var1._t);
      var2.a556((byte)63, var1._r);
      var2.a556((byte)63, var1._l);
      var2.a556((byte)63, var1._s);
      var2.a556((byte)63, var1._i);
      var2.c543((byte)-106, var3);
      var2.c093(var2._o - var3, -1);
   }
}
