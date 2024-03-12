import java.util.Hashtable;

class ii_ extends lm_ implements aa_ {
   static String _E = "Skip";
   md_ _B = new md_();
   static String[] _I = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
   static int _G = -1;
   static String _C = "Defeated";
   static String _D;
   static String _J = "<%col_detect>Detect +3 to all monsters.</col>";
   static int _F = 3;
   static cn_ _H;

   final boolean a276(int var1, int var2, int var3, int var4, int var5, lm_ var6, byte var7) {
      if (var7 != -84) {
         return false;
      } else {
         dj_ var8 = new dj_(this._B);

         for(lm_ var9 = (lm_)var8.a024(-479592473); var9 != null && var9.c154(-55); var9 = (lm_)var8.c024(var7 + 17840)) {
            if (var9.a427((byte)57) && var9.a276(var1, var2, var3, var4, var5, var6, (byte)-84)) {
               return true;
            }
         }

         return false;
      }
   }

   public static void e423() {
      _I = null;
      _D = null;
      _H = null;
      _E = null;
      _J = null;
      _C = null;
   }

   ii_(int var1, int var2, int var3, int var4, ca_ var5) {
      super(var1, var2, var3, var4, var5, (pg_)null);
   }

   final StringBuilder a481(int var1, Hashtable var2, StringBuilder var3, byte var4) {
      if (this.a597(var2, var1, -38, var3)) {
         this.a801(var1, var3, var2, 1);
         this.a922(var3, var2, true, var1);
      }

      return var4 >= -76 ? (StringBuilder)null : var3;
   }

   private final void a922(StringBuilder var1, Hashtable var2, boolean var3, int var4) {
      dj_ var5 = new dj_(this._B);

      for(lm_ var6 = (lm_)var5.a024(-479592473); null != var6; var6 = (lm_)var5.c024(17756)) {
         var1.append('\n');

         for(int var7 = 0; var4 >= var7; ++var7) {
            var1.append(' ');
         }

         var6.a481(var4 + 1, var2, var1, (byte)-108);
      }

      if (!var3) {
         _C = (String)null;
      }

   }

   private final void h150(int var1) {
      dj_ var2 = new dj_(this._B);
      if (var1 != 0) {
         a490(22, (byte)122, -68, -5, 99, -3, false);
      }

      for(lm_ var3 = (lm_)var2.a024(-479592473); var3 != null; var3 = (lm_)var2.c024(var1 + 17756)) {
         var3.f150(12591);
      }

   }

