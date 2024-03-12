import java.io.IOException;

final class jp_ extends ne_ {
   private int _G;
   private static float[] _E;
   private static int[] _l;
   private static po_[] _n;
   private int _m;
   private int _M;
   private static float[] _p;
   private static float[] _O;
   private static byte[] _s;
   private int _u;
   private static int _i;
   private boolean _v;
   private static boolean _y = false;
   private static boolean[] _N;
   private int _C;
   private float[] _t;
   private int _o;
   private static int[] _D;
   private static float[] _B;
   static km_[] _x;
   private static float[] _H;
   private static wc_[] _A;
   private byte[] _w;
   private byte[][] _L;
   private static float[] _j;
   private boolean _z;
   private static int _K;
   private static int _P;
   private int _r;
   private static int[] _I;
   private int _k;
   private static int _F;
   private static nd_[] _q;
   private static float[] _J;

   final va_ c981() {
      this._M = 0;
      this._t = new float[_K];
      byte[] var1 = new byte[this._m];
      int var2 = 0;

      for(int var3 = 0; var3 < this._L.length; ++var3) {
         float[] var4 = this.e875(var3);
         if (var4 != null) {
            int var5 = var4.length;
            if (var5 > this._m - var2) {
               var5 = this._m - var2;
            }

            for(int var6 = 0; var6 < var5; ++var6) {
               int var7 = (int)(128.0F + var4[var6] * 128.0F);
               if ((var7 & -256) != 0) {
                  var7 = ~var7 >> 31;
               }

               var1[var2++] = (byte)(var7 - 128);
            }
         }
      }

      this._t = null;
      return new va_(this._C, var1, this._r, this._G, this._z);
   }

   private final float[] e875(int var1) {
      a167(this._L[var1], 0);
      b784();
      int var2 = a137(ue_.a080(_I.length - 1));
      boolean var3 = _N[var2];
      int var4 = var3 ? _K : _i;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = b784() != 0;
         var6 = b784() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (_i >> 2);
         var9 = (var4 >> 2) + (_i >> 2);
         var10 = _i >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (_i >> 2);
         var12 = var4 - (var4 >> 2) + (_i >> 2);
         var13 = _i >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      wc_ var14 = _A[_I[var2]];
      int var16 = var14._d;
      int var17 = var14._a[var16];
      boolean var15 = !_q[var17].a801();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14._c; ++var17) {
         po_ var18 = _n[var14._b[var17]];
         float[] var19 = _p;
         var18.a623(var19, var4 >> 1, var40);
      }

      int var41;
      if (!var15) {
         var17 = var14._d;
         var41 = var14._a[var17];
         _q[var41].a331(_p, var4 >> 1);
      }

