final class mk_ extends ne_ {
   static nn_ _j;
   byte[] _k;
   static int[] _i = new int[4];

   static final String a046(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var1];
      int var4 = 0;

      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = 255 & var0[var5 + var2];
         if (var6 != 0) {
            if (128 <= var6 && 160 > var6) {
               char var7 = mh_._d[var6 - 128];
               if (0 == var7) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   public static void b487() {
      _j = null;
      _i = null;
   }

   mk_(byte[] var1) {
      this._k = var1;
   }

   static final boolean a827(boolean var0, CharSequence var1) {
      if (var1 == null) {
         return false;
      } else {
         int var2 = var1.length();
         if (1 <= var2 && var2 <= 12) {
            String var3 = jm_.a715((byte)59, var1);
            if (null != var3 && 1 <= var3.length()) {
               if (!jc_.a351(var3.charAt(0)) && !jc_.a351(var3.charAt(var3.length() - 1))) {
                  int var5 = 0;

                  for(int var6 = 0; var6 < var1.length(); ++var6) {
                     char var7 = var1.charAt(var6);
                     if (jc_.a351(var7)) {
                        ++var5;
                     } else {
                        var5 = 0;
                     }

                     if (var5 >= 2 && !var0) {
                        return false;
                     }
                  }

                  if (var5 > 0) {
                     return false;
                  } else {
                     return true;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   static final nh_ a923(int var0, byte var1) {
      if (var1 != 34) {
         a923(109, (byte)-40);
      }

      return uo_.a385(false, 1, true, var0, var1 + 27813, false);
   }
}
