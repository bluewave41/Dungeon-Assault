final class ab_ {
   static String _b = "Steal gold: ";
   static long _a;
   static int _c = 0;
   static String[] _d = new String[]{"Miner Disturbance", "Dr. Phlogiston Saves the Earth", "Crazy Crystals", "Hostile Spawn", "Pixelate", "Sol Knight", "Stellar Shard", "Wizard Run", "Arcanists", "Zombie Dawn"};

   static final void a150(int var0) {
      int var1;
      if (id_._l != null && fc_._d == uo_._f.length - 1) {
         if (id_._l != bl_._l) {
            h_._f = mf_.a971(16744448, id_._l._x, 8, id_._l._q);
            bl_._l = id_._l;
         }

         var1 = 32 - mo_._a % 50 << 3;
         if (0 < var1) {
            h_._f.b326(id_._l._t, id_._l._i, var1);
         }
      }

      if (var0 == 0) {
         dh_.a115(32, vf_._w, wi_._kb, qc_._w);
         gf_.a331(ib_._a);
         gf_.e115(vf_._w, qc_._w, vf_._w + 200, wi_._kb + qc_._w + 3);
         if (-1 != ce_._p) {
            if (bl_._k) {
               var1 = fa_.a666(-(20 + hc_._b), 0);
               if (null == gk_._L) {
                  var1 = 0;
               }

               bo_.a286(var0 ^ 5, gk_._L, var1 + qc_._w, vf_._w);
               bo_.a286(5, jn_._l, 20 + qc_._w - (-var1 - hc_._b), vf_._w);
            } else {
               var1 = fa_.a666(0, -(20 + ui_._a));
               if (gk_._L == null) {
                  var1 = 0;
               }

               bo_.a286(5, jn_._l, var1 + qc_._w, vf_._w);
               bo_.a286(var0 ^ 5, gk_._L, 20 + qc_._w + var1 + ui_._a, vf_._w);
            }
         } else {
            bo_.a286(var0 ^ 5, gk_._L, qc_._w, vf_._w);
         }

         gf_.b331(ib_._a);

         for(rj_ var2 = (rj_)pp_._K.e024(var0 ^ -24172); var2 != null; var2 = (rj_)pp_._K.a024(4)) {
            var2.d150(0);
         }

      }
   }

   static final int a313(int var0, int var1, int var2) {
      if (var0 != -776726687) {
         b150(-127);
      }

      int var3 = 0;

      for(int var4 = jm_._c; go_._A.length > var3; ++var3) {
         int var5 = to_._c[var3];
         if (var5 < 0) {
            var4 += ag_._a;
         } else {
            int var6 = og_.a571(true, go_._A[var3], var0 ^ 776707894);
            var4 += ci_._j;
            int var7 = vo_._r - (var6 >> 1);
            if (ec_.a366(var4, mj_._g + (h_._q << 1), var1, (oh_._t << 1) + var6, -oh_._t + var7, var2, 100)) {
               return var5;
            }

            var4 += mj_._g + ci_._j + (h_._q << 1);
         }
      }

      return -1;
   }

   public static void b150(int var0) {
      if (var0 != 1781937827) {
         _c = 85;
      }

      _b = null;
      _d = null;
   }

   public final String toString() {
      throw new IllegalStateException();
   }

   static final int a410() {
      return kc_._U;
   }
}
