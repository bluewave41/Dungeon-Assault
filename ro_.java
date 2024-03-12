final class ro_ extends kl_ {
   private int _r;
   private int _A;
   private int _t = 0;
   private wd_ _o;
   private go_ _p;
   static boolean _B = false;
   private int _z;
   private cn_ _v;
   private pp_ _s;
   private sa_ _w;
   private cn_ _q;
   private eh_ _y;
   static boolean _u = false;
   private int _x;
   private int _C;
   static String _m = "Black Knight";
   private int _D;
   private dd_ _n;

   final void b150(int var1) {
      super.b150(-125);
      int var2 = (super._a - 200 >> 1) + super._k;
      int var3 = super._j + 80;
      gf_.b050(var2 - 5, var3 - 5, 210, 210, 0);
      rp_.a857(4, 202, (byte)108, var2 - 1, 202, kc_._S, var3 - 1);
      this._o.a697(200, var3, (byte)102, var2, 200);
      if (this._w == null) {
         this.a587(super._k, super._j + super._i - 80, super._a, (byte)4, 80);
      } else {
         this._w.a423((byte)-108);
      }

      if (5 != this._t && 0 != this._t && 4 != this._t) {
         this.a112((byte)-111, super._k - 18, super._i - 60 + super._j, this._A, false);
         this.a112((byte)-109, super._a + super._k - 66, super._i - 60 + super._j, this._A - 8, true);
      }

      int var4;
      if (null != this._v) {
         var4 = (-this._v._y + 200 >> 1) + var2;
         int var5 = 192 + -this._v._v + var3;
         if (100 <= this._z) {
            this._q.b326(var4, var5, 256);
            this._v.h093(var4, var5);
         } else {
            int var6 = (this._z << 8) / 100;
            this._q.b326(var4, var5, var6);
            this._v.d326(var4, var5, var6);
         }
      }

      var4 = -49 % ((var1 - 41) / 63);
   }

   private final int e137(int var1) {
      int var2 = this.f137(-2);
      if (0 != var2) {
         if (var1 > -41) {
            this._x = -95;
         }

         return (int)((long)this._A * (long)this._D * (long)(var2 * 2 - this._A) / (long)(var2 * var2));
      } else {
         return 0;
      }
   }

   private final void a112(byte var1, int var2, int var3, int var4, boolean var5) {
      if (var1 >= -32) {
         this._A = 117;
      }

      if (var5) {
         if (var4 <= 0) {
            return;
         }

         this.a092(tb_._a, var3 - 24, (byte)9, var2 + 2, var4);
         var4 -= 16;
         if (0 >= var4) {
            return;
         }

         this.a092(tb_._a, var3 - 24 + 15, (byte)9, var2 + 22, var4);
         var4 -= 16;
         var3 -= 24;
      }

      while(0 < var4) {
         this.a092(n_._e, var3, (byte)9, var2, var4);
         var4 -= 16;
         if (var4 <= 0) {
            return;
         }

         this.a092(n_._e, var3 - 15, (byte)9, var2 + 20, var4);
         var4 -= 16;
         if (var4 <= 0) {
            return;
         }

         this.a092(tb_._a, var3 - 24, (byte)9, var2 + 2, var4);
         var4 -= 16;
         if (var4 <= 0) {
            return;
         }

         this.a092(tb_._a, var3 + 15 - 24, (byte)9, 22 + var2, var4);
         var3 -= 24;
         var4 -= 16;
      }

   }

   private final void a092(q_ var1, int var2, byte var3, int var4, int var5) {
      if (1 == this._t || var5 >= 20) {
         if (var3 != 9) {
            this._s = (pp_)null;
         }

         if (var5 >= 16) {
            if (var5 < 18) {
               var1.a093(var4, -var5 + 16 + var2);
            } else if (var5 >= 20) {
               var1.a093(var4, var2);
            } else {
               var1.a093(var4, var5 + (var2 - 20));
            }
         } else {
            var1.a326(var4, (var5 << 2) + var2 - 64, var5 << 4);
         }

      }
   }

   final void d150(int var1) {
      this._t = 4;
      this._D = 0;
      if (null != this._n) {
         this._n.b423((byte)30);
      }

      this._n = null;
      this._s.b423((byte)30);
      this._s = tn_.a226(super._k + (-jm_._i._y + super._a >> 1), -jm_._i._v + super._i + super._j, ne_._c, jm_._i, -124, tf_._g);
      super._f.a865(this._s, false);
      this._y.a423((byte)-19);
      System.gc();
      this._o.a721(ga_._n, bo_._Lb, -10872);
      this._A = 0;
      if (var1 == 2) {
         this.a326(true, 16711680, al_._n);
      }
   }

   public static void f423() {
      _m = null;
   }

   final void a556(byte var1, int var2) {
      this._C = 0;
      this._x = -1;
      this._t = 1;
      this._D = var2;
      if (var1 != 101) {
         this._w = (sa_)null;
      }

      if (this._n != null) {
         this._n.b423((byte)30);
      }

      this._n = null;
   }

   final void a599(int var1, int var2, byte var3) {
      this._D = var2;
      this._t = 1;
      this._C = var1;
      int var5 = this.f137(-2);
      this._x = var5 != 0 ? oi_.b080(0, this.f137(-2)) : 0;
      if (null != this._n) {
         this._n.b423((byte)30);
      }

      this._n = null;
   }

   final void b423(byte var1) {
      int[] var2 = new int[64];

      for(int var3 = 0; 64 > var3; ++var3) {
         var2[var3] = mp_.a080(Integer.MIN_VALUE, 1579032 + var3 * 65793);
      }

      cn_ var9 = te_.a983(super._a - 32, super._i - 28, var2, 16, 8, 0.125);
      int[] var4 = te_.b285(super._a - 32, super._i - 28, 0.125);
      cn_ var5 = new cn_(0, 0);
      var5._B = var4;
      var5._v = super._i - 28;
      var5._y = super._a - 32;
      ph_ var6 = new ph_(var9, var5);
      cn_ var7 = new cn_(super._a, super._i);
      cn_ var8 = new cn_(super._a, super._i);
      super._l = new ph_(var7, var8);
      jh_.a276(super._l);
      if (var1 != 37) {
         this.a587(-55, 119, -92, (byte)-82, -62);
      }

      var6.b093(16, 16);
      qe_.a229(23, 13, super._a - 46, super._i - 34, 256, 32, 8, 128);
      jc_.a669(super._i - 26, 16, 14, 1, 2, 1);
      jc_.a669(super._i - 26, super._a - 24, 14, 1, var1 ^ 39, 1);
      vd_.a669(super._a - 16, 2, -14561, 2, 8, 0);
      vd_.a669(super._a, 2, -14561, 2, 0, 6);
      vd_.a669(super._a, 2, var1 - 14598, 2, 0, 54);
      vd_.a669(super._a - 16, 2, -14561, 2, 8, super._i - 16);
      vd_.a669(super._a, 2, -14561, 2, 0, super._i - 22);
      jc_.a669(40, 70, 14, 1, 2, 1);
      jc_.a669(40, super._a - 78, 14, 1, 2, 1);
      oe_._m.h093(8, 21);
      oe_._m.j093(super._a - 63, 21);
      ad_._e.i093(23, super._i - 38);
      ad_._e.f093(super._a - 39, super._i - 38);
      da_.a563(ak_._p, cm_._M, super._a >> 1, 1917623617, (36 + ne_._c._H >> 1) + 14, ne_._c);
      jh_.b797();
   }

   final void c150(int var1) {
      super.c150(-125);
      eh_[] var2 = rg_._M;
      int var3 = 0;
      if (var1 < -115) {
         while(var2.length > var3) {
            eh_ var4 = var2[var3];
            var4.a423((byte)-19);
            ++var3;
         }

         bo_._Lb.a423((byte)-19);
         ce_._v.a423((byte)-19);
         kf_._j.a423((byte)-19);
      }
   }

   ro_(go_ var1) {
      super(300, 420);
      this._p = var1;
      this._r = 16777215;
      this._D = 0;
      int var2 = this._p._Y._o;
      this._n = new dd_(40 + super._k, super._i + super._j - 118, 0, super._a - 80, var2, this._D);
      t_.a124(64, gl_._Ib, true);
      this._y = rg_._M[0];
      this._o = new wd_(this._y);
      if (this._p._Y._l > 0) {
         this._s = tn_.a226(super._k + (-jm_._i._y + super._a >> 1), super._j + super._i - jm_._i._v, ne_._c, jm_._i, -47, hj_._X);
         super._f.a865(this._s, false);
         this._t = 5;
      } else {
         this._s = tn_.a226((super._a - jm_._i._y >> 1) + super._k, -jm_._i._v + super._j + super._i, ne_._c, jm_._i, -75, pe_._n);
         super._f.a865(this._s, false);
         super._f.a865(this._n, false);
         this._t = 0;
      }

   }

   private final int f137(int var1) {
      return var1 != -2 ? -82 : (int)(Math.log((double)(this._D + 1)) * 250.0 / Math.log(10.0));
   }

   private final void d423(byte var1) {
      this._s.b423((byte)30);
      this._s = tn_.a226((super._a - jm_._i._y >> 1) + super._k, -jm_._i._v + super._i + super._j, ne_._c, jm_._i, -64, tf_._g);
      if (var1 > -86) {
         this.b423((byte)-86);
      }

      super._f.a865(this._s, false);
      bo_._Lb.a423((byte)-19);
      this._t = 3;
      this._s._w = true;
   }

   private final void a326(boolean var1, int var2, String var3) {
      if (this._w == null) {
         this._w = new sa_(60 + super._k, (la_._b._H >> 1) - 120 + super._i + super._j, super._a - 120, 80);
         this._w._k = 0;
         cn_ var4 = new cn_(super._a - 120, 80);
         jh_.a303(var4);
         this.a587(-60, -(la_._b._H >> 1) + 40, super._a, (byte)4, 120);
         jh_.b797();
         this._w.a126(1929, true, var4);
      }

      this._w.a050(var1, (String)null, (byte)91, var3, var2);
   }

   private final void a503(String var1, int var2, int var3) {
      int var4 = ne_._c.b926(var1);
      int var5 = ne_._c._E + ne_._c._H;
      if (var3 <= -75) {
         this._v = new cn_(var4, var5);
         jh_.a303(this._v);
         ne_._c.b191(var1, 0, ne_._c._H, var2, -1);
         this._q = rb_.a551(16, this._v, var2, (byte)86);
         this._v.d150(65793);
         jh_.b797();
      }
   }

   final void c423(byte var1) {
      super.c423((byte)-97);
      this._o.a556((byte)109, 20);
      if (null != this._w) {
         this._w.a487(false);
      }

      if (this._v != null) {
         ++this._z;
      }

      if (this._t != 5) {
         if (this._t != 0) {
            if (this._t != 1) {
               if (2 != this._t) {
                  if (4 == this._t && this._o._k == ga_._n) {
                     this._o.a721(ga_._n, ce_._v, -10872);
                     this.d423((byte)-108);
                  }
               } else if (ga_._n == this._o._k) {
                  this._o.a721(ga_._n, ce_._v, -10872);
                  int var3 = this._p.a080(1, this._C);
                  int var4 = in_.a080(var3);
                  String var5;
                  if (var3 == 0) {
                     var5 = l_._f;
                  } else if (1 < var4) {
                     var5 = jk_.a841(new String[]{Integer.toString(var4)}, od_._c, 30496);
                  } else {
                     String var6 = null;

                     for(int var7 = 0; 4 > var7; ++var7) {
                        if ((1 << var7 & var3) != 0) {
                           var6 = this._p._Y._A[var7]._n._F;
                           break;
                        }
                     }

                     var5 = jk_.a841(new String[]{var6.toUpperCase()}, rp_._a, 30496);
                  }

                  this.a326(true, 16711680, sm_._e + "<br><br>" + var5);
                  this.a503(lp_._n, 8421504, -103);
                  this.d423((byte)-88);
               }
            } else {
               ++this._A;
               if (18 <= this._A && 0 == (7 & this._A - 18)) {
                  je_.a595(0, eb_._O);
               }

               if (-1 != this._x && this._A >= this._x) {
                  this._y.a423((byte)-19);
                  System.gc();
                  this._o.a721(ga_._n, bo_._Lb, -10872);
                  this._t = 2;
                  this._s._w = true;
               } else if (this._A >= this.f137(-2)) {
                  System.gc();
                  this._p.c423((byte)-121);
                  this.a326(true, 16744448, jk_.a841(new String[]{Integer.toString(this.e137(-90))}, wi_._qb, 30496));
                  this.a503(ac_._h, 16744448, -84);
                  this.d423((byte)-94);
               }
            }
         } else {
            this._D = this._n._F;
            this.e423((byte)-97);
         }
      }

   }

   final void a487(boolean var1) {
      super.a487(var1);
      if (hh_._s == this._s) {
         if (5 == this._t) {
            super._f.a865(this._n, var1);
            mi_.a300(this._s, pe_._n, ne_._c, jm_._i);
            this._t = 0;
         } else if (0 == this._t) {
            this._n._w = false;
            this._s._w = false;
            this._p.b093(this._D, 69);
         } else if (1 < this._t) {
            super._d = true;
         }
      }

   }

   private final void a587(int var1, int var2, int var3, byte var4, int var5) {
      int var6 = this._D;
      if (this._t != 5) {
         int var7;
         int var8;
         if (this._t == 0) {
            var7 = (3 * var3 >> 2) + var1;
            db_._v.a191(ab_._b, var7, var2, this._r, -1);
            db_._v.b191(Integer.toString(this._D), var7, var2, this._r, -1);
            var8 = var2 + 2 + db_._v._H;
            db_._v.a191(li_._e, var7, var8, this._r, -1);
            db_._v.b191((int)(0.5 + 100.0 * this._p._Y.b308(gm_._d._N, this._D, 82)) + "%", var7, var8, this._r, -1);
            var8 += 2 + db_._v._H;
            if (var6 > this._p._Y.c137(-82)) {
               db_._v.a385(oo_._b, 30 + var1, -db_._v._H + var8, var3 - 60, 30, this._r, -1, 1, 1, db_._v._H);
            } else if (0 <= var6) {
               db_._v.a191(kl_._e, var7, var8, this._r, -1);
               db_._v.b191(gh_.a382(var6), var7, var8, this._r, -1);
               var8 += 2 + db_._v._H;
               double var9 = (double)gm_._d._b / (double)gm_._d._l;
               double var11 = Math.sqrt(var9);
               int var13 = (int)Math.ceil((double)var6 * var11);
               if (var13 > gm_._d._b) {
                  var13 = gm_._d._b;
               }

               var6 -= var13;
               db_._v.a191(nm_._jb, var7, var8, this._r, -1);
               db_._v.b191(gh_.a382(var6), var7, var8, this._r, -1);
               var8 += db_._v._H + 2;
            } else {
               db_._v.a191(jc_._a, var7, var8, this._r, -1);
               db_._v.b191(gh_.a382(-var6), var7, var8, this._r, -1);
               var8 += 2 + db_._v._H;
            }
         } else if (this._t != 4) {
            var7 = (var3 * 5 >> 3) + var1;
            var8 = var2 + 10;
            db_._v.a191(eh_._a, var7, var8, 16777215, -1);
            db_._v.b191(Integer.toString(this.e137(var4 - 60)), var7, var8, 16777215, -1);
         }
      } else {
         db_._v.a385(jk_.a841(new String[]{gh_.a382(this._p._Y._l)}, wm_._e, 30496), 30 + var1, var2 - 20, var3 - 60, 40, 16777215, -1, 1, 1, la_._b._H);
      }

      if (var4 != 4) {
         this.c423((byte)44);
      }

   }

   static final void a585(pm_ var0, int var1, int var2) {
      wj_ var3 = ac_._B;
      var3.d556((byte)-126, var1);
      var3.a093(6, var0._j);
      var3.a093(6, var0._i);
   }

   private final void e423(byte var1) {
      double var2 = this._p._Y.b308(gm_._d._N, this._D, 69);
      if (var1 <= -52) {
         this._r = 1.0 <= var2 ? 16711680 : (var2 >= 0.5 ? 16776960 : 16777215);
         boolean var4 = this._p._Y.b308(gm_._d._N, 0, 53) == 1.0;
         this._s._w = var4 || var2 < 1.0;
         if (this._D > this._p._Y.c137(-114)) {
            this._s._w = false;
            this._r = 16711680;
         }

         int var5 = (int)(var2 * 4.0);
         if (var5 > 3) {
            var5 = 3;
         }

         if (rg_._M[var5] != this._y) {
            this._y = rg_._M[var5];
            this._o = new wd_(this._y);
         }

      }
   }
}
