import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.EOFException;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

final class hd_ {
   private int _d = 0;
   private int _l;
   private long _k;
   private byte[] _n;
   static Constructor _h;
   private long _a;
   private long _c = -1L;
   private long _b = -1L;
   private qp_ _f;
   static int[] _j = new int[8192];
   private long _i;
   private long _p;
   private byte[] _o;
   static Method _e;
   static String[] _m = new String[]{"<%0> the Fierce", "<%0> the Cruel", "<%0> the Fell", "<%0> the Terrible", "<%0> the Savage", "<%0> the Raging", "<%0>, Bringer of Wrath", "<%0>, Lord of Chaos", "<%0> the Undefeated"};
   static od_ _g;

   final void c423(byte var1) throws IOException {
      this.d423((byte)-117);
      this._f.a150(0);
   }

   private final void d423(byte var1) throws IOException {
      if (-1L != this._c) {
         if (this._a != this._c) {
            this._f.a884(this._c, 18);
            this._a = this._c;
         }

         this._f.a209(0, 105, this._n, this._d);
         this._a += (long)this._d;
         if (this._i < this._a) {
            this._i = this._a;
         }

         long var3 = -1L;
         if (this._c >= this._b && (long)this._l + this._b > this._c) {
            var3 = this._c;
         } else if (this._b >= this._c && this._b < (long)this._d + this._c) {
            var3 = this._b;
         }

         long var5 = -1L;
         if (this._b < (long)this._d + this._c && (long)this._l + this._b >= (long)this._d + this._c) {
            var5 = this._c + (long)this._d;
         } else if ((long)this._l + this._b > this._c && (long)this._l + this._b <= (long)this._d + this._c) {
            var5 = (long)this._l + this._b;
         }

         if (var3 > -1L && var5 > var3) {
            int var7 = (int)(var5 - var3);
            cj_.a278(this._n, (int)(var3 - this._c), this._o, (int)(var3 - this._b), var7);
         }

         this._d = 0;
         this._c = -1L;
      }

   }

   public static void b423() {
      _h = null;
      _e = null;
      _j = null;
      _m = null;
      _g = null;
   }

   static final void a846(String var0, Color var1, boolean var2, int var3) {
      try {
         Graphics var4 = c_._h.getGraphics();
         if (td_._a == null) {
            td_._a = new Font("Helvetica", 1, 13);
         }

         if (var2) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, up_._d, eg_._d);
         }

         if (null == var1) {
            var1 = new Color(140, 17, 17);
         }

