import java.io.EOFException;
import java.io.IOException;

final class ln_ {
   static int _e;
   private int _b = 65000;
   static int _d;
   static String _c = "Use this alternative as your account name";
   private int _a;
   private hd_ _f = null;
   private hd_ _g = null;

   static final void a118(ni_ var0) {
      wa_._j.a501(var0);
   }

   static final String a173(int var0, String var1) {
      String var2 = bh_.a661(125, var0);
      return null != var2 ? jk_.a841(new String[]{var1}, var2, 30496) : var1;
   }

   final byte[] a104(int var1, int var2) {
      synchronized(this._f) {
         Object var10000;
         try {
            if ((long)(6 + var1 * 6) > this._g.a411((byte)-92)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this._g.a884((long)(6 * var1), -26296);
            this._g.a209(0, -1, un_._c, 6);
            int var4 = ((255 & un_._c[0]) << 16) + ((un_._c[1] & 255) << 8) + (un_._c[2] & 255);
            int var5 = (un_._c[5] & 255) + ((un_._c[4] & 255) << 8) + ((un_._c[3] & 255) << 16);
            if (var4 < 0 || var4 > this._b) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var5 > 0 && (long)var5 <= this._f.a411((byte)-92) / 520L) {
               byte[] var6 = new byte[var4];
               int var7 = 0;
               int var9 = 0;

               while(var7 < var4) {
                  if (var5 == 0) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this._f.a884((long)(var5 * 520), -26296);
                  int var10 = var4 - var7;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  byte var15;
                  if (var1 > 65535) {
                     var15 = 10;
                     if (510 < var10) {
                        var10 = 510;
                     }

                     this._f.a209(0, -1, un_._c, var15 + var10);
                     var13 = ((255 & un_._c[6]) << 16) - (-((un_._c[7] & 255) << 8) - (un_._c[8] & 255));
                     var14 = 255 & un_._c[9];
                     var11 = (un_._c[3] & 255) + ('\uff00' & un_._c[2] << 8) + (-16777216 & un_._c[0] << 24) + ((un_._c[1] & 255) << 16);
                     var12 = ((un_._c[4] & 255) << 8) + (255 & un_._c[5]);
                  } else {
                     if (512 < var10) {
                        var10 = 512;
                     }

                     var15 = 8;
                     this._f.a209(0, -1, un_._c, var15 + var10);
                     var11 = ('\uff00' & un_._c[0] << 8) + (255 & un_._c[1]);
                     var14 = 255 & un_._c[7];
                     var13 = ((un_._c[5] & 255) << 8) + ((un_._c[4] & 255) << 16) + (255 & un_._c[6]);
                     var12 = (un_._c[3] & 255) + ('\uff00' & un_._c[2] << 8);
                  }

                  if (var11 != var1 || var9 != var12 || var14 != this._a) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  if (0 > var13 || (long)var13 > this._f.a411((byte)-92) / 520L) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  int var16 = var15 + var10;
                  var5 = var13;
                  ++var9;

                  for(int var17 = var15; var16 > var17; ++var17) {
                     var6[var7++] = un_._c[var17];
                  }
               }

               byte[] var21 = var6;
               return var21;
            }

            var10000 = null;
         } catch (IOException var19) {
            return null;
         }

         return (byte[])var10000;
      }
   }

