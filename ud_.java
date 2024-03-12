import java.awt.Component;

final class ud_ extends qe_ {
   static cn_[] _s;
   static md_ _v = new md_();
   static cn_ _r;
   static int _x;
   static ed_ _t;
   static int[] _w;
   static cn_ _y;
   static String _u = "Save the changes to your dungeon and return to the main menu";

   private final int[] a165(int[] var1, boolean var2) {
      int[] var3 = new int[var1.length];
      if (var2) {
         this.c487(true);
      }

      for(int var4 = 0; var1.length > var4; ++var4) {
         var3[var4] = -(var1[var4] / 4) + 320 << 4;
      }

      return var3;
   }

   ud_() {
      String var1 = ii_._E.toUpperCase();
      gp_ var2 = ne_._c;
      rf_._O = new ob_(0L, (ok_)null, (ok_)null, (ok_)null, jm_._i, "");
      rf_._O._D = 10;
      rf_._O._gb = 630 - rf_._O._Tb._L._y;
      rf_._O._ic._fb = 16777215;
      rf_._O._ic._y = var2;
      rf_._O._ic._lb = 1;
      rf_._O._B = rf_._O._Tb._B = rf_._O._ic._B = rf_._O._Tb._L._v;
      rf_._O._ob = rf_._O._Tb._ob = rf_._O._ic._ob = rf_._O._Tb._L._y;
      ub_._i = new tf_(ne_._c, var1, ag_._c);
      ok_._Y = new tf_(ne_._c, var1, ml_._b);
      ro_._B = false;
   }

   private final void a540(boolean var1, int var2) {
      ia_._K._w = 0;
      lk_.f150(var2 - 4080);
      gd_.a778(0, var2 ^ var2, 0, var1);
      cm_.a494(1.6F, 0.92F, var2 - 11884, 0.1F, 25.0F);
   }

   private final int[] a385(boolean var1, int[] var2) {
      if (var1) {
         return (int[])null;
      } else {
         int[] var3 = new int[var2.length];

         for(int var4 = 0; var2.length > var4; ++var4) {
            var3[var4] = 240 - var2[var4] / 4 << 4;
         }

         return var3;
      }
   }

   final void b487(boolean var1) {
      fk_.a261((byte)121, (wh_)null);
      sf_._g = 256;
      ub_._p = 0;
   }

   public static void a423() {
      _y = null;
      _w = null;
      _t = null;
      _v = null;
      _r = null;
      _u = null;
      _s = null;
   }

   final void a487(boolean var1) {
      if (var1) {
         if (ia_._K == null) {
            gf_.a797();
         } else if (ia_._K._w > ia_._K._g) {
            gf_.a797();
            int var2 = -sg_._b._y + 640 >> 1;
            int var3 = -sg_._b._v + 480 >> 1;
            sg_._b.h093(var2, var3);
            if (sf_._g != 0) {
               gf_.b669(0, 0, 640, 480, 0, sf_._g);
            }

            rf_._O.b540(false, 84);
            (rf_._O._hb ? ok_._Y : ub_._i).b326(rf_._O._D, 32, rf_._O._gb + rf_._O._ob / 2 - ok_._Y._i / 2);
         } else {
            ia_._K.a150(-101);
            rf_._O.b540(false, 125);
            (!rf_._O._hb ? ub_._i : ok_._Y).b326(rf_._O._D, 32, -(ok_._Y._i / 2) + rf_._O._ob / 2 + rf_._O._gb);
         }

      }
   }

   final void c487(boolean var1) {
      if (var1) {
         rf_._O.a430(-2, true);
         if (0 == rf_._O._G) {
            do {
               if (!ha_.b427()) {
                  if (!ro_._B) {
                     rm_.r150();
                     if (ro_._B) {
                        this.d487(true);
                     }
                  }

                  ia_._K.a487(true);
                  if (ia_._K._w >= ia_._K._g) {
                     if (++ub_._p < 150) {
                        sf_._g -= 8;
                        if (sf_._g < 0) {
                           sf_._g = 0;
                        }
                     } else {
                        sf_._g += 8;
                        if (sf_._g >= 256) {
                           cm_.a494(0.0F, 0.0F, -7788, 0.1F, 0.0F);
                           this.a540(false, 4096);
                           return;
                        }
                     }

                     return;
                  }

                  for(int var2 = 0; var2 < sj_._db.length; ++var2) {
                     if (sj_._db[var2] == ia_._K._w && var2 < u_._T.length) {
                        gd_.a364(64, u_._T[var2]);
                     }
                  }

                  return;
               }
            } while(13 != mm_._t);

            this.a540(false, 4096);
         } else {
            this.a540(true, 4096);
         }
      }
   }

