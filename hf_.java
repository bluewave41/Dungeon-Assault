abstract class hf_ extends sj_ {
   static nh_ _pb;
   private int _jb;
   private lm_ _xb;
   private int _lb;
   static String _ub = "Username: ";
   static md_ _ob = new md_();
   static int _sb;
   private int _qb;
   private int _tb;
   private sd_ _rb;
   private fb_ _kb;
   static ad_ _wb = new ad_(13, 0, 1, 0);
   static ed_ _nb;
   static eh_ _ib;
   static cn_ _Ab;
   private int _vb;
   static int[] _yb = new int[16384];
   static String _zb = "Names should contain a maximum of 12 characters";
   static pp_ _mb;

   private final void b063(lm_ var1, byte var2) {
      if (this._rb != null) {
         this._rb.a487(false);
      }

      if (var1 != null) {
         var1.b050(0, var1._x, this._tb + 6, 6, var1._s);
         this._rb = new sd_(var1);
      } else {
         this._rb = new sd_();
      }

      this.b485((byte)-57, this._rb);
      this._xb = null;
   }

   hf_(ji_ var1, lm_ var2, int var3, int var4, int var5) {
      super(var1, 12 + var2._x, var2._s + var3 + 12);
      this._jb = this._qb = var4;
      this._tb = var3;
      this._vb = var5;
      this.b063(var2, (byte)98);
   }

   static final void i423() {
      if (null != in_._C) {
         synchronized(in_._C) {
            in_._C = null;
         }
      }

   }

   final boolean i154(int var1) {
      this.h423((byte)99);
      return var1 != 462 ? true : super.i154(var1 ^ 0);
   }

   boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (var4 < 55) {
         this._rb = (sd_)null;
      }

      if (super.a401(var1, var2, var3, (byte)124)) {
         return true;
      } else {
         if (this._rb != null) {
            if (98 == var3) {
               this._rb.a336(34, var1);
            }

            if (var3 == 99) {
               this._rb.a336(34, var1);
            }
         }

         return false;
      }
   }

   final void h423(byte var1) {
      if (this._kb != null) {
         if (this._kb != lp_._o) {
            this.b326(-30, this._xb._s + 12 + this._tb, this._xb._x + 12);
            this.b063(this._xb, (byte)-74);
         }

         this._rb._H = 256;
         this._kb = null;
      }

      super.h423((byte)-89);
   }

   final void k150(int var1) {
      if (hi_._b != this._kb) {
         this._lb = 0;
         this._kb = lp_._o;
         this.b063(this._xb, (byte)100);
         this._rb._H = var1;
         this._xb = null;
      }
   }

   void b340(int var1, lm_ var2) {
      this._xb = var2;
      if (ec_._i != this._kb) {
         if (hi_._b != this._kb) {
            this._kb = hi_._b;
            this._lb = 0;
         }
      } else {
         this.b115(12 + this._xb._x, this._vb, this._xb._s + this._tb + 12, 22284);
         this._lb = 0;
      }

      if (var1 != 1) {
         this._xb = (lm_)null;
      }

   }

   public static void m150() {
      _pb = null;
      _Ab = null;
      _zb = null;
      _wb = null;
      _mb = null;
      _yb = null;
      _nb = null;
      _ub = null;
      _ob = null;
      _ib = null;
   }

   boolean f427(byte var1) {
      if (this._kb != null) {
         if (this._kb != hi_._b) {
            if (lp_._o == this._kb) {
               if (++this._lb != this._qb) {
                  this._rb._H = (this._lb << 8) / this._qb;
               } else {
                  this._kb = null;
                  this._rb._H = 256;
               }
            }
         } else if (++this._lb == this._jb) {
            this._kb = ec_._i;
            this.b115(12 + this._xb._x, this._vb, this._tb + 12 + this._xb._s, var1 ^ -22358);
            this._lb = 0;
            this._rb._H = 0;
         } else {
            this._rb._H = 256 - (this._lb << 8) / this._jb;
         }
      }

      return var1 != -90 ? false : super.f427((byte)-90);
   }
}
