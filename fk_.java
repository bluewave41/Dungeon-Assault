import java.applet.Applet;
import java.net.URL;

final class fk_ extends kl_ {
   private cn_ _m;
   private cn_ _u;
   private cn_ _n;
   private pp_ _p;
   private int _t;
   static tb_ _v;
   static String _s = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
   private int _q;
   private pp_ _o;
   static String _r = "Password: ";
   private String _w;

   final void a067(lb_ var1, int var2) {
      if (var2 == 83) {
         for(int var3 = 0; 8 > var3; ++var3) {
            hb_ var4 = gm_._d._a[var3];
            if ((var4 == null || 255 == var4._p) && null != qd_._c && qd_._c[var3]) {
               qd_._c[var3] = false;
               --sd_._J;
            }

            if (var4 != null) {
               if (var4._p == 255) {
                  var4._b = new wd_(k_._c);
               } else {
                  var4._b = new wd_(var4._n._e);
               }
            }
         }

         this.b423((byte)37);
      }
   }

   private final void d423(byte var1) {
      if (var1 > -104) {
         this._u = (cn_)null;
      }

      int var2;
      int var3;
      for(var2 = 0; 2 > var2; ++var2) {
         for(var3 = 0; var3 < 4; ++var3) {
            int var4 = 199 + 83 * var3;
            int var5 = 57 + var2 * 86;
            gf_.b050(var4, var5, 72, 72, 65793);
            rp_.a857(4, 64, (byte)108, 4 + var4, 64, kc_._V, var5 + 4);
         }
      }

      for(var2 = 0; 4 > var2; ++var2) {
         var3 = var2 * 130 + 37;
         short var6 = 227;
         gf_.b050(var3, var6, 96, 96, 65793);
         rp_.a857(4, 88, (byte)108, 4 + var3, 88, kc_._S, var6 + 4);
      }

   }

   public static void d150() {
      _s = null;
      _v = null;
      _r = null;
   }

   static final void a261(byte var0, wh_ var1) {
      if (null == var1) {
         lo_.a789(var0 ^ 13, true, (vh_)null, 64, 0);
      } else {
         if (var0 != 121) {
            _s = (String)null;
         }

         lo_.a789(85, true, var1._b, 64, var1._f);
      }
   }

   final void b150(int var1) {
      byte var2 = 20;
      boolean var3 = true;

      int var4;
      for(var4 = -hf_._Ab._v + var2; -hf_._Ab._v < var4; var4 -= hf_._Ab._v) {
         byte var5 = 70;
         short var6 = 545;
         if (var3) {
            hf_._Ab.h093(var5, var4);
            hf_._Ab.h093(var6, var4);
         } else {
            hf_._Ab.g093(var5, var4);
            hf_._Ab.g093(var6, var4);
         }

         var3 = !var3;
      }

      gf_.e115(0, 0, 640, am_._a._G + var2 - 12);
      am_._a.h093(-(am_._a._E / 2) + 320, var2);
      gf_.b797();
      lf_._n.c093(321 - lf_._n._E / 2, 60 + var2);
      lf_._x.h093(320 - lf_._x._E / 2, am_._a._G + (var2 - 28));
      var4 = -51 / ((41 - var1) / 63);
      gf_.b669(37 + super._k, 57 + super._j, 155, 158, 65793, 64);
      super.b150(-64);
      this.e150(-64);
      hb_ var7 = null;
      if (-1 != this._q) {
         var7 = gm_._d._a[this._q];
      }

      qe_.a305(50 + super._k, super._j + 136, var7, 0);
      if (var7 != null) {
         db_._v.a385(var7._n._F.toUpperCase(), 45 + super._k, super._j + 62, 139, 58, 16777215, -1, 1, 1, db_._v._H);
      }

   }

