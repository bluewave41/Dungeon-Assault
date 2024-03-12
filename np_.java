import java.applet.Applet;

class np_ extends rj_ {
   static String _G = "Raider avoided guardian and disarmed it.";
   static String[] _z = new String[]{"Armoured", "The heavy plate armour worn by the <%0> negates the first blow he recieves each combat."};
   static rj_ _M;
   static ab_ _E = new ab_();
   static nh_ _A;
   private int[] _L;
   static boolean _D = false;
   boolean _N = true;
   static int[] _I = new int[6];
   static cn_ _F;
   md_ _J;
   static String[] _C = new String[]{null, "Each dungeon room may contain a <%monster>, a <%trap>, or a <%guardian>. These different types of rooms will be explained as you encounter them.<br><br><%command>Continue exploring the dungeon. Move your party towards the hoard room.</col>"};
   static int _K;

   void a599(int var1, int var2, byte var3) {
      if (this._N) {
         if (null == this._L) {
            this._L = new int[4];
         }

         gf_.a331(this._L);
         gf_.a115(var1 + super._t, var2 + super._i, super._q + super._t + var1, var2 + super._x + super._i);
         if (null != this._J) {
            for(rj_ var5 = (rj_)this._J.e024(-24172); var5 != null; var5 = (rj_)this._J.a024(4)) {
               var5.a599(var1, var2, (byte)122);
            }
         }

         gf_.b331(this._L);
      }
   }

   static final void a812(byte var0, Applet var1) {
      mm_._k = true;
      String var2 = "tuhstatbut";
      String var3 = "rvnadlm";
      if (var0 < -121) {
         long var4 = -1L;
         lm_.a890(false, var2, var4, var1, var3);
      }
   }

   static final String b661(int var0) {
      return k_.a460((byte)-122, 3, 3, var0);
   }

   static final void d423() {
      gg_.a693((String)null, he_._m);
   }

   void b423(byte var1) {
      if (null != this._J) {
         for(rj_ var2 = (rj_)this._J.e024(var1 ^ -24182); var2 != null; var2 = (rj_)this._J.a024(4)) {
            var2.b423((byte)30);
         }
      }

      super.b423(var1);
   }

   void a720(rj_ var1, byte var2) {
      if (var2 > -27) {
         _I = (int[])null;
      }

      int var3 = super._t;
      if (0 != (1 & var1._v)) {
         var3 += super._q;
      }

      int var4 = super._i;
      if (0 != (var1._v & 2)) {
         var4 += super._x;
      }

      var1.e326(var4, var3, 100);
      if (null == this._J) {
         this._J = new md_();
      }

      this._J.b865(var1, false);
      var1._r = this;
   }

   np_(int var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4, 0);
   }

   public static void c423() {
      _G = null;
      _I = null;
      _z = null;
      _F = null;
      _E = null;
      _A = null;
      _M = null;
      _C = null;
   }

   void e326(int var1, int var2, int var3) {
      if (var2 != 0 || 0 != var1) {
         if (null != this._J) {
            for(rj_ var4 = (rj_)this._J.e024(-24172); null != var4; var4 = (rj_)this._J.a024(4)) {
               var4.e326(var1, var2, 75);
            }
         }

         if (var3 < 69) {
            this.b326(-70, -8, 121);
         }

         super._i += var1;
         super._t += var2;
      }
   }

   void a183(boolean var1, int var2, int var3) {
      int var4 = var2 - super._q;
      int var5 = var3 - super._x;
      if (var1) {
         _A = (nh_)null;
      }

      if (this._J != null) {
         for(rj_ var6 = (rj_)this._J.e024(-24172); null != var6; var6 = (rj_)this._J.a024(4)) {
            if ((var6._v & 4) != 0) {
               var6.e326(0, var4, 111);
            }

            if (0 != (8 & var6._v)) {
               var6.e326(var5, 0, 92);
            }
         }
      }

      int var8 = 0 == (super._v & 1) ? 0 : -var4;
      int var7 = (2 & super._v) != 0 ? -var5 : 0;
      this.e326(var7, var8, 115);
      super._q = var2;
      super._x = var3;
   }

   void b326(int var1, int var2, int var3) {
      if (this._N) {
         if (this._L == null) {
            this._L = new int[4];
         }

         gf_.a331(this._L);
         gf_.a115(super._t + var1, var3 + super._i, var1 + super._q + super._t, super._i + super._x + var3);
         if (var2 != 8187) {
            this.a759(-49, 0, 87);
         }

         if (null != this._J) {
            for(rj_ var4 = (rj_)this._J.e024(-24172); var4 != null; var4 = (rj_)this._J.a024(4)) {
               var4.b326(var1, 8187, var3);
            }
         }

         gf_.b331(this._L);
      }
   }

   rj_ a759(int var1, int var2, int var3) {
      if (!this.a683((byte)117, var2, var3)) {
         return null;
      } else {
         if (var1 >= -10) {
            a812((byte)33, (Applet)null);
         }

         if (this._J != null) {
            for(rj_ var4 = (rj_)this._J.e024(-24172); null != var4; var4 = (rj_)this._J.a024(4)) {
               rj_ var5;
               if ((var5 = var4.a759(-31, var2, var3)) != null) {
                  return var5;
               }
            }
         }

         return this;
      }
   }
}
