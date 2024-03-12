class bh_ extends ck_ {
   private ci_ _O = null;
   static int _P;
   static boolean _M = true;
   static String _L = "There is a pit in this room, but it remains concealed until a raider steps on it.";
   static String _Q = "Please log in to access this feature.";
   private String[] _R;
   static String[] _J = new String[]{"Welcome", "Welcome to <%highlight>Dungeon Assault</col>! In this game, you play a dragon, battling your kind to gain <%highlight>Renown</col> in the realm of Dungaria.<br><br><%command>You can hide this tutorial by clicking on the down arrow icon at the top-right of this scroll, and return to it by clicking the visible portion of this scroll at the right edge of the screen. You can also reposition it by holding the mouse button and dragging.</col><br><br><%command>Click the arrow at the bottom-right of this scroll to continue."};
   static String _K = "OVER <%0>";
   static String[] _N = new String[]{"Master of Chaos", "Sacrifice a raider to defeat any room. (Multiple use)"};
   private md_ _S;

   static final int b650(int var0, int var1, boolean var2) {
      int var3 = tg_._f[var1][var0];
      if (var2) {
         return -123;
      } else {
         return ke_.a097(71, var3) ? 260 : tg_._b[var1];
      }
   }

   static final String a661(int var0, int var1) {
      if (var0 <= 116) {
         return (String)null;
      } else {
         return var1 != ek_._c ? cc_._e[var1] : null;
      }
   }

   public static void f423() {
      _J = null;
      _L = null;
      _N = null;
      _K = null;
      _Q = null;
   }

   final void b050(int var1, int var2, int var3, int var4, int var5) {
      super.b050(var1, var2, var3, var4, var5);
      this.g423((byte)-109);
   }

   final void a871(int var1, int var2, String var3) {
      if (null == this._R || this._R.length <= var2) {
         String[] var4 = new String[var2 + 1];
         if (this._R != null) {
            for(int var5 = 0; var5 < this._R.length; ++var5) {
               var4[var5] = this._R[var5];
            }
         }

         this._R = var4;
      }

      if (var1 == 8) {
         this._R[var2] = var3;
      }
   }

   bh_(String var1, ca_ var2) {
      super(var1, (pg_)null);
      super._o = var2;
   }

   boolean a336(int var1, lm_ var2) {
      if (var1 != 34) {
         _K = (String)null;
      }

      return false;
   }

   final void b115(int var1, int var2, int var3, int var4) {
      super.b115(var1, var2, var3, var4);
      int var5 = -super._q + var4;
      int var6 = var1 - super._v;
      ci_ var7 = this.a880(var5, var6, true);
      if (var7 != null && super._n != null) {
         ((pf_)super._n).a271(var7._r, this, var3 + 125, var2);
      }

   }

   static final int a312(boolean var0, String var1, int var2, boolean var3, String var4) {
      if (null == sp_._c) {
         boolean var5 = rj_.a897((byte)98, var3);
         if (!var5) {
            return -1;
         }
      }

      if (pd_._A == no_._c) {
         if (var3) {
            be_._n = l_.a566(var1, hg_._s, false, (String)null);
         } else {
            be_._n = qf_.a647(false, var1, var4);
         }

         ac_._B._o = 0;
         ac_._B.a093(6, 14);
         ac_._B.a093(6, be_._n.b743(-110)._c);
         op_.a093(0, -1);
         pd_._A = ik_._b;
      }

      int var10;
      if (pd_._A == ik_._b && oi_.a097(-12929, 1)) {
         var10 = ra_._c.c474(true);
         if (var10 == 0) {
            pd_._A = mh_._c;
         } else {
            hc_._c = var10;
            nj_._b = -1;
            pd_._A = bj_._K;
         }

         ra_._c._o = 0;
      }

      if (mh_._c == pd_._A && oi_.a097(-12929, 8)) {
         o_._j = ra_._c.c411((byte)105);
         ra_._c._o = 0;
         b_.a895(be_._n, var0, var2, var3);
         pd_._A = rp_._d;
      }

      if (rp_._d == pd_._A && oi_.a097(-12929, 1)) {
         var10 = ra_._c.c474(true);
         ra_._c._o = 0;
         hc_._c = var10;
         pd_._E = null;
         if (0 != var10 && var10 != 1) {
            if (var10 == 8) {
               tl_.a150(127);
               nh_._e = false;
               return var10;
            }

            pd_._A = bj_._K;
            nj_._b = -1;
         } else {
            nj_._b = -1;
            pd_._A = k_._e;
         }
      }

      if (k_._e == pd_._A && kh_.d427()) {
         hg_._s = ra_._c.c411((byte)53);
         nh_._k = ra_._c.c474(true);
         ra_._c.c474(true);
         pb_._G = ra_._c.k137(0);
         String var11 = ra_._c.b791(true);
         int var6 = ra_._c.c474(true);
         if (0 != (1 & var6)) {
            l_.b487();
         }

         if (!var3) {
            _M = 0 != (8 & var6);
            e_._l = (var6 & 4) != 0;
            if (!_M) {
            }
         }

         int var7;
         if (fa_._j) {
            ra_._c.c474(true);
            ra_._c.c474(true);
            ra_._c.h137(-59);
            ao_._k = ra_._c.k137(0);
            ti_._q = new byte[ao_._k];

            for(var7 = 0; var7 < ao_._k; ++var7) {
               ti_._q[var7] = ra_._c.a403((byte)2);
            }
         }

         tc_._u = ra_._c.d738(-98);
         nn_._k = jm_.a715((byte)59, tc_._u);
         hf_._sb = ra_._c.c474(true);
         pd_._A = qa_._c;
         if (be_._n.b743(65) == pe_._j) {
            ba_._e.a587(64, m_.c372(true));
         } else if (be_._n.b743(-104) == ug_._w) {
            gg_._c.a587(64, m_.c372(true));
         }

         nh_._e = false;
         if (null != var11) {
            jb_.a674(var11, m_.c372(true));
         }

         if (pb_._G <= 0 && !e_._l) {
            try {
               ee_.a460(m_.c372(true), "unzap");
            } catch (Throwable var9) {
            }
         } else {
            try {
               ee_.a008("zap", m_.c372(true), 15647, new Object[]{uj_.a748(hg_._s, -1)});
            } catch (Throwable var8) {
            }
         }

         if (pb_._G > 0) {
            ld_._g = true;
         }

         ac_._B.a977(n_._f, (byte)-86);

         for(var7 = 0; 4 > var7; ++var7) {
            int[] var10000 = n_._f;
            var10000[var7] += 50;
         }

         ra_._c.a977(n_._f, (byte)-108);
         return hc_._c;
      } else if (pd_._A == bj_._K && kh_.d427()) {
         tl_.a150(-17);
         if (7 == hc_._c && !nh_._e) {
            nh_._e = true;
            return -1;
         } else {
            if (hc_._c == 7) {
               hc_._c = 3;
            }

            tp_._v = ra_._c.d738(-96);
            nh_._e = false;
            return hc_._c;
         }
      } else {
         if (null == sp_._c) {
            if (nh_._e) {
               if (b_.a138() > 30000L) {
                  tp_._v = lh_._r;
               } else {
                  tp_._v = fc_._l;
               }

               nh_._e = false;
               return 3;
            }

            var10 = an_._E;
            an_._E = l_._b;
            l_._b = var10;
            nh_._e = true;
         }

         return -1;
      }
   }

   final void a762(int var1, byte var2, int var3, int var4) {
      this.b050(0, var3, var4, var1, ((th_)super._o).a349(this, 8));
      if (var2 >= -11) {
         _M = false;
      }

   }

   void a115(int var1, int var2, int var3, int var4) {
      super.a115(var1, var2, var3 ^ var3, var4);
      if (0 == var1) {
         th_ var5 = (th_)super._o;
         ci_ var6 = this._O;
         if (null != var6) {
            int var7 = var5.a437(this, (byte)75, var2);
            int var8 = var5.a387((byte)84, var4, this);

            do {
               in_.a050(var6._k + var7 - 2, var6._p + 2, var6._i + 2, var6._l + (var8 - 2), 1);
               var6 = var6._o;
            } while(null != var6);
         }

      }
   }

   void a319(int var1, int var2, lm_ var3, boolean var4) {
      super.a319(var1, var2, var3, var4);
      this._O = null;
      if (super._u) {
         int var5 = -super._q + (hj_._S - var1);
         int var6 = -var2 + eh_._h - super._v;
         this._O = this.a880(var5, var6, true);
      }

      if (!var4) {
         a661(110, 28);
      }

   }

   final void g423(byte var1) {
      this._S = new md_();
      int var2 = 0;
      th_ var3 = (th_)super._o;
      l_ var5 = var3.b865(-2, this);

      while(true) {
         int var6 = super._w.indexOf("<hotspot=", var2);
         if (-1 == var6) {
            return;
         }

         int var8 = super._w.indexOf(">", var6);
         String var7 = super._w.substring(var6 + 9, var8);
         var8 = Integer.parseInt(var7);
         var2 = super._w.indexOf("</hotspot>", var6);
         int var9 = var5.a080(0, var6);
         int var10 = var5.a080(0, var2);
         ci_ var11 = null;

         for(int var12 = var9; var10 >= var12; ++var12) {
            tg_ var13 = var5._e[var12];
            int var14 = var12 != var9 ? var13._k[0] : var5.a543((byte)60, var6);
            int var15 = var10 == var12 ? var5.a543((byte)70, var2) : (var13 != null ? var13._k[var13._k.length - 1] : 0);
            ci_ var16 = new ci_(var8, var14, var13._m, -var14 + var15, Math.max(var3.a137(100), -var13._m + var13._c));
            if (null != var11) {
               var11._o = var16;
            }

            this._S.a865(var16, false);
            var11 = var16;
         }
      }
   }

   private final ci_ a880(int var1, int var2, boolean var3) {
      ci_ var4 = (ci_)this._S.e024(-24172);
      if (!var3) {
         return (ci_)null;
      } else {
         while(null != var4) {
            for(ci_ var5 = var4; var5 != null; var5 = var5._o) {
               if (var1 >= var5._k && var2 >= var5._l && var5._i + var5._k > var1 && var5._l + var5._p >= var2) {
                  return var4;
               }
            }

            var4 = (ci_)this._S.a024(4);
         }

         return null;
      }
   }

   String c983(byte var1) {
      if (this._O != null && this._R != null) {
         if (var1 <= 3) {
            return (String)null;
         } else {
            return this._R.length > this._O._r ? this._R[this._O._r] : null;
         }
      } else {
         return null;
      }
   }
}
