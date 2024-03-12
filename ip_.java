abstract class ip_ extends m_ implements jo_ {
   static String _j;
   static int[] _l = new int[8192];
   static String _i = "To Customer Support";
   private rm_ _h;
   static String _k = "<col=DB0100><%0></col> attempted, <col=DB0100><%1></col> successful";

   abstract od_ a212(String var1, int var2);

   static final ab_ a524(int var0, String var1) {
      int var2 = var1.length();
      if (var2 == 0) {
         return ri_._e;
      } else if (var2 > 63) {
         return ta_._d;
      } else {
         for(int var3 = var0; var2 > var3; ++var3) {
            char var4 = var1.charAt(var3);
            if ('-' != var4) {
               if (qj_._b.indexOf(var4) == -1) {
                  return np_._E;
               }
            } else if (var3 == 0 || var3 == var2 - 1) {
               return np_._E;
            }
         }

         return null;
      }
   }

   public static void c423() {
      _i = null;
      _l = null;
      _j = null;
      _k = null;
   }

   public final void a157(rm_ var1, byte var2) {
      if (var2 >= -117) {
         _j = (String)null;
      }

   }

   public final boolean a154(int var1) {
      return null == this._h._w || 0 == this._h._w.length();
   }

   abstract String a439(byte var1, String var2);

   final od_ b527(boolean var1) {
      if (var1) {
         this.b527(true);
      }

      return this.a212(this._h._w, -92);
   }

   final String c738(int var1) {
      if (var1 != 63) {
         _j = (String)null;
      }

      return this.a439((byte)48, this._h._w);
   }

   ip_(rm_ var1) {
      this._h = var1;
   }

   public final void a430(rm_ var1, int var2) {
      this.b150(2899);
      if (var2 != 10000536) {
         _i = (String)null;
      }

   }
}
