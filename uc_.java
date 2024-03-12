final class uc_ extends lm_ {
   static String _L = "Waiting for animations";
   private int _O;
   boolean _R;
   static ph_ _E;
   static String[] _K;
   private cn_ _D;
   private int _H;
   int _S;
   private int _B;
   private cn_ _P;
   static String _Q = "Aged by goblin standards, the goblin scout didn't get that way through reckless bravery, but though cowardly, he can generally find a way out of any situation.";
   static String _C = "My Dungeon";
   static nh_ _I;
   private int _J;
   private int _F;
   private cn_[] _M;
   private int _G;
   private cn_ _T;

   private final cn_ b749(boolean var1) {
      int var2 = super._s >> 1;
      cn_ var3 = new cn_(var2, super._s);
      lm_.a901(var3);

      for(int var4 = 0; var4 < super._s; ++var4) {
         for(int var5 = 0; var5 < var2; ++var5) {
            double var6 = (double)var5 * (double)var5 / (double)((super._s - var4) * var4);
            int var8 = 1;
            if (var6 < 1.0) {
               var6 = Math.sqrt(-var6 + 1.0);
               var8 = var6 >= 1.0 ? 255 : (int)(var6 * 255.0);
            }

            gf_.a326(var5, var4, var8 << 8 | var8 | var8 << 16);
         }
      }

      ti_.c487(var1);
      return var3;
   }

   private final cn_ b468(int var1, int var2, int var3) {
      cn_ var4 = new cn_(2 * this._B, super._s);
      lm_.a901(var4);
      int var5 = super._s >> 1;

      int var6;
      for(var6 = 0; var6 < super._s; ++var6) {
         int var7 = (var6 >> 1) * (this._B * 2 - 1) % (this._B * 2);
         int var8 = 16711935 & var3;
         int var9 = var3 & '\uff00';
         int var10 = var6 - var5;
         int var11 = 128 + (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
         int var12 = 256 > var11 ? (var11 * var9 & 16711680 | var11 * var8 & -16711936) >>> 8 : var9 | var8;
         gf_.b115(var7, var6, this._B, var12);
         gf_.b115(var7 - this._B * 2, var6, this._B, var12);
         var9 = var1 & '\uff00';
         var8 = 16711935 & var1;
         var12 = var11 >= 256 ? var9 | var8 : (var11 * var9 & 16711680 | var8 * var11 & -16711936) >>> 8;
         gf_.b115(this._B + var7, var6, this._B, var12);
         gf_.b115(var7 - this._B, var6, this._B, var12);
      }

      ti_.c487(true);
      var6 = 87 / ((15 - var2) / 57);
      return var4;
   }

   private final void a558(int var1, int var2, int var3, cn_ var4) {
      int var5 = var3 + super._x;
      d_.a713(this._D._y + var3, super._s + var2, var5 - this._D._y, var2);
      int var6 = var3 - this._O;

      int var7;
      for(var7 = -26 / ((-35 - var1) / 41); var5 > var6; var6 += var4._y) {
         var4.h093(var6, var2);
      }

      ti_.c487(true);
      if (gf_._j <= var3 + this._D._y) {
         lm_.a901(this._P);
         var4.h093(-this._O, 0);
         var4.h093(-this._O + 2 * this._B, 0);
         this._T.d093(0, 0);
         ti_.c487(true);
         this._P.h093(var3, var2);
      }

      if (gf_._h >= var5 - this._D._y) {
         lm_.a901(this._P);

         for(var7 = super._x + -this._D._y + this._O; var7 > this._B * 2; var7 -= this._B * 2) {
         }

         var4.h093(-var7, 0);
         var4.h093(2 * this._B - var7, 0);
         this._D.d093(0, 0);
         ti_.c487(true);
         this._P.h093(var5 - this._D._y, var2);
      }

   }

   static final boolean g154() {
      return so_._b != null;
   }

   final void b050(int var1, int var2, int var3, int var4, int var5) {
      super.b050(var1 ^ var1, var2, var3, var4, var5);
      this.a150(var1 ^ -370091864);
   }

   static final void a923(int var0, int var1, int var2, cn_ var3, int var4, int var5, int var6) {
      if (gf_._j > var4) {
         var2 -= -var4 + gf_._j;
         var4 = gf_._j;
      }

      if (gf_._f > var6) {
         var5 -= -var6 + gf_._f;
         var6 = gf_._f;
      }

      if (var2 + var4 > gf_._h) {
         var2 = gf_._h - var4;
      }

      if (var6 + var5 > gf_._e) {
         var5 = -var6 + gf_._e;
      }

      if (0 < var2 && var5 > 0) {
         cn_ var7 = var3.d125();
         int[] var8 = gf_._b;
         int var9 = gf_._i;
         int var10 = gf_._c;
         int[] var11 = new int[4];
         gf_.a331(var11);
         var3.e797();
         gf_.a115(var11[0], var11[1], var11[2], var11[3]);
         int var12 = var3._y * var6 + var4;
         int var13 = -var2 + var3._y;
         int[] var14 = var7._B;

         for(int var15 = var6; var5 + var6 > var15; ++var15) {
            for(int var16 = var4; var16 < var4 + var2; ++var16) {
               int var17 = var14[var12];
               if (0 != var17 && (0 < var16 && var14[var12 - 1] == 0 || 0 < var15 && var14[-var3._y + var12] == 0 || var3._y - 1 > var16 && var14[var12 + 1] == 0 || var15 < var3._v - 1 && 0 == var14[var3._y + var12])) {
                  gf_.f115(var16, var15, var1, var0);
               }

               ++var12;
            }

            var12 += var13;
         }

         var7.h093(-var3._w, -var3._A);
         gf_.a397(var8, var9, var10);
         gf_.b331(var11);
      }
   }

   public static void c487(boolean var0) {
      _Q = null;
      _E = null;
      _K = null;
      _C = null;
      _I = null;
      if (var0) {
         c487(true);
      }

      _L = null;
   }

   final void a319(int var1, int var2, lm_ var3, boolean var4) {
      if (!var4) {
         g154();
      }

      if (this._R) {
         ++this._O;
         if (2 * this._B < this._O) {
            this._O -= 2 * this._B;
         }
      }

   }

   final void a115(int var1, int var2, int var3, int var4) {
      if (var1 == 0) {
         int var5 = super._q + var2;
         int var6 = var4 + super._v;
         this.a558(var3 ^ -97, var6, var5, this._M[var3]);
         if (65536 > this._S) {
            d_.a713(var5 + (super._x * this._S >> 16), var6 + super._s, super._x + var5, var6);
            this.a558(-99, var6, var5, this._M[1]);
            ti_.c487(true);
         }

      }
   }

   uc_(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this(var1, var2, var3, var4, var5, var6, var7, var6 >> 1 & 8355711, 8355711 & var7 >> 1);
   }

   static final boolean a331(int var0, char var1) {
      if (var0 != -854857176) {
         return true;
      } else {
         return var1 >= 'A' && 'Z' >= var1 || 'a' <= var1 && var1 <= 'z';
      }
   }

   final void b789(int var1, byte var2, int var3) {
      this._G = var1;
      this._J = var3 >> 1 & 8355711;
      this._F = var3;
      this._H = 8355711 & var1 >> 1;
      if (var2 != 94) {
         this._P = (cn_)null;
      }

      this.a150(-370091864);
   }

   private uc_(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this._G = var7;
      this._H = var9;
      this._B = var5;
      this._F = var6;
      this._J = var8;
      this.b050(0, var3, var2, var1, var4);
   }

   private final void a150(int var1) {
      if (var1 != -370091864) {
         _Q = (String)null;
      }

      this._M = new cn_[]{this.b468(this._G, -123, this._F), this.b468(this._H, -88, this._J)};
      this._D = this.b749(true);
      this._T = this._D.b125();
      this._P = new cn_(super._s >> 1, super._s);
   }
}
