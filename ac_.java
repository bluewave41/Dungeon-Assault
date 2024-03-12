final class ac_ {
   cf_ _a;
   String _o;
   int _r;
   int _c;
   int _v;
   static int _s;
   cf_ _p;
   int _j;
   eh_ _d;
   boolean _b;
   boolean _C;
   private int[] _e;
   int _i;
   static ph_ _w;
   int _k;
   static String _h = "SUCCESS";
   eh_ _u;
   private int[] _q;
   static String _f = "You must once have charged <%0> Orbs of Mastery at one time to earn the title of <%1>.";
   int _g;
   String _z;
   static ai_ _n = null;
   eh_ _m;
   static wj_ _B;
   String _t;
   static String _D = "An error has occurred retrieving the Renown Table.";
   static boolean _l;
   int _y;
   int _A;
   cf_ _x;

   final int a080(int var1, int var2) {
      for(int var3 = var1; this._q.length > var3; ++var3) {
         if (this._q[var3] == var2) {
            return this._e[var3];
         }
      }

      return 0;
   }

   final boolean a560(byte var1, int var2) {
      int var3 = 0;
      if (var1 >= -43) {
         this._y = -25;
      }

      while(var3 < this._q.length) {
         if (this._q[var3] == var2) {
            return true;
         }

         ++var3;
      }

      return false;
   }

   static final void a900(String var0, int var1) {
      if (!ed_.c491(true)) {
         if (eh_.a213(var0)) {
            throw new RuntimeException((String)null);
         } else if (gm_._d != null) {
            if (var1 != 0) {
               _n = (ai_)null;
            }

            if (!gm_._d._H) {
               _B.d556((byte)-99, 58);
            }

            _B.d556((byte)-114, 60);
            ++_B._o;
            int var2 = _B._o;
            _B.a984(var1 ^ 2, var0);
            _B.c093(-var2 + _B._o, -1);
         } else {
            throw new RuntimeException((String)null);
         }
      } else {
         throw new RuntimeException((String)null);
      }
   }

   public static void a150() {
      _D = null;
      _n = null;
      _f = null;
      _h = null;
      _w = null;
      _B = null;
   }

   static final void a572(nh_ var0) {
      jp_.a604(var0.a826("headers.packvorbis", "", (byte)-119));
      jp_ var1 = jp_.a825(var0, "jagex logo2.packvorbis", "");
      var1.c981();
   }

   ac_(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, boolean var11, int[][] var12) {
      this._k = var7;
      this._c = var3;
      this._b = var11;
      this._A = var6;
      this._v = var1;
      this._g = var2;
      this._r = var9;
      this._i = var4;
      this._j = var5;
      this._y = var8;
      this._C = var10;
      int var13 = var12.length;
      this._q = new int[var13];
      this._e = new int[var13];

      for(int var14 = 0; var14 < var13; ++var14) {
         int[] var15 = var12[var14];
         if (var15.length == 1) {
            this._q[var14] = var15[0];
            this._e[var14] = 1;
         } else {
            if (var15.length != 2) {
               throw new RuntimeException();
            }

            this._q[var14] = var15[0];
            this._e[var14] = var15[1];
         }
      }

   }
}
