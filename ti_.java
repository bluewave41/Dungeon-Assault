final class ti_ extends qa_ {
   private ln_ _D;
   static String _v = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
   private int _w;
   static pp_ _A;
   private int _p;
   private tm_ _y;
   private bb_ _t;
   private byte[] _s;
   static String _n = "Imps may be small and carry a cheeky, indeed, impish look, but they'll not give a second thought to whether or not to stab your raiders.";
   static boolean _f = false;
   static boolean _i;
   static byte[] _q;
   private byte[] _h;
   private int _o;
   private wa_ _l = new wa_(16);
   private ln_ _g;
   private vf_ _C;
   private cc_ _B;
   private boolean _r;
   private boolean _x;
   private md_ _j;
   private md_ _u = new md_();
   private int _z = 0;
   private long _m = 0L;
   private boolean _k;

   private final vf_ a274(byte var1, int var2, int var3) {
      if (var1 < 81) {
         this._k = false;
      }

      Object var4 = (vf_)this._l.a722((long)var2, 8);
      if (null != var4 && 0 == var3 && !((vf_)var4)._B && ((vf_)var4)._v) {
         ((vf_)var4).a487(false);
         var4 = null;
      }

      if (var4 == null) {
         if (var3 != 0) {
            if (1 == var3) {
               if (this._D == null) {
                  throw new RuntimeException();
               }

               var4 = this._B.a822((byte)-78, this._D, var2);
            } else {
               if (var3 != 2) {
                  throw new RuntimeException();
               }

               if (null == this._D) {
                  throw new RuntimeException();
               }

               if (this._h[var2] != -1) {
                  throw new RuntimeException();
               }

               if (this._t.d154(20)) {
                  return null;
               }

               var4 = this._t.a180(false, this._p, (byte)2, var2, (byte)118);
            }
         } else if (this._D != null && this._h[var2] != -1) {
            var4 = this._B.a945(this._D, var2, -6319);
         } else {
            if (this._t.b154(-21431)) {
               return null;
            }

            var4 = this._t.a180(true, this._p, (byte)2, var2, (byte)73);
         }

         this._l.a102((ne_)var4, 12460, (long)var2);
      }

      if (((vf_)var4)._v) {
         return null;
      } else {
         byte[] var5 = ((vf_)var4).b318(true);
         int var6;
         byte[] var7;
         byte[] var8;
         int var9;
         if (!(var4 instanceof co_)) {
            if (null != var5 && var5.length > 2) {
               jl_._a.reset();
               jl_._a.update(var5, 0, var5.length - 2);
               var6 = (int)jl_._a.getValue();
               if (var6 != this._y._q[var2]) {
                  throw new RuntimeException();
               } else {
                  if (null != this._y._g && null != this._y._g[var2]) {
                     var7 = this._y._g[var2];
                     var8 = rn_.a288(var5.length - 2, 0, 8, var5);

                     for(var9 = 0; 64 > var9; ++var9) {
                        if (var8[var9] != var7[var9]) {
                           throw new RuntimeException();
                        }
                     }
                  }

                  this._t._h = 0;
                  this._t._c = 0;
                  var5[var5.length - 2] = (byte)(this._y._o[var2] >>> 8);
                  var5[var5.length - 1] = (byte)this._y._o[var2];
                  if (this._D != null) {
                     this._B.a504(this._D, 15958, var2, var5);
                     if (1 != this._h[var2]) {
                        this._h[var2] = 1;
                     }
                  }

                  if (!((vf_)var4)._B) {
                     ((vf_)var4).a487(false);
                  }

                  return (vf_)var4;
               }
            } else {
               throw new RuntimeException();
            }
         } else {
            try {
               if (var5 != null && var5.length > 2) {
                  jl_._a.reset();
                  jl_._a.update(var5, 0, var5.length - 2);
                  var6 = (int)jl_._a.getValue();
                  if (this._y._q[var2] != var6) {
                     throw new RuntimeException();
                  } else {
                     if (null != this._y._g && null != this._y._g[var2]) {
                        var7 = this._y._g[var2];
                        var8 = rn_.a288(var5.length - 2, 0, 8, var5);

                        for(var9 = 0; var9 < 64; ++var9) {
                           if (var7[var9] != var8[var9]) {
                              throw new RuntimeException();
                           }
                        }
                     }

                     int var12 = (var5[var5.length - 1] & 255) + (var5[var5.length - 2] << 8 & '\uff00');
                     if ((this._y._o[var2] & '\uffff') == var12) {
                        if (1 != this._h[var2]) {
                           if (0 != this._h[var2]) {
                           }

                           this._h[var2] = 1;
                        }

                        if (!((vf_)var4)._B) {
                           ((vf_)var4).a487(false);
                        }

                        return (vf_)var4;
                     } else {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  throw new RuntimeException();
               }
            } catch (Exception var10) {
               this._h[var2] = -1;
               ((vf_)var4).a487(false);
               if (((vf_)var4)._B && !this._t.b154(-21431)) {
                  em_ var11 = this._t.a180(true, this._p, (byte)2, var2, (byte)77);
                  this._l.a102(var11, 12460, (long)var2);
               }

               return null;
            }
         }
      }
   }

   final void c150(int var1) {
      if (this._j != null) {
         if (null == this.a010(26538)) {
            return;
         }

         boolean var2;
         ne_ var3;
         int var4;
         if (!this._x) {
            if (!this._r) {
               this._j = null;
            } else {
               var2 = true;

               for(var3 = this._j.e024(-24172); var3 != null; var3 = this._j.a024(4)) {
                  var4 = (int)var3._h;
                  if (1 != this._h[var4]) {
                     this.a274((byte)107, var4, 2);
                  }

                  if (this._h[var4] == 1) {
                     var3.a487(false);
                  } else {
                     var2 = false;
                  }
               }

               while(this._z < this._y._k.length) {
                  if (0 != this._y._k[this._z]) {
                     if (this._t.d154(20)) {
                        var2 = false;
                        break;
                     }

                     if (1 != this._h[this._z]) {
                        this.a274((byte)112, this._z, 2);
                     }

                     if (1 != this._h[this._z]) {
                        var3 = new ne_();
                        var3._h = (long)this._z;
                        this._j.a865(var3, false);
                        var2 = false;
                     }

                     ++this._z;
                  } else {
                     ++this._z;
                  }
               }

               if (var2) {
                  this._r = false;
                  this._z = 0;
               }
            }
         } else {
            var2 = true;

            for(var3 = this._j.e024(-24172); null != var3; var3 = this._j.a024(var1 ^ -10786)) {
               var4 = (int)var3._h;
               if (0 == this._h[var4]) {
                  this.a274((byte)127, var4, 1);
               }

               if (0 == this._h[var4]) {
                  var2 = false;
               } else {
                  var3.a487(false);
               }
            }

            while(this._y._k.length > this._z) {
               if (0 == this._y._k[this._z]) {
                  ++this._z;
               } else {
                  if (250 <= this._B._f) {
                     var2 = false;
                     break;
                  }

                  if (this._h[this._z] == 0) {
                     this.a274((byte)126, this._z, 1);
                  }

                  if (this._h[this._z] == 0) {
                     var3 = new ne_();
                     var3._h = (long)this._z;
                     var2 = false;
                     this._j.a865(var3, false);
                  }

                  ++this._z;
               }
            }

            if (var2) {
               this._z = 0;
               this._x = false;
            }
         }
      }

      if (this._k && kd_.c138(var1 ^ 9138) >= this._m) {
         for(vf_ var5 = (vf_)this._l.a457(true); var5 != null; var5 = (vf_)this._l.a024(var1 + 15108)) {
            if (!var5._v) {
               if (var5._z) {
                  if (!var5._B) {
                     throw new RuntimeException();
                  }

                  var5.a487(false);
               } else {
                  var5._z = true;
               }
            }
         }

         this._m = kd_.c138(-2456) + 1000L;
      }

      if (var1 != -10790) {
         this._k = false;
      }

   }

   final byte[] a104(int var1, int var2) {
      vf_ var3 = this.a274((byte)90, var1, 0);
      if (null == var3) {
         return null;
      } else if (var2 != -7249) {
         return (byte[])null;
      } else {
         byte[] var4 = var3.b318(true);
         var3.a487(false);
         return var4;
      }
   }

   final tm_ a010(int var1) {
      if (null != this._y) {
         return this._y;
      } else {
         if (this._C == null) {
            if (this._t.b154(-21431)) {
               return null;
            }

            this._C = this._t.a180(true, 255, (byte)0, this._p, (byte)79);
         }

         if (var1 != 26538) {
            return (tm_)null;
         } else if (!this._C._v) {
            byte[] var2 = this._C.b318(true);
            if (!(this._C instanceof co_)) {
               if (var2 == null) {
                  throw new RuntimeException();
               }

               this._y = new tm_(var2, this._w, this._s);
               if (this._g != null) {
                  this._B.a504(this._g, var1 ^ 23036, this._p, var2);
               }
            } else {
               if (var2 == null) {
                  throw new RuntimeException();
               }

               this._y = new tm_(var2, this._w, this._s);
               if (this._y._s != this._o) {
                  throw new RuntimeException();
               }
            }

            this._C = null;
            if (this._D != null) {
               this._h = new byte[this._y._l];
            }

            return this._y;
         } else {
            return null;
         }
      }
   }

   final void d150(int var1) {
      if (var1 == 6833) {
         if (this._D != null) {
            this._r = true;
            if (null == this._j) {
               this._j = new md_();
            }

         }
      }
   }

   final void b487(boolean var1) {
      if (null != this._j) {
         if (var1) {
            this._y = (tm_)null;
         }

         if (null != this.a010(26538)) {
            for(ne_ var2 = this._u.e024(-24172); var2 != null; var2 = this._u.a024(4)) {
               int var3 = (int)var2._h;
               if (var3 >= 0 && var3 < this._y._l && 0 != this._y._k[var3]) {
                  if (this._h[var3] == 0) {
                     this.a274((byte)95, var3, 1);
                  }

                  if (this._h[var3] == -1) {
                     this.a274((byte)123, var3, 2);
                  }

                  if (this._h[var3] == 1) {
                     var2.a487(false);
                  }
               } else {
                  var2.a487(var1);
               }
            }

         }
      }
   }

   final int b080(int var1, int var2) {
      vf_ var3 = (vf_)this._l.a722((long)var1, 8);
      if (var2 != 27318) {
         this._t = (bb_)null;
      }

      return null != var3 ? var3.d410((byte)107) : 0;
   }

   static final void c487(boolean var0) {
      if (var0) {
         i_ var1 = (i_)id_._e.c024(0);
         if (var1 == null) {
            throw new IllegalStateException();
         } else {
            gf_.a397(var1._j, var1._i, var1._q);
            gf_.e115(var1._m, var1._p, var1._z, var1._k);
            var1._j = null;
            cd_._g.a865(var1, !var0);
         }
      }
   }

   public static void a487() {
      _v = null;
      _A = null;
      _q = null;
      _n = null;
   }

   ti_(int var1, ln_ var2, ln_ var3, bb_ var4, cc_ var5, int var6, byte[] var7, int var8, boolean var9) {
      this._p = var1;
      this._D = var2;
      if (null == this._D) {
         this._x = false;
      } else {
         this._x = true;
         this._j = new md_();
      }

      this._o = var8;
      this._w = var6;
      this._g = var3;
      this._k = var9;
      this._s = var7;
      this._B = var5;
      this._t = var4;
      if (null != this._g) {
         this._C = this._B.a945(this._g, this._p, -6319);
      }

   }
}
