import java.io.IOException;

final class op_ {
   static nn_ _d;
   static String _a = "Orb points: ";
   static String _b = "Dark Elf Assassin";
   static int[] _c;

   static final void a093(int var0, int var1) {
      if (null != sp_._c && (0 > var1 || pd_._A == qa_._c)) {
         if (var0 == ac_._B._o && kd_.c138(-2456) > 10000L + wh_._e) {
            ac_._B.d556((byte)-91, var1);
         }

         if (0 < ac_._B._o) {
            try {
               sp_._c.b120(ac_._B._m, false, 0, ac_._B._o);
               wh_._e = kd_.c138(-2456);
            } catch (IOException var3) {
               tl_.a150(117);
            }

            ac_._B._o = 0;
         }

      } else {
         ac_._B._o = 0;
      }
   }

   static final int a489(cd_ var0, int var1, int var2, cd_ var3, String var4, int var5, boolean var6) {
      if (var5 > -47) {
         a093(3, -113);
      }

      String var7 = var0.b738(-1);
      String var8 = var3.b738(-1);
      if (null == sp_._c) {
         boolean var9 = rj_.a897((byte)83, false);
         if (!var9) {
            return -1;
         }
      }

      int var10;
      int var13;
      if (no_._c == pd_._A) {
         fj_._e = null;
         ac_._B._o = 0;
         if (null == var4) {
            ta_._c._o = 0;
            ta_._c.a556((byte)63, bl_._i.nextInt());
            ta_._c.a556((byte)63, bl_._i.nextInt());
            ta_._c.a984(2, var0.a427((byte)-102) ? var7 : "");
            ta_._c.a984(2, !var3.a427((byte)123) ? "" : var8);
            ac_._B.a093(6, 16);
            ++ac_._B._o;
            var13 = ac_._B._o;
            of_.a673(ac_._B, kd_._d, om_._c, ta_._c);
            ac_._B.c093(ac_._B._o - var13, -1);
         } else {
            var13 = 0;
            if (var6) {
               var13 |= 1;
            }

            ta_._c._o = 0;
            ta_._c.a556((byte)63, bl_._i.nextInt());
            ta_._c.a556((byte)63, bl_._i.nextInt());
            ta_._c.a984(2, var7);
            ta_._c.a984(2, var8);
            ta_._c.a984(2, qf_.a034(var4));
            ta_._c.i093(var1, -86);
            ta_._c.a093(6, var2);
            ta_._c.a093(6, var13);
            ac_._B.a093(6, 18);
            wj_ var10000 = ac_._B;
            var10000._o += 2;
            var10 = ac_._B._o;
            String var11 = oj_.a326(m_.c372(true));
            if (var11 == null) {
               var11 = "";
            }

            ac_._B.b627(var11, (byte)-20);
            of_.a673(ac_._B, kd_._d, om_._c, ta_._c);
            ac_._B.b093(-var10 + ac_._B._o, 1);
         }

         a093(0, -1);
         pd_._A = kp_._b;
      }

      if (pd_._A == kp_._b && oi_.a097(-12929, 1)) {
         var13 = ra_._c.c474(true);
         ra_._c._o = 0;
         if (var13 >= 100 && 105 >= var13) {
            pd_._A = jg_._a;
            mf_._c = new String[var13 - 100];
         } else {
            if (248 == var13) {
               np_.a812((byte)-126, m_.c372(true));
               tp_._v = m_._f;
               tl_.a150(-84);
               nh_._e = false;
               return var13;
            }

            if (99 != var13) {
               nj_._b = -1;
               hc_._c = var13;
               pd_._A = sd_._G;
            } else {
               oi_.a097(-12929, la_.a137());
               fj_._e = new Boolean(fm_.a599(ra_._c));
               ra_._c._o = 0;
            }
         }
      }

      if (pd_._A == jg_._a) {
         byte var14 = 2;
         if (oi_.a097(-12929, var14)) {
            var10 = ra_._c.k137(0);
            ra_._c._o = 0;
            if (oi_.a097(-12929, var10)) {
               int var16 = mf_._c.length;

               for(int var12 = 0; var16 > var12; ++var12) {
                  mf_._c[var12] = ra_._c.a738(-21030);
               }

               tl_.a150(-60);
               nh_._e = false;
               return var16 + 100;
            }
         }
      }

      if (pd_._A == sd_._G && kh_.d427()) {
         if (hc_._c == 255) {
            String var15 = ra_._c.b791(true);
            if (null != var15) {
               jb_.a674(var15, m_.c372(true));
            }
         } else {
            tp_._v = ra_._c.d738(-101);
         }

         tl_.a150(-59);
         nh_._e = false;
         return hc_._c;
      } else {
         if (null == sp_._c) {
            if (nh_._e) {
               if (30000L < b_.a138()) {
                  tp_._v = lh_._r;
               } else {
                  tp_._v = fc_._l;
               }

               nh_._e = false;
               return 249;
            }

            var13 = an_._E;
            an_._E = l_._b;
            nh_._e = true;
            l_._b = var13;
         }

         return -1;
      }
   }

   public static void a423() {
      _d = null;
      _c = null;
      _a = null;
      _b = null;
   }
}
