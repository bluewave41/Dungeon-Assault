final class nm_ extends sj_ implements vg_ {
   private ck_ _kb;
   static String _lb = "A pathetic wretch; the runt's sole redeeming feature is its expendability, so common is its kind in the realm of Dungaria that it can be easily replaced.";
   static String _jb = "Treasure: ";
   static int[] _ib;
   static String _mb = "Hidden Nails";

   public final void a475(ck_ var1, byte var2, int var3, int var4, int var5) {
      if (var2 != 98) {
         _mb = (String)null;
      }

      if (var1 == this._kb) {
         this.m150(110);
      }

   }

   private final void m150(int var1) {
      if (super._T) {
         super._T = false;
      }
   }

   private final ck_ a389(int var1, pg_ var2, String var3) {
      ck_ var4 = new ck_(var3, var2);
      var4._o = new na_();
      int var5 = super._s - 6;
      if (var1 != 26414) {
         this._kb = (ck_)null;
      }

      super._s += 38;
      var4.b050(0, super._x - 14 - 16, var5, 15, 30);
      this.b485((byte)-127, var4);
      this.f150(12591);
      return var4;
   }

   nm_(ji_ var1, r_ var2) {
      super(var1, 200, 150);
      String var3 = null;
      if (var2 != gl_._Gb) {
         if (var2 != of_._g) {
            if (var2 == mc_._x) {
               super._s += 30;
               var3 = id_._g;
            }
         } else {
            var3 = jg_._b;
            super._s += 10;
            if (eh_.b154()) {
               super._s += 20;
               var3 = ti_._v;
            }
         }
      } else {
         var3 = oh_._a;
      }

      lm_ var4 = new lm_(var3, (pg_)null);
      var4._s = 80;
      var4._x = super._x;
      var4._v = 50;
      var4._q = 0;
      var4._o = new hh_(ta_._e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
      this.b485((byte)-66, var4);
      this._kb = this.a389(26414, this, sp_._b);
   }

   public static void n150() {
      _lb = null;
      _jb = null;
      _ib = null;
      _mb = null;
   }
}
