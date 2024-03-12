final class fg_ extends gj_ {
   static String _f = "This huge, black-skinned, winged demon's claws and muscly build make it a raider's worst nightmare.<br><br>If this monster's <%attack> is at least twice as high as the <%defence> of the raider it encounters, the entire party will flee in terror!";
   static int _i = 10;
   static String _o = "Whirling Blades";
   static String _m = "Waiting for extra data";
   private int _n = 1;
   private long _l = 0L;
   private long _h = 0L;
   private long _k = 0L;
   static String _g = "Unfortunately your configuration doesn't support fullscreen mode.";
   private long[] _j = new long[10];
   static int[] _d = new int[8192];
   private int _e = 0;

   static final void a044(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if (var3 >= var2) {
         if (var3 >= var0) {
            if (var2 >= var0) {
               sg_.a876(gf_._b, var4, var7, var3, var10, var13, var12, var2, var0, var5, var6, var8, var1, var14, var9, var11);
            } else {
               sg_.a876(gf_._b, var4, var8, var3, var1, var14, var12, var0, var2, var6, var5, var7, var10, var13, var9, var11);
            }
         } else {
            sg_.a876(gf_._b, var7, var8, var0, var12, var11, var1, var3, var2, var6, var9, var4, var10, var13, var5, var14);
         }
      } else if (var0 > var2) {
         sg_.a876(gf_._b, var7, var4, var0, var10, var13, var1, var2, var3, var9, var6, var8, var12, var11, var5, var14);
      } else if (var0 > var3) {
         sg_.a876(gf_._b, var8, var4, var2, var1, var14, var10, var0, var3, var9, var5, var7, var12, var11, var6, var13);
      } else {
         sg_.a876(gf_._b, var8, var7, var2, var12, var11, var10, var3, var0, var5, var9, var4, var1, var14, var6, var13);
      }

   }

   final int b871(long var1, int var3) {
      if (var3 != 2048) {
         _m = (String)null;
      }

      if (this._h < this._l) {
         this._k += this._l - this._h;
         this._h += -this._h + this._l;
         this._l += var1;
         return 1;
      } else {
         int var4 = 0;

         do {
            this._l += var1;
            ++var4;
         } while(var4 < 10 && this._l < this._h);

         if (this._h > this._l) {
            this._l = this._h;
         }

         return var4;
      }
   }

   final long a138(int var1) {
      this._h += this.c138(0);
      return this._h < this._l ? (this._l - this._h) / 1000000L : 0L;
   }

   public static void d150(int var0) {
      _m = null;
      if (var0 <= -96) {
         _d = null;
         _o = null;
         _g = null;
         _f = null;
      }
   }

   final void b150(int var1) {
      this._k = 0L;
      if (var1 >= -86) {
         d150(110);
      }

      if (this._h < this._l) {
         this._h += -this._h + this._l;
      }

   }

   private final long c138(int var1) {
      long var2 = System.nanoTime();
      long var4 = -this._k + var2;
      this._k = var2;
      if (-5000000000L < var4 && var4 < 5000000000L) {
         this._j[this._e] = var4;
         if (1 > this._n) {
            ++this._n;
         }

         this._e = (1 + this._e) % 10;
      }

      long var6 = (long)var1;

      for(int var8 = 1; this._n >= var8; ++var8) {
         var6 += this._j[(10 + (this._e - var8)) % 10];
      }

      return var6 / (long)this._n;
   }

   fg_() {
      this._h = System.nanoTime();
      this._l = System.nanoTime();
   }
}
