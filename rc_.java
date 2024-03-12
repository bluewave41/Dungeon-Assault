import java.applet.Applet;

final class rc_ {
   static Applet _b;
   private static qk_ _a;

   public static void a423() {
      _a = null;
      _b = null;
   }

   static final cn_ a324(String var0, nh_ var1, String var2) {
      if (!var1.b671(var2, var0, (byte)-82)) {
         var2 = var2 + ".jpg";
      }

      cn_ var3 = new cn_(var1.a826(var0, var2, (byte)-127), fi_.d602());

      for(int var4 = 0; var4 < var3._B.length; ++var4) {
         var3._B[var4] = nb_.a080(var3._B[var4], 16777215);
      }

      return var3;
   }

   static final void b150(int var0) {
      if (var0 <= 79) {
         _a = (qk_)null;
      }

      gg_.a693((String)null, "");
   }

   static final void c150() {
      bh_._M = false;
      ra_._c.c474(true);
   }

   static final void a150() {
      en_._c = -(fa_._i >> 1) + wf_._C;
      int var1 = en_._c;

      for(int var2 = 0; uc_._K.length > var2; ++var2) {
         int var3 = dd_._A[var2];
         int var4;
         if (var3 >= 0) {
            if (var3 != h_._h._b) {
               var4 = dc_._l;
            } else {
               var4 = il_._a;
            }
         } else {
            var4 = ui_._b;
         }

         String var5 = uc_._K[var2];
         int var6 = rb_.a218((byte)107, var5);
         int var7 = -(var6 >> 1) + tm_._e;
         if (var3 >= 0) {
            var1 += lc_._j;
            qk_ var8 = var3 == h_._h._b ? ug_._y : _a;
            if (null != var8) {
               var8.a050(var1, cd_._e + (i_._o << 1), var6 + (an_._w << 1), 112, var7 - an_._w);
            }

            var1 += i_._o;
         }

         if (var3 < 0) {
            hc_._e.b191(var5, var7, var1 + da_._C, var4, -1);
            var1 += gb_._a;
         } else {
            mp_._a.b191(var5, var7, vk_._e + var1, var4, -1);
            var1 += cd_._e + i_._o + lc_._j;
         }
      }

   }
}
