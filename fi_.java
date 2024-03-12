import java.awt.Canvas;

final class fi_ extends qe_ {
   static String _t = "Disarmed";
   static en_[] _r = null;
   private tf_[] _w;
   private cn_ _v;
   private kl_ _z;
   private tf_ _A;
   private cn_ _C;
   static nh_ _u;
   private rh_ _s;
   private int _B;
   private int _y = -1;
   static String _x = "Not yet achieved";
   private rh_ _D;

   private final int a353(int var1, byte var2) {
      int var3 = 120;
      if (var2 != -93) {
         return -30;
      } else {
         int var4 = nk_._Fb[var1];
         if (var4 == 27) {
            var3 = of_._j._y;
         }

         return var3 + this.a543((byte)-4, var1);
      }
   }

   static final Canvas d602() {
      return (Canvas)(cm_._R == null ? c_._h : cm_._R);
   }

   private final int a527(boolean var1, int var2) {
      if (var1) {
         return -14;
      } else {
         int var3 = nk_._Fb[var2];
         if (25 != var3 && 24 != var3 && var3 != 26) {
            return var3 == 27 ? 340 : 439;
         } else {
            return 260;
         }
      }
   }

   private final int a776(int var1, byte var2, int var3) {
      for(int var4 = 0; var4 < nk_._Fb.length; ++var4) {
         int var5 = this.a527(false, var4);
         if (nl_.a370(var4) && var3 >= this.a543((byte)-4, var4) && var3 < this.a353(var4, (byte)-93) && var1 >= var5 && var1 < this.c080(var2 - 86, var4) + var5) {
            return var4;
         }
      }

      if (var2 != 116) {
         this.f797();
      }

      return -1;
   }

   private final void a183(boolean var1, int var2, int var3) {
      int var4 = nk_._Fb[var2];
      String var5 = this.a661(-13, var4);
      int var6 = ne_._c.b926(var5);
      int var7 = this.a543((byte)-4, var2);
      int var8 = this.a353(var2, (byte)-93);
      int var9 = this.a527(false, var2);
      int var10 = var8 - (-var7 + var6) >> 1;
      int[] var11 = var1 ? ml_._b : cm_._M;
      if (null == this._w[var2] || var5 != this._w[var2]._f || this._w[var2]._h != var11) {
         this._w[var2] = new tf_(ne_._c, var5, var11);
      }

      of_._j.h093(640 - of_._j._y >> 1, var9 - 4);
      this._w[var2].b326(var9, 32, var10);
      if (var1) {
         if (var2 != this._y) {
            this.b093(var2, -118);
         }

         this._v.b326(var10, var9, 64);
         int var12 = (int)((1.0 + te_.a132(mo_._a)) * 128.0);
         if (0 > var12) {
            var12 = 0;
         }

         if (256 < var12) {
            var12 = 256;
         }

         this._C.b326(var10, var9, var12);
      }

      if (var3 != 0) {
         this.a487(true);
      }

   }

   final void c487(boolean var1) {
      super.c487(var1);
      if (!kh_._s || !var1) {
         while(true) {
            if (!ha_.b427()) {
               nk_._Jb.a326(-7734, this.a776(hm_._k, (byte)116, lc_._c), this.a776(eh_._h, (byte)116, hj_._S));
               if (-1 != nk_._Jb._b) {
                  this.b183(true, 240, nk_._Jb._b);
               }
               break;
            }

            if (mm_._t == 13) {
               gd_.a778(hl_._f, 0, hl_._f, false);
            } else {
               this.f797();
               if (-1 != nk_._Jb._b) {
                  this.b183(false, 240, nk_._Jb._b);
               }
            }
         }
      }

   }

   final void c797() {
      super.c797();
   }

   final void b487(boolean var1) {
      super.b487(var1);
      int var2 = nk_._Jb._i <= 0 ? -1 : 1;
      if (nk_._Jb._b != -1) {
         var2 = nk_._Jb._b;
      }

      nk_._Jb.a691(false, var1, var2, this.a776(eh_._h, (byte)116, hj_._S));
      this._D = new rh_(58, 394, 80, 160, 255, 197376, 240);
      this._s = new rh_(580, 394, 80, 160, 255, 197376, 240);
      this._w = new tf_[nk_._Jb._i];
      this._z = new kl_();
      jh_.a276(super._e);
      bf_.a540(false);
      kn_._e = false;
      c_.a842(0, 640, 0);
      c_.a842(0, 640, 40);
      vf_.a483(432, true, 33, 48);
      vf_.a483(432, true, 599, 48);
      vf_.a483(32, true, 164, 8);
      vf_.a483(32, true, 468, 8);
      un_.a770(41, 558, 416);
      ad_._e.h093(41, 48);
      ad_._e.j093(-ad_._e._d + 599, 48);
      ad_._e.f093(164 - ad_._e._d, -ad_._e._b + 40);
      ad_._e.i093(172, 40 - ad_._e._b);
      ad_._e.f093(468 - ad_._e._d, 40 - ad_._e._b);
      ad_._e.i093(476, -ad_._e._b + 40);
      jh_.b797();
   }

