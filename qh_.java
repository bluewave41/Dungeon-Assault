final class qh_ {
   int _M;
   static cn_ _q;
   int[] _k;
   int[] _O;
   int[] _g;
   int[] _l;
   short[] _v;
   private boolean _f = false;
   int[] _m;
   short[] _e;
   byte[] _y;
   short[] _t;
   static String _D = "The brass construction in this room is humanoid in design, but has razor-sharp blades in place of arms.<br><br>Defeated raiders permanently lose 2 <%defence>. (If <%defence> reduced to 0, the raider dies)";
   int _p;
   short[] _F;
   short _B;
   short[] _N;
   static String[] _J = new String[]{"The land of Dungaria, home of the dragon.", "Once it was a battlefield, where dragons did wage war upon each other for pride and dominance.", "The world itself was in danger of destruction.", "Now the ancient dragons sleep in their subterranean lairs...", "...but still they battle, still they fight.", "Through the life and death of others, they seek gold and renown!", "Take upon yourself the mantle of dragonhood.", "Defend your hoard. Send forth your raiders. Battle your rivals...", "Become the Dragon King!"};
   short[] _n;
   int _H;
   short[] _s;
   short[] _o;
   short[] _A;
   short[] _x;
   int[] _u;
   short[] _Q;
   static String[] _R = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
   short[] _P;
   short[] _d;
   short[] _I;
   short _h;
   static String[] _E = new String[]{"Construction", "To prevent other players stealing your Treasure (and diminishing your Renown), you can place additional <%traps> and <%monsters> in your dungeon. Placing new dungeon rooms requires you to spend <%highlight>Treasure</highlight>. The total amount of <%highlight>Treasure</col> you have to spend is located at the <%highlight>bottom-right of this screen</col>."};
   int _i;
   int _b;
   int[] _K;
   short[] _C;
   static ja_ _G;
   int _a;
   static String _j = "<col=FF0000>limit reached</col>";
   short[] _z;
   byte _w = 0;
   short[] _S;
   int[] _r;
   short[] _L;
   int[] _T;
   short _c;

   final void a483(int var1, boolean var2, int var3, int var4, int var5) {
      for(int var6 = 0; this._B > var6; ++var6) {
         this._L[var6] = (short)(this._L[var6] * var5 / var1);
         this._S[var6] = (short)(this._S[var6] * var3 / var1);
         this._z[var6] = (short)(var4 * this._z[var6] / var1);
      }

      if (!var2) {
         this.b150(32767);
      }
   }

   static final void a726(int var0, rj_ var1, int var2) {
      if (kn_._g) {
         if (6 != var2) {
            if (8 == var2) {
               if (la_._f) {
                  la_._f = false;
                  var2 = 5;
                  o_._n.a093(8, -69);
               }
            } else if (var2 == 11 && o_._n.a370(11, (byte)127)) {
               ba_.a787(var1, (byte)52, 12);
               return;
            }
         } else {
            if (la_._f) {
               la_._f = false;
               var2 = 4;
               o_._n.a093(6, -64);
            } else if (lk_._S > 0) {
               var2 = 7;
            }

            ++lk_._S;
         }

         if (var0 != -13716) {
            b423((byte)-92);
         }

         if (!o_._n.a370(var2, (byte)71)) {
            o_._n.a093(var2, var0 ^ 13772);
            ba_.a787(var1, (byte)90, var2);
         }

      }
   }

   private final void b150(int var1) {
      if (var1 != 32767) {
         this._Q = (short[])null;
      }

      this._f = false;
   }

   static final void a150(int var0) {
      gf_.e050(243, 197, 369, 143, 16777215);
      gf_.b050(244, 198, 367, 141, 0);
      if (var0 != 245) {
         _R = (String[])null;
      }

      if (null == of_._q) {
         if (null != tg_._l) {
            tg_._l.a385(bg_._t, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
         }

      } else {
         cn_ var1 = of_._q[me_._f];
         if (var1 != null) {
            var1.h093(245, 199);
         } else if (tg_._l != null) {
            tg_._l.a385(bg_._t, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
         }

         int var3;
         if (wf_._x < am_._g) {
            var1 = of_._q[ai_._n];
            if (var1 != null) {
               int var2 = wf_._x * (var1._E + 60) / am_._g;
               var3 = var2 - 30;
               if (oo_._a) {
                  lg_.a494(-256 * var3 / 30, var0 + '︋', (-var3 + var1._E) * 256 / 30, 199, 245, var1);
               } else {
                  lg_.a494((var1._E - var3) * 256 / 30, 65280, var3 * -256 / 30, 199, 245, var1);
               }
            }
         }

         if (tg_._l != null) {
            String var4 = null;

            for(var3 = 0; var3 < of_._q.length; ++var3) {
               var1 = of_._q[var3];
               if (null != var1 && (365 != var1._E || var1._G != 139)) {
                  if (var4 != null) {
                     var4 = var4 + ", " + var3;
                  } else {
                     var4 = Integer.toString(var3);
                  }
               }
            }

            if (null != var4) {
               tg_._l.a385("Screenshot(s) " + var4 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            }
         }

      }
   }

   static final boolean a097(int var0) {
      return var0 == (var0 & -var0);
   }

   final void a115(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; this._B > var5; ++var5) {
         short[] var10000 = this._L;
         var10000[var5] = (short)(var10000[var5] + var2);
         var10000 = this._S;
         var10000[var5] = (short)(var10000[var5] + var4);
         var10000 = this._z;
         var10000[var5] = (short)(var10000[var5] + var3);
      }

      this.b150(32767);
   }

   final void a423(byte var1) {
      if (!this._f) {
         this._f = true;
         short var2 = 32767;
         short var3 = 32767;
         short var4 = 32767;
         short var5 = Short.MIN_VALUE;
         short var6 = Short.MIN_VALUE;
         short var7 = Short.MIN_VALUE;

         for(int var8 = 0; this._B > var8; ++var8) {
            short var9 = this._L[var8];
            short var10 = this._S[var8];
            short var11 = this._z[var8];
            if (var10 > var6) {
               var6 = var10;
            }

            if (var9 > var5) {
               var5 = var9;
            }

            if (var10 < var3) {
               var3 = var10;
            }

            if (var2 > var9) {
               var2 = var9;
            }

            if (var4 > var11) {
               var4 = var11;
            }

            if (var7 < var11) {
               var7 = var11;
            }
         }

         if (var1 > -116) {
            this.a483(-99, true, -5, 127, 16);
         }

         this._M = var6;
         this._b = var7;
         this._H = var2;
         this._i = var5;
         this._p = var3;
         this._a = var4;
      }
   }

   static final int a602(boolean var0, cd_ var1, cd_ var2) {
      if (var0) {
         _E = (String[])null;
      }

      return op_.a489(var1, 0, 0, var2, (String)null, -115, false);
   }

   static final int a287(byte[] var0, int var1) {
      return fm_.a552(var1, 0, var0);
   }

   public static void b423(byte var0) {
      if (var0 == 75) {
         _E = null;
         _D = null;
         _j = null;
         _q = null;
         _G = null;
         _J = null;
         _R = null;
      }
   }
}
