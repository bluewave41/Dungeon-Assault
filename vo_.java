final class vo_ extends ip_ {
   static String _m = "<col=178B8B>Use skill - <%0></col>";
   static String _q = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
   private rm_ _n;
   static String _o = "<col=8B1717>Disarm</col>";
   static int _r;
   private rm_ _p;

   static final void a050(int var0, int var1, int var2, int var3) {
      je_.a749(var0, var1, bf_._d, var3, var2);
      int var4 = var3 + gf_._i * var1;
      int var5 = -var2 + gf_._i;

      int var6;
      for(var6 = -var0; 0 > var6; ++var6) {
         for(int var7 = -var2; var7 < 0; ++var7) {
            gf_._b[var4] = mp_.a080(gf_._b[var4], Integer.MIN_VALUE);
            ++var4;
         }

         var4 += var5;
      }

      qe_.b370(var3, var1, var2, var0, 2105376, 192, 80);

      for(var6 = 0; var6 < 4; ++var6) {
         qe_.a370(var3 + var6, var1 + var6, var2 - var6 * 2, var0 - 2 * var6, 16777215, -(var6 * 16) + 64, 80 - var6 * 20);
      }

   }

   final String a439(byte var1, String var2) {
      if (var1 <= 44) {
         this._n = (rm_)null;
      }

      String var3 = this._n._w.toLowerCase();
      String var4 = var2.toLowerCase();
      if (var4.length() == 0) {
         return null;
      } else if (sm_.a988(var4)) {
         return fm_._j;
      } else if (dj_.a988(6623, var4)) {
         return ad_._c;
      } else if (!j_.a623(var4)) {
         if (!this.a623(var2, (byte)-106)) {
            if (var3.length() <= 0) {
               return dl_._a;
            } else if (!gk_.a398(var3, var4)) {
               if (gl_.a014(var3, 0, var4)) {
                  return mf_._a;
               } else {
                  return uo_.a689(var3, var4) ? qd_._b : fm_._j;
               }
            } else {
               return qd_._b;
            }
         } else {
            return tp_._x;
         }
      } else {
         return di_._k;
      }
   }

   vo_(rm_ var1, rm_ var2, rm_ var3) {
      super(var1);
      this._p = var3;
      this._n = var2;
   }

   final od_ a212(String var1, int var2) {
      String var4 = this._n._w.toLowerCase();
      String var5 = var1.toLowerCase();
      if (0 != var5.length()) {
         if (wm_.a671(var4, var5, (byte)-83)) {
            return !this.a623(var1, (byte)-117) ? c_._d : pd_._J;
         } else {
            return pd_._J;
         }
      } else {
         return pd_._J;
      }
   }

   public static void e150(int var0) {
      _q = null;
      _m = null;
      _o = null;
      if (var0 != 1) {
         e150(-81);
      }

   }

   private final boolean a623(String var1, byte var2) {
      if (var2 >= -95) {
         _r = -102;
      }

      String var3 = this._p._w.toLowerCase();
      String var4 = var1.toLowerCase();
      if (0 < var3.length() && var4.length() > 0) {
         int var5 = var3.lastIndexOf("@");
         if (0 <= var5 && var5 < var3.length() - 1) {
            String var6 = var3.substring(0, var5);
            String var7 = var3.substring(var5 + 1);
            if (var4.indexOf(var6) >= 0) {
               return true;
            }

            if (0 <= var4.indexOf(var7)) {
               return true;
            }
         }
      }

      return false;
   }
}
