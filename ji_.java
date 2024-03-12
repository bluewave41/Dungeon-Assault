final class ji_ extends da_ {
   static int[] _F = new int[32];
   static cn_ _G;
   static String _H;
   private md_ _I = new md_();

   final void a336(lm_ var1, int var2) {
      if (var1 instanceof rf_) {
         if (var2 == -1) {
            rf_ var3 = (rf_)var1;
            this._I.b865(var3, false);
            var3._T = true;
            var3.a336(34, this);
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   final void a115(int var1, int var2, int var3, int var4) {
      if (super._o != null) {
         super._o.a623((byte)34, this, var2, var4, true);
      }

      dj_ var5 = new dj_(this._I);
      if (var3 != 0) {
         this._I = (md_)null;
      }

      for(lm_ var6 = (lm_)var5.b024(-1225818257); null != var6; var6 = (lm_)var5.d024(1834857157)) {
         var6.a115(var1, var2 + super._q, 0, var4 + super._v);
      }

   }

   static final int a760(int var0, boolean var1, int var2) {
      return var1 ? 48 : uj_.a004(ld_._f, 37, 1 - var2 + var0) + var2;
   }

   static final boolean a896(String var0) {
      try {
         if (!qg_._n.startsWith("win")) {
            return false;
         } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
            return false;
         } else {
            String var1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

            for(int var2 = 0; var0.length() > var2; ++var2) {
               if (-1 == var1.indexOf(var0.charAt(var2))) {
                  return false;
               }
            }

            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
            return true;
         }
      } catch (Exception var3) {
         return false;
      }
   }

   final void b487(boolean var1) {
      dj_ var2 = new dj_(this._I);
      if (!var1) {
         a760(-59, true, -77);
      }

      for(rf_ var3 = (rf_)var2.a024(-479592473); null != var3; var3 = (rf_)var2.c024(17756)) {
         if (var3.f427((byte)-90)) {
            var3.a487(false);
         }
      }

      super._D = this.i149(32);
   }

   public ji_() {
      super(0, 0, hn_._t, vf_._x, (ca_)null, (pg_)null);
   }

   final void j150(int var1) {
      dj_ var2 = new dj_(this._I);
      if (var1 != -33) {
         a760(-41, true, -105);
      }

      for(rf_ var3 = (rf_)var2.a024(-479592473); null != var3; var3 = (rf_)var2.c024(17756)) {
         if (var3.i154(462)) {
            var3.a487(false);
         }
      }

   }

   final lm_ g698(int var1) {
      if (var1 != 1) {
         this.a336((lm_)null, 10);
      }

      dj_ var2 = new dj_(this._I);

      for(rf_ var3 = (rf_)var2.a024(-479592473); null != var3; var3 = (rf_)var2.c024(var1 + 17755)) {
         if (var3._T) {
            return var3.g698(var1 - 20312);
         }
      }

      return null;
   }

   final void h150(int var1) {
      if (var1 != 1) {
         _F = (int[])null;
      }

      dj_ var2 = new dj_(this._I);

      for(rf_ var3 = (rf_)var2.a024(-479592473); null != var3; var3 = (rf_)var2.c024(var1 ^ 17757)) {
         var3._T = false;
      }

      super._D = null;
   }

   public static void f423(byte var0) {
      _H = null;
      _G = null;
      if (var0 != -98) {
         f423((byte)-89);
      }

      _F = null;
   }

   final rf_ i149(int var1) {
      if (var1 != 32) {
         return (rf_)null;
      } else {
         dj_ var2 = new dj_(this._I);

         for(rf_ var3 = (rf_)var2.a024(-479592473); null != var3; var3 = (rf_)var2.c024(17756)) {
            if (var3._T) {
               return var3;
            }
         }

         return null;
      }
   }

   static {
      for(int var0 = 0; 32 > var0; ++var0) {
         int var1 = var0 * 1 + 32;
         _F[var0] = 65793 * var1;
      }

      _H = "You have collected <%0> consecutive bounties";
   }
}
