final class ug_ extends qb_ {
   private int _L = 256;
   private wa_ _W;
   private int[] _O = new int[16];
   private int[] _q = new int[16];
   private lp_[][] _u = new lp_[16][128];
   private int[] _J = new int[16];
   private int[] _U = new int[16];
   private int[] _m = new int[16];
   private lp_[][] _r = new lp_[16][128];
   private int _x = 1000000;
   private int[] _N = new int[16];
   private int[] _K = new int[16];
   int[] _Q = new int[16];
   private vm_ _A = new vm_();
   private int[] _s = new int[16];
   private int[] _I = new int[16];
   int[] _o = new int[16];
   private int[] _n = new int[16];
   private int[] _V = new int[16];
   private int[] _B = new int[16];
   private int[] _P = new int[16];
   static int[] _E = rb_.b330(0, 0, 64);
   int[] _G = new int[16];
   static fd_ _w = new fd_(2);
   private long _F;
   private boolean _T;
   private long _z;
   private int _t;
   private int _p;
   static qk_ _y;
   private hg_ _R = new hg_(this);
   private vh_ _S;
   private int _v;
   private boolean _D;
   static String[] _M = new String[]{"Hoard Room", "Well done! By reaching the <%highlight>hoard room</col> you have claimed possession of this dungeon. It is now yours to defend against other players. When you raid the dungeon of another player, their dragon will occupy this central tile instead, and you will have the opportunity to steal a portion of their Treasure and Renown.<br><br><%command>For now, end this game (by clicking Exit) and we will move on to Dungeon Construction.</col>"};

   final synchronized void d150(int var1) {
      this.c540(true, 100);
      if (var1 >= -78) {
         this.b540(false, -122);
      }

   }

   private final void a789(int var1, byte var2, int var3) {
      if (var2 != 78) {
         this.f150(61);
      }

   }

   private final void a326(int var1, int var2, int var3) {
      this._O[var3] = var2;
      this._Q[var3] = (int)(0.5 + 2097152.0 * Math.pow((double)var1, 5.4931640625E-4 * (double)var2));
   }

   private final void a548(boolean var1, int var2, int var3, int var4) {
      lp_ var5 = this._u[var3][var2];
      if (var5 != null) {
         if (!var1) {
            this.b397((int[])null, -89, 102);
         }

         this._u[var3][var2] = null;
         if ((this._G[var3] & 2) != 0) {
            for(lp_ var6 = (lp_)this._R._q.e024(-24172); null != var6; var6 = (lp_)this._R._q.a024(4)) {
               if (var6._p == var5._p && var6._r < 0 && var6 != var5) {
                  var5._r = 0;
                  break;
               }
            }
         } else {
            var5._r = 0;
         }

      }
   }

   final synchronized void a787(vh_ var1, int var2, boolean var3) {
      this.a083(true, -16257, var1, var3);
      if (var2 != 20938) {
         a776(false, 34, (CharSequence)null);
      }

   }

   private final void a679(byte var1, int var2, int var3) {
      if (var1 >= 70) {
         if (var2 != this._P[var3]) {
            this._P[var3] = var2;

            for(int var4 = 0; var4 < 128; ++var4) {
               this._r[var3][var4] = null;
            }
         }

      }
   }

   private final void a430(int var1, boolean var2) {
      if (var2) {
         this._Q = (int[])null;
      }

      for(lp_ var3 = (lp_)this._R._q.e024(-24172); null != var3; var3 = (lp_)this._R._q.a024(4)) {
         if (0 > var1 || var3._p == var1) {
            if (null != var3._v) {
               var3._v.f150(vn_._t / 100);
               if (var3._v.e801()) {
                  this._R._o.b501(var3._v);
               }

               var3.b487(!var2);
            }

            if (0 > var3._r) {
               this._u[var3._p][var3._y] = null;
            }

            var3.a487(var2);
         }
      }

   }

   final synchronized boolean b427(byte var1) {
      if (var1 >= -116) {
         this._q = (int[])null;
      }

      return this._A.g801();
   }

   private final void b679(byte var1, int var2, int var3) {
      this._J[var3] = var2;
      this._K[var3] = nb_.a080(-128, var2);
      if (var1 >= -54) {
         this._N = (int[])null;
      }

      this.a679((byte)114, var2, var3);
   }

