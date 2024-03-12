final class cc_ implements Runnable {
   static md_ _i = new md_();
   private up_ _h = new up_();
   static int _d = 0;
   static String[] _e;
   private Thread _g;
   static boolean _c = false;
   int _f = 0;
   private boolean _b = false;
   static String _a = "Banshee";

   final co_ a504(ln_ var1, int var2, int var3, byte[] var4) {
      co_ var5 = new co_();
      var5._K = var1;
      var5._o = (long)var3;
      var5._L = 2;
      var5._D = var4;
      var5._B = false;
      if (var2 != 15958) {
         return (co_)null;
      } else {
         this.a378((byte)48, var5);
         return var5;
      }
   }

   final co_ a822(byte var1, ln_ var2, int var3) {
      co_ var4 = new co_();
      var4._o = (long)var3;
      var4._B = false;
      var4._L = 3;
      if (var1 >= -27) {
         return (co_)null;
      } else {
         var4._K = var2;
         this.a378((byte)21, var4);
         return var4;
      }
   }

   static final String a928(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   public static void b150() {
      _a = null;
      _e = null;
      _i = null;
   }

   private final void a378(byte var1, co_ var2) {
      synchronized(this._h) {
         this._h.a857(var2, -32711);
         ++this._f;
         this._h.notifyAll();
         if (var1 <= 1) {
            _e = (String[])null;
         }

      }
   }

   final void a150(int var1) {
      this._b = true;
      synchronized(this._h) {
         this._h.notifyAll();
      }

      try {
         this._g.join();
         if (var1 >= -49) {
            _i = (md_)null;
         }
      } catch (InterruptedException var4) {
      }

      this._g = null;
   }

   static final int a586(int var0, int var1) {
      int var2 = var1 >> 31 & var0 - 1;
      return ((var1 >>> 31) + var1) % var0 + var2;
   }

   final co_ a945(ln_ var1, int var2, int var3) {
      co_ var4 = new co_();
      var4._L = 1;
      if (var3 != -6319) {
         this.a378((byte)29, (co_)null);
      }

      synchronized(this._h) {
         co_ var6 = (co_)this._h.c729(13395);

         while(true) {
            if (var6 == null) {
               break;
            }

            if ((long)var2 == var6._o && var1 == var6._K && var6._L == 2) {
               var4._v = false;
               var4._D = var6._D;
               return var4;
            }

            var6 = (co_)this._h.a786((byte)72);
         }
      }

      var4._D = var1.a104(var2, 44);
      var4._B = true;
      var4._v = false;
      return var4;
   }

   public final void run() {
      while(!this._b) {
         co_ var1;
         synchronized(this._h) {
            var1 = (co_)this._h.a729(120);
            if (var1 == null) {
               try {
                  this._h.wait();
               } catch (InterruptedException var6) {
               }
               continue;
            }

            --this._f;
         }

         try {
            if (var1._L != 2) {
               if (3 == var1._L) {
                  var1._D = var1._K.a104((int)var1._o, 112);
               }
            } else {
               var1._K.a267(var1._D, (int)var1._o, var1._D.length, -29447);
            }
         } catch (Exception var5) {
            sm_.a741(var5, 1, (String)null);
         }

         var1._v = false;
      }

   }

   cc_(qg_ var1) {
      pn_ var2 = var1.a508(-21432, 5, this);

      while(var2._c == 0) {
         pj_.a054(0, 10L);
      }

      if (var2._c != 2) {
         this._g = (Thread)var2._f;
      } else {
         throw new RuntimeException();
      }
   }
}
