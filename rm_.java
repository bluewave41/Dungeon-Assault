import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

class rm_ extends ck_ {
   private int _R = -1;
   private int _M;
   static String _J = "Passive ability - <%0>";
   private boolean _Q;
   private long _I;
   static boolean _P;
   private int _L;
   private int _K;
   private boolean _N = false;
   static int _T;
   private long _O = 0L;
   static String[] _S = new String[]{"Defeat", "<%highlight>Your raider has failed!</col><br><br><%command>Seek another route or try again with another raider. Continue moving your party toward the hoard room.</col>"};

   private final void l150(int var1) {
      try {
         String var2 = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object)null).getTransferData(DataFlavor.stringFlavor);
         this.g423((byte)-90);
         if (var1 <= 49) {
            _J = (String)null;
         }

         this.a627(var2, (byte)-127);
      } catch (Exception var3) {
      }

   }

   private final void s150(int var1) {
      if (var1 != 32) {
         _J = (String)null;
      }

      if (super._n instanceof jo_) {
         ((jo_)super._n).a157(this, (byte)-127);
      }

   }

   private final void a627(String var1, byte var2) {
      if (this._K != -1) {
         int var3 = this._K - super._w.length();
         if (var3 >= 0) {
            return;
         }

         var1 = var1.substring(0, var3);
      }

      if (var2 >= -67) {
         this._I = -77L;
      }

      if (this._L != super._w.length()) {
         super._w = super._w.substring(0, this._L) + var1 + super._w.substring(this._L, super._w.length());
      } else {
         super._w = super._w + var1;
      }

      this._L += var1.length();
      this._M = this._L;
      this.n150(4746);
   }

   final boolean a401(lm_ var1, char var2, int var3, byte var4) {
      this._I = kd_.c138(-2456);
      if (var4 < 55) {
         this._R = 21;
      }

      if ('<' != var2 && '>' != var2) {
         if (' ' <= var2 && var2 <= '~') {
            if (this._L != this._M) {
               this.g423((byte)-105);
            }

            if (-1 == this._K || super._w.length() < this._K) {
               if (this._L >= super._w.length()) {
                  super._w = super._w + var2;
                  this._M = this._L = super._w.length();
               } else {
                  super._w = super._w.substring(0, this._L) + var2 + super._w.substring(this._L, super._w.length());
                  ++this._L;
                  this._M = this._L;
               }

               this.n150(4746);
            }

            return true;
         } else {
            if (85 != var3) {
               if (var3 != 101) {
                  if (var3 == 13) {
                     this.p150(61);
                     return true;
                  }

                  if (var3 != 96) {
                     if (97 != var3) {
                        if (var3 == 102) {
                           this.a093(0, 6931);
                           return true;
                        }

                        if (var3 == 103) {
                           this.a093(super._w.length(), 6931);
                           return true;
                        }

                        if (84 == var3) {
                           this.s150(32);
                           return true;
                        }

                        if (qk_._e[82] && var3 == 65) {
                           this.i150(0);
                           return true;
                        }

                        if (qk_._e[82] && var3 == 66) {
                           this.h423((byte)-86);
                           return true;
                        }

                        if (qk_._e[82] && 67 == var3) {
                           this.l150(69);
                           return true;
                        }
                     } else if (this._L < super._w.length()) {
                        this.a093(qk_._e[82] ? this.f410((byte)116) : 1 + this._L, 6931);
                        return true;
                     }
                  } else if (0 < this._L) {
                     this.a093(!qk_._e[82] ? this._L - 1 : this.o137(88), 6931);
                     return true;
                  }
               } else {
                  if (this._L != this._M) {
                     this.g423((byte)-117);
                     return true;
                  }

                  if (this._L < super._w.length()) {
                     this._M = this._L + 1;
                     this.g423((byte)113);
                     return true;
                  }
               }
            } else {
               if (this._M != this._L) {
                  this.g423((byte)-118);
                  return true;
               }

               if (0 < this._L) {
                  this._M = this._L - 1;
                  this.g423((byte)-93);
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   final void a223(String var1, boolean var2, byte var3) {
      if (null == var1) {
         var1 = "";
      }

      super._w = var1;
      if (var3 < 2) {
         this.g423((byte)-16);
      }

      int var4 = var1.length();
      if (-1 != this._K && var4 > this._K) {
         super._w = super._w.substring(0, this._K);
      }

      this._L = this._M = super._w.length();
      if (!var2) {
         this.n150(4746);
      }

   }

   private final void h423(byte var1) {
      if (var1 < -73) {
         String var2 = this.k738(82);
         if (var2.length() > 0) {
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(this.k738(82)), (ClipboardOwner)null);
         }

      }
   }

   private final void i150(int var1) {
      if (var1 != 0) {
         _S = (String[])null;
      }

      this.h423((byte)-89);
      this.g423((byte)-111);
   }

   void n150(int var1) {
      if (super._n instanceof jo_) {
         ((jo_)super._n).a430(this, 10000536);
      }

      if (var1 != 4746) {
         this.o137(99);
      }

   }

   static final int a616(ec_ var0, int var1) {
      int var2 = var0.c474(true);
      if (var2 == 255) {
         var2 = ek_._c;
      }

      if (var1 != 6065) {
         _J = (String)null;
      }

      return var2;
   }

   private final int o137(int var1) {
      if (this._L == 0) {
         return this._L;
      } else {
         if (var1 < 37) {
            this._O = 78L;
         }

         int var2;
         for(var2 = this._L - 1; 0 < var2 && super._w.charAt(var2 - 1) != ' '; --var2) {
         }

         return var2;
      }
   }

   final boolean a946(lm_ var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      if (super.a946(var1, var2, var3, var4, var5, (byte)-124, var7) && super._o instanceof th_) {
         int var9 = ((th_)super._o).a605(16, var7, hj_._S, var4, this, eh_._h);
         this.a093(var9 == -1 ? 0 : var9, 6931);
         long var11 = kd_.c138(-2456);
         this._N = -this._O + var11 < 250L;
         if (this._N) {
            this._M = this.o137(88);
            this._L = this.f410((byte)99);
            if (this._L > 0 && super._w.charAt(this._L - 1) == ' ') {
               --this._L;
            }

            this._R = this._L;
         }

         this._O = var11;
         return true;
      } else {
         return false;
      }
   }

   final void a115(int var1, int var2, int var3, int var4) {
      if (super._o != null && 0 == var1) {
         super._o.a623((byte)34, this, var2, var4, super._B);
         if (super._o instanceof th_) {
            th_ var5 = (th_)super._o;
            if (this._L != this._M) {
               var5.a308(this._M, var2, var4, this, 33, this._L);
            }

            long var6 = kd_.c138(var3 - 2456);
            if ((-this._I + var6) % 1000L < 500L) {
               var5.a923(this, this._L, var4, -1, var2);
            }
         }
      }

      if (var3 != 0) {
         this.j150(31);
      }

   }

   static final int a901(CharSequence var0, char var1) {
      int var2 = 0;
      int var3 = var0.length();

      for(int var5 = 0; var5 < var3; ++var5) {
         if (var1 == var0.charAt(var5)) {
            ++var2;
         }
      }

      return var2;
   }

   private final void g423(byte var1) {
      if (this._M != this._L) {
         int var3 = this._M < this._L ? this._M : this._L;
         int var4 = this._M < this._L ? this._L : this._M;
         this._M = var3;
         this._L = var3;
         super._w = super._w.substring(0, var3) + super._w.substring(var4, super._w.length());
         this.n150(4746);
      }

   }

   static final double a802(int var0, int var1, double var2, int var4) {
      double var5 = (double)var4 / (double)var1;
      double var7 = -((double)var0 * 0.02) + 0.1;
      double var9 = 0.9 - 0.08 * (double)var0;
      double var12 = var5 * var9 + var2 + var7;
      if (1.0 < var12) {
         var12 = 1.0;
      }

      return var12;
   }

   private final void a093(int var1, int var2) {
      this._L = var1;
      if (var2 != 6931) {
         _P = false;
      }

      if (!qk_._e[81]) {
         this._M = this._L;
      }

   }

   public static void m150() {
      _S = null;
      _J = null;
   }

   private final int f410(byte var1) {
      if (var1 <= 76) {
         this.l150(39);
      }

      int var2 = super._w.length();
      if (this._L == var2) {
         return this._L;
      } else {
         int var3;
         for(var3 = 1 + this._L; var2 > var3 && super._w.charAt(var3 - 1) != ' '; ++var3) {
         }

         return var3;
      }
   }

   void a319(int var1, int var2, lm_ var3, boolean var4) {
      super.a319(var1, var2, var3, var4);
      this.j150(-24768);
      if (1 == super._y) {
         if (super._o instanceof th_) {
            th_ var5 = (th_)super._o;
            int var6 = var5.a605(16, var2, hj_._S, var1, this, eh_._h);
            if (-1 != var6) {
               if (this._N && var6 < this._R && this._M < var6) {
                  var6 = this._R;
               }

               this._L = var6;
            }
         }

         this._I = kd_.c138(-2456);
      }

   }

   rm_(String var1, pg_ var2, int var3) {
      super(var1, var2);
      this._K = var3;
      super._o = hl_._a._c;
      this.a223(var1, true, (byte)57);
      this._Q = true;
      this._I = kd_.c138(-2456);
   }

   static final void q150(int var0) {
      wj_ var1 = ra_._c;
      if (var0 != -5705) {
         _T = -87;
      }

      int var2 = var1.c474(true);
      if (var2 != 0) {
         if (var2 == 1) {
            int var3 = var1.h137(-107);

            ue_ var4;
            for(var4 = (ue_)qm_._q.e024(-24172); null != var4 && var4._k != var3; var4 = (ue_)qm_._q.a024(4)) {
            }

            if (null == var4) {
               tl_.a150(126);
               return;
            }

            var4.a487(false);
         } else {
            sm_.a741((Throwable)null, 1, "A1: " + sj_.l738(192));
            tl_.a150(-85);
         }
      } else {
         ub_ var6 = (ub_)bg_._s.e024(-24172);
         if (null == var6) {
            tl_.a150(-86);
            return;
         }

         int var7 = var1.c474(true);
         if (0 != var7) {
            byte[] var5 = new byte[var7];
            var1.a286((byte)-111, 0, var7, var5);
         } else {
            Object var8 = null;
         }

         var1._o += 4;
         if (!var1.d491(true)) {
            tl_.a150(var0 ^ -5667);
            return;
         }

         var6.a487(false);
      }

   }

   private final void j150(int var1) {
      if (this._Q) {
         if (super._o instanceof th_) {
            th_ var2 = (th_)super._o;
            if (var1 != -24768) {
               a616((ec_)null, -49);
            }

            l_ var3 = var2.b865(-2, this);
            int var4 = var3.c137(-117);
            int var5 = var2.c353(var1 + 24772, this);
            int var6 = var2.a137(var1 ^ -24774) >> 1;
            if (-var6 + var5 <= var4) {
               int var7 = super._j + var3.a543((byte)86, this._L);
               if (var5 - var6 < var7) {
                  super._j -= -var5 + var6 + var7;
               } else if (var7 < var6) {
                  super._j = var6 + -var7 + super._j;
               }

               if (0 >= super._j) {
                  if (var6 - var5 > super._j) {
                     super._j = var6 - var5;
                  }
               } else {
                  super._j = 0;
               }

            } else {
               super._j = 0;
               super._A = 0;
            }
         }
      } else {
         super._A = 0;
         super._j = 0;
      }
   }

   final void p150(int var1) {
      if (var1 <= 30) {
         a901((CharSequence)null, 'ﾫ');
      }

      this._M = 0;
      super._w = "";
      this._L = 0;
      this.n150(4746);
   }

   private final String k738(int var1) {
      int var2 = this._L <= this._M ? this._L : this._M;
      if (var1 != 82) {
         return (String)null;
      } else {
         int var3 = this._M < this._L ? this._L : this._M;
         return super._w.substring(var2, var3);
      }
   }

   static final void r150() {
      ga_._o = new cn_[9];
      if (1 == hc_._d) {
         sj_._db = hl_._e;
      } else if (2 == hc_._d) {
         sj_._db = na_._G;
      } else {
         sj_._db = dd_._C;
      }

      ga_._o[0] = rc_.a324("", sb_._a, "intro_01.jpg");
      ga_._o[1] = rc_.a324("", sb_._a, "intro_03.jpg");
      ga_._o[2] = rc_.a324("", sb_._a, "intro_02.jpg");
      ga_._o[3] = rc_.a324("", sb_._a, "intro_04.jpg");
      ga_._o[4] = rc_.a324("", sb_._a, "intro_05.jpg");
      ga_._o[5] = ga_._o[4];
      ga_._o[6] = rc_.a324("", sb_._a, "intro_06.jpg");
      ga_._o[7] = rc_.a324("", sb_._a, "intro_07.jpg");
      ga_._o[8] = rc_.a324("", sb_._a, "intro_08.jpg");
      jh_.c797();

      for(int var0 = 0; var0 < ga_._o.length; ++var0) {
         ga_._o[var0].e797();
         gf_.e050(0, 0, gf_._i, gf_._c, 0);
         gf_.e669(1, 1, gf_._i - 2, gf_._c - 2, 0, 128);
      }

      jh_.b797();
      sg_._b = rc_.a324("", sb_._a, "logo.jpg");
      ro_._B = true;
   }
}
