import java.math.BigInteger;

final class je_ {
   private ec_ _n;
   private em_ _m;
   static int[] _d = new int[]{4210752, 16711680, 16711680, 255, 65280};
   private BigInteger _j;
   private cc_ _g;
   static String[] _f = new String[]{null, "Different raiders are better suited for different types of obstacles within the dungeon. Some are good at disarming <%traps>, others at fighting <%monsters>."};
   private ti_[] _k;
   private bb_ _h;
   static String _l = "EXCLUSIVE";
   static int _i = 0;
   private BigInteger _e;
   static int _b;
   static mb_ _c;
   static String _a = "(Including <%0>)";

   static final o_ a595(int var0, cf_[] var1) {
      int var2 = oi_.b080(var0, var1.length);
      return gd_.a364(64, var1[var2]);
   }

   final void a423(byte var1) {
      if (this._k != null) {
         int var2;
         for(var2 = 0; var2 < this._k.length; ++var2) {
            if (null != this._k[var2]) {
               this._k[var2].b487(false);
            }
         }

         if (var1 > 46) {
            for(var2 = 0; this._k.length > var2; ++var2) {
               if (this._k[var2] != null) {
                  this._k[var2].c150(-10790);
               }
            }

         }
      }
   }

   public static void a487() {
      _d = null;
      _l = null;
      _c = null;
      _a = null;
      _f = null;
   }

   final boolean b427(byte var1) {
      if (null != this._n) {
         return true;
      } else {
         if (null == this._m) {
            if (this._h.b154(-21431)) {
               return false;
            }

            this._m = this._h.a180(true, 255, (byte)0, 255, (byte)69);
         }

         if (var1 != 113) {
            return true;
         } else if (this._m._v) {
            return false;
         } else {
            ec_ var2 = new ec_(this._m.b318(true));
            var2._o = 5;
            int var3 = var2.c474(true);
            var2._o += 72 * var3;
            byte[] var4 = new byte[-var2._o + var2._m.length];
            var2.a286((byte)-105, 0, var4.length, var4);
            byte[] var5;
            if (null != this._j && this._e != null) {
               BigInteger var6 = new BigInteger(var4);
               BigInteger var7 = var6.modPow(this._j, this._e);
               var5 = var7.toByteArray();
            } else {
               var5 = var4;
            }

            if (65 != var5.length) {
               throw new RuntimeException();
            } else {
               byte[] var8 = rn_.a288(var2._o - var4.length - 5, 5, 8, var2._m);

               for(int var9 = 0; 64 > var9; ++var9) {
                  if (var5[var9 + 1] != var8[var9]) {
                     throw new RuntimeException();
                  }
               }

               this._k = new ti_[var3];
               this._n = var2;
               return true;
            }
         }
      }
   }

   final ti_ a407(boolean var1, int var2, int var3, ln_ var4, ln_ var5) {
      if (null == this._n) {
         throw new RuntimeException();
      } else if (0 <= var3 && var3 < this._k.length) {
         if (null == this._k[var3]) {
            this._n._o = 6 + 72 * var3;
            int var6 = this._n.h137(-31);
            int var7 = this._n.h137(-54);
            byte[] var8 = new byte[64];
            this._n.a286((byte)-117, 0, 64, var8);
            ti_ var9 = new ti_(var3, var5, var4, this._h, this._g, var6, var8, var7, var1);
            this._k[var3] = var9;
            return var2 != 4210752 ? (ti_)null : var9;
         } else {
            return this._k[var3];
         }
      } else {
         throw new RuntimeException();
      }
   }

   je_(bb_ var1, cc_ var2) {
      this(var1, var2, (BigInteger)null, (BigInteger)null);
   }

   static final void a749(int var0, int var1, cn_ var2, int var3, int var4) {
      jh_.c797();
      gf_.e115(var3, var1, var3 + var4, var0 + var1);

      for(int var5 = var1; var5 < var0 + var1; var5 += var2._v) {
         for(int var6 = var3; var6 < var4 + var3; var6 += var2._y) {
            var2.h093(var6, var5);
         }
      }

      jh_.b797();
   }

   private je_(bb_ var1, cc_ var2, BigInteger var3, BigInteger var4) {
      this._h = var1;
      this._g = var2;
      this._j = var3;
      this._e = var4;
      if (!this._h.b154(-21431)) {
         this._m = this._h.a180(true, 255, (byte)0, 255, (byte)91);
      }

   }
}
