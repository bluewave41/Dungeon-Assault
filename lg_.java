import java.util.Random;

final class lg_ {
   private int _c;
   private Random _o;
   static String _s = "<col=FF0000>Lethal</col>";
   private int[] _i;
   private int[] _k;
   private int[] _g;
   private int[] _q;
   private int _y;
   int _j;
   private int _f;
   static ad_ _n = new ad_(15, 0, 1, 0);
   private int[] _p;
   static String[] _d = new String[]{"Offering", "In a desperate barter with the spirits of his tribal elders, should the <%0> be about to die or be otherwise incapacitated, he can send another orc or goblin into the afterlife and gain another chance at life. (Multiple use)"};
   private int _b;
   static mj_[] _x = new mj_[255];
   private int _a;
   private int _B;
   static String _r = "Found openly only in the courts of some of the more power-hungry human nobles, the dark spells of the necromancer grant her the ability to tackle a variety of situations.";
   static String _e = "<%col_detect>Detect +2</col> in adjacent rooms.";
   int _t;
   private int _z;
   static cn_ _u;
   static String _m;
   q_ _v;
   static String _l = "Accept";
   private int _A;
   static ji_ _w;
   static String _h;

   final void a430(int var1, boolean var2) {
      for(int var3 = this._g.length - 1; var3 >= 0; --var3) {
         if (this._k[var3] > 0) {
            int var10002 = this._k[var3]--;
            int[] var10000 = this._g;
            var10000[var3] += this._q[var3];
            var10000 = this._i;
            var10000[var3] += this._p[var3];
            var10000 = this._q;
            var10000[var3] += this._c;
            var10000 = this._p;
            var10000[var3] += this._a;
         } else {
            --var1;
            if (0 <= var1) {
               this._g[var3] = this._t + uj_.a004(this._o, 37, this._f);
               this._i[var3] = this._j + uj_.a004(this._o, 37, this._B);
               this._q[var3] = this._b + uj_.a004(this._o, 37, this._y);
               this._p[var3] = this._A + uj_.a004(this._o, 37, this._z);
               this._k[var3] = 50;
            }
         }
      }

      if (var2) {
         a494(54, -127, 107, -64, -29, (cn_)null);
      }

   }

   static final char a537(byte var0) {
      int var1 = var0 & 255;
      if (var1 != 0) {
         if (128 <= var1 && var1 < 160) {
            char var2 = mh_._d[var1 - 128];
            if (0 == var2) {
               var2 = '?';
            }

            var1 = var2;
         }

         return (char)var1;
      } else {
         throw new IllegalArgumentException("" + Integer.toString(var1, 16));
      }
   }

   final void b150(int var1) {
      int var2 = this._v._h;
      int var3 = this._v._e;
      this._v.b797();
      byte[] var4 = this._v._j;
      if (var1 != 486513968) {
         this._o = (Random)null;
      }

      for(int var5 = this._g.length - 1; 0 <= var5; --var5) {
         if (this._k[var5] > 0) {
            int var6 = this._g[var5] >> 16;
            int var7 = this._i[var5] >> 16;
            if (var6 >= 0 && var2 > var6 && var7 >= 0 && var3 > var7) {
               int var8 = var6 + var2 * var7;
               int var9 = (this._k[var5] >> 2) + var4[var8];
               if (255 < var9) {
                  var9 = 255;
               }

               var4[var8] = (byte)var9;
            }
         }
      }

   }

   static final void a150() {
      jd_ var0 = (jd_)ta_._f.e024(-24172);
      if (var0 != null) {
         wj_ var1 = ra_._c;
         var1.h137(-125);
         var1.h137(-122);
         var1.h137(-38);
         var1.h137(-39);
         var0.a487(false);
      } else {
         tl_.a150(-63);
      }
   }

   public static void a487(boolean var0) {
      _n = null;
      _w = null;
      _h = null;
      _l = null;
      _s = null;
      _e = null;
      _r = null;
      _x = null;
      _d = null;
      _u = null;
      _m = null;
      if (!var0) {
         _l = (String)null;
      }

   }

   static final void a924(int var0, String var1, int var2) {
      ac_ var3 = gh_._i[var2];
      if (var3 != null) {
         var3._x = var3._a = hd_.a492(var0, "da_trap_" + var1);
      }
   }

   static final void a494(int var0, int var1, int var2, int var3, int var4, cn_ var5) {
      int var6 = (-var2 + var0 << 8) / var5._E;
      var3 += var5._A;
      if (var1 != 65280) {
         a487(false);
      }

      int var7 = var6 * var5._w + (var2 << 8);
      var4 += var5._w;
      int var8 = var4 + var3 * gf_._i;
      int var9 = 0;
      int var10 = var5._v;
      int var11 = var5._y;
      int var12 = -var11 + gf_._i;
      int var13 = 0;
      int var14;
      if (var3 < gf_._f) {
         var14 = gf_._f - var3;
         var3 = gf_._f;
         var8 += gf_._i * var14;
         var10 -= var14;
         var9 += var14 * var11;
      }

      if (var3 + var10 > gf_._e) {
         var10 -= -gf_._e + var3 + var10;
      }

      if (gf_._j > var4) {
         var14 = gf_._j - var4;
         var12 += var14;
         var4 = gf_._j;
         var7 += var6 * var14;
         var13 += var14;
         var8 += var14;
         var9 += var14;
         var11 -= var14;
      }

      if (gf_._h < var4 + var11) {
         var14 = -gf_._h + var4 + var11;
         var13 += var14;
         var12 += var14;
         var11 -= var14;
      }

      if (var11 > 0 && var10 > 0) {
         for(var3 = -var10; 0 > var3; ++var3) {
            var14 = var7;

            for(var4 = -var11; var4 < 0; ++var4) {
               int var15 = var14 >> 8;
               int var16 = -var15 + 256;
               var14 += var6;
               if (0 > var15) {
                  ++var8;
                  ++var9;
               } else {
                  int var17 = var5._B[var9++];
                  if (var17 != 0) {
                     if (255 < var15) {
                        gf_._b[var8] = var17;
                     } else {
                        int var18 = gf_._b[var8];
                        int var19 = 16711935 & var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8;
                        gf_._b[var8] = (nb_.a080(16711772, nb_.a080(var17, 65280) * var15 + nb_.a080(65280, var18) * var16) >> 8) + var19;
                     }
                  }

                  ++var8;
               }
            }

            var8 += var12;
            var9 += var13;
         }

      }
   }

   lg_(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      this._B = var4;
      this._k = new int[10000];
      this._f = var3;
      this._c = var9;
      this._p = new int[10000];
      this._t = var1;
      this._g = new int[10000];
      this._q = new int[10000];
      this._z = var8;
      this._i = new int[10000];
      this._y = var7;
      this._a = var10;
      this._A = var6;
      this._b = var5;
      this._j = var2;
      this._o = new Random(100L);
      this._v = new q_(var11, var12, 256);
   }

   static {
      for(int var0 = 0; _x.length > var0; ++var0) {
         _x[var0] = new mj_();
      }

      _h = "RAIDER RECRUITMENT";
   }
}
