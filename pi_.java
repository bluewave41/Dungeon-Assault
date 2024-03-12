final class pi_ {
   private boolean _a = false;
   static String _g = "Pick an adjacent room, or select another party leader.";
   static String _i = "SELECT RAIDERS";
   private int _h = -2;
   cn_ _d = null;
   private int _k = Integer.MIN_VALUE;
   static cn_ _b;
   private int _c = Integer.MIN_VALUE;
   private int _j = Integer.MIN_VALUE;
   cn_[] _e = null;
   private int _f = -2;

   final void a802(int var1, lm_ var2, int var3, int var4, an_ var5) {
      sn_.a311(var1 ^ 116, var2._s, this._e, var2._q + var4, var2._v + var3, var2._x);
      if (this._d != null) {
         int var6 = var4 + var2._q + this._j;
         int var7 = this._k + var3 + var2._v;
         if (1 == var5._f) {
            var6 += (var2._x - this._d._E) / 2;
         }

         if (2 == var5._f) {
            var6 += var2._x - this._d._E;
         }

         if (1 == var5._d) {
            var7 += (-this._d._G + var2._s) / 2;
         }

         if (2 == var5._d) {
            var7 += var2._s - this._d._G;
         }

         this._d.h093(var6, var7);
      }

      String var8 = var5.b424(var2, -444136767);
      if (var8 != null && null != var5._u && 0 <= this._f) {
         var5._u.a450(var8, var5._l + var2._q + var4 + (Integer.MIN_VALUE == this._j ? 0 : this._j), (this._k == Integer.MIN_VALUE ? 0 : this._k) + var5._e + var2._v + var3, var2._x + (-var5._l - var5._v), -var5._i + var2._s - var5._e, this._f, this._h, Integer.MIN_VALUE != this._c ? this._c : 256, var5._f, var5._d, var5._a);
      }

      if (var1 != 0) {
         this.a269(false, (pi_)null);
      }

   }

   static final boolean c154() {
      return ql_._f == wd_._d;
   }

   final pi_ a913(int var1, int var2) {
      if (var1 != -7695) {
         this.a021((lm_)null, (byte)80, (pi_)null, -58, (an_)null, -78);
      }

      this._f = var2;
      return this;
   }

   final pi_ d913(int var1, int var2) {
      this._h = var1;
      if (var2 != 216) {
         this.a269(true, (pi_)null);
      }

      return this;
   }

   static final void a861(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      tg_._f[var2] = var0;
      tg_._b[var2] = var1;
      tg_._j[var2] = var4;
      tg_._h[var2] = var5;
      tg_._d[var2] = var3;
   }

   final pi_ a316(cn_[] var1, boolean var2) {
      if (!var2) {
         a207((byte)123);
      }

      this._e = var1;
      return this;
   }

   static final vk_ a207(byte var0) {
      if (sp_._e == ol_._i) {
         throw new IllegalStateException();
      } else {
         if (var0 != 80) {
            _g = (String)null;
         }

         if (ol_._i == dh_._b) {
            ol_._i = sp_._e;
            return mh_._b;
         } else {
            return null;
         }
      }
   }

   final void a269(boolean var1, pi_ var2) {
      var2._e = this._e;
      var2._d = this._d;
      if (var1) {
         var2._a = this._a;
         var2._k = this._k;
         var2._f = this._f;
         var2._h = this._h;
         var2._c = this._c;
         var2._j = this._j;
      }
   }

   static final void a959(int var0, String var1, int[] var2, int var3, se_ var4, int var5) {
      tf_ var6 = new tf_(var4, var1, var2);
      if (var0 == 0) {
         var6.b326(-var4._H + var5, var0 + 32, var3);
      }
   }

   final pi_ c913(int var1, int var2) {
      this._k = var1;
      if (var2 != -33) {
         this.a269(true, (pi_)null);
      }

      return this;
   }

   static final q_ a648(int var0, q_ var1, int[] var2) {
      if (var0 != 1) {
         a150(-117);
      }

      q_ var3 = new q_(0, 0, 0);
      var3._d = var1._d;
      var3._e = var1._e;
      var3._i = var2;
      var3._a = var1._a;
      var3._g = var1._g;
      var3._h = var1._h;
      var3._j = var1._j;
      var3._b = var1._b;
      return var3;
   }

   final void b150(int var1) {
      this._d = null;
      this._k = var1;
      this._e = null;
      this._f = 0;
      this._h = -1;
      this._j = 0;
      this._c = 256;
   }

   final pi_ b913(int var1, int var2) {
      this._j = var1;
      return this;
   }

   static final byte[] a640(String var0, int var1, String var2, String var3, int var4, int var5, nh_ var6) {
      if (!var6.a213(false, var3)) {
         return null;
      } else {
         byte[] var7 = var6.a826(var3 + "/" + var0, var2, (byte)-115);
         if (var7 == null) {
            return null;
         } else {
            oi_._J._o = 0;
            oi_._J.a093(6, 255);
            oi_._J.a093(var1 ^ 6, 216);
            oi_._J.a093(6, 255);
            oi_._J.a093(6, 224);
            oi_._J.i093(16, -121);
            int[] var8 = he_._o;

            int var9;
            int var10;
            for(var9 = 0; var9 < var8.length; ++var9) {
               var10 = var8[var9];
               oi_._J.a093(6, var10);
            }

            oi_._J.i093(258, var1 ^ -91);
            oi_._J.a093(6, 0);
            oi_._J.i093(1, -110);
            oi_._J.i093(1, -109);
            oi_._J.a093(6, 0);
            oi_._J.a093(6, 0);
            oi_._J.a093(6, 255);
            oi_._J.a093(6, 219);
            byte[][] var13 = new byte[4][];
            var9 = 2;

            for(var10 = 0; 4 > var10; ++var10) {
               String var11 = "qt" + var10;
               if (var6.b671(var11, var3, (byte)-82)) {
                  var13[var10] = var6.a826(var3, var11, (byte)-107);
                  var9 += var13[var10].length;
               }
            }

            oi_._J.i093(var9, var1 - 108);

            for(var10 = 0; var10 < 4; ++var10) {
               if (var13[var10] != null) {
                  oi_._J.a263(var13[var10], 1, var13[var10].length, 0);
               }
            }

            oi_._J.a093(6, 255);
            oi_._J.a093(6, 192);
            oi_._J.i093(17, -88);
            oi_._J.a093(6, 8);
            oi_._J.i093(var4, var1 ^ -113);
            oi_._J.i093(var5, -99);
            oi_._J.a093(6, 3);
            oi_._J.a093(6, 1);
            oi_._J.a093(6, 34);
            oi_._J.a093(var1 ^ 6, 0);
            oi_._J.a093(6, 2);
            oi_._J.a093(6, 17);
            oi_._J.a093(6, 1);
            oi_._J.a093(var1 ^ 6, 3);
            oi_._J.a093(6, 17);
            oi_._J.a093(6, 1);
            oi_._J.a093(var1 + 6, 255);
            oi_._J.a093(6, 196);
            byte[][] var15 = new byte[32][];
            var9 = 2;

            int var14;
            for(var14 = 0; var14 < 32; ++var14) {
               String var12 = "ht" + var14;
               if (var6.b671(var12, var3, (byte)-82)) {
                  var15[var14] = var6.a826(var3, var12, (byte)-125);
                  var9 += var15[var14].length;
               }
            }

            oi_._J.i093(var9, -100);

            for(var14 = 0; var14 < 32; ++var14) {
               if (var15[var14] != null) {
                  oi_._J.a263(var15[var14], var1 ^ 1, var15[var14].length, 0);
               }
            }

            oi_._J.a093(6, 255);
            oi_._J.a093(6, 218);
            oi_._J.i093(12, -128);
            oi_._J.a093(6, 3);
            oi_._J.a093(6, 1);
            oi_._J.a093(6, 0);
            oi_._J.a093(6, 2);
            oi_._J.a093(6, 17);
            oi_._J.a093(6, 3);
            oi_._J.a093(6, 17);
            oi_._J.a093(6, 0);
            oi_._J.a093(var1 ^ 6, 63);
            oi_._J.a093(var1 + 6, 0);

            for(var14 = var1; var14 < var7.length; ++var14) {
               byte var16 = var7[var14];
               oi_._J.a093(6, var16);
               if (255 == (255 & var16)) {
                  oi_._J.a093(6, 0);
               }
            }

            oi_._J.a093(6, 255);
            oi_._J.a093(6, 217);
            byte[] var17 = new byte[oi_._J._o];
            cj_.a278(oi_._J._m, 0, var17, 0, oi_._J._o);
            return var17;
         }
      }
   }

   final void a021(lm_ var1, byte var2, pi_ var3, int var4, an_ var5, int var6) {
      if (this._a) {
         var3.a802(0, var1, var4, var6, var5);
         var3.b150(0);
      }

      if (this._e != null) {
         var3._e = this._e;
      }

      if (this._c != Integer.MIN_VALUE) {
         var3._c = this._c;
      }

      if (this._j != Integer.MIN_VALUE) {
         var3._j = this._j;
      }

      if (-1 <= this._h) {
         var3._h = this._h;
      }

      if (var2 != 100) {
         a648(-106, (q_)null, (int[])null);
      }

      if (this._k != Integer.MIN_VALUE) {
         var3._k = this._k;
      }

      if (-1 <= this._f) {
         var3._f = this._f;
      }

      if (null != this._d) {
         var3._d = this._d;
      }

   }

   public static void a150(int var0) {
      _g = null;
      _b = null;
      _i = null;
      if (var0 != 11877) {
         _i = (String)null;
      }

   }

   final pi_ a479(byte var1, boolean var2) {
      this._a = var2;
      if (var1 >= -34) {
         this.a913(10, 73);
      }

      return this;
   }
}
