final class tn_ extends bh_ {
   static String _Y = "The reanimated corpses of previous failed raids; these four skeletons are well armed.<br><br>This monster will rise again when the party leaves the room, even if defeated.";
   static String _U = "Cost";
   private String _Z;
   private cn_ _V;
   static cn_ _W;
   private dp_ _T;
   static cn_ _I;
   private int _X;

   final String c983(byte var1) {
      if (var1 < 3) {
         this.a336(25, (lm_)null);
      }

      return null;
   }

   final boolean a336(int var1, lm_ var2) {
      if (var1 != 34) {
         _U = (String)null;
      }

      return false;
   }

   static final String a439(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var3 != 0) {
            var4 = Character.toLowerCase(var4);
         } else {
            var4 = lb_.a328(var4);
         }

         var2[var3] = var4;
      }

      return new String(var2);
   }

   final void a319(int var1, int var2, lm_ var3, boolean var4) {
      ++this._X;
      super.a319(var1, var2, var3, var4);
   }

   static final void a150(int var0) {
      cd_._b = false;
      qc_._t = false;
      sn_.a093(49, var0);
      wd_._d = sp_._e;
      ol_._i = sp_._e;
   }

   static final pp_ a226(int var0, int var1, se_ var2, cn_ var3, int var4, String var5) {
      jh_.c797();
      int var6 = var2.b926(var5);
      int var7 = var2._E + var2._H;
      cn_ var8 = new cn_(var6, var7);
      var8.e797();
      var2.b191(var5, 0, var2._H, 16760960, -1);
      if (var4 > -36) {
         a226(9, 109, (se_)null, (cn_)null, 59, (String)null);
      }

      cn_ var9 = te_.a983(var6, var7, ag_._c, 32, 32, 0.125);

      for(int var10 = 0; var9._B.length > var10; ++var10) {
         if (0 == var8._B[var10]) {
            var9._B[var10] = 0;
         }
      }

      cn_ var17 = rb_.a551(16, var8, 16776960, (byte)100);
      int var11 = -var8._y + var3._y >> 1;
      int var12 = var3._v - var8._v >> 1;
      cn_ var13 = dd_.a510(4, var9);
      cn_ var14 = var3.d125();
      var14.e797();
      bp_.a131(var12, var13, var11);
      var9.h093(var11, var12);
      var14.h797();
      cn_ var15 = var14.d125();
      var15.e797();
      gf_.b669(0, 0, var3._y, var3._v, 0, 160);
      var15.h797();
      cn_ var16 = var3.d125();
      var16.e797();
      rb_.a551(8, var8, 12690143, (byte)-59).b326(var11, var12, 32);
      var8.h093(var11, var12);
      var17._w += var11;
      var17._A += var12;
      jh_.b797();
      return new pp_(var14, var15, var16, var17, var0, var1);
   }

   tn_(dp_ var1, String var2, int var3, int var4, int var5, int var6) {
      super(var2, ri_.a754());
      this._Z = var2;
      this._T = var1;
      this.b050(0, var5, var4, var3, var6);
   }

   public static void h423() {
      _Y = null;
      _W = null;
      _U = null;
      _I = null;
   }

   final void a115(int var1, int var2, int var3, int var4) {
      od_ var6 = this._T.a151((byte)-116);
      String var5;
      if (ub_._s != var6 && var6 != oc_._A) {
         var5 = this._T.a791(true);
         if (var5 == null) {
            var5 = this._Z;
         }
      } else {
         var5 = kj_._k;
      }

      if (!var5.equals(super._w)) {
         super._w = var5;
         this.g423((byte)112);
      }

      super.a115(var1, var2, var3, var4);
      var6 = this._T.a151((byte)-110);
      th_ var8 = (th_)super._o;
      int var9 = super._q + var2;
      int var10 = var8.a387((byte)64, var4, this) + (var8.b865(-2, this).b137(263) >> 1);
      cn_ var7;
      if (ub_._s != var6 && oc_._A != var6) {
         if (var6 == pd_._J) {
            var7 = sl_._c[2];
            var7.b326(var9, var10 - (var7._v >> 1), 256);
         } else if (var6 == c_._d) {
            var7 = sl_._c[1];
            var7.b326(var9, var10 - (var7._v >> 1), 256);
         }
      } else {
         var7 = sl_._c[0];
         int var11 = var7._E << 1;
         int var12 = var7._G << 1;
         if (this._V != null && var11 <= this._V._y && var12 <= this._V._v) {
            lm_.a901(this._V);
            gf_.a797();
         } else {
            this._V = new cn_(var11, var12);
            lm_.a901(this._V);
         }

         var7.b669(112, 144, var7._E << 4, var7._G << 4, -this._X << 10, 4096);
         ti_.c487(true);
         this._V.b326(var9 - (var7._E >> 1), -var7._G + var10, 256);
      }

   }

   static final void a837(int var0, byte[] var1) {
      ec_ var2 = new ec_(var1);
      var2._o = var1.length - 2;
      dk_._d = var2.k137(0);
      jn_._k = new int[dk_._d];
      ub_._q = new byte[dk_._d][];
      gk_._Q = new boolean[dk_._d];
      hg_._t = new int[dk_._d];
      if (var0 > 59) {
         rf_._P = new byte[dk_._d][];
         jc_._f = new int[dk_._d];
         fe_._g = new int[dk_._d];
         var2._o = var1.length - dk_._d * 8 - 7;
         ce_._x = var2.k137(0);
         tb_._i = var2.k137(0);
         int var3 = 1 + (255 & var2.c474(true));

         int var4;
         for(var4 = 0; dk_._d > var4; ++var4) {
            hg_._t[var4] = var2.k137(0);
         }

         for(var4 = 0; dk_._d > var4; ++var4) {
            fe_._g[var4] = var2.k137(0);
         }

         for(var4 = 0; dk_._d > var4; ++var4) {
            jc_._f[var4] = var2.k137(0);
         }

         for(var4 = 0; var4 < dk_._d; ++var4) {
            jn_._k[var4] = var2.k137(0);
         }

         var2._o = -(3 * var3) + (var1.length - 4 - 8 * dk_._d);
         uo_._b = new int[var3];

         for(var4 = 1; var4 < var3; ++var4) {
            uo_._b[var4] = var2.f137(-114);
            if (uo_._b[var4] == 0) {
               uo_._b[var4] = 1;
            }
         }

         var2._o = 0;

         for(var4 = 0; dk_._d > var4; ++var4) {
            int var5 = jc_._f[var4];
            int var6 = jn_._k[var4];
            int var7 = var5 * var6;
            byte[] var8 = new byte[var7];
            ub_._q[var4] = var8;
            byte[] var9 = new byte[var7];
            rf_._P[var4] = var9;
            boolean var10 = false;
            int var11 = var2.c474(true);
            int var12;
            int var13;
            if (0 != (1 & var11)) {
               var12 = 0;

               label93:
               while(true) {
                  if (var5 <= var12) {
                     if ((var11 & 2) == 0) {
                        break;
                     }

                     var12 = 0;

                     while(true) {
                        if (var12 >= var5) {
                           break label93;
                        }

                        for(var13 = 0; var13 < var6; ++var13) {
                           byte var14 = var9[var5 * var13 + var12] = var2.a403((byte)2);
                           var10 |= var14 != -1;
                        }

                        ++var12;
                     }
                  }

                  for(var13 = 0; var6 > var13; ++var13) {
                     var8[var12 + var5 * var13] = var2.a403((byte)2);
                  }

                  ++var12;
               }
            } else {
               for(var12 = 0; var7 > var12; ++var12) {
                  var8[var12] = var2.a403((byte)2);
               }

               if ((var11 & 2) != 0) {
                  for(var12 = 0; var12 < var7; ++var12) {
                     var13 = var9[var12] = var2.a403((byte)2);
                     var10 |= var13 != -1;
                  }
               }
            }

            gk_._Q[var4] = var10;
         }

      }
   }
}
