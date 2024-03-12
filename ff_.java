final class ff_ {
   private int[] _b = new int[256];
   static String[] _f = new String[]{"<%0> of the Orb", "<%0> the Wise", "<%0> the Cunning", "<%0> the Potent", "<%0> the Mighty", "<%0>, Mistress of the Tower", "<%0> the Magnificent", "<%0> the Unbound"};
   private int _c;
   private int _d;
   private int _e;
   private int[] _g = new int[256];
   private int _a;

   final int a137(int var1) {
      if (this._a == 0) {
         this.b150(256);
         this._a = 256;
      }

      return var1 != 26979 ? -68 : this._b[--this._a];
   }

   private final void b423(byte var1) {
      int var6 = -1640531527;
      int var9 = -1640531527;
      int var4 = -1640531527;
      int var7 = -1640531527;
      int var10 = -1640531527;
      int var8 = -1640531527;
      int var3 = -1640531527;
      if (var1 <= 66) {
         c150(89);
      }

      int var5 = -1640531527;

      int var2;
      for(var2 = 0; 4 > var2; ++var2) {
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var5 += var6;
         var7 += var4;
         var5 ^= var6 << 8;
         var6 += var7;
         var8 += var5;
         var6 ^= var7 >>> 16;
         var7 += var8;
         var9 += var6;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var10 += var3;
         var4 += var9;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
      }

      for(var2 = 0; 256 > var2; var2 += 8) {
         var10 += this._b[var2 + 7];
         var6 += this._b[3 + var2];
         var3 += this._b[var2];
         var5 += this._b[2 + var2];
         var8 += this._b[5 + var2];
         var4 += this._b[var2 + 1];
         var9 += this._b[var2 + 6];
         var7 += this._b[4 + var2];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var6 += var7;
         var8 += var5;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var8 += var9;
         var10 += var7;
         var8 ^= var9 >>> 4;
         var9 += var10;
         var3 += var8;
         var9 ^= var10 << 8;
         var10 += var3;
         var4 += var9;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this._g[var2] = var3;
         this._g[1 + var2] = var4;
         this._g[var2 + 2] = var5;
         this._g[var2 + 3] = var6;
         this._g[4 + var2] = var7;
         this._g[5 + var2] = var8;
         this._g[6 + var2] = var9;
         this._g[var2 + 7] = var10;
      }

      for(var2 = 0; 256 > var2; var2 += 8) {
         var6 += this._g[var2 + 3];
         var8 += this._g[5 + var2];
         var9 += this._g[6 + var2];
         var4 += this._g[var2 + 1];
         var3 += this._g[var2];
         var7 += this._g[4 + var2];
         var5 += this._g[2 + var2];
         var10 += this._g[var2 + 7];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var5 += var6;
         var7 += var4;
         var5 ^= var6 << 8;
         var6 += var7;
         var8 += var5;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var8 += var9;
         var10 += var7;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this._g[var2] = var3;
         this._g[1 + var2] = var4;
         this._g[var2 + 2] = var5;
         this._g[3 + var2] = var6;
         this._g[4 + var2] = var7;
         this._g[5 + var2] = var8;
         this._g[var2 + 6] = var9;
         this._g[7 + var2] = var10;
      }

      this.b150(256);
      this._a = 256;
   }

   private final void b150(int var1) {
      this._c += ++this._e;
      if (var1 == 256) {
         for(int var2 = 0; 256 > var2; ++var2) {
            int var3 = this._g[var2];
            if (0 == (var2 & 2)) {
               if ((var2 & 1) == 0) {
                  this._d ^= this._d << 13;
               } else {
                  this._d ^= this._d >>> 6;
               }
            } else if (0 == (var2 & 1)) {
               this._d ^= this._d << 2;
            } else {
               this._d ^= this._d >>> 16;
            }

            this._d += this._g[var2 + 128 & 255];
            int var4;
            this._g[var2] = var4 = this._g[nb_.a080(var3 >> 2, 255)] + this._d + this._c;
            this._b[var2] = this._c = this._g[nb_.a080(255, var4 >> 8 >> 2)] + var3;
         }

      }
   }

   static final cn_ a373() {
      int var0 = jc_._f[0] * jn_._k[0];
      byte[] var1 = ub_._q[0];
      int[] var2 = new int[var0];

      for(int var3 = 0; var3 < var0; ++var3) {
         var2[var3] = uo_._b[nb_.a080(255, var1[var3])];
      }

      cn_ var4 = new cn_(ce_._x, tb_._i, hg_._t[0], fe_._g[0], jc_._f[0], jn_._k[0], var2);
      sb_.a150();
      return var4;
   }

   public static void c150(int var0) {
      if (var0 < -72) {
         _f = null;
      }
   }

   ff_(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this._b[var2] = var1[var2];
      }

      this.b423((byte)77);
   }
}
