final class ce_ extends kl_ {
   private pp_ _n;
   static eh_ _v;
   static long _s;
   private pp_ _r;
   static int _p;
   static String[] _q = new String[]{"<%0> the Black", "<%0> the White", "<%0> the Good", "<%0> the Evil", "<%0> Flameclaw", "<%0> Ironscale", "<%0> Orcbane", "<%0> the Ascendant", "<%0> the Wanderer", "<%0>, Winged Terror", "<%0> the Deceitful", "<%0>, Disciple of Night", "<%0>, Servant of Dawn", "<%0> Demonfire", "<%0>, Kindler of Hatred", "<%0>, Agent of Malice"};
   static String _m = "Snakes";
   static String _t = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
   static int _x;
   static String[] _o = new String[]{"Goblin Chieftain", "Orc Warlord", "Raider Newt", "Raider Lizard", "Raider Drake", "Raider Dragon", "Feared Raider", "Heroic Raider", "Defender Newt", "Defender Lizard", "Defender Drake", "Defender Dragon", "Vengeful Dragon", "Tyrannical Dragon", "Cartographer", "Renowned Dragon", "Persistence", "Price of Greed", "Bounty Hunter", "Great Raider", "Great Defender", "Plunder", "Consummate Dragon", "Glorious Raider", "Glorious Defender", "Gold Standing", "Dragon's Engineering", "Dragon's Empathy", "Draconic Heist", "Ransack", "Arcane Mastery", "Majestic Raider", "Majestic Defender", "Platinum Standing", "Dragon's Determination", "Dragon's Scheming", "Dragon's Daring", "Dragon's Triumph", "Aristocrat", "Dragon's Wrath", "Dragon's Hoard", "Dragon's Riches", "Creature of Habit", "Dungeon Assault Bronze", "Dungeon Assault Silver", "Dungeon Assault Gold"};
   static int _w;
   StringBuilder _u;

   public static void d423() {
      _m = null;
      _v = null;
      _o = null;
      _t = null;
      _q = null;
   }

   final void b150(int var1) {
      super.b150(-51);
      int var2 = (super._a >> 1) + super._k;
      int var3 = super._j + 10;
      ne_._c.c191(hb_._l.toUpperCase(), var2, var3 + ne_._c._H, 16777215, -1);
      var3 += ne_._c._H;
      la_._b.a385(hl_._k, 20 + super._k, var3, super._a - 40, super._i + super._j - var3 - (24 + jm_._i._v * 2), 16777215, -1, 1, 1, la_._b._H);
      int var4 = super._k + (super._a - 200 >> 1);
      int var5 = 60 + var3;
      gf_.b050(var4 - 4, var5 - 4, 208, 28, 0);
      rp_.a857(4, 200, (byte)108, var4, 20, kc_._S, var5);
      if (this._u != null) {
         String var7 = this._u.toString();
         if (0 == (1 & mo_._a / 25)) {
            var7 = var7 + "|";
         }

         int var8 = this._u.length() <= 12 ? 16777215 : 16711680;
         la_._b.b191(var7, var4, (la_._b._H + 20 >> 1) + var5, var8, -1);
      }

   }

   final void b487(boolean var1) {
      if (84 == mm_._t) {
         super._d = true;
      } else if (13 == mm_._t) {
         this._u = null;
         super._d = true;
      } else if (85 != mm_._t) {
         if (12 > this._u.length() && pe_.a628(this._u, ob_._Yb)) {
            this._u.append(ob_._Yb);
         }
      } else if (this._u.length() > 0) {
         am_.a541(this._u, ' ', this._u.length() - 1);
      }

      if (var1) {
         _v = (eh_)null;
      }

   }

   final void a487(boolean var1) {
      super.a487(var1);
      if (null != hh_._s) {
         if (this._n == hh_._s) {
            this._u = null;
         }

         super._d = true;
      }

   }

   ce_(String var1) {
      this._u = new StringBuilder(var1);
      int var2 = 88 + 2 * jm_._i._v + oj_.a170(hl_._k, new int[]{300}, la_._b) * la_._b._H;
      this.a326(350, 0, var2);
      super._d = false;
      this._r = tn_.a226(super._k + 10 + ((super._a >> 1) - 10 - jm_._i._y >> 1), super._i + (super._j - 16) - jm_._i._v, ne_._c, jm_._i, -85, hb_._l);
      this._n = tn_.a226((-jm_._i._y + (super._a >> 1) - 10 >> 1) + (super._a >> 1) + super._k, super._i + super._j + (-16 - jm_._i._v), ne_._c, jm_._i, -125, be_._r);
      super._f.a865(this._r, false);
      super._f.a865(this._n, false);
   }
}
