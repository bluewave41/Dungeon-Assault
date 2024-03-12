final class wa_ {
   private ne_ _i;
   private ne_[] _h;
   static String _e = "Account created successfully!";
   private int _n;
   static int _k = 5;
   private ne_ _d;
   private int _g = 0;
   static String _f = "You have never raided a dungeon.";
   static int _c = -1;
   static ec_ _b;
   static mb_ _j;
   static boolean _a;
   static int[] _m;
   static int _l;

   static final void a374(int var0, int var1, int var2, cn_ var3, int var4, int var5) {
      var3.h093(var4, var5);
      db_._v.b191(Integer.toString(var0), 20 + var4, (var3._v + la_._b._H >> 1) + var5, var2, var1);
   }

   final ne_ a722(long var1, int var3) {
      if (var3 != 8) {
         _b = (ec_)null;
      }

      ne_ var4 = this._h[(int)((long)(this._n - 1) & var1)];

      for(this._d = var4._e; this._d != var4; this._d = this._d._e) {
         if (this._d._h == var1) {
            ne_ var5 = this._d;
            this._d = this._d._e;
            return var5;
         }
      }

      this._d = null;
      return null;
   }

   final ne_ a457(boolean var1) {
      if (!var1) {
         _l = -108;
      }

      this._g = 0;
      return this.a024(4318);
   }

   public static void c150() {
      _b = null;
      _m = null;
      _j = null;
      _f = null;
      _e = null;
   }

   static final void a238(cn_ var0) {
      ol_._b = var0;
   }

   static final int[] b878(int var0) {
      if (var0 != -1) {
         b878(20);
      }

      return new int[8];
   }

   final ne_ a024(int var1) {
      ne_ var2;
      if (0 < this._g && this._h[this._g - 1] != this._i) {
         var2 = this._i;
         this._i = var2._e;
         return var2;
      } else if (var1 != 4318) {
         return (ne_)null;
      } else {
         do {
            if (this._g >= this._n) {
               return null;
            }

            var2 = this._h[this._g++]._e;
         } while(this._h[this._g - 1] == var2);

         this._i = var2._e;
         return var2;
      }
   }

   final void a102(ne_ var1, int var2, long var3) {
      if (null != var1._a) {
         var1.a487(false);
      }

      ne_ var5 = this._h[(int)(var3 & (long)(this._n - 1))];
      var1._a = var5._a;
      var1._e = var5;
      var1._a._e = var1;
      if (var2 != 12460) {
         _e = (String)null;
      }

      var1._e._a = var1;
      var1._h = var3;
   }

   wa_(int var1) {
      this._h = new ne_[var1];
      this._n = var1;

      for(int var2 = 0; var2 < var1; ++var2) {
         ne_ var3 = this._h[var2] = new ne_();
         var3._a = var3;
         var3._e = var3;
      }

   }
}
