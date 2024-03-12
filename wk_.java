final class wk_ {
   static String[] _a;
   private int _d;
   private int _e;
   static char[] _f = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   float _j;
   private bl_[] _i = new bl_[16];
   static int _g;
   static int _h;
   private int _c;
   String _b;

   final boolean a491(boolean var1) {
      if (var1) {
         a080(73, -60);
      }

      while(this._e > this._d) {
         bl_ var2 = this._i[this._d];
         if (!var2._q.a154(-14354)) {
            this.a375((byte)12, 0, var2);
            return false;
         }

         if (0 <= var2._m && !var2._q.a544(false, var2._m)) {
            this.a375((byte)12, var2._q.c080(-123, var2._m), var2);
            return false;
         }

         if (var2._h != null && !var2._q.a213(false, var2._h)) {
            this.a375((byte)12, var2._q.b913(var2._h, -1), var2);
            return false;
         }

         if (var2._m < 0 && var2._h == null && null != var2._f && !var2._q.a427((byte)59)) {
            this.a375((byte)12, var2._q.b137(100), var2);
            return false;
         }

         ++this._d;
      }

      return true;
   }

   static final void a455(int var0, String var1, se_ var2, int var3, int[] var4, int var5) {
      if (var5 == 31139) {
         tf_ var6 = new tf_(var2, var1, var4);
         var6.b326(-var2._H + var3, 32, -var6._i + var0);
      }
   }

   private final void a375(byte var1, int var2, bl_ var3) {
      float var4 = (float)(this._d + 1) + (float)var2 / 100.0F;
      this._j = (float)this._c * var4 / (float)(this._e + 1);
      if (var1 != 12) {
         a455(-109, (String)null, (se_)null, 89, (int[])null, -3);
      }

      if (var2 == 0) {
         this._b = var3._g;
      } else {
         this._b = var3._f + " - " + var2 + "%";
      }

   }

   public static void b487() {
      _a = null;
      _f = null;
   }

   static final void a150() {
      sn_.a093(66, 17);
   }

   static final cn_[] a528(cn_[] var0, int var1) {
      cn_[] var2 = new cn_[var0.length];

      for(int var3 = var1; var0.length > var3; ++var3) {
         var2[var3] = g_.a983(var0[var3]);
      }

      return var2;
   }

   static final int c474(boolean var0) {
      lg_._w.a421(wo_._b, (byte)66, ci_._m, true);
      lg_._w.b487(true);

      while(ha_.b427()) {
         lg_._w.a564(126, mm_._t, ob_._Yb);
      }

      if (var0) {
         return 11;
      } else if (-1 == ki_._f) {
         if (!cd_._b) {
            if (wd_._d == ql_._f) {
               return 1;
            } else if (im_._b.b154(36)) {
               return ol_._i != ql_._f ? -1 : 2;
            } else {
               return 1;
            }
         } else {
            return 3;
         }
      } else {
         int var1 = ki_._f;
         sn_.a093(16, -1);
         return var1;
      }
   }

   private final void a151(nh_ var1, String var2, String var3, boolean var4, int var5, String var6) {
      if (var4) {
         a455(13, (String)null, (se_)null, -71, (int[])null, -117);
      }

      if (this._i.length <= this._e) {
         bl_[] var7 = new bl_[this._e * 2];
         cj_.a030(this._i, 0, var7, 0, this._e);
         this._i = var7;
      }

      bl_ var8 = new bl_();
      var8._g = var6;
      var8._h = var3;
      var8._m = var5;
      var8._f = var2;
      var8._q = var1;
      this._i[this._e++] = var8;
   }

   final void a971(String var1, String var2, String var3, nh_ var4, int var5) {
      this.a151(var4, var1, var2, false, -1, var3);
      if (var5 >= -75) {
         a528((cn_[])null, 114);
      }

   }

   final void a539(String var1, int var2, String var3, nh_ var4) {
      if (var2 == 237) {
         this.a151(var4, var3, (String)null, false, -1, var1);
      }
   }

   static final int a080(int var0, int var1) {
      int var2 = 0;
      if (0 != (var0 & 7)) {
         var2 = -(var0 & 7) + 8;
      }

      if (var1 != 18605) {
         c474(true);
      }

      int var3 = var2 + var0;
      return var3;
   }

   wk_(int var1) {
      this._c = var1;
   }
}