   private final int c080(int var1, int var2) {
      return var1 != 30 ? -57 : 30;
   }

   final void a487(boolean var1) {
      super.a487(var1);
      super._e.b093(0, 0);
      am_._a.h093(320 - am_._a._E / 2, 48);

      int var2;
      for(var2 = 0; var2 < nk_._Jb._i - 1; ++var2) {
         if (nl_.a370(var2)) {
            this.c183(var2 == nk_._Jb._b && !kn_._e, -33, var2);
         }
      }

      oe_._m.h093(24, 383);
      oe_._m.j093(560, 383);
      if (!kn_._e) {
         e797();
      }

      for(var2 = 0; var2 < nk_._Jb._i - 1; ++var2) {
         if (nl_.a370(var2)) {
            this.a663(1, var2, nk_._Jb._b == var2 && !kn_._e);
         }
      }

      na_._w.a326(320, 25, 1699);
      if (this._A == null || this._A._f != ie_._j[mo_._e]) {
         this._A = new tf_(ne_._c, ie_._j[mo_._e], ag_._c);
      }

      this._A.b326(90, 32, 87);
      this.a656(87, 3740, 200, en_._a[mo_._e], 446, 125);
      wk_.a455(552, bj_.a661(mo_._e), ne_._c, 366, ag_._c, 31139);
      if (kn_._e) {
         this._z.a423((byte)-64);
         var2 = nk_._Jb._i - 1;
         e797();
         this._z.b150(106);
         this.a183(nk_._Jb._b == var2, var2, 0);
         String var3 = null;
         String var4 = null;
         if (this._B != 2) {
            if (1 == this._B) {
               var4 = tn_.a439(this.a661(-13, 25));
               var3 = an_._D;
            } else if (this._B == 0) {
               var4 = tn_.a439(this.a661(-13, 24));
               var3 = uj_._b;
            }
         } else {
            var4 = tn_.a439(this.a661(-13, 26));
            var3 = sg_._a;
         }

         int var5 = ne_._c._E + ne_._c._H;
         short var6;
         int var7;
         short var8;
         short var9;
         if (0 == this._B) {
            var7 = 119;
            var9 = 254;
            var6 = 77;
            var8 = 486;
         } else {
            var9 = 204;
            var7 = 169;
            var8 = 306;
            var6 = 167;
         }

         pi_.a959(0, var4, cm_._M, 30 + var6, ne_._c, var5 + var7);
         var7 += 5 + var5;
         la_._b.a385(var3, 30 + var6, var7, var8 - 60, var9 - 30, 16777215, -1, 0, 0, la_._b._H + la_._b._E);
      }

      oh_.a423();
      this._D.d797();
      this._s.d797();
   }

   private final void c183(boolean var1, int var2, int var3) {
      int var4 = this.a543((byte)-4, var3);
      int var5 = this.a353(var3, (byte)-93);
      int var6 = this.a527(false, var3);
      int var7 = this.c080(30, var3);
      gf_.e050(var4 - 4, var6 - 6, 8 + (var5 - var4), 8 + var7, 0);
      b370(var4, var6 - 2, -var4 + var5, var7, 8421504, 128, 128);
      int var8 = nk_._Fb[var3];
      boolean var10 = var8 == 25 || var8 == 24 || 26 == var8;
      if (!var10) {
         rp_.a857(4, var5 - var4, (byte)108, var4, var7, kc_._S, var6 - 2);
      } else {
         rp_.a857(4, -var4 + var5, (byte)108, var4, var7, kc_._V, var6 - 2);
      }

      a229(var4, var6 - 2, var5 - var4, var7, 224, 64, 3, 128);
   }

   static final void a924(int var0, String var1, int var2) {
      ac_ var3 = gh_._i[var2];
      if (var3 != null) {
         var3._x = var3._a = hd_.a492(var0, "da_guardian_room_" + var1);
      }
   }

   private final void b093(int var1, int var2) {
      int var3 = nk_._Fb[var1];
      String var4 = this.a661(-13, var3);
      int var5 = ne_._c.b926(var4);
      int var6 = ne_._c._E + ne_._c._H;
      if (var2 <= -85) {
         cn_ var7 = new cn_(var5, var6);
         jh_.a303(var7);
         ne_._c.b191(var4, 0, ne_._c._H, 16760960, -1);
         jh_.b797();
         this._v = rb_.a551(8, var7, 16760960, (byte)77);
         this._C = rb_.a551(16, var7, 6307840, (byte)-105);
         this._y = var1;
      }
   }

   private final int a543(byte var1, int var2) {
      if (var1 != -4) {
         this.a183(true, -67, -118);
      }

      int var3 = nk_._Fb[var2];
      if (var3 == 27) {
         return 640 - of_._j._y >> 1;
      } else {
         if (var3 == 25 || 24 == var3 || var3 == 26) {
            var2 -= 3;
         }

         return 140 * var2 + 120;
      }
   }

