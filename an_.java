final class an_ extends hh_ {
   static String _C = "You gain an additional 1 Renown per hour.";
   static String _D = "When entering a trap room, the only choice is to continue. The trap must first attempt to detect a raider by rolling it's Detect against a raider's Sneak. If the raider is detected, they must then attempt to Dodge (against the trap's Snare). If the raider fails both rolls, the trap is triggered.";
   static int _w;
   static String _y = "TRAP";
   private pi_[] _B;
   static String[] _F = new String[]{"First Strike", "The <%0> has a penchant for wildly charging into combat; such is the speed of his attack, he is guaranteed the first strike even against the most watchful of adversaries."};
   static int _E;
   private pi_ _A;
   static String _x = "Vampires have an eternal thirst for raider blood; they're strong, fast and very hard to kill.<br><br>Each time this monster kills, its <%attack> and <%defence> increase by 1.";
   static String _z = "Player names can be up to 12 letters, numbers and underscores";

   final pi_ a970(int var1, byte var2) {
      if (var2 > -81) {
         this.a536(65, (cn_[])null, -101);
      }

      return this._B[var1] = new pi_();
   }

   final void a587(byte var1, cn_ var2) {
      pi_[] var3 = this._B;
      if (var1 == 47) {
         for(int var4 = 0; var3.length > var4; ++var4) {
            pi_ var5 = var3[var4];
            if (null != var5) {
               var5._d = var2;
            }
         }

      }
   }

   static final String a537(int var0, int var1, String var2) {
      var2 = null != var2 ? var2 : ng_._K;
      return ln_.a173(var1, ib_.a022(var0, var2));
   }

   public static void c150(int var0) {
      _y = null;
      _z = null;
      if (var0 != -13023) {
         _y = (String)null;
      }

      _x = null;
      _C = null;
      _F = null;
      _D = null;
   }

   an_(an_ var1, boolean var2) {
      this();
      var1.a580(0, this, var2);
   }

   static final void a581(int var0, int var1, int var2, String var3, int var4, int var5, int var6, qg_ var7) {
      of_._d = var3;
      ri_._b = var0;
      ng_._I = var5;
      lk_._T = var2;
      kn_._f = var7;
      bf_._k = var1;
      j_._J = var4;
      pj_._a = var6;
      hb_._a = new tp_();
      na_._y = new cc_(var7);
      bl_._r = new je_(hb_._a, na_._y);
   }

   public final void a623(byte var1, lm_ var2, int var3, int var4, boolean var5) {
      ck_ var6 = (ck_)((ck_)(!(var2 instanceof ck_) ? null : var2));
      d_.a713(var2._q + var3, var2._s + var2._v + var4, var2._x + var3 + var2._q, var2._v + var4);
      if (null != var6) {
         var5 &= var6._B;
      }

      pi_ var7 = this._B[0];
      this._A.b150(0);
      var7.a021(var2, (byte)100, this._A, var4, this, var3);
      pi_ var8;
      if (null != var6) {
         if (var6._E) {
            var8 = this._B[1];
            if (null != var8) {
               var8.a021(var2, (byte)100, this._A, var4, this, var3);
            }
         }

         if (var6._u) {
            var8 = this._B[3];
            if (0 != var6._y && null != var8) {
               var8.a021(var2, (byte)100, this._A, var4, this, var3);
            } else {
               pi_ var9 = this._B[2];
               if (null != var9) {
                  var9.a021(var2, (byte)100, this._A, var4, this, var3);
               }
            }
         }
      }

      if (var2.a427((byte)20)) {
         var8 = this._B[5];
         if (null != var8) {
            var8.a021(var2, (byte)100, this._A, var4, this, var3);
         }
      }

      if (!var5) {
         var8 = this._B[4];
         if (null != var8) {
            var8.a021(var2, (byte)100, this._A, var4, this, var3);
         }
      }

      this._A.a802(0, var2, var4, var3, this);
      ti_.c487(true);
      if (var1 != 34) {
         this.a536(117, (cn_[])null, 121);
      }

   }

   final void a536(int var1, cn_[] var2, int var3) {
      if (this._B[var1] == null) {
         this._B[var1] = new pi_();
      }

      this._B[var1]._e = var2;
   }

   final void a503(cn_[] var1, int var2) {
      pi_[] var3 = this._B;

      for(int var4 = var2; var4 < var3.length; ++var4) {
         pi_ var5 = var3[var4];
         if (null != var5) {
            var5._e = var1;
         }
      }

   }

   private final void a580(int var1, an_ var2, boolean var3) {
      if (var1 != 0) {
         c150(98);
      }

      super.a446((byte)127, var2);
      if (!var3) {
         cj_.a030(this._B, 0, var2._B, 0, 6);
      } else {
         for(int var4 = 0; 6 > var4; ++var4) {
            pi_ var5 = this._B[var4];
            if (null != var5) {
               pi_ var6 = var2._B[var4];
               var5.a269(true, null == var6 ? (var2._B[var4] = new pi_()) : var6);
            } else {
               var2._B[var4] = null;
            }
         }
      }

   }

   public an_() {
      this._B = new pi_[6];
      this._A = new pi_();
      pi_ var1 = this._B[0] = new pi_();
      var1.b150(0);
   }
}
