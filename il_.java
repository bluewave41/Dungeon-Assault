import java.lang.reflect.InvocationTargetException;

final class il_ {
   static int[] _d = new int[]{15, 15, 16};
   static String _b = "Most dungeon rooms contain rats scavenging for food. The rats in this room are much, much larger and do more than scavenge.";
   static bn_ _c = null;
   static int _a;
   private Object _e;

   final cn_ a316(int var1) {
      if (!(this._e instanceof cn_)) {
         try {
            if (var1 != 16) {
               this._e = (Object)null;
            }

            return (cn_)hd_._e.invoke(this._e, (Object[])null);
         } catch (IllegalAccessException var3) {
         } catch (InvocationTargetException var4) {
         }

         return null;
      } else {
         return (cn_)this._e;
      }
   }

   static final boolean a778(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (pp_.a331(var0)) {
         return true;
      } else {
         char[] var1 = wk_._f;

         int var2;
         char var3;
         for(var2 = 0; var1.length > var2; ++var2) {
            var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         var1 = ul_._c;

         for(var2 = 0; var1.length > var2; ++var2) {
            var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         return false;
      }
   }

   il_(cn_ var1) {
      this._e = var1;
      if (hd_._h != null) {
         ql_._e[0] = var1;

         try {
            this._e = hd_._h.newInstance(ql_._e);
         } catch (IllegalAccessException var3) {
         } catch (InvocationTargetException var4) {
         } catch (InstantiationException var5) {
         }
      }

   }

   public static void a423() {
      _d = null;
      _b = null;
      _c = null;
   }
}
