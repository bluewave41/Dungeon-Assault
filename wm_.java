final class wm_ {
   static String[] _d = new String[]{"<%0> of the 6M crew", "<%0>, Ultima", "<%0>, Monarch of the Gem", "<%0>, Scourge Elite", "<%0>, the Relentless", "<%0>, Solar Champion", "<%0>, the Reckless", "<%0>, Mistress of Magic", "Archmage <%0>", "<%0>, the Corrupted"};
   static String _j = "Guardians";
   static int _a = 0;
   static String _e = "You claim a bounty of <%0> Treasure for reaching the hoard room.";
   static volatile int _g = 0;
   int[] _f;
   static int _b;
   static cn_ _c;
   static cn_ _h;
   static String[] _i = new String[]{"<%0> of the 6M crew", "<%0>, Ultima", "<%0>, Monarch of the Gem", "<%0>, Scourge Elite", "<%0>, the Relentless", "<%0>, Solar Champion", "<%0>, the Reckless", "<%0>, Master of Magic", "Archmage <%0>", "<%0>, the Corrupted"};

   final boolean a370(int var1, byte var2) {
      if (var2 < 65) {
         _d = (String[])null;
      }

      return (this._f[var1 >> 5] & 1 << (var1 & 31)) != 0;
   }

   final wm_ a775(byte var1, wm_ var2) {
      wm_ var3 = this;
      if (var1 != -53) {
         return (wm_)null;
      } else {
         if (var2._f.length < this._f.length) {
            var3 = var2;
            var2 = this;
         }

         wm_ var4 = new wm_(32 * var2._f.length);

         int var5;
         for(var5 = 0; var3._f.length > var5; ++var5) {
            var4._f[var5] = nb_.a080(var2._f[var5], var3._f[var5]);
         }

         while(var2._f.length > var5) {
            var4._f[var5] = var2._f[var5];
            ++var5;
         }

         return var4;
      }
   }

   static final boolean a671(String var0, String var1, byte var2) {
      if (dj_.a988(var2 + 6706, var1)) {
         return false;
      } else if (!j_.a623(var1)) {
         if (sm_.a988(var1)) {
            return false;
         } else if (var0.length() == 0) {
            return true;
         } else if (gk_.a398(var0, var1)) {
            return false;
         } else if (!gl_.a014(var0, var2 ^ -83, var1)) {
            if (!uo_.a689(var0, var1)) {
               return var2 != -83 ? true : true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static final void a679(int var0, int var1) {
      vo_._r = var0;
      bl_._p = var1;
   }

   wm_(int var1) {
      this._f = new int[var1 + 31 >> 5];
   }

   final void a093(int var1, int var2) {
      this._f[var1 >> 5] = mp_.a080(this._f[var1 >> 5], 1 << nb_.a080(31, var1));
      if (var2 >= -59) {
         a671((String)null, (String)null, (byte)25);
      }

   }

   wm_(wm_ var1) {
      int var2 = var1._f.length;
      this._f = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this._f[var3] = var1._f[var3];
      }

   }

   public static void a423() {
      _c = null;
      _h = null;
      _j = null;
      _i = null;
      _e = null;
      _d = null;
   }

   final void a150(int var1) {
      for(int var2 = 0; this._f.length > var2; ++var2) {
         this._f[var2] = 0;
      }

      if (var1 != 1) {
         _d = (String[])null;
      }

   }

   final void b093(int var1, int var2) {
      if (var2 != 31) {
         _j = (String)null;
      }

      this._f[var1 >> 5] = nb_.a080(this._f[var1 >> 5], ~(1 << nb_.a080(31, var1)));
   }
}
