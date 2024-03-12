class kl_ {
   static String _e = "Renown gained: ";
   boolean _d;
   static String _b = "Glamour";
   int _j;
   md_ _f;
   private ph_ _g;
   static String[] _c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
   int _k;
   int _a;
   static gd_ _h;
   int _i;
   ph_ _l;

   private final void c487(boolean var1) {
      if (var1) {
         this._a = 126;
      }

      qe_.a716(this._g, this._k, this._j, this._a, this._i);
      this._g.h093(this._k, this._j);

      for(rj_ var2 = (rj_)this._f.e024(-24172); null != var2; var2 = (rj_)this._f.a024(4)) {
         var2.d150(0);
      }

   }

   kl_(int var1, int var2, int var3, int var4) {
      this();
      this.a050(var2, var3, var1, -23241, var4);
   }

   final void a050(int var1, int var2, int var3, int var4, int var5) {
      this._i = var5;
      this._j = var1;
      this._a = var2;
      this._k = var3;
      this.b423((byte)37);
      nm_._ib = new int[this._i * this._a];
      if (var4 != -23241) {
         this.a487(true);
      }

      this._g = new ph_(new cn_(this._a, this._i), new cn_(this._a, this._i));
   }

   void b423(byte var1) {
      int[] var2 = new int[64];

      for(int var3 = 0; 64 > var3; ++var3) {
         var2[var3] = mp_.a080(Integer.MIN_VALUE, 65793 * (24 + var3));
      }

      cn_ var6 = te_.a983(this._a, this._i, var2, 16, 8, 0.125);
      if (var1 == 37) {
         int[] var4 = te_.b285(this._a, this._i, 0.125);
         cn_ var5 = new cn_(0, 0);
         var5._v = this._i;
         var5._B = var4;
         var5._y = this._a;
         this._l = new ph_(var6, var5);
         jh_.a276(this._l);
         ke_.a115(0, this._i, 0);
         ke_.a115(this._a - 8, this._i, 0);
         un_.a770(8, this._a - 16, 0);
         un_.a770(8, this._a - 16, this._i - 8);
         qe_.a229(8, 8, this._a - 16, this._i - 16, 224, 32, 7, 128);
         jh_.b797();
      }
   }

   void a487(boolean var1) {
      eg_.a537(this._f);
      if (var1) {
         _c = (String[])null;
      }

   }

   public static void a150() {
      _b = null;
      _c = null;
      _e = null;
      _h = null;
   }

   void c150(int var1) {
      if (var1 > -115) {
         this._i = -43;
      }

      for(rj_ var2 = (rj_)this._f.e024(-24172); null != var2; var2 = (rj_)this._f.a024(4)) {
         var2.b423((byte)30);
      }

   }

   kl_(int var1, int var2) {
      this();
      this.a326(var1, 0, var2);
   }

   void c423(byte var1) {
   }

   final void a326(int var1, int var2, int var3) {
      this.a050(-var3 + 480 >> 1, var1, 640 - var1 >> 1, -23241, var3);
      if (var2 != 0) {
         this.b150(-9);
      }

   }

   final void a423(byte var1) {
      jh_.a276(this._g);
      if (var1 > -12) {
         this._g = (ph_)null;
      }

      this._l.b093(0, 0);

      for(rj_ var2 = (rj_)this._f.e024(-24172); null != var2; var2 = (rj_)this._f.a024(4)) {
         var2.a599(-this._k, -this._j, (byte)-96);
      }

      jh_.b797();
   }

   void b150(int var1) {
      this.c487(false);
   }

   void b487(boolean var1) {
      if (var1) {
         this._g = (ph_)null;
      }

   }

   static final String a755(CharSequence var0) {
      String var2 = uj_.a748(ci_.a438(var0, 2), -1);
      if (null == var2) {
         var2 = "";
      }

      return var2;
   }

   public kl_() {
      this._f = new md_();
      this._d = false;
   }
}
