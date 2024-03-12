final class ra_ {
   private int[] _d;
   static String _a = "There is a bounty on this dungeon of <%0> Treasure.<br>(Dragon wakes: +<%1>%)<br>(Renown gambled: <%2>)";
   static wj_ _c;
   static int[] _b = new int[8192];

   final int a080(int var1, int var2) {
      int var3 = (this._d.length >> 1) - 1;
      int var4 = var3 & var1;
      if (var2 > -115) {
         return -109;
      } else {
         while(true) {
            int var5 = this._d[1 + var4 + var4];
            if (-1 == var5) {
               return -1;
            }

            if (this._d[var4 + var4] == var1) {
               return var5;
            }

            var4 = var3 & var4 + 1;
         }
      }
   }

   public static void a423() {
      _b = null;
      _a = null;
      _c = null;
   }

   static final void a150() {
      jj_.b423();
      int var0 = lc_.a776(hj_._S, eh_._h);
      if (var0 != ak_._n) {
         ak_._n = var0;
         if (var0 != -1) {
            fj_._f = new rh_(0, 0, 40, 80, 255, 197376, 224);
         } else {
            fj_._f = null;
         }
      }

      if (1 == no_._d) {
         int var1 = lc_.a776(lc_._c, hm_._k);
         if (var1 != kg_._f) {
            if (-1 != var1) {
               kg_._f = var1;
               um_._g = new rh_(0, 0, 40, 80, 16711680, 768, 224);
            }
         } else {
            um_._g = null;
            kg_._f = -1;
         }
      }

   }

   static final void c150() {
      jh_.c797();
      if (im_._e == null) {
         im_._e = new cn_(394, 296);
         im_._e._A = -8;
         im_._e._w = -8;
      }

      im_._e.e797();
      gf_.a797();

      int var0;
      int var1;
      int var2;
      int var3;
      int var4;
      for(var0 = 0; var0 < 7; ++var0) {
         var1 = -(var0 * 27) + 189 - 19;
         var2 = 20 * var0 + 8;
         var3 = -var0 + 6;

         for(var4 = 0; var4 < 1 + var0; var1 += 54) {
            jm_.a115(var2, var3, 3, var1);
            ++var4;
            var3 += 8;
         }
      }

      for(var0 = 7; var0 < 13; ++var0) {
         var1 = 27 * (var0 - 6) + 8;
         var2 = var0 * 20 + 8;
         var3 = var0 * 7 - 42;

         for(var4 = 0; 13 - var0 > var4; var3 += 8) {
            jm_.a115(var2, var3, 3, var1);
            ++var4;
            var1 += 54;
         }
      }

      gf_.d669(2, 2, 0, 0, im_._e._y, im_._e._v);
      jh_.b797();
   }

   ra_(int[] var1) {
      int var2;
      for(var2 = 1; var2 <= var1.length + (var1.length >> 1); var2 <<= 1) {
      }

      this._d = new int[var2 + var2];

      int var3;
      for(var3 = 0; var3 < var2 + var2; ++var3) {
         this._d[var3] = -1;
      }

      int var4;
      for(var3 = 0; var1.length > var3; this._d[var4 + var4 + 1] = var3++) {
         for(var4 = var2 - 1 & var1[var3]; this._d[var4 + var4 + 1] != -1; var4 = var2 - 1 & 1 + var4) {
         }

         this._d[var4 + var4] = var1[var3];
      }

   }

   static final void b150(int var0) {
      ha_._k = new lc_(ia_._W, ll_._r);
      hd_.a492(30, "menu_select");
      sa_._v = sh_.a289(-77, "da_ambience_drip", new int[]{110, 110, 110, 110, 140});
      hp_._c = sh_.a289(-95, "da_ambience_insect", new int[]{256, 256, 168});
      dc_._q = sh_.a289(var0 ^ -92, "da_door_open", new int[]{110, 100});
      om_._b = hd_.a492(140, "da_ambience_burning_torches_loop_4000ms");
      k_._f = hd_.a492(256, "da_ambience_running_water_loop_1000ms");
      mh_._f = hd_.a492(51, "da_menu_fire");
      qm_._n = hd_.a492(256, "da_gold_stealing");
      eb_._O = sh_.a289(-62, "da_gold_bar", new int[]{125, 125, 125, 125});
      bc_._b = hd_.a492(256, "da_dice_roll_dry");
      ef_._d = hd_.a492(171, "da_hoardroom_angry_dragon");
      u_._T = new cf_[9];
      u_._T[0] = hd_.a492(256, "01-the land of dungaria");
      u_._T[1] = hd_.a492(256, "02-once it was a battlefield");
      u_._T[2] = hd_.a492(256, "03-the world itself was in danger");
      u_._T[3] = hd_.a492(256, "04-now the dragons sleep");
      u_._T[4] = hd_.a492(256, "05-but still they battle");
      u_._T[5] = hd_.a492(256, "06-thru the life and death of others");
      u_._T[6] = hd_.a492(256, "07-take upon yourself");
      u_._T[7] = hd_.a492(256, "08-defend your hoard");
      u_._T[8] = hd_.a492(256, "09-become the dragon king");
      ed_.a029("goblin_defeat", 139, 1, "goblin_runt_reveal", 136);
      bf_.a311(256, 2, 256, -18228, "saurus");
      ed_.a029("goblin_defeat", 139, 3, "goblin_cleaver_reveal", 125);
      bf_.a311(197, 4, 170, -18228, "ork");
      to_.a124(119, -116, 136, 140, "witch", 5);
      bf_.a311(125, 6, 115, -18228, "beastman");
      kn_.a020(256, "saurus_defeat", 7, 256, 124, 256, "saurus_reveal", "saurus_reveal");
      bf_.a311(146, 8, 197, -18228, "mercenary_knight");
      to_.a124(150, -78, 150, 146, "priest", var0);
      bf_.a311(170, 10, 197, -18228, "ork");
      kn_.a020(140, "goblin_defeat", 11, 139, 126, 138, "goblin_scout_special", "goblin_scout_reveal");
      to_.a124(120, var0 ^ -117, 120, 159, "necromancer", 12);
      bf_.a311(200, 13, 200, -18228, "ogre");
      to_.a124(138, -110, 214, 134, "enchantress", 14);
      bf_.a311(256, 15, 256, -18228, "saurus");
      ed_.a029("ork_defeat", 197, 16, "ork_reveal", 170);
      kn_.a020(165, "troll_defeat", 17, 149, 127, 165, "troll_reveal", "troll_reveal");
      to_.a124(160, var0 ^ -119, 134, 130, "northman_ranger", 18);
      to_.a124(100, -120, 146, 134, "dwarf_renegade", 19);
      bf_.a311(139, 20, 200, -18228, "thief");
      bf_.a311(171, 21, 156, -18228, "zealot");
      bf_.a311(156, 22, 125, var0 - 18237, "darkelf_assassin");
      bf_.a311(138, 23, 148, -18228, "baerserker");
      bf_.a311(200, 24, 200, -18228, "ogre");
      bf_.a311(200, 25, 155, -18228, "spy");
      to_.a124(138, -93, 137, 135, "shapeshifter", 26);
      bf_.a311(150, 27, 164, var0 - 18237, "black_knight");
      bf_.a311(186, 28, 196, var0 ^ -18235, "minotaur");
      to_.a124(119, -126, 136, 140, "warlock", 29);
      bf_.a311(172, 30, 173, var0 - 18237, "death_knight");
      bf_.a311(147, 31, 200, -18228, "chaos_champion");
      bf_.a311(74, 33, 73, -18228, "daemonette");
      to_.a124(190, -99, 198, 197, "dryad", 34);
      ki_.a573(90, 15, 100, "giant_rats", -1);
      ki_.a573(125, 16, 76, "rot_worms", -1);
      ki_.a573(175, 17, 134, "troglodyte", -1);
      ki_.a573(110, 18, 110, "giant_snake", -1);
      ki_.a573(89, 19, 89, "giant_spider", -1);
      ki_.a573(201, 20, 102, "skeleton_sentinals", -1);
      ki_.a573(150, 21, 141, "corrosive_slime", var0 ^ -10);
      ki_.a573(100, 22, 83, "razor_construct", -1);
      ki_.a573(135, 23, 120, "rabid_wolf", -1);
      ki_.a573(112, 24, 109, "vampire_bat", -1);
      ki_.a573(180, 25, 91, "imp", -1);
      ki_.a573(200, 26, 120, "stone_golem", -1);
      ki_.a573(135, 27, 119, "spectre", -1);
      ki_.a573(42, 28, 57, "banshee", -1);
      ki_.a573(197, 29, 133, "raging_beast", -1);
      ki_.a573(147, 30, 143, "basilisk", -1);
      ki_.a573(99, 31, 125, "pit_demon", -1);
      ki_.a573(114, 32, 114, "vampire_lord", -1);
      ki_.a573(103, 33, 116, "hell_beast", -1);
      ki_.a573(97, 34, 100, "demon_lord", -1);
      fi_.a924(160, "tripwire_bell", 35);
      fi_.a924(60, "hallofglass", 36);
      fi_.a924(58, "magical_guardian", 37);
      lg_.a924(200, "hidden_pit", 4);
      lg_.a924(125, "snakes", 5);
      lg_.a924(178, "hidden_nails", 6);
      lg_.a924(200, "hidden_pit", 7);
      lg_.a924(145, "teleport", 8);
      lg_.a924(178, "hidden_nails", 9);
      lg_.a924(150, "bottomless_pit", 10);
      lg_.a924(194, "crusher", 11);
      lg_.a924(180, "crossbow", 12);
      lg_.a924(74, "whirling_blades", 13);
      lg_.a924(117, "poison_gas", 14);
   }
}
