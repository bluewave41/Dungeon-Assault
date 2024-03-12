class ok_ extends ko_ {
   int _G;
   private boolean _Cb;
   private cn_ _C;
   private int _Z;
   private md_ _F;
   private int _xb;
   static int[] _S = new int[8192];
   private int _vb;
   int _lb;
   private int _Eb;
   private int _ub;
   static String _jb = "Enchantress";
   private boolean _bb;
   cn_ _L;
   private int _H;
   int _B;
   private int _db;
   private boolean _qb;
   private String _K;
   private int _Db;
   private int _M;
   private int _eb;
   boolean _hb;
   private cn_[] _rb;
   private int _W;
   static tf_ _Y;
   private cn_[] _Fb;
   private boolean _ib;
   private int _nb;
   private int _x;
   private int _tb;
   private int _pb;
   private boolean _kb;
   private int _Ab;
   se_ _y;
   int _fb;
   int _ob;
   private int _yb;
   private int _I;
   private boolean _A;
   private cn_[] _U;
   private String _Q;
   private cn_ _ab;
   static int[] _X = new int[]{0, 16777164, 16776960, 16763904, 16737792, 16720384, 16711680, 12255232, 4456448, 0};
   private int _sb;
   private boolean _V;
   private cn_[] _R;
   private int _Bb;
   private int _T;
   private int _N;
   private int _mb;
   private boolean _O;
   private cn_ _P;
   private cn_[] _E;
   int _D;
   private int _zb;
   private int _wb;
   private cn_ _cb;
   int _gb;
   private int _J;
   static int _z = 48;

   final void a430(int var1, boolean var2) {
      im_._a = !var2;
      ti_._i = !var2;
      this.a116(gf_._c, 0, 7183, 0, true, gf_._i);
      if (var1 != -2) {
         this._sb = 49;
      }

   }

   final void e150(int var1) {
      if (var1 == 30509) {
         if (null != this._F) {
            for(ok_ var2 = (ok_)this._F.d024(-14205); null != var2; var2 = (ok_)this._F.g024(20)) {
               var2._O = true;
               var2.e150(30509);
            }
         }

      }
   }

   ok_(long var1, ok_ var3) {
      this(var1, var3, 0, 0, 0, 0, (String)null);
   }

   ok_(long var1, ok_ var3, String var4) {
      this(var1, var3, 0, 0, 0, 0, var4);
   }

   private final void a074(int var1, int var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, int var10, int var11) {
      this._ub = var3 + this._D;
      this._zb = var1 + this._gb;
      int var12 = gf_._j;
      int var13 = gf_._f;
      int var14 = gf_._h;
      int var15 = gf_._e;
      gf_.a115(this._zb, this._ub, this._ob + this._zb, this._ub + this._B);
      if (!this._O) {
         var6 = this._Cb;
         var8 = this._hb;
         var4 = 0 != this._I;
      }

      var5 &= this._kb;
      cn_[] var16 = this._U;
      cn_ var17 = this._L;
      int var18 = this._fb;
      int var19 = var11;
      if (!var5) {
         if (null != this._C) {
            var17 = this._C;
         }

         if (this._wb >= 0) {
            var18 = this._wb;
         }

         if (this._Fb != null) {
            var16 = this._Fb;
         }
      }

      int var20 = 0;
      if (var8) {
         if (this._Eb != Integer.MIN_VALUE) {
            var20 = this._Eb;
         }

         if (this._ab != null) {
            var17 = this._ab;
         }

         if (0 <= this._Z) {
            var18 = this._Z;
         }

         if (this._mb != Integer.MIN_VALUE) {
            var19 = this._mb;
         }

         if (null != this._rb) {
            var16 = this._rb;
         }
      }

      if (var4) {
         if (this._R != null) {
            var16 = this._R;
         }

         if (Integer.MIN_VALUE != this._eb) {
            var20 = this._eb;
         }

         if (0 <= this._Db) {
            var18 = this._Db;
         }

         if (Integer.MIN_VALUE != this._nb) {
            var19 = this._nb;
         }

         if (null != this._P) {
            var17 = this._P;
         }
      }

      if (var6) {
         if (this._H != Integer.MIN_VALUE) {
            var20 = this._H;
         }

         if (this._tb >= 0) {
            var18 = this._tb;
         }

         if (null != this._cb) {
            var17 = this._cb;
         }

         if (this._E != null) {
            var16 = this._E;
         }

         if (Integer.MIN_VALUE != this._W) {
            var19 = this._W;
         }
      }

      int var21 = var19 + this._M;
      int var22 = this._yb + var20;
      if (this._ib) {
         sn_.a311(var11 + 100, var2, var16, var1, var3, var10);
      } else {
         sn_.a311(-33, this._B, var16, this._zb, this._ub, this._ob);
      }

      if (null != var17) {
         int var23 = this._zb + var21;
         if (this._lb == 1) {
            var23 += (this._ob - var17._E) / 2;
         }

         int var24 = this._ub + var22;
         if (2 == this._lb) {
            var23 += -var17._E + this._ob;
         }

         if (this._vb == 1) {
            var24 += (this._B - var17._G) / 2;
         }

         if (this._vb == 2) {
            var24 += -var17._G + this._B;
         }

         if (256 <= this._Ab) {
            var17.h093(var23, var24);
         } else {
            var17.d326(var23, var24, this._Ab);
         }
      }

      if (null != this._Q && null != this._y) {
         String var25 = this._Q;
         if (var7 && null != this._K) {
            var25 = var25 + this._K;
         }

         if (this._y.b926(var25) <= -(2 * this._xb) + this._ob && 0 > var25.indexOf("<br>")) {
            if (1 == this._vb) {
               var22 += (-this._y._E + -this._y._H + this._B) / 2;
            } else if (this._vb == 2) {
               var22 += this._B - this._y._E - this._y._H;
            }

            if (0 == this._lb) {
               this._y.a068(var25, var21 + this._xb + this._zb, this._y._H + this._ub + var22, var18, -1, this._J);
            } else if (this._lb == 1) {
               this._y.b068(var25, var21 + this._xb + this._zb + (-(2 * this._xb) + this._ob) / 2, this._y._H + var22 + this._ub, var18, -1, this._J);
            } else if (2 == this._lb) {
               this._y.c068(var25, -(2 * this._xb) + this._ob + var21 + this._xb + this._zb, this._y._H + this._ub + var22, var18, -1, this._J);
            } else {
               this._y.a450(var25, var21 + this._xb + this._zb, var22 + this._ub, -(2 * this._xb) + this._ob, this._B, var18, -1, this._J, this._lb, this._vb, this._Bb);
            }
         } else {
            this._y.a450(var25, var21 + this._zb + this._xb, var22 + this._ub, this._ob - 2 * this._xb, this._B, var18, -1, this._J, this._lb, this._vb, this._Bb);
         }
      }

      if (null != this._F) {
         for(ok_ var26 = (ok_)this._F.e024(-24172); var26 != null; var26 = (ok_)this._F.a024(4)) {
            var26.a074(this._zb + var19, this._B, var20 + this._ub, var4, var5, var6, var7, var8, this._A, this._ob, 0);
         }
      }

      gf_.e115(var12, var13, var14, var15);
   }

   static final void a009(String[] var0) {
      if (null != cd_._f) {
         cd_._f._W.a144((byte)-104, var0);
      }

      if (null != pj_._c) {
         pj_._c._P.a144((byte)-126, var0);
      }

   }

   final void b540(boolean var1, int var2) {
      if (var2 < 59) {
         f150(124);
      }

      this.a074(0, gf_._c, 0, false, true, false, var1, false, false, gf_._i, 0);
   }

   private final void a466(byte var1, ok_ var2) {
      if (null != var2) {
         if (var2._Cb) {
            this._Cb = var2._Cb;
         }

         if (var2._fb != 0) {
            this._fb = var2._fb;
         }

         if (256 != var2._J) {
            this._J = var2._J;
         }

         if (var2._L != null) {
            this._L = var2._L;
         }

         if (var2._cb != null) {
            this._cb = var2._cb;
         }

         if (null != var2._K) {
            this._K = var2._K;
         }

         if (var2._O) {
            this._O = var2._O;
         }

         if (var2._Z >= 0) {
            this._Z = var2._Z;
         }

         if (var2._C != null) {
            this._C = var2._C;
         }

         if (var2._R != null) {
            this._R = var2._R;
         }

         if (null != var2._Fb) {
            this._Fb = var2._Fb;
         }

         if (null != var2._P) {
            this._P = var2._P;
         }

         if (var2._Q != null) {
            this._Q = var2._Q;
         }

         if (var2._ib) {
            this._ib = var2._ib;
         }

         if (0 <= var2._tb) {
            this._tb = var2._tb;
         }

         if (var2._Db >= 0) {
            this._Db = var2._Db;
         }

         if (var2._ab != null) {
            this._ab = var2._ab;
         }

         if (0 != var2._xb) {
            this._xb = var2._xb;
         }

         if (var2._wb >= 0) {
            this._wb = var2._wb;
         }

         if (var2._qb) {
            this._qb = var2._qb;
         }

         if (null != var2._y) {
            this._y = var2._y;
         }

         if (0 != var2._Bb) {
            this._Bb = var2._Bb;
         }

         if (!var2._kb) {
            this._kb = var2._kb;
         }

         if (var2._rb != null) {
            this._rb = var2._rb;
         }

         if (var2._E != null) {
            this._E = var2._E;
         }

         if (var2._U != null) {
            this._U = var2._U;
         }

         if (0 != var2._lb) {
            this._lb = var2._lb;
         }

         if (var2._Eb != Integer.MIN_VALUE) {
            this._Eb = var2._Eb;
         }

         if (0 != var2._vb) {
            this._vb = var2._vb;
         }

         if (var2._eb != Integer.MIN_VALUE) {
            this._eb = var2._eb;
         }

         this._A = this._qb && var2._A;
         if (Integer.MIN_VALUE != var2._nb) {
            this._nb = var2._nb;
         }

         if (var2._mb != Integer.MIN_VALUE) {
            this._mb = var2._mb;
         }

         if (Integer.MIN_VALUE != var2._H) {
            this._H = var2._H;
         }

         if (0 != var2._yb) {
            this._yb = var2._yb;
         }

         if (var2._bb) {
            this._bb = var2._bb;
         }

         if (Integer.MIN_VALUE != var2._W) {
            this._W = var2._W;
         }

         if (var2._M != 0) {
            this._M = var2._M;
         }
      }

      if (var1 < 27) {
         _Y = (tf_)null;
      }

   }

   public static void f150(int var0) {
      if (var0 == -16218) {
         _jb = null;
         _S = null;
         _Y = null;
         _X = null;
      }
   }

   private final void a116(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var7;
      if (this._sb > 0) {
         var7 = -(-this._sb >> 2);
      } else {
         var7 = this._sb >> 2;
      }

      this._sb -= var7;
      this._gb += var7;
      if (this._pb > 0) {
         var7 = -(-this._pb >> 2);
      } else {
         var7 = this._pb >> 2;
      }

      this._D += var7;
      this._pb -= var7;
      if (0 >= this._T) {
         var7 = this._T >> 2;
      } else {
         var7 = -(-this._T >> 2);
      }

      this._T -= var7;
      this._ob += var7;
      if (this._x <= 0) {
         var7 = this._x >> 2;
      } else {
         var7 = -(-this._x >> 2);
      }

      if (var3 == 7183) {
         var5 &= this._kb;
         this._ub = this._D + var4;
         this._x -= var7;
         this._zb = this._gb + var2;
         this._B += var7;
         int var8 = gf_._j;
         int var9 = gf_._f;
         int var10 = gf_._h;
         int var11 = gf_._e;
         gf_.a115(this._zb, this._ub, this._ob + this._zb, this._B + this._ub);
         boolean var12 = false;
         if (!ti_._i && var5 && no_._d != 0 && gf_._j <= lc_._c && lc_._c < gf_._h && hm_._k >= gf_._f && gf_._e > hm_._k) {
            var12 = true;
            this._db = lc_._c - this._zb;
            this._I = no_._d;
            this._G = no_._d;
            this._N = -this._ub + hm_._k;
         } else {
            this._G = 0;
            if (0 != no_._d) {
               this._I = 0;
            }
         }

         if (la_._g == 0) {
            this._I = 0;
         }

         this._V = !im_._a && hj_._S >= gf_._j && gf_._h > hj_._S && eh_._h >= gf_._f && gf_._e > eh_._h;
         this._hb = this._V && la_._g == this._I && var5;
         if (null != this._F) {
            for(ok_ var13 = (ok_)this._F.d024(-14205); var13 != null; var13 = (ok_)this._F.g024(20)) {
               var13.a116(this._B, this._zb, 7183, this._ub, var5, this._ob);
            }
         }

         if (this._V) {
            im_._a = true;
         }

         if (var12) {
            ti_._i = true;
         }

         gf_.e115(var8, var9, var10, var11);
         if (0 != this._I && this._bb) {
            this._gb = -var2 - this._db + hj_._S;
            this._D = -var4 + (eh_._h - this._N);
            if (0 > this._gb) {
               this._gb = 0;
            }

            if (this._D < 0) {
               this._D = 0;
            }

            if (-this._ob + var6 < this._gb) {
               this._gb = -this._ob + var6;
            }

            if (-this._B + var1 < this._D) {
               this._D = var1 - this._B;
            }

            this._sb = 0;
            this._pb = 0;
            this._zb = this._gb + var2;
            this._ub = this._D + var4;
         }

      }
   }

   final void a652(ok_ var1, byte var2) {
      if (var2 != 124) {
         this._xb = 89;
      }

      if (this._F == null) {
         this._F = new md_();
      }

      this._F.a865(var1, false);
   }

   private ok_(long var1, ok_ var3, int var4, int var5, int var6, int var7, String var8) {
      this._Eb = Integer.MIN_VALUE;
      this._eb = Integer.MIN_VALUE;
      this._H = Integer.MIN_VALUE;
      this._qb = false;
      this._Db = -1;
      this._Z = -1;
      this._Ab = 256;
      this._A = false;
      this._mb = Integer.MIN_VALUE;
      this._tb = -1;
      this._W = Integer.MIN_VALUE;
      this._nb = Integer.MIN_VALUE;
      this._kb = true;
      this._wb = -1;
      this._J = 256;
      this._D = var5;
      super._h = var1;
      this._gb = var4;
      this._B = var7;
      this._ob = var6;
      this.a466((byte)30, var3);
      if (null != var8) {
         this._Q = var8;
      }

   }
}
