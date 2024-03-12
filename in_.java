import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.net.URL;

abstract class in_ extends kg_ {
   private int _r;
   String _p;
   private int _q;
   static og_ _C = new og_();
   private int _z;
   private boolean _u;
   private int _F;
   static boolean _E;
   private int _x;
   private boolean _s;
   private long _A;
   static pp_ _y;
   private boolean _v;
   private int _w;
   static cn_ _D;
   static int[] _B = new int[]{2, 13, 14, 8, 28, 7, 11};
   static String _t = "Nimble even by the standards of his dexterous race, the saurus slink can dodge traps and attacks with equal ease.";

   private final void a048(String var1, int var2, boolean var3, int var4, int var5) {
      try {
         if (!this.hostNameCheck(-126)) {
            return;
         }

         this._p = this.getCodeBase().getHost();
         String var6 = this._p.toLowerCase();
         if (!var3) {
            return;
         }

         this._u = var6.equals("jagex.com") || var6.endsWith(".jagex.com");
         this._z = Integer.parseInt(this.getParameter("gameport1"));
         this._F = Integer.parseInt(this.getParameter("gameport2"));
         String var7 = this.getParameter("servernum");
         if (var7 != null) {
            this._r = Integer.parseInt(var7);
         }

         this._w = Integer.parseInt(this.getParameter("gamecrc"));
         this._A = Long.parseLong(this.getParameter("instanceid"));
         this._s = this.getParameter("member").equals("yes");
         String var8 = this.getParameter("lang");
         if (var8 != null) {
            this._x = Integer.parseInt(var8);
         }

         if (this._x >= 5) {
            this._x = 0;
         }

         String var9 = this.getParameter("affid");
         if (null != var9) {
            this._q = Integer.parseInt(var9);
         }

         f_._d = Boolean.valueOf(this.getParameter("simplemode"));
         this.a248(32, (byte)107, var1, var5, var2, var4, this._w);
      } catch (Exception var10) {
         sm_.a741(var10, 1, (String)null);
         this.a407((byte)-112, "crash");
      }

   }

   final void g423(byte var1) {
      if (var1 == 2) {
         if (vk_.a154()) {
            this.a954(false, null != cm_._R, false);
         } else if (dk_._c >= 10) {
            if (l_.a491()) {
               if (kh_._n == 0) {
                  this.a954(false, false, false);
               } else {
                  td_.a093(pj_._r, var1 + 119);
               }
            } else {
               dh_.b150();
            }
         }

      }
   }

   public static void e150(int var0) {
      _C = null;
      _t = null;
      _D = null;
      _y = null;
      _B = null;
      if (var0 != -1) {
         e150(-36);
      }

   }

   static final int a080(int var0) {
      var0 = (1431655765 & var0 >>> 1) + (var0 & 1431655765);
      var0 = (var0 >>> 2 & -1288490189) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return 255 & var0;
   }

   final int b880(byte var1, boolean var2) {
      if (var1 != 82) {
         this.g137(12);
      }

      return this.a954(false, var2, true);
   }

   final void a356(boolean var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Frame var9 = new Frame("Jagex");
      var9.pack();
      var9.dispose();
      this.setBackground(Color.black);
      hc_._d = this._x;
      ae_.a093(hc_._d, -5);
      dj_.a134(var2, 5000, this._A, this._z, this._p, this._w, hc_._d, this._F, this._r, this._s, var7, var1, (byte)-27, i_._A);
      an_.a581(this._r, this._F, this._z, this._p, hc_._d, this._w, var2, i_._A);
      uf_.a150(var7 ^ 5031);
      bn_._j = pm_.a864();
      uk_.a762(c_._h);
      mh_._a = var6;
      s_._a = var8;
      bh_._P = var3;
      pm_._m = var4;
      sp_._h = var5;
      this.e423((byte)68);
      ch_.a423();
   }

