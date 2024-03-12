import java.nio.ByteBuffer;

final class ep_ extends un_ {
   static String _i = "Your raiders flee in terror from the <%0>!";
   static String _j = "This entry doesn't match";
   static cn_ _g;
   static String[] _f = new String[]{"By rating", "By win percentage"};
   private ByteBuffer _h;

   final void a167(byte[] var1, int var2) {
      if (var2 < 30) {
         a556(4);
      }

      this._h = ByteBuffer.allocateDirect(var1.length);
      this._h.position(0);
      this._h.put(var1);
   }

   public static void a150() {
      _j = null;
      _g = null;
      _i = null;
      _f = null;
   }

   final byte[] b334(byte var1) {
      byte[] var2 = new byte[this._h.capacity()];
      this._h.position(0);
      this._h.get(var2);
      return var2;
   }

   static final hb_ a069(int var0, int var1, ec_ var2) {
      int var3 = var2.c474(true);
      if (var1 != ~var3) {
         hb_ var4 = new hb_(var0, var3);
         var4._e = var2.c474(true);
         var4._g = var2.c474(true);
         var4._f = var2.c474(true);
         var4._k = var2.c474(true);
         var4._o = var2.c474(true);
         var4._d = var2.c474(true);
         var4._p = var2.c474(true);
         return var4;
      } else {
         var2.b411((byte)80);
         return null;
      }
   }

   static final void a556(int var0) {
      for(ak_ var1 = (ak_)oh_._j.e024(-24172); var1 != null; var1 = (ak_)oh_._j.a024(4)) {
         g_.a953(var0, var1);
      }

      for(ne_ var3 = sf_._c.e024(-24172); var3 != null; var3 = sf_._c.a024(4)) {
         bd_.a366(var0, (byte)113);
      }

   }
}