   private final void a115(int var1, int var2, int var3, int var4) {
      if (var4 < 62) {
         this.f093(-63, 116);
      }

   }

   final synchronized void f150(int var1) {
      if (var1 != -50) {
         this.a789(100, (byte)104, 28);
      }

      for(kk_ var2 = (kk_)this._W.a457(true); var2 != null; var2 = (kk_)this._W.a024(4318)) {
         var2.a423((byte)-97);
      }

   }

   final synchronized int a784() {
      return 0;
   }

   private final void d540(boolean var1, int var2) {
      if (var1) {
         this.a430(-1, false);
      } else {
         this.b540(true, -1);
      }

      this.e093(-1, 0);

      int var3;
      for(var3 = 0; 16 > var3; ++var3) {
         this._P[var3] = this._J[var3];
      }

      if (var2 != 16) {
         this.a769((lp_)null, 42);
      }

      for(var3 = 0; var3 < 16; ++var3) {
         this._K[var3] = nb_.a080(this._J[var3], -128);
      }

   }

   private final void b115(int var1, int var2, int var3, int var4) {
      this.a548(true, var3, var4, 64);
      if (0 != (2 & this._G[var4])) {
         for(lp_ var6 = (lp_)this._R._q.d024(-14205); var6 != null; var6 = (lp_)this._R._q.g024(20)) {
            if (var6._p == var4 && var6._r < 0) {
               this._u[var4][var6._y] = null;
               this._u[var4][var3] = var6;
               int var7 = var6._s + (var6._w * var6._J >> 12);
               var6._s += var3 - var6._y << 8;
               var6._y = var3;
               var6._J = var7 - var6._s;
               var6._w = 4096;
               return;
            }
         }
      }

      kk_ var10 = (kk_)this._W.a722((long)this._P[var4], 8);
      if (var10 != null) {
         va_ var11 = var10._k[var3];
         if (var11 != null) {
            lp_ var8 = new lp_();
            var8._x = var10;
            var8._I = var11;
            var8._p = var4;
            var8._A = var10._n[var3];
            var8._D = var10._o[var3];
            var8._y = var3;
            var8._t = 1024 + var10._m[var3] * var10._j * var1 * var1 >> 11;
            var8._i = var10._p[var3] & 255;
            var8._s = (var3 << 8) - (32767 & var10._r[var3]);
            var8._r = -1;
            var8._j = 0;
            var8._u = 0;
            var8._k = 0;
            var8._l = 0;
            if (0 != this._o[var4]) {
               var8._v = ni_.a456(var11, this.a845((byte)46, var8), 0, this.a449(var8, false));
               this.a777(var8, 4917, var10._r[var3] < 0);
            } else {
               var8._v = ni_.a456(var11, this.a845((byte)78, var8), this.b786(var8, 0), this.a449(var8, false));
            }

            if (0 > var10._r[var3]) {
               var8._v.e150(-1);
            }

            if (var8._D >= 0) {
               lp_ var9 = this._r[var4][var8._D];
               if (var9 != null && 0 > var9._r) {
                  this._u[var4][var9._y] = null;
                  var9._r = 0;
               }

               this._r[var4][var8._D] = var8;
            }

            this._R._q.a865(var8, false);
            this._u[var4][var3] = var8;
         }
      }
   }

   private final void f093(int var1, int var2) {
      if ((this._G[var1] & 4) != 0) {
         for(lp_ var4 = (lp_)this._R._q.e024(-24172); var4 != null; var4 = (lp_)this._R._q.a024(4)) {
            if (var1 == var4._p) {
               var4._m = 0;
            }
         }
      }

   }

   final boolean a769(lp_ var1, int var2) {
      if (var1._v != null) {
         if (var2 != -16257) {
            this._r = (lp_[][])((lp_[][])null);
         }

         return false;
      } else {
         if (0 <= var1._r) {
            var1.a487(false);
            if (var1._D > 0 && var1 == this._r[var1._p][var1._D]) {
               this._r[var1._p][var1._D] = null;
            }
         }

         return true;
      }
   }

   private final void a183(boolean var1, int var2, int var3) {
      this._B[var3] = var2;
      if (var1) {
         a527(false, 29);
      }

   }

