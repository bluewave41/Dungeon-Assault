final class ke_ {
   static String _a = "Being a python, the snake in this room is not venomous, but its massive size makes it no less deadly to slow-witted raiders.";
   static int _e = 0;
   static int _b;
   static int _d;
   static String[] _c = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};

   static final void a115(int var0, int var1, int var2) {
      jc_.a669(var1, var0, var2, 0, 2, 0);
   }

   public static void a150() {
      _a = null;
      _c = null;
   }

   static final void b150(int var0) {
      synchronized(ib_._f) {
         la_._g = ua_._a;
         ++fc_._m;
         hj_._S = wi_._tb;
         eh_._h = dj_._d;
         cp_._U = lj_._g;
         lj_._g = false;
         no_._d = wm_._g;
         lc_._c = ak_._k;
         hm_._k = em_._C;
         wm_._g = var0;
      }
   }

   static final pp_ a724(int var0, cn_ var1, int var2) {
      jh_.c797();
      cn_ var4 = new cn_(var1._y, var1._v);
      var4.e797();
      var1.f326(0, 0, 96);
      cn_ var5 = var1.d125();
      var5.e797();
      var1.b326(0, 0, 256);
      var1.b326(0, 0, 256);
      cn_ var6 = rb_.a551(32, var1, 8421631, (byte)117);
      jh_.b797();
      return new pp_(var1, var4, var5, var6, var2, var0);
   }

   static final boolean a097(int var0, int var1) {
      if (var0 <= 56) {
         return true;
      } else {
         return 10 == var1 || var1 == 12 || var1 == 19 || var1 == 18 || var1 == 9;
      }
   }
}
