final class sa_ {
   private int _m;
   static cf_[] _v;
   private int _d;
   private int _s;
   static String _h = "Updates will sent to the email address you've given";
   private int _q;
   private int _j;
   int _k = 16;
   private cn_ _a;
   private int _p;
   static String _w = "Loading graphics";
   private cn_ _u;
   static hd_ _x;
   private cn_ _g;
   private cn_ _c;
   int _b;
   private int _l;
   static int _f;
   private int _o;
   static String _t;
   private cn_ _r;
   private int _n;
   private int _i;
   int _y;
   static String _e = "REVIVE";

   final void a098(cn_ var1, int var2, boolean var3, int var4, int var5) {
      this._i = this._l;
      this._n = this._p;
      this._a = this._r;
      this._c = this._u;
      this._p = var2;
      this._l = var5;
      if (var3) {
         this._q = var5;
         this._g = var1;
         this._d = var2;
      } else {
         this._s = 32;
      }

      this._u = var1;
      this._r = new cn_(this._u._y + 4, 4 + this._u._v);
      jh_.a303(this._r);
      this._u.e326(2, 2, 12690143);
      gf_.d669(2, 2, 0, 0, this._r._y, this._r._v);
      jh_.b797();
      cn_ var7 = this._r;
      this._r._A = -2;
      var7._w = -2;
      this._o = 384;
   }

   public static void b487() {
      _x = null;
      _h = null;
      _e = null;
      _t = null;
      _v = null;
      _w = null;
   }

   private final void a150(int var1) {
      if (var1 != 384) {
         this.a126(33, false, (cn_)null);
      }

      this.a098(this._g, this._d, true, -89, this._q);
   }

   final void a423(byte var1) {
      int var2 = (-this._u._y + this._b >> 1) + this._m;
      int var3 = this._j + this._l;
      if (0 != this._o) {
         int var4;
         int var5;
         if (256 < this._o) {
            if (null != this._c) {
               var4 = this._m + (this._b - this._c._y >> 1);
               var5 = this._i + this._j;
               this.a394(var5, (byte)80, var4, this._o - 256 << 1, this._c);
               this.a394(var5, (byte)-35, var4, -this._o + 384 << 1, this._a);
            }
         } else if (128 < this._o) {
            if (this._c != null) {
               var4 = this._m + (this._b - this._c._y >> 1);
               var5 = this._i + this._j;
               this.a394(var5, (byte)62, var4, this._o - 128 << 1, this._a);
            }

            this.a394(var3, (byte)107, var2, -this._o + 256 << 1, this._r);
         } else {
            this.a394(var3, (byte)-28, var2, this._o << 1, this._r);
            this.a394(var3, (byte)105, var2, 128 - this._o << 1, this._u);
         }
      } else {
         this.a075(var2, var3, this._u, (byte)-66);
      }

      if (var1 >= -20) {
         _h = (String)null;
      }

   }

   private final void a394(int var1, byte var2, int var3, int var4, cn_ var5) {
      int[] var6 = new int[4];
      gf_.a331(var6);

      int var8;
      for(int var7 = 1; var7 < this._k; ++var7) {
         var8 = var7 * var4 / this._k;
         gf_.e115(this._m, var7 + this._j, this._m + this._b, 1 + this._j + var7);
         var5.b326(var3, var1, var8);
         gf_.e115(this._m, this._y + (this._j - 1) - var7, this._b + this._m, -var7 + this._j + this._y);
         var5.b326(var3, var1, var8);
      }

      var8 = -112 / ((var2 - 27) / 32);
      gf_.e115(this._m, this._k + this._j, this._m + this._b, this._j + this._y - this._k);
      var5.b326(var3, var1, var4);
      gf_.b331(var6);
   }

   private final void a075(int var1, int var2, cn_ var3, byte var4) {
      int[] var5 = new int[4];
      gf_.a331(var5);

      int var6;
      for(var6 = 1; this._k > var6; ++var6) {
         int var7 = (var6 << 8) / this._k;
         gf_.e115(this._m, this._j + var6, this._m + this._b, var6 + this._j + 1);
         var3.d326(var1, var2, var7);
         gf_.e115(this._m, -var6 + (this._y + this._j - 1), this._b + this._m, this._y + this._j - var6);
         var3.d326(var1, var2, var7);
      }

      var6 = -73 / ((var4 + 20) / 35);
      gf_.e115(this._m, this._j + this._k, this._b + this._m, this._j + (this._y - this._k));
      var3.h093(var1, var2);
      gf_.b331(var5);
   }

   final void a126(int var1, boolean var2, cn_ var3) {
      this.a098(var3, 0, var2, 118, this._y - var3._v >> 1);
      if (var1 != 1929) {
         this.a487(false);
      }

   }

   final void a050(boolean var1, String var2, byte var3, String var4, int var5) {
      jh_.c797();
      int var6 = this._b - 40;
      String[] var7 = jn_.a782(var4, new int[]{var6}, -121, la_._b);
      int var8 = var7.length;
      int var9 = la_._b._E + var8 * la_._b._H;
      if (var2 != null) {
         var9 += 2 * la_._b._H;
      }

      int var10 = la_._b._H;
      cn_ var11 = new cn_(var6, var9);
      var11.e797();
      if (null != var2) {
         db_._v.c191(var2, var6 >> 1, var10, var5, -1);
         var10 += 2 * la_._b._H;
      }

      String[] var12 = var7;

      for(int var13 = 0; var13 < var12.length; ++var13) {
         String var14 = var12[var13];
         la_._b.c191(var14, var6 >> 1, var10, var5, -1);
         var10 += la_._b._H;
      }

      jh_.b797();
      this.a126(1929, var1, var11);
      if (var3 != 91) {
         a846((byte)-10, -54, -25, -114, (int[])null);
      }

   }

   final void a487(boolean var1) {
      this._o -= 12;
      if (0 > this._o) {
         this._o = 0;
      }

      if ((mo_._a & 3) == 0) {
         if (this._o == 0) {
            if (--this._p < 0) {
               if (this._g != this._u && 0 >= --this._s) {
                  this.a150(384);
               }
            } else {
               --this._l;
               if (16 == this._p) {
                  this.a150(384);
               }
            }
         }

         if (--this._n >= 0) {
            --this._i;
         }
      }

      if (var1) {
         this.a487(true);
      }

   }

   static final void a846(byte var0, int var1, int var2, int var3, int[] var4) {
      while(true) {
         --var1;
         if (var1 < 0) {
            if (var0 != 45) {
               a846((byte)65, 42, 56, 44, (int[])null);
            }

            return;
         }

         var4[var2] = var3 + (nb_.a080(var4[var2], 16711422) >> 1);
         ++var2;
      }
   }

   sa_(int var1, int var2, int var3, int var4) {
      this._b = var3;
      this._y = var4;
      this._j = var2;
      this._m = var1;
   }
}