   private final synchronized void c540(boolean var1, int var2) {
      this._A.c797();
      if (var2 > 27) {
         this._S = null;
         this.d540(var1, 16);
      }
   }

   private final int a845(byte var1, lp_ var2) {
      int var3 = (var2._J * var2._w >> 12) + var2._s;
      var3 += (this._B[var2._p] - 8192) * this._I[var2._p] >> 12;
      if (var1 <= 2) {
         this.b397((int[])null, 108, -85);
      }

      of_ var4 = var2._A;
      int var5;
      if (var4._i > 0 && (var4._h > 0 || 0 < this._U[var2._p])) {
         var5 = var4._h << 2;
         int var6 = var4._a << 1;
         if (var2._G < var6) {
            var5 = var2._G * var5 / var6;
         }

         var5 += this._U[var2._p] >> 7;
         double var7 = Math.sin((double)(var2._E & 511) * 0.01227184630308513);
         var3 += (int)(var7 * (double)var5);
      }

      var5 = (int)((double)(256 * var2._I._n) * Math.pow(2.0, 3.255208333333333E-4 * (double)var3) / (double)vn_._t + 0.5);
      return var5 >= 1 ? var5 : 1;
   }

   final synchronized void a599(int var1, int var2, byte var3) {
      int var4;
      if (var2 >= 0) {
         this._V[var2] = var1;
      } else {
         for(var4 = 0; 16 > var4; ++var4) {
            this._V[var4] = var1;
         }
      }

      var4 = 54 / ((-2 - var3) / 60);
   }

   final synchronized void b397(int[] var1, int var2, int var3) {
      if (this._A.g801()) {
         int var4 = this._A._c * this._x / vn_._t;

         do {
            long var5 = this._z + (long)var3 * (long)var4;
            if (this._F - var5 >= 0L) {
               this._z = var5;
               break;
            }

            int var7 = (int)(((long)var4 + this._F - this._z - 1L) / (long)var4);
            this._z += (long)var4 * (long)var7;
            this._R.b397(var1, var2, var7);
            this.a423((byte)-24);
            var2 += var7;
            var3 -= var7;
         } while(this._A.g801());
      }

      this._R.b397(var1, var2, var3);
   }

   private final void e093(int var1, int var2) {
      if (var2 <= var1) {
         this._q[var1] = 12800;
         this._n[var1] = 8192;
         this._m[var1] = 16383;
         this._B[var1] = 8192;
         this._U[var1] = 0;
         this._s[var1] = 8192;
         this.d093(var1, -1);
         this.f093(var1, var2 - 108);
         this._G[var1] = 0;
         this._N[var1] = 32767;
         this._I[var1] = 256;
         this._o[var1] = 0;
         this.a326(2, 8192, var1);
      } else {
         for(var1 = 0; 16 > var1; ++var1) {
            this.e093(var1, var2 + 0);
         }

      }
   }

   static final String a776(boolean var0, int var1, CharSequence var2) {
      String var3 = cm_.a776(var0, var2);
      if (var3 != null) {
         return var3;
      } else {
         for(int var4 = 0; var4 < var2.length(); ++var4) {
            if (!rp_.a624(var2.charAt(var4))) {
               return me_._a;
            }
         }

         if (var1 > -39) {
            return (String)null;
         } else {
            return null;
         }
      }
   }

   final synchronized qb_ d207() {
      return this._R;
   }

   final synchronized void c679(byte var1, int var2, int var3) {
      this.b679((byte)-87, var2, var3);
   }

   private final synchronized void a083(boolean var1, int var2, vh_ var3, boolean var4) {
      this.c540(var1, var2 + 16353);
      this._A.a604(var3._i);
      this._z = 0L;
      if (var2 != -16257) {
         this.a787((vh_)null, -111, false);
      }

      this._T = var4;
      int var5 = this._A.a784();

      for(int var6 = 0; var5 > var6; ++var6) {
         this._A.d150(var6);
         this._A.b150(var6);
         this._A.a150(var6);
      }

      this._p = this._A.b784();
      this._t = this._A._d[this._p];
      this._F = this._A.e138(this._t);
   }

   final synchronized qb_ c207() {
      return null;
   }

