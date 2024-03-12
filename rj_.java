import java.io.IOException;
import java.net.Socket;

abstract class rj_ extends ne_ {
   static String[] _j = new String[]{"Armoured", "Ignores first failed roll in each combat."};
   int _v;
   boolean _w;
   rj_ _r;
   int _m;
   en_ _n;
   int _t;
   static boolean _o;
   int _p;
   static String _y = "The account name you use to access RuneScape and other Jagex.com games";
   static int _l = 128;
   int _x;
   static cn_ _s;
   int _q;
   static cn_ _k;
   Object _u;
   int _i;

   static final byte[] a534(wj_ var0, int var1, byte[] var2) {
      int var3 = var0.j080(-106, var1);
      if (0 == var3) {
         return null;
      } else {
         if (null == var2 || var2.length != var3) {
            var2 = new byte[var3];
         }

         int var4 = var0.j080(-122, 3);
         byte var5 = (byte)var0.j080(119, 8);
         int var6;
         if (0 < var4) {
            for(var6 = 0; var6 < var3; ++var6) {
               var2[var6] = (byte)(var5 + var0.j080(-73, var4));
            }
         } else {
            for(var6 = 0; var3 > var6; ++var6) {
               var2[var6] = var5;
            }
         }

         return var2;
      }
   }

   final boolean a683(byte var1, int var2, int var3) {
      if (!this._w) {
         return false;
      } else {
         var3 -= this._t;
         var2 -= this._i;
         if (var1 < 32) {
            return true;
         } else {
            return 0 <= var3 && var2 >= 0 && this._q > var3 && this._x > var2;
         }
      }
   }

   void b423(byte var1) {
      if (var1 != 30) {
         this.d326(-28, 91, -122);
      }

      this.a487(false);
   }

   final void d150(int var1) {
      this.b326(var1, var1 ^ 8187, 0);
   }

   final void a150(int var1) {
      if (var1 < 60) {
         this._v = -29;
      }

      this.a599(0, 0, (byte)124);
   }

   void a183(boolean var1, int var2, int var3) {
      this.c326(2, var3, var2);
      if (var1) {
         this.b326(-54, -3, 63);
      }

   }

   final void b599(int var1, int var2, byte var3) {
      if (var1 != this._t || var2 != this._i) {
         if (0 != (2 & this._v)) {
            this._i += this._x;
         }

         if (0 != (1 & this._v)) {
            this._t += this._q;
         }

         this.e326(-this._i + var2, var1 - this._t, 108);
         if (0 != (this._v & 2)) {
            this._i -= this._x;
         }

         if (0 != (this._v & 1)) {
            this._t -= this._q;
         }

         if (var3 != 4) {
            this._p = 44;
         }

      }
   }

   void b326(int var1, int var2, int var3) {
      if (var2 != 8187) {
         this._p = 99;
      }

   }

   static final tj_ a168(byte[] var0) {
      if (null == var0) {
         return null;
      } else {
         tj_ var1 = new tj_(var0, hg_._t, fe_._g, jc_._f, jn_._k, uo_._b, ub_._q);
         sb_.a150();
         return var1;
      }
   }

   void d326(int var1, int var2, int var3) {
      if (var2 != 128) {
         this._q = 96;
      }

   }

   void a599(int var1, int var2, byte var3) {
   }

   void a093(int var1, int var2) {
      if (var1 != 1) {
         a897((byte)-122, true);
      }

      if (null != this._r) {
         this._r.a093(1, var2);
      }

   }

   void a789(int var1, byte var2, int var3) {
      if (var2 > -59) {
         this._p = -18;
      }

   }

   void e326(int var1, int var2, int var3) {
      this._i += var1;
      if (var3 <= 69) {
         this._p = -102;
      }

      this._t += var2;
   }

   private final void c326(int var1, int var2, int var3) {
      if (0 != (var1 & this._v)) {
         this._i += -var2 + this._x;
      }

      if (0 != (1 & this._v)) {
         this._t += -var3 + this._q;
      }

      this._x = var2;
      this._q = var3;
   }

   public static void b487() {
      _y = null;
      _j = null;
      _k = null;
      _s = null;
   }

   static final cn_ a373() {
      cn_ var0 = new cn_(11, 11);
      jh_.a303(var0);

      for(int var1 = 0; 5 > var1; ++var1) {
         gf_.b115(var1, 3 + var1, 11 - 2 * var1, 65793);
      }

      jh_.b797();
      return var0;
   }

   static final boolean a897(byte var0, boolean var1) {
      if (kf_._m == null) {
         kf_._m = sc_._q.a288(-74, an_._E, ii_._D);
      }

      if (var0 <= 23) {
         a534((wj_)null, -48, (byte[])null);
      }

      if (0 != kf_._m._c) {
         qm_._o = wh_._e = kd_.c138(-2456);
         if (kf_._m._c != 1) {
            pd_._A = tp_._B;
         } else {
            try {
               sp_._c = new rk_((Socket)kf_._m._f, sc_._q);
               ac_._B._o = 0;
               wj_ var2 = ra_._c;
               var2._o = 0;
               pd_._A = no_._c;
               rd_._C = oc_._E = wl_._f = !var1 ? -1 : -2;
               rg_.a924(mh_._g, ac_._B, kn_._b, 119, rd_._D);
               op_.a093(0, -1);
            } catch (IOException var3) {
               pd_._A = tp_._B;
            }
         }

         kf_._m = null;
         return true;
      } else {
         return false;
      }
   }

   rj_ a759(int var1, int var2, int var3) {
      if (this.a683((byte)114, var2, var3)) {
         return this;
      } else {
         return var1 > -10 ? (rj_)null : null;
      }
   }

   rj_(int var1, int var2, int var3, int var4, int var5) {
      this(var1, var2, var5);
      this.c326(2, var4, var3);
   }

   private rj_(int var1, int var2, int var3) {
      this._q = 0;
      this._i = var2;
      this._w = true;
      this._x = 0;
      this._t = var1;
      this._u = null;
      this._v = var3;
      rl_._h.b865(this, false);
   }
}
