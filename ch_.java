class ch_ extends hl_ {
   private long _m;
   static sm_[] _n;
   static String _l = "Your raider snuck past trap and disarmed it.";
   private String _o;

   fd_ b743(int var1) {
      return ug_._w;
   }

   final void a330(ec_ var1, byte var2) {
      var1.a054(71, this._m);
      var1.a627(this._o, (byte)122);
      if (var2 >= -5) {
         this._m = -95L;
      }

   }

   public static void c150() {
      _l = null;
      _n = null;
   }

   static final void a423() {
   }

   static final void a541(byte var0, fn_ var1, int var2) {
      wj_ var3 = ac_._B;
      var3.d556((byte)-93, var2);
      ++var3._o;
      int var4 = var3._o;
      if (var0 != -16) {
         _l = (String)null;
      }

      var3.a093(var0 ^ -10, 1);
      var3.i093(var1._r, -102);
      var3.i093(var1._s, -115);
      var3.i093(var1._l, var0 - 105);
      var3.a556((byte)63, var1._i);
      var3.a556((byte)63, var1._n);
      var3.a556((byte)63, var1._m);
      var3.a556((byte)63, var1._k);
      var3.a093(6, var1._p.length);

      for(int var5 = 0; var5 < var1._p.length; ++var5) {
         var3.a556((byte)63, var1._p[var5]);
      }

      var3.c543((byte)-106, var4);
      var3.c093(var3._o - var4, -1);
   }

   ch_(long var1, String var3) {
      this._o = var3;
      this._m = var1;
   }
}
