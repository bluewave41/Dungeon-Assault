import java.applet.Applet;

final class tf_ {
   private cn_ _c;
   int[] _h;
   String _f;
   private cn_ _b;
   int _i;
   private int _d;
   private se_ _a;
   static boolean[] _e;
   static int[] _k = rb_.b330(8421504, 4210752, 64);
   static String _g = "CLOSE";
   static cn_ _j;

   static final boolean a595(Applet var0, int var1) {
      if (var1 != 1041792321) {
         return false;
      } else if (ia_._W != null) {
         ck_.h150();
         tp_.a132(10, 75.0F, i_._s);
         g_.a035(fi_.d602(), var1 - 1041774190);
         ra_.b150(9);
         ia_._W = null;
         nf_.d150(0);
         return false;
      } else if (null == ll_._r) {
         if (null != bl_._t) {
            tp_.a132(10, 80.0F, ik_._a);
            g_.a035(fi_.d602(), 18131);
            mi_.a150();
            tl_._k = null;
            bl_._t = null;
            nf_.d150(0);
            return false;
         } else if (null != np_._A) {
            tp_.a132(var1 ^ 1041792331, 84.0F, ib_._i);
            g_.a035(fi_.d602(), 18131);
            sl_.a812(var0);
            bl_.c423();
            gh_._c = null;
            np_._A = null;
            nf_.d150(var1 - 1041792321);
            return false;
         } else if (kf_._p != null) {
            tp_.a132(var1 ^ 1041792331, 92.0F, he_._n);
            g_.a035(fi_.d602(), var1 ^ 1041775506);
            vf_.c423();
            kf_._p = null;
            nf_.d150(0);
            return false;
         } else if (id_._i == null) {
            return true;
         } else {
            df_.a951(new ja_(id_._i.a826("", "huffman", (byte)-110)));
            id_._i = null;
            nf_.d150(0);
            return false;
         }
      } else {
         tp_.a132(var1 - 1041792311, 75.0F, i_._s);
         g_.a035(fi_.d602(), var1 ^ 1041775506);
         ll_._r = null;
         nf_.d150(0);
         return false;
      }
   }

   final void b326(int var1, int var2, int var3) {
      bp_.a131(var1, this._c, var3);
      this._b.h093(var3, var1);
      if (var2 != 32) {
         a595((Applet)null, -18);
      }

   }

   final void a326(int var1, int var2, int var3) {
      if (var3 != 1699) {
         this._f = (String)null;
      }

      this.b326(var2 - (this._d >> 1), var3 ^ 1667, var1 - (this._i >> 1));
   }

   tf_(se_ var1, String var2, int[] var3) {
      this._f = var2;
      this._a = var1;
      this._h = var3;
      jh_.c797();
      this._i = this._a.b926(this._f);
      this._d = this._a._H + this._a._E;
      cn_ var4 = new cn_(this._i, this._d);
      var4.e797();
      this._a.b191(this._f, 0, this._a._H, 16777215, -1);
      this._b = te_.a983(this._i, this._d, this._h, 32, 32, 0.125);

      for(int var5 = 0; var5 < this._b._B.length; ++var5) {
         if (0 == var4._B[var5]) {
            this._b._B[var5] = 0;
         } else if (this._b._B[var5] == 0) {
            this._b._B[var5] = 65793;
         }
      }

      this._c = dd_.a510(4, var4);
      jh_.b797();
   }

   public static void a150() {
      _g = null;
      _k = null;
      _j = null;
      _e = null;
   }
}