   static final void a490(int var0, byte var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var4 > var3) {
         if (1 + var3 < var5) {
            int var7;
            int var8;
            int var9;
            int var10;
            if (var3 + 5 < var5 && var2 != var0) {
               var7 = (var2 >> 1) + (var0 >> 1) + (var2 & var0 & 1);
               var8 = var3;
               var9 = var0;
               var10 = var2;

               int var11;
               for(var11 = var3; var5 > var11; ++var11) {
                  int var12 = ol_._k[var11];
                  int var13 = var6 ? i_._t[var12] : ci_._n[var12];
                  if (var7 >= var13) {
                     if (var10 < var13) {
                        var10 = var13;
                     }
                  } else {
                     ol_._k[var11] = ol_._k[var8];
                     ol_._k[var8++] = var12;
                     if (var9 > var13) {
                        var9 = var13;
                     }
                  }
               }

               var11 = 75 % ((var1 - 0) / 61);
               a490(var0, (byte)94, var9, var3, var4, var8, var6);
               a490(var10, (byte)-127, var2, var8, var4, var5, var6);
            } else {
               for(var7 = var5 - 1; var3 < var7; --var7) {
                  for(var8 = var3; var7 > var8; ++var8) {
                     var9 = ol_._k[var8];
                     var10 = ol_._k[1 + var8];
                     if (r_.a254(var6, var9, var10)) {
                        ol_._k[var8] = var10;
                        ol_._k[var8 + 1] = var9;
                     }
                  }
               }

            }
         }
      }
   }

   void a319(int var1, int var2, lm_ var3, boolean var4) {
      super.a319(var1, var2, var3, var4);
      dj_ var5 = new dj_(this._B);

      for(lm_ var6 = (lm_)var5.a024(-479592473); var6 != null && var6.c154(-18); var6 = (lm_)var5.c024(17756)) {
         var6.a319(super._q + var1, var2 + super._v, var3, var4);
      }

   }

   final String c983(byte var1) {
      dj_ var2 = new dj_(this._B);
      if (var1 < 3) {
         this.a277(70, false, -108, (lm_)null, 67, 9);
      }

      for(lm_ var3 = (lm_)var2.a024(-479592473); var3 != null; var3 = (lm_)var2.c024(17756)) {
         String var4 = var3.c983((byte)80);
         if (null != var4) {
            return var4;
         }
      }

      return null;
   }

   final void e150(int var1) {
      dj_ var2 = new dj_(this._B);

      for(lm_ var3 = (lm_)var2.a024(-479592473); var3 != null; var3 = (lm_)var2.c024(17756)) {
         var3.e150(119);
      }

      if (var1 < 1) {
         _G = -31;
      }

   }

   final void b485(byte var1, lm_ var2) {
      if (var1 > -41) {
         this.a946((lm_)null, -107, -45, -50, -10, (byte)-60, -91);
      }

      this._B.a865(var2, false);
   }

   void a115(int var1, int var2, int var3, int var4) {
      if (var1 == var3 && null != super._o) {
         super._o.a623((byte)34, this, var2, var4, true);
      }

      dj_ var5 = new dj_(this._B);

      for(lm_ var6 = (lm_)var5.b024(-1225818257); var6 != null; var6 = (lm_)var5.d024(1834857157)) {
         var6.a115(var1, super._q + var2, 0, super._v + var4);
      }

   }

   final boolean a427(byte var1) {
      if (var1 < 6) {
         this.a946((lm_)null, -89, 42, 5, 87, (byte)18, -28);
      }

      return this.g698(-20311) != null;
   }

   final boolean a489(byte var1, lm_ var2) {
      if (this._B.a427((byte)-71)) {
         return false;
      } else {
         dj_ var3 = new dj_(this._B);

         for(lm_ var4 = (lm_)var3.a024(-479592473); null != var4; var4 = (lm_)var3.c024(17756)) {
            if (var4.a427((byte)11)) {
               dj_ var5 = new dj_(this._B);
               var5.a071(true, var4);

               for(lm_ var6 = (lm_)var5.c024(17756); null != var6; var6 = (lm_)var5.c024(17756)) {
                  if (var6.a336(34, var2)) {
                     return true;
                  }
               }
            }
         }

         if (var1 != -5) {
            _C = (String)null;
         }

         return false;
      }
   }

   boolean a401(lm_ var1, char var2, int var3, byte var4) {
      dj_ var5 = new dj_(this._B);

      for(lm_ var6 = (lm_)var5.a024(-479592473); var6 != null && var6.c154(-124); var6 = (lm_)var5.c024(17756)) {
         if (var6.a427((byte)59) && var6.a401(var1, var2, var3, (byte)112)) {
            return true;
         }
      }

      if (var4 < 55) {
         _H = (cn_)null;
      }

      if (var3 == 80) {
         return !qk_._e[81] ? this.a489((byte)-5, var1) : this.a059(var1, (byte)71);
      } else {
         return false;
      }
   }

   final int d137(int var1) {
      int var2 = 0;
      dj_ var3 = new dj_(this._B);

      for(lm_ var5 = (lm_)var3.a024(-479592473); null != var5; var5 = (lm_)var3.c024(17756)) {
         int var6 = var5.d137(127);
         if (var2 < var6) {
            var2 = var6;
         }
      }

      return var2;
   }

   final void b050(int var1, int var2, int var3, int var4, int var5) {
      super.b050(var1 ^ var1, var2, var3, var4, var5);
      this.h150(0);
   }

   lm_ g698(int var1) {
      if (var1 != -20311) {
         _C = (String)null;
      }

      dj_ var2 = new dj_(this._B);

      for(lm_ var3 = (lm_)var2.a024(var1 ^ 479612750); null != var3; var3 = (lm_)var2.c024(17756)) {
         if (var3.a427((byte)52)) {
            return var3;
         }
      }

      return null;
   }

   final boolean a336(int var1, lm_ var2) {
      dj_ var3 = new dj_(this._B);
      if (var1 != 34) {
         return true;
      } else {
         for(lm_ var4 = (lm_)var3.a024(-479592473); var4 != null; var4 = (lm_)var3.c024(17756)) {
            if (var4.a336(34, var2)) {
               return true;
            }
         }

         return false;
      }
   }

   final boolean a059(lm_ var1, byte var2) {
      if (this._B.a427((byte)-70)) {
         return false;
      } else {
         dj_ var3 = new dj_(this._B);

         for(lm_ var4 = (lm_)var3.b024(-1225818257); null != var4; var4 = (lm_)var3.d024(1834857157)) {
            if (var4.a427((byte)13)) {
               dj_ var5 = new dj_(this._B);
               var5.a159(var4, false);

               for(lm_ var6 = (lm_)var5.d024(1834857157); var6 != null; var6 = (lm_)var5.d024(1834857157)) {
                  if (var6.a336(34, var1)) {
                     return true;
                  }
               }
            }
         }

         if (var2 != 71) {
            this.g698(51);
         }

         return false;
      }
   }

   final boolean a946(lm_ var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      dj_ var8 = new dj_(this._B);

      for(lm_ var10 = (lm_)var8.a024(-479592473); null != var10 && var10.c154(-76); var10 = (lm_)var8.c024(17756)) {
         if (var10.a946(var1, var2, var3, super._q + var4, var5, (byte)53, super._v + var7)) {
            return true;
         }
      }

      return false;
   }

   final void a277(int var1, boolean var2, int var3, lm_ var4, int var5, int var6) {
      dj_ var7 = new dj_(this._B);

      for(lm_ var8 = (lm_)var7.a024(-479592473); null != var8 && var8.c154(-101); var8 = (lm_)var7.c024(17756)) {
         var8.a277(super._v + var1, true, var3, var4, var5 + super._q, var6);
      }

      if (!var2) {
         a490(-2, (byte)-30, 118, -44, -40, -125, false);
      }

   }
}
