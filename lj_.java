import java.awt.Component;

final class lj_ implements cl_ {
   static String _e;
   private int _s;
   private int _t;
   static cn_ _o;
   static int _u = 100;
   private pj_ _h;
   static String _p = "Raider wins!";
   private int[][] _w;
   private wm_ _k;
   private cn_ _f;
   private int _q;
   static volatile boolean _g = false;
   static String _j = "Your initial Renown after the next reset will be increased by 100.";
   static int _m;
   private wm_ _i;
   private int _l;
   private cn_ _c;
   private rh_[][] _v;
   private cn_ _b;
   static int _r = 200;
   private int[] _a;
   private int[] _n;
   private cn_ _d;

   public final void a487(boolean var1) {
      if (!var1) {
         this._c = (cn_)null;
      }

      if (this._t > 0) {
         int var2 = (this._t << 8) / 80;
         int var3 = this._h._B;
         int var4 = var3 / 7;
         int var5 = var3 % 7;
         int var6 = -224 - (-((var5 + var4) * 32) - this._q);
         int var7 = 24 * (var4 - var5) + 168 + this._l - 24;
         this._b.b326(var6, var7, var2);
      }

   }

   static final void a249(Component var0) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(in_._C);
      var0.addFocusListener(in_._C);
   }

   private final void a068(int var1, int var2, int var3, int var4, ph_ var5) {
      if (var2 > 2) {
         this.a241(var5._a, -32, var4, var3, var1);
         var5.d093(var3, var1);
      }
   }

   public final void c150(int var1) {
      int var2 = 0;
      if (var1 != -30876) {
         this.a527(false, 55);
      }

      rh_[] var3;
      int var4;
      rh_ var5;
      for(; var2 < 49; ++var2) {
         if (this._h._p.a370(var2, (byte)122)) {
            int[] var10000 = this._n;
            var10000[var2] += 4;
         }

         if (this._n[var2] > 256) {
            this._n[var2] = 256;
            if ((3 & mo_._a) == 0 && null != this._v[var2]) {
               var3 = this._v[var2];

               for(var4 = 0; var3.length > var4; ++var4) {
                  var5 = var3[var4];
                  --var5._a;
                  if (235 > var5._a) {
                     var5._a = 235;
                  }
               }
            }
         }
      }

      if (this._s != -1 && this._s + 160 > mo_._a) {
         var2 = mo_._a - this._s;
         int var11 = 16 > var2 ? var2 * 16 : (72 > var2 ? 256 : -(2 * var2) + 400);
         var4 = je_._d.length;
         int[] var12 = new int[var4];
         int[] var6 = new int[var4];

         int var7;
         for(var7 = 0; var7 < var4; ++var7) {
            var12[var7] = hj_.a185(12582912, var11, je_._d[var7]);
            var6[var7] = hj_.a185(65793, var11, rg_._P[var7]);
         }

         for(var7 = 0; 49 > var7; ++var7) {
            if (null != this._v[var7]) {
               rh_[] var8 = this._v[var7];

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  rh_ var10 = var8[var9];
                  var10._e = var12[this._a[var7]];
                  var10._h = var6[this._a[var7]];
                  if (var2 < 120) {
                     var10._a = 256;
                  }
               }
            }
         }
      } else {
         for(var2 = 0; 49 > var2; ++var2) {
            if (this._v[var2] != null) {
               var3 = this._v[var2];

               for(var4 = 0; var4 < var3.length; ++var4) {
                  var5 = var3[var4];
                  var5._e = je_._d[this._a[var2]];
                  var5._h = rg_._P[this._a[var2]];
               }
            }
         }
      }

      if (0 < this._t) {
         --this._t;
      }

   }

   public final void a183(boolean var1, int var2, int var3) {
      if (0 < var3 || var1) {
         if (var3 % 30 >= 15) {
            ec_.a021(this._l, this._q - 224, this._f, 16711680, 256);
         } else {
            this._f.b326(this._q - 224, this._l, 256);
         }
      }

      if (var2 != -1723) {
         this._l = -37;
      }

   }

   private final int a527(boolean var1, int var2) {
      int var3 = 0;
      if (var2 % 7 != 0 && this._i.a370(-(var2 / 7) + (var2 - 1), (byte)87)) {
         var3 |= 1;
      }

      if (var2 % 7 != 6 && this._i.a370(-(var2 / 7) + var2, (byte)123)) {
         var3 |= 2;
      }

      if (var1) {
         this.b150(-31);
      }

      if (var2 > 6 && this._i.a370(var2 + 35, (byte)122)) {
         var3 |= 4;
      }

      if (42 > var2 && this._i.a370(var2 + 42, (byte)118)) {
         var3 |= 8;
      }

      return var3;
   }

   public static void d150() {
      _j = null;
      _p = null;
      _o = null;
      _e = null;
   }

   private final void a669(int var1, int var2, int var3, int var4, int var5, int var6) {
      cn_ var7 = fm_.b251(var2 - 29348, var4);
      if (null != var7) {
         if (var3 != var2) {
            int var8 = var7._E * var3 >> 8;
            int var9 = var3 * var7._G >> 8;
            if (var5 == 256) {
               var7.c115(-(var8 >> 1) + var1, var6 - var9, var8, var9);
            } else {
               var7.d050(var1 - (var8 >> 1), -var9 + var6, var8, var9, var5);
            }
         } else if (var5 != 256) {
            var7.d326(-(var7._E >> 1) + var1, var6 - var7._G, var5);
         } else {
            var7.h093(var1 - (var7._E >> 1), -var7._G + var6);
         }

      }
   }

   private final void b050(int var1, int var2, int var3, int var4, int var5) {
      int var6 = this._h._h[var2]._a;
      if (!this._h._p.a370(var2, (byte)106) && 24 != var2) {
         var6 = 0;
      }

      i_._r[var6].e326(var5, var1 + 1, var4);
   }

   public final void b150(int var1) {
      jh_.c797();
      if (null == this._c) {
         this._c = new cn_(448, 356);
         this._f = new cn_(480, 388);
         this._f._w = -16;
         this._f._A = -16;
      }

      this._c.e797();
      gf_.a797();

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      for(var2 = 0; 7 > var2; ++var2) {
         var3 = 32 * (6 - var2);
         var4 = var2 * 24;
         var5 = -var2 + 6;

         for(var6 = 0; var6 < 1 + var2; var3 += 64) {
            var7 = 16777215;
            if (!this._h._m.a370(var5, (byte)92) || this._h._j.a370(var5, (byte)86)) {
               var7 = 0;
            }

            if (0 != var5 && 6 != var5) {
               ri_._d[5].e326(var3, var4, var7);
            }

            if (6 != var5 && 48 != var5) {
               ri_._d[4].e326(32 + var3, var4, var7);
            }

            this.b050(var4, var5, -75, var7, var3);
            var5 += 8;
            ++var6;
         }
      }

      for(var2 = 7; 13 > var2; ++var2) {
         var3 = 32 * (var2 - 6);
         var4 = var2 * 24;
         var5 = var2 * 7 - 42;

         for(var6 = 0; var6 < 13 - var2; var3 += 64) {
            var7 = 16777215;
            if (!this._h._m.a370(var5, (byte)106) || this._h._j.a370(var5, (byte)74)) {
               var7 = 0;
            }

            ri_._d[5].e326(var3, var4, var7);
            ri_._d[4].e326(var3 + 32, var4, var7);
            this.b050(var4, var5, 115, var7, var3);
            if (var6 == 0 && 0 != var5 && 42 != var5) {
               ri_._d[5].e326(var3 + 32, 24 + var4, 0);
            }

            if (var6 == 12 - var2 && 42 != var5 && 48 != var5) {
               ri_._d[4].e326(var3, var4 + 24, 0);
            }

            var5 += 8;
            ++var6;
         }
      }

      if (var1 != -20827) {
         this._w = (int[][])((int[][])null);
      }

      this._f.e797();
      gf_.a797();
      this._c.e326(16, 16, 16744448);
      gf_.d669(8, 8, 0, 0, this._f._y, this._f._v);
      this._c.e326(16, 16, 0);
      jh_.b797();
   }

   public final void a423(byte var1) {
      this._s = mo_._a;
   }

   public final int b313(int var1, int var2, int var3) {
      if (var2 != 19091) {
         this._s = 60;
      }

      var3 -= this._l;
      var1 -= this._q;
      int var4 = (3 * var1 - (4 * (var3 - 168) - 672)) / 192;
      int var5 = (var3 * 4 + var1 * 3) / 192;
      return var4 >= 0 && var5 >= 0 && var4 < 7 && var5 < 7 ? var5 * 7 + var4 : -1;
   }

   public final gg_ b624(int var1, int var2) {
      int var3 = var1 % 7;
      int var4 = var1 / 7;
      if (var2 != -15390) {
         this.a669(-20, -18, 83, -99, 20, -65);
      }

      return new gg_(32 * (var3 + var4) + this._q - 192, 168 + 24 * (var4 - var3) + this._l);
   }

   private final void a241(cn_ var1, int var2, int var3, int var4, int var5) {
      if (var2 != -32) {
         this.b050(-31, -114, 86, -38, -41);
      }

      int var6;
      int var7;
      int var8;
      int var10;
      int var11;
      int var13;
      int var14;
      int var15;
      int var16;
      int var20;
      if (null == this._h) {
         var10 = 256;
         var11 = 10066329;
         if (gm_._d._L[var3]._a == 0) {
            var10 = 128;
         }

         var6 = var10 * (192 + ((16711680 & var11) >> 18)) / 255;
         var7 = var10 * (192 + (63 & var11 >> 10)) / 255;
         var8 = var10 * ((var11 >> 2 & 63) + 192) / 255;
      } else {
         int var9;
         if (!this._h._p.a370(var3, (byte)89)) {
            if (24 == var3) {
               var6 = 96;
               var8 = 0;
               var7 = 48;
            } else {
               var6 = 0;
               var7 = 0;
               var8 = 0;
               int[] var19 = this._h.a464((byte)120, var3);
               var11 = 0;
               int[] var12 = var19;

               for(var13 = 0; var12.length > var13; ++var13) {
                  var14 = var12[var13];
                  if (this._h._p.a370(var14, (byte)80)) {
                     var15 = this.a543((byte)-103, var14);
                     var16 = je_._d[this._a[var14]];
                     var6 += (192 + ((16711680 & var16) >> 18)) * var15 / 255;
                     var7 += (192 + (var16 >> 10 & 63)) * var15 / 255;
                     var8 += (192 + ((var16 & 255) >> 2)) * var15 / 255;
                     ++var11;
                  }
               }

               if (var11 > 0) {
                  var20 = 4 * var11;
                  var7 /= var20;
                  var6 /= var20;
                  var8 /= var20;
               }

               var7 += 16;
               var6 += 16;
               var8 += 16;
               var9 = var6 - (-(var7 << 1) - var8) >> 2;
            }
         } else {
            var9 = this.a543((byte)-72, var3);
            var10 = je_._d[this._a[var3]];
            var8 = (192 + ((255 & var10) >> 2)) * var9 / 255;
            var6 = (192 + ((var10 & 16711680) >> 18)) * var9 / 255;
            var7 = var9 * ((var10 >> 10 & 63) + 192) / 255;
            if (this._s != -1) {
               var11 = mo_._a - this._s;
               if (var11 < 200) {
                  var20 = 16 > var11 ? var11 * 16 : (72 <= var11 ? -(2 * var11) + 400 : 256);
                  var8 = var8 * (256 - var20) >>> 8;
                  var7 = (-var20 + 256) * var7 >>> 8;
                  var6 = (var20 >> 1) + ((-var20 + 256) * var6 >>> 8);
               }
            }
         }
      }

      var10 = 0;
      var11 = var4 + var1._w + gf_._i * (var1._A + var5);
      var20 = -var1._y + gf_._i;

      for(var14 = -var1._v; var14 < 0; ++var14) {
         for(var13 = -var1._y; 0 > var13; ++var10) {
            var15 = var1._B[var10];
            if (var15 != 0) {
               var16 = var15 & 16711680;
               int var17 = var15 & '\uff00';
               var17 *= var7;
               int var18 = 255 & var15;
               var16 *= var6;
               var18 *= var8;
               var15 = '\uff00' & var18 | 16711680 & var17 | var16 & -16777216;
               gf_._b[var11] = mp_.a080(var15 >>> 8, -16777216);
            }

            ++var11;
            ++var13;
         }

         var11 += var20;
      }

   }

   public final void a326(int var1, int var2, int var3) {
      jh_.c797();
      if (this._d == null) {
         this._d = new cn_(64, 68);
         this._b = new cn_(96, 100);
         this._b._w = -16;
         this._b._A = -16;
      }

      this._d.e797();
      gf_.a797();
      byte var4 = 0;
      byte var5 = 0;
      ri_._d[5].e326(var4, var5, 16777215);
      ri_._d[4].e326(var4 + 32, var5, 16777215);
      this.b050(var5, var3, -127, 16777215, var4);
      this._b.e797();
      gf_.a797();
      this._d.e326(16, 16, var2);
      gf_.d669(16, 16, 0, 0, this._b._y, this._b._v);
      this._d.e326(16, 16, 0);
      jh_.b797();
      this._t = 80;
      if (var1 != -9398) {
         this.a050(-70, -121, 96, 85, 77);
      }

   }

   private final void a172(byte var1, int var2, int var3, int var4) {
      int var5 = 0;
      hb_[] var6 = new hb_[4];

      int var7;
      for(var7 = 0; 4 > var7; ++var7) {
         if (this._h._A[var7] != null && (6 & this._h._A[var7]._o) == 0) {
            var6[var5++] = this._h._A[var7];
         }
      }

      if (0 != var5) {
         if (1 != var5) {
            if (2 != var5) {
               if (var5 == 3) {
                  this.a669(var2 + 20, 256, 128, var6[0]._c, var3, var4 + 37);
                  this.a669(44 + var2, 256, 128, var6[1]._c, var3, var4 + 37);
                  this.a669(var2 + 32, 256, 128, var6[2]._c, var3, 48 + var4);
               } else {
                  this.a669(var2 + 32, 256, 96, var6[0]._c, var3, 31 + var4);
                  this.a669(var2 + 16, 256, 96, var6[1]._c, var3, var4 + 41);
                  this.a669(48 + var2, 256, 96, var6[2]._c, var3, 41 + var4);
                  this.a669(32 + var2, 256, 96, var6[3]._c, var3, 51 + var4);
               }
            } else {
               this.a669(22 + var2, 256, 144, var6[0]._c, var3, 45 + var4);
               this.a669(42 + var2, 256, 144, var6[1]._c, var3, var4 + 45);
            }
         } else {
            this.a669(var2 + 32, 256, 192, var6[0]._c, var3, var4 + 45);
         }

         var7 = -60 % ((var1 + 54) / 39);
      }
   }

   private final void a115(int var1, int var2, int var3, int var4) {
      if (var4 != -25) {
         _u = -46;
      }

      int var5;
      boolean var6;
      if (null == this._h) {
         ai_ var7 = gm_._d._L[var3];
         if (qj_._c[var3] != null) {
            var7 = qj_._c[var3];
         }

         var5 = var7._a;
         var6 = true;
      } else {
         var5 = this._h._h[var3]._a;
         var6 = this._h._p.a370(var3, (byte)106);
      }

      int var10;
      if (!var6 && var3 != 24) {
         this.a241(i_._r[0], -32, var3, var1, var2 + 1);
         if (6 < var3) {
            var10 = var3 - 7;
            if (this._h._p.a370(var10, (byte)110) && this._i.a370(var10 + 42, (byte)78)) {
               ec_.a021(18 + var2, var1, mf_._b[0], (je_._d[this._a[var10]] >> 1 & 8355711) + 8421504, this.a543((byte)-11, var10) >> 2);
            }
         }

         if (6 != var3 % 7) {
            var10 = 1 + var3;
            if (this._h._p.a370(var10, (byte)93) && this._i.a370(var3 - var3 / 7, (byte)121)) {
               ec_.a021(var2 + 18, var1, mf_._b[1], 8421504 + (8355711 & je_._d[this._a[var10]] >> 1), this.a543((byte)-8, var10) >> 2);
            }
         }

         if (var3 < 42) {
            var10 = 7 + var3;
            if (this._h._p.a370(var10, (byte)104) && this._i.a370(var3 + 42, (byte)97)) {
               ec_.a021(var2 + 18, var1, mf_._b[2], (8355711 & je_._d[this._a[var10]] >> 1) + 8421504, this.a543((byte)-67, var10) >> 2);
            }
         }

         if (0 != var3 % 7) {
            var10 = var3 - 1;
            if (this._h._p.a370(var10, (byte)114) && this._i.a370(var10 - var10 / 7, (byte)101)) {
               ec_.a021(18 + var2, var1, mf_._b[3], ((je_._d[this._a[var10]] & 16711422) >> 1) + 8421504, this.a543((byte)-36, var10) >> 2);
            }
         }
      } else {
         cn_ var11;
         if (!var6) {
            if (0 != var5) {
               i_._r[var5].h093(var1, var2 + 1);
            } else {
               var10 = this._h.d080(var3, 30813);
               mc_._w[var10].h093(var1, 1 + var2);
            }
         } else {
            int var8;
            int var9;
            if (0 == var5) {
               var10 = this.a527(false, var3);
               this.a241(mc_._w[var10], -32, var3, var1, var2 - 7);
            } else {
               this.a241(i_._r[var5], -32, var3, var1, var2 + 1);
               if (2 == gh_._i[var5]._g && (this._h == null || !this._h._j.a370(var3, (byte)101))) {
                  var11 = jb_.a574(var5);
                  if (var11 != null) {
                     if (null == this._h) {
                        if (null != var11) {
                           var8 = var11._E * 5 >> 3;
                           var9 = var11._G * 5 >> 3;
                           var11.c115(var1 + (-var8 + 48 >> 1), 40 + (var2 - var9), var8, var9);
                        }
                     } else {
                        var11.h093(-(var11._y >> 1) + var1 + 32, -var11._v + 24 + 21 + var2);
                     }
                  }
               }
            }

            if (this._h != null) {
               if (this._v[var3] != null) {
                  int[] var12 = this._w[var3];

                  for(var8 = 0; var8 < var12.length; ++var8) {
                     var9 = var12[var8];
                     sn_._c[var9].h093(var1, var2);
                  }

                  rh_[] var13 = this._v[var3];

                  for(var8 = 0; var13.length > var8; ++var8) {
                     rh_ var14 = var13[var8];
                     var14.e797();
                  }
               }

               if (var3 > 6) {
                  var10 = var3 - 7;
                  if (this._h._p.a370(var10, (byte)106) && this._i.a370(var10 + 42, (byte)86)) {
                     ec_.a021(18 + var2, var1, mf_._b[0], 8421504 + ((16711422 & je_._d[this._a[var10]]) >> 1), this.a543((byte)-39, var10) >> 2);
                  }
               }

               if (6 != var3 % 7) {
                  var10 = var3 + 1;
                  if (this._h._p.a370(var10, (byte)110) && this._i.a370(-(var3 / 7) + var3, (byte)92)) {
                     ec_.a021(var2 + 18, var1, mf_._b[1], ((je_._d[this._a[var10]] & 16711422) >> 1) + 8421504, this.a543((byte)-57, var10) >> 2);
                  }
               }

               if (42 > var3) {
                  var10 = 7 + var3;
                  if (this._h._p.a370(var10, (byte)93) && this._i.a370(var3 + 42, (byte)92)) {
                     ec_.a021(var2 + 18, var1, mf_._b[2], 8421504 + ((je_._d[this._a[var10]] & 16711422) >> 1), this.a543((byte)-56, var10) >> 2);
                  }
               }

               if (var3 % 7 != 0) {
                  var10 = var3 - 1;
                  if (this._h._p.a370(var10, (byte)69) && this._i.a370(var10 - var10 / 7, (byte)67)) {
                     ec_.a021(18 + var2, var1, mf_._b[3], 8421504 + (8355711 & je_._d[this._a[var10]] >> 1), this.a543((byte)-52, var10) >> 2);
                  }
               }
            }
         }

         if (this._h != null) {
            if (this._h._q == var3) {
               this.a172((byte)56, var1, 256, var2);
            } else if (var3 == this._h._B && 2 != gh_._i[var5]._g) {
               var11 = fm_.b251(-29092, this._h._u._c);
               if (null != var11) {
                  var11.d326((64 - var11._y >> 1) + var1, -var11._v + var2 + 45, 80);
               }

               this.a172((byte)-107, var1, 80, var2);
            }
         }
      }

   }

   lj_(go_ var1, int var2, int var3) {
      this(var2, var3);
      this._h = var1._Y;
      this._i = this._h._v;
      this._a = new int[49];
      this._n = new int[49];
      this._w = new int[49][];
      this._v = new rh_[49][];
      this._k = new wm_(84);
      this._s = -1;
      this.a093(15122, 0);
      this.a093(15122, 6);
      this.a093(15122, 42);
      this.a093(15122, 48);
      this.c423((byte)125);
      this.b150(-20827);
   }

   public final void a150(int var1) {
      if (var1 == 2985) {
         this._t = 0;
      }
   }

   private final void a050(int var1, int var2, int var3, int var4, int var5) {
      this._w[var2][var1] = var5;
      int var6 = 1 + this._q + 32 * (var2 / 7 + var2 % 7) - 224 + ud_._w[var5];
      int var7 = r_._b[var5] - 21 + 168 + 24 * (-(var2 % 7) + var2 / 7) + this._l;
      this._a[var2] = var4;
      this._v[var2][var1] = new rh_(var6, var7, 20, 40, je_._d[var4], rg_._P[var4], 256);
   }

   public final void b423(byte var1) {
      nb_._d.h093(13 + (this._q + 79 - 320), this._l + 13);

      int var2;
      for(var2 = 0; 168 >= var2; ++var2) {
         gf_.b115(-(var2 * 4 / 3) + this._q, var2 + 18 + this._l, 8 * var2 / 3, 0);
         gf_.b115(-(4 * var2 / 3) + this._q, -var2 + 336 + 18 + this._l, 8 * var2 / 3, 0);
      }

      if (var1 != -55) {
         this._n = (int[])null;
      }

      int var3;
      int var4;
      int var5;
      int var6;
      boolean var7;
      int var8;
      boolean var9;
      int var10;
      boolean var11;
      boolean var12;
      for(var2 = 0; 7 > var2; ++var2) {
         var3 = -(32 * (1 + var2)) + this._q;
         var4 = var2 * 24 + this._l;
         var5 = -var2 + 6;

         for(var6 = 0; 1 + var2 > var6; var5 += 8) {
            var7 = null == this._h || this._h._p.a370(var5, (byte)104);
            if (0 == var6) {
               if (var5 != 0 && var5 != 6) {
                  this.a068(var4, 9, var3, var5, ua_._b[5]);
               }
            } else {
               var8 = var5 - 7;
               var9 = var7 || this._h._p.a370(var8, (byte)67);
               var10 = 5;
               if (var9) {
                  var11 = this._i.a370(42 + var8, (byte)123);
                  if (var11) {
                     var12 = this._h == null || (this._h._j.a370(var5, (byte)110) || this._h._B == var5) && (this._h._j.a370(var8, (byte)103) || var8 == this._h._B);
                     var10 = !var12 ? 3 : 1;
                  }
               }

               this.a068(var4, var1 ^ -31, var3, var5, ua_._b[var10]);
            }

            if (var2 == var6) {
               if (var5 != 6 && var5 != 48) {
                  this.a068(var4, 121, 32 + var3, var5, ua_._b[4]);
               }
            } else {
               var8 = var5 + 1;
               var9 = var7 || this._h._p.a370(var8, (byte)89);
               var10 = 4;
               if (var9) {
                  var11 = this._i.a370(-(var5 / 7) + var5, (byte)90);
                  if (var11) {
                     var12 = this._h == null || (this._h._j.a370(var5, (byte)66) || var5 == this._h._B) && (this._h._j.a370(var8, (byte)80) || var8 == this._h._B);
                     var10 = var12 ? 0 : 2;
                  }
               }

               this.a068(var4, var1 + 85, 32 + var3, var5, ua_._b[var10]);
            }

            this.a115(var3, var4, var5, -25);
            ++var6;
            var3 += 64;
         }
      }

      for(var2 = 7; var2 < 13; ++var2) {
         var3 = -(32 * (-var2 + 13)) + this._q;
         var4 = var2 * 24 + this._l;
         var5 = 7 * var2 - 42;

         for(var6 = 0; 13 - var2 > var6; var5 += 8) {
            var7 = this._h == null || this._h._p.a370(var5, (byte)75);
            var8 = var5 - 7;
            var9 = var7 || this._h._p.a370(var8, (byte)122);
            var10 = 5;
            if (var9) {
               var11 = this._i.a370(42 + var8, (byte)121);
               if (var11) {
                  var12 = this._h == null || (this._h._j.a370(var5, (byte)68) || var5 == this._h._B) && (this._h._j.a370(var8, (byte)103) || this._h._B == var8);
                  var10 = !var12 ? 3 : 1;
               }
            }

            var8 = var5 + 1;
            this.a068(var4, 5, var3, var5, ua_._b[var10]);
            var10 = 4;
            var9 = var7 || this._h._p.a370(var8, (byte)95);
            if (var9) {
               var11 = this._i.a370(-(var5 / 7) + var5, (byte)116);
               if (var11) {
                  var12 = null == this._h || (this._h._j.a370(var5, (byte)88) || var5 == this._h._B) && (this._h._j.a370(var8, (byte)70) || var8 == this._h._B);
                  var10 = !var12 ? 2 : 0;
               }
            }

            this.a068(var4, 115, var3 + 32, var5, ua_._b[var10]);
            this.a115(var3, var4, var5, -25);
            if (var6 == 0 && 0 != var5 && 42 != var5) {
               ua_._b[4].h093(var3, var4 + 24);
            }

            if (var6 == 12 - var2 && var5 != 42 && 48 != var5) {
               ua_._b[5].h093(32 + var3, var4 + 24);
            }

            var3 += 64;
            ++var6;
         }
      }

   }

   public final void a093(int var1, int var2) {
      if (null == this._w[var2]) {
         int[] var3 = this._h.b574(var2, (byte)-36);
         int var4 = 0;
         if (var1 != 15122) {
            this._w = (int[][])((int[][])null);
         }

         int[] var5 = var3;

         int var6;
         for(var6 = 0; var6 < var5.length; ++var6) {
            int var7 = var5[var6];
            if (!this._k.a370(var7, (byte)88)) {
               ++var4;
            }
         }

         int var10 = oi_.b080(0, 5);
         if (var4 <= 0) {
            this._v[var2] = new rh_[0];
            this._w[var2] = new int[0];
         } else {
            this._v[var2] = new rh_[var4];
            this._w[var2] = new int[var4];
            var6 = 0;
            int[] var11 = var3;

            for(int var8 = 0; var8 < var11.length; ++var8) {
               int var9 = var11[var8];
               if (!this._k.a370(var9, (byte)93)) {
                  this._k.a093(var9, var1 - 15183);
                  if (var9 == -(var2 / 7) + (var2 - 1)) {
                     this.a050(var6++, var2, var1 - 15007, var10, 6);
                  }

                  if (var9 == var2 - var2 / 7) {
                     this.a050(var6++, var2, 98, var10, 3);
                  }

                  if (var2 + 35 == var9) {
                     this.a050(var6++, var2, var1 - 15007, var10, 1);
                  }

                  if (var9 == var2 + 42) {
                     this.a050(var6++, var2, 100, var10, 4);
                  }
               }
            }
         }

      }
   }

   private final void c423(byte var1) {
      for(int var2 = 0; var2 < 49; ++var2) {
         if (var2 != 0 && 6 != var2 && 42 != var2 && 48 != var2 && this._h._p.a370(var2, (byte)73)) {
            this.a093(15122, var2);
         }
      }

      if (var1 <= 123) {
         this._c = (cn_)null;
      }

   }

   private final int a543(byte var1, int var2) {
      int var3 = this._n[var2];
      if (var3 < 256) {
         int var4 = (int)(256.0 * (1.0 - Math.exp((double)(-var3) / 40.0)));
         int var5 = (int)((1.0 - Math.cos((double)var3 * Math.PI / 128.0)) * 64.0);
         var3 = var4 + var5;
      } else {
         var3 = 256;
      }

      var3 = (int)((double)var3 + 48.0 * te_.c503(var2, mo_._a, 0.03125));
      if (var1 > -1) {
         this._n = (int[])null;
      }

      var3 >>= 1;
      if (40 > var3) {
         var3 = 40;
      }

      return var3;
   }

   private lj_(int var1, int var2) {
      this._c = null;
      this._d = null;
      this._l = var2 - 168;
      this._q = var1;
      this._i = gm_._d._k;
   }

   lj_(go_ var1, lj_ var2) {
      this._c = null;
      this._d = null;
      this._q = var2._q;
      this._l = var2._l;
      this._h = var1._Y;
      this._a = var2._a;
      this._n = var2._n;
      this._v = var2._v;
      this._w = var2._w;
      this._k = var2._k;
      this._s = -1;
      this._i = this._h._v;
      this.c423((byte)126);
      this.b150(-20827);
   }
}
