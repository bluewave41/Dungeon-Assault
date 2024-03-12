final class ah_ {
   static String _a = "Raider was trapped by guardian, which alerted the monsters of the dungeon.";
   static oi_ _b;
   static String[] _c = new String[255];

   static final void a183(int var0, int var1) {
      if (nl_._d >= 0) {
         int var2 = var0 - 135;
         int var3 = var1 - 35;
         int var4 = 256;
         if (75 > nl_._d) {
            var4 = (nl_._d << 8) / 75;
         }

         if (nl_._d > 200) {
            var4 = (-nl_._d + 250 << 8) / 50;
         }

         lm_.a901(hc_._a);
         re_.b797();
         gf_.a797();
         id_.a150(439027688);
         if (256 > var4) {
            gf_.b669(0, 0, gf_._i, gf_._c, 0, 256 - var4);
         }

         ti_.c487(true);
         if (150 <= nl_._d) {
            dm_._g.d326(15 + var2, var3 + 10, var4);
         } else {
            hc_._a.a093(var2, var3);
         }

         int var5 = nl_._d - 125;
         int var6;
         if (var5 > 0 && var5 < 50) {
            if (20 > var5) {
               var6 = var5 * 256 / 20;
               ie_._l.b326(var2, var3, var6);
            } else if (30 > var5) {
               ie_._l.b326(var2, var3, 256);
            } else {
               var6 = (-(var5 * 256) + 12800) / 20;
               ie_._l.b326(var2, var3, var6);
            }
         }

         var5 = nl_._d - 140;
         if (var5 > 0) {
            var6 = 256;
            if (var5 < 20) {
               var6 = var5 * 256 / 20;
            }

            lb_._C.d326(var2 + 15, 10 + var3, var6 * var4 >> 8);
         }

      }
   }

   static final boolean a098(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == 45) {
                  var3 = true;
                  continue;
               }

               if (var8 == 43 && var2) {
                  continue;
               }
            }

            if (48 <= var8 && var8 <= 57) {
               var8 -= 48;
            } else if (65 <= var8 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  return false;
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               return false;
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var1 * var5 + var8;
            if (var9 / var1 != var5) {
               return false;
            }

            var4 = true;
            var5 = var9;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static final gp_ a770(nh_ var0, int var1, String var2, String var3, nh_ var4) {
      int var5 = var4.a913(var3, 1000);
      if (var1 != 200) {
         a770((nh_)null, 14, (String)null, (String)null, (nh_)null);
      }

      int var6 = var4.a026(0, var2, var5);
      return hh_.a921(var0, var4, var5, var6);
   }

   public static void a150() {
      _a = null;
      _b = null;
      _c = null;
   }

   static final void a540(int var0) {
      ri_._g = ec_._j[var0].a125();
      String var1 = ce_._o[var0];
      int var2 = 40 + ne_._c.b926(var1);
      cn_ var3 = new cn_(var2, 32);
      jh_.c797();
      var3.e797();
      ri_._g.c115(0, 0, 32, 32);
      ne_._c.b191(var1, 40, ne_._c._H + 32 >> 1, 16777215, -1);
      var3.d150(16777215);
      var3.e797();
      ri_._g.b050(0, 0, 32, 32, 0);
      ne_._c.b191(var1, 40, 32 + ne_._c._H >> 1, 0, -1);
      jh_.b797();
      ke_._e = 0;
      pa_._a = var3;
      sl_._b = new rh_(12 + (var2 >> 1), 32, 8 + var2, 32, 16711680, 768, 224);
   }
}
