final class nh_ {
   static String _i = "<%0> active";
   private boolean _d;
   static String _a = "There is nothing in this room to trouble a party of raiders.";
   private qa_ _f;
   private Object[] _j;
   private Object[][] _c;
   private int _g;
   static boolean _e;
   private tm_ _h = null;
   static String _b = "Raider was detected by guardian, which alerted the monsters of the dungeon.";
   static int _k;

   final boolean a213(boolean var1, String var2) {
      if (this.a154(-14354)) {
         if (var1) {
            return true;
         } else {
            var2 = var2.toLowerCase();
            int var3 = this._h._a.a080(to_.a789(123, var2), -117);
            return this.a544(var1, var3);
         }
      } else {
         return false;
      }
   }

   private final synchronized void d093(int var1, int var2) {
      if (!this._d) {
         this._j[var1] = kj_.a534(false, this._f.a104(var1, -7249));
      } else {
         this._j[var1] = this._f.a104(var1, -7249);
      }

      if (var2 != -23889) {
         this.a544(false, -26);
      }

   }

   final synchronized boolean a154(int var1) {
      if (this._h == null) {
         this._h = this._f.a010(var1 + '龼');
         if (this._h == null) {
            return false;
         }

         this._j = new Object[this._h._l];
         this._c = new Object[this._h._l][];
      }

      if (var1 != -14354) {
         this.a330(((int[])((int[])this._j[21]))[0], 48, -75);
      }

      return true;
   }

   static final void c487() {
      cd_._f = new rg_();
      ta_._a.b340(1, cd_._f);
   }

   static final void a541(nh_ var0, mb_ var1, int var2) {
      hh_._b = eg_.c137() * var2 / 1000;
      ac_.a572(var0);
      kd_.a253(var0);
      ob_.a572(var0);
      ck_.e423((byte)65);
      hn_.d423((byte)-117);
      nl_._d = -hh_._b + 0;
   }

   final int b080(int var1, int var2) {
      if (!this.e097(-1, var1)) {
         return 0;
      } else {
         if (var2 != 0) {
            ((byte[])((byte[])((Object[])((Object[])this._j[3]))[14]))[11] = 119;
         }

         return this._h._i[var1];
      }
   }

   public static void a487(boolean var0) {
      _i = null;
      _a = null;
      if (!var0) {
         _b = null;
      }
   }

   final boolean c896(String var1, int var2) {
      if (!this.a154(-14354)) {
         return false;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this._h._a.a080(to_.a789(var2 ^ 122, var1), -125);
         return var2 <= var3;
      }
   }

   final int b913(String var1, int var2) {
      if (!this.a154(var2 ^ 14353)) {
         return 0;
      } else {
         var1 = var1.toLowerCase();
         if (var2 != -1) {
            return ((int[])((int[])this._j[1]))[0];
         } else {
            int var3 = this._h._a.a080(to_.a789(115, var1), -119);
            return this.c080(var2 ^ 123, var3);
         }
      }
   }

   private final synchronized byte[] a538(int[] var1, int var2, byte var3, int var4) {
      if (!this.a603(var4, var2, (byte)-119)) {
         return null;
      } else {
         byte[] var6 = null;
         if (this._c[var2] == null || this._c[var2][var4] == null) {
            boolean var7 = this.a972(var1, var4, var2, -12028);
            if (!var7) {
               this.d093(var2, -23889);
               var7 = this.a972(var1, var4, var2, -12028);
               if (!var7) {
                  return null;
               }
            }
         }

         if (this._c[var2] != null) {
            if (null != this._c[var2][var4]) {
               var6 = dn_.a044(this._c[var2][var4], false, (byte)48);
               if (null == var6) {
                  throw new RuntimeException("");
               }
            }

            if (null != var6) {
               if (this._g != 1) {
                  if (2 == this._g) {
                     this._c[var2] = null;
                  }
               } else {
                  this._c[var2][var4] = null;
                  if (this._h._i[var2] == 1) {
                     this._c[var2] = null;
                  }
               }
            }

            return var6;
         } else {
            throw new RuntimeException("");
         }
      }
   }

   final boolean b671(String var1, String var2, byte var3) {
      if (!this.a154(var3 - 14272)) {
         return false;
      } else {
         var2 = var2.toLowerCase();
         if (var3 != -82) {
            this.b671((String)null, (String)null, (byte)88);
         }

         var1 = var1.toLowerCase();
         int var4 = this._h._a.a080(to_.a789(121, var2), -120);
         if (var4 >= 0) {
            int var5 = this._h._n[var4].a080(to_.a789(121, var1), -126);
            return 0 <= var5;
         } else {
            return false;
         }
      }
   }

   final synchronized boolean a330(int var1, int var2, int var3) {
      if (var2 != 2) {
         _b = (String)this._j[5];
      }

      if (!this.a603(var1, var3, (byte)-122)) {
         return false;
      } else if (null != this._c[var3] && this._c[var3][var1] != null) {
         return true;
      } else if (null != this._j[var3]) {
         return true;
      } else {
         this.d093(var3, -23889);
         return null != this._j[var3];
      }
   }

