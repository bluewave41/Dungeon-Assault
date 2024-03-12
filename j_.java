import java.applet.Applet;
import java.net.URL;

final class j_ extends ck_ {
   int _I;
   int _N;
   int _P;
   int _K;
   static String[] _S = new String[]{"Dark Arts", "The dark powers can be wielded by the <%0> equally well for both attack and defence. The <%0> can readjust the balance as she sees fit. (Single use)"};
   int _R;
   static en_ _Q;
   static String[] _O = new String[]{"<%0> of the Orb", "<%0> the Wise", "<%0> the Cunning", "<%0> the Potent", "<%0> the Mighty", "<%0>, Master of the Tower", "<%0> the Magnificent", "<%0> the Unbound"};
   static String[] _L = new String[]{"Showing by rating", "Showing by win percentage"};
   int _M;
   static int _J;

   final boolean a946(lm_ var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      if (!super.a946(var1, var2, var3, var4, var5, (byte)31, var7)) {
         return false;
      } else {
         int var9 = var5 + (-var4 - super._q - this._I);
         int var10 = var3 - var7 + (-super._v - this._R);
         if (this._M * this._M > var9 * var9 + var10 * var10) {
            double var11 = Math.atan2((double)var10, (double)var9) - jd_._j;
            if (var11 < 0.0) {
               var11 -= Math.PI / (double)this._N;
            } else if (0.0 < var11) {
               var11 += Math.PI / (double)this._N;
            }

            for(this._K = (int)((double)this._N * var11 / 6.283185307179586); this._N <= this._K; this._K -= this._N) {
            }

            while(this._K < 0) {
               this._K += this._N;
            }
         }

         return true;
      }
   }

   static final URL a550(URL var0, Applet var1) {
      String var2 = null;
      if (null != ql_._a && !ql_._a.equals(var1.getParameter("settings"))) {
         var2 = ql_._a;
      }

      String var3 = null;
      if (pa_._b != null && !pa_._b.equals(var1.getParameter("session"))) {
         var3 = pa_._b;
      }

      return ng_.a531(-1, 0, var3, var2, var0);
   }

   static final boolean a623(String var0) {
      char var1 = var0.charAt(0);

      for(int var2 = 1; var0.length() > var2; ++var2) {
         if (var0.charAt(var2) != var1) {
            return false;
         }
      }

      return true;
   }

   public static void g423() {
      _S = null;
      _Q = null;
      _O = null;
      _L = null;
   }

   static final void f423() {
      gj_.a226(new int[0], 0, 0, 1, 0, 1, 0, 1, 1, 1);
      gj_.a226(new int[0], 0, 0, 3, 0, 2, 100, 2, 1, 1);
      gj_.a226(new int[0], 1, 0, 4, 0, 2, 150, 1, 2, 1);
      gj_.a226(new int[0], -1, 0, 2, 0, 1, 200, 3, 1, 2);
      gj_.a226(new int[0], -1, 0, 13, 3500, 3, 300, 1, 4, 0);
      gj_.a226(new int[]{ob_._hc}, -1, 0, 7, 4500, 1, 350, 3, 3, 1);
      gj_.a226(new int[0], -1, 0, 6, 6500, 4, 400, 1, 1, 3);
      gj_.a226(new int[]{ob_._fc}, -1, 0, 5, 7500, 2, 500, 2, 3, 3);
      gj_.a226(new int[]{ob_._Jb}, -1, 1, 34, 10000, 1, 550, 2, 3, 4);
      gj_.a226(new int[]{ob_._Sb}, -1, 0, 17, 12500, 4, 600, 2, 4, 0);
      gj_.a226(new int[]{ob_._Wb}, 0, 1, 11, 14500, 1, 800, 5, 4, 2);
      gj_.a226(new int[0], -1, 1, 15, 16500, 3, 850, 4, 3, 4);
      gj_.a226(new int[]{ob_._Ib}, 1, 0, 16, 18500, 5, 900, 4, 3, 1);
      gj_.a226(new int[0], -1, 1, 8, 20000, 6, 1000, 1, 5, 1);
      gj_.a226(new int[0], 1, 1, 10, 21500, 7, 1100, 1, 1, 5);
      gj_.a226(new int[]{ob_._Hb}, -1, 0, 20, 23000, 3, 1150, 6, 3, 5);
      gj_.a226(new int[0], -1, 0, 24, 24500, 6, 1200, 1, 7, 0);
      gj_.a226(new int[]{ob_._Nb}, -1, -1, 12, 27500, 4, 1300, 2, 5, 4);
      gj_.a226(new int[0], -1, -1, 32, 29000, 7, 1400, 7, 4, 2);
      gj_.a226(new int[]{ob_._Mb}, -1, 0, 9, 31000, 5, 1450, 3, 5, 3);
      gj_.a226(new int[]{ob_._Gb}, -1, 0, 19, 33000, 3, 1500, 2, 4, 2);
      gj_.a226(new int[]{ob_._dc}, -1, 1, 28, 35000, 5, 1600, 5, 7, 0);
      gj_.a226(new int[]{ob_._Lb}, -1, 0, 25, 37500, 2, 1800, 8, 3, 8);
      gj_.a226(new int[]{ob_._pc}, -1, 1, 14, 40000, 1, 1900, 4, 6, 6);
      gj_.a226(new int[]{ob_._gc}, -1, 0, 21, 42500, 8, 2000, 7, 2, 0);
      gj_.a226(new int[]{ob_._jc}, -1, 1, 18, 45000, 4, 2100, 7, 7, 5);
      gj_.a226(new int[]{ob_._Ob, ob_._Qb}, -1, 1, 23, 47500, 10, 2200, 0, 0, 0);
      gj_.a226(new int[0], -1, -1, 26, 50000, 6, 2300, 6, 6, 6);
      gj_.a226(new int[]{ob_._mc}, -1, 0, 27, 52500, 8, 2400, 4, 9, 1);
      gj_.a226(new int[0], -1, 1, 22, 55000, 8, 2500, 5, 5, 9);
      gj_.a226(new int[]{ob_._Ub}, -1, 3, 29, 59000, 7, 2700, 2, 6, 2);
      gj_.a226(new int[]{ob_._bc}, -1, 2, 33, 63000, 6, 2800, 9, 6, 9);
      gj_.a226(new int[]{ob_._Vb}, -1, -1, 30, 67500, 9, 3000, 0, 9, 0);
      gj_.a226(new int[]{ob_._Zb, ob_._ec}, -1, 3, 31, 70000, 10, 5000, 10, 10, 10);
   }

   private j_() throws Throwable {
      throw new Error();
   }
}
