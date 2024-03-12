final class dn_ extends ii_ implements jo_, vg_ {
   static String[] _N = new String[]{"Fire Immunity", "Immune to dragonfire."};
   private boolean _X;
   private boolean _P;
   private ck_ _K;
   static String _T = "MEMBERS ONLY";
   private boolean _M;
   static String _W = "Goblin Scout";
   private rm_ _O;
   static long _Q;
   static String _L = "<col=2E5D17>Advance</col>";
   private ck_ _U;
   private String _S;
   private ck_ _V;
   private rm_ _R;

   final void i150(int var1) {
      this._O.p150(72);
      this._R.p150(50);
      if (var1 != 22377) {
         b487(true);
      }

   }

   final void a984(int var1, String var2) {
      if (var1 == -12349) {
         rm_ var3 = this._O;
         var3.a223(var2, false, (byte)64);
         this._R.p150(var1 + 12457);
      }
   }

   public final void a475(ck_ var1, byte var2, int var3, int var4, int var5) {
      if (var2 == 98) {
         if (this._U == var1) {
            this.j150(-24327);
         } else if (this._V == var1) {
            nh_.c487();
         } else if (this._K == var1) {
            if (!this._X) {
               if (this._M) {
                  li_.c150(var2 + 218);
               } else {
                  ue_.a150(var2 - 178);
               }
            } else {
               wk_.a150();
            }
         }

      }
   }

   final String a738(int var1) {
      if (var1 != -16) {
         return (String)null;
      } else {
         return this._O._w != null ? this._O._w : "";
      }
   }

   final boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (var4 < 55) {
         this.a738(-70);
      }

      if (!super.a401(var1, var2, var3, (byte)61)) {
         if (var3 != 98) {
            return 99 == var3 ? this.a489((byte)-5, var1) : false;
         } else {
            return this.a059(var1, (byte)71);
         }
      } else {
         return true;
      }
   }

   public final void a157(rm_ var1, byte var2) {
      if (var1 == this._O) {
         this._R.a336(34, this);
      }

      if (this._R == var1) {
         this.j150(-24327);
      }

      if (var2 >= -117) {
         this._O = (rm_)null;
      }

   }

   static final void b487(boolean var0) {
      if (!tl_._l) {
         throw new IllegalStateException();
      } else {
         oj_._b = true;
         t_.a540(var0, 0);
         kh_._n = 0;
      }
   }

   static final byte[] a044(Object var0, boolean var1, byte var2) {
      if (var2 != 48) {
         a044((Object)null, true, (byte)79);
      }

      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var4 = (byte[])((byte[])var0);
         return var1 ? gg_.a553(var4) : var4;
      } else if (var0 instanceof un_) {
         un_ var3 = (un_)var0;
         return var3.b334((byte)60);
      } else {
         throw new IllegalArgumentException();
      }
   }

   private final void j150(int var1) {
      if (var1 == -24327) {
         if (n_.a427() || this._O._w.length() > 0 && this._R._w.length() > 0) {
            ck_.a018(this._R._w, 11, this._O._w);
         }

      }
   }

   public static void f423() {
      _L = null;
      _W = null;
      _N = null;
      _T = null;
   }

   final void a115(int var1, int var2, int var3, int var4) {
      if (this._S != null) {
         lp_._C.a385(this._S, 20 + super._q + var2, var4 + super._v + 15, super._x - 40, super._s, 16777215, -1, 1, 0, lp_._C._H);
      }

      if (null != this._V) {
         gf_.b115(10 + var2, var4 + 134, super._x - 20, 4210752);
      }

      super.a115(var1, var2, var3 ^ var3, var4);
   }

   dn_(String var1, String var2, boolean var3, boolean var4, boolean var5) {
      super(0, 0, 310, 190, (ca_)null);
      this._M = var5;
      this._X = var3;
      this._S = var2;
      this._P = var4;
      if (!this._X || !this._P && !this._M) {
         this._O = new uh_(var1, this, 100);
         this._R = new uh_("", this, 20);
         if (this._X) {
            this._U = new ck_(kn_._a, (pg_)null);
            this._K = new ck_(db_._u, (pg_)null);
            this._O._B = false;
         } else {
            this._U = new ck_(uo_._e, (pg_)null);
            this._K = new ck_(this._M ? kd_._b : gk_._O, (pg_)null);
            if (this._P) {
               this._V = new ck_(qp_._c, this);
            }
         }

         this._O._o = new mc_(10000536);
         this._R._o = new ic_(10000536);
         na_ var6 = new na_();
         this._U._o = var6;
         if (null != this._K) {
            this._K._o = var6;
         }

         if (null != this._V) {
            this._V._o = var6;
         }

         this._O._i = rj_._y;
         if (this._V != null) {
            this._V._i = hj_._U;
         }

         if (this._X) {
            this._K._i = gd_._D;
         } else if (!this._M) {
            this._K._o = new oa_();
         } else {
            this._K._i = oh_._n;
            this._K._o = new oa_();
         }

         super._v = 15;
         se_ var7 = lp_._C;
         if (this._S != null) {
            super._v += 5 + var7.a490(this._S, super._x - 40, var7._H);
         }

         String var8 = cp_._T;
         ba_ var9 = gb_.a403(m_.c372(true), -119);
         if (ba_._e != var9) {
            if (var9 == gg_._c) {
               var8 = hf_._ub;
            }
         } else {
            var8 = me_._e;
         }

         dg_ var10;
         this.b485((byte)-54, var10 = new dg_(10, super._v, super._x - 20, 25, this._O, false, 80, 3, var7, 16777215, var8));
         super._v += var10._s + 5;
         this.b485((byte)-54, var10 = new dg_(10, super._v, super._x - 20, 25, this._R, false, 80, 3, var7, 16777215, fk_._r));
         this._U._n = this;
         super._v += var10._s + 5;
         if (null != this._V) {
            this._V._n = this;
         }

         if (this._K != null) {
            this._K._n = this;
         }

         if (this._V == null) {
            this._U.b050(0, super._x - 16, super._v, 8, 30);
            super._v += 35;
         } else {
            this._U.b050(0, super._x - 95, super._v, 85, 30);
            super._v += 60;
         }

         if (null != this._V) {
            this._V.b050(0, super._x - 6 - 10, super._v, 8, 30);
            super._v += 35;
         }

         if (this._K != null) {
            if (!this._X && !this._M) {
               this._K.b050(0, 40, super._v, 8, 20);
               super._v += 25;
            } else {
               this._K.b050(0, super._x - 6 - 10, super._v, 8, 30);
               super._v += 35;
            }
         }

         this.b050(0, super._x, 0, 0, super._v + 3);
         this.b485((byte)-55, this._U);
         if (null != this._V) {
            this.b485((byte)-128, this._V);
         }

         if (this._K != null) {
            this.b485((byte)-104, this._K);
         }

      } else {
         throw new IllegalStateException();
      }
   }

   public final void a430(rm_ var1, int var2) {
      if (var2 != 10000536) {
         this.a157((rm_)null, (byte)51);
      }

   }
}