   final synchronized boolean a544(boolean var1, int var2) {
      if (!this.e097(-1, var2)) {
         return false;
      } else if (null != this._j[var2]) {
         return true;
      } else {
         this.d093(var2, -23889);
         if (var1) {
            return false;
         } else {
            return null != this._j[var2];
         }
      }
   }

   final boolean a822(int var1, String var2, String var3) {
      if (!this.a154(var1 ^ 3479)) {
         return false;
      } else {
         if (var1 != -13703) {
            this.a026(110, (String)null, 85);
         }

         var3 = var3.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this._h._a.a080(to_.a789(115, var3), -121);
         if (!this.e097(var1 + 13702, var4)) {
            return false;
         } else {
            int var5 = this._h._n[var4].a080(to_.a789(117, var2), -117);
            return this.a330(var5, 2, var4);
         }
      }
   }

   final synchronized byte[] a826(String var1, String var2, byte var3) {
      if (!this.a154(-14354)) {
         return null;
      } else {
         var1 = var1.toLowerCase();
         if (var3 >= -106) {
            this._j = (Object[])null;
         }

         var2 = var2.toLowerCase();
         int var4 = this._h._a.a080(to_.a789(116, var1), -121);
         if (!this.e097(-1, var4)) {
            return null;
         } else {
            int var5 = this._h._n[var4].a080(to_.a789(118, var2), -124);
            return this.b337(5, var4, var5);
         }
      }
   }

