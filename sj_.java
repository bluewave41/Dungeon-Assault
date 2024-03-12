abstract class sj_ extends rf_ {
   private int _ab = 0;
   private int _gb;
   private int _Z = 0;
   static ad_ _hb = new ad_(14, 0, 4, 1);
   private int _X;
   private int _Y;
   static int _bb = 64;
   private int _fb;
   static int[] _db;
   static String _V = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
   static String[] _cb = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
   static String _W = "Dungeon and Stable";
   static String _eb = "While demon lords are still a raider's worst nightmare, pit demons are still very, very bad dreams.";

   static final gd_ a921(int var0, int var1, int var2, cn_ var3, nn_ var4) {
      if (var1 <= 82) {
         _hb = (ad_)null;
      }

      cn_ var5 = fk_.a575(var3, 192, 12690143);
      cn_ var6 = rb_.a551(16, var5, 255, (byte)-53);
      cn_ var7 = fk_.a575(var3, 192, 16744448);
      cn_ var8 = rb_.a551(16, var7, 16711680, (byte)92);
      gd_ var9 = new gd_(var3, var5, var6, var7, var8, var0, var2);
      var4.a507(var9, (byte)-20);
      return var9;
   }

   sj_(ji_ var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   final void b115(int var1, int var2, int var3, int var4) {
      if (0 >= var2) {
         this.b326(-15, var3, var1);
      } else {
         this._Y = super._s;
         this._fb = super._x;
         this._X = var1;
         this._gb = var3;
         this._ab = 0;
         this._Z = var2;
         if (var4 != 22284) {
            this.h423((byte)-56);
         }

      }
   }

   void k150(int var1) {
      if (var1 != 0) {
         a887(-37, 39, -112, 81, (String)null, (String)null);
      }

   }

   public static void g423() {
      _hb = null;
      _W = null;
      _db = null;
      _eb = null;
      _V = null;
      _cb = null;
   }

   static final String l738(int var0) {
      if (var0 != 192) {
         a595((cn_)null, -120);
      }

      String var1 = "(" + wl_._f + " " + oc_._E + " " + rd_._C + ") " + hc_._c;
      if (0 < nj_._b) {
         var1 = var1 + ":";

         for(int var2 = 0; var2 < nj_._b; ++var2) {
            var1 = var1 + ' ';
            int var3 = 255 & ra_._c._m[var2];
            int var4 = var3 >> 4;
            var3 &= 15;
            if (var4 >= 10) {
               var4 += 55;
            } else {
               var4 += 48;
            }

            if (var3 < 10) {
               var3 += 48;
            } else {
               var3 += 55;
            }

            var1 = var1 + (char)var4;
            var1 = var1 + (char)var3;
         }
      }

      return var1;
   }

   static final pp_ a595(cn_ var0, int var1) {
      jh_.c797();
      cn_ var2 = new cn_(var0._y, var0._v);
      cn_ var3 = new cn_(var0._y, var0._v);
      var2.e797();
      var0.e326(0, 0, 16744448);
      var3.e797();
      var0.e326(0, 0, 8421504);
      jh_.b797();
      cn_ var4 = rb_.a551(8, var2, 255, (byte)-116);
      if (var1 <= 4) {
         _hb = (ad_)null;
      }

      return new pp_(var0, var3, var2, var4, 0, 30);
   }

   void h423(byte var1) {
      if (this._Z > 0) {
         this.b326(119, this._gb, this._X);
         this._Z = 0;
         this.k150(0);
      }
   }

   boolean i154(int var1) {
      this.h423((byte)-61);
      if (var1 != 462) {
         this.h423((byte)-64);
      }

      return super.i154(var1 + 0);
   }

   boolean f427(byte var1) {
      if (var1 != -90) {
         this.i154(-114);
      }

      if (0 < this._Z) {
         int var2 = this._X;
         int var3 = this._gb;
         if (this._Z <= ++this._ab) {
            this._Z = 0;
            this.k150(0);
         } else {
            int var4 = this._ab * (2 * this._Z - this._ab);
            int var5 = this._Z * this._Z;
            var2 = (-this._fb + this._X) * var4 / var5 + this._fb;
            var3 = (this._gb - this._Y) * var4 / var5 + this._Y;
         }

         this.b326(15, var3, var2);
      }

      return super.f427((byte)-90);
   }

   static final void a887(int var0, int var1, int var2, int var3, String var4, String var5) {
      ac_ var6 = gh_._i[var1];
      if (null != var6) {
         if (var3 != 32) {
            a595((cn_)null, 111);
         }

         var6._a = null == var4 ? null : hd_.a492(var2, "da_monster_" + var4);
         var6._p = null != var5 ? hd_.a492(var0, "da_monster_" + var5) : null;
      }
   }

   static final boolean a454(CharSequence var0, int var1) {
      if (var1 != 10) {
         _W = (String)null;
      }

      return ah_.a098(var0, 10, true);
   }

   void a663(int var1, int var2, boolean var3) {
      gf_.c669(6 + var2, var1 + 35, super._x - 12, super._s - 40, 2105376, 0);
      short var5 = 211;
      int var4 = 35;
      short var6 = 194;
      int var7 = 0;

      int var8;
      int var9;
      for(var8 = var1; var4 > var7; ++var7) {
         if (var8 >= gf_._f && gf_._e > var8) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            int var10 = 0;
            int var11 = super._x;
            int var12;
            int var13;
            if (var7 <= 20) {
               for(; 20 >= var10; ++var10) {
                  var12 = (-var7 + 20) * (-var7 + 20) + (20 - var10) * (20 - var10);
                  if (462 >= var12) {
                     if (420 > var12) {
                        break;
                     }

                     var13 = var9 * (462 - var12) / 42;
                     var13 |= var13 << 8 | var13 << 16;
                     gf_._b[var8 * gf_._i + var2 + var10] = var13;
                  }
               }
            }

            if (20 >= var7) {
               var12 = var11;
               var11 -= 21;

               for(var13 = 0; var13 <= 20; ++var11) {
                  int var14 = (20 - var7) * (20 - var7) + var13 * var13;
                  if (462 < var14) {
                     break;
                  }

                  if (var14 >= 420) {
                     int var15 = var9 * (-var14 + 462) / 42;
                     var15 |= var15 << 16 | var15 << 8;
                     gf_._b[gf_._i * var8 + var2 + var11] = var15;
                  } else {
                     var12 = var11 + 1;
                  }

                  ++var13;
               }

               var11 = var12;
            }

            var9 |= var9 << 8 | var9 << 16;
            gf_.b115(var2 + var10, var8, var11 - var10, var9);
         }

         ++var8;
      }

      var6 = 169;
      var4 = 22;
      var5 = 194;
      var7 = 0;

      for(var8 = 35 + var1; var4 > var7; ++var8) {
         var9 = (-var5 + var6) * var7 / var4 + var5;
         var9 |= var9 << 8 | var9 << 16;
         gf_.b115(var2, var8, 6, var9);
         gf_.b115(super._x + (var2 - 6), var8, 6, var9);
         ++var7;
      }

      bl_._e.h093(super._x + var2 - 90, var1 + 10);
      jm_.a660(var2 + 5, super._x - 10, gn_._i, 0, 35 + var1);
      jm_.a660(var2, super._x, di_._l, 0, super._s + var1 - 22);
      byte var16 = 127;
      var4 = super._s - 79;
      var5 = 169;
      var7 = 0;
      var8 = var1 + 57;
      if (var3) {
         this.h423((byte)25);
      }

      while(var4 > var7) {
         var9 = var5 + var7 * (-var5 + var16) / var4;
         var9 |= var9 << 16 | var9 << 8;
         gf_.b115(var2, var8, 6, var9);
         gf_.b115(var2 + super._x - 6, var8, 6, var9);
         ++var7;
         ++var8;
      }

   }
}
