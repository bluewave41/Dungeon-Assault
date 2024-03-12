import java.awt.Canvas;
import java.io.IOException;

final class mf_ {
   static cn_[] _b;
   static String[] _c;
   static int[] _d;
   static String _a = "This password is part of your Player Name, and would be easy to guess";

   static final void a897(int var0, ec_ var1) {
      byte[] var2 = new byte[24];
      if (bk_._b != null) {
         try {
            bk_._b.a884(0L, -26296);
            bk_._b.a837(var0 ^ -30463, var2);

            int var3;
            for(var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
            }

            if (24 <= var3) {
               throw new IOException();
            }
         } catch (Exception var5) {
            for(int var4 = 0; 24 > var4; ++var4) {
               var2[var4] = -1;
            }
         }
      }

      var1.a263(var2, 1, 24, 0);
      if (var0 != -30463) {
         a971(114, 83, 37, -91);
      }

   }

   static final cn_ a971(int var0, int var1, int var2, int var3) {
      int var4 = var3 + var2 * 2;
      int var5 = var1 + 2 * var2;
      cn_ var6 = new cn_(var4, var5);
      jh_.a303(var6);
      int var7 = 16711935 & var0;
      int var8 = var0 & '\uff00';

      for(int var9 = 0; var9 < var2; ++var9) {
         int var11 = (var9 << 8) / (var2 - 1);
         int var12 = var11 * var8 & 16711680 | var11 * var7 & -16711936;
         gf_.a669(var9, var9, -(2 * var9) + var4, var5 - 2 * var9, -var9 + var2, var12 >>> 8);
      }

      gf_.b050(var2, var2, var3, var1, 0);
      jh_.b797();
      var6._A -= var2;
      var6._w -= var2;
      return var6;
   }

   static final int b137(int var0) {
      boolean var1 = false;
      boolean var2 = false;

      while(ha_.b427()) {
         d_._g.d150(0);
         if (d_._g.c154(-94)) {
            var1 = true;
         }

         if (mm_._t == 13) {
            var2 = true;
         }
      }

      d_._g.a326(-7734, ab_.a313(-776726687, lc_._c, hm_._k), ab_.a313(-776726687, hj_._S, eh_._h));
      if (d_._g.c154(77)) {
         var1 = true;
      }

      if (var0 != 12210) {
         return 46;
      } else {
         int var3 = 0;
         if (var1 && 0 <= d_._g._b) {
            var3 = n_._g[d_._g._b];
            if (2 == var3 || 5 == var3) {
               jb_.q150();
            }
         } else if (var2 && 2 != kh_._t) {
            jb_.q150();
         }

         if (0 == var3 && kh_._t == 2) {
            long var4 = -kg_._d + kd_.c138(var0 ^ -9766);
            int var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
               var3 = 2;
               ae_.a183(true, 5, -1);
            }
         }

         return var3;
      }
   }

   public static void a150() {
      _d = null;
      _c = null;
      _b = null;
      _a = null;
   }

   static final void a166(boolean var0, Canvas var1) {
      if (10 > dk_._c) {
         boolean var2 = false;
         if (im_._d) {
            im_._d = false;
            var2 = true;
         }

         hd_.a846(tl_.b738(-3), jc_._d, var2, h_.a137(-3));
      } else if (!l_.a491()) {
         gf_.a797();
         ah_.a183(320, 240);
         ob_.a749(0, -97, var1, 0);
      } else if (0 != kh_._n) {
         g_.a035(var1, 18131);
      } else {
         mj_.a967(var0, false);
         ob_.a749(0, -84, var1, 0);
      }

   }
}
