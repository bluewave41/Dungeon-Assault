final class mm_ extends ne_ {
   int _r;
   static int _t;
   static int _q = -1;
   int _i;
   static String _s = "PLAN: ";
   int _n;
   static String _m = "Venturing down from the northern mountains in search of food and combat, the goblin cleaver's wooden shield and hatchet will give a dungeon's lesser denziens cause to think.";
   int _l;
   int _o;
   static boolean _k;
   static String _j = "Highest: <col=DB0100><%0></col>";
   int _p;

   static final di_ a282(ec_ var0) {
      di_ var1 = new di_();
      var1.a603(var0, -1);
      return var1;
   }

   public static void a150() {
      _m = null;
      _j = null;
      _s = null;
   }

   private mm_() throws Throwable {
      throw new Error();
   }

   static final int a978(CharSequence var0, boolean var1, int var2) {
      if (2 <= var2 && 36 >= var2) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var6 > var7; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (45 == var8) {
                  var3 = true;
                  continue;
               }

               if (var8 == 43 && var1) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || 122 < var8) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var2) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var2;
            if (var9 / var2 != var5) {
               throw new NumberFormatException();
            }

            var4 = true;
            var5 = var9;
         }

         if (var4) {
            return var5;
         } else {
            throw new NumberFormatException();
         }
      } else {
         throw new IllegalArgumentException("" + var2);
      }
   }
}
