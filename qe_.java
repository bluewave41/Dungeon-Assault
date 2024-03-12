abstract class qe_ {
   static int _a;
   static int _j;
   static int _n;
   static int _l;
   static cn_[] _i;
   ph_ _e;
   private static int _d;
   private static wb_[] _k = new wb_[32];
   sa_ _q;
   static int _f;
   private static int[][] _g = new int[][]{{16716800, 16756480}, {685312, 5826816}, {10449103, 12690143}, {8086330, 12428684}};
   static int _c;
   md_ _p;
   private static int[][] _h = new int[][]{{16716800, 16756480}, {685312, 5826816}, {2188106, 7054732}, {42962, 62200}};
   kl_ _b;
   private static cn_[] _o;
   private static int[] _m;

   final void b797() {
      if (this._p != null) {
         for(rj_ var1 = (rj_)this._p.e024(-24172); var1 != null; var1 = (rj_)this._p.a024(4)) {
            var1.b423((byte)30);
         }
      }

      this._p = new md_();
   }

   static final void a050(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= gf_._f && var1 < gf_._e) {
         if (var0 < gf_._j) {
            var2 -= gf_._j - var0;
            var0 = gf_._j;
         }

         if (var0 + var2 > gf_._h) {
            var2 = gf_._h - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * gf_._i;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (gf_._b[var12] >> 16 & 255) * var5;
            int var10 = (gf_._b[var12] >> 8 & 255) * var5;
            int var11 = (gf_._b[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            gf_._b[var12++] = gf_._b[var12] & -16777216 | var14;
         }

      }
   }

   private static final void a903(int[] var0, int[] var1, int var2, int var3, int var4, int var5) {
      for(; var5 >= 0; --var5) {
         int var6 = var0[var5] >>> 25 & 255;
         if (var6 != 0) {
            var2 = var1[var5];
            var2 = 256 - (var6 * (256 - var2) >> 8);
            var3 = var0[var5];
            var4 = var3 & '\uff00';
            var3 &= 16711935;
            var3 *= var2;
            var4 *= var2;
            var3 &= -16711936;
            var4 &= 16711680;
            var0[var5] = (var3 | var4) >>> 8 | 65793;
         }
      }

   }

   static final void a420(int var0, int var1, h_ var2) {
      if (var2 != null) {
         b899(var0, var1, _i, _h, new int[]{var2._m, var2._r, var2._b, var2._o});
      } else {
         b899(var0, var1, _i, _h, new int[]{0, 0, 0, 0});
      }

   }

   static final void a669(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 >= gf_._f && var1 < gf_._e) {
         if (var0 < gf_._j) {
            var2 -= gf_._j - var0;
            var0 = gf_._j;
         }

         if (var0 + var2 > gf_._h) {
            var2 = gf_._h - var0;
         }

         int var6 = 256 - var4;
         int var7 = (var3 >> 16 & 255) * var4;
         int var8 = (var3 >> 8 & 255) * var4;
         int var9 = (var3 & 255) * var4;
         var5 <<= 24;
         int var13 = var0 + var1 * gf_._i;

         for(int var14 = 0; var14 < var2; ++var14) {
            int var10 = (gf_._b[var13] >> 16 & 255) * var6;
            int var11 = (gf_._b[var13] >> 8 & 255) * var6;
            int var12 = (gf_._b[var13] & 255) * var6;
            int var15 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var9 + var12 >> 8);
            gf_._b[var13++] = var5 | var15;
         }

      }
   }

   static final wb_[] a814(hb_ var0, int var1) {
      int var2 = a213(var0, var1, _k);
      if (var2 == 0) {
         return null;
      } else {
         wb_[] var3 = new wb_[var2];
         cj_.a030(_k, 0, var3, 0, var2);
         return var3;
      }
   }

   static final void a296(int var0, int var1, int var2, wb_[] var3, int var4) {
      int var5 = var0 - 18;
      int var6 = var1 - 18;
      int var7 = 0;

      while(var7 < var4) {
         wb_ var8 = var3[var7];
         var8._c.c326(var5, var6, var8._a);
         var5 -= 16;
         ++var7;
         if (var7 % var2 == 0) {
            var5 = var0 - 18;
            var6 -= 16;
         }
      }

   }

   static final void b716(ph_ var0, int var1, int var2, int var3, int var4) {
      for(int var6 = var2; var6 < var4; ++var6) {
         int var5 = var6 * 640 + var1;

         for(int var7 = var1; var7 < var3; ++var7) {
            int var8 = 64 + (var0._a._B[var5] & 255);
            var0._a._B[var5] = -16777216 | 6 * var8 >> 2 << 16 | var8 << 8 | var8 >> 1;
            ++var5;
         }
      }

   }

   static final void a370(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      a669(var0, var1, var2, var4, var5, var6);
      a669(var0, var1 + var3 - 1, var2, var4, var5, var6);
      if (var3 >= 3) {
         b669(var0, var1 + 1, var3 - 2, var4, var5, var6);
         b669(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5, var6);
      }

   }

   static final void a268(ph_ var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 * var0._d + var1;
      int var8 = var0._d - (var3 - var1);

      for(int var9 = var2; var9 < var4; var7 += var8) {
         for(int var10 = var1; var10 < var3; ++var7) {
            int var11 = (var9 - var6) * (var9 - var6) / 480 + (var10 - var5) * (var10 - var5) / 640;
            int var12 = (int)(256.0 / (1.0 + (double)var11 * 16.0 / 640.0));
            var12 -= 64;
            if (var12 < 0) {
               var12 = 0;
            }

            int var13 = var0._a._B[var7] & 255;
            int var14 = 2097184 + (16711680 * var12 >>> 8 & 16711935);
            int var15 = 8192 + (24576 * var12 >>> 8 & '\uff00');
            var14 *= 256 - var13;
            var15 *= 256 - var13;
            var14 &= -16711936;
            var15 &= 16711680;
            var0._a._B[var7] = -16777216 | (var13 >> 2) + ((var14 | var15) >>> 8);
            ++var10;
         }

         ++var9;
      }

   }

   private static final wb_ a769(int var0, int var1, String var2, cn_ var3) {
      if (var0 < var1) {
         return new wb_(jk_.a841(new String[]{var2, Integer.toString(var1 - var0)}, vc_._b, 30496), var3, 16711680);
      } else {
         return var0 > var1 ? new wb_(jk_.a841(new String[]{var2, Integer.toString(var0 - var1)}, so_._a, 30496), var3, 65280) : null;
      }
   }

   void c797() {
      this._e = null;
      if (this._b != null) {
         this._b.c150(-121);
      }

      if (this._p != null) {
         for(rj_ var1 = (rj_)this._p.e024(-24172); var1 != null; var1 = (rj_)this._p.a024(4)) {
            var1.b423((byte)30);
         }
      }

      this._b = null;
      this._p = null;
   }

   static final void a608(int var0, int var1, int var2, hb_ var3, int var4) {
      int var5 = a213(var3, var4, _k);
      a296(var0, var1, var2, _k, var5);
   }

   private static final int a213(hb_ var0, int var1, wb_[] var2) {
      int var3 = 0;
      int var4 = var0._e;
      int var5 = var0._g;
      int var6 = var0._f;
      int var7 = var0._k;
      if ((var0._d & 1) != 0) {
         var5 <<= 1;
      }

      if ((var0._d & 2) != 0) {
         var7 <<= 1;
      }

      var7 -= var1;
      if (var7 < 0) {
         var7 = 0;
      }

      wb_ var8 = a769(var4, var0._n._m, qk_._d, ue_._i[0]);
      if (var8 != null) {
         var2[var3++] = var8;
      }

      var8 = a769(var5, var0._n._r, dj_._c, ue_._i[1]);
      if (var8 != null) {
         var2[var3++] = var8;
      }

      var8 = a769(var6, var0._n._b, pm_._n, ue_._i[2]);
      if (var8 != null) {
         var2[var3++] = var8;
      }

      var8 = a769(var7, var0._n._o, nf_._x, ue_._i[3]);
      if (var8 != null) {
         var2[var3++] = var8;
      }

      if ((var0._d & 4) != 0) {
         var2[var3++] = new wb_(kl_._b, ue_._i[6], 16744703);
      }

      if ((var0._o & 4) != 0) {
         var2[var3++] = new wb_(kg_._m, ue_._i[5], 16711680);
      }

      if ((var0._o & 2) != 0) {
         var2[var3++] = new wb_(gl_._Hb, ue_._i[4], 16776960);
      }

      if ((var0._o & 1) != 0) {
         var2[var3++] = new wb_(wi_._nb, ue_._i[6], 8438015);
      }

      return var3;
   }

   private static final void b669(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 >= gf_._j && var0 < gf_._h) {
         if (var1 < gf_._f) {
            var2 -= gf_._f - var1;
            var1 = gf_._f;
         }

         if (var1 + var2 > gf_._e) {
            var2 = gf_._e - var1;
         }

         int var6 = 256 - var4;
         int var7 = (var3 >> 16 & 255) * var4;
         int var8 = (var3 >> 8 & 255) * var4;
         int var9 = (var3 & 255) * var4;
         var5 <<= 24;
         int var13 = var0 + var1 * gf_._i;

         for(int var14 = 0; var14 < var2; ++var14) {
            int var10 = (gf_._b[var13] >> 16 & 255) * var6;
            int var11 = (gf_._b[var13] >> 8 & 255) * var6;
            int var12 = (gf_._b[var13] & 255) * var6;
            int var15 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var9 + var12 >> 8);
            gf_._b[var13] = var5 | var15;
            var13 += gf_._i;
         }

      }
   }

   final boolean d801() {
      if (this._b != null) {
         this._b.a487(false);
         return true;
      } else {
         eg_.a537(this._p);
         return false;
      }
   }

   static final void a653(cn_ var0, cn_ var1, cn_ var2, cn_ var3, cn_ var4, cn_ var5) {
      _o = new cn_[]{var0, var1, var4, var5};
      _i = new cn_[]{var0, var1, var2, var3};
   }

   static final void a716(ph_ var0, int var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var11 = var2 - (_c >> 16);
      int var7 = var1 - (_n >> 16);
      int var14 = -(var4 >> 1);
      int var15 = -(var3 >> 1);
      int var16 = _d & 3;
      if (var16 == 1 || var16 == 3) {
         var5 += var3;
         ++var11;
      }

      if (var16 == 1 || var16 == 2) {
         ++var5;
         ++var7;
      }

      int var6 = 10000 + var11 * var11 + var7 * var7;
      int var17 = 160 + (int)(64.0 * (1.0 + te_.a132(mo_._a)));
      if (var17 > 256) {
         var17 = 256;
      }

      int var19;
      for(int[] var18 = var0._c; var14 < 0; var5 += var3) {
         int var10 = var7;
         int var8 = var6;

         for(int var9 = var15; var9 < 0; var10 += 2) {
            int var12 = dd_.a417(var8, false);
            var19 = var18[var5];
            byte var20 = (byte)(var19 >> 16);
            byte var21 = (byte)(var19 >> 8);
            byte var22 = (byte)var19;
            int var13 = 64 + 5 * ((var10 * var20 + var11 * var21 + 100 * var22) * var12 * var17 >> 24);
            if (var13 < 64) {
               var13 = 64;
            }

            nm_._ib[var5] = var13;
            var5 += 2;
            ++var9;
            var8 += var10 + 1 << 2;
         }

         ++var14;
         var6 += var11 + 1 << 2;
         var11 += 2;
      }

      var19 = var3 * var4;
      a903(var0._a._B, nm_._ib, 0, 0, 0, var19 - 1);
   }

   static final void a738(int var0, int var1, ac_ var2) {
      if (var2 != null) {
         b899(var0, var1, _o, _g, new int[]{var2._A, var2._k, var2._y, var2._r});
      } else {
         b899(var0, var1, _o, _g, new int[]{0, 0, 0, 0});
      }

   }

   void f797() {
      if (ll_._k && mm_._t == 1) {
         ld_._b = !ld_._b;
      }

      if (this._b != null) {
         this._b.b487(false);
      }
   }

   public static void a797() {
      _m = null;
      _g = (int[][])null;
      _h = (int[][])null;
      _k = null;
      _o = null;
      _i = null;
   }

   void b487(boolean var1) {
      int[] var2 = new int[64];

      for(int var3 = 0; var3 < 64; ++var3) {
         var2[var3] = Integer.MIN_VALUE | 65793 * (24 + var3);
      }

      cn_ var7 = new cn_(640, 480);
      jh_.a303(var7);

      int var4;
      int var5;
      for(var4 = 0; var4 < 480; var4 += bf_._d._v) {
         for(var5 = 0; var5 < 640; var5 += bf_._d._y) {
            bf_._d.c093(var5, var4);
         }
      }

      var4 = 0;

      int var6;
      for(var5 = 0; var5 < 480; ++var5) {
         for(var6 = 0; var6 < 640; ++var4) {
            gf_._b[var4] = -16777216 | (gf_._b[var4] & 16579836) >>> 2;
            ++var6;
         }
      }

      jh_.b797();
      int[] var8 = te_.b285(640, 480, 0.125);
      this._e = new ph_(var7, var8);
      _m = new int[307200];

      for(var6 = 0; var6 < 307200; ++var6) {
         _m[var6] = 64;
      }

   }

   static final void a484(int var0, int var1, ai_ var2) {
      gf_.b050(var0 - 4, var1 - 4, 120, 120, 0);
      rp_.a857(4, 112, (byte)108, var0, 112, kc_._V, var1);
      if (var2 != null) {
         if (var2._c != null) {
            var2._c.a697(108, var1 + 2, (byte)102, var0 + 2, 108);
         }

         if (var2._f != null) {
            a296(var0 + 112, var1 + 112, 7, var2._f, var2._f.length);
         }
      }

   }

   static final wb_[] a928(ai_ var0, boolean var1, boolean var2, int var3) {
      int var4 = a427(var0, var1, var2, var3, _k);
      wb_[] var5 = new wb_[var4];
      cj_.a030(_k, 0, var5, 0, var4);
      return var5;
   }

   void c487(boolean var1) {
      if (hj_._S != -1) {
         _f = hj_._S << 16;
         _l = eh_._h << 16;
      }

      int var2 = _f - _n;
      int var3 = _l - _c;
      int var4 = ug_.a527(true, (var2 >> 12) * (var2 >> 12) + (var3 >> 12) * (var3 >> 12)) >> 6;
      if (var4 < 0) {
         throw new RuntimeException();
      } else {
         if (var4 != 0) {
            var2 /= var4;
            var3 /= var4;
            _a += var2;
            _j += var3;
            _a = _a * 14 >> 4;
            _j = _j * 14 >> 4;
         }

         _n += (int)(1048576.0 * te_.a132(mo_._a));
         _c += (int)(1048576.0 * te_.a132(mo_._a ^ 773223));
         _n += _a;
         _c += _j;
         if (this._b != null) {
            this._b.c423((byte)72);
         }

         if (this._q != null) {
            hm_.a531(this._q, -21);
            this._q.a487(false);
         } else {
            hm_.a531((sa_)null, -21);
         }

      }
   }

   static final void b050(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= gf_._j && var0 < gf_._h) {
         if (var1 < gf_._f) {
            var2 -= gf_._f - var1;
            var1 = gf_._f;
         }

         if (var1 + var2 > gf_._e) {
            var2 = gf_._e - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * gf_._i;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (gf_._b[var12] >> 16 & 255) * var5;
            int var10 = (gf_._b[var12] >> 8 & 255) * var5;
            int var11 = (gf_._b[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            gf_._b[var12] = gf_._b[var12] & -16777216 | var14;
            var12 += gf_._i;
         }

      }
   }

   static final void a115(int var0, int var1, int var2, int var3) {
      gf_.b050(var0 - 1, var1 - 1, var2 + 2, var3 + 2, 0);
      ob_.a697(var0, var1, var3, var2);
      a229(var0 + 2, var1 + 2, var2 - 4, var3 - 4, 256, 64, 4, 128);
      rp_.a857(5, var2 - 4, (byte)108, var0 + 2, var3 - 4, kc_._S, var1 + 2);
   }

   static final void a204(int var0, int var1, wd_ var2, int[][] var3) {
      gf_.b050(var0 - 4, var1 - 4, 120, 120, 0);
      rp_.a857(4, 112, (byte)108, var0, 112, var3, var1);
      if (var2 != null) {
         var2.a697(108, var1 + 2, (byte)102, var0 + 2, 108);
      }

   }

   static final void a509(int var0, int var1, ai_ var2, boolean var3, int var4) {
      if (var2 != null) {
         int var5 = var2._p;
         int var6 = var2._g;
         int var7 = var2._r;
         int var8 = var2._q;
         if (var3) {
            var5 = var5 + 1 >> 1;
            var6 = var6 + 1 >> 1;
         }

         var5 -= var4;
         if (var5 < 0) {
            var5 = 0;
         }

         a899(var0, var1, _o, _g, new int[]{var5, var6, var7, var8});
      } else {
         a899(var0, var1, _o, _g, new int[]{0, 0, 0, 0});
      }

   }

   static final void a229(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var6; ++var8) {
         int var9 = var4 - var5 * var8;
         int var10 = var7 * var8 / var6;
         a669(var0, var1 + var8, var2, 0, var9, var10);
         a669(var0, var1 + var3 - 1 - var8, var2, 0, var9, var10);
         b669(var0 + var8, var1, var3, 0, var9, var10);
         b669(var0 + var2 - 1 - var8, var1, var3, 0, var9, var10);
      }

   }

   void a487(boolean var1) {
   }

   private static final int a427(ai_ var0, boolean var1, boolean var2, int var3, wb_[] var4) {
      int var5 = 0;
      int var6 = var0._p;
      int var7 = var0._g;
      int var8 = var0._r;
      int var9 = var0._q;
      if (var2) {
         var6 = var6 + 1 >> 1;
         var7 = var7 + 1 >> 1;
      }

      var6 -= var3;
      if (var6 < 0) {
         var6 = 0;
      }

      wb_ var10 = a769(var6, var0._h._A, qk_._d, ue_._i[0]);
      if (var10 != null) {
         var4[var5++] = var10;
      }

      var10 = a769(var7, var0._h._k, dj_._c, ue_._i[1]);
      if (var10 != null) {
         var4[var5++] = var10;
      }

      var10 = a769(var8, var0._h._y, rk_._a, ue_._i[7]);
      if (var10 != null) {
         var4[var5++] = var10;
      }

      var10 = a769(var9, var0._h._r, eg_._f, ue_._i[8]);
      if (var10 != null) {
         var4[var5++] = var10;
      }

      if (var2) {
         var4[var5++] = new wb_(dm_._c, ue_._i[6], 16744703);
      }

      if (var1) {
         int var11 = var0._h._g;
         if (var11 == 2) {
            var4[var5++] = new wb_(ii_._C, ue_._i[4], 16777215);
         } else if (var11 == 1 || var11 == 3) {
            var4[var5++] = new wb_(fi_._t, ue_._i[4], 16777215);
         }
      }

      return var5;
   }

   static final void a594(int var0, int var1, hb_ var2) {
      gf_.b050(var0 - 4, var1 - 4, 120, 120, 0);
      rp_.a857(4, 112, (byte)108, var0, 112, kc_._S, var1);
      if (var2 != null) {
         var2._b.a697(108, var1 + 2, (byte)102, var0 + 2, 108);
         if (var2._i != null) {
            a296(var0 + 112, var1 + 112, 7, var2._i, var2._i.length);
         }
      } else {
         gf_.b050(var0 + 2, var1 + 2, 108, 108, 0);
      }

   }

   private static final void b494(int var0, int var1, int var2, int var3, int var4, cn_ var5, int var6, int var7) {
      b229(var0, var1, 16, 16, 128, 64, 2, 192);
      var5.c093(var0, var1);
      if (var3 > var4) {
         var3 = var4;
      }

      int var8 = 1 + var3 * (var2 - 1) / var4;
      jm_.a050(4, var0 + 26, var2, var1 + 6);
      int var9 = var6 & 16711935;
      int var10 = var6 & '\uff00';
      int var11 = var7 & 16711935;
      int var12 = var7 & '\uff00';

      for(int var13 = 0; var13 < var8; ++var13) {
         int var14 = (var13 << 8) / var2;
         int var15 = 256 - var14;
         var6 = var9 * var15 + var11 * var14 & -16711936;
         var7 = var10 * var15 + var12 * var14 & 16711680;
         gf_.c115(var0 + 26 + var13, var1 + 6, 4, (var6 | var7) >>> 8);
      }

   }

   private static final void a899(int var0, int var1, cn_[] var2, int[][] var3, int[] var4) {
      for(int var5 = 0; var5 < var4.length; ++var5) {
         a494(var0, var1 + 16 * var5, 96, var4[var5], 10, var2[var5], var3[var5][0], var3[var5][1]);
      }

   }

   private static final void a494(int var0, int var1, int var2, int var3, int var4, cn_ var5, int var6, int var7) {
      b229(var0 - 16, var1, 16, 16, 128, 64, 2, 192);
      var5.c093(var0 - 16, var1);
      if (var3 > var4) {
         var3 = var4;
      }

      int var8 = 1 + var3 * (var2 - 1) / var4;
      jm_.a050(4, var0 - 26 - var2, var2, var1 + 6);
      int var9 = var6 & 16711935;
      int var10 = var6 & '\uff00';
      int var11 = var7 & 16711935;
      int var12 = var7 & '\uff00';

      for(int var13 = 0; var13 < var8; ++var13) {
         int var14 = (var13 << 8) / var2;
         int var15 = 256 - var14;
         var6 = var9 * var15 + var11 * var14 & -16711936;
         var7 = var10 * var15 + var12 * var14 & 16711680;
         gf_.c115(var0 - 27 - var13, var1 + 6, 4, (var6 | var7) >>> 8);
      }

   }

   static final void e797() {
      int var0 = 0;
      int[] var9 = jh_._d;
      int var6 = -(_c >> 16);
      int var2 = -(_n >> 16);
      int var10 = -240;
      short var11 = -320;
      int var12 = ++_d & 3;
      if (var12 == 1 || var12 == 3) {
         var0 += 640;
         ++var6;
      }

      if (var12 == 1 || var12 == 2) {
         ++var0;
         ++var2;
      }

      int var1 = 10000 + var6 * var6 + var2 * var2;
      int var13 = 160 + (int)(64.0 * (1.0 + te_.a132(mo_._a)));
      if (var13 > 256) {
         var13 = 256;
      }

      int var14;
      while(var10 < 0) {
         int var5 = var2;
         int var3 = var1;

         for(int var4 = var11; var4 < 0; var5 += 2) {
            int var7 = dd_.a417(var3, false);
            var14 = var9[var0];
            byte var15 = (byte)(var14 >> 16);
            byte var16 = (byte)(var14 >> 8);
            byte var17 = (byte)var14;
            int var8 = 64 + 5 * ((var5 * var15 + var6 * var16 + 100 * var17) * var7 * var13 >> 24);
            if (var8 < 64) {
               var8 = 64;
            }

            _m[var0] = var8;
            var0 += 2;
            ++var4;
            var3 += var5 + 1 << 2;
         }

         ++var10;
         var1 += var6 + 1 << 2;
         var6 += 2;
         var0 += 640;
      }

      var14 = 307200;
      a903(gf_._b, _m, 0, 0, 0, var14 - 1);
   }

   private static final void b899(int var0, int var1, cn_[] var2, int[][] var3, int[] var4) {
      for(int var5 = 0; var5 < var4.length; ++var5) {
         b494(var0, var1 + 16 * var5, 96, var4[var5], 10, var2[var5], var3[var5][0], var3[var5][1]);
      }

   }

   static final void a305(int var0, int var1, hb_ var2, int var3) {
      if (var2 != null) {
         int var4 = var2._e;
         int var5 = var2._g;
         int var6 = var2._f;
         int var7 = var2._k;
         if ((var2._d & 1) != 0) {
            var5 <<= 1;
         }

         if ((var2._d & 2) != 0) {
            var7 <<= 1;
         }

         var7 -= var3;
         if (var7 < 0) {
            var7 = 0;
         }

         b899(var0, var1, _i, _h, new int[]{var4, var5, var6, var7});
      } else {
         b899(var0, var1, _i, _h, new int[]{0, 0, 0, 0});
      }

   }

   static final void b370(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 < gf_._j) {
         var2 -= gf_._j - var0;
         var0 = gf_._j;
      }

      if (var1 < gf_._f) {
         var3 -= gf_._f - var1;
         var1 = gf_._f;
      }

      if (var0 + var2 > gf_._h) {
         var2 = gf_._h - var0;
      }

      if (var1 + var3 > gf_._e) {
         var3 = gf_._e - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      var6 <<= 24;
      int var7 = 256 - var5;
      int var8 = gf_._i - var2;
      int var9 = var0 + var1 * gf_._i;

      for(int var10 = 0; var10 < var3; ++var10) {
         for(int var11 = -var2; var11 < 0; ++var11) {
            int var12 = gf_._b[var9];
            var12 = ((var12 & 16711935) * var7 >> 8 & 16711935) + ((var12 & '\uff00') * var7 >> 8 & '\uff00');
            gf_._b[var9++] = var6 | var4 + var12;
         }

         var9 += var8;
      }

   }

   static final void b229(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var6; ++var8) {
         a370(var0 - 1 - var8, var1 - 1 - var8, var2 + 2 + 2 * var8, var3 + 2 + 2 * var8, 0, var4 - var5 * var8, var7);
      }

   }

   protected qe_() {
   }
}
