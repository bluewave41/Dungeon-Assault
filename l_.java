import java.util.Calendar;
import java.util.TimeZone;

abstract class l_ {
   static Calendar _a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   static String _f = "All of your raiders escaped.";
   tg_[] _e;
   static String _c = "You must gain the <%0> Achievement to earn the title of <%1>.";
   static int _b;
   static String _d = "MENU";

   final int a586(int var1, int var2, byte var3) {
      if (null != this._e && 0 != this._e.length && var2 >= this._e[0]._m) {
         if (this._e[this._e.length - 1]._c < var2) {
            return -1;
         } else if (this._e.length == 1) {
            return this._e[0].a543((byte)-117, var1);
         } else {
            int var4 = 0;
            if (var3 > -111) {
               _a = (Calendar)null;
            }

            for(int var5 = 0; var5 < this._e.length; ++var5) {
               tg_ var6 = this._e[var5];
               if (var6._m <= var2 && var2 <= var6._c) {
                  int var7 = var6.a543((byte)-92, var1);
                  if (var7 == -1) {
                     return -1;
                  }

                  return var4 + var7;
               }

               var4 += var6._k.length - 1;
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   final int c137(int var1) {
      int var2 = -1;
      if (this._e != null) {
         tg_[] var3 = this._e;

         for(int var4 = 0; var3.length > var4; ++var4) {
            tg_ var5 = var3[var4];
            if (var5 != null) {
               int var6 = var5.a410((byte)-90);
               if (var2 < var6) {
                  var2 = var6;
               }
            }
         }
      }

      return var2;
   }

   static final fa_ a472(ni_ var0) {
      fa_ var1 = new fa_(var0, var0);
      ud_._v.a865(var1, false);
      wa_._j.b501(var0);
      return var1;
   }

   static final vk_ a307(boolean var0) {
      vk_ var1 = new vk_(true);
      var1._f = var0;
      return var1;
   }

   final int a655(String var1, int var2, int var3, int var4) {
      int var5 = 0;
      boolean var6 = false;
      int var7 = var1.length();

      for(int var8 = var2; var8 < var7; ++var8) {
         char var9 = var1.charAt(var8);
         if (var9 != '<') {
            if ('>' == var9) {
               var6 = false;
            } else if (!var6 && var9 == ' ') {
               ++var5;
            }
         } else {
            var6 = true;
         }
      }

      if (0 < var5) {
         return (-var3 + var4 << 8) / var5;
      } else {
         return 0;
      }
   }

   final int a543(byte var1, int var2) {
      tg_[] var3 = this._e;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         tg_ var6 = var3[var4];
         if (var6._k.length > var2) {
            return var6._k[var2];
         }

         var2 -= var6._k.length - 1;
      }

      return 0;
   }

   final int a080(int var1, int var2) {
      for(int var3 = var1; var3 < this._e.length; ++var3) {
         tg_ var4 = this._e[var3];
         if (var2 < var4._k.length) {
            return var3;
         }

         var2 -= var4._k.length - 1;
      }

      return this._e.length;
   }

   static final void b487() {
      if (bk_._b != null) {
         try {
            bk_._b.a884(0L, -26296);
            bk_._b.a539(ra_._c._o, -79, 24, ra_._c._m);
         } catch (Exception var1) {
         }
      }

      wj_ var10000 = ra_._c;
      var10000._o += 24;
   }

   public static void a423() {
      _c = null;
      _f = null;
      _d = null;
      _a = null;
   }

   static final void a150(int var0) {
      if (var0 != -1) {
         a150(116);
      }

      if (10 == kh_._n || !dh_.a491()) {
         tk_.a423();
         kh_._n = 11;
      }

      u_._O = true;
   }

   static final hl_ a566(String var0, long var1, boolean var3, String var4) {
      if (var1 == 0L && var4 != null) {
         return new vl_(var4, var0);
      } else {
         return (hl_)(var3 ? new sc_(var1, var0) : new ch_(var1, var0));
      }
   }

   static final int d137(int var0) {
      if (var0 != 4570) {
         return -92;
      } else {
         boolean var1 = false;

         while(ha_.b427()) {
            h_._h.d150(var0 - 4570);
            if (h_._h.c154(var0 - 4670)) {
               var1 = true;
            }
         }

         h_._h.a326(-7734, wi_.c313(hm_._k, var0 ^ 2118074, lc_._c), wi_.c313(eh_._h, 2113632, hj_._S));
         if (h_._h.c154(var0 - 4689)) {
            var1 = true;
         }

         int var2 = 0;
         if (var1 && 0 <= h_._h._b) {
            var2 = op_._c[h_._h._b];
            if (var2 == 2) {
               vk_.a423();
            }
         }

         return var2;
      }
   }

   final int b137(int var1) {
      if (var1 != 263) {
         return -25;
      } else {
         return null != this._e && this._e.length > 0 ? this._e[this._e.length - 1]._c - this._e[0]._m : 0;
      }
   }

   static final void a702(boolean var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[][] var9, int var10, boolean var11, int var12) {
      if (var8 == 0) {
         gh_._i[var3] = new ac_(var3, var5, var7, var10, var6, var1, var2, var12, var4, var0, var11, var9);
      }
   }

   static final boolean a491() {
      return nl_._d > 250;
   }
}
