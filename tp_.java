import java.io.IOException;

final class tp_ extends bb_ {
   static String _z = "Orb of Majesty";
   static ef_ _B = new ef_();
   static String[] _A = new String[]{null, "After selecting your target, you now need to choose which <%raiders> will form the party to send out. Select up to four <%raiders> by <col=FF0000>left-clicking on them</col>, then <col=FF0000>click 'Raid' to continue</col>. Remember to take a selection of <%raiders> with skills to overcome any form of defence you might encounter."};
   private rk_ _D;
   static String _u = "DUNGEON ASSAULT";
   static String[] _C = new String[]{"Surprise", "There are other aspects to combat between raiders and monsters; first is the element of <%highlight>surprise</col>. If your raider succeeds in surprising the monster, it will be able to <%highlight>strike first</col> - coupled with a high <%attack> skill, your raider may be able to defeat the monster before it gets a chance to strike back."};
   static String _w = "Sort rooms by <%0>";
   static ad_ _y = new ad_(2, 4, 4, 0);
   static String _v;
   static String _x = "This password contains your email address, and would be easy to guess";

   public static void h150(int var0) {
      _C = null;
      _y = null;
      _u = null;
      _z = null;
      _B = null;
      _x = null;
      _w = null;
      _A = null;
      if (var0 < 0) {
         _B = (ef_)null;
      }

      _v = null;
   }

   final void f150(int var1) {
      try {
         this._D.c150(-6624);
      } catch (Exception var3) {
      }

      super._c = -1;
      this._D = null;
      ++super._h;
      super._j = (byte)((int)(1.0 + 255.0 * Math.random()));
   }

   static final boolean c427() {
      return in_._E;
   }

   final void a150(int var1) {
      if (null != this._D) {
         this._D.c150(-6624);
      }

      if (var1 != -1016) {
         _u = (String)null;
      }

   }