   final int f410(byte var1) {
      int var2 = this.g137(11);
      if (var1 < 86) {
         this.g137(-68);
      }

      if (0 == var2 || var2 == 1) {
         if (pj_._w[1]) {
            f_.a366(2);
         }

         if (pj_._w[2]) {
            fl_.a556(3);
         }

         if (pj_._w[3]) {
            ep_.a556(4);
         }

         if (pj_._w[4]) {
            ko_.a540(5);
         }

         if (pj_._w[5]) {
            ol_.a093(8, 6);
         }

         if (pj_._w[6]) {
            tc_.a366(7, (byte)-112);
         }

         if (pj_._w[8]) {
            hj_.g150();
         }
      }

      return var2;
   }

   private final void e423(byte var1) {
      uo_._c[2] = -2;
      uo_._c[13] = -1;
      uo_._c[5] = -1;
      uo_._c[7] = -1;
      uo_._c[11] = -1;
      uo_._c[10] = -1;
      uo_._c[12] = -1;
      uo_._c[16] = -1;
      uo_._c[1] = 16;
      uo_._c[9] = -1;
      uo_._c[18] = 1;
      if (var1 != 68) {
         this._A = -61L;
      }

      uo_._c[17] = -1;
      uo_._c[8] = -2;
      uo_._c[6] = -2;
      uo_._c[3] = -1;
      uo_._c[4] = -1;
   }

   static final void a050(int var0, int var1, int var2, int var3, int var4) {
      int var5 = var2 + var0;
      int var6 = var3 + var1;
      int var7 = gf_._j < var0 ? var0 : gf_._j;
      int var8 = var3 <= gf_._f ? gf_._f : var3;
      int var9 = gf_._h <= var5 ? gf_._h : var5;
      int var10 = var6 < gf_._e ? var6 : gf_._e;
      int var11;
      int var12;
      if (gf_._j <= var0 && gf_._h > var0) {
         var11 = var8 * gf_._i + var0;
         var12 = var10 + (1 - var8) >> 1;

         while(true) {
            --var12;
            if (0 > var12) {
               break;
            }

            gf_._b[var11] = 16777215;
            var11 += 2 * gf_._i;
         }
      }

      if (var4 == 1) {
         if (gf_._f <= var3 && gf_._e > var6) {
            var11 = var3 * gf_._i + var7;
            var12 = -var7 + 1 + var9 >> 1;

            while(true) {
               --var12;
               if (var12 < 0) {
                  break;
               }

               gf_._b[var11] = 16777215;
               var11 += 2;
            }
         }

         if (gf_._j <= var5 && var5 < gf_._h) {
            var11 = (var8 + (1 & var5 - var0)) * gf_._i + var5;
            var12 = var10 + 1 - var8 >> 1;

            while(true) {
               --var12;
               if (var12 < 0) {
                  break;
               }

               gf_._b[var11] = 16777215;
               var11 += 2 * gf_._i;
            }
         }

         if (gf_._f <= var3 && gf_._e > var6) {
            var11 = var7 + var6 * gf_._i + (-var3 + var6 & 1);
            var12 = -var7 + var9 + 1 >> 1;

            while(true) {
               --var12;
               if (var12 < 0) {
                  break;
               }

               gf_._b[var11] = 16777215;
               var11 += 2;
            }
         }

      }
   }

   final void d487(boolean var1) {
      int var2 = hc_._c;
      if (var2 < 64 && pj_._w[var2]) {
         if (!var1) {
            this._s = false;
         }

         if (0 != var2) {
            if (1 == var2) {
               lg_.a150();
            } else if (var2 != 2) {
               if (3 == var2) {
                  pk_.d150();
               } else if (var2 == 4) {
                  hd_.a487(!var1);
               } else if (5 == var2) {
                  rm_.q150(-5705);
               } else if (6 != var2) {
                  if (7 == var2) {
                     this.f150(8);
                  } else if (8 == var2) {
                     hb_.a245(ra_._c, i_._A, nj_._b);
                  } else if (var2 == 16) {
                     ih_.a423((byte)59);
                  } else if (11 != var2 && 12 != var2) {
                     if (var2 != 13) {
                        if (17 == var2) {
                           this.d150(-28859);
                        } else if (18 == var2) {
                           rc_.c150();
                        } else {
                           sm_.a741((Throwable)null, 1, "MGS1: " + sj_.l738(192));
                           tl_.a150(124);
                        }
                     } else {
                        lf_.d423((byte)123);
                     }
                  } else {
                     la_ var3 = d_.a627(var2 == 12);
                     jm_.a315(var3, (byte)116);
                  }
               } else {
                  bf_.b150(19664);
               }
            } else {
               ui_.a150(30592);
            }

         }
      } else {
         sm_.a741((Throwable)null, 1, "MGS2: " + sj_.l738(192));
         tl_.a150(-48);
      }
   }

