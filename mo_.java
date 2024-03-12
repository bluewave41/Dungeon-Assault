import java.util.Random;

final class mo_ {
   static int _e = 0;
   ec_ _c;
   static int _a;
   static String _b = "Select a raider to revive";
   static String[] _g;
   static String _h = "Your raider avoided detection by the monster.";
   static String _f = "Order your raider to engage the monster in combat. <br><br>An aggressive attack,<col=8B1717>Charging</col> increases your raider's <%attack> at the expense of their <%defence>.<br><br>Requires: <col=FF0000>Attack</col>, <col=0A7500>Defence</col>, <col=00A7D2>Sneak</col>";
   static String _d = "To server list";

   static final boolean b154() {
      oe_ var0 = (oe_)fe_._k.e024(-24172);
      if (var0 != null) {
         for(int var1 = 0; var0._q > var1; ++var1) {
            if (var0._s[var1] != null && 0 == var0._s[var1]._c) {
               return false;
            }

            if (null != var0._o[var1] && 0 == var0._o[var1]._c) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final boolean a244(int[] var0, int var1, Random var2) {
      int var5;
      for(int var4 = var0.length - 2; 0 < var4; var0[var5] = var0[var4]) {
         var5 = uj_.a004(var2, 37, var4);
         int var6 = var0[var5];
         if (0 == me_._g[var6]._a) {
            me_._g[var6] = new ai_(var1);
            return true;
         }

         --var4;
      }

      return false;
   }

   static final ab_ a263(String var0, boolean var1) {
      int var2 = var0.length();
      if (0 == var2) {
         return ri_._e;
      } else if (64 < var2) {
         return ta_._d;
      } else {
         boolean var3;
         int var4;
         char var5;
         if ('"' == var0.charAt(0)) {
            if (var0.charAt(var2 - 1) != '"') {
               return np_._E;
            } else {
               var3 = false;

               for(var4 = 1; var4 < var2 - 1; ++var4) {
                  var5 = var0.charAt(var4);
                  if (var5 != '\\') {
                     if ('"' == var5 && !var3) {
                        return np_._E;
                     }

                     var3 = false;
                  } else {
                     var3 = !var3;
                  }
               }

               return null;
            }
         } else {
            if (!var1) {
               _d = (String)null;
            }

            var3 = false;

            for(var4 = 0; var4 < var2; ++var4) {
               var5 = var0.charAt(var4);
               if ('.' != var5) {
                  if (lb_._O.indexOf(var5) == -1) {
                     return np_._E;
                  }

                  var3 = false;
               } else {
                  if (var4 == 0 || var4 == var2 - 1 || var3) {
                     return np_._E;
                  }

                  var3 = true;
               }
            }

            return null;
         }
      }
   }

   mo_(int var1, ec_ var2) {
      this._c = var2;
   }

   public static void a150() {
      _h = null;
      _b = null;
      _f = null;
      _g = null;
      _d = null;
   }

   mo_(int var1, int var2) {
      this(var1, new ec_(2));
      this._c.i093(var2, -116);
   }
}
