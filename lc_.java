final class lc_ {
   static String[] _k = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
   static String _g = "Active ability - <%0>";
   private nh_ _i;
   static int _j;
   static int _d;
   static int _c = 0;
   static int[] _h = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
   static float _e;
   private wa_ _a = new wa_(256);
   private nh_ _b;
   private wa_ _f = new wa_(256);

   private final va_ a206(int[] var1, int var2, int var3, int var4) {
      int var5 = ((-1073737729 & var3) << 4 | var3 >>> 12) ^ var4;
      var5 |= var3 << 16;
      long var6 = (long)var5;
      if (var2 >= -8) {
         this.a152((int[])null, (byte)-121, -3);
      }

      va_ var8 = (va_)this._f.a722(var6, 8);
      if (null != var8) {
         return var8;
      } else if (var1 != null && 0 >= var1[0]) {
         return null;
      } else {
         v_ var9 = v_.a141(this._i, var3, var4);
         if (var9 != null) {
            var8 = var9.a981();
            this._f.a102(var8, 12460, var6);
            if (var1 != null) {
               var1[0] -= var8._k.length;
            }

            return var8;
         } else {
            return null;
         }
      }
   }

   final va_ a251(String var1, byte var2, String var3) {
      return var2 <= 101 ? (va_)null : this.a058((int[])null, var3, 48117, var1);
   }

   final va_ a848(String var1, String var2, int var3) {
      if (var3 != 37316) {
         _g = (String)null;
      }

      return this.a527(var2, (int[])null, (byte)118, var1);
   }

   final va_ a319(int[] var1, int var2, int var3) {
      if (1 != this._i.b474(true)) {
         if (1 == this._i.b080(var2, var3 ^ var3)) {
            return this.a206(var1, var3 ^ 31216, var2, 0);
         } else {
            throw new RuntimeException();
         }
      } else {
         return this.a206(var1, -15, 0, var2);
      }
   }

   final va_ a152(int[] var1, byte var2, int var3) {
      if (1 == this._b.b474(true)) {
         return this.a958(-126, var3, 0, var1);
      } else {
         if (var2 >= -61) {
            this._f = (wa_)null;
         }

         if (1 == this._b.b080(var3, 0)) {
            return this.a958(-123, 0, var3, var1);
         } else {
            throw new RuntimeException();
         }
      }
   }

   static final int a776(int var0, int var1) {
      if (nj_._f != null && 94 < var0 && 546 > var0 && 90 <= var1 && var1 <= 184) {
         var0 += ig_.b137() - 94;

         for(hm_ var2 = (hm_)nj_._f.e024(-24172); var2 != null; var2 = (hm_)nj_._f.a024(4)) {
            if (var2._o <= var0 && 32 + var2._o >= var0 && var1 >= var2._p && var1 <= 32 + var2._p) {
               return var2._i;
            }
         }
      }

      return -1;
   }

   static final byte[] a266(byte[] var0) {
      ec_ var1 = new ec_(var0);
      int var2 = var1.c474(true);
      int var3 = var1.h137(-116);
      if (var3 >= 0 && (ql_._j == 0 || var3 <= ql_._j)) {
         if (0 == var2) {
            byte[] var9 = new byte[var3];
            var1.a286((byte)-95, 0, var3, var9);
            return var9;
         } else {
            int var4 = var1.h137(-69);
            if (var4 >= 0 && (ql_._j == 0 || ql_._j >= var4)) {
               byte[] var5 = new byte[var4];
               if (1 != var2) {
                  synchronized(ek_._f) {
                     ek_._f.a730(-109, var5, var1);
                  }
               } else {
                  ej_.a265(var5, var4, var0, var3, 9);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   static final cn_ a608(cn_ var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         cn_ var3 = new cn_(var1, var2);
         jh_.a303(var3);
         if (var1 < var0._y && var0._v > var2) {
            var0.b115(0, 0, var1, var2);
         } else {
            var0.e115(var1 >> 1, var2 >> 1, 0, (var1 << 12) / var0._y);
         }

         jh_.b797();
         return var3;
      }
   }

   static final gn_[] a603(String[][] var0) {
      int var1 = var0.length;
      gn_[] var2 = new gn_[var1];

      for(int var3 = 0; var1 > var3; ++var3) {
         var2[var3] = new gn_(var0[var3][0], var0[var3][1]);
      }

      return var2;
   }

   public static void a487() {
      _h = null;
      _k = null;
      _g = null;
   }

   private final va_ a958(int var1, int var2, int var3, int[] var4) {
      int var5 = var2 ^ (var3 >>> 12 | (var3 & -268431361) << 4);
      var5 |= var3 << 16;
      long var6 = 4294967296L ^ (long)var5;
      va_ var8 = (va_)this._f.a722(var6, 8);
      if (null == var8) {
         if (var4 != null && 0 >= var4[0]) {
            return null;
         } else {
            jp_ var9 = (jp_)this._a.a722(var6, 8);
            if (var1 >= -101) {
               _g = (String)null;
            }

            if (null == var9) {
               var9 = jp_.a989(this._b, var3, var2);
               if (null == var9) {
                  return null;
               }

               this._a.a102(var9, 12460, var6);
            }

            var8 = var9.a321(var4);
            if (null != var8) {
               var9.a487(false);
               this._f.a102(var8, 12460, var6);
               return var8;
            } else {
               return null;
            }
         }
      } else {
         return var8;
      }
   }

   private final va_ a527(String var1, int[] var2, byte var3, String var4) {
      int var5 = this._i.a913(var1, 1000);
      if (var5 >= 0) {
         int var6 = this._i.a026(0, var4, var5);
         if (var3 < 85) {
            this.a152((int[])null, (byte)102, -108);
         }

         return var6 < 0 ? null : this.a206(var2, -100, var5, var6);
      } else {
         return null;
      }
   }

   private final va_ a058(int[] var1, String var2, int var3, String var4) {
      int var5 = this._b.a913(var2, var3 ^ '렝');
      if (var5 >= 0) {
         if (var3 != 48117) {
            _k = (String[])null;
         }

         int var6 = this._b.a026(0, var4, var5);
         return 0 <= var6 ? this.a958(-107, var6, var5, var1) : null;
      } else {
         return null;
      }
   }

   lc_(nh_ var1, nh_ var2) {
      this._i = var1;
      this._b = var2;
   }
}
