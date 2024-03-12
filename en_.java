import java.applet.Applet;

abstract class en_ {
   static String[] _a = new String[]{"Welcome to Dungeon Assault!<br><br>The goal of this game is to win power and fame as a dragon by successfully raiding other players' dungeons while defending your own.<br><br>Use raiders to steal gold from the hoards of other dragons; construct devious traps and recruit powerful monsters to safeguard your own hoard.", "Ages ago, the realm of Dungaria was plagued by continuous wars between the native dragons, as they warred with each other in pursuit of power. Eventually, the gods of that realm intervened, binding all dragons with powerful magics, forbidding them from engaging directly in combat with each other. Even with these restrictions, the dragons still felt the urge to compete against others of their kind, and so became 'the Game': a system of ritualised combat executed entirely with minions, as the dragons themselves sleep at the centres of their domains. It is as a player of 'the Game' that you interact with the world of Dungeon Assault.", "Renown tracks your success in the Game. Your Renown will increase with each successful raid or dungeon defence, as well as slowly over time. Your Renown will decrease for each failed raid or dungeon defence. How much Renown you have, and how much you have lost since you started playing the Game, are used to determine the amount of Treasure you are able to steal from other dragons.", "Raiders are mortal creatures, bound in service to a dragon. They can be injured (making them unavailable for a short length of time) or killed (permanently lost). Raiders can be recruited by spending Treasure. Each raider has different levels in the following four skills:<br>-Attack, used in combat against opponents<br>-Defence, used in combat and to flee from opponents<br>-Dodge, used to avoid traps and flee from opponents<br>-Sneak, used to disarm traps and to gain the element of surprise in combat.<br><br>This means that some raiders will be good at dealing with certain room types, but poor at dealing with others. As your Renown increases, you will be able to select from a wider range of raiders. Recruit raiders by clicking on 'My Stable'. You can employ up to eight raiders at a time. Select a raider type from the panel on the left and click 'Recruit' to recruit it, or select an existing raider from the central section and click 'Dismiss' to remove it. When finished, click 'Confirm' to save any changes and exit.", "Rooms are placed in your dungeon to make attacking it more difficult. Rooms can be added to your dungeon by spending Treasure. There are three types of room: monster, trap and guardian. Monster rooms contain creatures that engage any raiders in combat. Trap rooms contain traps that, if triggered, attempt to incapacitate or kill a raider. Guardian rooms, if triggered, alert all creatures in the dungeon, making them harder to surprise and, therefore, more effective in combat. Rooms are rated in four areas: Attack, Defence, Snare and Detect.<br><br>To construct rooms in your dungeon, click 'My Dungeon'. Similarly to recruiting raiders, click a room type from the panel on the left, and click on your dungeon to place it. Replacing an existing room will refund half of the original room's cost. The entrances and the hoard room cannot be replaced. When finished, click 'Confirm' to save any changes and exit.", "All players are listed in the 'Dragons of Renown' table, which is updated every few minutes. Players are sorted by their current Renown. To raid another player's dungeon, click their entry on this table and select 'Raid'. A good target to choose would be one that is close to you in the table - players that are far above you will be too well defended for you to successfully attack, and the potential gain from players that are far below you is minimal. Additionally, if your target has much less Renown than you, he may sense the involvement of such a powerful will and be more likely to wake.", "You can select up to a maximum of four raiders (from your stable of up to eight) to assault a dungeon. You may choose to enter at any of the four corners. Your objective is then to reach the centre: the hoard room. Select one of your raiders by clicking on its portrait at the bottom-left of the screen, then move it by clicking on a room. All rooms that are currently accessible are highlighted with a glowing orange border.<br><br>The types of rooms your raider's will encounter are:", "Rooms cannot be placed on top of an entrance or the hoard room. Placing rooms costs Treasure, and more room types become available as your Renown increases. Rooms can be replaced or removed, but the arrangement of doors in a dungeon cannot be changed. To place a room, select it from the panel on the left and click a blank room in your dungeon. You need to click 'Save' to confirm any changes before leaving that menu."};
   static cn_[] _b;
   static int _c;

   public static void a150() {
      _a = null;
      _b = null;
   }

   abstract void a185(int var1, sa_ var2);

   abstract cn_ b373(byte var1);

   static final void a775(int var0, int var1, int var2, int var3) {
      ob_.a697(var0, var3, var2, var1);
      te_.a812(var0, var3 - 1, var1, kc_._S[0]);
      te_.a812(var0, var2 + var3 - 4, var1, kc_._S[0]);

      for(int var4 = 0; var4 < 5; ++var4) {
         int var5 = 160 - var4 * 32;
         gf_.d050(var0, var3 - 2 - var4, var1, 0, var5);
         gf_.d050(var0, var3 + var4, var1, 0, var5);
         gf_.d050(var0, var2 + var3 + (-5 - var4), var1, 0, var5);
         gf_.d050(var0, var3 + (var2 - 3) + var4, var1, 0, var5);
      }

   }

   static final boolean a568(int var0, int[] var1) {
      for(int var2 = 0; var2 < 8; ++var2) {
         if (var1[var2] != 0) {
            return true;
         }
      }

      if (var0 != -1) {
         return false;
      } else {
         return false;
      }
   }

   static final void a423() {
      hb_._a._h = 0;
      hb_._a._c = 0;
   }

   static final int a031(String var0, String var1) {
      int var2 = var0.indexOf(var1, 0);

      int var3;
      for(var3 = var2; var2 != -1; var2 = var0.indexOf(var1, var2 + 1)) {
         var3 = var2;
      }

      return var3;
   }

   static final String a794(String var0, Applet var1) {
      try {
         String var2 = (String)ee_.a460(var1, "getcookies");
         String[] var3 = ih_.a640(96, ';', var2);

         for(int var4 = 0; var4 < var3.length; ++var4) {
            int var5 = var3[var4].indexOf(61);
            if (0 <= var5 && var3[var4].substring(0, var5).trim().equals(var0)) {
               return var3[var4].substring(1 + var5).trim();
            }
         }
      } catch (Throwable var6) {
      }

      return null;
   }
}
