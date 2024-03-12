final class la_ {
   static int _c;
   static gp_ _b;
   static boolean _f = true;
   static int _g = 0;
   private int _h;
   static int[] _l = new int[8192];
   String _d;
   int[] _i;
   private long _a;
   int _o;
   private boolean _k;
   static String _j = "Income rate: <col=DB0100><%0> per hour</col>";
   int _n;
   private String _e;
   int _m;

   static final int a410() {
      return -bf_._b + d_._e;
   }

   static final int a353(int var0) {
      return re_._f[var0 & 2047];
   }

   final int b410(byte var1) {
      if (!this._k && (this._n != 2 || 0 >= this._h)) {
         if (this._a == rk_._l) {
            return 1;
         } else if (ke_._d == 2 && mj_.a623(this._e)) {
            return 1;
         } else {
            if (var1 < 94) {
               this.b410((byte)-110);
            }

            return 0;
         }
      } else {
         return 2;
      }
   }

   static final int a137() {
      return 1;
   }

   public static void c423() {
      _j = null;
      _b = null;
      _l = null;
   }

   la_(boolean var1) {
      this._e = tk_._v;
      this._n = uk_._a;
      this._o = di_._d;
      this._h = wd_._j;
      if (var1) {
         this._i = kp_._a;
      } else {
         this._i = null;
      }

      this._a = gg_._d;
      this._d = sa_._t;
      this._m = ce_._w;
      this._k = ac_._l;
   }
}
