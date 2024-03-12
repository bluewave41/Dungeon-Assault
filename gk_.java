final class gk_ extends ii_ implements mg_, vg_ {
   static String _O = "Back";
   private ck_ _M;
   gi_ _P;
   private ck_ _N;
   static String _K = "PROFILE";
   private uh_ _R = new uh_("", (pg_)null, 12);
   static boolean[] _Q;
   static gn_ _L;

   private final boolean a056(qn_ var1, int var2) {
      dp_ var3 = var1.a293(-84);
      if (var3 != null) {
         od_ var4 = var3.a151((byte)-95);
         return c_._d == var4;
      } else {
         return true;
      }
   }

   public final void a150(int var1) {
      ((kh_)this._R.a293(-98)).e487(true);
      if (var1 < 121) {
         this._M = (ck_)null;
      }

   }

   static final int a080(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   final void a319(int var1, int var2, lm_ var3, boolean var4) {
      super.a319(var1, var2, var3, var4);
      this._M._B = this.i154(124);
   }

   final boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (var4 < 55) {
         a366(62, (byte)25);
      }

      if (super.a401(var1, var2, var3, (byte)98)) {
         return true;
      } else if (98 != var3) {
         return var3 == 99 ? this.a489((byte)-5, var1) : false;
      } else {
         return this.a059(var1, (byte)71);
      }
   }

   static final me_ a149(String var0) {
      if (im_._b.b154(36) && !var0.equals(im_._b.c738(-2085))) {
         im_._b = oh_.a321(var0);
      }

      return im_._b;
   }

   private final int a063(String var1, int var2, lm_ var3, String var4, int var5, int var6) {
      if (var5 != 21287) {
         a366(-63, (byte)34);
      }

      return this.a670(var1, 35, 50, var4, var3, var2, var6);
   }

   static final ai_ a775(ec_ var0) {
      int var1 = var0.c474(true);
      ai_ var2 = new ai_(var1);
      var2._p = var2._j = var0.c474(true);
      var2._g = var2._l = var0.c474(true);
      var2._r = var2._s = var0.c474(true);
      var2._q = var2._o = var0.c474(true);
      return var2;
   }

   public final void a407(byte var1, String var2) {
      if (var1 >= -26) {
         this._R = (uh_)null;
      }

      uh_ var3 = this._R;
      var3.a223(var2, false, (byte)74);
   }

   public static void b487(boolean var0) {
      _L = null;
      if (var0) {
         _K = (String)null;
      }

      _Q = null;
      _K = null;
      _O = null;
   }

   private final int a670(String var1, int var2, int var3, String var4, lm_ var5, int var6, int var7) {
      if (var3 != 50) {
         return -27;
      } else {
         dg_ var8 = new dg_(20, var7, var6 + 120, 25, var5, false, 120, 3, lp_._C, 16777215, var4);
         this.b485((byte)-61, var8);
         tn_ var9 = new tn_(((qn_)var5).a293(-120), var1, 126, var7 + var8._s, 25 + var6, var2);
         var9._n = this;
         this.b485((byte)-43, var9);
         return var9._s + var8._s;
      }
   }

   public gk_() {
      super(0, 0, 496, 0, (ca_)null);
      hh_ var1 = new hh_(ta_._e, 0, 0, 0, 0, 16777215, -1, 3, 0, lp_._C._H, -1, Integer.MAX_VALUE, true);
      lm_ var2 = new lm_(vo_._q, var1, (pg_)null);
      this._M = new ck_(m_._g, (pg_)null);
      this._N = new ck_(dc_._v, (pg_)null);
      this._R._i = un_._d;
      this._R.a981(new kh_(this._R), 10508);
      this._M._B = false;
      this._M._o = new na_();
      this._N._o = new oa_();
      this._R._o = new mc_(10000536);
      int var3 = 20;
      byte var4 = 4;
      short var5 = 200;
      var2.b050(0, 270, var3, 20, 50);
      this.b485((byte)-49, var2);
      var3 += 50;
      var3 += 5 + this.a063(an_._z, 170, this._R, wf_._B, 21287, var3);
      this._M.b050(0, var5, var3, 496 - var5 >> 1, 40);
      this._N.b050(0, 60, var3 + 15, 3 + var4, 40);
      this._N._n = this;
      this._M._n = this;
      this.b485((byte)-90, this._M);
      this.b485((byte)-115, this._N);
      this._P = new gi_(this);
      this._P.b050(0, super._x - this._R._q + (-this._R._x - 60), 20, 60 + this._R._x + this._R._q, 150);
      this.b485((byte)-77, this._P);
      this.b050(0, 496, 0, 0, 55 + var3 + var4);
   }

   private final void f423(byte var1) {
      if (var1 == -43) {
         if (this.i154(126)) {
            pk_.a984(this._R._w);
         }
      }
   }

   static final void a560(int var0, h_ var1, int var2, int var3) {
      sd_.a294(var0, gd_._E, var2, var1._m, var3);
      sd_.a294(40 + var0, jj_._b, var2, var1._r, var3);
      sd_.a294(var0, wl_._d, var2, var1._b, var3 + 18);
      sd_.a294(var0 + 40, pk_._o, var2, var1._o, var3 + 18);
   }

   static final void a366(int var0, byte var1) {
      try {
         ee_.a008("resizing", m_.c372(true), var1 + 15643, new Object[]{new Integer(var0)});
      } catch (Throwable var3) {
      }

      if (var1 != 4) {
         a149((String)null);
      }

   }

   public final void a475(ck_ var1, byte var2, int var3, int var4, int var5) {
      if (var2 != 98) {
         this.a319(-18, 59, (lm_)null, false);
      }

      if (var1 != this._N) {
         if (var1 == this._M) {
            this.f423((byte)-43);
         }
      } else {
         rc_.b150(var2 ^ 4);
      }

   }

   static final boolean a398(String var0, String var1) {
      String var2 = sh_.a439(var0);
      if (-1 == var1.indexOf(var0) && var1.indexOf(var2) == -1) {
         return var1.startsWith(var0) || var1.startsWith(var2) || var1.endsWith(var0) || var1.endsWith(var2);
      } else {
         return true;
      }
   }

   private final boolean i154(int var1) {
      if (!this.a056(this._R, -70)) {
         return false;
      } else {
         return var1 > 123;
      }
   }
}
