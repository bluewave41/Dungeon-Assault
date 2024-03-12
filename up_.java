final class up_ {
   static int _d;
   private ll_ _a = new ll_();
   static String[] _c = new String[]{"Retreat", "Exercising the better part of valour, the <%0> is able to leave any room without triggering any trap or engaging any monster. (Single use)"};
   private ll_ _e;
   static cn_ _b;

   final ll_ c729(int var1) {
      if (var1 != 13395) {
         return (ll_)null;
      } else {
         ll_ var2 = this._a._n;
         if (var2 != this._a) {
            this._e = var2._n;
            return var2;
         } else {
            this._e = null;
            return null;
         }
      }
   }

   static final void c423() {
      jn_._n.a430(100, false);
      if (hj_._S != -1) {
         qe_._l = eh_._h << 16;
         qe_._f = hj_._S << 16;
      }

      int var0 = -qe_._n + qe_._f;
      int var1 = qe_._l - qe_._c;
      int var2 = ug_.a527(true, (var1 >> 12) * (var1 >> 12) + (var0 >> 12) * (var0 >> 12)) >> 6;
      if (0 <= var2) {
         if (var2 != 0) {
            var1 /= var2;
            var0 /= var2;
            qe_._a += var0;
            qe_._j += var1;
            qe_._j = 14 * qe_._j >> 4;
            qe_._a = qe_._a * 14 >> 4;
         }

         qe_._n += (int)(1048576.0 * te_.a132(mo_._a));
         qe_._c += (int)(te_.a132(mo_._a ^ 773223) * 1048576.0);
         qe_._c += qe_._j;
         qe_._n += qe_._a;
      } else {
         throw new RuntimeException();
      }
   }

   final ll_ a729(int var1) {
      ll_ var2 = this._a._n;
      if (var2 == this._a) {
         return null;
      } else {
         var2.b423((byte)-2);
         return var2;
      }
   }

   final ll_ a786(byte var1) {
      ll_ var2 = this._e;
      if (var2 == this._a) {
         this._e = null;
         return null;
      } else {
         this._e = var2._n;
         if (var1 <= 47) {
            _c = (String[])null;
         }

         return var2;
      }
   }

   static final void b150() {
      lp_.a178(td_._d, true, he_._m);
      jd_._l = true;
   }

   final void a857(ll_ var1, int var2) {
      if (null != var1._l) {
         var1.b423((byte)-2);
      }

      var1._n = this._a;
      if (var2 == -32711) {
         var1._l = this._a._l;
         var1._l._n = var1;
         var1._n._l = var1;
      }
   }

   public static void a487() {
      _c = null;
      _b = null;
   }

   final int b410(byte var1) {
      if (var1 != 53) {
         this.b410((byte)10);
      }

      int var2 = 0;

      for(ll_ var3 = this._a._n; this._a != var3; var3 = var3._n) {
         ++var2;
      }

      return var2;
   }

   public up_() {
      this._a._n = this._a;
      this._a._l = this._a;
   }
}
