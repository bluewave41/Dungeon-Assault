final class bd_ extends en_ {
   static cn_ _g;
   static int _f;
   private ai_ _d;
   private ac_ _h;
   static String[] _e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};

   private final cn_ a438(boolean var1, int var2) {
      jh_.c797();
      String var3 = ck_._H.a803(this._h._t, (byte)-48);
      String[] var4 = jn_.a782(var3, new int[]{var2}, -98, la_._b);
      int var5 = var4.length;
      int var6 = (var5 + 2) * la_._b._H + la_._b._E;
      int var7 = la_._b._H;
      wb_[] var8 = null == this._d ? null : this._d._f;
      if (var8 != null) {
         var6 += (var8.length + 1) * db_._v._H;
      }

      boolean var9 = null == this._d ? this._h._b : this._d._i;
      var9 &= this._h._g == 2 || this._h._g == 1 || 3 == this._h._g;
      if (var9) {
         var6 += 2 * db_._v._H;
      }

      cn_ var10 = new cn_(var2, var6);
      var10.e797();
      db_._v.c191(this._h._z.toUpperCase(), var2 >> 1, var7, 16777215, -1);
      var7 += la_._b._H * 2;
      if (!var1) {
         this.a185(80, (sa_)null);
      }

      String[] var11 = var4;

      int var12;
      for(var12 = 0; var12 < var11.length; ++var12) {
         String var13 = var11[var12];
         la_._b.c191(var13, var2 >> 1, var7, 16777215, -1);
         var7 += la_._b._H;
      }

      if (var9) {
         var7 += la_._b._H;
         if (2 != this._h._g) {
            if (1 == this._h._g) {
               db_._v.c191(gm_._a, var2 >> 1, var7, 16711680, -1);
            } else if (3 == this._h._g) {
               db_._v.c191(lf_._m, var2 >> 1, var7, 16711680, -1);
            }
         } else {
            db_._v.c191(rb_._K, var2 >> 1, var7, 16711680, -1);
         }

         var7 += la_._b._H;
      }

      if (null != var8) {
         var7 += la_._b._H;
         wb_[] var15 = var8;

         for(var12 = 0; var12 < var15.length; ++var12) {
            wb_ var16 = var15[var12];
            int var14 = db_._v.b926(var16._b) + 24;
            var16._c.c326(-var14 + var2 >> 1, -(-var16._c._v + la_._b._H * 3 >> 1) + var7, var16._a);
            db_._v.b191(ck_._H.a803(var16._b, (byte)-48), 24 + (-var14 + var2 >> 1), var7, var16._a, -1);
            var7 += la_._b._H;
         }
      }

      jh_.b797();
      return var10;
   }

   static final void a366(int var0, byte var1) {
      if (var1 != 113) {
         a366(123, (byte)56);
      }

      wj_ var2 = ac_._B;
      var2.d556((byte)-82, var0);
      var2.a093(6, 1);
      var2.a093(6, 2);
   }

   final cn_ b373(byte var1) {
      jh_.c797();
      String var2 = this._h._o;
      if (var2 == null && this._h._b) {
         var2 = lg_._s;
      }

      String[] var3 = null;
      if (var2 != null) {
         String var4 = jk_.a841(new String[]{this._h._z.toUpperCase()}, "<col=178B8B><%0></col>", 30496);
         var2 = ck_._H.a803(jk_.a841(new String[]{var4}, var2, 30496), (byte)-48);
         var3 = jn_.a782(var2, new int[]{200}, -122, db_._v);
      }

      int var10 = db_._v._H * (null != var2 ? 2 + var3.length : 1) + db_._v._E;
      cn_ var5 = new cn_(200, var10);
      var5.e797();
      int var6 = db_._v._H;
      db_._v.c191(this._h._z, 100, var6, 16777215, -1);
      var6 += db_._v._H;
      if (var2 != null) {
         String[] var7 = var3;

         for(int var8 = 0; var7.length > var8; ++var8) {
            String var9 = var7[var8];
            var6 += db_._v._H;
            db_._v.c191(var9, 100, var6, 16777215, -1);
         }
      }

      jh_.b797();
      return var5;
   }

   final void a185(int var1, sa_ var2) {
      if (var1 != 0) {
         this._d = (ai_)null;
      }

      cn_ var3 = this.a438(true, var2._b - 40);
      var2.a098(var3, 8 + var3._v, false, 111, -la_._b._H + var2._y >> 1);
   }

   public static void b150(int var0) {
      _g = null;
      _e = null;
      if (var0 < 65) {
         b150(64);
      }

   }

   bd_(pj_ var1, ai_ var2) {
      this._d = var2;
      this._h = this._d._h;
   }

   bd_(ac_ var1) {
      this._h = var1;
      this._d = null;
   }
}