   private final void d150(int var1) {
      if (var1 != -28859) {
         this.f410((byte)39);
      }

      int var2 = ra_._c.c474(true);
      boolean var3 = 0 != (var2 & 1);
      int var4 = nj_._b - 1;
      byte[] var5 = new byte[var4];
      ra_._c.a596(0, (byte)95, var4, var5);
      oe_.a188(var3, m_.c372(true), dj_.a064(var5, false));
   }

   private final int a954(boolean var1, boolean var2, boolean var3) {
      if (var1) {
         this.a954(false, false, false);
      }

      int var4 = o_.a681(hc_._d, var2, pj_._r);
      if (0 == var4) {
         throw new IllegalStateException();
      } else {
         int var5;
         if (var4 == 1) {
            var5 = qh_.a602(var1, ln_.a683((byte)-120), om_.a059(!var1));
            if (-1 != var5) {
               ri_.a392(tp_._v, mf_._c, var5);
               mf_._c = null;
               tp_._v = null;
            }

            Boolean var6 = fb_.a252();
            if (var6 != null) {
               ig_.a430(var6);
            }
         }

         if (var4 == 2) {
            var5 = qm_.a581(this._q, rn_.a137(), tp_.c427(), em_.e738(7142), vl_.c738(-29455), 57, co_.e983());
            if (-1 != var5) {
               gj_.a324(var5, mf_._c, tp_._v);
               tp_._v = null;
               mf_._c = null;
            }
         }

         if (3 == var4) {
            if (gm_._c != -1 && 0 != gm_._c) {
               gm_._c = -1;
               en_.a423();
            }

            if (!var3) {
               var5 = bh_.a312(this._u, em_.e738(7142), this._q, false, vl_.c738(-29455));
               if (var5 != -1) {
                  if (var5 != 0) {
                     nf_.a096(var5, tp_._v);
                     tp_._v = null;
                  } else {
                     ne_._g = hg_._s;
                     bl_.b423();
                     kh_._n = 10;
                     tl_._l = false;
                  }
               }
            } else {
               hh_._c = false;
            }
         }

         if (4 == var4) {
            if (ld_._g) {
               pd_.a587(5189, m_.c372(true));
            } else {
               tl_._l = true;
               kh_._n = 10;
            }
         }

         if (5 == var4) {
            eg_.a812(m_.c372(true));
         }

         if (6 == var4 && oj_._b) {
            kh_._n = 10;
         }

         if (var4 == 7) {
            pa_.a587(123, m_.c372(true));
         }

         if (8 == var4) {
            pd_.a587(5189, m_.c372(!var1));
         }

         if (9 == var4) {
            jl_.a262(m_.c372(true));
         }

         if (10 == var4) {
            ac_._B.d556((byte)-90, 17);
         }

         if (var4 == 11) {
            fk_.a587(84, m_.c372(true));
         }

         if (var4 == 12) {
            oe_.a808(ao_.a738(), m_.c372(true));
         }

         if (13 == var4) {
            try {
               if (null == hl_._i) {
                  hl_._i = new tl_(i_._A, new URL(this.getCodeBase(), "countrylist.ws"), 5000);
               }

               boolean var9 = hl_._i.d154(34);
               if (var9) {
                  ec_ var10 = hl_._i.c735(3);
                  if (var10 != null) {
                     String var7 = mk_.a046(var10._m, var10._o, 0);
                     rg_.a984(15, var7);
                  } else {
                     rg_.a984(15, (String)null);
                  }

                  hl_._i = null;
               }
            } catch (Exception var8) {
               sm_.a741(var8, 1, "S1");
               rg_.a984(15, (String)null);
               hl_._i = null;
            }
         }

         if (var4 == 15) {
            kh_._n = 10;
         }

         if (16 != var4) {
            return 17 == var4 ? 2 : 0;
         } else {
            return 1;
         }
      }
   }