   final void a487(boolean var1) {
      this._q = -1;
      super.a487(var1);
      this._q = this.b313(hj_._S, 27403, eh_._h);
      if (hh_._s != this._p) {
         if (hh_._s == this._o) {
            if (0 < sd_._J && sd_._J <= 4) {
               hb_[] var2 = gm_._d._a;

               for(int var3 = 0; var2.length > var3; ++var3) {
                  hb_ var4 = var2[var3];
                  if (var4 != null && qd_._c[var4._j]) {
                     var4._b.a942(62, var4._n._t);
                     if (var4._n._p != null) {
                        gd_.a364(64, var4._n._p);
                     }
                  }
               }

               mc_.a623(this._w, this._t, !var1, qd_._c);
            }
         } else if (no_._d != 0) {
            int var5 = this.b313(lc_._c, 27403, hm_._k);
            if (-1 != var5) {
               hb_ var6 = gm_._d._a[var5];
               if (var6 != null && 255 != var6._p) {
                  if (qd_._c[var5]) {
                     --sd_._J;
                     qd_._c[var5] = false;
                     var6._b.a942(107, var6._n._v);
                  } else if (4 > sd_._J) {
                     ++sd_._J;
                     qd_._c[var5] = true;
                     if (var6._b._n == var6._b._i) {
                        var6._b.a942(62, var6._n._u);
                        if (var6._n._p != null) {
                           gd_.a364(64, var6._n._p);
                        }
                     }
                  }
               }
            }

            this._o._w = 0 < sd_._J && 4 >= sd_._J;
         }
      } else {
         this.a813(true, (byte)22);
      }

   }

   final void b487(boolean var1) {
      if (!var1) {
         if (mm_._t == 13) {
            this.a813(false, (byte)22);
         } else {
            super.b487(var1);
         }

      }
   }

   private final int b313(int var1, int var2, int var3) {
      int var4 = 0;
      int var5 = 0;
      if (var2 != 27403) {
         this.d423((byte)-91);
      }

      int var6;
      int var7;
      for(; 2 > var5; ++var5) {
         for(var6 = 0; 4 > var6; ++var4) {
            var7 = 199 + super._k + 83 * var6;
            int var8 = 86 * var5 + 57 + super._j;
            if (var7 <= var1 && var8 <= var3 && var7 + 72 > var1 && var3 < 72 + var8) {
               return var4;
            }

            if (var4 == 7) {
               break;
            }

            ++var6;
         }
      }

      var5 = super._k + 37;
      var6 = 227 + super._j;

      for(var7 = 0; 8 > var7; ++var7) {
         if (qd_._c[var7]) {
            if (var1 >= var5 && var3 >= var6 && 96 + var5 > var1 && var3 < var6 + 96) {
               return var7;
            }

            var5 += 130;
         }
      }

      return -1;
   }

   static final void a587(int var0, Applet var1) {
      try {
         if (var0 != 84) {
            _s = (String)null;
         }

         String var2 = var1.getDocumentBase().getFile();
         int var3 = var2.indexOf(63);
         String var4 = "reload.ws";
         if (0 <= var3) {
            var4 = var4 + var2.substring(var3);
         }

         URL var5 = new URL(var1.getCodeBase(), var4);
         var1.getAppletContext().showDocument(j_.a550(var5, var1), "_self");
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   private final void e150(int var1) {
      if (var1 > -57) {
         this.a813(false, (byte)-23);
      }

      int var2 = 0;

      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < 2; ++var3) {
         for(var4 = 0; var4 < 4; ++var2) {
            var5 = 83 * var4 + super._k + 199;
            int var6 = 86 * var3 + super._j + 57;
            if (gm_._d._a[var2] != null) {
               gm_._d._a[var2]._b.a697(60, var6 + 6, (byte)102, var5 + 6, 60);
               qe_.a608(72 + (var5 - 4), var6 + 72 - 4, 3, gm_._d._a[var2], 0);
               int var7 = (int)(64.0 * (te_.c503(mo_._a, 10273 * var2, 0.015625) + 2.0));
               if (var7 < 0) {
                  var7 = 0;
               }

               if (qd_._c[var2]) {
                  this._u.b326(var5, var6, var7);
               }

               if (this._q == var2) {
                  this._m.b326(var5, var6, 64);
                  this._n.b326(var5, var6, var7);
               }
            }

            ++var4;
         }
      }

      var3 = super._k + 37;
      var4 = 227 + super._j;

      for(var5 = 0; var5 < 8; ++var5) {
         if (qd_._c[var5] && null != gm_._d._a[var5]) {
            gm_._d._a[var5]._b.a697(84, 6 + var4, (byte)102, 6 + var3, 84);
            qe_.a608(var3 + 96 - 4, var4 + 96 - 4, 3, gm_._d._a[var5], 0);
            var3 += 130;
         }
      }

   }

   final void c423(byte var1) {
      super.c423((byte)44);
      hb_[] var3 = gm_._d._a;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         hb_ var5 = var3[var4];
         if (null != var5) {
            var5._b.a556((byte)109, 20);
         }
      }

   }

