final class cm_ extends ii_ implements pf_, vg_ {
   private ck_ _N;
   static int _P;
   private bh_ _L;
   private jb_ _O;
   static ad_ _T = new ad_(10, 2, 2, 0);
   static boolean _Q;
   static String _S = "Hoard";
   static String _K = "Raider escapes!";
   static int[] _M = rb_.b330(12632256, 8421504, 64);
   static ek_ _R;

   private final String i738(int var1) {
      if (var1 <= 109) {
         _P = -123;
      }

      return "</col></u>";
   }

   public final void a475(ck_ var1, byte var2, int var3, int var4, int var5) {
      if (var2 != 98) {
         _S = (String)null;
      }

      if (this._N == var1) {
         up_.b150();
         this._O.j423((byte)98);
      }

   }

   static final String a776(boolean var0, CharSequence var1) {
      if (null == var1) {
         return hf_._zb;
      } else {
         int var2 = var1.length();
         if (var2 >= 1 && var2 <= 12) {
            String var3 = jm_.a715((byte)59, var1);
            if (var3 != null && var3.length() >= 1) {
               if (!jc_.a351(var3.charAt(0)) && !jc_.a351(var3.charAt(var3.length() - 1))) {
                  int var4 = 0;

                  for(int var5 = 0; var1.length() > var5; ++var5) {
                     char var6 = var1.charAt(var5);
                     if (!jc_.a351(var6)) {
                        var4 = 0;
                     } else {
                        ++var4;
                     }

                     if (2 <= var4 && !var0) {
                        return id_._c;
                     }
                  }

                  if (0 >= var4) {
                     return null;
                  } else {
                     return jm_._e;
                  }
               } else {
                  return jm_._e;
               }
            } else {
               return hf_._zb;
            }
         } else {
            return hf_._zb;
         }
      }
   }

   public static void j150() {
      _M = null;
      _S = null;
      _K = null;
      _R = null;
      _T = null;
   }

   static final void a494(float var0, float var1, int var2, float var3, float var4) {
      if (var2 != -7788) {
         _S = (String)null;
      }

      md_.a368(1.0F, var1, 1.0F, var0, var3, var4);
   }

   private final String a738(int var1) {
      if (var1 < 82) {
         _R = (ek_)null;
      }

      return "<u=2164A2><col=2164A2>";
   }

   public final void a271(int var1, bh_ var2, int var3, int var4) {
      if (var3 != 126) {
         this.a271(113, (bh_)null, 9, -25);
      }

      if (var1 != 0) {
         if (var1 != 1) {
            if (2 == var1) {
               lk_.a627("conduct.ws");
            }
         } else {
            lk_.a627("privacy.ws");
         }
      } else {
         lk_.a627("terms.ws");
      }

   }

   final boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (super.a401(var1, var2, var3, (byte)61)) {
         return true;
      } else if (98 != var3) {
         if (99 == var3) {
            return this.a489((byte)-5, var1);
         } else {
            if (var4 < 55) {
               this.a475((ck_)null, (byte)8, 78, 7, -119);
            }

            return false;
         }
      } else {
         return this.a059(var1, (byte)71);
      }
   }

   cm_(jb_ var1) {
      super(0, 0, 288, 0, (ca_)null);
      this._O = var1;
      this._N = new ck_(gl_._Jb, (pg_)null);
      this._N._o = new na_();
      String var2 = jk_.a841(new String[]{this.a738(120), this.i738(115)}, nj_._a, 30496);
      int var3 = 20;
      hh_ var4 = new hh_(lp_._C, 0, 0, 0, 0, 16777215, -1, 3, 0, lp_._C._H, -1, Integer.MAX_VALUE, true);
      this._L = new bh_(var2, var4);
      this._L._i = "";
      this._L.a871(8, 0, kn_._d);
      this._L.a871(8, 1, kn_._d);
      this._L._n = this;
      this._L._x = super._x - 40;
      this._L.a762(26, (byte)-71, super._x - 40, var3);
      var3 += 15 + this._L._s;
      this.b485((byte)-119, this._L);
      byte var5 = 4;
      short var6 = 200;
      this._N.b050(0, var6, var3, -var6 + 300 >> 1, 40);
      this._N._n = this;
      this.b485((byte)-95, this._N);
      this.b050(0, 300, 0, 0, var5 + 55 + var3);
   }
}