   private final void d487(boolean var1) {
      int[] var2 = new int[]{sj_._db[1], sj_._db[2] - sj_._db[1], -sj_._db[2] + sj_._db[3], sj_._db[4] - sj_._db[3], -sj_._db[4] + sj_._db[5], -sj_._db[5] + sj_._db[6], sj_._db[7] - sj_._db[6], sj_._db[8] - sj_._db[7], 1870 - sj_._db[8]};
      ia_._K = new tk_(ga_._o, var2, 0, ne_._c, qh_._J, (cn_[])null);
      ia_._K._i = new boolean[]{var1, true, true, true, false, true, true, true, true};
      ia_._K._a[8] = 16777215;
      ia_._K._u[7] = 16777215;
      ia_._K._B = new boolean[]{true, true, true, true, true, false, true, true, true};
      ia_._K._r = 64;

      int var3;
      int[] var4;
      int[] var6;
      int[] var8;
      for(var3 = 0; ia_._K._n.length > var3; ++var3) {
         ia_._K._n[var3] = 5120;
         ia_._K._s[var3] = 4096;
         var4 = ia_._K._c;
         ia_._K._h[var3] = 0;
         var4[var3] = 0;
         ia_._K._j[var3] = 3840;
         ia_._K._f[var3] = 5120;
         ia_._K._q[var3] = 2880;
         ia_._K._x[var3] = 3840;
         var6 = ia_._K._A;
         ia_._K._e[var3] = 5120;
         var6[var3] = 5120;
         var8 = ia_._K._y;
         ia_._K._m[var3] = 3840;
         var8[var3] = 3840;
      }

      ia_._K._y[8] = 2560;
      ia_._K._m[8] = 3200;
      ia_._K._j = this.a165(new int[]{-160, 160, 0, 42, ia_._K._j[4], ia_._K._j[5], -120, -18, -18}, false);
      ia_._K._q = this.a385(false, new int[]{-120, -120, -120, -9, ia_._K._q[4], ia_._K._q[5], -70, 2, 2});

      for(var3 = 0; ia_._K._n.length > var3; ++var3) {
         ia_._K._n[var3] = 5120;
         ia_._K._s[var3] = 4096;
      }

      int[] var13 = ia_._K._n;
      var4 = ia_._K._n;
      int[] var5 = ia_._K._s;
      ia_._K._s[5] = 4096;
      var5[4] = 4096;
      var4[5] = 4096;
      var13[4] = 4096;
      var6 = ia_._K._c;
      int[] var7 = ia_._K._c;
      var8 = ia_._K._h;
      ia_._K._h[5] = 0;
      var7[5] = 0;
      var8[4] = 0;
      var6[4] = 0;
      int var9 = 600 * (-ia_._K._z[4] + ia_._K._d[4]) / (ia_._K._d[5] - ia_._K._z[4]);
      ia_._K._j[4] = 0;
      ia_._K._f[4] = ia_._K._j[5] = -var9 << 4;
      ia_._K._f[5] = -9600;
      int[] var10 = ia_._K._q;
      int[] var11 = ia_._K._q;
      ia_._K._x[5] = 3840;
      int[] var12 = ia_._K._x;
      var12[4] = 3840;
      var11[5] = 3840;
      ia_._K._w = 0;
      var10[4] = 3840;
      cm_.a494(0.0F, 0.0F, -7788, 0.1F, 0.0F);
      t_.a124(1048576, jd_._o, false);
   }

   static final void a522(Component var0, int var1) {
      var0.removeKeyListener(in_._C);
      var0.removeFocusListener(in_._C);
      ia_._M = var1;
   }
}
