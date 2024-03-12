final class kc_ extends ii_ implements vg_ {
   private int[] _N;
   private se_ _K;
   private int _O = 0;
   static String _P = "If you attempt to raid this dragon you will awaken it.<br><br>Do you wish to proceed?";
   private nk_ _L;
   private ck_[] _T;
   static int[][] _S = new int[9][];
   static int[] _Q;
   static int[] _M;
   static int[][] _V = new int[9][];
   private String _R;
   static int _U;

   final void a871(int var1, int var2, String var3) {
      int var4 = this._O;
      if (var2 == 6824) {
         this.a093(var4 + 1, 0);
         this._T[var4] = this.a592(var3, this, (byte)-82);
         this._N[var4] = var1;
      }
   }

   final void a115(int var1, int var2, int var3, int var4) {
      super.a115(var1, var2, var3 ^ 0, var4);
      this._K.a385(this._R, 14 + var2 + super._q, super._v + var4 + 10, super._x - 28, super._s, 16777215, -1, var3, 0, this._K._H);
   }

   kc_(nk_ var1, se_ var2, String var3) {
      super(0, 0, 288, 0, (ca_)null);
      this._K = var2;
      this._R = var3;
      this._L = var1;
      int var4 = null != this._R ? this._K.a490(this._R, 260, this._K._H) : 0;
      this.b050(0, 288, 0, 0, var4 + 22);
   }

   public final void a475(ck_ var1, byte var2, int var3, int var4, int var5) {
      if (var2 == 98) {
         for(int var6 = 0; this._O > var6; ++var6) {
            if (this._T[var6] == var1) {
               int var7 = this._N[var6];
               if (-1 == var7) {
                  this._L.j423((byte)85);
               } else {
                  sn_.a093(73, this._N[var6]);
               }
               break;
            }
         }

      }
   }

   public static void a150() {
      _M = null;
      _V = (int[][])null;
      _S = (int[][])null;
      _P = null;
      _Q = null;
   }

   static final ki_[] a899(qg_ var0, int var1) {
      if (!var0.a154(var1 + 61)) {
         return new ki_[0];
      } else {
         pn_ var2 = var0.a256(false);

         while(var2._c == 0) {
            pj_.a054(0, 10L);
         }

         if (var2._c == 2) {
            return new ki_[0];
         } else {
            int[] var3 = (int[])((int[])var2._f);
            ki_[] var4 = new ki_[var3.length >> 2];

            for(int var5 = 0; var5 < var4.length; ++var5) {
               ki_ var6 = new ki_();
               var4[var5] = var6;
               var6._g = var3[var5 << 2];
               var6._d = var3[(var5 << 2) + 1];
               var6._b = var3[2 + (var5 << 2)];
               var6._a = var3[3 + (var5 << 2)];
            }

            if (var1 != 10) {
               a899((qg_)null, 35);
            }

            return var4;
         }
      }
   }

   private final void a093(int var1, int var2) {
      if (var1 > this._O) {
         ck_[] var3 = new ck_[var1];
         int[] var4 = new int[var1];

         for(int var5 = var2; this._O > var5; ++var5) {
            var3[var5] = this._T[var5];
            var4[var5] = this._N[var5];
         }

         this._O = var1;
         this._N = var4;
         this._T = var3;
      }
   }

   static final ab_ a263(String var0, boolean var1) {
      if (null != var0 && var0.length() != 0) {
         int var2 = var0.indexOf(64);
         if (var2 != -1) {
            String var3 = var0.substring(0, var2);
            String var4 = var0.substring(var2 + 1);
            ab_ var5 = mo_.a263(var3, var1);
            return null != var5 ? var5 : ed_.a524(var4);
         } else {
            return ri_._e;
         }
      } else {
         return to_._e;
      }
   }

   final ck_ a592(String var1, pg_ var2, byte var3) {
      ck_ var4 = new ck_(var1, var2);
      if (var3 > -73) {
         this.a115(-80, 42, 35, 65);
      }

      var4._o = new na_();
      int var5 = super._s - 2;
      this.b050(0, super._x, 0, 0, super._s + 34);
      var4.b050(0, super._x - 14, var5, 7, 30);
      this.b485((byte)-126, var4);
      return var4;
   }

   static {
      int var0;
      int var1;
      for(var0 = 0; 8 >= var0; ++var0) {
         _S[var0] = new int[32];
         var1 = var0 * 8 + 106;
         int var2 = 8 * var0 + 192;
         int var3 = 80 + 6 * var0;
         int var4 = 6 * var0 + 144;
         int var5 = var0 * 10;
         int var6 = var0 * 10 + 8;

         int var7;
         int var8;
         int var9;
         int var10;
         for(var7 = 0; 32 > var7; ++var7) {
            var8 = (var2 - var1) * var7 / 32 + var1;
            var9 = var3 + var7 * (var4 - var3) / 32;
            var10 = (-var5 + var6) * var7 / 32 + var5;
            _S[var0][var7] = mp_.a080(mp_.a080(var9 << 8, mp_.a080(-445743104, var8) << 16), var10);
         }

         var4 = 4 * var0 + 223;
         var2 = 223 + var0 * 4;
         var1 = 128 + var0 * 8;
         var6 = var0 * 4 + 223;
         _V[var0] = new int[32];
         var3 = 128 + 8 * var0;
         var5 = 96 + 6 * var0;

         for(var7 = 0; var7 < 32; ++var7) {
            var8 = var7 * (var2 - var1) / 32 + var1;
            var9 = (var4 - var3) * var7 / 32 + var3;
            var10 = var5 + (var6 - var5) * var7 / 32;
            _V[var0][var7] = mp_.a080(mp_.a080(mp_.a080(var8, 77168640) << 16, var9 << 8), var10);
         }
      }

      _M = new int[32];

      for(var0 = 0; var0 < 32; ++var0) {
         var1 = 112 + var0 * 2;
         _M[var0] = mp_.a080(var1 * 65793, Integer.MIN_VALUE);
      }

   }
}