   private final void b540(boolean var1, int var2) {
      for(lp_ var3 = (lp_)this._R._q.e024(-24172); var3 != null; var3 = (lp_)this._R._q.a024(4)) {
         if ((0 > var2 || var2 == var3._p) && 0 > var3._r) {
            this._u[var3._p][var3._y] = null;
            var3._r = 0;
         }
      }

      if (!var1) {
         this._x = 27;
      }

   }

   final synchronized void c093(int var1, int var2) {
      if (var2 == 24509) {
         this._L = var1;
      }
   }

   public static void e150() {
      _E = null;
      _y = null;
      _M = null;
      _w = null;
   }

   private final void a423(byte var1) {
      if (var1 != -24) {
         this._V = (int[])null;
      }

      int var2 = this._p;
      int var3 = this._t;
      long var4 = this._F;
      if (this._S != null && this._v == var3) {
         this.a083(this._D, -16257, this._S, this._T);
         this.a423((byte)-24);
      } else {
         while(this._t == var3) {
            while(this._A._d[var2] == var3) {
               this._A.d150(var2);
               int var6 = this._A.c137(var2);
               if (1 == var6) {
                  this._A.e797();
                  this._A.a150(var2);
                  if (this._A.f801()) {
                     if (null != this._S) {
                        this.a787(this._S, 20938, this._T);
                        this.a423((byte)-24);
                        return;
                     }

                     if (!this._T || 0 == var3) {
                        this.d540(true, 16);
                        this._A.c797();
                        return;
                     }

                     this._A.a111(var4);
                  }
                  break;
               }

               if (0 != (128 & var6)) {
                  this.a093(var6, 16384);
               }

               this._A.b150(var2);
               this._A.a150(var2);
            }

            var2 = this._A.b784();
            var3 = this._A._d[var2];
            var4 = this._A.e138(var3);
         }

         this._t = var3;
         this._F = var4;
         this._p = var2;
         if (null != this._S && var3 > this._v) {
            this._p = -1;
            this._t = this._v;
            this._F = this._A.e138(this._t);
         }

      }
   }

