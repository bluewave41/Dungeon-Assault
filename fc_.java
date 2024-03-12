final class fc_ extends en_ {
   static int[] _g = new int[4];
   private hb_ _f;
   static String _e = "The monster failed to trap your raider.";
   static String _h = "Serving one of the humans' innumerable dark gods, the priest brings a broad set of skills to any raiding party.";
   static volatile int _m = 0;
   static int _d;
   private h_ _k;
   private pj_ _i;
   static String _l = "Error connecting to server. Please try using a different server.";
   static String _j = "Try again";

   private final cn_ a251(int var1, int var2) {
      jh_.c797();
      String[] var3 = jn_.a782(this._k._G, new int[]{var2}, -102, la_._b);
      String[] var4 = null;
      String[] var5 = null;
      String[][] var6 = new String[this._k._A.length][];
      String[][] var7 = new String[this._k._A.length][];
      int var8 = var3.length;
      int var9 = la_._b._E + (var8 + 2) * la_._b._H;
      int var10 = la_._b._H;
      boolean var11 = null != this._i && this._i.b121(0, this._f);
      boolean var12 = null != this._i && this._f == this._i._u;
      wb_[] var13 = null != this._f ? this._f._i : null;
      if (var13 != null) {
         var9 += db_._v._H * (1 + var13.length);
      }

      String[] var15;
      String var17;
      if (this._k._s != -1) {
         String var14 = jk_.a841(new String[]{this._k._F.toUpperCase()}, "<col=178B8B><%0></col>", 30496);
         var15 = this._k._d;
         String var16 = jk_.a841(new String[]{var15[0]}, lc_._g, 30496);
         var17 = ck_._H.a803(jk_.a841(new String[]{var14}, var15[1], 30496), (byte)-48);
         var4 = jn_.a782(var16, new int[]{var2}, -118, la_._b);
         var5 = jn_.a782(var17, new int[]{var2}, -75, la_._b);
         var9 += la_._b._H * (var5.length + var4.length + 2);
         if (var11) {
            var9 += db_._v._H;
         }
      }

      String var18;
      String[] var23;
      for(int var19 = 0; this._k._A.length > var19; ++var19) {
         String var21 = jk_.a841(new String[]{this._k._F.toUpperCase()}, "<col=FF8000><%0></col>", var1 ^ 16746719);
         var23 = this._k._D[var19];
         var17 = jk_.a841(new String[]{var23[0]}, rm_._J, 30496);
         var18 = ck_._H.a803(jk_.a841(new String[]{var21}, var23[1], 30496), (byte)-48);
         var6[var19] = jn_.a782(var17, new int[]{var2}, -80, la_._b);
         var7[var19] = jn_.a782(var18, new int[]{var2}, md_.b080(var1, -16777100), la_._b);
         var9 += (2 + var6[var19].length + var7[var19].length) * la_._b._H;
      }

      if (var12) {
         var9 += 2 * db_._v._H;
      }

      cn_ var20 = new cn_(var2, var9);
      var20.e797();
      db_._v.c191(this._k._F.toUpperCase(), var2 >> 1, var10, var1, -1);
      var10 += la_._b._H * 2;
      var15 = var3;

      int var24;
      for(var24 = 0; var15.length > var24; ++var24) {
         var17 = var15[var24];
         la_._b.c191(var17, var2 >> 1, var10, 16777215, -1);
         var10 += la_._b._H;
      }

      if (null != var13) {
         var10 += la_._b._H;
         wb_[] var22 = var13;

         for(var24 = 0; var22.length > var24; ++var24) {
            wb_ var26 = var22[var24];
            int var27 = db_._v.b926(var26._b) + 24;
            var26._c.c326(var2 - var27 >> 1, -(-var26._c._v + 3 * la_._b._H >> 1) + var10, var26._a);
            db_._v.b191(var26._b, (-var27 + var2 >> 1) + 24, var10, var26._a, -1);
            var10 += la_._b._H;
         }
      }

      if (var12) {
         var10 += db_._v._H;
         db_._v.c191(od_._a, var2 >> 1, var10, 16744448, -1);
         var10 += db_._v._H;
      }

      if (-1 != this._k._s) {
         var15 = var4;

         for(var24 = 0; var24 < var15.length; ++var24) {
            var17 = var15[var24];
            var10 += la_._b._H;
            db_._v.c191(var17, var2 >> 1, var10, 1543051, -1);
         }

         if (var11) {
            var10 += db_._v._H;
            db_._v.c191(g_._Jb, var2 >> 1, var10, 1543051, -1);
         }

         var10 += 2 * db_._v._H;
         var15 = var5;

         for(var24 = 0; var15.length > var24; ++var24) {
            var17 = var15[var24];
            la_._b.c191(var17, var2 >> 1, var10, 16777215, -1);
            var10 += la_._b._H;
         }
      }

      for(int var25 = 0; var25 < this._k._A.length; ++var25) {
         var23 = var6[var25];

         int var28;
         for(var28 = 0; var23.length > var28; ++var28) {
            var18 = var23[var28];
            var10 += db_._v._H;
            db_._v.c191(var18, var2 >> 1, var10, 16744448, -1);
         }

         var10 += 2 * db_._v._H;
         var23 = var7[var25];

         for(var28 = 0; var28 < var23.length; ++var28) {
            var18 = var23[var28];
            la_._b.c191(var18, var2 >> 1, var10, 16777215, -1);
            var10 += la_._b._H;
         }
      }

      jh_.b797();
      return var20;
   }

   static final boolean a370(int var0) {
      return 0 <= var0;
   }

   final void a185(int var1, sa_ var2) {
      cn_ var3 = this.a251(16777215, var2._b - 40);
      if (var1 == 0) {
         var2.a098(var3, var3._v + 8, false, 110, -la_._b._H + var2._y >> 1);
      }
   }

   final cn_ b373(byte var1) {
      jh_.c797();
      String[] var2 = null;
      String[][] var3 = new String[this._k._A.length][];
      int var4 = db_._v._E + db_._v._H;
      int var5 = db_._v._H;
      String var9;
      if (-1 != this._k._s) {
         String var6 = jk_.a841(new String[]{this._k._F.toUpperCase()}, "<col=178B8B><%0></col>", 30496);
         String[] var7 = this._k._C;
         String var8 = var7[0];
         var9 = ck_._H.a803(jk_.a841(new String[]{var6}, var7[1], 30496), (byte)-48);
         var2 = jn_.a782("<col=178B8B>" + var8 + "</col> - " + var9, new int[]{200}, -94, db_._v);
         var4 += db_._v._H * (1 + var2.length);
      }

      String var10;
      String[] var15;
      for(int var12 = 0; var12 < this._k._A.length; ++var12) {
         String var14 = jk_.a841(new String[]{this._k._F.toUpperCase()}, "<col=FF8000><%0></col>", 30496);
         var15 = this._k._k[var12];
         var9 = var15[0];
         var10 = ck_._H.a803(jk_.a841(new String[]{var14}, var15[1], 30496), (byte)-48);
         var3[var12] = jn_.a782("<col=FF8000>" + var9 + "</col> - " + var10, new int[]{200}, -95, db_._v);
         var4 += db_._v._H * (1 + var3[var12].length);
      }

      cn_ var13 = new cn_(200, var4);
      var13.e797();
      db_._v.c191(this._k._F, 100, var5, 16777215, -1);
      if (-1 != this._k._s) {
         var5 += db_._v._H;
         var15 = var2;

         for(int var17 = 0; var17 < var15.length; ++var17) {
            var10 = var15[var17];
            var5 += la_._b._H;
            db_._v.c191(var10, 100, var5, 16777215, -1);
         }
      }

      for(int var16 = 0; this._k._A.length > var16; ++var16) {
         var5 += db_._v._H;
         String[] var18 = var3[var16];

         for(int var19 = 0; var19 < var18.length; ++var19) {
            String var11 = var18[var19];
            var5 += db_._v._H;
            db_._v.c191(var11, 100, var5, 16777215, -1);
         }
      }

      jh_.b797();
      return var13;
   }

   public static void b150() {
      _h = null;
      _l = null;
      _e = null;
      _g = null;
      _j = null;
   }

   static final void a540(qk_ var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, qk_ var11, int var12, int var13, int var14, se_ var15, qk_ var16, int var17, se_ var18, int var19) {
      lb_.a583(var15, var18, var19, 2);
      mi_.a050(var12, var9, var5, var14);
      wm_.a679(var3, var13);
      bk_.a750(var11, var17, var1, var6, var0);
      mn_.a051(var8, var16, var10);
      tk_.a115(var2, var7, var4);
   }

   fc_(pj_ var1, hb_ var2) {
      this._f = var2;
      this._i = var1;
      this._k = this._f._n;
   }

   fc_(h_ var1) {
      this._k = var1;
      this._i = null;
      this._f = null;
   }
}
