import java.awt.Frame;

final class ga_ extends ip_ {
   static cn_[] _o;
   static int _p = 250;
   private be_ _q;
   private String _m = "";
   static int _n = 1;
   static cn_ _r;
   private boolean _s = false;

   public static void d423() {
      _r = null;
      _o = null;
   }

   final String a439(byte var1, String var2) {
      if (this._q.a212(var2, 65) != pd_._J) {
         if (this.a212(var2, 60) == pd_._J) {
            return pj_._n;
         } else {
            if (var1 < 44) {
               this.a439((byte)49, (String)null);
            }

            return sh_._b;
         }
      } else {
         return this._q.a439((byte)96, var2);
      }
   }

   final od_ a212(String var1, int var2) {
      if (this._q.a212(var1, 104) == pd_._J) {
         return pd_._J;
      } else {
         if (!var1.equals(this._m)) {
            me_ var4 = gk_.a149(var1);
            if (!var4.b154(36)) {
               return oc_._A;
            }

            this._m = var1;
            this._s = var4.a427((byte)109);
         }

         return !this._s ? pd_._J : c_._d;
      }
   }

   static final Frame a503(qg_ var0, int var1, int var2, int var3, int var4) {
      if (!var0.a154(50)) {
         return null;
      } else {
         if (var2 == 0) {
            ki_[] var5 = kc_.a899(var0, 10);
            if (null == var5) {
               return null;
            }

            boolean var6 = false;

            for(int var7 = 0; var5.length > var7; ++var7) {
               if (var1 == var5[var7]._g && var5[var7]._d == var4 && (var3 == 0 || var5[var7]._a == var3) && (!var6 || var5[var7]._b > var2)) {
                  var2 = var5[var7]._b;
                  var6 = true;
               }
            }

            if (!var6) {
               return null;
            }
         }

         pn_ var8 = var0.a240((byte)-102, var3, var1, var2, var4);

         while(0 == var8._c) {
            pj_.a054(0, 10L);
         }

         Frame var9 = (Frame)var8._f;
         if (var9 == null) {
            return null;
         } else if (2 == var8._c) {
            ng_.a139(var0, var9);
            return null;
         } else {
            return var9;
         }
      }
   }

   ga_(rm_ var1, rm_ var2) {
      super(var1);
      this._q = new be_(var1, var2);
   }
}