      int var42;
      if (var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            _p[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var41 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var20 = _p;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var46 = var3 ? _O : _j;
         float[] var22 = var3 ? _E : _J;
         float[] var23 = var3 ? _H : _B;
         int[] var24 = var3 ? _l : _D;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var41; ++var25) {
            var26 = var20[4 * var25] - var20[var4 - 4 * var25 - 1];
            var27 = var20[4 * var25 + 2] - var20[var4 - 4 * var25 - 3];
            var28 = var46[2 * var25];
            var29 = var46[2 * var25 + 1];
            var20[var4 - 4 * var25 - 1] = var26 * var28 - var27 * var29;
            var20[var4 - 4 * var25 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var20[var17 + 3 + 4 * var25];
            var27 = var20[var17 + 1 + 4 * var25];
            var28 = var20[4 * var25 + 3];
            var29 = var20[4 * var25 + 1];
            var20[var17 + 3 + 4 * var25] = var26 + var28;
            var20[var17 + 1 + 4 * var25] = var27 + var29;
            var30 = var46[var17 - 4 - 4 * var25];
            var31 = var46[var17 - 3 - 4 * var25];
            var20[4 * var25 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var20[4 * var25 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = ue_.a080(var4 - 1);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * 2 * var50;
               int var52 = var4 - var48 * (2 * var50 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = 4 * var32;
                  float var34 = var20[var51 - 1 - var33];
                  float var35 = var20[var51 - 3 - var33];
                  float var36 = var20[var52 - 1 - var33];
                  float var37 = var20[var52 - 3 - var33];
                  var20[var51 - 1 - var33] = var34 + var36;
                  var20[var51 - 3 - var33] = var35 + var37;
                  float var38 = var46[var32 * var49];
                  float var39 = var46[var32 * var49 + 1];
                  var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if (var47 < var48) {
               var49 = 8 * var47;
               var50 = 8 * var48;
               var30 = var20[var49 + 1];
               var20[var49 + 1] = var20[var50 + 1];
               var20[var50 + 1] = var30;
               var30 = var20[var49 + 3];
               var20[var49 + 3] = var20[var50 + 3];
               var20[var50 + 3] = var30;
               var30 = var20[var49 + 5];
               var20[var49 + 5] = var20[var50 + 5];
               var20[var50 + 5] = var30;
               var30 = var20[var49 + 7];
               var20[var49 + 7] = var20[var50 + 7];
               var20[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var20[var47] = var20[2 * var47 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var20[var4 - 1 - 2 * var47] = var20[4 * var47];
            var20[var4 - 2 - 2 * var47] = var20[4 * var47 + 1];
            var20[var4 - var41 - 1 - 2 * var47] = var20[4 * var47 + 2];
            var20[var4 - var41 - 2 - 2 * var47] = var20[4 * var47 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[2 * var47];
            var28 = var23[2 * var47 + 1];
            var29 = var20[var17 + 2 * var47];
            var30 = var20[var17 + 2 * var47 + 1];
            var31 = var20[var4 - 2 - 2 * var47];
            float var53 = var20[var4 - 1 - 2 * var47];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var20[var17 + 2 * var47] = (var29 + var31 + var54) * 0.5F;
            var20[var4 - 2 - 2 * var47] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var20[var17 + 2 * var47 + 1] = (var30 - var53 + var54) * 0.5F;
            var20[var4 - 1 - 2 * var47] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[2 * var47 + var17] * var22[2 * var47] + var20[2 * var47 + 1 + var17] * var22[2 * var47 + 1];
            var20[var17 - 1 - var47] = var20[2 * var47 + var17] * var22[2 * var47 + 1] - var20[2 * var47 + 1 + var17] * var22[2 * var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var4 - var41 + var47] = -var20[var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[var41 + var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var41 + var47] = -var20[var41 - var47 - 1];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var17 + var47] = var20[var4 - var47 - 1];
         }

         float[] var10000;
         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5) / (double)var10 * 0.5 * Math.PI);
            var10000 = _p;
            var10000[var47] *= (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5) / (double)var13 * 0.5 * Math.PI + 1.5707963267948966);
            var10000 = _p;
            var10000[var47] *= (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
         }
      }

      float[] var43 = null;
      if (this._M > 0) {
         var41 = this._M + var4 >> 2;
         var43 = new float[var41];
         int var45;
         if (!this._v) {
            for(var42 = 0; var42 < this._o; ++var42) {
               var45 = (this._M >> 1) + var42;
               var43[var42] += this._t[var45];
            }
         }

         if (!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var45 = var43.length - (var4 >> 1) + var42;
               var43[var45] += _p[var42];
            }
         }
      }

      float[] var44 = this._t;
      this._t = _p;
      _p = var44;
      this._M = var4;
      this._o = var12 - (var4 >> 1);
      this._v = var15;
      return var43;
   }

   static final jp_ a989(nh_ var0, int var1, int var2) {
      if (!a314(var0)) {
         var0.a330(var2, 2, var1);
         return null;
      } else {
         byte[] var3 = var0.b337(5, var1, var2);
         if (var3 == null) {
            return null;
         } else {
            jp_ var4 = null;

            try {
               var4 = new jp_(var3);
            } catch (IOException var6) {
               var6.printStackTrace();
            }

            return var4;
         }
      }
   }

   static final int b784() {
      int var0 = _s[_P] >> _F & 1;
      ++_F;
      _P += _F >> 3;
      _F &= 7;
      return var0;
   }

   static final jp_ a825(nh_ var0, String var1, String var2) {
      if (!a314(var0)) {
         var0.a822(-13703, var2, var1);
         return null;
      } else {
         byte[] var3 = var0.a826(var1, var2, (byte)-110);
         if (var3 == null) {
            return null;
         } else {
            jp_ var4 = null;

            try {
               var4 = new jp_(var3);
            } catch (IOException var6) {
               var6.printStackTrace();
            }

            return var4;
         }
      }
   }

   private static final boolean a314(nh_ var0) {
      if (!_y) {
         byte[] var1 = var0.b337(5, 0, 0);
         if (var1 == null) {
            return false;
         }

         a604(var1);
      }

      return true;
   }

   public static void a797() {
      _s = null;
      _x = null;
      _q = null;
      _n = null;
      _A = null;
      _N = null;
      _I = null;
      _p = null;
      _j = null;
      _J = null;
      _B = null;
      _O = null;
      _E = null;
      _H = null;
      _D = null;
      _l = null;
   }

   static final float d134(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
   }

   static final int a137(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - _F; var0 -= var3) {
         var3 = 8 - _F;
         int var4 = (1 << var3) - 1;
         var1 += (_s[_P] >> _F & var4) << var2;
         _F = 0;
         ++_P;
         var2 += var3;
      }

      if (var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (_s[_P] >> _F & var3) << var2;
         _F += var0;
      }

      return var1;
   }

   static final void a604(byte[] var0) {
      a167(var0, 0);
      _i = 1 << a137(4);
      _K = 1 << a137(4);
      _p = new float[_K];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0 ? _K : _i;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * Math.PI / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * Math.PI / (double)var2));
         }

