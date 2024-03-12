import java.applet.Applet;
import java.lang.reflect.Method;
import java.net.URL;

final class eg_ {
   private int _a;
   static String _f = "Detect";
   static String[] _b = new String[]{"Monster", "<%highlight>You have encountered a Monster in this room!</col> The statistics of a room are displayed in the bottom-right, opposite your raider's. These statistics are slightly different from those of a raider: <%attack>, <%defence>, <%snare> and <%detect>. A <%monster>, such as <%lastroom>, will usually have high <%attack> and <%defence>."};
   private dh_ _c;
   private int _e;
   private qi_ _h;
   static String _g = "<%col_detect>Detect +2 to all monsters.</col>";
   static int _d;

   final Object a532(int var1, long var2) {
      wf_ var4 = (wf_)this._h.a808(1, var2);
      if (null != var4) {
         if (var1 > -2) {
            return (Object)null;
         } else {
            Object var5 = var4.d092(22698);
            if (null != var5) {
               if (!var4.c427((byte)21)) {
                  this._c.a520(var4, false);
                  var4._o = 0L;
               } else {
                  pb_ var6 = new pb_(var5, var4._A);
                  this._h.a957(var4._h, (byte)-128, var6);
                  this._c.a520(var6, false);
                  var6._o = 0L;
                  var4.a487(false);
                  var4.b423((byte)-2);
               }

               return var5;
            } else {
               var4.a487(false);
               var4.b423((byte)-2);
               this._e += var4._A;
               return null;
            }
         }
      } else {
         return null;
      }
   }

   static final String a738() {
      return ra_._c.d738(-104);
   }

   static final int c137() {
      return (int)(1000000000L / hk_._e);
   }

   static long a833(long var0, long var2) {
      return var0 & var2;
   }

   static final void a987(int var0, int var1, int var2, cn_ var3, int var4, int var5, int var6, se_ var7, int var8) {
      ig_._a = var4;
      e_._d = var8;
      wm_._b = var0;
      md_._f = var6;
      cb_._b = var2;
      je_._b = var1;
      qc_._z = var3;
      lj_._m = var5;
   }

   private final void a157(long var1, byte var3) {
      if (var3 != -110) {
         this._h = (qi_)null;
      }

      wf_ var4 = (wf_)this._h.a808(1, var1);
      this.a049(var4, (byte)85);
   }

   private final void a049(wf_ var1, byte var2) {
      if (null != var1) {
         var1.a487(false);
         var1.b423((byte)-2);
         this._e += var1._A;
      }

   }

   private eg_() throws Throwable {
      throw new Error();
   }

   public static void d150(int var0) {
      _b = null;
      if (var0 == -23658) {
         _g = null;
         _f = null;
      }
   }

   static final String a793(String var0, String var1, String var2, boolean var3) {
      int var4 = var0.indexOf(var1);
      if (!var3) {
         b150(-74);
      }

      while(var4 != -1) {
         var0 = var0.substring(0, var4) + var2 + var0.substring(var4 + var1.length());
         var4 = var0.indexOf(var1, var2.length() + var4);
      }

      return var0;
   }

   static final void b150(int var0) {
      try {
         Method var1 = Runtime.class.getMethod("maxMemory");
         if (null != var1) {
            try {
               Runtime var2 = Runtime.getRuntime();
               Long var3 = (Long)var1.invoke(var2, (Object[])null);
               sj_._bb = 1 + (int)(var3 / 1048576L);
            } catch (Throwable var4) {
            }
         }

         if (var0 <= 74) {
            d150(92);
         }
      } catch (Exception var5) {
      }

   }

   static final void a812(Applet var0) {
      try {
         URL var1 = new URL(var0.getCodeBase(), "quit.ws");
         var0.getAppletContext().showDocument(j_.a550(var1, var0), "_top");
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   static final boolean a102(bo_ var0, int var1, bo_ var2) {
      if (var1 != 200) {
         b150(47);
      }

      int var3 = -var2._Ib + var0._Ib;
      if (var0._Nb == gm_._b) {
         var3 -= 200;
      } else if (var0._Nb == null) {
         var3 += 200;
      }

      if (var2._Nb != gm_._b) {
         if (var2._Nb == null) {
            var3 -= 200;
         }
      } else {
         var3 += 200;
      }

      return var3 > 0;
   }

   final void a577(boolean var1, Object var2, long var3) {
      this.a370(var2, 1, (byte)-123, var3);
      if (!var1) {
         a793((String)null, (String)null, (String)null, false);
      }

   }

   static final void a537(md_ var0) {
      rj_ var1 = to_.a777(hj_._S, eh_._h, var0, 0);
      if (wi_._ob != var1) {
         if (null != wi_._ob) {
            wi_._ob._p = mo_._a;
         }

         wi_._ob = var1;
         if (wi_._ob != null) {
            wi_._ob._m = mo_._a;
         }
      }

      if (1 != no_._d) {
         if (la_._g == 1) {
            ++um_._h;
            if (np_._M == null) {
               int var2 = (rn_._a - eh_._h) * (rn_._a - eh_._h) + (-hj_._S + kp_._c) * (-hj_._S + kp_._c);
               if (var2 > 5 && 5 < um_._h) {
                  np_._M = pa_._c;
               }
            }

            if (null != np_._M) {
               np_._M.d326(-np_._M._t + hj_._S, 128, -np_._M._i + eh_._h);
            }
         } else {
            if (np_._M != null && 5 <= um_._h) {
               hh_._s = null;
            } else {
               hh_._s = pa_._c;
               if (null != hh_._s) {
                  hh_._s.a789(-hh_._s._i + eh_._h, (byte)-98, -hh_._s._t + hj_._S);
               }
            }

            np_._M = null;
            pa_._c = null;
         }
      } else {
         um_._h = 0;
         kp_._c = lc_._c;
         rn_._a = hm_._k;
         pa_._c = to_.a777(lc_._c, hm_._k, var0, 0);
      }

      if (pj_._r != 0 && null != wi_._ob) {
         wi_._ob.a093(1, pj_._r);
      }

   }

   private final void a370(Object var1, int var2, byte var3, long var4) {
      if (this._a < var2) {
         throw new IllegalStateException();
      } else {
         this.a157(var4, (byte)-110);
         this._e -= var2;
         if (var3 >= -28) {
            a793((String)null, (String)null, (String)null, true);
         }

         while(0 > this._e) {
            wf_ var6 = (wf_)this._c.b162(true);
            this.a049(var6, (byte)120);
         }

         pb_ var7 = new pb_(var1, var2);
         this._h.a957(var4, (byte)-128, var7);
         this._c.a520(var7, false);
         var7._o = 0L;
      }
   }
}
