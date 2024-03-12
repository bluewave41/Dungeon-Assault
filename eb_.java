final class eb_ extends ck_ {
   static String _P = "Select attack/defence balance";
   int _J;
   private bp_ _K;
   static String _L = "<col=FF0000>Attack -2</col>, <%col_detect>Detect +2</col> in adjacent rooms.";
   static String _M = "Grey-skinned, faceless and hairless, this gangly creature can reshape its body at will.";
   static cf_[] _O;
   int _N;
   private int _Q;
   static String _I = "Order your raider to attempt to leave the room without fighting the monster. The monster in the room will not be defeated; you can send in a different raider or find another path around the monster.<br><br>Requires: <col=0A7500>Defence</col>, <col=21634A>Dodge</col>";

   final boolean a946(lm_ var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      int var8;
      if (!super.a946(var1, var2, var3, var4, var5, (byte)83, var7)) {
         var8 = -119 / ((var6 + 80) / 35);
         return false;
      } else {
         var8 = -this._J + (var5 - var4);
         int var9 = super._x - 2 * this._J;
         if (var8 > var9) {
            var8 = var9;
         }

         if (var8 < 0) {
            var8 = 0;
         }

         var8 = this._Q * var8 / var9;
         if (1 == var2) {
            this._K.e093(var8, -67);
         } else if (var2 == 2) {
            int var10 = Integer.MAX_VALUE;
            int var11 = -1;

            for(int var12 = 0; this._K.a410((byte)-44) > var12; ++var12) {
               int var13 = -var8 + this._K.a080(-814, var12);
               var13 *= var13;
               if (var13 < var10) {
                  var11 = var12;
                  var10 = var13;
               }
            }

            if (var11 >= 0) {
               this._K.b093(var11, 100);
            }
         }

         return true;
      }
   }

   final int i137(int var1) {
      if (var1 <= 88) {
         this.a080(-112, 127);
      }

      return this._K.a410((byte)-72);
   }

   final int a080(int var1, int var2) {
      return ~var2 <= var1 && this._K.a410((byte)-91) > var2 ? this._K.a080(-814, var2) : -1;
   }

   public static void f423(byte var0) {
      _M = null;
      if (var0 != 86) {
         f423((byte)0);
      }

      _O = null;
      _L = null;
      _I = null;
      _P = null;
   }

   private eb_() throws Throwable {
      throw new Error();
   }

   final int a137(int var1) {
      if (var1 >= -58) {
         _L = (String)null;
      }

      return this._Q;
   }
}
