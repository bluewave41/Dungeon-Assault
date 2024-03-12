import java.awt.event.ActionEvent;
import java.util.Iterator;

final class ho_ implements Iterator {
   static String _f = "Play free version";
   static String _c = "Cost: <%0>";
   static String _i;
   private ne_ _g = null;
   static String _b = "Select a party leader, who will be first to enter the next room.";
   static String _e = "<col=FF0000>Defence -3</col>";
   private ne_ _d;
   private qi_ _h;
   private int _a;

   private final void a423(byte var1) {
      this._a = 1;
      this._g = null;
      if (var1 <= 51) {
         _i = (String)null;
      }

      this._d = this._h._d[0]._e;
   }

   public final void remove() {
      if (this._g != null) {
         this._g.a487(false);
         this._g = null;
      } else {
         throw new IllegalStateException();
      }
   }

   public static void a150() {
      _f = null;
      _b = null;
      _i = null;
      _c = null;
      _e = null;
   }

   static final void b423() {
      ac_._s = 0;

      for(int var0 = 0; var0 < 8; ++var0) {
         if (um_._i[var0] != null && um_._i[var0] != gm_._d._a[var0]) {
            if (gm_._d._a[var0] != null && gm_._d._a[var0]._c == um_._i[var0]._c) {
               ac_._s += gj_.a498(um_._i[var0]._n);
            } else {
               ac_._s += ib_.a598(um_._i[var0]._n);
            }
         }
      }

      sn_._b._w = gm_._d._s >= ac_._s;
      lb_.a487();
   }

   public final Object next() {
      ne_ var1;
      if (this._h._d[this._a - 1] == this._d) {
         do {
            if (this._h._g <= this._a) {
               return null;
            }

            var1 = this._h._d[this._a++]._e;
         } while(this._h._d[this._a - 1] == var1);

         this._g = var1;
         this._d = var1._e;
         return var1;
      } else {
         var1 = this._d;
         this._g = var1;
         this._d = var1._e;
         return var1;
      }
   }

   public final boolean hasNext() {
      if (this._h._d[this._a - 1] != this._d) {
         return true;
      } else {
         while(this._a < this._h._g) {
            if (this._h._d[this._a++]._e != this._h._d[this._a - 1]) {
               this._d = this._h._d[this._a - 1]._e;
               return true;
            }

            this._d = this._h._d[this._a - 1];
         }

         return false;
      }
   }

   static final void a246(qg_ var0, Object var1) {
      if (var0._e != null) {
         for(int var2 = 0; 50 > var2 && null != var0._e.peekEvent(); ++var2) {
            pj_.a054(0, 1L);
         }

         try {
            if (null != var1) {
               var0._e.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }
         } catch (Exception var3) {
         }

      }
   }

   ho_(qi_ var1) {
      this._h = var1;
      this.a423((byte)67);
   }
}
