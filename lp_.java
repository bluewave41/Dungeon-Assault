final class lp_ extends ne_ {
   int _p;
   static fb_ _o = new fb_();
   int _J;
   int _E;
   int _r;
   va_ _I;
   int _w;
   int _u;
   int _k;
   int _j;
   int _G;
   of_ _A;
   int _m;
   int _y;
   static String _n = "FAILURE";
   int _l;
   int _s;
   int _H;
   int _D;
   static int _z = 50;
   int _t;
   ni_ _v;
   kk_ _x;
   static String[] _q = new String[]{null, "Events in the dungeon are resolved by checking your raider's skills against those of the room. Raider <%attack> is matched against room <%defence>; <%defence> against <%attack>; <%dodge> against <%snare>; and <%sneak> against <%detect>. The chance of your raider winning depends on its skill level in relation to the room's."};
   int _i;
   static se_ _C;
   static int[] _B = new int[8192];
   static String[] _F = new String[]{null, "A <%raider> will surprise the monster if its <%sneak> roll beats the room's <%detect>."};

   final void b487(boolean var1) {
      this._A = null;
      this._x = null;
      this._I = null;
      if (!var1) {
         a314(32, 13, -24, -116, -76, (cn_[])null, 99, (se_)null, -88, 17, -20, -33, (cn_[])null, 46, 59, 87, (cn_[])null, -51, (se_)null, -61, 66);
      }

      this._v = null;
   }

   static final void a178(String var0, boolean var1, String var2) {
      ek_._i = var0;
      co_._C = var2;
      gh_.a676(sl_._a, var1);
   }

   public static void a423() {
      _q = null;
      _B = null;
      _C = null;
      _F = null;
      _o = null;
      _n = null;
   }

   static final void a314(int var0, int var1, int var2, int var3, int var4, cn_[] var5, int var6, se_ var7, int var8, int var9, int var10, int var11, cn_[] var12, int var13, int var14, int var15, cn_[] var16, int var17, se_ var18, int var19, int var20) {
      if (var3 < 68) {
         _z = -40;
      }

      fc_.a540(new qk_(var5), var0, var6, var20, var9, var4, var15, var19, var8, var13, var10, new qk_(var16), var1, var2, var14, var7, new qk_(var12), var11, var18, var17);
   }

   static final int a760(int var0, int var1) {
      int var2;
      for(var2 = 0; 0 < var0; --var0) {
         var2 = var2 << 1 | var1 & 1;
         var1 >>>= 1;
      }

      return var2;
   }
}
