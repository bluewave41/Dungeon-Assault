import java.applet.Applet;
import java.net.URL;

final class sf_ implements cl_ {
   static int _h;
   static String _e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
   static int[] _b = new int[]{1052688, 1056800, 1056784, 4198416, 2105408, 4202560};
   private wm_ _f;
   static md_ _c = new md_();
   private int _a;
   static String _i = "Vampire Bats";
   private int _d;
   static int _g = 0;
   private pj_ _j;

   static final void d150() {
      int var0 = gg_._a[0];

      for(int var1 = 1; gg_._a.length > var1; ++var1) {
         int var2 = gg_._a[var1];
         cj_.a382(hf_._yb, var1 << 4, hf_._yb, var0, var2);
         var0 += var2;
      }

   }

   public final int b313(int var1, int var2, int var3) {
      int var4 = bl_._d[3]._y;
      var1 -= this._a + var4;
      int var5 = var4 + 32;
      var3 -= var4 + this._d;
      int var6 = var1 / var5;
      int var7 = var3 / var5;
      if (var2 != 19091) {
         _e = (String)null;
      }

      return 0 <= var1 && var3 >= 0 && 7 > var6 && 7 > var7 ? var6 + 7 * var7 : -1;
   }

   public final void a093(int var1, int var2) {
      if (var1 != 15122) {
         this.a093(-109, -25);
      }

   }

   public final void a150(int var1) {
      if (var1 != 2985) {
         this.a487(true);
      }

   }

   public final gg_ b624(int var1, int var2) {
      int var3 = bl_._d[3]._y;
      int var4 = 32 + var3;
      int var5 = var1 % 7;
      int var6 = var1 / 7;
      if (var2 != -15390) {
         this._a = 43;
      }

      return new gg_(var5 * var4 + this._a + var3 + 16, var6 * var4 + var3 + this._d + 16);
   }

