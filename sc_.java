final class sc_ extends ch_ {
   static qg_ _q;
   static String _p = "Suggested names: ";

   public static void b423(byte var0) {
      _q = null;
      _p = null;
      if (var0 != -94) {
         b423((byte)-6);
      }

   }

   final fd_ b743(int var1) {
      return of_._p;
   }

   static final String a756(int var0, ec_ var1) {
      try {
         int var2 = var1.d410((byte)58);
         if (var2 > var0) {
            var2 = var0;
         }

         byte[] var3 = new byte[var2];
         var1._o += qh_._G.a205(var1._m, var3, (byte)-88, var1._o, 0, var2);
         String var4 = mk_.a046(var3, var2, 0);
         return var4;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }

   sc_(long var1, String var3) {
      super(var1, var3);
   }
}