   private final void f150(int var1) {
      if (var1 == 8) {
         String var2 = eg_.a738();
         sm_.a715(m_.c372(true), var2);
      }
   }

   final void a013(int var1, String var2, int var3) {
      if (var3 == 0) {
         this.a048(var2, 640, true, var1, 480);
      }
   }

   protected in_() {
   }

   final void a813(boolean var1, byte var2) {
      if (null != il_._c) {
         if (cm_._R == null) {
            Container var3 = ua_.a332(0);
            Dimension var4 = var3.getSize();
            il_._c.a773(var4.height, true, var4.width);
         }

         il_._c.e150(6731);
      }

      bp_.b150(94);
      ke_.b150(var2 + 74);
      if (var2 != -74) {
         this._q = -128;
      }

      if (!ao_.a427() && kh_._n != 11) {
         cp_.f150(-30208);
      }

      if (bn_._j != null) {
         pj_._r = bn_._j.a137(6);
      }

      if (dh_.a427()) {
         int var5 = 1200 * eg_.c137();
         if (this._v || ib_.b410() > var5 && var5 < mn_.a410()) {
            this._v = false;
            tl_.a150(122);
            l_.a150(var2 + 73);
            nf_.a096(2, sj_._V);
            ql_.a423();
            hh_._c = true;
            ab_._a = 15000L + kd_.c138(-2456);
         }
      }

      boolean var6;
      if (gm_._c == -1 || gm_._c == 0) {
         var6 = gm_._c == -1;
         gm_._c = fp_.a410();
         if (var6 && 0 == gm_._c && 11 == kh_._n && !dm_.c154(var2 - 7)) {
            bl_.b423();
         }

         if (gm_._c != -1 && 0 != gm_._c) {
            ab_._a = 15000L + kd_.c138(var2 ^ 2526);
         }
      }

      if (-1 != gm_._c && 0 != gm_._c) {
         if (10 > dk_._c) {
            if (3 != gm_._c) {
               if (gm_._c != 4) {
                  if (2 == gm_._c) {
                     this.a407((byte)-112, "js5connect_full");
                  } else if (gm_._c == 5) {
                     this.a407((byte)-112, "outofdate");
                  } else {
                     this.a407((byte)-112, "js5connect");
                  }
               } else {
                  this.a407((byte)-112, "js5io");
               }
            } else {
               this.a407((byte)-112, "js5crc");
            }
         } else if (10 <= kh_._n) {
            l_.a150(var2 + 73);
            if (3 == gm_._c) {
               nf_.a096(256, ck_._D);
            } else if (gm_._c != 4) {
               if (gm_._c != 2) {
                  if (gm_._c == 5) {
                     nf_.a096(5, ed_._W);
                  } else {
                     nf_.a096(256, b_._b);
                  }
               } else {
                  nf_.a096(256, ul_._b);
               }
            } else {
               nf_.a096(256, sf_._e);
            }

            hh_._c = true;
         }
      }

      if ((-1 != gm_._c && 0 != gm_._c || dm_.c154(var2 - 43)) && kd_.c138(var2 - 2382) >= ab_._a) {
         hh_._c = false;
         if (-1 != gm_._c && 0 != gm_._c) {
            gm_._c = -1;
            en_.a423();
         }
      }

      if (0 == gm_._c && !dm_.c154(-125)) {
         u_._O = false;
      }

      if (0 == dk_._c && ln_.a154()) {
         dk_._c = 1;
      }

      if (dk_._c == 1) {
         if (hc_._d != 0) {
            ia_._U = mk_.a923(mh_._a, (byte)34);
         }

         fi_._u = qd_.a854(false, true, s_._a, (byte)-31, 1);
         kg_._b = qd_.a854(false, true, pm_._m, (byte)-31, 1);
         ib_._b = qd_.a854(false, true, sp_._h, (byte)-31, 1);
         dk_._c = 2;
         gh_._c = kg_._b;
         uc_._I = fi_._u;
      }

      if (dk_._c == 2) {
         if (null != ia_._U && ia_._U.a154(var2 - 14280)) {
            if (!ia_._U.c896("", var2 ^ -74)) {
               ia_._U = null;
            } else if (ia_._U.a213(false, "")) {
               ng_.a253(var2 ^ 27014, ia_._U);
               ia_._U = null;
               nf_.d150(0);
            }
         }

         if (ia_._U == null) {
            dk_._c = 3;
         }
      }

      if (dk_._c == 3 && ql_.a726(kg_._b, ib_._b, fi_._u) && fl_.a249(ib_._b)) {
         jm_.a487();
         am_.b150();
         lj_._e = bg_._t;
         oj_._b = false;
         h_.a039(var2 ^ -8099, fi_._u, ib_._b, ld_._g, kg_._b);
         if (np_._D || null != mi_._d) {
            hd_.a164(8192, !np_._D, mi_._d, !np_._D);
         }

         if (f_._d) {
            kd_.a150(4);
         }

         if (je_._c == null) {
            je_._c = fb_.b135();
            tb_._g = ab_.a410();
         }

         nh_.a541(ib_._b, je_._c, tb_._g);
         ib_._b = null;
         fi_._u = null;
         kg_._b = null;
         qj_.a326(this, (byte)89);
         nf_.d150(0);
         dk_._c = 10;
      }

      if (dk_._c == 10) {
         if (hc_._d != 0) {
            ec_._k = mk_.a923(bh_._P, (byte)34);
         }

         dk_._c = 11;
      }

      if (11 == dk_._c) {
         if (null != ec_._k && (!ec_._k.a154(-14354) || !ec_._k.a427((byte)59))) {
            tp_.a132(10, 0.0F, lk_.a278(ki_._c, ec_._k, ec_._r));
         } else {
            ld_._i = true;
            dk_._c = 12;
         }
      }

      if (dk_._c == 12 && !ld_._i) {
         dk_._c = 13;
      }

      if (dk_._c == 13) {
         var6 = true;
         if (be_._s != null) {
            var6 = be_._s.a491(false);
            tp_.a132(10, be_._s._j, be_._s._b);
         }

         if (var6) {
            dk_._c = 20;
         }
      }

      if (!var1 && ve_._a) {
         pd_.a035(c_._h);
         this.d423((byte)121);
         uk_.a762(c_._h);
      }

      if (pj_._w[8]) {
         ta_.b150();
      }

   }

   private final int g137(int var1) {
      if (var1 != 11) {
         return 24;
      } else if (super._i) {
         return -1;
      } else if (dm_.c154(-118)) {
         if (hh_._c) {
            return -1;
         } else {
            int var2 = bh_.a312(this._u, em_.e738(7142), this._q, true, vl_.c738(-29455));
            if (var2 != -1) {
               if (0 != var2 && var2 != 1) {
                  if (!rm_._P) {
                     this.a407((byte)-112, "reconnect");
                  }

                  l_.a150(-1);
                  nf_.a096(var2, tp_._v);
                  hh_._c = true;
                  ab_._a = 15000L + kd_.c138(-2456);
                  return var2;
               } else {
                  if (kh_._n == 11 && gm_._c == 0) {
                     bl_.b423();
                  }

                  return var2;
               }
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }

   final void b813(boolean var1, byte var2) {
      pj_._w[16] = true;
      if (var2 >= -33) {
         this._F = 36;
      }

      pj_._w[7] = true;
      pj_._w[18] = true;
      pj_._w[3] = true;
      pj_._w[8] = var1;
      pj_._w[17] = true;
      pj_._w[0] = true;
   }
}
