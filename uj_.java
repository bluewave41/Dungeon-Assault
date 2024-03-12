import java.util.Random;

final class uj_ {
   static int _d;
   static String _a = "Please check if address is correct";
   static String _e = "Renown";
   static String _b = "When entering a monster room, you can choose for your raider to Charge (increases Attack, decreases Defence), Advance (which leaves stats unchanged) or Flee (attempt to retreat from the room without engaging in combat). When combat begins, the raider's Sneak level is rolled against the monster's Detect level to determine who attacks first. In each round of combat, the attacker's Attack level is rolled against the defender's Defence level - if the attacker wins, the defender is defeated, otherwise, if the defender wins, they get a turn to attack. Fleeing works in much the same way, but instead of attacking each round, the raider rolls Dodge against the room's Snare - if successful, the raider escapes.";
   static cn_ _c;

   static final int a004(Random var0, int var1, int var2) {
      if (var2 <= 0) {
         throw new IllegalArgumentException();
      } else if (qh_.a097(var2)) {
         return (int)(((long)var0.nextInt() & 4294967295L) * (long)var2 >> 32);
      } else {
         int var3 = Integer.MIN_VALUE - (int)(4294967296L % (long)var2);
         if (var1 != 37) {
            _c = (cn_)null;
         }

         int var4;
         do {
            var4 = var0.nextInt();
         } while(var3 <= var4);

         return cc_.a586(var2, var4);
      }
   }

   static final String a748(long var0, int var2) {
      if (0L < var0 && 6582952005840035281L > var0) {
         if (0L == var0 % 37L) {
            return null;
         } else {
            if (var2 != -1) {
               _d = -60;
            }

            int var3 = 0;

            for(long var4 = var0; var4 != 0L; ++var3) {
               var4 /= 37L;
            }

            StringBuilder var6;
            char var9;
            for(var6 = new StringBuilder(var3); 0L != var0; var6.append(var9)) {
               long var7 = var0;
               var0 /= 37L;
               var9 = ak_._j[(int)(-(var0 * 37L) + var7)];
               if (var9 == '_') {
                  int var10 = var6.length() - 1;
                  var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                  var9 = 160;
               }
            }

            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
         }
      } else {
         return null;
      }
   }

   public static void a150() {
      _c = null;
      _a = null;
      _e = null;
      _b = null;
   }

   static final void a872(en_ var0) {
      rb_._O = var0;
   }
}
