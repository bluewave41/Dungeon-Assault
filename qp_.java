import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

final class qp_ {
   static String _c = "Create a free Account";
   private RandomAccessFile _g;
   static String _e = "to return to the normal view.";
   static cn_ _a;
   private long _d;
   private long _b;
   static String[] _f = new String[]{"Fire Immunity", "A creature of the lower planes, the <%0> cannot be harmed by any form of fire - such as that of a dragon."};

   final void a150(int var1) throws IOException {
      if (this._g != null) {
         this._g.close();
         this._g = null;
      }

      if (var1 != 0) {
         this._g = (RandomAccessFile)null;
      }

   }

   final void a209(int var1, int var2, byte[] var3, int var4) throws IOException {
      if (this._b + (long)var4 > this._d) {
         this._g.seek(this._d);
         this._g.write(1);
         throw new EOFException();
      } else {
         this._g.write(var3, var1, var4);
         if (var2 < 36) {
            a749();
         }

         this._b += (long)var4;
      }
   }

   static final cn_ a749() {
      cn_ var0 = new cn_(20, 20);
      jh_.a303(var0);
      gf_.b050(0, 0, 20, 20, 16711680);
      gf_.f115(10, 10, 6, 0);

      int var1;
      for(var1 = 0; var1 < 20; ++var1) {
         gf_.b115(-var1 + 18, var1, 4, 16711680);
      }

      var1 = 0;

      for(int var2 = 0; 20 > var2; ++var2) {
         for(int var3 = 0; var3 < 20; ++var3) {
            if ((var2 - 10) * (var2 - 10) + (var3 - 10) * (var3 - 10) > 100) {
               var0._B[var1] = 0;
            }

            ++var1;
         }
      }

      jh_.b797();
      return var0;
   }

   final long a411(byte var1) throws IOException {
      return var1 <= 46 ? -31L : this._g.length();
   }

   final void a884(long var1, int var3) throws IOException {
      if (var3 != 18) {
         this._g = (RandomAccessFile)null;
      }

      this._g.seek(var1);
      this._b = var1;
   }

   final int a552(int var1, int var2, int var3, byte[] var4) throws IOException {
      if (var2 != -11274) {
         return 73;
      } else {
         int var5 = this._g.read(var4, var1, var3);
         if (var5 > 0) {
            this._b += (long)var5;
         }

         return var5;
      }
   }

   public static void b423() {
      _a = null;
      _c = null;
      _f = null;
      _e = null;
   }

   protected final void finalize() throws Throwable {
      if (null != this._g) {
         System.out.println("");
         this.a150(0);
      }

   }

   static final void a016(int var0, boolean var1) {
      if (var0 != -1) {
         bf_._f[var0].a487(var1);
      } else {
         tb_.a540(var1);
      }

   }

   qp_(File var1, String var2, long var3) throws IOException {
      if (var3 == -1L) {
         var3 = Long.MAX_VALUE;
      }

      if (var3 < var1.length()) {
         var1.delete();
      }

      this._g = new RandomAccessFile(var1, var2);
      this._d = var3;
      this._b = 0L;
      int var5 = this._g.read();
      if (-1 != var5 && !var2.equals("r")) {
         this._g.seek(0L);
         this._g.write(var5);
      }

      this._g.seek(0L);
   }
}