   static final void a157(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   static final cd_ a683(byte var0) {
      String var1 = vl_.c738(var0 - 29335);
      if (var1 != null && 0 <= var1.indexOf(64)) {
         var1 = "";
      }

      if (var0 != -120) {
         _e = -79;
      }

      return new cd_(vl_.c738(var0 - 29335), pi_.c154());
   }

   public static void b150() {
      _c = null;
   }

   private final boolean a664(boolean var1, int var2, int var3, boolean var4, byte[] var5) {
      synchronized(this._f) {
         try {
            int var7;
            boolean var10000;
            if (!var4) {
               var7 = (int)((this._f.a411((byte)-92) + 519L) / 520L);
               if (0 == var7) {
                  var7 = 1;
               }
            } else {
               if (this._g.a411((byte)-92) < (long)(6 * var3 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this._g.a884((long)(var3 * 6), -26296);
               this._g.a209(0, -1, un_._c, 6);
               var7 = ((255 & un_._c[4]) << 8) + ((255 & un_._c[3]) << 16) + (255 & un_._c[5]);
               if (var7 <= 0 || (long)var7 > this._f.a411((byte)-92) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            }

            un_._c[5] = (byte)var7;
            un_._c[3] = (byte)(var7 >> 16);
            un_._c[4] = (byte)(var7 >> 8);
            un_._c[2] = (byte)var2;
            un_._c[0] = (byte)(var2 >> 16);
            un_._c[1] = (byte)(var2 >> 8);
            this._g.a884((long)(6 * var3), -26296);
            this._g.a539(0, -91, 6, un_._c);
            int var8 = 0;
            if (!var1) {
               this._b = 88;
            }

            int var9 = 0;

            while(true) {
               if (var8 < var2) {
                  label157: {
                     int var10 = 0;
                     int var11;
                     if (var4) {
                        this._f.a884((long)(520 * var7), -26296);
                        int var12;
                        int var13;
                        if (65535 < var3) {
                           try {
                              this._f.a209(0, -1, un_._c, 10);
                           } catch (EOFException var17) {
                              break label157;
                           }

                           var11 = ((un_._c[1] & 255) << 16) + (-16777216 & un_._c[0] << 24) + (un_._c[2] << 8 & '\uff00') + (un_._c[3] & 255);
                           var10 = (un_._c[7] << 8 & '\uff00') + ((un_._c[6] & 255) << 16) + (255 & un_._c[8]);
                           var12 = ((255 & un_._c[4]) << 8) + (255 & un_._c[5]);
                           var13 = 255 & un_._c[9];
                        } else {
                           try {
                              this._f.a209(0, -1, un_._c, 8);
                           } catch (EOFException var16) {
                              break label157;
                           }

                           var12 = ('\uff00' & un_._c[2] << 8) + (un_._c[3] & 255);
                           var13 = un_._c[7] & 255;
                           var10 = (un_._c[4] << 16 & 16711680) + ((un_._c[5] & 255) << 8) + (255 & un_._c[6]);
                           var11 = (un_._c[1] & 255) + (un_._c[0] << 8 & '\uff00');
                        }

                        if (var11 != var3 || var9 != var12 || this._a != var13) {
                           var10000 = false;
                           return var10000;
                        }

                        if (0 > var10 || this._f.a411((byte)-92) / 520L < (long)var10) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (0 == var10) {
                        var10 = (int)((519L + this._f.a411((byte)-92)) / 520L);
                        var4 = false;
                        if (var10 == 0) {
                           ++var10;
                        }

                        if (var10 == var7) {
                           ++var10;
                        }
                     }

                     if (512 >= -var8 + var2) {
                        var10 = 0;
                     }

                     if (65535 >= var3) {
                        un_._c[2] = (byte)(var9 >> 8);
                        un_._c[6] = (byte)var10;
                        un_._c[5] = (byte)(var10 >> 8);
                        un_._c[1] = (byte)var3;
                        un_._c[4] = (byte)(var10 >> 16);
                        un_._c[7] = (byte)this._a;
                        un_._c[3] = (byte)var9;
                        un_._c[0] = (byte)(var3 >> 8);
                        this._f.a884((long)(520 * var7), -26296);
                        this._f.a539(0, -97, 8, un_._c);
                        var11 = -var8 + var2;
                        if (512 < var11) {
                           var11 = 512;
                        }

                        this._f.a539(var8, -125, var11, var5);
                        var8 += var11;
                     } else {
                        un_._c[1] = (byte)(var3 >> 16);
                        un_._c[7] = (byte)(var10 >> 8);
                        un_._c[5] = (byte)var9;
                        un_._c[6] = (byte)(var10 >> 16);
                        un_._c[4] = (byte)(var9 >> 8);
                        un_._c[3] = (byte)var3;
                        un_._c[0] = (byte)(var3 >> 24);
                        un_._c[9] = (byte)this._a;
                        un_._c[2] = (byte)(var3 >> 8);
                        un_._c[8] = (byte)var10;
                        this._f.a884((long)(var7 * 520), -26296);
                        this._f.a539(0, -116, 10, un_._c);
                        var11 = -var8 + var2;
                        if (var11 > 510) {
                           var11 = 510;
                        }

                        this._f.a539(var8, -106, var11, var5);
                        var8 += var11;
                     }

                     ++var9;
                     var7 = var10;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var18) {
            return false;
         }
      }
   }

   public final String toString() {
      return "" + this._a;
   }

   final boolean a267(byte[] var1, int var2, int var3, int var4) {
      if (var4 != -29447) {
         return false;
      } else {
         synchronized(this._f) {
            if (var3 >= 0 && this._b >= var3) {
               boolean var6 = this.a664(true, var3, var2, true, var1);
               if (!var6) {
                  var6 = this.a664(true, var3, var2, false, var1);
               }

               return var6;
            } else {
               throw new IllegalArgumentException();
            }
         }
      }
   }

   static final boolean a154() {
      return bl_._r.b427((byte)113);
   }

   ln_(int var1, hd_ var2, hd_ var3, int var4) {
      this._f = var2;
      this._g = var3;
      this._a = var1;
      this._b = var4;
   }
}