         try {
            if (bb_._e == null) {
               bb_._e = c_._h.createImage(304, 34);
            }

            Graphics var5 = bb_._e.getGraphics();
            var5.setColor(var1);
            var5.drawRect(0, 0, 303, 33);
            var5.fillRect(2, 2, var3 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(1, 1, 301, 31);
            var5.fillRect(2 + var3 * 3, 2, 300 - var3 * 3, 30);
            var5.setFont(td_._a);
            var5.setColor(Color.white);
            var5.drawString(var0, (304 - var0.length() * 6) / 2, 22);
            var4.drawImage(bb_._e, up_._d / 2 - 152, eg_._d / 2 - 18, (ImageObserver)null);
         } catch (Exception var8) {
            int var6 = up_._d / 2 - 152;
            int var7 = eg_._d / 2 - 18;
            var4.setColor(var1);
            var4.drawRect(var6, var7, 303, 33);
            var4.fillRect(2 + var6, var7 + 2, var3 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var6 + 1, var7 + 1, 301, 31);
            var4.fillRect(2 + var6 + var3 * 3, var7 + 2, -(var3 * 3) + 300, 30);
            var4.setFont(td_._a);
            var4.setColor(Color.white);
            var4.drawString(var0, var6 + (-(6 * var0.length()) + 304) / 2, 22 + var7);
         }

         if (bb_._f != null) {
            var4.setFont(td_._a);
            var4.setColor(Color.white);
            var4.drawString(bb_._f, up_._d / 2 - 6 * bb_._f.length() / 2, eg_._d / 2 - 26);
         }
      } catch (Exception var9) {
         c_._h.repaint();
      }

   }

   static final void a164(int var0, boolean var1, String var2, boolean var3) {
      tn_.a150(-1);
      lg_._w.h150(1);
      wo_._e = new dn_(co_._C, (String)null, qc_._t, var3, var1);
      if (var0 == 8192) {
         ta_._a = new jk_(lg_._w, wo_._e);
         lg_._w.a336(ta_._a, -1);
      }
   }

   static final void a487(boolean var0) {
      if (var0) {
         _j = (int[])null;
      }

      wj_ var1 = ra_._c;
      int var2 = var1.c474(true);
      int var3 = var1.c474(true);
      if (0 == var2) {
         kj_ var4 = (kj_)cc_._i.e024(-24172);
         if (null == var4) {
            tl_.a150(-21);
            return;
         }

         int var5 = nj_._b - var1._o;
         int[] var6 = var4._l;
         if (var5 > var6.length << 2) {
            var5 = var6.length << 2;
         }

         for(int var7 = 0; var5 > var7; ++var7) {
            var6[var7 >> 2] += var1.c474(true) << nb_.a080(768, var7 << 8);
         }

         var4.a487(false);
      } else if (1 == var2) {
         int var8 = var1.l137(0);

         mm_ var9;
         for(var9 = (mm_)m_._a.e024(-24172); var9 != null && (var3 != var9._p || var9._r != var8); var9 = (mm_)m_._a.a024(4)) {
         }

         if (null == var9) {
            tl_.a150(-23);
            return;
         }

         var9.a487(false);
      } else {
         sm_.a741((Throwable)null, 1, "LR1: " + sj_.l738(192));
         tl_.a150(-51);
      }

   }

   final void a884(long var1, int var3) throws IOException {
      if (var3 == -26296) {
         if (0L > var1) {
            throw new IOException();
         } else {
            this._k = var1;
         }
      }
   }

   private final void a150(int var1) throws IOException {
      this._l = 0;
      if (this._k != this._a) {
         this._f.a884(this._k, 18);
         this._a = this._k;
      }

      int var4;
      for(this._b = this._k; this._l < this._o.length; this._a += (long)var4) {
         int var3 = -this._l + this._o.length;
         if (200000000 < var3) {
            var3 = 200000000;
         }

         var4 = this._f.a552(this._l, -11274, var3, this._o);
         if (-1 == var4) {
            break;
         }

         this._l += var4;
      }

   }

   final void a209(int var1, int var2, byte[] var3, int var4) throws IOException {
      try {
         if (var3.length < var1 + var4) {
            throw new ArrayIndexOutOfBoundsException(-var3.length + var4 + var1);
         }

         if ((long)var2 != this._c && this._k >= this._c && this._k + (long)var4 <= (long)this._d + this._c) {
            cj_.a278(this._n, (int)(this._k - this._c), var3, var1, var4);
            this._k += (long)var4;
            return;
         }

         long var5 = this._k;
         int var8 = var4;
         int var9;
         if (this._k >= this._b && this._k < (long)this._l + this._b) {
            var9 = (int)((long)this._l + -this._k + this._b);
            if (var4 < var9) {
               var9 = var4;
            }

            cj_.a278(this._o, (int)(-this._b + this._k), var3, var1, var9);
            var1 += var9;
            this._k += (long)var9;
            var4 -= var9;
         }

         if (var4 <= this._o.length) {
            if (var4 > 0) {
               this.a150(-57);
               var9 = var4;
               if (var4 > this._l) {
                  var9 = this._l;
               }

               cj_.a278(this._o, 0, var3, var1, var9);
               this._k += (long)var9;
               var4 -= var9;
               var1 += var9;
            }
         } else {
            this._f.a884(this._k, var2 + 19);

            for(this._a = this._k; 0 < var4; var1 += var9) {
               var9 = this._f.a552(var1, -11274, var4, var3);
               if (var9 == -1) {
                  break;
               }

               this._a += (long)var9;
               var4 -= var9;
               this._k += (long)var9;
            }
         }

         if (this._c != -1L) {
            if (this._k < this._c && var4 > 0) {
               var9 = var1 + (int)(-this._k + this._c);
               if (var9 > var1 + var4) {
                  var9 = var1 + var4;
               }

               while(var9 > var1) {
                  --var4;
                  var3[var1++] = 0;
                  ++this._k;
               }
            }

            long var15 = -1L;
            if (this._c >= var5 && (long)var8 + var5 > this._c) {
               var15 = this._c;
            } else if (var5 >= this._c && var5 < this._c + (long)this._d) {
               var15 = var5;
            }

            long var11 = -1L;
            if (var5 < this._c + (long)this._d && (long)var8 + var5 >= (long)this._d + this._c) {
               var11 = (long)this._d + this._c;
            } else if (var5 + (long)var8 > this._c && (long)this._d + this._c >= var5 + (long)var8) {
               var11 = (long)var8 + var5;
            }

            if (-1L < var15 && var15 < var11) {
               int var13 = (int)(var11 - var15);
               cj_.a278(this._n, (int)(var15 - this._c), var3, var1 + (int)(var15 - var5), var13);
               if (var11 > this._k) {
                  var4 = (int)((long)var4 - (-this._k + var11));
                  this._k = var11;
               }
            }
         }
      } catch (IOException var14) {
         this._a = -1L;
         throw var14;
      }

      if (var4 > 0) {
         throw new EOFException();
      }
   }

   final void a837(int var1, byte[] var2) throws IOException {
      this.a209(var1, ~var1, var2, var2.length);
   }

   static final cf_ a492(int var0, String var1) {
      va_ var2 = ci_.a846(var1, -10396);
      return null == var2 ? null : new cf_(var2, var0);
   }

   final void a539(int var1, int var2, int var3, byte[] var4) throws IOException {
      try {
         if (this._k + (long)var3 > this._p) {
            this._p = (long)var3 + this._k;
         }

         if (var2 >= -75) {
            a487(true);
         }

         if (-1L != this._c && (this._c > this._k || this._k > this._c + (long)this._d)) {
            this.d423((byte)115);
         }

         if (this._c != -1L && this._k + (long)var3 > (long)this._n.length + this._c) {
            int var5 = (int)(this._c - this._k + (long)this._n.length);
            cj_.a278(var4, var1, this._n, (int)(this._k - this._c), var5);
            var1 += var5;
            this._k += (long)var5;
            var3 -= var5;
            this._d = this._n.length;
            this.d423((byte)-92);
         }

         if (this._n.length >= var3) {
            if (var3 > 0) {
               if (this._c == -1L) {
                  this._c = this._k;
               }

               cj_.a278(var4, var1, this._n, (int)(-this._c + this._k), var3);
               this._k += (long)var3;
               if (-this._c + this._k > (long)this._d) {
                  this._d = (int)(this._k - this._c);
               }

            }
         } else {
            if (this._k != this._a) {
               this._f.a884(this._k, 18);
               this._a = this._k;
            }

            this._f.a209(var1, 102, var4, var3);
            this._a += (long)var3;
            if (this._a > this._i) {
               this._i = this._a;
            }

            long var11 = -1L;
            long var7 = -1L;
            if (this._k >= this._b && this._k < (long)this._l + this._b) {
               var11 = this._k;
            } else if (this._k <= this._b && this._b < this._k + (long)var3) {
               var11 = this._b;
            }

            if ((long)var3 + this._k > this._b && (long)var3 + this._k <= this._b + (long)this._l) {
               var7 = this._k + (long)var3;
            } else if (this._k < this._b + (long)this._l && this._b + (long)this._l <= (long)var3 + this._k) {
               var7 = (long)this._l + this._b;
            }

            if (-1L < var11 && var11 < var7) {
               int var9 = (int)(var7 - var11);
               cj_.a278(var4, (int)(-this._k + var11 + (long)var1), this._o, (int)(var11 - this._b), var9);
            }

            this._k += (long)var3;
         }
      } catch (IOException var10) {
         this._a = -1L;
         throw var10;
      }
   }

   hd_(qp_ var1, int var2, int var3) throws IOException {
      this._f = var1;
      this._p = this._i = var1.a411((byte)91);
      this._n = new byte[var3];
      this._o = new byte[var2];
      this._k = 0L;
   }

   final long a411(byte var1) {
      return var1 != -92 ? -92L : this._p;
   }

   static {
      try {
         Class var0 = SoftReference.class;
         _h = var0.getConstructor(Object.class);
         _e = var0.getMethod("get", (Class[])null);
      } catch (ClassNotFoundException var1) {
         _h = null;
      } catch (NoSuchMethodException var2) {
         _h = null;
      }

      _g = new od_();
   }
}
