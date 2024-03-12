abstract class se_ extends ll_ {
   private lo_[] _x;
   private int[] _z;
   private int[] _G;
   private int[] _M;
   private int[] _Q;
   private byte[] _v;
   int _H;
   int _E;
   int _N;
   private static StringBuilder _J = new StringBuilder(100);
   private int[] _P;
   private int[] _D;
   private static int _L = -1;
   private static int _K = 0;
   int _R = 0;
   private static int _y = 256;
   private static int _F = 256;
   private static int _C = 0;
   private static int _B = 0;
   private static String[] _A = new String[100];
   private static int _I = -1;
   private static int _S = -1;
   private static int _w = -1;
   private static int _O = 0;

   final int c913(String var1, int var2) {
      return this.a899(var1, new int[]{var2}, _A);
   }

   abstract void a033(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7);

   final void a068(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.a326(var4, var5, var6);
         this.b503(var1, var2, var3);
      }
   }

   private static final int a150(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   final int b926(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         char var3 = 0;
         int var4 = 0;
         int var5 = var1.length();

         for(int var6 = 0; var6 < var5; ++var6) {
            char var7 = var1.charAt(var6);
            if (var7 == '<') {
               var2 = var6;
            } else {
               if (var7 == '>' && var2 != -1) {
                  String var8 = var1.substring(var2 + 1, var6).toLowerCase();
                  var2 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else if (var8.equals("gt")) {
                     var7 = '>';
                  } else if (var8.equals("nbsp")) {
                     var7 = 160;
                  } else if (var8.equals("shy")) {
                     var7 = 173;
                  } else if (var8.equals("times")) {
                     var7 = 215;
                  } else if (var8.equals("euro")) {
                     var7 = 8364;
                  } else if (var8.equals("copy")) {
                     var7 = 169;
                  } else {
                     if (!var8.equals("reg")) {
                        if (var8.startsWith("img=")) {
                           try {
                              int var9 = ri_.a034((byte)125, var8.substring(4));
                              var4 += this._x[var9]._d;
                              var3 = 0;
                           } catch (Exception var10) {
                           }
                        }
                        continue;
                     }

                     var7 = 174;
                  }
               }

               if (var2 == -1) {
                  var7 = (char)(hb_.a770(var7) & 255);
                  var4 += this._M[var7];
                  if (this._v != null && var3 != 0) {
                     var4 += this._v[(var3 << 8) + var7];
                  }

                  var3 = var7;
               }
            }
         }

         return var4;
      }
   }

   final void c068(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.a326(var4, var5, var6);
         this.b503(var1, var2 - this.b926(var1), var3);
      }
   }

   private final void a604(byte[] var1) {
      this._M = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this._M.length; ++var2) {
            this._M[var2] = var1[var2] & 255;
         }

         this._R = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this._M[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var7;
         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = (byte)var7;
            }
         }

         byte[][] var12 = new byte[256][];

         for(var7 = 0; var7 < 256; ++var7) {
            var12[var7] = new byte[var10[var7]];
            byte var13 = 0;

            for(int var9 = 0; var9 < var12[var7].length; ++var9) {
               var13 += var1[var2++];
               var12[var7][var9] = var13;
            }
         }

         this._v = new byte[65536];

         for(var7 = 0; var7 < 256; ++var7) {
            if (var7 != 32 && var7 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this._v[(var7 << 8) + var8] = (byte)a150(var11, var12, var4, this._M, var10, var7, var8);
                  }
               }
            }
         }

         this._R = var4[32] + var10[32];
      }

   }

   private final void a913(String var1) {
      try {
         if (var1.startsWith("col=")) {
            _O = hl_.a148(var1.substring(4), 16);
         } else if (var1.equals("/col")) {
            _O = _B;
         } else if (var1.startsWith("trans=")) {
            _F = ri_.a034((byte)79, var1.substring(6));
         } else if (var1.equals("/trans")) {
            _F = _y;
         } else if (var1.startsWith("str=")) {
            _w = hl_.a148(var1.substring(4), 16);
         } else if (var1.equals("str")) {
            _w = 8388608;
         } else if (var1.equals("/str")) {
            _w = -1;
         } else if (var1.startsWith("u=")) {
            _S = hl_.a148(var1.substring(2), 16);
         } else if (var1.equals("u")) {
            _S = 0;
         } else if (var1.equals("/u")) {
            _S = -1;
         } else if (var1.startsWith("shad=")) {
            _L = hl_.a148(var1.substring(5), 16);
         } else if (var1.equals("shad")) {
            _L = 0;
         } else if (var1.equals("/shad")) {
            _L = _I;
         } else if (var1.equals("br")) {
            this.a326(_B, _I, _y);
         }
      } catch (Exception var3) {
      }

   }

   private final void a900(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;
      int var5 = var1.length();

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var1.charAt(var6);
         if (var7 == '<') {
            var4 = true;
         } else if (var7 == '>') {
            var4 = false;
         } else if (!var4 && var7 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         _C = (var2 - this.b926(var1) << 8) / var3;
      }

   }

   private final void b503(String var1, int var2, int var3) {
      var3 -= this._R;
      int var4 = -1;
      char var5 = 0;
      int var6 = var1.length();

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var1.charAt(var7);
         if (var8 == '<') {
            var4 = var7;
         } else {
            int var10;
            if (var8 == '>' && var4 != -1) {
               String var9 = var1.substring(var4 + 1, var7).toLowerCase();
               var4 = -1;
               if (var9.equals("lt")) {
                  var8 = '<';
               } else if (var9.equals("gt")) {
                  var8 = '>';
               } else if (var9.equals("nbsp")) {
                  var8 = 160;
               } else if (var9.equals("shy")) {
                  var8 = 173;
               } else if (var9.equals("times")) {
                  var8 = 215;
               } else if (var9.equals("euro")) {
                  var8 = 8364;
               } else if (var9.equals("copy")) {
                  var8 = 169;
               } else {
                  if (!var9.equals("reg")) {
                     if (var9.startsWith("img=")) {
                        try {
                           var10 = ri_.a034((byte)23, var9.substring(4));
                           lo_ var15 = this._x[var10];
                           int var12 = this._D != null ? this._D[var10] : var15._g;
                           if (_F == 256) {
                              var15.a093(var2, var3 + this._R - var12);
                           } else {
                              var15.a326(var2, var3 + this._R - var12, _F);
                           }

                           var2 += var15._d;
                           var5 = 0;
                        } catch (Exception var13) {
                        }
                     } else {
                        this.a913(var9);
                     }
                     continue;
                  }

                  var8 = 174;
               }
            }

            if (var4 == -1) {
               var8 = (char)(hb_.a770(var8) & 255);
               if (this._v != null && var5 != 0) {
                  var2 += this._v[(var5 << 8) + var8];
               }

               int var14 = this._G[var8];
               var10 = this._Q[var8];
               int var11 = var2;
               if (var8 != ' ') {
                  if (_F == 256) {
                     if (_L != -1) {
                        this.a033(var8, var2 + this._P[var8] + 1, var3 + this._z[var8] + 1, var14, var10, _L, true);
                     }

                     this.a033(var8, var2 + this._P[var8], var3 + this._z[var8], var14, var10, _O, false);
                  } else {
                     if (_L != -1) {
                        this.a566(var8, var2 + this._P[var8] + 1, var3 + this._z[var8] + 1, var14, var10, _L, _F, true);
                     }

                     this.a566(var8, var2 + this._P[var8], var3 + this._z[var8], var14, var10, _O, _F, false);
                  }
               } else if (_C > 0) {
                  _K += _C;
                  var2 += _K >> 8;
                  _K &= 255;
               }

               var2 += this._M[var8];
               if (_w != -1) {
                  gf_.b115(var11, var3 + (int)((double)this._R * 0.7), var2 - var11, _w);
               }

               if (_S != -1) {
                  gf_.b115(var11, var3 + this._R + 1, var2 - var11, _S);
               }

               var5 = var8;
            }
         }
      }

   }

   private final void a326(int var1, int var2, int var3) {
      _w = -1;
      _S = -1;
      _I = var2;
      _L = var2;
      _B = var1;
      _O = var1;
      _y = var3;
      _F = var3;
      _C = 0;
      _K = 0;
   }

   abstract void a566(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8);

   final int a899(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         am_.a541(_J, ' ', 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = -1;
         int var7 = 0;
         byte var8 = 0;
         int var9 = -1;
         char var10 = 0;
         int var11 = 0;
         int var12 = var1.length();

         for(int var13 = 0; var13 < var12; ++var13) {
            char var14 = var1.charAt(var13);
            if (var14 == '<') {
               var9 = var13;
            } else {
               if (var14 == '>' && var9 != -1) {
                  String var15 = var1.substring(var9 + 1, var13).toLowerCase();
                  var9 = -1;
                  _J.append('<');
                  _J.append(var15);
                  _J.append('>');
                  if (var15.equals("br")) {
                     var3[var11] = _J.toString().substring(var5, _J.length());
                     ++var11;
                     var5 = _J.length();
                     var4 = 0;
                     var6 = -1;
                     var10 = 0;
                  } else if (var15.equals("lt")) {
                     var4 += this.a371('<');
                     if (this._v != null && var10 != 0) {
                        var4 += this._v[(var10 << 8) + 60];
                     }

                     var10 = '<';
                  } else if (var15.equals("gt")) {
                     var4 += this.a371('>');
                     if (this._v != null && var10 != 0) {
                        var4 += this._v[(var10 << 8) + 62];
                     }

                     var10 = '>';
                  } else if (var15.equals("nbsp")) {
                     var4 += this.a371(' ');
                     if (this._v != null && var10 != 0) {
                        var4 += this._v[(var10 << 8) + 160];
                     }

                     var10 = 160;
                  } else if (var15.equals("shy")) {
                     var4 += this.a371('\u00ad');
                     if (this._v != null && var10 != 0) {
                        var4 += this._v[(var10 << 8) + 173];
                     }

                     var10 = 173;
                  } else if (var15.equals("times")) {
                     var4 += this.a371('×');
                     if (this._v != null && var10 != 0) {
                        var4 += this._v[(var10 << 8) + 215];
                     }

                     var10 = 215;
                  } else if (var15.equals("euro")) {
                     var4 += this.a371('€');
                     if (this._v != null && var10 != 0) {
                        var4 += this._v[(var10 << 8) + 128];
                     }

                     var10 = 8364;
                  } else if (var15.equals("copy")) {
                     var4 += this.a371('©');
                     if (this._v != null && var10 != 0) {
                        var4 += this._v[(var10 << 8) + 169];
                     }

                     var10 = 169;
                  } else if (var15.equals("reg")) {
                     var4 += this.a371('®');
                     if (this._v != null && var10 != 0) {
                        var4 += this._v[(var10 << 8) + 174];
                     }

                     var10 = 174;
                  } else if (var15.startsWith("img=")) {
                     try {
                        int var16 = ri_.a034((byte)23, var15.substring(4));
                        var4 += this._x[var16]._d;
                        var10 = 0;
                     } catch (Exception var17) {
                     }
                  }

                  var14 = 0;
               }

               if (var9 == -1) {
                  if (var14 != 0) {
                     _J.append(var14);
                     var14 = (char)(hb_.a770(var14) & 255);
                     var4 += this._M[var14];
                     if (this._v != null && var10 != 0) {
                        var4 += this._v[(var10 << 8) + var14];
                     }

                     var10 = var14;
                  }

                  if (var14 == ' ') {
                     var6 = _J.length();
                     var7 = var4;
                     var8 = 1;
                  }

                  if (var2 != null && var4 > var2[var11 < var2.length ? var11 : var2.length - 1] && var6 >= 0) {
                     var3[var11] = _J.toString().substring(var5, var6 - var8);
                     ++var11;
                     var5 = var6;
                     var6 = -1;
                     var4 -= var7;
                     var10 = 0;
                  }

                  if (var14 == '-') {
                     var6 = _J.length();
                     var7 = var4;
                     var8 = 0;
                  }
               }
            }
         }

         if (_J.length() > var5) {
            var3[var11] = _J.toString().substring(var5, _J.length());
            ++var11;
         }

         return var11;
      }
   }

   final int a490(String var1, int var2, int var3) {
      if (var3 == 0) {
         var3 = this._R;
      }

      int var4 = this.a899(var1, new int[]{var2}, _A);
      int var5 = (var4 - 1) * var3;
      return this._H + var5 + this._E;
   }

   final void c191(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.a093(var4, var5);
         this.b503(var1, var2 - this.b926(var1) / 2, var3);
      }
   }

   final int a385(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.a450(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   final int a371(char var1) {
      return this._M[hb_.a770(var1) & 255];
   }

   final int b913(String var1, int var2) {
      int var3 = this.a899(var1, new int[]{var2}, _A);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.b926(_A[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   final int a450(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         this.a326(var6, var7, var8);
         if (var11 == 0) {
            var11 = this._R;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this._H + this._E + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.a899(var1, var12, _A);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this._H;
         } else if (var10 == 1) {
            var14 = var3 + this._H + (var5 - this._H - this._E - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this._E - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this._H - this._E - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this._H + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.b503(_A[var15], var2, var14);
            } else if (var9 == 1) {
               this.b503(_A[var15], var2 + (var4 - this.b926(_A[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.b503(_A[var15], var2 + var4 - this.b926(_A[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.b503(_A[var15], var2, var14);
            } else {
               this.a900(_A[var15], var4);
               this.b503(_A[var15], var2, var14);
               _C = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   final void b068(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.a326(var4, var5, var6);
         this.b503(var1, var2 - this.b926(var1) / 2, var3);
      }
   }

   final void b191(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.a093(var4, var5);
         this.b503(var1, var2, var3);
      }
   }

   final void a191(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.a093(var4, var5);
         this.b503(var1, var2 - this.b926(var1), var3);
      }
   }

   final void a478(lo_[] var1, int[] var2) {
      if (var2 != null && var2.length != var1.length) {
         throw new IllegalArgumentException();
      } else {
         this._x = var1;
         this._D = var2;
      }
   }

   public static void a797() {
      _J = null;
      _A = null;
   }

   private final void a093(int var1, int var2) {
      _w = -1;
      _S = -1;
      _I = var2;
      _L = var2;
      _B = var1;
      _O = var1;
      _y = 256;
      _F = 256;
      _C = 0;
      _K = 0;
   }

   se_(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5) {
      this._P = var2;
      this._z = var3;
      this._G = var4;
      this._Q = var5;
      this.a604(var1);
      int var6 = Integer.MAX_VALUE;
      int var7 = Integer.MIN_VALUE;

      for(int var8 = 0; var8 < 256; ++var8) {
         if (this._z[var8] < var6 && this._Q[var8] != 0) {
            var6 = this._z[var8];
         }

         if (this._z[var8] + this._Q[var8] > var7) {
            var7 = this._z[var8] + this._Q[var8];
         }
      }

      this._H = this._R - var6;
      this._E = var7 - this._R;
      this._N = this._R - this._z[88];
   }
}
