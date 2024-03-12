import java.io.IOException;
import java.util.Hashtable;

final class oi_ extends da_ {
   private boolean _I;
   private boolean _H;
   private int _L = Integer.MAX_VALUE;
   private int _O;
   private int _K;
   private int _N = Integer.MAX_VALUE;
   static ec_ _J = new ec_(1048576);
   static md_ _F = null;
   static String _G = "Connection lost. <%0>";
   static String _M = "Save and exit";

   final StringBuilder a481(int var1, Hashtable var2, StringBuilder var3, byte var4) {
      if (this.a597(var2, var1, 87, var3)) {
         this.a801(var1, var3, var2, 1);
         this.a350(true, var3, var1, var2);
         var3.append(" revert=").append(this._I);
         if (Integer.MAX_VALUE != this._L && Integer.MAX_VALUE != this._N) {
            var3.append(" to ").append(this._L).append(',').append(this._N);
         }
      }

      return var4 > -76 ? (StringBuilder)null : var3;
   }

   final void a319(int var1, int var2, lm_ var3, boolean var4) {
      int var5;
      if ((!(super._D instanceof ck_) || ((ck_)super._D)._B) && super._y == 1) {
         var5 = -var1 + -this._K + hj_._S;
         int var6 = -var2 - this._O + eh_._h;
         if (super._q != var5 || var6 != super._v) {
            super._q = var5;
            super._v = var6;
            if (super._n instanceof vi_) {
               ((vi_)super._n).a260((byte)-49, this, var2, var1);
            }
         }
      } else if (this._I) {
         if (this._L != super._q) {
            var5 = this._L - super._q;
            super._q += Math.abs(var5) > 2 ? var5 >> 1 : (var5 > 0 ? 1 : -1);
         }

         if (this._N != super._v) {
            var5 = this._N - super._v;
            super._v += Math.abs(var5) > 2 ? var5 >> 1 : (0 >= var5 ? -1 : 1);
         }
      }

      super.a319(var1, var2, var3, var4);
   }

   static final int b080(int var0, int var1) {
      return var0 != 0 ? 121 : uj_.a004(ld_._f, var0 ^ 37, var1);
   }

   private oi_(int var1, int var2, int var3, int var4, ca_ var5, pg_ var6, lm_ var7, boolean var8, boolean var9) {
      super(var1, var2, var3, var4, var5, var6);
      super._D = var7;
      this._H = var9;
      this._I = var8;
   }

   final boolean a946(lm_ var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      boolean var8 = super.a946(var1, var2, var3, var4, var5, (byte)-2, var7);
      if (var8 && this._H) {
         return true;
      } else if (this.a046(var5, var4, var7, -1, var3)) {
         if (1 == var2) {
            this._O = var3 + (-super._v - var7);
            ah_._b = this;
            this._K = -var4 + var5 - super._q;
         }

         super._y = var2;
         return true;
      } else {
         return var8;
      }
   }

   final void e423(byte var1) {
      super.e423((byte)-42);
      super._D.b050(0, super._x, 0, 0, super._s);
      if (var1 < -4) {
         this._L = super._q;
         this._N = super._v;
      }
   }

   static final cn_[] a428(int var0, int var1, nh_ var2) {
      return kk_.a283(var2, 1, var0, var1) ? fo_.a033(0) : null;
   }

   static final void f423(byte var0) {
      oh_._s = 10;
      jn_._c = false;
      ke_._b = vd_._a;
      if (var0 == 100) {
         jm_.a150(var0 ^ -17601);
      }
   }

   static final boolean a097(int var0, int var1) {
      if (ra_._c._o >= var1) {
         return true;
      } else if (null == sp_._c) {
         return false;
      } else {
         try {
            int var2 = sp_._c.a137(0);
            if (0 < var2) {
               if (-ra_._c._o + var1 < var2) {
                  var2 = -ra_._c._o + var1;
               }

               sp_._c.a120(ra_._c._m, false, var2, ra_._c._o);
               qm_._o = kd_.c138(var0 ^ 15127);
               wj_ var10000 = ra_._c;
               var10000._o += var2;
               if (var1 <= ra_._c._o) {
                  ra_._c._o = 0;
                  return true;
               }

               return false;
            }

            if (var0 != -12929) {
               _F = (md_)null;
            }

            if (var2 < 0 || b_.a138() > 30000L) {
               tl_.a150(-77);
            }
         } catch (IOException var3) {
            tl_.a150(var0 + 13056);
         }

         return false;
      }
   }

   final void a277(int var1, boolean var2, int var3, lm_ var4, int var5, int var6) {
      if (!var2) {
         this._K = 60;
      }

      super.a277(var1, var2, var3, var4, var5, var6);
      super._y = 0;
   }

   public static void h150() {
      _M = null;
      _F = null;
      _J = null;
      _G = null;
   }
}
