final class aj_ extends ok_ {
   static int _Gb = 0;

   private aj_() throws Throwable {
      super(0L, (ok_)null);
      throw new Error();
   }

   static final short[] a042(wj_ var0, short[] var1, byte var2, int var3) {
      int var4 = var0.j080(var2 ^ 116, var3);
      if (0 == var4) {
         return null;
      } else {
         if (null == var1 || var1.length != var4) {
            var1 = new short[var4];
         }

         int var5 = var0.j080(84, 4);
         if (var2 != 31) {
            a042((wj_)null, (short[])null, (byte)18, -27);
         }

         short var6 = (short)var0.j080(-93, 16);
         int var7;
         if (0 < var5) {
            for(var7 = 0; var4 > var7; ++var7) {
               var1[var7] = (short)(var0.j080(87, var5) + var6);
            }
         } else {
            for(var7 = 0; var7 < var4; ++var7) {
               var1[var7] = var6;
            }
         }

         return var1;
      }
   }
}
