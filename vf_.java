abstract class vf_ extends ll_ {
   boolean _B;
   static String _y = "Watch Introduction";
   static int _x = 480;
   static String[] _A = new String[]{"Dragons of Renown", "<%highlight>You're now approaching the end of the Dungeon Assault tutorial</col>. Having taken and fortified your dungeon, and recruited a party of raiders, you can now send them forth on your first real raid."};
   static int _w;
   volatile boolean _v = true;
   boolean _z;

   abstract byte[] b318(boolean var1);

   static final int[] a867(int var0, int var1) {
      int var2 = oj_.a353(var1);
      int var3 = jg_.a080(8191, var1);
      int var4 = oj_.a353(var0);
      int var5 = jg_.a080(8191, var0);
      int var6 = (int)((long)var2 * (long)var4 >> 16);
      int var7 = (int)((long)var5 * (long)var2 >> 16);
      int var8 = (int)((long)var4 * (long)var3 >> 16);
      int var9 = (int)((long)var3 * (long)var5 >> 16);
      return new int[]{0, 0, 0, var5, 0, var4, var6, var3, -var7, -var8, var2, var9};
   }

   static final void c423() {
      if (null != kf_._p) {
         ib_.a950("goblin_club", 1);
         ib_.a950("saurus_spawn", 2);
         ib_.a950("goblin_cleaver", 3);
         ib_.a950("orc_warrior", 4);
         ib_.a950("witch", 5);
         ib_.a950("beastman", 6);
         ib_.a950("saurus_slink", 7);
         ib_.a950("mercenary", 8);
         ib_.a950("priest", 9);
         ib_.a950("orc_blademaster", 10);
         ib_.a950("goblin_scout", 11);
         ib_.a950("necromancer", 12);
         ib_.a950("ogre", 13);
         ib_.a950("enchantress", 14);
         ib_.a950("saurus_warrior", 15);
         ib_.a950("orc_shaman", 16);
         ib_.a950("troll", 17);
         ib_.a950("northman", 18);
         ib_.a950("dwarf_renegade", 19);
         ib_.a950("thief", 20);
         ib_.a950("zealot", 21);
         ib_.a950("darkelf", 22);
         ib_.a950("baerserker", 23);
         ib_.a950("ogre", 24);
         ib_.a950("spy", 25);
         ib_.a950("blackknight", 27);
         ib_.a950("minotaur", 28);
         ib_.a950("necromancer", 29);
         ib_.a950("blackknight", 30);
         ib_.a950("chaos_champion", 31);
         ib_.a950("demonette", 33);
         ib_.a950("dryad", 34);
         o_.a013(11404, "giantrats", 15);
         o_.a013(11404, "rotworms", 16);
         o_.a013(11404, "troglodytes", 17);
         o_.a013(11404, "giantsnake", 18);
         o_.a013(11404, "giantspider", 19);
         o_.a013(11404, "skeleton", 20);
         ic_.a871(21, 27029, "corrosive_slime");
         o_.a013(11404, "razor_construct", 22);
         o_.a013(11404, "vampirebats", 24);
         o_.a013(11404, "imp", 25);
         o_.a013(11404, "stone_golem", 26);
         o_.a013(11404, "spectre", 27);
         o_.a013(11404, "banshee", 28);
         o_.a013(11404, "hellbeast", 29);
         o_.a013(11404, "pitdemon", 31);
         o_.a013(11404, "vampirelord", 32);
         o_.a013(11404, "hellbeast", 33);
         o_.a013(11404, "demonlord", 34);
         ic_.a871(0, 27029, "empty_room");
         ic_.a871(3, 27029, "empty_room");
         ic_.a871(2, 27029, "empty_room");
         ic_.a871(4, 27029, "bottomless_pit");
         ic_.a871(5, 27029, "snakes");
         ic_.a871(6, 27029, "nails");
         ic_.a871(7, 27029, "hidden_pit");
         ic_.a871(8, 27029, "teleport");
         ic_.a871(9, 27029, "hidden_nails");
         ic_.a871(10, 27029, "bottomless_pit");
         ic_.a871(11, 27029, "crusher");
         ic_.a871(12, 27029, "crossbow");
         ic_.a871(14, 27029, "poison_gas");
         ic_.a871(13, 27029, "whirling_blades");
         ic_.a871(35, 27029, "tripwire_bell");
         ic_.a871(36, 27029, "glass");
         k_._c = tp_.a267(kf_._p, "laugh", "skull", -1998);
         hf_._ib = tp_.a267(kf_._p, "tumble", "dice", -1998);
         rg_._M = new eh_[4];

         for(int var1 = 0; var1 < 4; ++var1) {
            rg_._M[var1] = tp_.a267(kf_._p, "idle" + (1 + var1), "dragon", -1998);
         }

         bo_._Lb = tp_.a267(kf_._p, "eye_open", "dragon", -1998);
         ce_._v = tp_.a267(kf_._p, "victory", "dragon", -1998);
         kf_._j = tp_.a267(kf_._p, "defeat", "dragon", -1998);
      }
   }

   static final void a483(int var0, boolean var1, int var2, int var3) {
      if (var1) {
         jc_.a669(var0, var2, var3, 1, 2, 1);
      } else {
         jc_.a669(var0, var2, var3, 0, 2, 0);
      }

   }

   abstract int d410(byte var1);

   public static void d150() {
      _y = null;
      _A = null;
   }
}
