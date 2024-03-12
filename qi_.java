import java.util.Iterator;

final class qi_ implements Iterable {
   static double _a = 0.0;
   static cn_[] _f;
   static String _h = "The <%0> is undamaged!";
   static int _b;
   static pn_ _e;
   static cn_ _i;
   private ne_ _j;
   static String _c = "Years spent studying the dark arts, in service to the corrupt human nobles of the west, have given the sorceress the knowledge to tame the elements and turn them against her foes.";
   ne_[] _d;
   int _g;

   public final Iterator iterator() {
      return new ho_(this);
   }

   final void a957(long var1, byte var3, ne_ var4) {
      if (var4._a != null) {
         var4.a487(false);
      }

      if (var3 <= -127) {
         ne_ var5 = this._d[(int)(var1 & (long)(this._g - 1))];
         var4._a = var5._a;
         var4._e = var5;
         var4._a._e = var4;
         var4._e._a = var4;
         var4._h = var1;
      }
   }

   final ne_ a808(int var1, long var2) {
      ne_ var4 = this._d[(int)((long)(this._g - var1) & var2)];

      for(this._j = var4._e; this._j != var4; this._j = this._j._e) {
         if (this._j._h == var2) {
            ne_ var5 = this._j;
            this._j = this._j._e;
            return var5;
         }
      }

      this._j = null;
      return null;
   }

   private qi_() throws Throwable {
      throw new Error();
   }

   public static void a487() {
      _c = null;
      _e = null;
      _h = null;
      _i = null;
      _f = null;
   }
}
