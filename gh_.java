import java.awt.Frame;

final class gh_ {
   static String _e = "Centaur";
   static String _b = "Hugely muscled man wearing only a loincloth and leather helm for protection, but wielding a ridiculously large hammer to compensate. The berserker enters a trance-like state when he engages foes in combat, giving him great strength, but leaving him vulnerable to skilled opponents.";
   static ac_[] _i = new ac_[38];
   static long[] _a = new long[11];
   static cn_[] _g;
   static nh_ _c;
   static long[][] _h = new long[8][256];
   static boolean _f;
   static String _j;
   static wh_ _d;

   public static void a150() {
      _e = null;
      _b = null;
      _d = null;
      _g = null;
      _i = null;
      _c = null;
      _h = (long[][])null;
      _a = null;
      _j = null;
   }

   static final void a676(String var0, boolean var1) {
      cd_._b = true;
      jd_._l = var1;
      a_._n = new nk_(lg_._w, hc_._f, var0, qc_._t, jd_._l);
      lg_._w.a336(a_._n, -1);
   }

   static final String a382(int var0) {
      return var0 >= 0 ? var0 / 10 + "." + var0 % 10 : "-" + -var0 / 10 + "." + -var0 % 10;
   }

   static final ek_ a470(int var0, int var1, int var2, qg_ var3, int var4) {
      Frame var5 = ga_.a503(var3, var4, var0, var1, var2);
      if (var5 != null) {
         ek_ var6 = new ek_();
         var6._e = var5;
         var6._e.add(var6);
         var6.setBounds(0, 0, var4, var2);
         var6.addFocusListener(var6);
         var6.requestFocus();
         return var6;
      } else {
         return null;
      }
   }

   static final void a093(int var0, int var1) {
      if (var1 == 11) {
         qh_.a726(-13716, (rj_)null, var0);
      }
   }

   static {
      int var0;
      int var1;
      for(var0 = 0; var0 < 256; ++var0) {
         var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
         long var2 = 0 != (var0 & 1) ? (long)(255 & var1) : (long)(var1 >>> 8);
         long var4 = var2 << 1;
         if (256L <= var4) {
            var4 ^= 285L;
         }

         long var6 = var4 << 1;
         if (var6 >= 256L) {
            var6 ^= 285L;
         }

         long var8 = var6 ^ var2;
         long var10 = var6 << 1;
         if (256L <= var10) {
            var10 ^= 285L;
         }

         long var12 = var10 ^ var2;
         _h[0][var0] = id_.a833(var12, id_.a833(id_.a833(var8 << 16, id_.a833(id_.a833(id_.a833(var6 << 40, id_.a833(var2 << 48, var2 << 56)), var2 << 32), var10 << 24)), var4 << 8));

         for(int var14 = 1; var14 < 8; ++var14) {
            _h[var14][var0] = id_.a833(_h[var14 - 1][var0] >>> 8, _h[var14 - 1][var0] << 56);
         }
      }

      _a[0] = 0L;

      for(var0 = 1; var0 <= 10; ++var0) {
         var1 = var0 * 8 - 8;
         _a[var0] = mn_.a833(eg_.a833(255L, _h[7][var1 + 7]), mn_.a833(mn_.a833(mn_.a833(eg_.a833(4278190080L, _h[4][var1 + 4]), mn_.a833(eg_.a833(_h[3][3 + var1], 1095216660480L), mn_.a833(mn_.a833(eg_.a833(_h[1][1 + var1], 71776119061217280L), eg_.a833(-72057594037927936L, _h[0][var1])), eg_.a833(_h[2][var1 + 2], 280375465082880L)))), eg_.a833(16711680L, _h[5][var1 + 5])), eg_.a833(_h[6][var1 + 6], 65280L)));
      }

      _j = "Horns, claws, hooves, spines and a long tongue; the beastman is formed of many animals and more dangerous than all of them put together.";
   }
}
