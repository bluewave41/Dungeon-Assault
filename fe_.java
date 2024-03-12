final class fe_ extends l_ {
   private boolean _q;
   private String _l;
   private int _j;
   static md_ _k = new md_();
   private int _m;
   private int _p;
   private int _h;
   private se_ _i;
   static int[] _g;
   static String[] _n = new String[]{"Reconnoitre", "Reveal two rooms at start of game. (Single use)"};
   private int _o;

   final void a950(int var1, byte var2, String var3, se_ var4, int var5) {
      if (var3 != null) {
         if (var4 != this._i || !this._q || 2 != this._h || this._l == null || !this._l.equals(var3)) {
            this._l = var3;
            this._q = true;
            this._i = var4;
            this._h = 2;
            tg_ var7 = this.a392(var3, var5, var4, 0);
            var7._k[0] = var1 - var4.b926(var3);
            var7._k[var3.length()] = var1;
            bf_.a966(var3, var7, 0, var4);
         }
      } else {
         super._e = null;
      }
   }

   final void a777(String var1, int var2, se_ var3, int var4, int var5) {
      if (null == var1) {
         super._e = null;
      } else if (var3 != this._i || !this._q || 0 != this._h || this._l == null || !this._l.equals(var1)) {
         this._h = 0;
         this._i = var3;
         this._q = true;
         this._l = var1;
         if (var2 <= -17) {
            tg_ var6 = this.a392(var1, var5, var3, 0);
            var6._k[0] = var4;
            var6._k[var1.length()] = var4 + var3.b926(var1);
            bf_.a966(var1, var6, 0, var3);
         }
      }
   }

   public static void b423(byte var0) {
      if (var0 > -33) {
         b423((byte)-23);
      }

      _n = null;
      _g = null;
      _k = null;
   }

   private final tg_ a392(String var1, int var2, se_ var3, int var4) {
      if (var4 != 0) {
         return (tg_)null;
      } else {
         tg_ var5 = new tg_(var2 - var3._H, var3._E + var2, var1.length());
         super._e = new tg_[]{var5};
         return var5;
      }
   }

   final void a972(int var1, String var2, se_ var3, byte var4, int var5) {
      if (var2 != null) {
         if (var3 != this._i || !this._q || 1 != this._h || null == this._l || !this._l.equals(var2)) {
            this._h = 1;
            this._q = true;
            this._i = var3;
            tg_ var6 = this.a392(var2, var1, var3, 0);
            int var7 = var3.b926(var2);
            var6._k[0] = var5 - (var7 >> 1);
            var6._k[var2.length()] = var5 + (var7 >> 1);
            bf_.a966(var2, var6, 0, var3);
         }
      } else {
         super._e = null;
      }
   }

   final void a804(String var1, int var2, int var3, int var4, int var5, int var6, int var7, se_ var8) {
      if (0 == var7) {
         var7 = var8._R;
      }

      if (null != var1) {
         if (var8 != this._i || this._q || var5 != this._h || this._p != var3 || this._o != var7 || var4 != this._m || this._j != var6 || null == this._l || !this._l.equals(var1)) {
            this._p = var3;
            this._h = var5;
            this._q = false;
            this._m = var4;
            this._j = var6;
            this._o = var7;
            this._l = var1;
            this._i = var8;
            String[] var9 = new String[var8.c913(var1, var6) + 1];
            int var10 = Math.max(1, var8.a899(var1, new int[]{var6}, var9));
            if (this._p == 3 && 1 == var10) {
               this._p = 1;
            }

            int var11;
            int var12;
            if (this._p != var2) {
               if (1 != this._p) {
                  if (2 == this._p) {
                     var11 = -var8._E + this._m - var10 * this._o;
                  } else {
                     var12 = (this._m - this._o * var10) / (var10 + 1);
                     if (0 > var12) {
                        var12 = 0;
                     }

                     this._o += var12;
                     var11 = var8._H + var12;
                  }
               } else {
                  var11 = (-(this._o * var10) + this._m >> 1) + var8._H;
               }
            } else {
               var11 = var8._H;
            }

            super._e = new tg_[var10];

            for(var12 = 0; var12 < var10; ++var12) {
               String var13 = var9[var12];
               tg_ var14 = new tg_(-var8._H + var11, var11 + var8._E, null != var13 ? var13.length() : 0);
               var14._k[0] = 0;
               if (null != var13) {
                  var14._k[var13.length()] = var8.b926(var13);
                  bf_.a966(var13, var14, 3 == var5 ? this.a655(var13, var2 + 0, var8.b926(var13), var6) : 0, var8);
               }

               var11 += var7;
               super._e[var12] = var14;
            }

         }
      } else {
         super._e = null;
      }
   }

   public fe_() {
   }
}