   static final void a284(Applet var0) {
      try {
         URL var1 = new URL(var0.getCodeBase(), "subscribe.ws");
         var0.getAppletContext().showDocument(j_.a550(var1, var0), "_top");
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public final void a423(byte var1) {
   }

   public final void a487(boolean var1) {
      if (!var1) {
         this.b423((byte)-123);
      }

   }

   public static void c423() {
      _e = null;
      _i = null;
      _c = null;
      _b = null;
   }

   public final void b423(byte var1) {
      int var2 = bl_._d[3]._y;
      int var3 = var2 + 32;
      int var4 = var2 + 7 * var3;
      gf_.b050(this._a - 4, this._d - 4, 8 + var4, var4 + 8, 0);
      rp_.a857(8, 2 + var4, (byte)108, this._a - 1, var4 + 2, kc_._S, this._d - 1);
      wm_ var5 = this._j != null ? this._j.b184((byte)-6) : this._f;
      int var6 = 0;
      if (var1 != -55) {
         this.b423((byte)36);
      }

      int var7 = this._a;
      int var8 = this._d;

      int var9;
      int var10;
      for(var9 = 0; var9 < 7; var8 += var3) {
         for(var10 = 0; 7 > var10; ++var6) {
            int var11;
            int var12;
            boolean var13;
            if (0 >= var9) {
               bl_._d[0].h093(var2 + var7, var8);
            } else {
               var11 = 0;
               if (this._f.a370(35 + var6, (byte)96)) {
                  var12 = var6 - 7;
                  if (var5.a370(35 + var6, (byte)97)) {
                     var13 = null == this._j || (this._j._j.a370(var6, (byte)104) || this._j._B == var6) && (this._j._j.a370(var12, (byte)90) || var12 == this._j._B);
                     var11 = !var13 ? 2 : 1;
                  }
               }

               bl_._d[var11].h093(var2 + var7, var8);
            }

            if (0 >= var10) {
               bl_._d[3].h093(var7, var2 + var8);
            } else {
               var11 = 3;
               if (this._f.a370(-1 - var6 / 7 + var6, (byte)103)) {
                  var12 = var6 - 1;
                  if (var5.a370(-(var6 / 7) + var6 - 1, (byte)122)) {
                     var13 = null == this._j || (this._j._j.a370(var6, (byte)115) || this._j._B == var6) && (this._j._j.a370(var12, (byte)97) || this._j._B == var12);
                     var11 = !var13 ? 5 : 4;
                  }
               }

               bl_._d[var11].h093(var7, var8 + var2);
            }

            ai_ var16;
            if (this._j != null) {
               var16 = this._j._h[var6];
            } else {
               var16 = qj_._c[var6];
               if (var16 == null) {
                  var16 = gm_._d._L[var6];
               }
            }

            var12 = var16._a;
            var13 = this._j == null || this._j._p.a370(var6, (byte)72);
            if (!var13 && 24 != var6) {
               var12 = 1;
            }

            if (3 == var12) {
               if (0 == var6) {
                  ja_._b[3].h093(var2 + var7, var2 + var8);
               } else if (var6 != 6) {
                  if (var6 == 42) {
                     ja_._b[3].g093(var2 + var7, var8 + var2);
                  } else if (48 == var6) {
                     ja_._b[3].b093(var7 + var2, var8 + var2);
                  }
               } else {
                  ja_._b[3].f093(var7 + var2, var2 + var8);
               }
            } else {
               boolean var14 = null != this._j && this._j._j != null && this._j._j.a370(var6, (byte)68);
               int var15 = var13 ? this.c080(var6, var1 ^ -87) : 0;
               if (var12 == 1) {
                  ja_._b[1].h093(var2 + var7, var2 + var8);
               } else if (0 == var12) {
                  ja_._b[0].h093(var7 + var2, var8 + var2);
                  p_._G[var15].d326(var7 + var2, var2 + var8, 128);
                  qe_.b370(var7 + var2, var8 + var2, 32, 32, 0, 0, 0);
               } else {
                  ja_._b[var12].h093(var7 + var2, var2 + var8);
                  if (var6 != 24) {
                     p_._G[var15].d326(var2 + var7, var8 + var2, 64);
                  }

                  if (var14) {
                     sm_._g.d326((-sm_._g._y + 32 >> 1) + var2 + var7, (32 - sm_._g._v >> 1) + var8 + var2, 128);
                  }
               }
            }

            if (this._j != null) {
               if (var6 == this._j._q) {
                  rj_._k.h093(var7 - (-2 - (var3 - rj_._k._E >> 1)), 2 + var8 + (-rj_._k._G + var3 >> 1));
               } else if (this._j._B == var6) {
                  rj_._k.d326((var3 - rj_._k._E >> 1) + 2 + var7, (var3 - rj_._k._G >> 1) + 2 + var8, 128);
               }
            }

            var7 += var3;
            ++var10;
         }

         bl_._d[3].h093(var7, var8 + var2);
         var7 = this._a;
         ++var9;
      }

      for(var9 = 0; 7 > var9; var7 += var3) {
         bl_._d[0].h093(var7 + var2, var8);
         ++var9;
      }

      jh_.c797();
      gf_.e115(this._a, this._d, this._a + var4, this._d + var4);
      var7 = this._a;
      var8 = this._d;

      for(var9 = 0; 8 > var9; var8 += var3) {
         for(var10 = 0; var10 < 8; ++var10) {
            if ((var9 == 3 || var9 == 4) && (3 == var10 || 4 == var10)) {
               gf_.b050(var7 - 2, var8 - 2, var2 + 4, var2 + 4, 8421504);
               gf_.b050(var7 - 1, var8 - 1, 2 + var2, var2 + 2, 16777215);
            } else {
               gf_.b050(var7 - 1, var8 - 1, 2 + var2, 2 + var2, 8421504);
               gf_.b050(var7, var8, var2, var2, 16777215);
            }

            var7 += var3;
         }

         ++var9;
         var7 = this._a;
      }

      jh_.b797();
   }

   public final void c150(int var1) {
      if (var1 != -30876) {
         d093(16);
      }

   }

   public final void a326(int var1, int var2, int var3) {
      if (var1 != -9398) {
         _g = -19;
      }

   }

   public final void b150(int var1) {
      if (var1 != -20827) {
         this.a487(true);
      }

   }

   public final void a183(boolean var1, int var2, int var3) {
      if (null != this._j) {
         if (var3 > 0 || var1) {
            int var4 = (int)(0.5 + Math.cos((double)((float)mo_._a / 5.0F)) * 3.0);
            wm_ var5 = this._j.b184((byte)-128).a775((byte)-53, this._j._v);
            if (var2 == -1723) {
               byte var6 = 36;
               byte var7 = 4;
               int var8 = 0;
               int var9 = var7 + this._a;
               int var10 = this._d + var7;

               for(int var11 = 0; var11 < 7; ++var11) {
                  for(int var12 = 0; 7 > var12; ++var12) {
                     label124: {
                        int var13;
                        boolean var14;
                        boolean var15;
                        if (var11 > 0 && var5.a370(35 + var8, (byte)106)) {
                           var13 = var8 - 7;
                           if (!this._j._m.a370(var8, (byte)83) || !this._j._m.a370(var13, (byte)68)) {
                              break label124;
                           }

                           var14 = this._j._j.a370(var8, (byte)77) || var8 == this._j._q;
                           var15 = this._j._j.a370(var13, (byte)78) || var13 == this._j._q;
                           if (var14 && !var15) {
                              fo_._a.h093((var6 - fo_._a._y >> 1) + (var9 - 1), (-fo_._a._v - 4 >> 1) - var4 + var10);
                           } else if (!var14 && var15) {
                              i_._v.h093(var9 + (var6 - i_._v._y >> 1) - 1, (-i_._v._v - 4 >> 1) + var4 + var10);
                           }
                        }

                        if (0 < var12 && var5.a370(var8 - 1 - var8 / 7, (byte)84)) {
                           var13 = var8 - 1;
                           if (this._j._m.a370(var8, (byte)110) && this._j._m.a370(var13, (byte)79)) {
                              var14 = this._j._j.a370(var8, (byte)84) || this._j._q == var8;
                              var15 = this._j._j.a370(var13, (byte)93) || this._j._q == var13;
                              if (!var14 && var15) {
                                 qp_._a.h093((-qp_._a._y - 2 >> 1) + var9 + var4, var10 + -1 + (var6 - qp_._a._v >> 1));
                              } else if (var14 && !var15) {
                                 qi_._i.h093(var9 + -var4 + (-qp_._a._y - 2 >> 1), var10 - 1 + (-qp_._a._v + var6 >> 1));
                              }
                           }
                        }
                     }

                     ++var8;
                     var9 += var6;
                  }

                  var9 = var7 + this._a;
                  var10 += var6;
               }

            }
         }
      }
   }

   private final int c080(int var1, int var2) {
      if (var2 <= 82) {
         return -82;
      } else {
         int var3 = 0;
         if (0 != var1 % 7 && this._f.a370(var1 - var1 / 7 - 1, (byte)99)) {
            var3 |= 1;
         }

         if (6 != var1 % 7 && this._f.a370(var1 - var1 / 7, (byte)89)) {
            var3 |= 2;
         }

         if (6 < var1 && this._f.a370(var1 + 35, (byte)70)) {
            var3 |= 4;
         }

         if (var1 < 42 && this._f.a370(42 + var1, (byte)74)) {
            var3 |= 8;
         }

         return var3;
      }
   }

   sf_(go_ var1, int var2, int var3) {
      int var4 = bl_._d[3]._y;
      int var5 = 32 + var4;
      int var6 = var4 + var5 * 7;
      if (null == var1) {
         this._f = gm_._d._k;
         this._j = null;
      } else {
         this._j = var1._Y;
         this._f = this._j._v;
      }

      this._a = var2 - (var6 >> 1);
      this._d = var3 - (var6 >> 1);
      this.a093(15122, 0);
      this.a093(15122, 6);
      this.a093(15122, 42);
      this.a093(15122, 48);
      this.b150(-20827);
      jh_.c797();
      p_._G = new cn_[16];

      for(int var7 = 0; 16 > var7; ++var7) {
         cn_ var8 = new cn_(32, 32);
         var8.e797();
         gf_.b050(0, 0, 32, 32, 65793);
         int var9 = 16777215;
         int var10 = 10;
         int var11 = -var10 + (32 - var10);

         for(int var12 = 0; var12 < 2; ++var12) {
            gf_.b050(var10, var10, var11, var11, var9);
            if (0 != (var7 & 1)) {
               gf_.b050(0, var10, var11 + var10, var11, var9);
            }

            if ((var7 & 2) != 0) {
               gf_.b050(var10, var10, var11 + var10, var11, var9);
            }

            if ((4 & var7) != 0) {
               gf_.b050(var10, 0, var11, var10 + var11, var9);
            }

            if (0 != (8 & var7)) {
               gf_.b050(var10, var10, var11, var11 + var10, var9);
            }

            var9 = 0;
            var11 -= 2;
            ++var10;
         }

         p_._G[var7] = var8;
      }

      jh_.b797();
   }

   static final void d093(int var0) {
      oo_._d = var0;

      fa_ var1;
      for(var1 = (fa_)ud_._v.e024(-24172); var1 != null; var1 = (fa_)ud_._v.a024(4)) {
         if (!var1._o.c154(-71)) {
            var1.a487(false);
         } else {
            var1._n.h150(oo_._d * var1._l + 128 >> 8);
         }
      }

      if (oi_._F != null) {
         for(var1 = (fa_)oi_._F.e024(-24172); var1 != null; var1 = (fa_)oi_._F.a024(4)) {
            if (!var1._o.c154(-70)) {
               var1.a487(false);
            } else {
               var1._n.h150(128 + oo_._d * var1._l >> 8);
            }
         }
      }

   }
}
