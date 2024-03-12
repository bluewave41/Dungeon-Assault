final class wi_ extends sj_ {
   private boolean _sb;
   private String _jb;
   private uc_ _ub;
   private String _ib;
   static rj_ _ob;
   static String _mb = "Entrance";
   static String _rb = "Giant Snake";
   static String _nb = "Ability used";
   static int _kb;
   static String _lb = "A humanoid construct made of stone; its one instruction is to crush the bodies of any raiders that cross its path.<br><br>This monster requires 2 successful strikes from the same raider to defeat.";
   static String _qb = "You successfully stole <%0> gold!";
   private boolean _pb;
   static volatile int _tb = -1;

   static final int c313(int var0, int var1, int var2) {
      int var3 = 0;
      if (var1 != 2113632) {
         _tb = -43;
      }

      for(int var4 = en_._c; uc_._K.length > var3; ++var3) {
         int var5 = dd_._A[var3];
         if (var5 >= 0) {
            int var6 = rb_.a218((byte)120, uc_._K[var3]);
            int var7 = -(var6 >> 1) + tm_._e;
            var4 += lc_._j;
            if (ec_.a366(var4, (i_._o << 1) + cd_._e, var2, (an_._w << 1) + var6, -an_._w + var7, var0, var1 - 2113557)) {
               return var5;
            }

            var4 += cd_._e + lc_._j + (i_._o << 1);
         } else {
            var4 += gb_._a;
         }
      }

      return -1;
   }

   public static void i423(byte var0) {
      if (var0 > -44) {
         _rb = (String)null;
      }

      _lb = null;
      _mb = null;
      _rb = null;
      _qb = null;
      _ob = null;
      _nb = null;
   }

   final void a663(int var1, int var2, boolean var3) {
      super.a663(var1, var2, var3);
      hc_._f.c191(this._jb, var2 + (super._x >> 1), var1 + 103, 16777215, -1);
      if (null != this._ib) {
         gf_.b115(20 + var2, 120 + (var1 - 7), 260, 8421504);
         hc_._f.a385(this._ib, var2 + 20, var1 + 128, 260, 100, 16777215, -1, 1, 0, hc_._f._H);
      }

   }

   final void j423(byte var1) {
      if (var1 != -115) {
         i423((byte)54);
      }

      this._pb = true;
      this._ub._R = false;
   }

   wi_(ji_ var1, String var2) {
      super(var1, 300, 120);
      this._ib = var2;
      if (this._ib != null) {
         int var3 = hc_._f.a490(this._ib, 260, hc_._f._H);
         this.b326(120, 150 + var3, 300);
      }

      this._ub = new uc_(13, 50, 274, 30, 15, 2113632, 4210752);
      this._pb = false;
      this._sb = false;
      this._ub._R = true;
      this.b485((byte)-84, this._ub);
   }

   final void a189(boolean var1, String var2, float var3, byte var4) {
      if (!var1 != !this._sb) {
         this._sb = var1;
         if (!this._sb) {
            this._ub.b789(4210752, (byte)94, 2113632);
            if (this._pb) {
               this._ub._R = false;
            }
         } else {
            this._ub.b789(4210752, (byte)94, 8405024);
            this._ub._R = true;
         }
      }

      this._jb = var2;
      this._ub._S = (int)(var3 / 100.0F * 65536.0F);
   }
}