   private final void a813(boolean var1, byte var2) {
      if (var2 != 22) {
         this.b487(true);
      }

      super._d = true;
   }

   final void b423(byte var1) {
      int[] var2 = new int[64];

      for(int var3 = 0; 64 > var3; ++var3) {
         var2[var3] = mp_.a080(Integer.MIN_VALUE, (var3 + 24) * 65793);
      }

      cn_ var5 = new cn_(super._a, super._i);
      cn_ var4 = new cn_(super._a, super._i);
      super._l = new ph_(var5, var4);
      jh_.a276(super._l);
      if (var1 == 37) {
         da_.a563(pi_._i, cm_._M, super._a >> 1, 1917623617, (ne_._c._H + 36 >> 1) + 7, ne_._c);
         this.d423((byte)-123);
         gf_.b050(44, 64, 141, 53, 65793);
         rp_.a857(4, 133, (byte)108, 48, 45, kc_._S, 68);
         jh_.b797();
      }
   }

   fk_(String var1, int var2) {
      super(40, 40, 560, 380);
      this._t = var2;
      this._w = var1;
      this._p = tn_.a226(140, -jm_._i._v + super._j - 20 + super._i, ne_._c, jm_._i, -112, be_._r.toUpperCase());
      this._o = tn_.a226(-jm_._i._y + 500, -jm_._i._v + super._j + (super._i - 20), ne_._c, jm_._i, -73, lk_._P);
      super._f.a865(this._p, false);
      super._f.a865(this._o, false);
      this.a067((lb_)null, 83);
      this._m = mf_.a971(10449103, 72, 6, 72);
      this._n = mf_.a971(255, 72, 12, 72);
      this._u = mf_.a971(16711680, 72, 12, 72);
      qd_._c = new boolean[8];
      this._o._w = false;
      sd_._J = 0;
      new rh_(58, 394, 80, 160, 16711680, 768, 249);
      new rh_(580, 394, 80, 160, 16711680, 768, 249);
      qh_.a726(-13716, this._o, 24);
   }

   static final cn_ a575(cn_ var0, int var1, int var2) {
      cn_ var3 = var0.d125();
      int var4 = var2 & 16711935;
      int var5 = '\uff00' & var2;

      for(int var6 = 0; var3._B.length > var6; ++var6) {
         int var7 = var3._B[var6];
         int var8 = (63 & var7 >> 2) + (var7 >> 18 & 63) + (127 & var7 >> 9);
         int var9 = 16711680 & var5 * var8 | -16711936 & var8 * var4;
         if (0 == var9 && var7 != 0) {
            var9 = 65793;
         }

         var3._B[var6] = var9 >>> 8;
      }

      jh_.a303(var3);
      var0.d326(-var0._w, -var0._A, -var1 + 256);
      jh_.b797();
      return var3;
   }
}
