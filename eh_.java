final class eh_ {
   int _g;
   il_[] _l;
   int _m;
   int[] _k;
   int[] _j;
   String _b;
   static String[] _e = new String[]{"Guardians", "<%highlight>This is a guardian room</col> - similar to <%traps>, a <%guardian> may be triggered by a raider entering the room. Unlike traps, they will never injure raiders or prevent progress through the dungeon. Instead, a triggered <%guardian> <%highlight>alerts all monsters in the dungeon</col>, making it harder to get the first attack against them."};
   nh_ _d;
   static String _a = "Gold stolen: ";
   private md_ _n;
   int _f;
   String _i;
   static ed_ _o;
   static int _h = 0;
   int _c;

   static final boolean b154() {
      return il_._c != null && il_._c.b154(-108);
   }

   static final boolean a213(String var0) {
      return nn_._k.equals(jm_.a715((byte)59, var0));
   }

   final void a423(byte var1) {
      this._n = null;
      if (var1 != -19) {
         a213((String)null);
      }

      this._l = null;
   }

   public static void a150() {
      _e = null;
      _a = null;
      _o = null;
   }

   private final cn_ a574(byte var1, int var2) {
      if (this._l == null) {
         this._l = new il_[this._c];
      }

      cn_ var3;
      if (null != this._l[var2]) {
         var3 = this._l[var2].a316(16);
         if (var3 != null) {
            return var3;
         }
      }

      for(int var5 = 0; var5 < this._c; ++var5) {
         if (this._k[var5] == this._k[var2] && null != this._l[var5]) {
            cn_ var4 = this._l[var5].a316(16);
            if (null != var4) {
               this._l[var2] = this._l[var5];
               return var4;
            }
         }
      }

      var3 = ia_.a059(this._b, this._m, this._i, 2316, this._g, Integer.toString(this._k[var2]), this._d);
      this._l[var2] = new il_(var3);
      return var3;
   }

   final cn_ a571(int var1, int var2, int var3, int var4) {
      if (var1 == this._g && this._m == var3) {
         return this.a574((byte)-94, var2);
      } else if (var4 != 0) {
         return (cn_)null;
      } else {
         if (this._n == null) {
            this._n = new md_();
         }

         fl_ var5;
         for(var5 = (fl_)this._n.e024(var4 ^ -24172); var5 != null && (var5._q != var1 || var3 != var5._p); var5 = (fl_)this._n.a024(var4 ^ 4)) {
         }

         if (var5 == null) {
            var5 = new fl_(var1, var3, this._c);
            this._n.a865(var5, false);
         }

         cn_ var6 = null;
         if (var5._k[var2] != null) {
            var6 = var5._k[var2].a316(var4 ^ 16);
         }

         if (var6 == null) {
            var6 = lc_.a608(this.a574((byte)-105, var2), var1, var3);
            var5._k[var2] = new il_(var6);
         }

         return var6;
      }
   }
}
