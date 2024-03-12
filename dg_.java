final class dg_ extends da_ {
   static int[][] _L;
   private int _J;
   private int _I;
   static String _G = "You are charging <%0> Orbs of Mastery!";
   static int _H = 1;
   static String[] _O = new String[]{null, "The rooms you can place are shown in the panel on the left. <%highlight>More types of room will become available as you gain Renown</col>. Click a room to select it and review its statistics and description. You can then place the room by <col=FF0000>left-clicking somewhere in your dungeon</col>. Placing a room on top of an existing one will cause it to be replaced - you will receive some of the room's original cost in return.<br><br><%command>Select a room from the left and place it in your dungeon.</col>"};
   private int _F;
   private String _K;
   private boolean _N;
   static String _P = "Loading music";
   private se_ _M;

   dg_(int var1, int var2, int var3, int var4, lm_ var5, boolean var6, int var7, int var8, se_ var9, int var10, String var11) {
      super(var1, var2, var3, var4, (ca_)null, (pg_)null);
      this._N = var6;
      super._D = var5;
      this._I = var10;
      this._J = var7;
      this._M = var9;
      this._K = var11;
      this._F = var8;
      int var12 = this._J - this._F;
      int var13 = this._M.a490(var11, var12, this._M._H) + this._F * 2;
      if (var13 <= var4) {
         var13 = var4;
      } else {
         this.b050(0, var3, var2, var1, var13);
      }

      int var14 = this._N ? 0 : this._J + this._F * 2;
      super._D.b050(0, -this._J + (var3 - this._F * 3), this._F + (var13 - var4 >> 1), var14, var4 - 2 * this._F);
   }

   final void a115(int var1, int var2, int var3, int var4) {
      int var5 = var2 + super._q;
      int var6 = super._v + var4;
      super.a115(var1, var2, 0, var4);
      if (var1 == var3) {
         int var7 = this._N ? -(2 * this._F) + -this._J + super._x : 0;
         this._M.a385(this._K, this._F + var7 + var5, var6 + this._F, -this._F + this._J, super._s - this._F * 2, this._I, -1, this._N ? 0 : 2, 1, this._M._H);
      }
   }

   final String c983(byte var1) {
      boolean var2 = super._D._u;
      super._D._u = super._u;
      String var3 = super._D.c983((byte)25);
      super._D._u = var2;
      if (var1 < 3) {
         this.a115(127, 20, 104, -29);
      }

      return var3;
   }

   public static void b487() {
      _O = null;
      _G = null;
      _P = null;
      _L = (int[][])null;
   }
}
