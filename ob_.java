import java.awt.Canvas;
import java.awt.Graphics;

final class ob_ extends ok_ {
   static int _hc = 1;
   static int _Sb = 20;
   static int _Qb = 12;
   static int _nc = 6;
   static int _dc = 15;
   static int _Lb = 13;
   static int _Hb = 10;
   static int _Gb = 22;
   static int _Zb = 18;
   static int _Ob = 11;
   static int _gc = 25;
   static int _ac = 28;
   static int[] _cc;
   static int _Ub = 16;
   static int _lc = 9;
   static int _Vb = 17;
   static String[] _oc = new String[]{"Fragility", "The strange chemicals the <%0> uses to fuel his mindless rage have their own cost; blows that would otherwise only stun a raider are always fatal to the <%0>."};
   static int _Mb = 2;
   static int _jc = 8;
   ok_ _ic;
   static int _bc;
   static int _kc = 7;
   static int _ec;
   static int _pc;
   static int _Ib = 21;
   static int _mc;
   static int _Nb;
   static int _Pb;
   static int _Jb;
   ok_ _Tb;
   static int _Wb;
   static int _fc;
   static char _Yb;
   static String _Kb;
   static String[] _Rb;
   static ug_ _Xb;

   static final void a578(cn_ var0, int var1, int var2, int var3, boolean var4) {
      if (!var4) {
         a572((nh_)null);
      }

      var1 += var0._w;
      var3 += var0._A;
      int var5 = gf_._i * var3 + var1;
      int var6 = 0;
      int var7 = var0._v;
      int var8 = var0._y;
      int var9 = -var8 + gf_._i;
      int var11;
      if (var3 < gf_._f) {
         var11 = gf_._f - var3;
         var3 = gf_._f;
         var5 += var11 * gf_._i;
         var7 -= var11;
         var6 += var8 * var11;
      }

      int var10 = 0;
      if (gf_._e < var3 + var7) {
         var7 -= -gf_._e + var7 + var3;
      }

      if (var1 < gf_._j) {
         var11 = gf_._j - var1;
         var8 -= var11;
         var10 += var11;
         var6 += var11;
         var1 = gf_._j;
         var5 += var11;
         var9 += var11;
      }

      if (var1 + var8 > gf_._h) {
         var11 = var8 + var1 - gf_._h;
         var10 += var11;
         var9 += var11;
         var8 -= var11;
      }

      if (0 < var8 && 0 < var7) {
         o_.a270(var8, 0, gf_._b, var6, var0._B, var7, var2, var5, var9, var10);
      }
   }

   ob_(long var1, ok_ var3, ok_ var4, ok_ var5, cn_ var6, String var7) {
      super(var1, var3);
      if (var6 != null) {
         this._Tb = new ok_(0L, var4);
         this._Tb._L = var6;
         this.a652(this._Tb, (byte)124);
      }

      if (var7 != null) {
         this._ic = new ok_(0L, var5, var7);
         this.a652(this._ic, (byte)124);
      }

      this.e150(30509);
   }

   static final void a572(nh_ var0) {
      cn_ var1 = new cn_(var0.a826("final_frame.jpg", "", (byte)-123), c_._h);
      int var2 = var1._y;
      int var3 = var1._v;
      ie_.a150();
      dm_._g = new cn_(var2, 3 * var3 / 4);
      dm_._g.e797();
      var1.c093(0, 0);
      lb_._C = new cn_(var2, -dm_._g._v + var3);
      lb_._C.e797();
      var1.c093(0, -dm_._g._v);
      lb_._C._A = dm_._g._v;
      ti_.c487(true);
   }

   static final void a749(int var0, int var1, Canvas var2, int var3) {
      try {
         Graphics var4 = var2.getGraphics();
         k_._h.a433(var0, true, var4, var3);
         var4.dispose();
      } catch (Exception var5) {
         var2.repaint();
      }

      if (var1 > -76) {
         a578((cn_)null, -84, 120, -93, false);
      }

   }

   public static void g150() {
      _Rb = null;
      _cc = null;
      _Xb = null;
      _Kb = null;
      _oc = null;
   }

   static final void a697(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < var2; ++var4) {
         te_.a812(var0, var4 + var1, var3, ji_._F);
      }

   }

   static {
      _cc = new int[_ac];
      _bc = 26;
      _Pb = 5;
      _ec = 27;
      _Jb = 19;
      _pc = 24;
      _Nb = 4;
      _fc = 0;
      _mc = 14;
      _Wb = 3;
      s_.a326(_fc, 8);
      s_.a326(_Jb, 8);
      s_.a326(_pc, 8);
      s_.a326(_hc, 0);
      s_.a326(_Mb, 40);
      s_.a326(_Wb, 16);
      s_.a326(_Nb, 8);
      s_.a326(_Pb, 16);
      s_.a326(_nc, 160);
      s_.a326(_Ib, 160);
      s_.a326(_kc, 0);
      s_.a326(_jc, 0);
      s_.a326(_lc, 16);
      s_.a326(_Gb, 16);
      s_.a326(_Hb, 0);
      s_.a326(_Ob, 0);
      s_.a326(_Qb, 0);
      s_.a326(_Lb, 4);
      s_.a326(_mc, 0);
      s_.a326(_dc, 8);
      s_.a326(_Ub, 16);
      s_.a326(_Vb, 0);
      s_.a326(_Sb, 0);
      s_.a326(_bc, 0);
      s_.a326(_gc, 0);
      s_.a326(_ec, 0);
      s_.a326(_Zb, 16);
      _Kb = "OFF";
      _Rb = new String[]{"Master of Chaos", "The <%0> is able to harness the raw power of chaos, using the energy released by the sacrifice of another raider to overcome any room. (Multiple use)"};
   }
}
