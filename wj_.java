final class wj_ extends ec_ {
   static cn_ _w;
   private ff_ _v;
   static int _s;
   private int _t;
   static String _x = "The changes you have made to your dungeon have not yet been saved. Would you like them to be saved now?";
   static wh_ _u;

   final void d556(byte var1, int var2) {
      super._m[super._o++] = (byte)(var2 + this._v.a137(26979));
      if (var1 > -76) {
         this._t = 30;
      }

   }

   final void a977(int[] var1, byte var2) {
      this._v = new ff_(var1);
   }

   final int m137(int var1) {
      return var1 != 255 ? -17 : 255 & super._m[super._o++] - this._v.a137(26979);
   }

   final int j080(int var1, int var2) {
      int var3 = this._t >> 3;
      int var4 = -(7 & this._t) + 8;
      int var5 = 0;

      for(this._t += var2; var2 > var4; var4 = 8) {
         var5 += (super._m[var3++] & ba_._b[var4]) << -var4 + var2;
         var2 -= var4;
      }

      if (var4 == var2) {
         var5 += super._m[var3] & ba_._b[var4];
      } else {
         var5 += super._m[var3] >> -var2 + var4 & ba_._b[var2];
      }

      return var5;
   }

   final void f423(byte var1) {
      super._o = (this._t + 7) / 8;
      if (var1 <= 19) {
         this.f423((byte)-32);
      }

   }

   wj_(int var1) {
      super(var1);
   }

   wj_(byte[] var1) {
      super(var1);
   }

   final void a596(int var1, byte var2, int var3, byte[] var4) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5 + var1] = (byte)(super._m[super._o++] - this._v.a137(26979));
      }

      if (var2 != 95) {
         this.e487(true);
      }

   }

   public static void n150() {
      _u = null;
      _w = null;
      _x = null;
   }

   final void e487(boolean var1) {
      if (!var1) {
         this._t = 8 * super._o;
      }
   }
}