   final boolean a293(int var1, int var2, int var3, lp_ var4, int[] var5) {
      var4._H = vn_._t / 100;
      if (0 > var4._r || null != var4._v && !var4._v.f801()) {
         int var6 = var4._w;
         if (0 < var6) {
            var6 -= (int)(Math.pow(2.0, 4.921259842519685E-4 * (double)this._s[var4._p]) * 16.0 + 0.5);
            if (0 > var6) {
               var6 = 0;
            }

            var4._w = var6;
         }

         var4._v.g150(this.a845((byte)119, var4));
         of_ var7 = var4._A;
         var4._E += var7._i;
         boolean var8 = false;
         ++var4._G;
         double var9 = (double)((var4._J * var4._w >> 12) + (var4._y - 60 << 8)) * 5.086263020833333E-6;
         if (0 < var7._c) {
            if (0 >= var7._b) {
               var4._k += 128;
            } else {
               var4._k += (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7._b));
            }

            if (819200 <= var4._k * var7._c) {
               var8 = true;
            }
         }

         if (var7._n != null) {
            if (var7._e <= 0) {
               var4._u += 128;
            } else {
               var4._u += (int)(Math.pow(2.0, var9 * (double)var7._e) * 128.0 + 0.5);
            }

            while(var4._l < var7._n.length - 2 && var4._u > (var7._n[var4._l + 2] & 255) << 8) {
               var4._l += 2;
            }

            if (var7._n.length - 2 == var4._l && var7._n[1 + var4._l] == 0) {
               var8 = true;
            }
         }

         if (0 <= var4._r && null != var7._o && (1 & this._G[var4._p]) == 0 && (var4._D < 0 || this._r[var4._p][var4._D] != var4)) {
            if (0 >= var7._m) {
               var4._r += 128;
            } else {
               var4._r += (int)(Math.pow(2.0, var9 * (double)var7._m) * 128.0 + 0.5);
            }

            while(var7._o.length - 2 > var4._j && (var7._o[var4._j + 2] & 255) << 8 < var4._r) {
               var4._j += 2;
            }

            if (var4._j == var7._o.length - 2) {
               var8 = true;
            }
         }

         if (!var8) {
            var4._v.a326(var4._H, this.b786(var4, 0), this.a449(var4, false));
            return false;
         } else {
            var4._v.f150(var4._H);
            if (var5 != null) {
               var4._v.b397(var5, var2, var3);
            } else {
               var4._v.a150(var3);
            }

            if (var4._v.e801()) {
               this._R._o.b501(var4._v);
            }

            var4.b487(true);
            if (var4._r >= 0) {
               var4.a487(false);
               if (0 < var4._D && this._r[var4._p][var4._D] == var4) {
                  this._r[var4._p][var4._D] = null;
               }
            }

            return true;
         }
      } else {
         var4.b487(true);
         var4.a487(false);
         if (0 < var4._D && this._r[var4._p][var4._D] == var4) {
            this._r[var4._p][var4._D] = null;
         }

         return true;
      }
   }

   private final void a093(int var1, int var2) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (var3 == 128) {
         var4 = 15 & var1;
         var5 = (32667 & var1) >> 8;
         var6 = (8372321 & var1) >> 16;
         this.a548(true, var5, var4, var6);
      } else if (var3 == 144) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = (var1 & 8385741) >> 16;
         if (0 >= var6) {
            this.a548(true, var5, var4, 64);
         } else {
            this.b115(var6, -29, var5, var4);
         }

      } else if (160 != var3) {
         if (176 != var3) {
            if (var3 != 192) {
               if (var2 != 16384) {
                  this._m = (int[])null;
               }

               if (var3 == 208) {
                  var4 = var1 & 15;
                  var5 = 127 & var1 >> 8;
                  this.a789(var5, (byte)78, var4);
               } else if (224 != var3) {
                  var3 = 255 & var1;
                  if (var3 == 255) {
                     this.d540(true, 16);
                  }
               } else {
                  var4 = var1 & 15;
                  var5 = (var1 >> 9 & 16256) + ((32761 & var1) >> 8);
                  this.a183(false, var5, var4);
               }
            } else {
               var4 = 15 & var1;
               var5 = 127 & var1 >> 8;
               this.a679((byte)106, this._K[var4] + var5, var4);
            }
         } else {
            var4 = 15 & var1;
            var5 = var1 >> 8 & 127;
            var6 = (var1 & 8364021) >> 16;
            if (0 == var5) {
               this._K[var4] = (var6 << 14) + nb_.a080(this._K[var4], -2080769);
            }

            if (32 == var5) {
               this._K[var4] = (var6 << 7) + nb_.a080(this._K[var4], -16257);
            }

            if (1 == var5) {
               this._U[var4] = (var6 << 7) + nb_.a080(this._U[var4], -16257);
            }

            if (33 == var5) {
               this._U[var4] = nb_.a080(-128, this._U[var4]) + var6;
            }

            if (var5 == 5) {
               this._s[var4] = (var6 << 7) + nb_.a080(this._s[var4], -16257);
            }

            if (37 == var5) {
               this._s[var4] = var6 + nb_.a080(-128, this._s[var4]);
            }

            if (var5 == 7) {
               this._q[var4] = (var6 << 7) + nb_.a080(this._q[var4], -16257);
            }

            if (39 == var5) {
               this._q[var4] = nb_.a080(-128, this._q[var4]) + var6;
            }

            if (10 == var5) {
               this._n[var4] = (var6 << 7) + nb_.a080(this._n[var4], -16257);
            }

            if (var5 == 42) {
               this._n[var4] = var6 + nb_.a080(-128, this._n[var4]);
            }

            if (var5 == 11) {
               this._m[var4] = (var6 << 7) + nb_.a080(this._m[var4], -16257);
            }

            if (43 == var5) {
               this._m[var4] = var6 + nb_.a080(-128, this._m[var4]);
            }

            if (64 == var5) {
               if (64 <= var6) {
                  this._G[var4] = mp_.a080(this._G[var4], 1);
               } else {
                  this._G[var4] = nb_.a080(this._G[var4], -2);
               }
            }

            if (var5 == 65) {
               if (64 <= var6) {
                  this._G[var4] = mp_.a080(this._G[var4], 2);
               } else {
                  this.d093(var4, -1);
                  this._G[var4] = nb_.a080(this._G[var4], -3);
               }
            }

            if (var5 == 99) {
               this._N[var4] = (var6 << 7) + nb_.a080(127, this._N[var4]);
            }

            if (var5 == 98) {
               this._N[var4] = nb_.a080(16256, this._N[var4]) + var6;
            }

            if (101 == var5) {
               this._N[var4] = (var6 << 7) + 16384 + nb_.a080(this._N[var4], 127);
            }

            if (100 == var5) {
               this._N[var4] = nb_.a080(this._N[var4], 16256) + 16384 + var6;
            }

            if (120 == var5) {
               this.a430(var4, false);
            }

            if (121 == var5) {
               this.e093(var4, 0);
            }

            if (var5 == 123) {
               this.b540(true, var4);
            }

            int var7;
            if (var5 == 6) {
               var7 = this._N[var4];
               if (16384 == var7) {
                  this._I[var4] = nb_.a080(-16257, this._I[var4]) + (var6 << 7);
               }
            }

            if (38 == var5) {
               var7 = this._N[var4];
               if (var7 == 16384) {
                  this._I[var4] = nb_.a080(-128, this._I[var4]) + var6;
               }
            }

            if (16 == var5) {
               this._o[var4] = nb_.a080(-16257, this._o[var4]) + (var6 << 7);
            }

            if (48 == var5) {
               this._o[var4] = nb_.a080(-128, this._o[var4]) + var6;
            }

            if (81 == var5) {
               if (var6 < 64) {
                  this.f093(var4, var2 ^ 16418);
                  this._G[var4] = nb_.a080(this._G[var4], -5);
               } else {
                  this._G[var4] = mp_.a080(this._G[var4], 4);
               }
            }

            if (var5 == 17) {
               this.a326(2, (-16257 & this._O[var4]) + (var6 << 7), var4);
            }

            if (49 == var5) {
               this.a326(2, var6 + (this._O[var4] & -128), var4);
            }

         }
      } else {
         var4 = var1 & 15;
         var5 = (var1 & 32616) >> 8;
         var6 = var1 >> 16 & 127;
         this.a115(var5, var6, var4, 73);
      }
   }

   static final int a527(boolean var0, int var1) {
      if (!var0) {
         return 34;
      } else if (65536L <= (long)var1) {
         if ((long)var1 >= 16777216L) {
            if (268435456L <= (long)var1) {
               return 1073741824L <= (long)var1 ? lc_._h[var1 >> 24] : lc_._h[var1 >> 22] >> 1;
            } else {
               return 67108864L > (long)var1 ? lc_._h[var1 >> 18] >> 3 : lc_._h[var1 >> 20] >> 2;
            }
         } else if (1048576L <= (long)var1) {
            return (long)var1 >= 4194304L ? lc_._h[var1 >> 16] >> 4 : lc_._h[var1 >> 14] >> 5;
         } else {
            return (long)var1 >= 262144L ? lc_._h[var1 >> 12] >> 6 : lc_._h[var1 >> 10] >> 7;
         }
      } else if (256L > (long)var1) {
         return var1 >= 0 ? lc_._h[var1] >> 12 : -1;
      } else if ((long)var1 >= 4096L) {
         return (long)var1 < 16384L ? lc_._h[var1 >> 6] >> 9 : lc_._h[var1 >> 8] >> 8;
      } else {
         return (long)var1 >= 1024L ? lc_._h[var1 >> 4] >> 10 : lc_._h[var1 >> 2] >> 11;
      }
   }

   private final int a449(lp_ var1, boolean var2) {
      if (var2) {
         this.b786((lp_)null, 45);
      }

      int var3 = this._n[var1._p];
      return 8192 > var3 ? 32 + var3 * var1._i >> 6 : -((-var1._i + 128) * (-var3 + 16384) + 32 >> 6) + 16384;
   }

   private final void d093(int var1, int var2) {
      if (var2 != ~(this._G[var1] & 2)) {
         for(lp_ var3 = (lp_)this._R._q.e024(-24172); null != var3; var3 = (lp_)this._R._q.a024(4)) {
            if (var1 == var3._p && this._u[var1][var3._y] == null && 0 > var3._r) {
               var3._r = 0;
            }
         }
      }

   }

   final synchronized void b093(int var1, int var2) {
      this._x = var1;
      if (var2 != 0) {
         this.a083(true, -114, (vh_)null, false);
      }

   }

   final synchronized void a150(int var1) {
      if (this._A.g801()) {
         int var2 = this._x * this._A._c / vn_._t;

         do {
            long var3 = (long)var1 * (long)var2 + this._z;
            if (this._F - var3 >= 0L) {
               this._z = var3;
               break;
            }

            int var5 = (int)(((long)var2 - 1L + this._F - this._z) / (long)var2);
            this._z += (long)var5 * (long)var2;
            this._R.a150(var5);
            var1 -= var5;
            this.a423((byte)-24);
         } while(this._A.g801());
      }

      this._R.a150(var1);
   }

   final synchronized boolean a688(boolean var1, lc_ var2, nh_ var3, int var4, vh_ var5) {
      var5.a797();
      if (var1) {
         this._u = (lp_[][])((lp_[][])null);
      }

      boolean var6 = true;
      int[] var7 = null;
      if (var4 > 0) {
         var7 = new int[]{var4};
      }

      for(mk_ var8 = (mk_)var5._j.a457(true); var8 != null; var8 = (mk_)var5._j.a024(4318)) {
         int var9 = (int)var8._h;
         kk_ var10 = (kk_)this._W.a722((long)var9, 8);
         if (var10 == null) {
            var10 = dl_.a204(var9, var3);
            if (var10 == null) {
               var6 = false;
               continue;
            }

            this._W.a102(var10, 12460, (long)var9);
         }

         if (!var10.a920((byte)45, var2, var7, var8._k)) {
            var6 = false;
         }
      }

      if (var6) {
         var5.b797();
      }

      return var6;
   }

   private final int b786(lp_ var1, int var2) {
      if (this._V[var1._p] != 0) {
         of_ var3 = var1._A;
         int var4 = 4096 + this._q[var1._p] * this._m[var1._p] >> 13;
         var4 = var4 * var4 + 16384 >> 15;
         var4 = 16384 + var4 * var1._t >> 15;
         var4 = var4 * this._L + 128 >> 8;
         var4 = this._V[var1._p] * var4 + 128 >> 8;
         if (var3._c > 0) {
            var4 = (int)(Math.pow(0.5, (double)var1._k * 1.953125E-5 * (double)var3._c) * (double)var4 + 0.5);
         }

         int var5;
         int var6;
         int var7;
         int var8;
         if (null != var3._n) {
            var5 = var1._u;
            var6 = var3._n[var1._l + 1];
            if (var1._l < var3._n.length - 2) {
               var7 = '\uff00' & var3._n[var1._l] << 8;
               var8 = (255 & var3._n[2 + var1._l]) << 8;
               var6 += (-var6 + var3._n[3 + var1._l]) * (-var7 + var5) / (var8 - var7);
            }

            var4 = var6 * var4 + 32 >> 6;
         }

         if (var2 < var1._r && null != var3._o) {
            var5 = var1._r;
            var6 = var3._o[1 + var1._j];
            if (var1._j < var3._o.length - 2) {
               var7 = (255 & var3._o[var1._j]) << 8;
               var8 = (var3._o[var1._j + 2] & 255) << 8;
               var6 += (-var7 + var5) * (-var6 + var3._o[var1._j + 3]) / (var8 - var7);
            }

            var4 = var4 * var6 + 32 >> 6;
         }

         return var4;
      } else {
         return 0;
      }
   }

   final void a777(lp_ var1, int var2, boolean var3) {
      int var4 = var1._I._k.length;
      int var5;
      if (var3 && var1._I._j) {
         int var6 = -var1._I._l + var4 + var4;
         var5 = (int)((long)var6 * (long)this._o[var1._p] >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var1._v.b487(true);
            var5 = var4 + var4 - 1 - var5;
         }
      } else {
         var5 = (int)((long)var4 * (long)this._o[var1._p] >> 6);
      }

      var1._v.i150(var5);
      if (var2 != 4917) {
         this.a688(false, (lc_)null, (nh_)null, 98, (vh_)null);
      }

   }

   public ug_() {
      this._W = new wa_(128);
      this.a599(256, -1, (byte)-84);
      this.d540(true, 16);
   }

   ug_(ug_ var1) {
      this._W = var1._W;
      this.a599(256, -1, (byte)-63);
      this.d540(true, 16);
   }
}
