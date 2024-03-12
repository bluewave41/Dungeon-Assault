final class bp_ {
   static String _h = "Treasure: <col=DB0100><%0></col>";
   private int _b;
   static int[] _e = wa_.b878(-1);
   private int[] _f;
   private boolean _a;
   static int _d;
   private int _g;
   static String _c = "Your raider was trapped and incapacitated.";

   private final int c080(int var1, int var2) {
      if (var2 != -13676) {
         this.b093(-126, 111);
      }

      int var3 = this._f.length;

      while(var3 <= var1) {
         if (this._a) {
            if (0 == var3) {
               var3 = 1;
            } else {
               var3 *= this._g;
            }
         } else {
            var3 += this._g;
         }
      }

      return var3;
   }

   private final void a326(int var1, int var2, int var3) {
      if (var2 == 0) {
         if (this._b < var1) {
            this._b = var1;
         }

         if (this._f.length <= var1) {
            this.d093(-93, var1);
         }

         this._f[var1] = var3;
      }
   }

   private final void d093(int var1, int var2) {
      int[] var3 = new int[this.c080(var2, -13676)];
      cj_.a382(this._f, 0, var3, 0, this._f.length);
      this._f = var3;
   }

   static final um_ a243(int var0, String var1) {
      ha_ var3 = new ha_();
      var3._f = var0;
      var3._a = var1;
      return var3;
   }

   static final void a131(int var0, cn_ var1, int var2) {
      var2 += var1._w;
      var0 += var1._A;
      int var3 = var2 + var0 * gf_._i;
      int var4 = 0;
      int var5 = var1._v;
      int var6 = var1._y;
      int var7 = gf_._i - var6;
      int var9;
      if (gf_._f > var0) {
         var9 = -var0 + gf_._f;
         var4 += var6 * var9;
         var0 = gf_._f;
         var5 -= var9;
         var3 += var9 * gf_._i;
      }

      int var8 = 0;
      if (var5 + var0 > gf_._e) {
         var5 -= -gf_._e + var0 + var5;
      }

      if (gf_._j > var2) {
         var9 = gf_._j - var2;
         var6 -= var9;
         var2 = gf_._j;
         var8 += var9;
         var7 += var9;
         var4 += var9;
         var3 += var9;
      }

      if (gf_._h < var2 + var6) {
         var9 = var2 + (var6 - gf_._h);
         var7 += var9;
         var6 -= var9;
         var8 += var9;
      }

      if (0 < var6 && var5 > 0) {
         id_.a728(var3, 0, var5, var8, var1._B, var4, var6, gf_._b, var7);
      }
   }

   final void b093(int var1, int var2) {
      if (0 <= var1 && this._b >= var1) {
         if (var1 != this._b) {
            cj_.a382(this._f, var1 + 1, this._f, var1, -var1 + this._b);
         }

         --this._b;
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   static final void a883(cn_ var0, byte var1, String var2) {
      lg_._m = var2;
      rf_._Q = var0;
      if (var1 != 51) {
         _h = (String)null;
      }

   }

   final int a080(int var1, int var2) {
      if (var1 != -814) {
         return 73;
      } else if (var2 > this._b) {
         throw new ArrayIndexOutOfBoundsException(var2);
      } else {
         return this._f[var2];
      }
   }

   public static void a150() {
      _c = null;
      _h = null;
      _e = null;
   }

   final int a410(byte var1) {
      return var1 > -36 ? 3 : 1 + this._b;
   }

   final void e093(int var1, int var2) {
      if (var2 > -66) {
         a883((cn_)null, (byte)50, (String)null);
      }

      this.a326(1 + this._b, 0, var1);
   }

   static final void b150(int var0) {
      synchronized(in_._C) {
         ++hl_._g;
         je_._i = pj_._x;
         int var2;
         if (0 > ia_._M) {
            for(var2 = 0; var2 < 112; ++var2) {
               qk_._e[var2] = false;
            }

            ia_._M = dl_._b;
         } else {
            while(dl_._b != ia_._M) {
               var2 = ih_._r[dl_._b];
               dl_._b = 127 & dl_._b + 1;
               if (0 > var2) {
                  qk_._e[~var2] = false;
               } else {
                  qk_._e[var2] = true;
               }
            }
         }

         if (var0 > 28) {
            pj_._x = ka_._c;
         }
      }
   }

   private bp_() throws Throwable {
      throw new Error();
   }
}