   final boolean b427(byte var1) {
      if (null != this._D) {
         long var2 = kd_.c138(-2456);
         int var4 = (int)(-super._n + var2);
         super._n = var2;
         if (var4 > 200) {
            var4 = 200;
         }

         super._a += var4;
         if (super._a > 30000) {
            try {
               this._D.c150(-6624);
            } catch (Exception var17) {
            }

            this._D = null;
         }
      }

      if (null == this._D) {
         return this.c137(20) == 0 && 0 == this.e137(20);
      } else {
         try {
            if (var1 <= 6) {
               return true;
            } else {
               this._D.b150(-89);

               em_ var19;
               for(var19 = (em_)super._g.c729(13395); var19 != null; var19 = (em_)super._g.a786((byte)111)) {
                  super._o._o = 0;
                  super._o.a093(6, 1);
                  super._o.a884(var19._o, 836);
                  this._D.b120(super._o._m, false, 0, super._o._m.length);
                  super._p.a857(var19, -32711);
               }

               for(var19 = (em_)super._d.c729(13395); var19 != null; var19 = (em_)super._d.a786((byte)102)) {
                  super._o._o = 0;
                  super._o.a093(6, 0);
                  super._o.a884(var19._o, 836);
                  this._D.b120(super._o._m, false, 0, super._o._m.length);
                  super._s.a857(var19, -32711);
               }

               for(int var20 = 0; 100 > var20; ++var20) {
                  int var3 = this._D.a137(0);
                  if (0 > var3) {
                     throw new IOException();
                  }

                  if (var3 == 0) {
                     break;
                  }

                  super._a = 0;
                  byte var21 = 0;
                  if (null == super._i) {
                     var21 = 10;
                  } else if (super._i._G == 0) {
                     var21 = 1;
                  }

                  int var5;
                  int var6;
                  int var7;
                  ec_ var22;
                  if (var21 <= 0) {
                     var5 = super._i._D._m.length - super._i._E;
                     var6 = 512 - super._i._G;
                     if (var6 > var5 - super._i._D._o) {
                        var6 = -super._i._D._o + var5;
                     }

                     if (var3 < var6) {
                        var6 = var3;
                     }

                     this._D.a120(super._i._D._m, false, var6, super._i._D._o);
                     if (super._j != 0) {
                        for(var7 = 0; var6 > var7; ++var7) {
                           super._i._D._m[super._i._D._o + var7] = (byte)md_.b080(super._i._D._m[super._i._D._o + var7], super._j);
                        }
                     }

                     em_ var10000 = super._i;
                     var10000._G += var6;
                     var22 = super._i._D;
                     var22._o += var6;
                     if (super._i._D._o == var5) {
                        super._i.b423((byte)-2);
                        super._i._v = false;
                        super._i = null;
                     } else if (super._i._G == 512) {
                        super._i._G = 0;
                     }
                  } else {
                     var5 = var21 - super._m._o;
                     if (var3 < var5) {
                        var5 = var3;
                     }

                     this._D.a120(super._m._m, false, var5, super._m._o);
                     if (0 != super._j) {
                        for(var6 = 0; var6 < var5; ++var6) {
                           super._m._m[var6 + super._m._o] = (byte)md_.b080(super._m._m[var6 + super._m._o], super._j);
                        }
                     }

                     var22 = super._m;
                     var22._o += var5;
                     if (var21 <= super._m._o) {
                        if (super._i == null) {
                           super._m._o = 0;
                           var6 = super._m.c474(true);
                           var7 = super._m.h137(-87);
                           int var8 = super._m.c474(true);
                           int var9 = super._m.h137(-100);
                           int var10 = var8 & 127;
                           boolean var11 = 0 != (128 & var8);
                           long var12 = (long)var7 + ((long)var6 << 32);
                           em_ var14 = null;
                           if (var11) {
                              for(var14 = (em_)super._s.c729(13395); null != var14 && var12 != var14._o; var14 = (em_)super._s.a786((byte)66)) {
                              }
                           } else {
                              for(var14 = (em_)super._p.c729(13395); var14 != null && var14._o != var12; var14 = (em_)super._p.a786((byte)117)) {
                              }
                           }

                           if (var14 == null) {
                              throw new IOException();
                           }

                           int var15 = var10 == 0 ? 5 : 9;
                           super._i = var14;
                           super._i._D = new ec_(super._i._E + var15 + var9);
                           super._i._D.a093(6, var10);
                           super._i._D.a556((byte)63, var9);
                           super._i._G = 10;
                           super._m._o = 0;
                        } else {
                           if (super._i._G != 0) {
                              throw new IOException();
                           }

                           if (-1 != super._m._m[0]) {
                              super._i = null;
                           } else {
                              super._m._o = 0;
                              super._i._G = 1;
                           }
                        }
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               this._D.c150(-6624);
            } catch (Exception var16) {
            }

            super._c = -2;
            ++super._h;
            this._D = null;
            return this.c137(20) == 0 && 0 == this.e137(20);
         }
      }
   }

   private final void g150(int var1) {
      if (null != this._D) {
         try {
            super._o._o = 0;
            super._o.a093(6, 6);
            super._o.b556((byte)-106, 3);
            super._o.i093(0, -95);
            this._D.b120(super._o._m, false, 0, super._o._m.length);
            if (var1 != -30001) {
               a267((nh_)null, (String)null, (String)null, -28);
            }
         } catch (IOException var5) {
            try {
               this._D.c150(-6624);
            } catch (Exception var4) {
            }

            super._c = -2;
            this._D = null;
            ++super._h;
         }

      }
   }

   static final void a132(int var0, float var1, String var2) {
      lj_._e = var2;
      if (var0 != 10) {
         h150(-5);
      }

      lc_._e = var1;
   }

   final void a993(Object var1, boolean var2, byte var3) {
      if (null != this._D) {
         try {
            this._D.c150(var3 ^ -6570);
         } catch (Exception var8) {
         }

         this._D = null;
      }

      this._D = (rk_)var1;
      this.g150(-30001);
      this.a540(var2, 5391);
      if (var3 != 118) {
         _x = (String)null;
      }

      super._i = null;
      super._m._o = 0;

      while(true) {
         em_ var4 = (em_)super._p.a729(-8);
         if (null == var4) {
            while(true) {
               var4 = (em_)super._s.a729(121);
               if (null == var4) {
                  if (super._j != 0) {
                     try {
                        super._o._o = 0;
                        super._o.a093(6, 4);
                        super._o.a093(6, super._j);
                        super._o.a556((byte)63, 0);
                        this._D.b120(super._o._m, false, 0, super._o._m.length);
                     } catch (IOException var7) {
                        try {
                           this._D.c150(-6624);
                        } catch (Exception var6) {
                        }

                        this._D = null;
                        super._c = -2;
                        ++super._h;
                     }
                  }

                  super._a = 0;
                  super._n = kd_.c138(-2456);
                  return;
               }

               super._d.a857(var4, -32711);
            }
         }

         super._g.a857(var4, -32711);
      }
   }

   private final void a540(boolean var1, int var2) {
      if (this._D != null) {
         try {
            super._o._o = 0;
            super._o.a093(6, !var1 ? 3 : 2);
            super._o.a884(0L, 836);
            this._D.b120(super._o._m, false, 0, super._o._m.length);
         } catch (IOException var6) {
            try {
               this._D.c150(var2 - 12015);
            } catch (Exception var5) {
            }

            ++super._h;
            this._D = null;
            super._c = -2;
         }

         if (var2 != 5391) {
            _x = (String)null;
         }

      }
   }

   public tp_() {
   }

   static final eh_ a267(nh_ var0, String var1, String var2, int var3) {
      eh_ var4 = new eh_();
      var4._i = var1;
      var4._b = var2;
      var4._d = var0;
      byte[] var5 = var0.a826("config", var2 + "/" + var1, (byte)-128);
      ec_ var6 = new ec_(var5);
      var4._c = (var5.length - 4) / 2;
      var4._j = new int[var4._c];
      var4._l = null;
      var4._f = 0;
      var4._k = new int[var4._c];
      var4._g = var6.k137(0);
      var4._m = var6.k137(0);

      for(int var7 = 0; var4._c > var7; ++var7) {
         int var8 = var6.c474(true);
         int var9 = 10 * var6.c474(true);
         var4._k[var7] = var8;
         var4._j[var7] = var9;
         var4._f += var9;
      }

      return var3 != -1998 ? (eh_)null : var4;
   }
}
