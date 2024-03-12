final class ol_ {
   private long[] _f = new long[8];
   private long[] _g = new long[8];
   private long[] _j = new long[8];
   static int[] _k;
   private byte[] _m = new byte[64];
   static af_ _i;
   private int _h = 0;
   private long[] _c = new long[8];
   private byte[] _l = new byte[32];
   private int _d = 0;
   static cn_[] _a;
   private long[] _e = new long[8];
   static cn_ _b;

   final void a331(byte var1, byte[] var2, int var3) {
      this._m[this._h] = (byte)mp_.a080(this._m[this._h], 128 >>> nb_.a080(this._d, 7));
      if (var1 != -88) {
         this.b150(-45);
      }

      ++this._h;
      if (this._h > 32) {
         while(this._h < 64) {
            this._m[this._h++] = 0;
         }

         this.a150(var1 + 96);
         this._h = 0;
      }

      while(this._h < 32) {
         this._m[this._h++] = 0;
      }

      cj_.a278(this._l, 0, this._m, 32, 32);
      this.a150(8);
      int var4 = 0;

      for(int var5 = var3; var4 < 8; var5 += 8) {
         long var6 = this._g[var4];
         var2[var5] = (byte)((int)(var6 >>> 56));
         var2[1 + var5] = (byte)((int)(var6 >>> 48));
         var2[2 + var5] = (byte)((int)(var6 >>> 40));
         var2[var5 + 3] = (byte)((int)(var6 >>> 32));
         var2[var5 + 4] = (byte)((int)(var6 >>> 24));
         var2[var5 + 5] = (byte)((int)(var6 >>> 16));
         var2[var5 + 6] = (byte)((int)(var6 >>> 8));
         var2[var5 + 7] = (byte)((int)var6);
         ++var4;
      }

   }

   final void b150(int var1) {
      int var2;
      for(var2 = 0; 32 > var2; ++var2) {
         this._l[var2] = 0;
      }

      this._d = 0;
      this._m[0] = 0;
      this._h = 0;

      for(var2 = 0; 8 > var2; ++var2) {
         this._g[var2] = 0L;
      }

   }

   private final void a150(int var1) {
      int var2 = 0;

      int var3;
      for(var3 = 0; 8 > var2; var3 += 8) {
         this._j[var2] = mn_.a833(eg_.a833(255L, (long)this._m[7 + var3]), mn_.a833(eg_.a833((long)this._m[6 + var3], 255L) << 8, mn_.a833(mn_.a833(eg_.a833(255L, (long)this._m[4 + var3]) << 24, mn_.a833(eg_.a833(255L, (long)this._m[var3 + 3]) << 32, mn_.a833(eg_.a833((long)this._m[2 + var3] << 40, 280375465082880L), mn_.a833(eg_.a833(255L, (long)this._m[1 + var3]) << 48, (long)this._m[var3] << 56)))), eg_.a833((long)this._m[5 + var3] << 16, 16711680L))));
         ++var2;
      }

      for(var2 = 0; var2 < 8; ++var2) {
         this._f[var2] = mn_.a833(this._j[var2], this._c[var2] = this._g[var2]);
      }

      if (var1 != 8) {
         this._j = (long[])null;
      }

      for(var2 = 1; 10 >= var2; ++var2) {
         int var4;
         int var5;
         for(var3 = 0; var3 < 8; ++var3) {
            this._e[var3] = 0L;
            var4 = 0;

            for(var5 = 56; var4 < 8; ++var4) {
               this._e[var3] = mn_.a833(this._e[var3], gh_._h[var4][nb_.a080(255, (int)(this._c[nb_.a080(7, var3 - var4)] >>> var5))]);
               var5 -= 8;
            }
         }

         for(var3 = 0; var3 < 8; ++var3) {
            this._c[var3] = this._e[var3];
         }

         this._c[0] = mn_.a833(this._c[0], gh_._a[var2]);

         for(var3 = 0; 8 > var3; ++var3) {
            this._e[var3] = this._c[var3];
            var4 = 0;

            for(var5 = 56; 8 > var4; ++var4) {
               this._e[var3] = mn_.a833(this._e[var3], gh_._h[var4][nb_.a080(255, (int)(this._f[nb_.a080(7, var3 - var4)] >>> var5))]);
               var5 -= 8;
            }
         }

         for(var3 = 0; 8 > var3; ++var3) {
            this._f[var3] = this._e[var3];
         }
      }

      for(var2 = 0; 8 > var2; ++var2) {
         this._g[var2] = mn_.a833(this._g[var2], mn_.a833(this._f[var2], this._j[var2]));
      }

   }

   public static void a423() {
      _a = null;
      _i = null;
      _k = null;
      _b = null;
   }

   final void a453(long var1, int var3, byte[] var4) {
      int var5 = 0;
      int var6 = 7 & -(7 & (int)var1) + 8;
      int var7 = 7 & this._d;
      if (var3 == 17567) {
         long var9 = var1;
         int var11 = 31;

         for(int var12 = 0; var11 >= 0; --var11) {
            var12 += ((int)var9 & 255) + (255 & this._l[var11]);
            this._l[var11] = (byte)var12;
            var12 >>>= 8;
            var9 >>>= 8;
         }

         int var8;
         while(var1 > 8L) {
            var8 = 255 & var4[var5] << var6 | (var4[var5 + 1] & 255) >>> -var6 + 8;
            if (0 > var8 || var8 >= 256) {
               throw new RuntimeException("LOGIC ERROR");
            }

            this._m[this._h] = (byte)mp_.a080(this._m[this._h], var8 >>> var7);
            ++this._h;
            this._d += 8 - var7;
            if (512 == this._d) {
               this.a150(var3 - 17559);
               this._d = 0;
               this._h = 0;
            }

            this._m[this._h] = (byte)nb_.a080(var8 << -var7 + 8, 255);
            var1 -= 8L;
            ++var5;
            this._d += var7;
         }

         if (var1 > 0L) {
            var8 = var4[var5] << var6 & 255;
            this._m[this._h] = (byte)mp_.a080(this._m[this._h], var8 >>> var7);
         } else {
            var8 = 0;
         }

         if (var1 + (long)var7 >= 8L) {
            this._d += -var7 + 8;
            var1 -= (long)(8 - var7);
            ++this._h;
            if (512 == this._d) {
               this.a150(8);
               this._h = 0;
               this._d = 0;
            }

            this._m[this._h] = (byte)nb_.a080(255, var8 << -var7 + 8);
            this._d += (int)var1;
         } else {
            this._d = (int)((long)this._d + var1);
         }

      }
   }

   static final void a093(int var0, int var1) {
      for(ue_ var2 = (ue_)qm_._q.e024(-24172); null != var2; var2 = (ue_)qm_._q.a024(var0 ^ 12)) {
         wd_.a013((byte)-69, var1, var2);
      }

      if (var0 != 8) {
         a423();
      }

      for(ne_ var3 = bg_._s.e024(var0 - 24180); var3 != null; var3 = bg_._s.a024(var0 ^ 12)) {
         hp_.a366(var1);
      }

   }
}
