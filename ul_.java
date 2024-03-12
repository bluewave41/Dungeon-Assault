final class ul_ {
   static String _b = "Data server full or too many connections from your address. Please try again in a few minutes.";
   static String _a = "A room full of large, maggot-like creatures; their bile can burn through raiders' armour in seconds, inflicting permanent injury.<br><br>Defeated raiders permanently lose 1 <%attack>.";
   static String _d;
   static char[] _c = new char[]{'[', ']', '#'};

   static final void a588(la_ var0) {
      int var1;
      for(var1 = 0; 3 > var1; ++var1) {
         nn_._j[var1] = 0;
      }

      int var10002;
      for(var1 = 0; var1 < ud_._x; ++var1) {
         if (var0._n == nb_._a[var1]._n) {
            var10002 = nn_._j[nb_._a[var1].b410((byte)115)]++;
         }
      }

      var10002 = nn_._j[var0.b410((byte)107)]++;
      var1 = 0;

      for(int var2 = 0; var2 < ud_._x; ++var2) {
         if (nb_._a[var2]._n == var0._n) {
            int var3 = nb_._a[var2].b410((byte)104);
            if (nn_._j[var3] > co_._H) {
               var10002 = nn_._j[var3]--;
               continue;
            }
         }

         nb_._a[var1++] = nb_._a[var2];
      }

      ud_._x = var1;
      nb_._a[ud_._x++] = var0;
   }

   public static void a487() {
      _a = null;
      _b = null;
      _d = null;
      _c = null;
   }
}
