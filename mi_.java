final class mi_ {
   static String _d;
   static String _c = "There is a bounty on this dungeon - you will be awarded <%0> Treasure if you reach the hoard room.";
   static String[] _a = new String[]{"Ferocity", "Double <%attack> in first round of combat."};
   static int _f;
   static String _b = "Tripwire Bell";
   static nh_ _e;

   static final void a300(pp_ var0, String var1, se_ var2, cn_ var3) {
      jh_.c797();
      int var4 = var2.b926(var1);
      int var5 = var2._E + var2._H;
      cn_ var6 = new cn_(var4, var5);
      var6.e797();
      var2.b191(var1, 0, var2._H, 16760960, -1);
      cn_ var7 = te_.a983(var4, var5, ag_._c, 32, 32, 0.125);

      for(int var8 = 0; var7._B.length > var8; ++var8) {
         if (var6._B[var8] == 0) {
            var7._B[var8] = 0;
         }
      }

      cn_ var15 = rb_.a551(16, var6, 16776960, (byte)-38);
      int var9 = -var6._y + var3._y >> 1;
      int var10 = -var6._v + var3._v >> 1;
      cn_ var11 = dd_.a510(4, var7);
      cn_ var12 = var3.d125();
      var12.e797();
      bp_.a131(var10, var11, var9);
      var7.h093(var9, var10);
      var12.h797();
      cn_ var13 = var12.d125();
      var13.e797();
      gf_.b669(0, 0, var3._y, var3._v, 0, 160);
      cn_ var14 = var3.d125();
      var14.e797();
      rb_.a551(8, var6, 12690143, (byte)-34).b326(var9, var10, 32);
      var6.h093(var9, var10);
      var15._w += var9;
      var15._A += var10;
      jh_.b797();
      var0.a994(var12, var15, var14, var13, 31);
   }

   static final void a050(int var0, int var1, int var2, int var3) {
      ag_._a = var3;
      mj_._g = var1;
      i_._n = var0;
      li_._g = var2;
   }

   static final void a150() {
      lf_._w = dk_.a747(120, 1, "da_title3");
      jd_._o = dk_.a747(170, 1, "da_intro");
      wj_._u = dk_.a747(150, 1, "da_highscores");
      gh_._d = dk_.a747(110, 1, "da_ingame_battle");
      g_._Lb = dk_.a747(180, 1, "da_ingame_stealth");
      kj_._o = dk_.a747(89, 1, "da_raid_win");
      tm_._b = dk_.a747(131, 1, "da_raid_lose");
      gl_._Ib = dk_.a747(200, 1, "da_stressing_music");
      dd_._B = dk_.a747(100, 1, "da_defeat_monster");
      ek_._b._A.f150(-50);
      ha_._k = null;
   }

   static final void b150() {
      if (ql_._d >= 224) {
         um_.a430(256);
      } else {
         int var0 = ql_._d % 32;
         um_.a430(-var0 + ql_._d + 32);
      }

   }

   public static void c150() {
      _e = null;
      _a = null;
      _c = null;
      _d = null;
      _b = null;
   }
}
