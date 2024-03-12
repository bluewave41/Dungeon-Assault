import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class rk_ implements Runnable {
   private qg_ _b;
   private int _j;
   private boolean _n;
   private int _i;
   private InputStream _g;
   private pn_ _e;
   static String[] _k = new String[]{null, "<%highlight>It's generally best to attack a player close to you in the table.</col> Players much higher than you are likely to be better defended, with more ferocious <%monsters> and devious <%traps>. Players far beneath you may be easier to assault, but the potential gains will be low."};
   private OutputStream _o;
   private boolean _m;
   private Socket _h;
   static String _a = "Snare";
   static long _l;
   static String[] _f = new String[]{"Toughness", "Any lethal blow becomes <col=FF0000>Defence -1</col>."};
   private byte[] _c;
   private int _d;

   public static void a487(boolean var0) {
      if (!var0) {
         _f = (String[])null;
      }

      _a = null;
      _k = null;
      _f = null;
   }

   final void a120(byte[] var1, boolean var2, int var3, int var4) throws IOException {
      if (!this._m) {
         if (var2) {
            this._i = 17;
         }

         while(var3 > 0) {
            int var5 = this._g.read(var1, var4, var3);
            if (var5 <= 0) {
               throw new EOFException();
            }

            var3 -= var5;
            var4 += var5;
         }

      }
   }

   protected final void finalize() {
      this.c150(-6624);
   }

   final int a137(int var1) throws IOException {
      if (var1 != 0) {
         a487(false);
      }

      return !this._m ? this._g.available() : 0;
   }

   final void b150(int var1) throws IOException {
      if (!this._m) {
         if (this._n) {
            this._n = false;
            throw new IOException();
         }
      }
   }

   rk_(Socket var1, qg_ var2) throws IOException {
      this(var1, var2, 5000);
   }

   final void c150(int var1) {
      if (var1 != -6624) {
         this._o = (OutputStream)null;
      }

      if (!this._m) {
         synchronized(this) {
            this._m = true;
            this.notifyAll();
         }

         if (this._e != null) {
            while(this._e._c == 0) {
               pj_.a054(var1 + 6624, 1L);
            }

            if (1 == this._e._c) {
               try {
                  ((Thread)this._e._f).join();
               } catch (InterruptedException var4) {
               }
            }
         }

         this._e = null;
      }
   }

   final int a410(byte var1) throws IOException {
      if (var1 != -108) {
         this._g = (InputStream)null;
      }

      return this._m ? 0 : this._g.read();
   }

   public final void run() {
      try {
         while(true) {
            int var1;
            int var2;
            synchronized(this) {
               if (this._i == this._d) {
                  if (this._m) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var8) {
                  }
               }

               var2 = this._d;
               if (this._d > this._i) {
                  var1 = -this._d + this._j;
               } else {
                  var1 = this._i - this._d;
               }
            }

            if (0 < var1) {
               try {
                  this._o.write(this._c, var2, var1);
               } catch (IOException var7) {
                  this._n = true;
               }

               this._d = (this._d + var1) % this._j;

               try {
                  if (this._i == this._d) {
                     this._o.flush();
                  }
               } catch (IOException var6) {
                  this._n = true;
               }
            }
         }

         try {
            if (this._g != null) {
               this._g.close();
            }

            if (null != this._o) {
               this._o.close();
            }

            if (null != this._h) {
               this._h.close();
            }
         } catch (IOException var9) {
         }

         this._c = null;
      } catch (Exception var11) {
         sm_.a741(var11, 1, (String)null);
      }

   }

   static final void a161(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, cn_ var8) {
      int var9 = var8._w - (-var5 - var2 + var6);
      int var10 = var5 + (var8._w - (-var2 - var0));
      int var11 = var4 + var8._A + (var8._v >> 1);
      if (var7 >= 97) {
         gf_.a115(var9, 0, var10, var11 + var3);
         var8.b326(var5 - 1, var4 - 1, var1);
         var8.b326(var5 - 1, var4 + 1, var1);
         gf_.b331(rp_._e);
         gf_.a115(1 + var9, 0, var10 + 1, var3 + var11);
         var8.b326(1 + var5, var4 - 1, var1);
         var8.b326(1 + var5, 1 + var4, var1);
         gf_.b331(rp_._e);
         var9 = -var0 + (var5 + var8._w + var8._y - var2);
         var10 = var8._y + var8._w - (-var5 + var2) - var6;
         gf_.a115(var9, -var3 + var11, var10, 480);
         var8.b326(var5 - 1, var4 - 1, var1);
         var8.b326(var5 - 1, 1 + var4, var1);
         gf_.b331(rp_._e);
         gf_.a115(var9 + 1, var11 - var3, 1 + var10, 480);
         var8.b326(1 + var5, var4 - 1, var1);
         var8.b326(var5 + 1, 1 + var4, var1);
         gf_.b331(rp_._e);
      }
   }

   final void b120(byte[] var1, boolean var2, int var3, int var4) throws IOException {
      if (!this._m) {
         if (this._n) {
            this._n = false;
            throw new IOException();
         } else {
            if (null == this._c) {
               this._c = new byte[this._j];
            }

            synchronized(this) {
               if (var2) {
                  a161(-80, 100, -128, -38, -21, -28, 61, -115, (cn_)null);
               }

               for(int var6 = 0; var4 > var6; ++var6) {
                  this._c[this._i] = var1[var3 + var6];
                  this._i = (this._i + 1) % this._j;
                  if ((this._j - 100 + this._d) % this._j == this._i) {
                     throw new IOException();
                  }
               }

               if (null == this._e) {
                  this._e = this._b.a508(-21432, 3, this);
               }

               this.notifyAll();
            }
         }
      }
   }

   private rk_(Socket var1, qg_ var2, int var3) throws IOException {
      this._i = 0;
      this._n = false;
      this._m = false;
      this._d = 0;
      this._b = var2;
      this._h = var1;
      this._h.setSoTimeout(30000);
      this._h.setTcpNoDelay(true);
      this._g = this._h.getInputStream();
      this._o = this._h.getOutputStream();
      this._j = var3;
   }
}
