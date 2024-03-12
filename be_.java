final class be_ extends ip_ {
   static String _m = "You must have had your dungeon reset by an Orb of Mastery once to earn the title of <%1>.";
   static String _r = "Cancel";
   static hl_ _n = null;
   private rm_ _p;
   static String _q = "CHARGE ORB";
   static ph_ _o;
   static wk_ _s;

   final String a439(byte var1, String var2) {
      if (var1 < 44) {
         this.a212((String)null, -75);
      }

      if (this._p instanceof qn_) {
         dp_ var3 = ((qn_)this._p).a293(-79);
         if (var3 != null) {
            if (var3.a151((byte)-117) == c_._d && !var2.equals(this._p._w)) {
               return ep_._j;
            }

            return var3.a791(true);
         }
      }

      return !var2.equals(this._p._w) ? ep_._j : null;
   }

   final od_ a212(String var1, int var2) {
      if (this._p instanceof qn_) {
         dp_ var3 = ((qn_)this._p).a293(-122);
         if (null != var3 && var3.a151((byte)-99) != c_._d) {
            return pd_._J;
         }
      }

      return !var1.equals(this._p._w) ? pd_._J : c_._d;
   }

   public static void e150() {
      _q = null;
      _s = null;
      _m = null;
      _n = null;
      _o = null;
      _r = null;
   }

   be_(rm_ var1, rm_ var2) {
      super(var1);
      this._p = var2;
   }
}
