import java.awt.Component;

final class bn_ {
   private int _o;
   private int _a;
   private int _c;
   private int _s;
   private int _t;
   static int _n = 2;
   private int _l;
   private int _u;
   private int _r;
   static nl_ _j;
   private int _e;
   static String _i = "If you do nothing the game will revert to normal view in <%0> seconds.";
   static String[] _m = new String[]{"Trap", "<%highlight>This room contains a Trap!</col> The statistics of a room are displayed in the bottom-right, opposite your raider's. These statistics are slightly different from those of a raider: <%attack>, <%defence>, <%snare> and <%detect>. A <%trap>, such as <%lastroom>, will usually have high <%snare> and <%detect>, with low or no <%attack> or <%defence>."};
   static cn_ _h;
   private int _p;
   private int _w;
   static cn_ _f;
   private float _y;
   private boolean _d;
   private int _v;
   private int _b;
   static String _q = "INSTRUCTIONS";
   private bm_ _g;
   private int _x;
   private int _k;

   final void a150(int var1) {
      this._g.a599(this._e, this._t, (byte)-107);
      if (var1 != 6733) {
         a788(-69, (Component)null, -15, 123);
      }

   }

   final void e150(int var1) {
      if (var1 != 6731) {
         this.c150(-81);
      }

      if (cm_._R == null) {
         if (pb_._G <= 0) {
            this._d = false;
         }

         if (!this._d) {
            if (this._x > up_._d) {
               aj_._Gb = (-up_._d + this._x) / 2;
            } else if (this._x > 0) {
               aj_._Gb = 0;
            }

            if (this._o != up_._d || eg_._d != this._v) {
               this._g.a599(this._v, this._o, (byte)-118);
            }

         } else if (0 >= --this._c) {
            this._c = this._k;
            if (this._b <= sj_._bb) {
               this.c150(103);
            } else {
               this._d = false;
            }
         }
      }
   }

   final boolean b154(int var1) {
      return this._b <= sj_._bb && pb_._G > 0;
   }

   final void a773(int var1, boolean var2, int var3) {
      this._a = var1;
      this._x = var3;
      if (!var2) {
         _j = (nl_)null;
      }

   }

   static final c_ a788(int var0, Component var1, int var2, int var3) {
      try {
         Class var4 = ij_.class;
         c_ var7 = (c_)var4.newInstance();
         var7.a345((byte)-48, var1, var3, var2);
         if (var0 != -1) {
            a788(92, (Component)null, 26, -40);
         }

         return var7;
      } catch (Throwable var6) {
         kf_ var5 = new kf_();
         var5.a345((byte)72, var1, var3, var2);
         return var5;
      }
   }

   private final void c150(int var1) {
      int var2 = this._x;
      int var3 = this._a;
      if (this.b154(71)) {
         if (this._p >= var2) {
            if (var2 < this._s) {
               var2 = this._s;
            }
         } else {
            var2 = this._p;
         }

         if (this._r >= var3) {
            if (this._l > var3) {
               var3 = this._l;
            }
         } else {
            var3 = this._r;
         }

         if (0.0F < this._y) {
            int var5 = (int)(this._y * (float)var3 + 0.5F);
            if (var2 < var5) {
               var3 = (int)((float)var2 / this._y);
            } else if (var5 < var2) {
               var2 = var5;
            }
         }

         if (var2 != up_._d || eg_._d != var3) {
            this._g.a599(var3, var2, (byte)-109);
         }

         if (0 < this._x) {
            aj_._Gb = (-up_._d + this._x) / 2;
         }

      } else {
         this._d = false;
      }
   }

   public static void a423() {
      _i = null;
      _f = null;
      _m = null;
      _h = null;
      _q = null;
      _j = null;
   }

   private bn_() throws Throwable {
      throw new Error();
   }

   final ek_ d487(int var1) {
      this._e = eg_._d;
      this._t = up_._d;
      this._g.a599(this._w, this._u, (byte)-86);
      if (var1 < 32) {
         return (ek_)null;
      } else {
         ve_._a = false;
         ek_ var2 = gh_.a470(0, 0, this._w, i_._A, this._u);
         if (var2 == null) {
            this.a150(6733);
         }

         return var2;
      }
   }
}
