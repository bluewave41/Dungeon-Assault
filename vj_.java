final class vj_ {
   private int[] _a;
   static String _c = null;
   private int _e;
   static String _i = "You must have had your dungeon reset by an Orb of Mastery <%0> times to earn the title of <%1>.";
   private int[] _g;
   static int[] _d = new int[8192];
   private int _h;
   private int _j;
   private int _b;
   private int _f;

   static final bo_ a060(String var0, int var1) {
      if (lh_._p != null) {
         if (var1 < 41) {
            a060((String)null, -65);
         }

         String var2 = jm_.a715((byte)59, var0);
         if (null == var2) {
            var2 = var0;
         }

         for(bo_ var3 = (bo_)lh_._p.a312((byte)26, (long)var2.hashCode()); var3 != null; var3 = (bo_)lh_._p.c786((byte)72)) {
            String var4 = jm_.a715((byte)59, var3._Hb);
            if (null == var4) {
               var4 = var3._Hb;
            }

            if (var4.equals(var2)) {
               return var3;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static void a150() {
      _i = null;
      _c = null;
      _d = null;
   }

   final void a540(boolean var1, int var2) {
      if (var1) {
         var2 *= 9;
         int[] var3 = gf_._b;
         int var4 = gf_._i;
         int var5 = var2 + 9;
         int var6 = this._j + this._e * var4;
         int var7 = -this._b + var4;
         int var8 = 0;

         for(int var9 = 0; var9 < this._f; ++var9) {
            for(int var10 = 0; var10 < this._b; ++var10) {
               int var11 = this._a[var8];
               if (var2 < var11) {
                  if (var11 > var5) {
                     var3[var6] = this._g[var8];
                  } else {
                     var3[var6] = ok_._X[-var2 + var11];
                  }
               }

               ++var8;
               ++var6;
            }

            var6 += var7;
         }

      }
   }

   static final void a679(int var0, int var1) {
      vl_._m = var0;
      mm_._q = var1;
   }

   vj_(int var1, int var2, int var3, int var4, int var5) {
      this._f = var4;
      this._h = var5;
      this._j = var1;
      this._e = var2;
      this._b = var3;
      this._g = new int[this._b * this._f];
      this._a = new int[this._f * this._b];
      int var6 = uj_.a004(md_._d, 37, 640);
      int var7 = uj_.a004(md_._d, 37, 640);
      int var8 = uj_.a004(md_._d, 37, 480);
      int var9 = uj_.a004(md_._d, 37, 480);
      int[] var10 = new int[this._b];
      int[] var11 = new int[this._f];

      int var12;
      for(var12 = 1; var12 < this._b; ++var12) {
         var10[var12] = (int)(30.0 * Math.sin(5.0 * ((double)var12 * Math.PI / (double)this._b)) + 10.0 * Math.cos((double)var12 * Math.PI / (double)this._b * 9.0)) / 3;
      }

      for(var12 = 1; this._f > var12; ++var12) {
         var11[var12] = (int)(Math.sin(6.0 * ((double)var12 * Math.PI / (double)this._f)) * 40.0 + 15.0 * Math.cos(Math.PI * (double)var12 / (double)this._f * 14.0)) / 3;
      }

      for(var12 = 0; var12 < this._b; ++var12) {
         for(int var13 = 0; this._f > var13; ++var13) {
            int var14 = (int)Math.sqrt((double)((-var6 + var12) * (-var6 + var12) + (-var8 + var13) * (-var8 + var13)));
            int var15 = (int)Math.sqrt((double)((-var9 + var13) * (var13 - var9) + (-var7 + var12) * (var12 - var7)));
            int var16 = (var10[var12] + (var14 < var15 ? var14 : var15) + var11[var13]) * this._h * 9 / 640;
            this._g[var12 + this._b * var13] = gf_._b[var12 + this._j + (var13 + this._e) * gf_._i];
            this._a[this._b * var13 + var12] = var16;
         }
      }

   }
}
