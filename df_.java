final class df_ {
   static String _g = "Necromancer";
   static cn_ _c;
   static cn_ _e;
   static String _a = "Change display name";
   static String _b = "<col=FF0000>Attack -1, Defence -1</col>";
   static String _d = "Orb of Brilliance";
   static String _f = "The larger and better trained saurus warriors are far superior in combat than their smaller brethren, using their innate agility to ensure success against all foes.";

   static final void b150() {
      for(int var0 = 0; 49 > var0; ++var0) {
         ai_ var1 = qj_._c[var0];
         if (null != var1) {
            var1._f = qe_.a928(var1, false, false, 0);
         }

         var1 = gm_._d._L[var0];
         if (var1 != null) {
            var1._f = qe_.a928(var1, false, false, 0);
         }
      }

   }

   static final int a410() {
      return (int)(kd_.c138(-2456) / 60000L - 16912800L);
   }

   static final qh_ a013(wj_ var0) {
      int var1 = var0.j080(114, 8);
      if (0 < var1) {
         throw new IllegalStateException("" + var1);
      } else {
         boolean var2 = jl_.a234(var0);
         boolean var3 = jl_.a234(var0);
         qh_ var4 = new qh_();
         var4._B = (short)var0.j080(-101, 16);
         var4._L = aj_.a042(var0, var4._L, (byte)31, 16);
         var4._S = aj_.a042(var0, var4._S, (byte)31, 16);
         var4._z = aj_.a042(var0, var4._z, (byte)31, 16);
         var4._h = (short)var0.j080(-43, 16);
         var4._A = aj_.a042(var0, var4._A, (byte)31, 16);
         var4._x = aj_.a042(var0, var4._x, (byte)31, 16);
         var4._N = aj_.a042(var0, var4._N, (byte)31, 16);
         if (var2) {
            var4._c = (short)var0.j080(-79, 16);
            var4._d = aj_.a042(var0, var4._d, (byte)31, 16);
            var4._P = aj_.a042(var0, var4._P, (byte)31, 16);
            var4._v = aj_.a042(var0, var4._v, (byte)31, 16);
            var4._e = aj_.a042(var0, var4._e, (byte)31, 16);
            var4._s = aj_.a042(var0, var4._s, (byte)31, 16);
            var4._F = aj_.a042(var0, var4._F, (byte)31, 16);
         }

         if (var3) {
            var0.j080(-97, 16);
            var4._t = aj_.a042(var0, var4._t, (byte)31, 16);
            var4._Q = aj_.a042(var0, var4._Q, (byte)31, 16);
            var4._I = aj_.a042(var0, var4._I, (byte)31, 16);
            var4._n = aj_.a042(var0, var4._n, (byte)31, 16);
            var4._C = aj_.a042(var0, var4._C, (byte)31, 16);
         }

         if (jl_.a234(var0)) {
            var4._o = aj_.a042(var0, var4._o, (byte)31, 16);
         }

         if (jl_.a234(var0)) {
            var4._y = rj_.a534(var0, 16, var4._y);
            int var5 = 0;

            for(int var6 = 0; var6 < var4._y.length; ++var6) {
               if (var5 < (255 & var4._y[var6])) {
                  var5 = var4._y[var6] & 255;
               }
            }

            if (var5 != 0) {
               var4._w = (byte)(1 + var5);
            } else {
               var4._y = null;
            }
         }

         return var4;
      }
   }

   static final void a951(ja_ var0) {
      qh_._G = var0;
   }

   public static void a150() {
      _d = null;
      _b = null;
      _g = null;
      _f = null;
      _e = null;
      _c = null;
      _a = null;
   }
}
