import java.awt.Image;

abstract class bb_ {
   static nh_ _b;
   static String[] _t = new String[]{"Trap", "<%highlight>This room contains a trap!</col> A <%trap>, such as <%lastroom>, will usually have high <%snare> and <%detect>, with low or no <%attack> or <%defence>."};
   static String _f = null;
   static String _r = "Select a raider to enchant with additional Sneak";
   static String[] _l = new String[]{"Offering", "Sacrifice an orc or goblin to negate death or incapacity. (Multiple use)"};
   static String _q = "RESULT";
   static Image _e;
   static String[] _k = new String[]{"Raid a dungeon using only goblins", "Raid a dungeon using only orcs", "Complete 1 raid", "Complete 5 raids", "Complete 10 raids", "Complete 20 raids", "Complete 5 raids in succession", "Complete a raid without any raider being incapacitated or killed", "Defend your dungeon from 1 raid", "Defend your dungeon from 5 raids", "Defend your dungeon from 10 raids", "Defend your dungeon from 20 raids", "Kill 50% of the raiders raiding your dungeon", "Kill 100% of the raiders raiding your dungeon", "Successfully raid and clear all rooms including entrances in a dungeon where the dragon has more than 4,500 Renown", "Reach 7,000 Renown", "Successfully raid a dragon after failing it previously", "Lose 4 raiders when a dragon wakes", "Collect a bounty from 5 dungeons consecutively", "Successfully complete 500 raids", "Successfully defend your dungeon from 250 attacks", "Successfully steal over 2000 gold from a player in one raid", "Achieve all of the 'Dragon's...' Achievements", "Successfully complete 1000 raids", "Successfully defend your dungeon from 500 attacks", "Reach 10,000 Renown", "Defend your dungeon with traps worth over 3000 Treasure", "Defend your dungeon with monsters worth over 3000 Treasure", "Successfully steal a dragon's gold with a 90% or higher chance of waking it", "Successfully steal over 5000 gold from a player in one raid", "Charge at least 20 Orbs of Mastery at the same time", "Successfully complete 2000 raids", "Successfully defend your dungeon from 1000 attacks", "Reach 20,000 Renown", "Successfully raid the same dragon 3 times consecutively", "Steal an Orb of Power", "Successfully steal a dragon's gold twice consecutively, with an 80% or higher chance of waking it", "Collect a bounty from a dragon with at least 15,000 Renown, successfully stealing its gold with a 90% or higher chance of waking it, using only raiders available while charging an orb without any of them being killed or incapacitated", "Collect all the titles", "Steal 1000 gold from the player who last raided you", "Hold 20,000 Treasure at once", "Have earned a total of 1,000,000 Treasure", "Never go more than 7 days without raiding a dungeon throughout a whole year", "Achieve a top 200 place among the Dragons of Renown", "Achieve a top 30 place among the Dragons of Renown", "Achieve a top 10 place among the Dragons of Renown"};
   up_ _g = new up_();
   up_ _p = new up_();
   up_ _d = new up_();
   up_ _s = new up_();
   int _a;
   ec_ _o = new ec_(6);
   long _n;
   volatile int _h = 0;
   volatile int _c = 0;
   ec_ _m = new ec_(10);
   byte _j = 0;
   em_ _i;

   public static void a423() {
      _q = null;
      _b = null;
      _k = null;
      _t = null;
      _e = null;
      _f = null;
      _r = null;
      _l = null;
   }

   static final cn_[] a447(int var0, int var1, int var2) {
      return pe_.a289(var2, var0, var1, 1);
   }

   abstract void a150(int var1);

   final boolean d154(int var1) {
      if (var1 != 20) {
         this._d = (up_)null;
      }

      return 20 <= this.e137(var1 + 0);
   }

   abstract void a993(Object var1, boolean var2, byte var3);

   abstract void f150(int var1);

   abstract boolean b427(byte var1);

   final int c137(int var1) {
      if (var1 != 20) {
         this._a = 69;
      }

      return this._g.b410((byte)53) + this._p.b410((byte)53);
   }

   final boolean b154(int var1) {
      if (var1 != -21431) {
         return true;
      } else {
         return 20 <= this.c137(var1 ^ -21411);
      }
   }

   final int e137(int var1) {
      if (var1 != 20) {
         this.d154(38);
      }

      return this._d.b410((byte)53) + this._s.b410((byte)53);
   }

   final em_ a180(boolean var1, int var2, byte var3, int var4, byte var5) {
      long var6 = (long)var4 + ((long)var2 << 32);
      em_ var8 = new em_();
      var8._E = var3;
      var8._o = var6;
      var8._B = var1;
      if (!var1) {
         if (20 <= this.e137(20)) {
            throw new RuntimeException();
         }

         this._d.a857(var8, -32711);
      } else {
         if (this.c137(20) >= 20) {
            throw new RuntimeException();
         }

         this._g.a857(var8, -32711);
      }

      if (var5 <= 65) {
         _t = (String[])null;
      }

      return var8;
   }
}