   final synchronized int b137(int var1) {
      if (!this.a154(var1 ^ -14454)) {
         return 0;
      } else {
         int var2 = 0;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this._j.length; ++var4) {
            if (0 < this._h._k[var4]) {
               var2 += 100;
               var3 += this.c080(-126, var4);
            }
         }

         if (var2 == 0) {
            return 100;
         } else {
            var4 = var1 * var3 / var2;
            return var4;
         }
      }
   }

   final int a913(String var1, int var2) {
      if (!this.a154(-14354)) {
         return -1;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this._h._a.a080(to_.a789(118, var1), var2 - 1119);
         if (this.e097(var2 ^ -1001, var3)) {
            if (var2 != 1000) {
               c487();
            }

            return var3;
         } else {
            return -1;
         }
      }
   }

   final synchronized int c080(int var1, int var2) {
      if (!this.e097(-1, var2)) {
         return 0;
      } else {
         return this._j[var2] != null ? 100 : this._f.b080(var2, 27318);
      }
   }

   private final synchronized boolean a972(int[] var1, int var2, int var3, int var4) {
      if (!this.e097(-1, var3)) {
         return false;
      } else if (this._j[var3] == null) {
         return false;
      } else {
         int var5 = this._h._k[var3];
         int[] var6 = this._h._m[var3];
         if (null == this._c[var3]) {
            this._c[var3] = new Object[this._h._i[var3]];
         }

         Object[] var7 = this._c[var3];
         boolean var8 = true;
         if (var4 != -12028) {
            return ((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])this._j[0]))[0]))[7]))[13];
         } else {
            for(int var9 = 0; var5 > var9; ++var9) {
               int var10;
               if (var6 != null) {
                  var10 = var6[var9];
               } else {
                  var10 = var9;
               }

               if (var7[var10] == null) {
                  var8 = false;
                  break;
               }
            }

            if (var8) {
               return true;
            } else {
               byte[] var22;
               if (var1 == null || 0 == var1[0] && var1[1] == 0 && 0 == var1[2] && var1[3] == 0) {
                  var22 = dn_.a044(this._j[var3], false, (byte)48);
               } else {
                  var22 = dn_.a044(this._j[var3], true, (byte)48);
                  ec_ var23 = new ec_(var22);
                  var23.a332(var23._m.length, var1, 5, -10708);
               }

               byte[] var24 = lc_.a266(var22);
               if (this._d) {
                  this._j[var3] = null;
               }

               int var11;
               if (var5 <= 1) {
                  if (null == var6) {
                     var11 = 0;
                  } else {
                     var11 = var6[0];
                  }

                  if (0 == this._g) {
                     var7[var11] = kj_.a534(false, var24);
                  } else {
                     var7[var11] = var24;
                  }
               } else {
                  int var12;
                  ec_ var13;
                  int var15;
                  int var16;
                  int var17;
                  int var18;
                  int var19;
                  if (this._g != 2) {
                     var11 = var24.length;
                     --var11;
                     var12 = var24[var11] & 255;
                     var11 -= var5 * var12 * 4;
                     var13 = new ec_(var24);
                     int[] var14 = new int[var5];
                     var13._o = var11;

                     for(var15 = 0; var12 > var15; ++var15) {
                        var16 = 0;

                        for(var17 = 0; var5 > var17; ++var17) {
                           var16 += var13.h137(-121);
                           var14[var17] += var16;
                        }
                     }

                     byte[][] var26 = new byte[var5][];

                     for(var16 = 0; var5 > var16; ++var16) {
                        var26[var16] = new byte[var14[var16]];
                        var14[var16] = 0;
                     }

                     var13._o = var11;
                     var16 = 0;

                     for(var17 = 0; var17 < var12; ++var17) {
                        var18 = 0;

                        for(var19 = 0; var5 > var19; ++var19) {
                           var18 += var13.h137(-117);
                           cj_.a278(var24, var16, var26[var19], var14[var19], var18);
                           var16 += var18;
                           var14[var19] += var18;
                        }
                     }

                     for(var17 = 0; var17 < var5; ++var17) {
                        if (null != var6) {
                           var18 = var6[var17];
                        } else {
                           var18 = var17;
                        }

                        if (0 == this._g) {
                           var7[var18] = kj_.a534(false, var26[var17]);
                        } else {
                           var7[var18] = var26[var17];
                        }
                     }
                  } else {
                     var11 = var24.length;
                     --var11;
                     var12 = var24[var11] & 255;
                     var11 -= 4 * var12 * var5;
                     var13 = new ec_(var24);
                     int var25 = 0;
                     var13._o = var11;
                     var15 = 0;

                     for(var16 = 0; var12 > var16; ++var16) {
                        var17 = 0;

                        for(var18 = 0; var5 > var18; ++var18) {
                           var17 += var13.h137(var4 ^ 11905);
                           if (null != var6) {
                              var19 = var6[var18];
                           } else {
                              var19 = var18;
                           }

                           if (var19 == var2) {
                              var15 = var19;
                              var25 += var17;
                           }
                        }
                     }

                     if (0 == var25) {
                        return true;
                     }

                     byte[] var27 = new byte[var25];
                     var13._o = var11;
                     var25 = 0;
                     var17 = 0;

                     for(var18 = 0; var18 < var12; ++var18) {
                        var19 = 0;

                        for(int var20 = 0; var20 < var5; ++var20) {
                           var19 += var13.h137(-35);
                           int var21;
                           if (null != var6) {
                              var21 = var6[var20];
                           } else {
                              var21 = var20;
                           }

                           if (var2 == var21) {
                              cj_.a278(var24, var17, var27, var25, var19);
                              var25 += var19;
                           }

                           var17 += var19;
                        }
                     }

                     var7[var15] = var27;
                  }
               }

               return true;
            }
         }
      }
   }

   final byte[] b337(int var1, int var2, int var3) {
      if (var1 != 5) {
         _b = (String)null;
      }

      return this.a538((int[])null, var2, (byte)76, var3);
   }

   final int b474(boolean var1) {
      if (!var1) {
         this.a104(((int[])((int[])this._j[3]))[0], 56);
      }

      return this.a154(-14354) ? this._h._i.length : -1;
   }

   private final synchronized boolean e097(int var1, int var2) {
      if (!this.a154(-14354)) {
         return false;
      } else if (~var2 <= var1 && var2 < this._h._i.length && this._h._i[var2] != 0) {
         return true;
      } else if (!ro_._u) {
         return false;
      } else {
         throw new IllegalArgumentException(Integer.toString(var2));
      }
   }

   final synchronized boolean a427(byte var1) {
      if (!this.a154(-14354)) {
         return false;
      } else {
         boolean var2 = true;

         for(int var3 = 0; this._h._j.length > var3; ++var3) {
            int var4 = this._h._j[var3];
            if (null == this._j[var4]) {
               this.d093(var4, var1 ^ -23916);
               if (this._j[var4] == null) {
                  var2 = false;
               }
            }
         }

         if (var1 != 59) {
            this.a104(((int[])((int[])this._j[5]))[0], -79);
         }

         return var2;
      }
   }

   final synchronized byte[] a104(int var1, int var2) {
      if (!this.a154(var1 ^ 8699)) {
         return null;
      } else if (1 == this._h._i.length) {
         return this.b337(var1 + 6640, 0, var2);
      } else if (!this.e097(-1, var2)) {
         return null;
      } else if (1 != this._h._i[var2]) {
         if (var1 != -6635) {
            this._j[3] = this._j[3];
         }

         throw new RuntimeException();
      } else {
         return this.b337(5, var2, 0);
      }
   }

   nh_(qa_ var1, boolean var2, int var3) {
      if (0 <= var3 && 2 >= var3) {
         this._f = var1;
         this._d = var2;
         this._g = var3;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   private final synchronized boolean a603(int var1, int var2, byte var3) {
      if (!this.a154(-14354)) {
         return false;
      } else if (var2 >= 0 && 0 <= var1 && this._h._i.length > var2 && this._h._i[var2] > var1) {
         if (var3 >= -100) {
            this.a913((String)this._j[1], -34);
         }

         return true;
      } else if (!ro_._u) {
         return false;
      } else {
         throw new IllegalArgumentException(var2 + " " + var1);
      }
   }

   final int a026(int var1, String var2, int var3) {
      if (var1 != 0) {
         return 42;
      } else if (!this.e097(-1, var3)) {
         return -1;
      } else {
         var2 = var2.toLowerCase();
         int var4 = this._h._n[var3].a080(to_.a789(121, var2), -125);
         return !this.a603(var4, var3, (byte)-109) ? -1 : var4;
      }
   }
}
