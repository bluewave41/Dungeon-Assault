class mc_ extends hh_ {
   static r_ _x = new r_();
   static cn_[] _w;

   public final void a623(byte var1, lm_ var2, int var3, int var4, boolean var5) {
      if (var5) {
         ll_.a050(2, var3 + var2._q, var2._x, var2._s, var4 + var2._v);
      }

      super.a623(var1, var2, var3, var4, var5);
   }

   mc_(se_ var1, int var2) {
      super(var1, 4, 2, 2, 2, var2, -1, 0, 1, var1._H, -1, Integer.MAX_VALUE, false);
   }

   public static void c150() {
      _x = null;
      _w = null;
   }

   mc_(int var1) {
      this(lp_._C, var1);
   }

   static final void b093(int var0, int var1) {
      am_._d = (var0 << 16) / var1;
      am_._g = 100 * var0 / 150;
      am_._c = var0 * 400 / 150;
   }

   static final void a934(int var0, int[] var1) {
      tg_._f[var0] = var1;
      bf_._f[var0] = new qc_(var0);
   }

   static final void a623(String var0, int var1, boolean var2, boolean[] var3) {
      if (!ed_.c491(var2)) {
         if (!eh_.a213(var0)) {
            if (null != gm_._d) {
               if (!gm_._d._H) {
                  ac_._B.d556((byte)-89, 58);
               }

               o_.a150();
               ac_._B.d556((byte)-105, 61);
               int var4 = 0;

               for(int var5 = 0; var5 < 8; ++var5) {
                  if (var3[var5]) {
                     var4 |= 1 << var5;
                  }
               }

               ac_._B.i093(var1, -97);
               ac_._B.a093(6, var4);
            } else {
               throw new RuntimeException((String)null);
            }
         } else {
            throw new RuntimeException((String)null);
         }
      } else {
         throw new RuntimeException((String)null);
      }
   }
}
