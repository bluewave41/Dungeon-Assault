import java.io.IOException;

final class dj_ {
   static volatile int _d = -1;
   private ne_ _b;
   static int _a = 0;
   private md_ _e;
   static String _c = "Defence";

   final ne_ c024(int var1) {
      if (var1 != 17756) {
         this.a159((ne_)null, true);
      }

      ne_ var2 = this._b;
      if (var2 == this._e._c) {
         this._b = null;
         return null;
      } else {
         this._b = var2._e;
         return var2;
      }
   }

   static final void a134(int var0, int var1, long var2, int var4, String var5, int var6, int var7, int var8, int var9, boolean var10, int var11, boolean var12, byte var13, qg_ var14) {
      ra_._c = new wj_(var11);
      ac_._B = new wj_(var1);
      ld_._g = var10;
      mh_._g = var9;
      kn_._b = var0;
      fa_._j = var12;
      an_._E = var4;
      dn_._Q = var2;
      if (var13 != -27) {
         a330((ec_)null, (byte)79);
      }

      l_._b = var8;
      ii_._D = var5;
      la_._c = var6;
      sc_._q = var14;
      rd_._D = var7;
      if (null != sc_._q._h) {
         try {
            bk_._b = new hd_(sc_._q._h, 64, 0);
         } catch (IOException var16) {
            throw new RuntimeException(var16.toString());
         }
      }

   }

   static final boolean a988(int var0, String var1) {
      if (var0 != 6623) {
         return false;
      } else {
         for(int var2 = 0; var1.length() > var2; ++var2) {
            char var3 = var1.charAt(var2);
            if (!uc_.a331(var0 - 854863799, var3) && !qm_.a331(57, var3)) {
               return true;
            }
         }

         return false;
      }
   }

   final ne_ a159(ne_ var1, boolean var2) {
      if (var2) {
         _a = 16;
      }

      ne_ var3;
      if (var1 != null) {
         var3 = var1;
      } else {
         var3 = this._e._c._a;
      }

      if (var3 != this._e._c) {
         this._b = var3._a;
         return var3;
      } else {
         this._b = null;
         return null;
      }
   }

   final ne_ b024(int var1) {
      ne_ var2 = this._e._c._a;
      if (var2 == this._e._c) {
         this._b = null;
         return null;
      } else {
         this._b = var2._a;
         if (var1 != -1225818257) {
            this.a024(-5);
         }

         return var2;
      }
   }

   final ne_ a071(boolean var1, ne_ var2) {
      ne_ var3;
      if (var2 != null) {
         var3 = var2;
      } else {
         var3 = this._e._c._e;
      }

      if (!var1) {
         return (ne_)null;
      } else if (var3 != this._e._c) {
         this._b = var3._e;
         return var3;
      } else {
         this._b = null;
         return null;
      }
   }

   final ne_ d024(int var1) {
      ne_ var2 = this._b;
      if (this._e._c == var2) {
         this._b = null;
         return null;
      } else {
         this._b = var2._a;
         if (var1 != 1834857157) {
            _a = 46;
         }

         return var2;
      }
   }

   final ne_ a024(int var1) {
      ne_ var2 = this._e._c._e;
      if (var2 != this._e._c) {
         if (var1 != -479592473) {
            _c = (String)null;
         }

         this._b = var2._e;
         return var2;
      } else {
         this._b = null;
         return null;
      }
   }

   public static void a423(byte var0) {
      _c = null;
      if (var0 < 22) {
         a134(77, 24, 1L, 66, (String)null, -4, 49, 6, -5, true, 116, false, (byte)34, (qg_)null);
      }

   }

   static final String a064(byte[] var0, boolean var1) {
      return var1 ? (String)null : mk_.a046(var0, var0.length, 0);
   }

   dj_(md_ var1) {
      this._e = var1;
   }

   static final void a330(ec_ var0, byte var1) {
      dh_._g = var0.k137(0) << 5;
      if (var1 < 122) {
         a423((byte)-97);
      }

      int var2 = var0.c474(true);
      dh_._g += var2 >> 3;
      cm_._P = var2 << 18 & 1835008;
      cm_._P += var0.k137(0) << 2;
      var2 = var0.c474(true);
      fm_._g = 2064384 & var2 << 15;
      cm_._P += var2 >> 6;
      fm_._g += var0.c474(true) << 7;
      var2 = var0.c474(true);
      fm_._g += var2 >> 1;
      ln_._e = 65536 & var2 << 16;
      ln_._e += var0.k137(0);
   }
}
