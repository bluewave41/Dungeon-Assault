import java.util.Hashtable;
import java.util.Random;

abstract class da_ extends lm_ implements aa_ {
   lm_ _D;
   static int _C;
   static int _B;
   static String _E = "The amount of Treasure lost by resets is decreased by 5%";

   void a115(int var1, int var2, int var3, int var4) {
      if (var3 == var1 && null != super._o) {
         super._o.a623((byte)34, this, var2, var4, true);
      }

      if (this._D != null) {
         this._D.a115(var1, super._q + var2, 0, super._v + var4);
      }

   }

   void a277(int var1, boolean var2, int var3, lm_ var4, int var5, int var6) {
      if (null != this._D) {
         this._D.a277(super._v + var1, true, var3, var4, var5 + super._q, var6);
      }

      if (!var2) {
         _B = 25;
      }

   }

   final void a350(boolean var1, StringBuilder var2, int var3, Hashtable var4) {
      var2.append('\n');

      for(int var5 = 0; var5 <= var3; ++var5) {
         var2.append(' ');
      }

      if (this._D == null) {
         var2.append("null");
      } else {
         this._D.a481(1 + var3, var4, var2, (byte)-110);
      }

      if (!var1) {
         this._D = (lm_)null;
      }

   }

   String c983(byte var1) {
      if (var1 <= 3) {
         this.a401((lm_)null, 'ￅ', 105, (byte)-45);
      }

      String var2 = super.c983((byte)38);
      if (null != this._D) {
         String var3 = this._D.c983((byte)41);
         if (var3 != null) {
            return var3;
         }
      }

      return var2;
   }

   boolean a946(lm_ var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      return null != this._D && this._D.a946(var1, var2, var3, super._q + var4, var5, (byte)-117, super._v + var7);
   }

   private final boolean a059(lm_ var1, byte var2) {
      if (var2 <= 35) {
         return false;
      } else {
         return this._D != null && !this._D.a427((byte)101) && this._D.a336(34, var1);
      }
   }

   final int d137(int var1) {
      return null == this._D ? 0 : this._D.d137(-38);
   }

   private final boolean b336(int var1, lm_ var2) {
      if (var1 != 2) {
         this.g698(79);
      }

      return null != this._D && !this._D.a427((byte)41) && this._D.a336(34, var2);
   }

   lm_ g698(int var1) {
      lm_ var2 = this._D;
      if (var2 != null && var2.a427((byte)65)) {
         return var2;
      } else {
         if (var1 != 1) {
            this.a946((lm_)null, 22, -91, -111, -54, (byte)90, 48);
         }

         return null;
      }
   }

   final boolean a336(int var1, lm_ var2) {
      if (var1 != 34) {
         return true;
      } else {
         return null != this._D && this._D.a336(34, var2);
      }
   }

   void a319(int var1, int var2, lm_ var3, boolean var4) {
      super.a319(var1, var2, var3, var4);
      if (this._D != null) {
         this._D.a319(var1 + super._q, var2 + super._v, var3, true);
      }

   }

   final void e150(int var1) {
      if (var1 < 1) {
         _B = -12;
      }

      if (null != this._D) {
         this._D.e150(33);
      }

   }

   da_(int var1, int var2, int var3, int var4, ca_ var5, pg_ var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   final boolean a427(byte var1) {
      if (var1 < 6) {
         _E = (String)null;
      }

      return this.g698(1) != null;
   }

   static final void a563(String var0, int[] var1, int var2, int var3, int var4, se_ var5) {
      tf_ var6 = new tf_(var5, var0, var1);
      var6.b326(-var5._H + var4, 32, var2 - (var6._i >> 1));
      if (var3 != 1917623617) {
         _C = -116;
      }

   }

   final boolean a276(int var1, int var2, int var3, int var4, int var5, lm_ var6, byte var7) {
      if (var7 != -84) {
         a734((wm_)null, (byte)48, (Random)null);
      }

      return null != this._D && this._D.a427((byte)82) && this._D.a276(var1, var2, var3, var4, var5, var6, (byte)-84);
   }

   StringBuilder a481(int var1, Hashtable var2, StringBuilder var3, byte var4) {
      if (var4 > -76) {
         _E = (String)null;
      }

      if (this.a597(var2, var1, -66, var3)) {
         this.a801(var1, var3, var2, 1);
         this.a350(true, var3, var1, var2);
      }

      return var3;
   }

   final boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (this._D != null && this._D.a427((byte)91) && this._D.a401(var1, var2, var3, (byte)75)) {
         return true;
      } else if (80 != var3) {
         if (var4 <= 55) {
            this.a946((lm_)null, -62, -81, -47, 98, (byte)-16, -14);
         }

         return false;
      } else {
         return qk_._e[81] ? this.b336(2, var1) : this.a059(var1, (byte)36);
      }
   }

   static final ai_[] a734(wm_ var0, byte var1, Random var2) {
      me_._g = new ai_[49];
      a_._o = var0;

      int var3;
      for(var3 = 0; 49 > var3; ++var3) {
         me_._g[var3] = new ai_(0);
      }

      me_._g[24] = new ai_(2);
      me_._g[0] = new ai_(3);
      me_._g[6] = new ai_(3);
      me_._g[42] = new ai_(3);
      me_._g[48] = new ai_(3);
      mp_.a308(var2, il_._d, -127, 0, 2);
      mp_.a308(var2, il_._d, -127, 6, 2);
      mp_.a308(var2, il_._d, -127, 42, 2);
      mp_.a308(var2, il_._d, -128, 48, 2);
      mp_.a308(var2, oa_._e, -128, 0, 1);
      var3 = -91 % ((-10 - var1) / 37);
      mp_.a308(var2, oa_._e, -127, 6, 1);
      mp_.a308(var2, oa_._e, -128, 42, 1);
      mp_.a308(var2, oa_._e, -128, 48, 1);

      label47:
      for(int var4 = 0; var4 < 49; ++var4) {
         if (uj_.a004(var2, 37, 5) == 0 && 0 == me_._g[var4]._a) {
            int[] var5 = nf_.a197(a_._o, var4);
            int[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if (0 == var8 || 6 == var8 || var8 == 42 || 48 == var8) {
                  continue label47;
               }
            }

            if (uj_.a004(var2, 37, 2) == 0) {
               var6 = il_._d;
            } else {
               var6 = oa_._e;
            }

            me_._g[var4] = new ai_(var6[uj_.a004(var2, 37, var6.length)]);
         }
      }

      return me_._g;
   }

   public static void a150(int var0) {
      _E = null;
      if (var0 != 6) {
         a150(38);
      }

   }

   final void b050(int var1, int var2, int var3, int var4, int var5) {
      super.b050(var1 + var1, var2, var3, var4, var5);
      this.e423((byte)-95);
   }

   static final cn_[] a632(String var0, String var1, int var2, nh_ var3) {
      int var4 = var3.a913(var0, 1000);
      int var5 = var3.a026(var2, var1, var4);
      return li_.a298(var4, var5, var3, 4);
   }

   void e423(byte var1) {
      if (var1 > -4) {
         _B = -122;
      }

      if (null != this._D) {
         this._D.f150(12591);
      }

   }
}
