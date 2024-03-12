final class pj_ {
   static int[] _e;
   static boolean[] _w = new boolean[64];
   wm_ _v;
   static int _x = 0;
   String _f;
   static gk_ _c;
   static String _n = "Email address is unavailable";
   static int _a;
   static int _r;
   ai_[] _h;
   wm_ _p;
   static volatile long _z = 0L;
   wm_ _j;
   private wm_ _d;
   int _i;
   int _B;
   int _g;
   int _y;
   int _t;
   hb_ _u;
   int _k;
   hb_[] _A;
   private int _s;
   int _q;
   int _l;
   int _o;
   private wm_ _b;
   wm_ _m;

   pj_(ec_ var1, boolean var2) {
      this();
      this.a785(111, var2, var1);
   }

   private final void a326(int var1, int var2, int var3) {
      if (var2 > 0) {
         boolean var4 = 6 < var3;
         if (var1 != -3) {
            this.a078(-113, (ai_)null, (byte)-64, true);
         }

         boolean var5 = var3 < 42;
         boolean var6 = var3 % 7 != 0;
         boolean var7 = var3 % 7 != 6;
         int var8;
         ai_ var10;
         if (var4 && var6) {
            var8 = var3 - 8;
            if (!this._j.a370(var8, (byte)79)) {
               var10 = this._h[var8];
               if (var10._h != null && 2 == var10._h._g) {
                  var10._q += var2;
               }
            }
         }

         if (var4) {
            var8 = var3 - 7;
            if (!this._j.a370(var8, (byte)78)) {
               var10 = this._h[var8];
               if (null != var10._h && 2 == var10._h._g) {
                  var10._q += var2;
               }
            }
         }

         if (var4 && var7) {
            var8 = var3 - 6;
            if (!this._j.a370(var8, (byte)90)) {
               var10 = this._h[var8];
               if (var10._h != null && 2 == var10._h._g) {
                  var10._q += var2;
               }
            }
         }

         if (var6) {
            var8 = var3 - 1;
            if (!this._j.a370(var8, (byte)110)) {
               var10 = this._h[var8];
               if (var10._h != null && var10._h._g == 2) {
                  var10._q += var2;
               }
            }
         }

         if (var7) {
            var8 = var3 + 1;
            if (!this._j.a370(var8, (byte)124)) {
               var10 = this._h[var8];
               if (null != var10._h && 2 == var10._h._g) {
                  var10._q += var2;
               }
            }
         }

         if (var5 && var6) {
            var8 = var3 + 6;
            if (!this._j.a370(var8, (byte)82)) {
               var10 = this._h[var8];
               if (null != var10._h && var10._h._g == 2) {
                  var10._q += var2;
               }
            }
         }

         if (var5) {
            var8 = 7 + var3;
            if (!this._j.a370(var8, (byte)117)) {
               var10 = this._h[var8];
               if (var10._h != null && var10._h._g == 2) {
                  var10._q += var2;
               }
            }
         }

         if (var5 && var7) {
            var8 = 8 + var3;
            if (!this._j.a370(var8, (byte)115)) {
               var10 = this._h[var8];
               if (var10._h != null && 2 == var10._h._g) {
                  var10._q += var2;
               }
            }
         }

      }
   }

   final void a093(int var1, int var2) {
      this.a540(false, 128);
      if (var1 != 32768) {
         _r = -77;
      }

      this._g = var2;
      if (1 != this._g) {
         hb_[] var3 = this._A;

         for(int var4 = 0; var3.length > var4; ++var4) {
            hb_ var5 = var3[var4];
            if (var5 != null && var5._n.a097(ob_._ec, var1 ^ '聟')) {
               var5.a487(false);
            }
         }
      }

   }

   final mo_ b215(byte var1, int var2) {
      if (null == this._u) {
         throw new IllegalStateException("Combat raider is null");
      } else if (0 != (2 & this._u._o)) {
         throw new IllegalStateException("Combat raider is incapacitated.");
      } else if ((this._u._o & 4) != 0) {
         throw new IllegalStateException("Combat raider is dead.");
      } else {
         ai_ var3 = this._h[this._B];
         ac_ var4 = var3._h;
         int var5 = this._u._k;
         if (0 != (2 & this._u._d)) {
            var5 <<= 1;
         }

         var5 -= this._i;
         if (0 > var5) {
            var5 = 0;
         }

         if (var4.a560((byte)-59, 13)) {
            this.a487(false);
         }

         if (var4.a560((byte)-77, 14)) {
            var3._i = this.a793(var3._p, (byte)124, this._u._g);
         }

         if (1 == var3._h._g) {
            if (this._u._n.a097(ob_._hc, -67) && var4.a560((byte)-68, 11)) {
               this.a487(false);
               return new mo_(66, 36864);
            } else if (!this.a793(var3._q, (byte)126, var5)) {
               this.a773(this._B, true, -12331);
               if (!this.a793(var3._r, (byte)126, this._u._f)) {
                  this.d150(116);
                  byte var9 = 0;
                  return 0 == (this._u._o & 4) ? new mo_(66, 0 | var9) : new mo_(66, 2048 | var9);
               } else {
                  this.a487(false);
                  return new mo_(66, 20480);
               }
            } else {
               this.a487(false);
               return new mo_(66, 36864);
            }
         } else if (var3._h._g == 2) {
            boolean var7 = this.a793(var5, (byte)126, var3._q);
            if (var7) {
               this.a773(this._B, true, -12331);
            }

            if (var4.a560((byte)-125, 3) && !var7) {
               int var8;
               if (this.a793(var3._r, (byte)126, this._u._f)) {
                  this.a487(false);
                  var8 = 4096;
               } else {
                  this.d150(2);
                  var8 = 0 == (4 & this._u._o) ? 0 : 2048;
               }

               if (var7) {
                  var8 |= 16384;
               }

               return new mo_(66, var8);
            } else if (var4.a560((byte)-44, 15) && !var7) {
               this.b150(-111);
               this.a540(false, 32);
               this.a540(false, 8);
               return new mo_(66, 0);
            } else {
               return this.a852(var7, var3, var2, (byte)98);
            }
         } else if (var3._h._g == 3) {
            if (!var4.a560((byte)-53, 10)) {
               if (this.a793(var3._q, (byte)125, var5)) {
                  this.a487(false);
                  return new mo_(66, 36864);
               } else {
                  this.a773(this._B, true, -12331);
                  this.d150(105);
                  return new mo_(66, 0);
               }
            } else if (!this.a793(var3._r, (byte)124, this._u._f)) {
               this.a183(true, 116, this._B);
               this.d150(27);
               return new mo_(66, 0);
            } else {
               this.a487(false);
               return new mo_(66, 36864);
            }
         } else {
            throw new IllegalStateException("Can't enter combat in special room");
         }
      }
   }

   private final void a876(wm_ var1, ec_ var2, int var3) {
      var1._f[0] = var2.f137(var3 + 22957);
      var1._f[1] = var2.k137(0);
      int var4 = var2.c474(true);
      var1._f[1] = mp_.a080(var1._f[1], nb_.a080(var4 << 16, 65536));
      var1._f[0] = mp_.a080(var1._f[0], nb_.a080(254, var4) << 24);
      if (var3 != -23082) {
         this._t = -3;
      }

   }

   private final void a671(hb_ var1, int var2) {
      if (this._k != 128) {
         boolean var3 = false;
         hb_[] var4 = this._A;

         for(int var5 = 0; var4.length > var5; ++var5) {
            hb_ var6 = var4[var5];
            if (var6 != null && 0 == (6 & var6._o)) {
               var3 = true;
               break;
            }
         }

         if (!var3) {
            this.a093(32768, 4);
         }
      }

      if (var2 != 6) {
         this.a793(67, (byte)-109, -29);
      }

   }

   private final void a785(int var1, boolean var2, ec_ var3) {
      this.a984(105, var3, this._v);
      this._h[0] = this._h[6] = this._h[42] = this._h[48] = new ai_(3);
      this._h[24] = new ai_(2);

      int var4;
      for(var4 = 0; 49 > var4; ++var4) {
         if (0 != var4 && var4 != 6 && var4 != 24 && var4 != 42 && var4 != 48) {
            this._h[var4] = bl_.a167(var2, var3, false);
         }
      }

      this.a876(this._p, var3, -23082);
      this.a876(this._j, var3, -23082);
      this._q = var3.a403((byte)2);
      this._B = var3.a403((byte)2);

      for(var4 = 0; var4 < 4; ++var4) {
         this._A[var4] = ep_.a069(var4, -1, var3);
      }

      if (var1 < 57) {
         this._y = 110;
      }

      var4 = var3.c474(true);
      this._u = 4 <= var4 ? null : this._A[var4];
      this._g = var3.c474(true);
      this.a540(false, var3.c474(true));
      this._t = var3.c474(true);
      this._s = var3.c474(true);
      if (!var2) {
         this._o = var3.f137(-110);
         this._y = var3.f137(-94);
         this._l = var3.f137(-107);
         this.a876(this._d, var3, -23082);
      } else {
         this._f = var3.a738(-21030);
      }

      if (this._q != -1) {
         this.a366(this._q, (byte)107);
      }

   }

   private final boolean a793(int var1, byte var2, int var3) {
      if (var2 < 123) {
         return false;
      } else if (var3 != 0) {
         if (0 == var1) {
            return true;
         } else {
            int var4 = var3 - var1;
            if (-10 > var4) {
               return false;
            } else if (0 > var4) {
               var4 = 1 << -var4;
               return 0 == oi_.b080(0, 1 + var4);
            } else if (var4 > 10) {
               return true;
            } else {
               var4 = 1 << var4;
               return oi_.b080(0, 1 + var4) != 0;
            }
         }
      } else {
         return var1 == 0 && oi_.b080(0, 2) == 0;
      }
   }

   private final mo_ a852(boolean var1, ai_ var2, int var3, byte var4) {
      boolean var5 = !var1;
      h_ var6 = this._u._n;
      if (var6.a097(ob_._Ob, var4 - 223)) {
         var5 = true;
      }

      if (var3 == 2) {
         var5 = false;
      }

      boolean var7 = false;
      int var8 = var2._h.a080(0, 17);
      int var9 = this._u._g;
      if (var4 != 98) {
         this.a671((hb_)null, -125);
      }

      int var10 = this._u._e;
      int var11 = var2._p;
      int var12 = var2._g;
      if (0 != (1 & this._u._d)) {
         var9 <<= 1;
      }

      boolean var13 = (1 & this._t) != 0 || 0 != (this._u._d & 4);
      var13 &= var2._h._g == 2;
      if (var13) {
         var12 = var12 + 1 >> 1;
         var11 = var11 + 1 >> 1;
      }

      var11 -= this._i;
      if (var11 < 0) {
         var11 = 0;
      }

      if (var2._h.a560((byte)-115, 7) && var9 << 1 <= var11) {
         this.a093(var4 + 32670, 3);
         return new mo_(66, 32768);
      } else {
         int var14 = var1 ? 16384 : 0;
         if (var5) {
            var14 |= 8192;
         }

         if (2 == var3) {
            var14 |= 32768;
         }

         if (1 == var3) {
            ++var10;
            --var9;
         }

         int var15 = 0;

         while(true) {
            ++var15;
            if (var5) {
               int var16 = 2 == var3 ? this._u._f : var10;
               int var17 = var3 == 2 ? var2._r : var12;
               if (var3 != 2 && var6.a097(ob_._jc, 87) && !var7) {
                  var16 <<= 1;
                  var14 |= 1024;
                  var7 = true;
               }

               if (this.a793(var17, (byte)124, var16) || 100 < var15) {
                  if (2 == var3) {
                     this.a150(-8);
                     var14 |= 4096;
                     break;
                  }

                  if (0 >= var8) {
                     this.a487(false);
                     var14 |= 4096;
                     break;
                  }

                  var14 |= 512;
                  --var8;
               }

               if ((0 == var16 && var17 != 0 || var17 > 10 + var16) && (0 == var2._p && 0 != this._u._g || 10 + var2._p < this._u._g)) {
                  var14 |= 4096;
                  if (2 != var3) {
                     this.a487(false);
                  } else {
                     this.a150(-8);
                  }

                  var15 = 5;
                  break;
               }
            }

            var5 = true;
            if (this.a793(var9, (byte)127, var11)) {
               if (var6.a097(ob_._kc, 87) && this._u._o == 0) {
                  hb_ var10000 = this._u;
                  var10000._o |= 1;
               } else {
                  if (!var6.a097(ob_._mc, 119) || var7) {
                     this.d150(var4 - 183);
                     if ((4 & this._u._o) != 0) {
                        var14 |= 2048;
                     }
                     break;
                  }

                  var14 |= 1024;
                  var7 = true;
               }
            }
         }

         if (5 < var15) {
            var15 = 5;
         }

         return new mo_(66, var14 | var15);
      }
   }

   public static void e150(int var0) {
      _c = null;
      _e = null;
      _n = null;
      _w = null;
      if (var0 < 111) {
         a054(43, 127L);
      }

   }

   final double b308(int var1, int var2, int var3) {
      return var3 <= 45 ? -0.5947890367550314 : this.c068(var1, this._y, var2, 2, this._o);
   }

   final void a773(int var1, boolean var2, int var3) {
      ai_ var4 = this._h[var1];
      ac_ var5 = var4._h;
      this.e093(var5.a080(var3 ^ var3, 9), var3 ^ -21561);
      this.a326(-3, var5.a080(0, 5), var1);
   }

   final void a540(boolean var1, int var2) {
      this._k = var2;
      hb_[] var3;
      int var4;
      hb_ var5;
      if (32 == this._k) {
         var3 = this._A;

         for(var4 = 0; var4 < var3.length; ++var4) {
            var5 = var3[var4];
            if (null != var5) {
               var5._d = 0;
            }
         }

         this._t = 0;
      }

      this._i = 0;
      if (!var1) {
         var3 = this._A;

         for(var4 = 0; var4 < var3.length; ++var4) {
            var5 = var3[var4];
            if (var5 != null && var5._n.a097(ob_._gc, -91) && 0 == (var5._o & 6)) {
               ++this._i;
            }
         }

      }
   }

   final mo_ b669(int var1, int var2, int var3, int var4, int var5) {
      if (var3 != 18833) {
         this._t = 19;
      }

      ec_ var6 = new ec_(3);
      var6.i093(var4, -128);
      boolean var7 = this.a046(var5, var4, var3 + 18031, var2, var1);
      if (var7) {
         var6.a093(6, 16 | this.a410((byte)47));
         this.a093(32768, 2);
      } else {
         var6.a093(6, 0);
         this.a093(32768, 1);
      }

      return new mo_(68, var6);
   }

   final void a125(int var1, hb_ var2) {
      boolean var3 = true;
      h_ var4 = var2._n;
      if (!var4.a097(ob_._kc, -92) || 0 != (var2._o & 1)) {
         if (var4.a097(ob_._Vb, 101)) {
            var3 = false;
         }

         if (var4.a097(ob_._Sb, -88) && var2._g > 1) {
            --var2._g;
            var3 = false;
         }

         if (!var3) {
            var2.a150(3);
         } else {
            var2.a487(false);
         }

         var2._o |= 8;
         if (var1 <= 97) {
            this._g = 87;
         }

         this.a671(var2, 6);
      }
   }

   private final int a417(int var1, boolean var2) {
      int[] var3 = this.a464((byte)-107, var1);
      int[] var4 = var3;

      int var5;
      int var6;
      for(var5 = 0; var5 < var4.length; ++var5) {
         var6 = var4[var5];
         if (this._q == var6) {
            return this._q;
         }
      }

      var4 = var3;

      for(var5 = 0; var5 < var4.length; ++var5) {
         var6 = var4[var5];
         if (this._m.a370(var6, (byte)70)) {
            return var6;
         }
      }

      if (!var2) {
         _w = (boolean[])null;
      }

      return -1;
   }

   final boolean b121(int var1, hb_ var2) {
      if (var2 == null) {
         return false;
      } else {
         int var3 = var2._o;
         int var4 = var2._n._s;
         if (var4 != -1) {
            if (var1 != (var3 & 1)) {
               return false;
            } else {
               if (0 != (var3 & 6)) {
                  if (var4 != ob_._nc && var4 != ob_._Ib) {
                     return false;
                  }

                  if (var2._g <= 0) {
                     return false;
                  }
               }

               hb_[] var5;
               int var6;
               hb_ var7;
               if (this._k != 128) {
                  if (this._k == 32 && this._u != var2) {
                     return false;
                  } else if (0 != (this._k & ob_._cc[var4])) {
                     if (this._u != var2) {
                        if (var4 == ob_._Wb) {
                           return false;
                        }

                        if (ob_._nc == var4) {
                           return false;
                        }

                        if (var4 == ob_._Ib) {
                           return false;
                        }

                        if (var4 == ob_._lc) {
                           return false;
                        }

                        if (var4 == ob_._Gb) {
                           return false;
                        }

                        if (ob_._Ub == var4) {
                           return false;
                        }

                        if (ob_._Zb == var4) {
                           return false;
                        }
                     }

                     if (ob_._Mb != var4) {
                        if (ob_._lc == var4 && this._h[this._B]._h._g == 1) {
                           return false;
                        } else if (var4 != ob_._nc && var4 != ob_._Ib) {
                           return true;
                        } else {
                           var5 = this._A;

                           for(var6 = 0; var6 < var5.length; ++var6) {
                              var7 = var5[var6];
                              if (null != var7 && 0 == (6 & var7._o)) {
                                 if (var7._n._z == 0) {
                                    return true;
                                 }

                                 if (var4 == ob_._Ib && var7._n._z == 1) {
                                    return true;
                                 }
                              }
                           }

                           return false;
                        }
                     } else {
                        var5 = this._A;

                        for(var6 = 0; var5.length > var6; ++var6) {
                           var7 = var5[var6];
                           if (var7 != null && (4 & var7._o) != 0 && var7._g > 0) {
                              return true;
                           }
                        }

                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  if ((var4 == ob_._nc || ob_._Ib == var4) && var3 == 12) {
                     var5 = this._A;

                     for(var6 = 0; var6 < var5.length; ++var6) {
                        var7 = var5[var6];
                        if (var7 != null && 0 == (var7._o & 6)) {
                           if (var7._n._z == 0) {
                              return true;
                           }

                           if (var4 == ob_._Ib && 1 == var7._n._z) {
                              return true;
                           }
                        }
                     }
                  }

                  if (ob_._Mb == var4 && var3 == 0) {
                     var5 = this._A;

                     for(var6 = 0; var6 < var5.length; ++var6) {
                        var7 = var5[var6];
                        if (var7 != null && (4 & var7._o) != 0 && var7._g > 0) {
                           return true;
                        }
                     }
                  }

                  return false;
               }
            }
         } else {
            return false;
         }
      }
   }

   private final boolean a046(int var1, int var2, int var3, int var4, int var5) {
      if (var3 != 36864) {
         this.a016((byte)20, -103, true);
      }

      return var5 < var2 || ha_.a405() < this.c068(var4, var1, var2, 2, var5);
   }

   final wm_ b184(byte var1) {
      wm_ var2 = new wm_(84);
      int var3 = 0;
      if (var1 > -1) {
         this.a966((md_)null, -59, -23, 96, true);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      for(var4 = 0; var4 < 7; ++var4) {
         for(var5 = 0; 6 > var5; ++var5) {
            var6 = var4 * 7 + var5;
            var7 = var6 + 1;
            if (this._p.a370(var6, (byte)84) || this._p.a370(var7, (byte)120)) {
               var2.a093(var3, -94);
            }

            ++var3;
         }
      }

      for(var4 = 0; var4 < 6; ++var4) {
         for(var5 = 0; 7 > var5; ++var5) {
            var6 = var5 + 7 * var4;
            var7 = 7 + var6;
            if (this._p.a370(var6, (byte)90) || this._p.a370(var7, (byte)80)) {
               var2.a093(var3, -79);
            }

            ++var3;
         }
      }

      return var2;
   }

   private final void e093(int var1, int var2) {
      if (var1 > 0) {
         if (var2 != 25618) {
            this.b669(-100, 90, 70, -104, 105);
         }

         for(int var3 = 0; var3 < 49; ++var3) {
            if (!this._j.a370(var3, (byte)104)) {
               ai_ var6 = this._h[var3];
               if (null != var6._h && 2 == var6._h._g) {
                  var6._q += var1;
               }
            }
         }

      }
   }

   final mo_ c610(int var1, int var2) {
      if (this._u == null) {
         throw new IllegalStateException("Combat raider is null");
      } else if (0 != (2 & this._u._o)) {
         throw new IllegalStateException("Combat raider is incapacitated.");
      } else if ((4 & this._u._o) == 0) {
         ai_ var3 = this._h[this._B];
         ac_ var4 = var3._h;
         int var5 = this._u._k;
         if ((2 & this._u._d) != 0) {
            var5 <<= 1;
         }

         var5 -= this._i;
         if (0 > var5) {
            var5 = 0;
         }

         if (var1 >= -86) {
            _e = (int[])null;
         }

         if (var3._h._g == 1) {
            if (this._u._n.a097(ob_._hc, 72) && var4.a560((byte)-49, 11)) {
               this.a487(false);
               return new mo_(66, 36864);
            } else if (this.a793(this._u._f, (byte)127, var5)) {
               this.a487(false);
               return new mo_(66, 36864);
            } else {
               this.a773(this._B, true, -12331);
               this.a487(false);
               return new mo_(66, 20480);
            }
         } else if (var3._h._g == 2) {
            boolean var6 = this.a793(var5, (byte)126, var3._q);
            if (var6) {
               this.a773(this._B, true, -12331);
            }

            return this.a078(var2, var3, (byte)26, var6);
         } else if (var3._h._g != 3) {
            throw new IllegalStateException("Can't enter combat in special room");
         } else if (var4.a560((byte)-65, 10)) {
            if (this.a793(var3._r, (byte)124, this._u._f)) {
               this.a487(false);
               return new mo_(66, 36864);
            } else {
               this.a183(true, 123, this._B);
               this.d150(124);
               return new mo_(66, 0);
            }
         } else if (this.a793(var3._q, (byte)127, var5)) {
            this.a487(false);
            return new mo_(66, 36864);
         } else {
            this.a773(this._B, true, -12331);
            this.d150(113);
            return new mo_(66, 0);
         }
      } else {
         throw new IllegalStateException("Combat raider is dead.");
      }
   }

   final void a345(hb_ var1, boolean var2, int var3) {
      this._B = this.a417(var3, var2);
      if (this._B != -1) {
         this.b150(-92);
      }

      this._p.a093(var3, -118);
      this._B = var3;
      ai_ var4 = this._h[var3];
      if (0 == var4._a || var4._a == 3) {
         this._j.a093(var3, -113);
         this._d.a093(var3, -77);
      }

      if (2 != var4._a && !this._j.a370(var3, (byte)117)) {
         this.a540(!var2, 16);
         this._u = var1;
      } else {
         this.b150(-113);
         this.a540(!var2, 8);
      }

   }

   final void a183(boolean var1, int var2, int var3) {
      ai_ var4 = this._h[var3];
      ac_ var5 = var4._h;
      if (var2 >= 112) {
         this.e093(var5.a080(0, 8), 25618);
         this.a326(-3, var5.a080(0, 4), var3);
      }
   }

   final int[] b574(int var1, byte var2) {
      int var3 = 0;
      if (var1 % 7 != 0 && this._v.a370(var1 - 1 - var1 / 7, (byte)116)) {
         ia_._S[var3++] = var1 - 1 - var1 / 7;
      }

      if (var1 % 7 != 6 && this._v.a370(var1 - var1 / 7, (byte)125)) {
         ia_._S[var3++] = -(var1 / 7) + var1;
      }

      if (6 < var1 && this._v.a370(35 + var1, (byte)88)) {
         ia_._S[var3++] = 35 + var1;
      }

      if (42 > var1 && this._v.a370(var1 + 42, (byte)77)) {
         ia_._S[var3++] = var1 + 42;
      }

      int[] var4 = new int[var3];

      for(int var6 = 0; var6 < var3; ++var6) {
         var4[var6] = ia_._S[var6];
      }

      return var4;
   }

   final int c137(int var1) {
      int var2 = 0;
      hb_[] var3 = this._A;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         hb_ var5 = var3[var4];
         if (var5 != null && 0 == (var5._o & 6)) {
            var2 += var5._k + var5._e - (-var5._g - var5._f);
         }
      }

      if (var1 > -77) {
         _w = (boolean[])null;
      }

      int var6 = 100 * var2;
      if (var6 > 50000) {
         var6 = 50000;
      }

      if (this._o < var6) {
         var6 = this._o;
      }

      return var6;
   }

   final int[] a464(byte var1, int var2) {
      return nf_.a197(this._v, var2);
   }

   private final void a016(byte var1, int var2, boolean var3) {
      ai_ var4 = this._h[var2];
      if (var1 != -52) {
         e150(-22);
      }

      ac_ var5 = var4._h;
      if (var3) {
         int var6 = var5.a080(var1 ^ -52, 0);
         int var7 = var5.a080(0, 1);
         this.a305(var7, var6, this._u, -110);
         if (var5.a560((byte)-88, 6)) {
            if (var4._h._k << 1 > var4._l) {
               ++var4._g;
               ++var4._l;
            }

            if (var4._h._A << 1 > var4._j) {
               ++var4._p;
               ++var4._j;
            }
         }

         int var8 = var5.a080(0, 16);
         if (var8 > 0) {
            hb_[] var9 = this._A;

            for(int var10 = 0; var10 < var9.length; ++var10) {
               hb_ var11 = var9[var10];
               if (var11 != null && 0 == (6 & var11._o)) {
                  this.a305(var8, var8, var11, var1 ^ 124);
               }
            }
         }
      }

   }

   final void b150(int var1) {
      if (-1 != this._q && this._h[this._q]._h.a560((byte)-64, 2)) {
         this._j.b093(this._q, 31);
      }

      if (var1 <= -83) {
         this._q = this._B;
         this.a366(this._q, (byte)-90);
      }
   }

   static final void a054(int var0, long var1) {
      if ((long)var0 < var1) {
         if (var1 % 10L != 0L) {
            ln_.a157(var1);
         } else {
            ln_.a157(var1 - 1L);
            ln_.a157(1L);
         }

      }
   }

   final void a487(boolean var1) {
      this._j.a093(this._B, -108);
      this._d.a093(this._B, -72);
      ai_ var2 = this._h[this._B];
      if (var2._l > var2._h._k) {
         var2._l = var2._h._k;
      }

      if (var2._h._y < var2._s) {
         var2._s = var2._h._y;
      }

      if (var2._o > var2._h._r) {
         var2._o = var2._h._r;
      }

      if (var2._h._A < var2._j) {
         var2._j = var2._h._A;
      }

      this.b150(-111);
      this.a540(false, 32);
      this.a540(var1, 8);
   }

   final void d150(int var1) {
      ai_ var2 = this._h[this._B];
      ac_ var3 = var2._h;
      int var4 = var3._g;
      h_ var5 = this._u._n;
      if (3 == var4) {
         this.b150(-106);
         this._j.a093(this._B, -77);
         this._d.a093(this._B, -104);
         this.a540(false, 32);
         this.a540(false, 8);
      } else {
         boolean var6 = var2._i;
         if (var6 && !var3.a560((byte)-77, 12)) {
            if (var5.a097(ob_._Vb, -100)) {
               var6 = false;
            }

            if (var5.a097(ob_._kc, -69) && var2._m && this._u._o == 0) {
               hb_ var10000 = this._u;
               var10000._o |= 1;
               this.a487(false);
               return;
            }

            if (var5.a097(ob_._Sb, 88) && this._u._g > 1) {
               var6 = false;
               --this._u._g;
            }
         }

         if (var5.a097(ob_._Qb, 89)) {
            var6 = true;
         }

         if (var6) {
            this._u.a487(false);
         } else {
            this._u.a150(3);
         }

         this.a016((byte)-52, this._B, true);
         this._B = this._q;
         this.a540(false, 32);
         boolean var7 = false;
         hb_[] var9 = this._A;

         for(int var10 = 0; var9.length > var10; ++var10) {
            hb_ var11 = var9[var10];
            if (this.b121(0, var11)) {
               var7 = true;
               break;
            }
         }

         if (!var7) {
            this.a540(false, 8);
         }

         this.a671(this._u, 6);
      }
   }

   static final String a022(byte var0, int var1, String var2) {
      if (var0 != 66) {
         a022((byte)-8, -92, (String)null);
      }

      var2 = var2 != null ? var2 : ng_._K;
      return !mh_.a097(var1) ? var2 : ln_.a173(var1, var2);
   }

   private final mo_ a078(int var1, ai_ var2, byte var3, boolean var4) {
      boolean var5 = !var4;
      h_ var6 = this._u._n;
      if (var6.a097(ob_._Ob, 70)) {
         var5 = true;
      }

      if (2 == var1) {
         var5 = false;
      }

      boolean var7 = false;
      int var8 = var2._h.a080(0, 17);
      int var9 = this._u._g;
      int var10 = this._u._e;
      int var11 = var2._p;
      if (var3 < 16) {
         this.c068(-99, 88, -59, -18, 46);
      }

      int var12 = var2._g;
      if ((1 & this._u._d) != 0) {
         var9 <<= 1;
      }

      boolean var13 = (1 & this._t) != 0 || 0 != (this._u._d & 4);
      var13 &= var2._h._g == 2;
      if (var13) {
         var11 = 1 + var11 >> 1;
         var12 = 1 + var12 >> 1;
      }

      var11 -= this._i;
      if (0 > var11) {
         var11 = 0;
      }

      if (var2._h.a560((byte)-78, 7) && var9 << 1 <= var11) {
         this.a093(32768, 3);
         return new mo_(66, 32768);
      } else {
         int var14 = !var4 ? 0 : 16384;
         if (var5) {
            var14 |= 8192;
         }

         if (var1 == 2) {
            var14 |= 32768;
         }

         if (var1 == 1) {
            ++var10;
            --var9;
         }

         int var15 = 0;

         while(true) {
            ++var15;
            if (var5) {
               int var16 = var1 == 2 ? this._u._f : var10;
               int var17 = var1 == 2 ? var2._r : var12;
               if (var1 != 2 && var6.a097(ob_._jc, 76) && !var7) {
                  var7 = true;
                  var16 <<= 1;
               }

               if (this.a793(var17, (byte)127, var16)) {
                  if (var8 <= 0) {
                     if (var1 != 2) {
                        this.a487(false);
                     } else {
                        this.a150(-8);
                     }

                     var14 |= 4096;
                     break;
                  }

                  --var8;
               }

               if (var17 > var16 + 5) {
                  if (var1 == 2) {
                     this.a150(-8);
                  } else {
                     this.a487(false);
                  }

                  var14 |= 4096;
                  var15 = 5;
                  break;
               }
            }

            var5 = true;
         }

         if (var15 > 5) {
            var15 = 5;
         }

         return new mo_(66, var14 | var15);
      }
   }

   private final void a305(int var1, int var2, hb_ var3, int var4) {
      if (!var3._n.a097(ob_._Ub, 53)) {
         if (var2 >= var3._e) {
            var3._e = 0;
         } else {
            var3._e -= var2;
         }

         if (var3._g <= var1) {
            var3.a487(false);
         } else {
            var3._g -= var1;
         }
      } else {
         if (var2 > var3._e) {
            var2 -= var3._e;
            var1 += var2;
            var3._e = 0;
         } else {
            var3._e -= var2;
         }

         if (var3._g - 1 >= var1) {
            var3._g -= var1;
         } else {
            var1 -= var3._g - 1;
            var3._g = 1;
            if (var3._e < var1) {
               var3.a487(false);
            } else {
               var3._e -= var1;
            }
         }
      }

      if (var4 > -68) {
         this.a345((hb_)null, false, -72);
      }

   }

   private final void a984(int var1, ec_ var2, wm_ var3) {
      if (var1 >= 96) {
         for(int var4 = 0; var3._f.length > var4; ++var4) {
            var3._f[var4] = var2.h137(-50);
         }

      }
   }

   final void a150(int var1) {
      this._B = this._q;
      this.a540(false, 32);
      if (var1 != -8) {
         this._l = 36;
      }

      this.a540(false, 8);
   }

   final boolean b097(int var1, int var2) {
      if (-1 == var1) {
         return false;
      } else {
         ai_ var3 = this._h[var1];
         if (var2 != 27747) {
            this.b150(-54);
         }

         if (this._k == 4) {
            return 3 == var3._a;
         } else {
            return 8 != this._k && this._k != 32 ? false : this._m.a370(var1, (byte)113);
         }
      }
   }

   private final int a410(byte var1) {
      if (var1 != 47) {
         this.a093(74, -22);
      }

      int var2 = 0;

      for(int var3 = 0; 4 > var3; ++var3) {
         if (this._A[var3] != null && 0 == (6 & this._A[var3]._o) && 0 == oi_.b080(0, 3) && !this._A[var3]._n.a097(ob_._bc, -85)) {
            this.a125(var1 + 60, this._A[var3]);
            var2 |= 1 << var3;
         }
      }

      return var2;
   }

   private final void a366(int var1, byte var2) {
      this._m.a150(1);
      this._b.a150(1);
      co_._I.b150(-4);
      co_._I.a865(new a_(var1), false);
      this._m.a093(var1, -63);

      while(!co_._I.a427((byte)-69)) {
         int var4 = ((a_)co_._I.b081((byte)-124))._j;
         if (0 < var4 % 7) {
            this.a966(co_._I, 49, var4 - 1, var4 - 1 - var4 / 7, true);
         }

         if (6 > var4 % 7) {
            this.a966(co_._I, 49, 1 + var4, -(var4 / 7) + var4, false);
         }

         if (var4 > 6) {
            this.a966(co_._I, 49, var4 - 7, var4 - 7 + 42, false);
         }

         if (var4 < 42) {
            this.a966(co_._I, 49, 7 + var4, var4 + 42, true);
         }
      }

   }

   final int d080(int var1, int var2) {
      if (var2 != 30813) {
         this.d080(-124, -104);
      }

      int var3 = 0;
      if (var1 % 7 != 0 && this._v.a370(-(var1 / 7) - 1 + var1, (byte)75)) {
         var3 |= 1;
      }

      if (6 != var1 % 7 && this._v.a370(var1 - var1 / 7, (byte)110)) {
         var3 |= 2;
      }

      if (var1 > 6 && this._v.a370(var1 + 35, (byte)122)) {
         var3 |= 4;
      }

      if (42 > var1 && this._v.a370(42 + var1, (byte)102)) {
         var3 |= 8;
      }

      return var3;
   }

   private final double c068(int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;

      for(int var7 = 0; var7 < 4; ++var7) {
         hb_ var8 = this._A[var7];
         if (null != var8 && (6 & var8._o) == 0 && var8._n.a097(ob_._Hb, 75)) {
            ++var6;
         }
      }

      if (var4 != 2) {
         a054(-70, 33L);
      }

      return rm_.a802(var6, var5, ek_.a780(this._s, var1, var2), var3);
   }

   final mo_ a395(hb_ var1, ec_ var2, int var3) {
      if (var3 <= 70) {
         this._B = 63;
      }

      var1._o |= 1;
      int var4 = var1._n._s;
      hb_ var5;
      ec_ var6;
      if (ob_._Mb != var4) {
         int var8;
         if (ob_._dc != var4 && var4 != ob_._Nb) {
            if (var4 != ob_._nc && var4 != ob_._Ib) {
               if (var4 != ob_._Zb) {
                  ec_ var9;
                  if (var4 != ob_._lc && ob_._Gb != var4) {
                     if (ob_._Wb == var4) {
                        this._B = this._q;
                        this.a540(false, 8);
                        var9 = new ec_(2);
                        var9.a093(6, 1);
                        var9.a093(6, var1._j);
                        return new mo_(65, var9);
                     } else {
                        ec_ var7;
                        int var10;
                        if (var4 != ob_._Lb) {
                           if (var4 != ob_._Pb) {
                              if (var4 != ob_._fc && ob_._Jb != var4 && var4 != ob_._pc) {
                                 if (var4 == ob_._Ub) {
                                    var8 = var2.c474(true);
                                    var10 = var2.c474(true);
                                    var1._e = var8;
                                    var1._g = var10;
                                    var7 = new ec_(4);
                                    var7.a093(6, 3);
                                    var7.a093(6, var1._j);
                                    var7.a093(6, var8);
                                    var7.a093(6, var10);
                                    return new mo_(65, var7);
                                 } else {
                                    throw new IllegalStateException("Invalid ability use!");
                                 }
                              } else {
                                 var5 = this._A[var2.c474(true)];
                                 if (var4 != ob_._fc) {
                                    if (var4 == ob_._Jb) {
                                       var5._d |= 2;
                                    } else if (var4 == ob_._pc) {
                                       var5._d |= 4;
                                    }
                                 } else {
                                    var5._d |= 1;
                                 }

                                 this.a540(false, this._k);
                                 var6 = new ec_(3);
                                 var6.a093(6, 2);
                                 var6.a093(6, var1._j);
                                 var6.a093(6, var5._j);
                                 return new mo_(65, var6);
                              }
                           } else {
                              this._t |= 1;
                              this.a540(false, this._k);
                              var9 = new ec_(2);
                              var9.a093(6, 1);
                              var9.a093(6, var1._j);
                              return new mo_(65, var9);
                           }
                        } else {
                           var8 = var2.c474(true);
                           var10 = var2.c474(true);
                           this._p.a093(var8, -88);
                           this._p.a093(var10, -119);
                           this.a540(false, this._k);
                           var7 = new ec_(16);
                           var7.a093(6, 15);
                           var7.a093(6, var1._j);
                           var7.a093(6, var8);
                           var7.a093(6, var10);
                           this._h[var8].a785(-12, true, var7);
                           var7.a093(6, this.d080(var8, 30813));
                           this._h[var10].a785(-12, true, var7);
                           var7.a093(6, this.d080(var10, 30813));
                           return new mo_(65, var7);
                        }
                     }
                  } else {
                     this.a487(false);
                     var9 = new ec_(2);
                     var9.a093(6, 1);
                     var9.a093(6, var1._j);
                     return new mo_(65, var9);
                  }
               } else {
                  var5 = this._A[var2.c474(true)];
                  var5.a487(false);
                  var1._o &= -2;
                  this.a487(false);
                  var6 = new ec_(3);
                  var6.a093(6, 2);
                  var6.a093(6, var1._j);
                  var6.a093(6, var5._j);
                  return new mo_(65, var6);
               }
            } else {
               var5 = this._A[var2.c474(true)];
               var5.a487(false);
               var1._o &= -7;
               var1._o &= -2;
               this.a540(false, 8);
               var6 = new ec_(3);
               var6.a093(6, 2);
               var6.a093(6, var1._j);
               var6.a093(6, var5._j);
               return new mo_(65, var6);
            }
         } else {
            var8 = var2.c474(true);
            this._p.a093(var8, -128);
            if (ob_._Nb == var4) {
               this.a773(var8, false, -12331);
               this.a183(false, 115, var8);
               this.a016((byte)-52, var8, false);
            }

            this.a540(false, this._k);
            var6 = new ec_(9);
            var6.a093(6, 8);
            var6.a093(6, var1._j);
            var6.a093(6, var8);
            this._h[var8].a785(-12, true, var6);
            var6.a093(6, this.d080(var8, 30813));
            return new mo_(65, var6);
         }
      } else {
         var5 = this._A[var2.c474(true)];
         var5._o &= -5;
         var5.a150(3);
         if (128 == this._k) {
            this.a540(false, 128);
         } else {
            this.a540(false, 8);
         }

         var6 = new ec_(3);
         var6.a093(6, 2);
         var6.a093(6, var1._j);
         var6.a093(6, var5._j);
         return new mo_(65, var6);
      }
   }

   private final void a966(md_ var1, int var2, int var3, int var4, boolean var5) {
      if (this._v.a370(var4, (byte)92) && !this._m.a370(var3, (byte)92)) {
         this._m.a093(var3, -92);
         if (var2 != 49) {
            a022((byte)106, -25, (String)null);
         }

         if (this._j.a370(var3, (byte)109)) {
            var1.a865(new a_(var3), false);
         } else {
            if (var5) {
               var4 += 84;
            }

            this._b.a093(var4, var2 - 175);
         }

      }
   }

   pj_() {
      this._v = new wm_(84);
      this._h = new ai_[49];
      this._p = new wm_(49);
      this._j = new wm_(49);
      this._d = new wm_(49);
      this._g = 0;
      this._A = new hb_[4];
      this._B = -1;
      this._u = null;
      this._q = -1;
      this._k = 1;
      this._l = 0;

      for(int var1 = 0; var1 < 49; ++var1) {
         this._h[var1] = new ai_(0);
      }

      this._h[0] = this._h[6] = this._h[42] = this._h[48] = new ai_(3);
      this._h[24] = new ai_(2);
      this._p.a093(0, -66);
      this._p.a093(6, -80);
      this._p.a093(42, -85);
      this._p.a093(48, -84);
      this._b = new wm_(168);
      this._m = new wm_(49);
      this._m.a093(0, -119);
      this._m.a093(6, -76);
      this._m.a093(42, -114);
      this._m.a093(48, -90);
   }
}
