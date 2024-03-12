final class qf_ extends en_ {
   private String _d;
   private String _g;
   static cn_ _f;
   private String _e;

   static final hl_ a647(boolean var0, String var1, String var2) {
      long var3 = 0L;
      String var5 = null;
      if (var2.indexOf(64) != -1) {
         var5 = var2;
      } else {
         var3 = ci_.a438(var2, 2);
      }

      return l_.a566(var1, var3, var0, var5);
   }

   static final String a034(CharSequence var0) {
      int var1 = var0.length();
      if (var1 > 20) {
         var1 = 20;
      }

      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 >= 'A' && 'Z' >= var4) {
            var2[var3] = (char)(var4 + 97 - 65);
         } else if (('a' > var4 || 'z' < var4) && (var4 < '0' || var4 > '9')) {
            var2[var3] = '_';
         } else {
            var2[var3] = var4;
         }
      }

      return new String(var2);
   }

   public static void b150() {
      _f = null;
   }

   final cn_ b373(byte var1) {
      if (this._d == null) {
         return null;
      } else {
         jh_.c797();
         String[] var2 = jn_.a782(ck_._H.a803(this._d, (byte)-48), new int[]{200}, -63, db_._v);
         int var3 = var2.length;
         int var4 = db_._v._E + db_._v._H * var3;
         int var5 = db_._v._H;
         cn_ var6 = new cn_(200, var4);
         var6.e797();
         String[] var8 = var2;

         for(int var9 = 0; var8.length > var9; ++var9) {
            String var10 = var8[var9];
            db_._v.c191(var10, 100, var5, 16777215, -1);
            var5 += db_._v._H;
         }

         jh_.b797();
         return var6;
      }
   }

   qf_(String var1, String var2, String var3) {
      this._g = var2;
      this._d = var3;
      this._e = var1;
   }

   private final cn_ a574(byte var1, int var2) {
      jh_.c797();
      String[] var3 = jn_.a782(ck_._H.a803(this._g, (byte)-48), new int[]{var2}, -83, la_._b);
      int var4 = var3.length;
      int var5 = var4 * la_._b._H + la_._b._E;
      int var6 = la_._b._H;
      if (this._e != null) {
         var5 += 2 * la_._b._H;
      }

      cn_ var7 = new cn_(var2, var5);
      if (var1 <= 22) {
         return (cn_)null;
      } else {
         var7.e797();
         if (null != this._e) {
            db_._v.c191(ck_._H.a803(this._e, (byte)-48), var2 >> 1, var6, 16777215, -1);
            var6 += la_._b._H * 2;
         }

         String[] var8 = var3;

         for(int var9 = 0; var8.length > var9; ++var9) {
            String var10 = var8[var9];
            la_._b.c191(var10, var2 >> 1, var6, 16777215, -1);
            var6 += la_._b._H;
         }

         jh_.b797();
         return var7;
      }
   }

   qf_(String var1, String var2) {
      this(var1, var2, var1);
   }

   final void a185(int var1, sa_ var2) {
      if (var1 != 0) {
         this.a574((byte)-60, 34);
      }

      cn_ var3 = this.a574((byte)32, var2._b - 40);
      var2.a098(var3, var3._v + 8, false, 112, -la_._b._H + var2._y >> 1);
   }
}
