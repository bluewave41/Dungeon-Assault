final class jm_ {
   static String[] _a = new String[]{"Summon Zombie", "From the miscellaneous body parts found so frequently around a dungeon, the <%0> is able to assemble a zombie to scout the next room. The zombie is incapable of fighting or disarming traps. (Single use)"};
   static String _g = "A very large, well-muscled creature with the head of a bull and the body of a man. It wields a massive axe but wears little in the way of protective clothing.";
   static String _b = "achievements to collect";
   static cn_ _i;
   static String _e = "Names cannot start or end with space or underscore";
   static lh_ _h;
   static int _c;
   static String _d = "Most reptiles don't have eight legs. Saying that, most reptiles don't have a penchant for eating raiders.";
   static md_ _f;

   static final void a115(int var0, int var1, int var2, int var3) {
      if (0 != var1 % 7 && gm_._d._k.a370(-(var1 / 7) + (var1 - 1), (byte)105)) {
         ol_._a[0].b326(var3, var0, 256);
      }

      if (var1 % 7 != 6 && gm_._d._k.a370(var1 - var1 / 7, (byte)109)) {
         ol_._a[2].b326(var3, var0, 256);
      }

      if (var2 != 3) {
         a115(125, 94, 37, 21);
      }

      if (6 < var1 && gm_._d._k.a370(var1 + 35, (byte)117)) {
         ol_._a[1].b326(var3, var0, 256);
      }

      if (42 > var1 && gm_._d._k.a370(var1 + 42, (byte)114)) {
         ol_._a[3].b326(var3, var0, 256);
      }

   }

   static final void a315(la_ var0, byte var1) {
      if (null != var0._d) {
         if (0 != var0._o || 0 != var0._m) {
            for(int var2 = 0; var2 < ud_._x; ++var2) {
               la_ var3 = nb_._a[var2];
               if (2 == var3._n && var3._o == var0._o && var3._m == var0._m) {
                  return;
               }
            }
         }

         if (var1 != 116) {
            a315((la_)null, (byte)75);
         }

         if (null == var0._i) {
         }

         ul_.a588(var0);
      }
   }

   static final void a660(int var0, int var1, cn_[] var2, int var3, int var4) {
      if (null != var2 && 0 < var1) {
         int var5 = var2[0]._E;
         int var6 = var2[2]._E;
         int var7 = var2[1]._E;
         var2[var3].h093(var0, var4);
         var2[2].h093(var0 + var1 - var6, var4);
         gf_.a331(mk_._i);
         gf_.a115(var0 + var5, var4, var1 + (var0 - var6), var4 + var2[1]._G);
         int var8 = var5 + var0;
         int var9 = var1 + var0 - var6;

         for(var0 = var8; var9 > var0; var0 += var7) {
            var2[1].h093(var0, var4);
         }

         gf_.b331(mk_._i);
      }
   }

   static final void a487() {
      bb_._e = null;
      td_._a = null;
   }

   public static void a423() {
      _f = null;
      _h = null;
      _g = null;
      _i = null;
      _a = null;
      _e = null;
      _d = null;
      _b = null;
   }

   static final void a050(int var0, int var1, int var2, int var3) {
      gf_.e050(var1, var3, var2, var0, 0);
      gf_.e050(var1 - 1, var3 - 1, var2 + 2, 2 + var0, 12632256);
      qe_.b229(var1 - 1, var3 - 1, 2 + var2, var0 + 2, 192, 64, 3, 192);
   }

   static final String a715(byte var0, CharSequence var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var1.length(); var3 > var2 && jc_.a351(var1.charAt(var2)); ++var2) {
         }

         while(var3 > var2 && jc_.a351(var1.charAt(var3 - 1))) {
            --var3;
         }

         int var4 = -var2 + var3;
         if (var4 >= 1 && var4 <= 12) {
            StringBuilder var5 = new StringBuilder(var4);
            if (var0 != 59) {
               a115(52, -105, -111, 63);
            }

            for(int var6 = var2; var3 > var6; ++var6) {
               char var7 = var1.charAt(var6);
               if (il_.a778(var7)) {
                  char var8 = tl_.a771(var7);
                  if (0 != var8) {
                     var5.append(var8);
                  }
               }
            }

            if (var5.length() == 0) {
               return null;
            } else {
               return var5.toString();
            }
         } else {
            return null;
         }
      }
   }

   static final void a150(int var0) {
      if (!ed_.c491(true)) {
         if (!jn_._c) {
            ac_._B.d556((byte)-80, 70);
            ac_._B.b556((byte)-106, ke_._b);
            ac_._B.a093(6, oh_._s);
         } else {
            ac_._B.d556((byte)-113, 71);
            ++ac_._B._o;
            int var1 = ac_._B._o;
            ac_._B.a984(2, ip_._j);
            ac_._B.a093(6, oh_._s);
            ac_._B.c093(ac_._B._o - var1, -1);
         }

         if (var0 != -17573) {
            a487();
         }

      }
   }
}
