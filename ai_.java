final class ai_ {
   int _l;
   boolean _m;
   int _q;
   boolean _i;
   int _o;
   int _j;
   wb_[] _f;
   wd_ _c;
   static int _n;
   int _g;
   int _r;
   static String _b = "<col=FF0000>Lethal</col>. <%0> gains <%col_attack>+1 Attack</col>, <%col_defence>+1 Defence</col> if it wins in combat.";
   ac_ _h;
   static String _e = "Select a dragon from the table and click 'Raid' to start a raid.";
   static String _k = "From simple pickpockets and highwaymen and up through a variety of brigands, the human cities of the west are full of thieves. This is one of the more competant examples - he is, after all, still alive.";
   static String _d = "Order your raider to disarm the trap. <br><br>The trap may be disarmed, the raider may trigger the trap but avoid its effects, or the raider may become trapped.<br><br>Requires: <col=21634A>Dodge</col>, <col=00A7D2>Sneak</col>";
   int _p;
   int _s;
   int _a;

   static final void a150(int var0) {
      qi_._b = ne_._c.b926(ll_._m[13]);
      int var1 = ne_._c.b926(ll_._m[14]);
      if (var0 <= -74) {
         if (var1 > qi_._b) {
            qi_._b = var1;
         }

      }
   }

   public static void a423() {
      _e = null;
      _d = null;
      _b = null;
      _k = null;
   }

   static final hb_ a494(ec_ var0, int var1, int var2, int var3) {
      if (var2 != -12) {
         return (hb_)null;
      } else {
         int var4 = var0.c474(true);
         if (0 == var4) {
            var0.h137(var2 - 94);
            if (11 <= var3) {
               var0.c474(true);
            }

            return null;
         } else {
            hb_ var5 = new hb_(var1, var4);
            var5._e = var0.c474(true);
            var5._g = var0.c474(true);
            var5._f = var0.c474(true);
            var5._k = var0.c474(true);
            if (11 > var3) {
               var5._p = 0;
            } else {
               var5._p = var0.c474(true);
            }

            return var5;
         }
      }
   }

   final void a785(int var1, boolean var2, ec_ var3) {
      var3.a093(var1 ^ -14, this._a);
      var3.a093(var1 + 18, this._p);
      var3.a093(6, this._g);
      var3.a093(6, this._r);
      var3.a093(6, this._q);
      if (var1 != -12) {
         _n = -63;
      }

      if (!var2) {
         var3.a093(6, this._j);
         var3.a093(6, this._l);
         var3.a093(var1 + 18, this._s);
         var3.a093(6, this._o);
      }

   }

   static final void a900(String var0) {
      pd_._E = var0;
   }

   static final void a085(int var0, vh_ var1) {
      ek_._b._A.a688(false, ha_._k, tl_._k, var0, var1);
   }

   ai_(int var1) {
      this._a = var1;
      this._h = gh_._i[this._a];
      if (null != this._h) {
         this._m = this._h._C;
         this._q = this._o = this._h._r;
         this._p = this._j = this._h._A;
         this._r = this._s = this._h._y;
         this._g = this._l = this._h._k;
         this._i = this._h._b;
      }

   }
}
