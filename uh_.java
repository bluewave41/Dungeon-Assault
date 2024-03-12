final class uh_ extends rm_ implements qn_ {
   private dp_ _W;
   private int _U;
   static String _V = "You have not yet been raided.";

   public static void i423() {
      _V = null;
   }

   final void a319(int var1, int var2, lm_ var3, boolean var4) {
      super.a319(var1, var2, var3, var4);
      this._U = -super._q + hj_._S - var1;
      if (!var4) {
         this.a981((dp_)null, -106);
      }

   }

   final void a981(dp_ var1, int var2) {
      this._W = var1;
      if (var2 != 10508) {
         this._U = 28;
      }

   }

   public final dp_ a293(int var1) {
      if (var1 >= -74) {
         _V = (String)null;
      }

      return this._W;
   }

   final void n150(int var1) {
      super.n150(var1);
      if (null != this._W) {
         this._W.b150(2899);
      }

   }

   final String c983(byte var1) {
      if (var1 < 3) {
         this.n150(111);
      }

      if (super._u && super._i != null) {
         vj_.a679(eh_._h, -this._U + super._x + hj_._S);
         return super._i;
      } else {
         return null;
      }
   }

   uh_(String var1, pg_ var2, int var3) {
      super(var1, var2, var3);
   }
}
