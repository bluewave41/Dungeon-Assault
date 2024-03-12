import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class og_ implements KeyListener, FocusListener {
   static ed_ _e;
   static ad_ _c = new ad_(8, 0, 4, 1);
   static String[] _b = new String[]{"All scores", "My scores", "Best each"};
   static String[] _a = new String[]{null, "One raider will be the <%highlight>party leader</col>, and will be first to enter the next room and encounter whatever lies inside. You can change your party leader before you enter any room by <col=FF0000>left-clicking on it in the party view</col> at the bottom-left of the screen."};
   static int _f;
   static String _d = "GUARDIAN";

   static final int a571(boolean var0, String var1, int var2) {
      if (var2 != -30633) {
         return -17;
      } else {
         return !var0 ? n_._c.b926(var1) : i_._x.b926(var1);
      }
   }

   public final void keyTyped(KeyEvent var1) {
      if (null != in_._C) {
         char var2 = var1.getKeyChar();
         if (0 != var2 && var2 != '\uffff' && oh_.a331(-161, var2)) {
            int var3 = 127 & ka_._c + 1;
            if (var3 != je_._i) {
               jk_._Db[ka_._c] = -1;
               b_._a[ka_._c] = var2;
               ka_._c = var3;
            }
         }
      }

      var1.consume();
   }

   static final void a188(boolean var0, int var1, gn_ var2) {
      if (var2 != null) {
         var2.a423((byte)-117);
      }

      ce_._p = var1;
      gk_._L = var2;
      bl_._k = var0;
      hc_._b = var2 != null ? var2._a : 0;
   }

   static final void a348(int var0, int var1, q_ var2, int var3, byte var4) {
      for(int var5 = var1 + var2._h * var3; var0-- > 0; var5 += var2._h) {
         var2._j[var5] = var4;
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (null != in_._C) {
         ia_._M = -1;
      }

   }

   public final synchronized void keyReleased(KeyEvent var1) {
      if (null != in_._C) {
         hl_._g = 0;
         int var2 = var1.getKeyCode();
         if (0 <= var2 && fl_._m.length > var2) {
            var2 = fl_._m[var2] & -129;
         } else {
            var2 = -1;
         }

         if (0 <= ia_._M && 0 <= var2) {
            ih_._r[ia_._M] = ~var2;
            ia_._M = 127 & 1 + ia_._M;
            if (dl_._b == ia_._M) {
               ia_._M = -1;
            }
         }
      }

      var1.consume();
   }

   static final int a451(se_ var0, String[] var1, int var2, String var3) {
      int var4 = var0.b926(var3);
      if (var2 >= var4 && var3.indexOf("<br>") == -1) {
         var1[0] = var3;
         return 1;
      } else {
         int var5 = (var2 + var4 - 1) / var2;
         var2 = var4 / var5;
         var5 = 0;
         int var6 = 0;
         int var7 = var3.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var10 = var3.charAt(var8);
            if (' ' == var10 || '-' == var10) {
               String var11 = var3.substring(var6, var8 + 1).trim();
               int var12 = var0.b926(var11);
               if (var12 >= var2) {
                  var6 = var8 + 1;
                  var1[var5++] = var11;
               }
            }

            if (var10 == '>' && var3.regionMatches(var8 - 3, "<br>", 0, 4)) {
               var1[var5++] = var3.substring(var6, var8 - 3).trim();
               var6 = var8 + 1;
            }
         }

         if (var6 < var7) {
            var1[var5++] = var3.substring(var6, var7).trim();
         }

         return var5;
      }
   }

   static final int b137() {
      return jn_._d;
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      if (null != in_._C) {
         hl_._g = 0;
         int var2 = var1.getKeyCode();
         if (0 <= var2 && fl_._m.length > var2) {
            var2 = fl_._m[var2];
            if ((var2 & 128) != 0) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if (0 <= ia_._M && var2 >= 0) {
            ih_._r[ia_._M] = var2;
            ia_._M = 1 + ia_._M & 127;
            if (dl_._b == ia_._M) {
               ia_._M = -1;
            }
         }

         int var3;
         if (0 <= var2) {
            var3 = 127 & 1 + ka_._c;
            if (var3 != je_._i) {
               jk_._Db[ka_._c] = var2;
               b_._a[ka_._c] = 0;
               ka_._c = var3;
            }
         }

         var3 = var1.getModifiers();
         if (0 != (10 & var3) || var2 == 85 || var2 == 10) {
            var1.consume();
         }
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public static void a150() {
      _b = null;
      _d = null;
      _c = null;
      _a = null;
      _e = null;
   }
}
