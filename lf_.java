final class lf_ extends kl_ {
   private String _r;
   static cn_ _x;
   static u_[] _y;
   private pp_ _o;
   static String _v = "Ogre Thug";
   private pp_ _s;
   static String _p = "Berserker";
   static wh_ _w;
   boolean _u;
   static cn_ _n;
   private String _t;
   static String _m = "This guardian is lethal.";
   static String _q = "Please send me news and updates (I can unsubscribe at any time)";

   final void a487(boolean var1) {
      super.a487(var1);
      if (hh_._s != null) {
         this._u = hh_._s == this._o;
         super._d = true;
      }

   }

   public static void d150() {
      _w = null;
      _v = null;
      _p = null;
      _q = null;
      _y = null;
      _m = null;
      _n = null;
      _x = null;
   }

   lf_(String var1, String var2) {
      this(var1, var2, 300);
   }

   final void b150(int var1) {
      super.b150(-91);
      int var3 = super._k + (super._a >> 1);
      int var4 = super._j + 10;
      ne_._c.c191(this._t, var3, ne_._c._H + var4, 16777215, -1);
      var4 += ne_._c._H;
      la_._b.a385(this._r, 20 + super._k, var4, super._a - 40, -(jm_._i._v * 2) + (-24 - var4) + super._i + super._j, 16777215, -1, 1, 1, la_._b._H);
   }

   private lf_(String var1, String var2, int var3) {
      this._t = var1;
      this._r = var2;
      int var4 = 88 - (-(2 * jm_._i._v) - oj_.a170(this._r, new int[]{300}, la_._b) * la_._b._H);
      this.a326(var3, 0, var4);
      super._d = false;
      this._o = tn_.a226(super._k + (-jm_._i._y + super._a >> 1), super._i + (super._j - 24 - jm_._i._v * 2), ne_._c, jm_._i, -81, mp_._e);
      this._s = tn_.a226(super._k + (-jm_._i._y + super._a >> 1), super._j - 16 - (-super._i + jm_._i._v), ne_._c, jm_._i, -111, um_._d);
      super._f.a865(this._o, false);
      super._f.a865(this._s, false);
   }

   static final void d423(byte var0) {
      wj_ var1 = ra_._c;
      int var2 = var1.c474(true);
      String var4;
      if (0 == var2) {
         if (null == lh_._p) {
            lh_._p = new tb_(128);
            kp_._e = 0;
         }

         boolean var9 = 1 == var1.c474(true);
         var4 = var1.d738(-119);
         if (var9) {
            var1.d738(-103);
         }

         bo_ var10 = vj_.a060(var4, 49);
         String var11 = var1.d738(-99);
         String var12 = jm_.a715((byte)59, var4);
         if (var12 == null) {
            var12 = var4;
         }

         if (var10 == null) {
            var10 = vj_.a060(var11, 116);
            if (var10 != null) {
               lh_._p.a627(var10, (long)var12.hashCode(), -106);
            }
         }

         if (var10 == null) {
            var10 = new bo_();
            lh_._p.a627(var10, (long)var12.hashCode(), var0 ^ -59);
            var10._Ib = kp_._e++;
            fm_._b.a865(var10, false);
         }

         var10._Hb = var4;
      } else {
         String var3;
         if (var2 != 1) {
            if (var0 != 123) {
               d423((byte)37);
            }

            if (var2 == 2) {
               if (ke_._d == 1) {
                  ke_._d = 2;
               }

            } else if (3 == var2) {
               if (ke_._d == 2) {
                  ke_._d = 1;
               }

            } else if (4 != var2) {
               sm_.a741((Throwable)null, 1, "F1: " + sj_.l738(var0 + 69));
               tl_.a150(var0 ^ -61);
            } else {
               ke_._d = 1;
               var3 = var1.d738(var0 - 247);
               gm_._b = var3.intern();
               int var8 = var1.c474(true);
               r_.a556(var8);
            }
         } else {
            if (fk_._v == null) {
               fk_._v = new tb_(128);
               o_._m = 0;
            }

            var3 = var1.d738(-127);
            if (var3.equals("")) {
               var3 = null;
            }

            var4 = var1.d738(var0 - 230);
            String var5 = var1.d738(-117);
            bo_ var6 = ll_.a997(var4, (byte)-47);
            if (null == var6) {
               var6 = ll_.a997(var5, (byte)-47);
               if (null != var6) {
                  fk_._v.a627(var6, (long)jm_.a715((byte)59, var4).hashCode(), -86);
               }
            }

            if (null == var6) {
               var6 = new bo_();
               fk_._v.a627(var6, (long)jm_.a715((byte)59, var4).hashCode(), var0 ^ -69);
               var6._Ib = o_._m++;
               jm_._f.a865(var6, false);
            }

            if (var3 != null) {
               var3 = var3.intern();
            }

            var6._Nb = var3;
            var6._Hb = var4;
            var6.a487(false);

            bo_ var7;
            for(var7 = (bo_)jm_._f.e024(-24172); var7 != null && eg_.a102(var6, var0 + 77, var7); var7 = (bo_)jm_._f.a024(var0 - 119)) {
            }

            if (var7 == null) {
               jm_._f.a865(var6, false);
            } else {
               so_.a985((byte)55, var7, var6);
            }

         }
      }
   }
}
