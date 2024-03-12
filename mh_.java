import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class mh_ implements MouseListener, MouseMotionListener, FocusListener {
   static vk_ _b;
   static ef_ _c = new ef_();
   static int _g;
   static int _a;
   static gl_ _e;
   static char[] _d = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   static cf_ _f;

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (ib_._f != null) {
         fc_._m = 0;
         ak_._k = var1.getX();
         em_._C = var1.getY();
         kd_.c138(-2456);
         if (var1.isMetaDown()) {
            wm_._g = 2;
            ua_._a = 2;
         } else {
            wm_._g = 1;
            ua_._a = 1;
         }

         int var2 = var1.getModifiers();
         if (0 == (8 & var2)) {
         }

         if ((var2 & 4) == 0) {
         }

         lj_._g = true;
         if (0 != (16 & var2)) {
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (ib_._f != null) {
         fc_._m = 0;
         wi_._tb = var1.getX();
         dj_._d = var1.getY();
         lj_._g = true;
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (ib_._f != null) {
         ua_._a = 0;
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if (ib_._f != null) {
         fc_._m = 0;
         wi_._tb = var1.getX();
         dj_._d = var1.getY();
         lj_._g = true;
      }

   }

   static final int a170(int var0, int var1) {
      int var2 = var0 >> 16;
      int var3 = '\uffff' & var0;
      int var4 = var1 >> 16;
      int var5 = '\uffff' & var1;
      return (var5 * var3 >> 16) + var3 * var4 + var2 * var1;
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (null != ib_._f) {
         fc_._m = 0;
         wi_._tb = -1;
         dj_._d = -1;
         lj_._g = true;
      }

   }

   static final void b150(int var0) {
      of_._k = false;
      nf_._y = var0;
      eh_._o._N = true;
      ed_ var1 = eh_._o;
      var1._w = true;
      ed_ var2 = og_._e;
      og_._e._N = false;
      var2._w = false;
   }

   static final boolean a097(int var0) {
      if (var0 != ek_._c) {
         var0 &= 127;
         if (wh_._a <= var0) {
            return gg_._g.length > var0 - wh_._a;
         } else if (var0 >= cp_._R) {
            return -cp_._R + var0 < id_._j.length;
         } else if (var0 >= ok_._z) {
            return bl_._n.length > -ok_._z + var0;
         } else if (gn_._d > var0) {
            if (var0 < uf_._a) {
               if (wm_._a > var0) {
                  return false;
               } else {
                  return dc_._p.length > -wm_._a + var0;
               }
            } else {
               return -uf_._a + var0 < hb_._m.length;
            }
         } else {
            return -gn_._d + var0 < ci_._s.length;
         }
      } else {
         return true;
      }
   }

   public static void a150() {
      _f = null;
      _b = null;
      _d = null;
      _c = null;
      _e = null;
   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if (null != ib_._f) {
         fc_._m = 0;
         wi_._tb = var1.getX();
         dj_._d = var1.getY();
         lj_._g = true;
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (ib_._f != null) {
         fc_._m = 0;
         ua_._a = 0;
         lj_._g = true;
         int var2 = var1.getModifiers();
         if (0 == (16 & var2)) {
         }

         if ((var2 & 4) != 0) {
         }

         if (0 == (var2 & 8)) {
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }
}
