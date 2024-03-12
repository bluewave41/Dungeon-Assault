final class pk_ extends kl_ {
   boolean _r;
   private pp_ _n;
   static cn_ _o;
   int _u;
   static String _q = "Swinging his morningstar wildly, the zealot has been fighting constantly for his cause so long he is no longer sure what it was.";
   private String _p;
   private String _m;
   private pp_ _s;
   static int _t = 0;

   pk_(String var1, String var2, int var3) {
      this(var1, var2, mp_._e.toUpperCase(), um_._d.toUpperCase(), var3);
   }

   public static void e150() {
      _o = null;
      _q = null;
   }

   static final void a984(String var0) {
      ai_.a900(var0);
      gh_.a676(sl_._a, false);
   }

   static final void d150() {
      wj_ var0 = ra_._c;
      int var1 = var0.c474(true);
      if (var1 == 0) {
         int[] var3 = wa_.b878(-1);
         int[] var4 = var3;
         wj_ var5 = var0;
         int var6 = var0.c474(true);

         for(int var7 = 0; var6 > var7; ++var7) {
            var4[var7] = var5.h137(-111);
         }

         pe_ var10 = (pe_)sf_._c.e024(-24172);
         if (var10 == null) {
            tl_.a150(111);
            return;
         }

         var10.a487(false);
      } else if (1 == var1) {
         ak_ var8 = (ak_)oh_._j.e024(-24172);
         if (var8 == null) {
            tl_.a150(-110);
            return;
         }

         var8.a487(false);
      } else if (var1 == 2) {
         pe_ var9 = (pe_)sf_._c.e024(-24172);
         if (null == var9) {
            tl_.a150(-43);
            return;
         }

         wa_.b878(-1);
         var9.a487(false);
      } else {
         sm_.a741((Throwable)null, 1, "A1: " + sj_.l738(192));
         tl_.a150(-16);
      }

   }

   final void b150(int var1) {
      super.b150(-81);
      int var3 = 60 + super._j;
      la_._b.a385(this._m, 40 + super._k, var3, super._a - 80, super._i - 16 + (super._j - var3 - (jm_._i._v >> 1)), 16777215, -1, 1, 1, la_._b._H);
   }

   final void b423(byte var1) {
      int[] var2 = new int[64];

      for(int var3 = 0; 64 > var3; ++var3) {
         var2[var3] = mp_.a080((24 + var3) * 65793, Integer.MIN_VALUE);
      }

      cn_ var9 = te_.a983(super._a - 32, super._i - 28, var2, 16, 8, 0.125);
      int[] var4 = te_.b285(super._a - 32, super._i - 28, 0.125);
      cn_ var5 = new cn_(0, 0);
      if (var1 != 37) {
         _q = (String)null;
      }

      var5._y = super._a - 32;
      var5._v = super._i - 28;
      var5._B = var4;
      ph_ var6 = new ph_(var9, var5);
      cn_ var7 = new cn_(super._a, super._i);
      cn_ var8 = new cn_(super._a, super._i);
      super._l = new ph_(var7, var8);
      jh_.a276(super._l);
      var6.b093(16, 16);
      qe_.a229(23, 13, super._a - 46, super._i - 34, 256, 32, 8, 128);
      jc_.a669(super._i - 26, 16, 14, 1, 2, 1);
      jc_.a669(super._i - 26, super._a - 24, 14, 1, 2, 1);
      vd_.a669(super._a - 16, 2, -14561, 2, 8, 0);
      vd_.a669(super._a, 2, -14561, 2, 0, 6);
      vd_.a669(super._a, 2, var1 ^ -14534, 2, 0, 54);
      vd_.a669(super._a - 16, 2, var1 ^ -14534, 2, 8, super._i - 16);
      vd_.a669(super._a, 2, -14561, 2, 0, super._i - 22);
      jc_.a669(40, 80, 14, 1, 2, 1);
      jc_.a669(40, super._a - 88, 14, 1, 2, 1);
      oe_._m.h093(8, 21);
      oe_._m.j093(super._a - 63, 21);
      ad_._e.i093(23, super._i - 38);
      ad_._e.f093(super._a - 39, super._i - 38);
      da_.a563(this._p, cm_._M, super._a >> 1, 1917623617, (36 + ne_._c._H >> 1) + 14, ne_._c);
      jh_.b797();
   }

   pk_(String var1, String var2, String var3, String var4, int var5) {
      this._p = var1;
      this._u = var5;
      this._m = var2;
      int var6 = 78 + jm_._i._v + oj_.a170(this._m, new int[]{300}, la_._b) * la_._b._H;
      this.a326(450, 0, var6);
      super._d = false;
      this._n = tn_.a226(-jm_._i._y + ((super._a >> 1) - 10) + super._k, super._i + (super._j - 16) - (jm_._i._v >> 1), ne_._c, jm_._i, -67, var3);
      this._s = tn_.a226(super._k - (-(super._a >> 1) - 10), -(jm_._i._v >> 1) - 16 + super._j + super._i, ne_._c, jm_._i, -93, var4);
      super._f.a865(this._n, false);
      super._f.a865(this._s, false);
   }

   final void a487(boolean var1) {
      if (var1) {
         _o = (cn_)null;
      }

      super.a487(var1);
      if (hh_._s != null) {
         super._d = true;
         this._r = this._n == hh_._s;
      }

   }
}
