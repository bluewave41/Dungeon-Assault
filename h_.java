final class h_ {
   cf_ _a;
   eh_ _u;
   int _r;
   eh_ _t;
   static String[] _y = new String[]{"Moving", "To move through the dungeon, simply <col=FF0000>left-click on an unexplored room</col>. Rooms are connected by doors. Rooms that are accessible from the party's current location are <%highlight>outlined with an orange glow</col>.<br><br><%command>Enter a new room now.</col>"};
   int _o;
   eh_ _l;
   static String _i = "Monster wins!";
   int _z;
   int _c;
   int _s;
   static ae_ _h = new ae_(1);
   static cn_ _E;
   String _F;
   int[] _A;
   static int _j;
   int _B;
   int _w;
   int _b;
   int _x;
   int _m;
   static cn_ _f;
   String _G;
   String[] _C;
   String[] _d;
   cf_ _g;
   String[][] _k;
   cf_ _p;
   static String _n = "Trolls are found throughout the swamps, making their homes in dank caves. Slow and lumbering, they are nevertheless devastating in combat and nearly impossible to kill.";
   eh_ _e;
   static int _q;
   eh_ _v;
   String[][] _D;

   static final void a086(boolean var0, int var1, int var2, boolean var3, int var4) {
      int var5 = pi_._b._y;
      jh_.c797();
      gf_.e115(var2, var4, var5 + var2, var4 + var1);

      int var6;
      for(var6 = 0; var6 < var1; var6 += pi_._b._v) {
         pi_._b.c093(var2, var6 + var4);
      }

      if (var3) {
         if (var0) {
            for(var6 = 0; 8 > var6; ++var6) {
               int var7 = 192 - 24 * var6;
               gf_.d050(var2, var4 + var6, var5, 0, var7);
               gf_.d050(var2, var4 + (var1 - 1 - var6), var5, 0, var7);
            }
         }

         jh_.b797();
      }
   }

   final boolean a097(int var1, int var2) {
      if (var1 != this._s) {
         for(int var3 = 0; this._A.length > var3; ++var3) {
            if (this._A[var3] == var1) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   static final int a137(int var0) {
      if (~dk_._c > var0) {
         return 0;
      } else {
         if (hc_._d == 0) {
            if (!fi_._u.a154(-14354)) {
               return 20;
            }

            if (!fi_._u.a213(false, "commonui")) {
               return 40;
            }

            if (!kg_._b.a154(-14354)) {
               return 50;
            }

            if (!kg_._b.a213(false, "commonui")) {
               return 60;
            }

            if (!ib_._b.a154(-14354)) {
               return 70;
            }

            if (!ib_._b.a427((byte)59)) {
               return 80;
            }
         } else {
            if (null != ia_._U) {
               if (!ia_._U.a154(-14354)) {
                  return 14;
               }

               if (!ia_._U.c896("", var0 + 3)) {
                  return 29;
               }

               if (!ia_._U.a213(false, "")) {
                  return 29;
               }
            }

            if (!fi_._u.a154(-14354)) {
               return 43;
            }

            if (!fi_._u.a213(false, "commonui")) {
               return 57;
            }

            if (!kg_._b.a154(-14354)) {
               return 71;
            }

            if (!kg_._b.a213(false, "commonui")) {
               return 80;
            }

            if (!ib_._b.a154(-14354)) {
               return 82;
            }

            if (!ib_._b.a427((byte)59)) {
               return 86;
            }
         }

         return 100;
      }
   }

   public static void a423(byte var0) {
      _f = null;
      _h = null;
      _n = null;
      _i = null;
      _y = null;
      _E = null;
      if (var0 != 16) {
         a086(true, 65, -49, false, 20);
      }

   }

   static final void a039(int var0, nh_ var1, nh_ var2, boolean var3, nh_ var4) {
      im_._b = oh_.a321("");
      im_._b.a877(false, false);
      p_.a467(var2, var4, var1);
      if (var0 != 8171) {
         a423((byte)32);
      }

      qj_.a423();
      wd_._d = sp_._e;
      ol_._i = sp_._e;
   }

   h_(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10) {
      this._B = var3;
      this._m = var6;
      this._b = var8;
      this._w = var1;
      this._z = var2;
      this._x = var5;
      this._o = var9;
      this._c = var4;
      this._r = var7;
      this._s = -1;
      int var11 = 0;

      int var12;
      int var13;
      for(var12 = 0; var12 < var10.length; ++var12) {
         var13 = var10[var12];
         if (0 == ob_._cc[var13]) {
            ++var11;
         } else {
            if (-1 != this._s) {
               throw new RuntimeException("Multiple active abilities declared for: " + this._w);
            }

            this._s = var13;
         }
      }

      this._A = new int[var11];
      var11 = 0;

      for(var12 = 0; var10.length > var12; ++var12) {
         var13 = var10[var12];
         if (0 == ob_._cc[var13]) {
            this._A[var11++] = var13;
         }
      }

   }
}
