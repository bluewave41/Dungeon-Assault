class nk_ extends hf_ implements vg_ {
   private uc_ _Bb;
   static String _Lb = "Exit without saving";
   private boolean _Mb;
   static ae_ _Jb;
   static g_ _Ib;
   private boolean _Db;
   private boolean _Gb;
   static int _Kb;
   static boolean _Hb = false;
   private se_ _Cb;
   static int[] _Fb = new int[]{18, 10, 19, 24, 25, 26, 27};
   private boolean _Eb;

   final void a013(int var1, String var2, int var3) {
      if (!this._Eb) {
         this._Db = 256 == var3;
         if (var1 != 26889) {
            _Fb = (int[])null;
         }

         this._Eb = true;
         this._Bb.b789(4210752, (byte)94, 8405024);
         kc_ var4 = new kc_(this, this._Cb, var2);
         if (var3 == 5) {
            var4.a871(11, 6824, oh_._b);
            var4.a871(17, var1 - 20065, db_._u);
         } else if (var3 != 256) {
            var4.a871(-1, 6824, this._Mb ? kn_._a : gk_._O);
         } else {
            var4.a592(kn_._a, this, (byte)-80);
         }

         if (var3 == 3) {
            var4.a871(7, 6824, mo_._d);
         } else if (4 != var3) {
            if (6 == var3) {
               var4.a871(9, 6824, ip_._i);
            } else if (9 == var3) {
               var4.a592(df_._a, this, (byte)-97);
            }
         } else {
            var4.a871(8, 6824, ho_._f);
         }

         this.b340(1, var4);
      }
   }

   final boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (13 != var3) {
         return var4 < 55 ? false : super.a401(var1, var2, var3, (byte)92);
      } else {
         this.j423((byte)115);
         return true;
      }
   }

   final void j423(byte var1) {
      if (super._T) {
         if (var1 < 48) {
            this.a401((lm_)null, 'ﾷ', 86, (byte)-102);
         }

         super._T = false;
         if (this._Mb) {
            gg_.b150(0);
         } else if (this._Gb) {
            np_.d423();
         }

      }
   }

   public static void n150(int var0) {
      _Jb = null;
      _Ib = null;
      _Fb = null;
      _Lb = null;
      if (var0 != 2121792) {
         n150(57);
      }

   }

   nk_(ji_ var1, se_ var2, String var3, boolean var4, boolean var5) {
      super(var1, new kc_((nk_)null, var2, var3), 77, 10, 10);
      this._Mb = var4;
      this._Cb = var2;
      this._Eb = false;
      this._Db = false;
      this._Gb = var5;
      this._Bb = new uc_(13, 50, 274, 30, 15, 2113632, 4210752);
      this._Bb._R = true;
      this.b485((byte)-63, this._Bb);
   }

   public void a475(ck_ var1, byte var2, int var3, int var4, int var5) {
      if (var2 == 98) {
         if (!this._Db) {
            oe_.a808("tochangedisplayname.ws", m_.c372(true));
         } else {
            sn_.a093(var2 ^ 60, 3);
            this.j423((byte)123);
         }

      }
   }

   final void o150(int var1) {
      this._Bb.b789(var1, (byte)94, 2121792);
      kc_ var2 = new kc_(this, this._Cb, gd_._J);
      var2.a871(15, 6824, me_._c);
      this.b340(var1 - 4210751, var2);
   }

   static final void a627(String var0, byte var1) {
      if (mm_._q == -1 && vl_._m == -1) {
         mm_._q = hj_._S;
         vl_._m = eh_._h;
      }

      label78: {
         ++no_._a;
         if (null != var0) {
            if (var0.equals(vj_._c)) {
               break label78;
            }
         } else if (vj_._c != null) {
            break label78;
         }

         boolean var2 = !ti_._f && no_._a >= lp_._z && no_._a < ga_._p + lp_._z;
         if (null == var0 || !ti_._f && !var2) {
            no_._a = 0;
         } else {
            no_._a = lp_._z;
         }

         wa_._c = mm_._q;
         if (var0 != null) {
            ti_._f = false;
         } else if (var2) {
            ti_._f = true;
         }

         fl_._l = vl_._m;
      }

      if (!ti_._f && no_._a < lp_._z && cp_._U) {
         fl_._l = vl_._m;
         no_._a = 0;
         wa_._c = mm_._q;
      }

      vj_._c = var0;
      if (ti_._f && fg_._i == no_._a) {
         no_._a = 0;
         ti_._f = false;
      }

      vl_._m = -1;
      int var3 = 76 % ((var1 + 27) / 44);
      mm_._q = -1;
   }

   static {
      _Jb = new ae_(_Fb.length);
   }
}
