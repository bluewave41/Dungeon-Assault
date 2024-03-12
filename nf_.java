final class nf_ extends ll_ {
   int[] _D;
   static String _w = "<col=FF0000>Lethal</col>, even if abilities would prevent death.";
   static int _y = -1;
   static boolean _A;
   static String[] _C = new String[]{"Raiding", "Raiding a Dungeon.<br><br>At the centre of each dungeon is the <%highlight>hoard room</col>, where your rival Dragon sleeps upon his treasures. The dungeon can be entered at any of the four corner tiles.<br><br><%command>Select one of the highlighted entrances to begin your assault.</col>"};
   private String[] _z;
   static q_[] _v;
   private int[][] _B;
   static String _x = "Sneak";
   private int[] _E;

   public static void e423() {
      _w = null;
      _C = null;
      _v = null;
      _x = null;
   }

   static final void d150(int var0) {
      o_._o.b150(-92);

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         id_._b[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         jf_._g[var1] = 0L;
      }

      nk_._Kb = var0;
   }

   final String c983(byte var1) {
      StringBuilder var2 = new StringBuilder(80);
      if (this._z == null) {
         return "";
      } else {
         if (var1 >= -65) {
            a408((CharSequence[])null);
         }

         var2.append(this._z[0]);

         for(int var3 = 1; this._z.length > var3; ++var3) {
            var2.append("...");
            var2.append(this._z[var3]);
         }

         return var2.toString();
      }
   }

   final void a603(ec_ var1, int var2) {
      if (var2 == -1) {
         while(true) {
            int var3 = var1.c474(true);
            if (var3 == 0) {
               return;
            }

            this.a994(var1, 32768, var3);
         }
      }
   }

   final void d423(byte var1) {
      if (var1 > -4) {
         _w = (String)null;
      }

      if (this._D != null) {
         for(int var2 = 0; var2 < this._D.length; ++var2) {
            this._D[var2] = mp_.a080(this._D[var2], 32768);
         }
      }

   }

   static final int[] a197(wm_ var0, int var1) {
      int var2 = 0;
      if (0 != var1 % 7 && var0.a370(-(var1 / 7) + (var1 - 1), (byte)103)) {
         ia_._S[var2++] = var1 - 1;
      }

      if (var1 > 6 && var0.a370(var1 + 35, (byte)121)) {
         ia_._S[var2++] = var1 - 7;
      }

      if (var1 % 7 != 6 && var0.a370(var1 - var1 / 7, (byte)86)) {
         ia_._S[var2++] = 1 + var1;
      }

      if (42 > var1 && var0.a370(var1 + 42, (byte)86)) {
         ia_._S[var2++] = var1 + 7;
      }

      int[] var3 = new int[var2];

      for(int var4 = 0; var2 > var4; ++var4) {
         var3[var4] = ia_._S[var4];
      }

      return var3;
   }

   private final void a994(ec_ var1, int var2, int var3) {
      if (var3 != 1) {
         int var4;
         int var5;
         if (2 != var3) {
            if (3 == var3) {
               var4 = var1.c474(true);
               this._E = new int[var4];
               this._B = new int[var4][];

               for(var5 = 0; var5 < var4; ++var5) {
                  int var6 = var1.k137(0);
                  ad_ var7 = qd_.a483(var6);
                  if (var7 != null) {
                     this._E[var5] = var6;
                     this._B[var5] = new int[var7._a];

                     for(int var8 = 0; var8 < var7._a; ++var8) {
                        this._B[var5][var8] = var1.k137(0);
                     }
                  }
               }
            } else if (var3 == 4) {
            }
         } else {
            var4 = var1.c474(true);
            this._D = new int[var4];

            for(var5 = 0; var4 > var5; ++var5) {
               this._D[var5] = var1.k137(0);
            }
         }
      } else {
         this._z = ih_.a640(97, '<', var1.d738(-117));
      }

      if (var2 != 32768) {
         this.d423((byte)59);
      }

   }

   static final void a096(int var0, String var1) {
      he_._s = false;
      cd_._b = false;
      if (a_._n != null && a_._n._T) {
         if (var0 == 8) {
            var0 = 2;
            if (qc_._t) {
               var1 = d_._b;
            } else {
               var1 = fk_._s;
            }

            wo_._e.a984(-12349, co_._C);
         }

         boolean var2 = true;
         if (10 == var0) {
            rp_.a423();
            var2 = false;
         }

         if (var2) {
            if (he_._s) {
               var1 = jk_.a841(new String[]{var1}, oi_._G, 30496);
            }

            if (jd_._l) {
               var1 = kk_._t;
            }

            a_._n.a013(26889, var1, var0);
         }

         if (256 != var0 && 10 != var0 && !qc_._t) {
            wo_._e.i150(22377);
         }
      }

   }

   static final String a408(CharSequence[] var0) {
      return ef_.a545(0, 39, var0, var0.length);
   }
}
