import java.awt.Canvas;

final class gi_ extends ii_ implements vg_ {
   private mg_ _N;
   static int[] _L = new int[8192];
   static String[] _K = new String[]{"Scout", "Scout next room. (Single use)"};
   static String _P = "Corrosive Slime";
   private String[] _M;
   static Canvas _R;
   private ck_[] _O;
   static String _Q = "<col=2E5D17>Advance</col> - Engage monster";
   static uo_ _S;

   final void a144(byte var1, String[] var2) {
      super._B.b150(-4);
      if (var2 != null && var2.length != 0) {
         int var3 = var2.length;
         this._M = new String[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            this._M[var5] = kl_.a755(var2[var5]).replace(' ', ' ');
         }

         oa_ var7 = new oa_(lp_._C, 0, 1);
         this._O = new ck_[var3 + 1];

         for(int var6 = 0; var3 > var6; ++var6) {
            this._O[var6] = new ck_(this._M[var6], this);
            this._O[var6]._o = var7;
            this._O[var6]._i = ln_._c;
            this._O[var6].b050(0, 80, var6 * 16 + 20, 0, 15);
            this.b485((byte)-123, this._O[var6]);
         }

         this._O[var3] = new ck_(li_._i, this);
         this._O[var3]._o = var7;
         this._O[var3].b050(0, 100, 16 + 16 * var3 + 20, 0, 15);
         this.b485((byte)-117, this._O[var3]);
      } else {
         this._M = null;
      }
   }

   public static void f423() {
      _K = null;
      _S = null;
      _P = null;
      _R = null;
      _Q = null;
      _L = null;
   }

   final void a115(int var1, int var2, int var3, int var4) {
      super.a115(var1, var2, var3, var4);
      if (var1 == 0) {
         se_ var5 = lp_._C;
         if (null != this._M) {
            var5.a385(sc_._p, var2 + super._q, var4 + super._v, super._x, 20, 16777215, -1, 0, 0, var5._E + var5._H);
         }

      }
   }

   public final void a475(ck_ var1, byte var2, int var3, int var4, int var5) {
      if (var2 != 98) {
         this._O = (ck_[])null;
      }

      for(int var6 = 0; this._M.length > var6; ++var6) {
         if (var1 == this._O[var6]) {
            this._N.a407((byte)-67, this._M[var6]);
         }
      }

      if (var1 == this._O[this._M.length]) {
         this._N.a150(125);
      }

   }

   gi_(mg_ var1) {
      super(0, 0, 0, 0, (ca_)null);
      this._N = var1;
   }

   final boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (super.a401(var1, var2, var3, (byte)125)) {
         return true;
      } else if (98 == var3) {
         return this.a059(var1, (byte)71);
      } else if (99 == var3) {
         return this.a489((byte)-5, var1);
      } else {
         return var4 < 55 ? false : false;
      }
   }
}
