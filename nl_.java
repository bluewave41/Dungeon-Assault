import java.awt.Component;

abstract class nl_ {
   static cn_ _g;
   static pp_ _a;
   static String[] _f = new String[]{null, "Also, there are different strategies that can be employed in combat. All <%raiders> can either <%advance>, <%charge>, or attempt to <%flee>.<br><br><%advance> orders your raider to enter a room normally.<br><br><%col_charge>Charging</col> is a more aggressive attack: one point of the raider's <%defence> is transferred to <%attack>."};
   static String[] _b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
   static md_ _e;
   static String _c = "Please Wait";
   static int _d;

   public static void a423() {
      _g = null;
      _f = null;
      _c = null;
      _b = null;
      _a = null;
      _e = null;
   }

   abstract void a649(byte var1, Component var2);

   static final boolean a370(int var0) {
      int var1 = nk_._Fb[var0];
      if (var1 != 18) {
         if (var1 == 19) {
            return mo_._e < en_._a.length - 1;
         } else if (var1 != 26 && 25 != var1 && var1 != 24) {
            if (27 != var1) {
               return true;
            } else {
               return 6 == mo_._e && kn_._e;
            }
         } else {
            return 6 == mo_._e;
         }
      } else {
         return 0 < mo_._e;
      }
   }

   abstract void a177(boolean var1, Component var2);

   abstract int a137(int var1);
}
