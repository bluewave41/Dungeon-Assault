import java.util.Iterator;

final class dh_ implements Iterable {
   static af_ _b = new af_();
   static String _c = "<br><br>This will activate your dungeon, allowing other players to raid it.";
   static String _f;
   ll_ _d;
   static cn_ _a;
   static int _g;
   static String _e = "Traps";

   static final boolean a491() {
      return true;
   }

   final void a520(ll_ var1, boolean var2) {
      if (!var2) {
         if (null != var1._l) {
            var1.b423((byte)-2);
         }

         var1._n = this._d;
         var1._l = this._d._l;
         var1._l._n = var1;
         var1._n._l = var1;
      }
   }

   public final Iterator iterator() {
      return new id_(this);
   }

   static final void a115(int var0, int var1, int var2, int var3) {
      int[] var4 = new int[4];
      gf_.a331(var4);
      gf_.e115(0, var3 - 16, 640, var2 + var0 + var3);
      int var5 = (200 - bl_._s._E >> 1) + var1;

      for(int var6 = var3 - 16; 32 + var2 + var3 > var6; var6 += bl_._s._G) {
         bl_._s.h093(var5, var6);
      }

      gf_.b331(var4);
      ao_._n.d115(var1 + (-ao_._n._E + 200 >> 1), -(ao_._n._G >> 1) - 16 + var3, 500, 0);
      rn_._c.d115((200 - rn_._c._E >> 1) + var1, var2 + var3 + (20 - (rn_._c._G >> 1)), 0, 500);
   }

   static final void b150() {
      if (0 - hh_._b != nl_._d && nl_._d == -hh_._b + 250) {
      }

      ++nl_._d;
   }

   final ll_ b162(boolean var1) {
      ll_ var2 = this._d._n;
      if (this._d != var2) {
         var2.b423((byte)-2);
         if (!var1) {
            this.a520((ll_)null, false);
         }

         return var2;
      } else {
         return null;
      }
   }

   static final boolean a427() {
      return sp_._c != null && pd_._A == qa_._c;
   }

   public static void a150(int var0) {
      _b = null;
      _c = null;
      _a = null;
      if (var0 != 20) {
         a150(-80);
      }

      _f = null;
      _e = null;
   }

   private dh_() throws Throwable {
      throw new Error();
   }
}
