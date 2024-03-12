final class tg_ {
   private static int[] _i = new int[]{20, 4, 3, 7, 21, 13, 14, 8, 15, 12};
   static int[] _j = new int[14];
   static int[][] _f = new int[14][];
   static String _a = "Traversing this room without breaking any glass or mirrors will take a skilful and agile raider.<br><br>When triggered, the <%detect> of all monsters in this dungeon is increased by 2.";
   static int[] _d = new int[14];
   static int _g = 0;
   int _c;
   static String[] _e = new String[]{null, "Rooms you have just placed are <%highlight>surrounded by a blue glow to show they are not yet fixed</col>. You can <col=FF0000>right-click</col> on a newly placed room to remove it, restoring the tile it replaced."};
   int _m;
   static int[] _b = new int[14];
   int[] _k;
   static se_ _l;
   static int[] _h = new int[14];
   static String _n = "Orb of War";

   public static void a150(int var0) {
      _e = null;
      _l = null;
      _n = null;
      _b = null;
      _f = (int[][])null;
      _h = null;
      if (var0 == 400) {
         _d = null;
         _j = null;
         _a = null;
         _i = null;
      }
   }

   final int a410(byte var1) {
      if (var1 != -90) {
         return 15;
      } else {
         return null != this._k && this._k.length != 0 ? this._k[this._k.length - 1] : 0;
      }
   }

   static final String a955(char var0, String var1, String var2) {
      int var3 = var1.length();
      int var4 = var2.length();
      int var5 = var3;
      int var6 = var4 - 1;
      if (var6 != 0) {
         int var7 = 0;

         while(true) {
            var7 = var1.indexOf(var0, var7);
            if (0 > var7) {
               break;
            }

            var5 += var6;
            ++var7;
         }
      }

      StringBuilder var10 = new StringBuilder(var5);
      int var8 = 0;

      while(true) {
         int var9 = var1.indexOf(var0, var8);
         if (var9 < 0) {
            var10.append(var1.substring(var8));
            return var10.toString();
         }

         var10.append(var1.substring(var8, var9));
         var8 = var9 + 1;
         var10.append(var2);
      }
   }

   final int a543(byte var1, int var2) {
      if (this._k != null && 0 != this._k.length) {
         for(int var3 = 1; this._k.length > var3; ++var3) {
            if (var2 < this._k[var3] + this._k[var3 - 1] >> 1) {
               return var3 - 1;
            }
         }

         if (var1 > -77) {
            a150(-90);
         }

         return this._k.length - 1;
      } else {
         return 0;
      }
   }

   tg_(int var1, int var2, int var3) {
      this._c = var2;
      this._k = new int[var3 + 1];
      this._m = var1;
   }

   static {
      pi_.a861(_i, 180, 0, 33, 460, 88);
      pi_.a861(new int[]{2, 13, 14, 28, 7, 11}, 180, 1, 33, 460, 88);
      pi_.a861(new int[]{5, 6, 3, 9}, 82, 3, 33, 336, 88);
      pi_.a861(new int[]{10}, 180, 6, 33, 460, 410);
      pi_.a861(new int[]{16, 10}, 200, 8, 33, 440, 392);
      pi_.a861(new int[]{10}, 200, 9, 33, 440, 392);
      pi_.a861(new int[]{16, 17}, 180, 10, 33, 460, 400);
      pi_.a861(new int[]{9}, 290, 11, 33, 460, 400);
      pi_.a861(new int[0], 180, 12, 33, 460, 88);
   }
}
