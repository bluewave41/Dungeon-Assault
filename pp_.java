final class pp_ extends rj_ {
   static md_ _K;
   static String[] _F = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   static String _I = "Go Back";
   private cn_ _B;
   private cn_ _z;
   boolean _D;
   static int _J = -1;
   private cn_ _C;
   static String[] _E = new String[]{"Rooms", "Rooms you have not yet visited are dark. Your raiders will light torches in each new room as they enter."};
   private cn_ _A;
   private boolean _G;

   final void a994(cn_ var1, cn_ var2, cn_ var3, cn_ var4, int var5) {
      this.a238(-66, var1);
      this._C = var2;
      if (var5 <= 15) {
         _E = (String[])null;
      }

      this._A = var4;
      this._z = var3;
   }

   final void b326(int var1, int var2, int var3) {
      if (var2 == 8187) {
         if (this._D) {
            if (super._w) {
               int var4 = this != wi_._ob ? super._p : mo_._a;
               int var5 = var4 - super._m >> 2;
               if (var5 > 64) {
                  var5 = 64;
               }

               int var6 = var5 + (super._p - mo_._a);
               if (!this._G && this != wi_._ob && var6 <= 0) {
                  this._B.h093(var1 + super._t, var3 + super._i);
               } else {
                  int var7;
                  if (wi_._ob == this) {
                     var7 = var5;
                     this._z.h093(super._t + var1, var3 + super._i);
                  } else {
                     this._B.h093(super._t + var1, var3 + super._i);
                     var7 = var6;
                     this._z.d326(var1 + super._t, var3 + super._i, 4 * var6);
                  }

                  int var8 = (int)((te_.c503(mo_._a, this.hashCode(), 0.015625) + 2.0) * (double)var7);
                  if (0 > var8) {
                     var8 = 0;
                  }

                  this._C.b326(super._t + var1, super._i + var3, var8);
               }
            } else {
               this._A.h093(var1 + super._t, super._i + var3);
            }

         }
      }
   }

   private pp_(cn_ var1, cn_ var2, cn_ var3, cn_ var4, int var5, int var6, int var7) {
      super(var5, var6, var1._y, var1._v, var7);
      this._D = true;
      this._z = var3;
      this._A = var2;
      this._B = var1;
      this._C = var4;
   }

   final void a183(boolean var1, int var2, int var3) {
      if (var1) {
         this._C = (cn_)null;
      }

      throw new RuntimeException("Unsupported");
   }

   pp_(cn_ var1, cn_ var2, cn_ var3, cn_ var4, int var5, int var6) {
      this(var1, var2, var3, var4, var5, var6, 0);
   }

   private final void a238(int var1, cn_ var2) {
      this._B = this._z = var2;
      if (var1 != -66) {
         this._D = true;
      }

      super.a183(false, this._B._y, this._B._v);
   }

   public static void e150() {
      _F = null;
      _E = null;
      _K = null;
      _I = null;
   }

   static final boolean a331(char var0) {
      return '0' <= var0 && var0 <= '9' || 'A' <= var0 && var0 <= 'Z' || 'a' <= var0 && var0 <= 'z';
   }
}
