import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class ed_ extends np_ {
   private pd_ _T;
   static String _R = "Any raider setting foot inside this room will quickly be swarmed by a cloud of bloodsucking bats.<br><br>Defeated raiders permanently lose 1 <%attack> and 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";
   private int _S;
   static int _P = 240;
   private int[] _B = new int[4];
   private cn_ _U;
   private int _H;
   private cn_ _Q;
   private int _O;
   private int _V;
   static String _W = "This game has been updated! Please reload this page.";

   static final ab_ a524(String var0) {
      int var1 = var0.length();
      if (var1 != 0) {
         if (255 >= var1) {
            String[] var2 = ih_.a640(86, '.', var0);
            if (var2.length < 2) {
               return ri_._e;
            } else {
               String[] var3 = var2;

               for(int var4 = 0; var4 < var3.length; ++var4) {
                  String var5 = var3[var4];
                  ab_ var6 = ip_.a524(0, var5);
                  if (null != var6) {
                     return var6;
                  }
               }

               return id_.a524(-49, var2[var2.length - 1]);
            }
         } else {
            return ta_._d;
         }
      } else {
         return ri_._e;
      }
   }

   final void a599(int var1, int var2, byte var3) {
      if (super._N) {
         this.e150(76);
         this._U = fa_.a727(super._i + var2, 7, var1 + super._t, super._q, this._U);
         this._Q = fa_.a727(super._i - (-var2 - super._x) - 7, 7, var1 + super._t, super._q, this._Q);
         super.a599(var1, var2, (byte)-87);
         if (this._T._w) {
            this._T.a599(var1, var2, (byte)122);
         }

      }
   }

   final void a183(boolean var1, int var2, int var3) {
      this._T.e326(0, var2 - super._q, 105);
      this._T.a183(var1, 8, var3 - 4);
      super.a183(false, var2, var3);
   }

   private final void e423(byte var1) {
      this._T = new pd_(super._t - 8 + super._q, super._i + 8, 5, super._x - 16, 65536, 0);
      if (var1 >= -30) {
         _R = (String)null;
      }

      this._S = 0;
   }

   private final int d474(boolean var1) {
      if (null != super._J) {
         int var2 = Integer.MAX_VALUE;
         int var3 = 0;

         for(rj_ var4 = (rj_)super._J.e024(-24172); null != var4; var4 = (rj_)super._J.a024(4)) {
            int var5 = -super._i + var4._i;
            int var6 = -super._i + var4._x + var4._i;
            if (var5 < var2) {
               var2 = var5;
            }

            if (var3 < var6) {
               var3 = var6;
            }
         }

         if (!var1) {
            c491(true);
         }

         return -var2 + var3;
      } else {
         return 0;
      }
   }

   final void e150(int var1) {
      int var2 = this.d474(true) + 15;
      if (this._S != this._T._z || this._H != var2 || this._V != super._x) {
         int var3 = var2 - super._x;
         int var4;
         if (0 >= var3) {
            this._T._w = false;
            if (null != super._J) {
               for(rj_ var6 = (rj_)super._J.e024(-24172); var6 != null; var6 = (rj_)super._J.a024(4)) {
                  var6.e326(this._O, 0, 77);
               }
            }

            this._O = 0;
         } else {
            this._T._w = true;
            var4 = -(this._T._z * var3 / this._T._C) + this._O;
            if (super._J != null) {
               for(rj_ var5 = (rj_)super._J.e024(-24172); null != var5; var5 = (rj_)super._J.a024(4)) {
                  var5.e326(var4, 0, 101);
               }
            }

            this._O -= var4;
         }

         this._S = this._T._z;
         if (0 < var3) {
            var4 = this._T._C * 32 / var3;
            if (this._T._D < var4) {
               this._T._D = var4;
            }

            if (this._T._H < var4 >> 1) {
               this._T._H = var4 >> 1;
            }
         }

         this._V = super._x;
         this._H = var2;
      }

      if (var1 < 32) {
         this._T = (pd_)null;
      }

   }

   final void e326(int var1, int var2, int var3) {
      this._T.e326(var1, var2, 75);
      if (var3 > 69) {
         super.e326(var1, var2, 121);
      }
   }

   final void b326(int var1, int var2, int var3) {
      if (super._N) {
         this.e150(66);
         super.b326(var1, var2, var3);
         if (this._T._w) {
            this._T.b326(var1, var2 + 0, var3);
         }

         int var4 = var1 + super._t;
         int var5 = super._i + var3;
         gf_.a331(this._B);
         int var6;
         if (this._U != null) {
            for(var6 = 0; 7 > var6; ++var6) {
               gf_.e115(var4, var6 + var5, var4 + super._q, var5 - (-var6 - 1));
               this._U.d326(var4, var5, 32 * (-var6 + 7));
            }
         }

         if (this._Q != null) {
            for(var6 = 0; var6 < 7; ++var6) {
               gf_.e115(var4, var5 + super._x - 7 + var6, super._q + var4, var5 + super._x - 6 + var6);
               this._Q.d326(var4, var5 + super._x - 7, (var6 + 1) * 32);
            }
         }

         gf_.b331(this._B);
      }
   }

   final void a093(int var1, int var2) {
      this._T.a093(var1, var2);
   }

   final void a720(rj_ var1, byte var2) {
      var1.e326(10 + this._O, 0, 79);
      if (var2 > -27) {
         a524((String)null);
      }

      super.a720(var1, (byte)-76);
   }

   public static void f423() {
      _W = null;
      _R = null;
   }

   static final void a029(String var0, int var1, int var2, String var3, int var4) {
      kn_.a020(var4, var0, var2, var1, 125, 96, (String)null, var3);
   }

   static final boolean c491(boolean var0) {
      if (!var0) {
         a587(96, 83, -11, -63);
      }

      return tl_._l;
   }

   final void c093(int var1, int var2) {
      if (this._T._w) {
         int var3 = this.d474(true) + 20;
         int var4 = var3 - super._x;
         if (var1 <= 23) {
            this._B = (int[])null;
         }

         this._T._z = this._T._C * var2 / var4;
         this.e150(77);
      }
   }

   final void e487(boolean var1) {
      if (var1) {
         this._T._z = 0;
         this.e150(95);
      }
   }

   static final void a707(boolean var0, wj_ var1) {
      oe_ var2 = (oe_)fe_._k.e024(-24172);
      if (var2 != null) {
         boolean var3 = false;

         int var4;
         for(var4 = 0; var4 < var2._q; ++var4) {
            if (null != var2._s[var4]) {
               if (2 == var2._s[var4]._c) {
                  var2._r[var4] = -5;
               }

               if (var2._s[var4]._c == 0) {
                  var3 = true;
               }
            }

            if (null != var2._o[var4]) {
               if (var2._o[var4]._c == 2) {
                  var2._r[var4] = -6;
               }

               if (var2._o[var4]._c == 0) {
                  var3 = true;
               }
            }
         }

         if (!var3) {
            var4 = var1._o;
            var1.a556((byte)63, var2._j);

            for(int var5 = 0; var2._q > var5; ++var5) {
               if (0 != var2._r[var5]) {
                  var1.a093(6, var2._r[var5]);
               } else {
                  try {
                     int var6 = var2._n[var5];
                     Field var7;
                     int var8;
                     if (var6 != 0) {
                        if (1 == var6) {
                           var7 = (Field)var2._s[var5]._f;
                           var7.setInt((Object)null, var2._l[var5]);
                           var1.a093(6, 0);
                        } else if (var6 == 2) {
                           var7 = (Field)var2._s[var5]._f;
                           var8 = var7.getModifiers();
                           var1.a093(6, 0);
                           var1.a556((byte)63, var8);
                        }
                     } else {
                        var7 = (Field)var2._s[var5]._f;
                        var8 = var7.getInt((Object)null);
                        var1.a093(6, 0);
                        var1.a556((byte)63, var8);
                     }

                     Method var24;
                     if (var6 != 3) {
                        if (var6 == 4) {
                           var24 = (Method)var2._o[var5]._f;
                           var8 = var24.getModifiers();
                           var1.a093(6, 0);
                           var1.a556((byte)63, var8);
                        }
                     } else {
                        var24 = (Method)var2._o[var5]._f;
                        byte[][] var25 = var2._k[var5];
                        Object[] var9 = new Object[var25.length];

                        for(int var10 = 0; var10 < var25.length; ++var10) {
                           ObjectInputStream var11 = new ObjectInputStream(new ByteArrayInputStream(var25[var10]));
                           var9[var10] = var11.readObject();
                        }

                        Object var26 = var24.invoke((Object)null, var9);
                        if (null != var26) {
                           if (!(var26 instanceof Number)) {
                              if (!(var26 instanceof String)) {
                                 var1.a093(6, 4);
                              } else {
                                 var1.a093(6, 2);
                                 var1.b627((String)var26, (byte)-20);
                              }
                           } else {
                              var1.a093(6, 1);
                              var1.a054(63, ((Number)var26).longValue());
                           }
                        } else {
                           var1.a093(6, 0);
                        }
                     }
                  } catch (ClassNotFoundException var12) {
                     var1.a093(6, -10);
                  } catch (InvalidClassException var13) {
                     var1.a093(6, -11);
                  } catch (StreamCorruptedException var14) {
                     var1.a093(6, -12);
                  } catch (OptionalDataException var15) {
                     var1.a093(6, -13);
                  } catch (IllegalAccessException var16) {
                     var1.a093(6, -14);
                  } catch (IllegalArgumentException var17) {
                     var1.a093(6, -15);
                  } catch (InvocationTargetException var18) {
                     var1.a093(6, -16);
                  } catch (SecurityException var19) {
                     var1.a093(6, -17);
                  } catch (IOException var20) {
                     var1.a093(6, -18);
                  } catch (NullPointerException var21) {
                     var1.a093(6, -19);
                  } catch (Exception var22) {
                     var1.a093(6, -20);
                  } catch (Throwable var23) {
                     var1.a093(6, -21);
                  }
               }
            }

            var1.c543((byte)-106, var4);
            var2.a487(var0);
         }
      }
   }

   static final void a587(int var0, int var1, int var2, int var3) {
      int var4 = gm_._d._L[var2]._a;
      if (null != qj_._c[var2]) {
         var4 = qj_._c[var2]._a;
      }

      if (gh_._i[var4]._g == 2) {
         cn_ var5 = jb_.a574(var4);
         if (var5 != null) {
            int var6 = var5._E * 5 >> 3;
            int var7 = 5 * var5._G >> 3;
            var5.b050(var1 + (-var6 + 48 >> 1), -var7 + 40 + var0, var6, var7, var3);
         }
      }

      dm_._a[var4].e326(var1, var0 + 1, var3);
   }

   final rj_ a759(int var1, int var2, int var3) {
      if (var1 > -10) {
         this.e326(-111, 75, 17);
      }

      if (super._w && this._T._w) {
         rj_ var4 = this._T.a759(-19, var2, var3);
         if (null != var4) {
            return var4;
         }
      }

      return super.a759(-65, var2, var3);
   }

   ed_(int var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.e423((byte)-40);
   }

   final void b423(byte var1) {
      this._T.b423(var1);
      super.b423((byte)30);
   }
}