   final void f797() {
      if (!nk_._Jb.b427((byte)-84) && !kn_._e) {
         int var1;
         if (96 == mm_._t) {
            var1 = nk_._Jb._b;

            while(true) {
               --var1;
               if (var1 < 0) {
                  var1 = nk_._Jb._i - 1;
               }

               if (nl_.a370(var1)) {
                  nk_._Jb.b093(var1, 3);
                  break;
               }
            }
         }

         if (mm_._t == 97) {
            var1 = nk_._Jb._b;

            while(true) {
               ++var1;
               if (nk_._Jb._i <= var1) {
                  var1 = 0;
               }

               if (nl_.a370(var1)) {
                  nk_._Jb.b093(var1, 3);
                  break;
               }
            }
         }

         if (6 == mo_._e) {
            if (98 == mm_._t) {
               var1 = nk_._Jb._b;

               while(true) {
                  var1 -= 3;
                  if (var1 < 0) {
                     var1 += nk_._Jb._i - 1;
                  }

                  if (nl_.a370(var1)) {
                     nk_._Jb.b093(var1, 3);
                     break;
                  }
               }
            }

            if (mm_._t == 99) {
               var1 = nk_._Jb._b;

               do {
                  var1 += 3;
                  if (6 == var1) {
                     var1 = 0;
                  }

                  if (var1 >= nk_._Jb._i) {
                     var1 -= nk_._Jb._i - 1;
                  }
               } while(!nl_.a370(var1));

               nk_._Jb.b093(var1, 3);
            }
         }
      }

      nk_._Jb.e150(107);
      super.f797();
   }

   public static void a423(byte var0) {
      _x = null;
      if (var0 > -99) {
         a423((byte)2);
      }

      _r = null;
      _t = null;
      _u = null;
   }

   private final void a656(int var1, int var2, int var3, String var4, int var5, int var6) {
      String[] var7 = jn_.a782(var4, new int[]{var5}, var2 - 3847, la_._b);
      if (var2 == 3740) {
         int var8 = la_._b._H + var6;
         String[] var9 = var7;

         for(int var10 = 0; var9.length > var10; ++var10) {
            String var11 = var9[var10];
            if (var5 * 3 >> 2 > la_._b.b926(var11)) {
               la_._b.b191(var11, var1, var8, 16777215, -1);
            } else {
               la_._b.b191(var11, var1, var8, 16777215, -1);
            }

            var8 += la_._b._E + la_._b._H;
         }

      }
   }

   private final void b183(boolean var1, int var2, int var3) {
      if (var2 != 240) {
         this.a527(false, 31);
      }

      int var4 = nk_._Fb[var3];
      if (nk_._Jb.c154(var2 ^ 176) && nl_.a370(var3)) {
         if (var4 == 27) {
            kn_._e = false;
         }

         if (!kn_._e) {
            if (var4 != 25 && var4 != 24 && 26 != var4) {
               hm_.a668(var4, var3, var1, var2 ^ -221);
            } else {
               if (26 == var4) {
                  this._B = 2;
               } else if (var4 != 25) {
                  if (24 == var4) {
                     this._B = 0;
                  }
               } else {
                  this._B = 1;
               }

               kn_._e = true;
               if (!var1) {
                  nk_._Jb._b = 6;
               }

               short var5;
               short var6;
               short var7;
               short var8;
               if (this._B == 0) {
                  var6 = 104;
                  var7 = 486;
                  var8 = 254;
                  var5 = 77;
               } else {
                  var5 = 167;
                  var6 = 154;
                  var7 = 306;
                  var8 = 204;
               }

               this._z.a050(var6, var7, var5, -23241, var8);
            }
         }
      }

   }

   private final void a663(int var1, int var2, boolean var3) {
      int var4 = nk_._Fb[var2];
      String var5 = this.a661(var1 ^ -14, var4);
      int var6 = ne_._c.b926(var5);
      if (var1 == 1) {
         int var7 = this.a543((byte)-4, var2);
         int var8 = this.a353(var2, (byte)-93);
         int var9 = this.a527(false, var2);
         int var10 = -var6 + var8 + var7 >> 1;
         int[] var11 = !var3 ? cm_._M : ml_._b;
         if (null == this._w[var2] || var5 != this._w[var2]._f || this._w[var2]._h != var11) {
            this._w[var2] = new tf_(ne_._c, var5, var11);
         }

         this._w[var2].b326(var9, var1 ^ 33, var10);
         if (var3) {
            if (this._y != var2) {
               this.b093(var2, -114);
            }

            this._v.b326(var10, var9, 64);
            int var12 = (int)(128.0 * (1.0 + te_.a132(mo_._a)));
            if (var12 < 0) {
               var12 = 0;
            }

            if (256 < var12) {
               var12 = 256;
            }

            this._C.b326(var10, var9, var12);
         }

      }
   }

   private final String a661(int var1, int var2) {
      String var3 = ll_._m[var2];
      if (10 == var2 && (0 == hl_._f || 0 == dc_._z || 12 == hl_._f || 12 == dc_._z || hl_._f == 1 || dc_._z == 1)) {
         var3 = ll_._m[9];
      }

      return var1 != -13 ? (String)null : var3;
   }
}
