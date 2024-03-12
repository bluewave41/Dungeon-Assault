final class tb_ {
   private ll_ _e;
   static q_ _a;
   static cn_ _c;
   static int _i;
   static int _g;
   private ll_[] _d;
   private int _f;
   static String _h = "A veteran of the constant border wars between the human nations and the orc clans, the orc blademaster's specialty is sudden and silent violence, though he is likely to come off second best in a prolonged fight.";
   private long _b;

   final ll_ a312(byte var1, long var2) {
      this._b = var2;
      ll_ var4 = this._d[(int)(var2 & (long)(this._f - 1))];

      for(this._e = var4._n; var4 != this._e; this._e = this._e._n) {
         if (this._e._o == var2) {
            ll_ var6 = this._e;
            this._e = this._e._n;
            return var6;
         }
      }

      this._e = null;
      return null;
   }

   static final void a423() {
      vj_._c = null;
      no_._a = 0;
      ti_._f = false;
      fl_._l = -1;
      wa_._c = -1;
   }

   final void a627(ll_ var1, long var2, int var4) {
      if (var1._l != null) {
         var1.b423((byte)-2);
      }

      ll_ var5 = this._d[(int)(var2 & (long)(this._f - 1))];
      if (var4 < -60) {
         var1._l = var5._l;
         var1._n = var5;
         var1._l._n = var1;
         var1._o = var2;
         var1._n._l = var1;
      }
   }

   final ll_ c786(byte var1) {
      if (null != this._e) {
         for(ll_ var2 = this._d[(int)(this._b & (long)(this._f - 1))]; var2 != this._e; this._e = this._e._n) {
            if (this._e._o == this._b) {
               ll_ var3 = this._e;
               this._e = this._e._n;
               return var3;
            }
         }

         if (var1 < 0) {
            return (ll_)null;
         } else {
            this._e = null;
            return null;
         }
      } else {
         return null;
      }
   }

   public static void b423() {
      _c = null;
      _h = null;
      _a = null;
   }

   static final void a540(boolean var0) {
      if (null != ik_._e) {
         ik_._e.a487(var0);
      }

   }

   tb_(int var1) {
      this._f = var1;
      this._d = new ll_[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         ll_ var3 = this._d[var2] = new ll_();
         var3._l = var3;
         var3._n = var3;
      }

   }
}
