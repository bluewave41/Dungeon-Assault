final class lk_ extends gd_ {
   static int _S = 0;
   static int _T;
   static String _Q = "Your email address is used to identify this account";
   static int[][] _R;
   int _O;
   static String _P = "CONFIRM";

   static final void a627(String var0) {
      jj_._d = var0;
      sn_.a093(93, 12);
   }

   final void b326(int var1, int var2, int var3) {
      if (var2 == 8187) {
         int var4 = var1 + super._t;
         int var5 = super._i + var3;
         wd_._l[this._O].a668(20 + var5, 30 + var4, true, 30);
         super.b326(var1, var2 ^ 0, var3);
      }
   }

   lk_(int var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, 0);
      this._O = var5;
      this.g150(255);
   }

   public static void h150() {
      _Q = null;
      _R = (int[][])null;
      _P = null;
   }

   final void g150(int var1) {
      int var2 = gm_._d._J[this._O];
      int var3 = gm_._d._F[this._O];
      String var4 = null;
      if (var2 != 0) {
         var4 = jk_.a841(new String[]{Integer.toString(var2)}, nh_._i, 30496);
         if (var3 != 0) {
            var4 = var4 + ", " + jk_.a841(new String[]{Integer.toString(var3)}, to_._a, 30496);
         }

         if (ve_.a491() && hm_._m[this._O] && var2 >= 5) {
            var4 = var4 + ", " + qh_._j;
         }
      } else if (var3 != 0) {
         var4 = jk_.a841(new String[]{Integer.toString(var3)}, to_._a, 30496);
      }

      String var5 = li_._b[this._O];
      int var6 = db_._v.b926(var5);
      int var7 = db_._v._H + la_._b._E;
      if (null != var4) {
         int var8 = db_._v.b926(var4);
         if (var8 > var6) {
            var6 = var8;
         }

         var7 += db_._v._H;
      }

      super._K = new cn_(var6, var7);
      super._H = new cn_(var6, var7);
      super._z = new cn_(var6, var7);
      jh_.c797();
      super._K.e797();
      db_._v.b191(var5, 0, la_._b._H, 12632256, -1);
      if (null != var4) {
         db_._v.b191(var4, 0, la_._b._H * 2, 8421504, -1);
      }

      super._H.e797();
      gf_.a797();
      super._K.e326(0, 0, 16744448);
      super._z.e797();
      gf_.a797();
      super._K.e326(0, 0, 12690143);
      jh_.b797();
      super._K._A = super._x - var7 >> 1;
      super._K._w = 60;
      super._H._w = 60;
      super._H._A = super._x - var7 >> 1;
      super._z._w = 60;
      super._z._A = super._x - var7 >> 1;
      super._I = rb_.a551(16, super._z, var1, (byte)-33);
      super._N = rb_.a551(16, super._H, 16711680, (byte)-18);
   }

   static final String a278(String var0, nh_ var1, String var2) {
      return !var1.a154(-14354) ? var2 : var0 + " - " + var1.b137(100) + "%";
   }

   static final void f150(int var0) {
      ia_._K = null;
      sg_._b = null;
      ga_._o = null;
      ro_._B = false;
      if (var0 != 16) {
         _S = 2;
      }

      System.gc();
   }

   final void a599(int var1, int var2, byte var3) {
      int var4 = super._t + var1;
      int var5 = var2 + super._i;

      for(int var6 = 0; 10 > var6; ++var6) {
         gf_.g050(30 + var4, 20 + var5, 20 + var6, 0, 16);
      }

   }
}
