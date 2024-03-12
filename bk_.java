import java.io.IOException;
import java.net.Socket;

final class bk_ implements Runnable {
   volatile vn_[] _g = new vn_[2];
   static hd_ _b;
   static String[] _f = new String[]{null, "<%guardians> require a raider either to <%dodge> (testing against the room's <%snare>), or, more commonly, <%sneak> (against the room's <%detect>)"};
   static String _c = "Type your email address again to make sure it's correct";
   static ph_ _e;
   qg_ _h;
   volatile boolean _d = false;
   volatile boolean _a = false;

   public static void a487(boolean var0) {
      if (var0) {
         b738(89);
      }

      _c = null;
      _b = null;
      _e = null;
      _f = null;
   }

   static final String b738(int var0) {
      if (var0 != 1) {
         _e = (ph_)null;
      }

      return !ti_._f && no_._a >= lp_._z && lp_._z + ga_._p > no_._a ? vj_._c : null;
   }

   static final int a137(int var0) {
      if (4 <= hb_._a._h) {
         if (-1 != hb_._a._c) {
            return hb_._a._c != -2 ? 1 : 4;
         } else {
            return 3;
         }
      } else {
         try {
            if (ba_._f == 0) {
               qi_._e = kn_._f.a288(var0 ^ -119, lk_._T, of_._d);
               ++ba_._f;
            }

            if (ba_._f == 1) {
               if (qi_._e._c == 2) {
                  return dl_.a080(-5, -1);
               }

               if (qi_._e._c == 1) {
                  ++ba_._f;
               }
            }

            if (ba_._f == 2) {
               pe_._l = new rk_((Socket)qi_._e._f, kn_._f);
               ec_ var1 = new ec_(13);
               rg_.a924(ri_._b, var1, pj_._a, var0 + 127, j_._J);
               var1.a093(6, 15);
               var1.a556((byte)63, ng_._I);
               pe_._l.b120(var1._m, false, 0, 13);
               ++ba_._f;
               ce_._s = kd_.c138(var0 - 2456) + 30000L;
            }

            if (ba_._f == 3) {
               if (0 < pe_._l.a137(0)) {
                  int var3 = pe_._l.a410((byte)-108);
                  if (0 != var3) {
                     return dl_.a080(-5, var3);
                  }

                  ++ba_._f;
               } else if (kd_.c138(-2456) > ce_._s) {
                  return dl_.a080(var0 - 5, -2);
               }
            }

            if (var0 != 0) {
               _f = (String[])null;
            }

            if (ba_._f == 4) {
               hb_._a.a993(pe_._l, kn_._c, (byte)118);
               pe_._l = null;
               ba_._f = 0;
               qi_._e = null;
               return 0;
            } else {
               return -1;
            }
         } catch (IOException var2) {
            return dl_.a080(-5, -3);
         }
      }
   }

   static final void a093(int var0, int var1) {
      int var2 = 0;
      int var3 = nl_._d;
      if (var3 >= 5) {
         if (105 <= var3) {
            if (var3 < 120) {
               var3 = -var3 + 120;
               var2 = -(var3 * var3 * 8192 / 3300) + 8192;
            }
         } else {
            var2 = (var3 * 16384 - 'ꀀ') / 220;
         }
      } else {
         var2 = 8192 * var3 * var3 / 1100;
      }

      byte var4 = 1;
      byte var5 = 0;
      if (var1 == 1) {
         var5 = 1;
      }

      if (var1 == 3) {
         var4 = -1;
      }

      if (4 == var1) {
         var4 = 1;
         var5 = 1;
      }

      if (5 == var1) {
         var4 = -1;
         var5 = 1;
      }

      if (var1 == 6) {
         var4 = 1;
         var5 = -1;
      }

      if (var1 == var0 || var1 == 8) {
         var5 = -1;
         var4 = -1;
      }

      if (var1 == 11) {
         var4 = -1;
      }

      if (12 == var1) {
         var5 = -1;
         var4 = -1;
      }

      if (var1 == 13) {
         var5 = -1;
         var4 = 1;
      }

      if (14 == var1) {
         var4 = -1;
         var5 = 1;
      }

      if (var1 == 15) {
         var5 = 1;
         var4 = 1;
      }

      pj_._e = vf_.a867(var5 * var2, var2 * var4);
   }

   public final void run() {
      this._d = true;

      try {
         while(!this._a) {
            for(int var1 = 0; var1 < 2; ++var1) {
               vn_ var2 = this._g[var1];
               if (var2 != null) {
                  var2.a797();
               }
            }

            pj_.a054(0, 10L);
            ho_.a246(this._h, (Object)null);
         }
      } catch (Exception var6) {
         sm_.a741(var6, 1, (String)null);
      } finally {
         this._d = false;
      }

   }

   static final void a750(qk_ var0, int var1, int var2, int var3, qk_ var4) {
      ci_._j = var3;
      oh_._t = var2;
      om_._d = var4;
      gd_._G = var0;
      h_._q = var1;
   }
}