         float[] var13 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var13[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * Math.PI / (double)(2 * var2));
            var13[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * Math.PI / (double)(2 * var2));
         }

         float[] var14 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var14[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * Math.PI / (double)var2);
            var14[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * Math.PI / (double)var2));
         }

         int[] var15 = new int[var5];
         int var10 = ue_.a080(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            var15[var11] = lp_.a760(var10, var11);
         }

         if (var1 != 0) {
            _O = var6;
            _E = var13;
            _H = var14;
            _l = var15;
         } else {
            _j = var6;
            _J = var13;
            _B = var14;
            _D = var15;
         }
      }

      var1 = a137(8) + 1;
      _x = new km_[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         _x[var2] = new km_();
      }

      var2 = a137(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         a137(16);
      }

      var2 = a137(6) + 1;
      _q = new nd_[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         _q[var3] = new nd_();
      }

      var3 = a137(6) + 1;
      _n = new po_[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         _n[var4] = new po_();
      }

      var4 = a137(6) + 1;
      _A = new wc_[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         _A[var5] = new wc_();
      }

      var5 = a137(6) + 1;
      _N = new boolean[var5];
      _I = new int[var5];

      for(int var12 = 0; var12 < var5; ++var12) {
         _N[var12] = b784() != 0;
         a137(16);
         a137(16);
         _I[var12] = a137(8);
      }

      _y = true;
   }

   private static final void a167(byte[] var0, int var1) {
      _s = var0;
      _P = var1;
      _F = 0;
   }

   private final void b604(byte[] var1) throws IOException {
      ec_ var2 = new ec_(var1);
      this._C = var2.h137(-45);
      this._m = var2.h137(-48);
      this._r = var2.h137(-34);
      this._G = var2.h137(-42);
      if (this._G < 0) {
         this._G = ~this._G;
         this._z = true;
      }

      int var3 = var2.h137(-125);
      if (var3 < 0) {
         throw new IOException();
      } else {
         this._L = new byte[var3][];

         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = 0;

            int var6;
            do {
               var6 = var2.c474(true);
               var5 += var6;
            } while(var6 >= 255);

            byte[] var7 = new byte[var5];
            var2.a286((byte)-88, 0, var5, var7);
            this._L[var4] = var7;
         }

      }
   }

   final va_ a321(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this._w == null) {
            this._M = 0;
            this._t = new float[_K];
            this._w = new byte[this._m];
            this._k = 0;
            this._u = 0;
         }

         for(; this._u < this._L.length; ++this._u) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.e875(this._u);
            if (var2 != null) {
               int var3 = this._k;
               int var4 = var2.length;
               if (var4 > this._m - var3) {
                  var4 = this._m - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this._w[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this._k;
               }

               this._k = var3;
            }
         }

         this._t = null;
         byte[] var7 = this._w;
         this._w = null;
         return new va_(this._C, var7, this._r, this._G, this._z);
      }
   }

   private jp_(byte[] var1) throws IOException {
      this.b604(var1);
   }
}
