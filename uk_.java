import java.awt.Canvas;
import java.util.Random;
import java.util.zip.Inflater;

final class uk_ {
   private Inflater _d;
   static int _c = 2;
   static String _b = "You must gain the <%0> Achievement in <%1> to earn the title of <%2>.";
   static cn_ _e;
   static int _a;

   static final wm_ a651(int var0, Random var1) {
      bo_._Jb = new wm_(ib_._l);
      wl_._e = new int[ib_._l];
      h_._j = 0;

      int var2;
      for(var2 = 0; var2 < ib_._l; ++var2) {
         if (14 != var2 && var2 != 15 && 26 != var2 && var2 != 27 && var2 != 58 && var2 != 60 && 65 != var2 && var2 != 67 && var2 != 20 && var2 != 21 && var2 != 59 && var2 != 66) {
            wl_._e[h_._j++] = var2;
         }
      }

      ue_._j = new int[ib_._k];

      for(var2 = var0; ib_._k > var2; ue_._j[var2] = var2++) {
      }

      while(h_._j > 0) {
         fo_.a093(gd_.a518(var1));
      }

      var2 = uj_.a004(var1, var0 ^ 37, 4);
      int var3 = uj_.a004(var1, 37, 3);
      if (var3 == var2) {
         var3 = 3;
      }

      if (0 == var2 || 0 == var3) {
         bo_._Jb.a093(20, -111);
      }

      if (1 == var2 || 1 == var3) {
         bo_._Jb.a093(21, -90);
      }

      if (var2 == 2 || 2 == var3) {
         bo_._Jb.a093(59, -86);
      }

      if (3 == var2 || var3 == 3) {
         bo_._Jb.a093(66, -70);
      }

      int[] var4 = ec_.h111(24, 5);

      int var5;
      int var6;
      int var8;
      for(var5 = 0; var5 < 4; ++var5) {
         var6 = 0 != var5 ? (1 == var5 ? ib_._j - 1 : (2 != var5 ? ib_._k - 1 : ib_._k - ib_._j)) : 0;
         int[] var7 = ec_.h111(var6, var0 ^ 5);
         var8 = 0;
         int var9 = -1;

         for(int var10 = 1; ib_._l > var10; ++var10) {
            if (var10 != 20 && var10 != 21 && 59 != var10 && 66 != var10 && 10 <= qc_.a890(var10, var7)) {
               int var11 = sh_.a890(var0 + 123, var10, var7);
               if (-1 == var9 || var8 < var11) {
                  var8 = var11;
                  var9 = var10;
               }
            }
         }

         if (var9 != -1) {
            bo_._Jb.a093(var9, -126);
         }
      }

      while(true) {
         var5 = 4;
         var6 = -1;

         for(int var12 = 0; var12 < ib_._l; ++var12) {
            if (var12 != 20 && 21 != var12 && var12 != 59 && var12 != 66 && 8 <= qc_.a890(var12, var4)) {
               var8 = sh_.a890(120, var12, var4);
               if (var5 < var8) {
                  var6 = var12;
                  var5 = var8;
               }
            }
         }

         if (var6 == -1) {
            return bo_._Jb;
         }

         bo_._Jb.a093(var6, -88);
         var4 = ec_.h111(24, 5);
      }
   }

   public uk_() {
      this(-1, 1000000, 1000000);
   }

   static final void a762(Canvas var0) {
      lj_.a249(var0);
      im_.a249(var0);
      if (bn_._j != null) {
         bn_._j.a649((byte)123, var0);
      }

   }

   public static void a150() {
      _b = null;
      _e = null;
   }

   final void a730(int var1, byte[] var2, ec_ var3) {
      if (31 == var3._m[var3._o] && -117 == var3._m[1 + var3._o]) {
         if (null == this._d) {
            this._d = new Inflater(true);
         }

         try {
            this._d.setInput(var3._m, 10 + var3._o, var3._m.length - 10 + (-var3._o - 8));
            this._d.inflate(var2);
         } catch (Exception var5) {
            this._d.reset();
            throw new RuntimeException("");
         }

         if (var1 >= -80) {
            _e = (cn_)null;
         }

         this._d.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   private uk_(int var1, int var2, int var3) {
   }
}
