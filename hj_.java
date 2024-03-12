final class hj_ extends gd_ {
   static String _Q;
   static String _U = "Create your own free Jagex account";
   static String[] _O = new String[]{"Victory", "<%highlight>Your raider has sucessfully overcome <%lastroom></col>. After a room has been defeated, it will <%highlight>remain safe for the rest of the raid</col>. You can now move onwards, and change your party leader if you wish.<br><br><%command>Click on an accessible room (surrounded by an orange glow) to move on.</col>"};
   static int[] _W;
   static nh_ _Z;
   private pj_ _R;
   static cn_ _T;
   hb_ _V;
   static int _S = 0;
   boolean _Y;
   static String _X = "CONTINUE";
   static String _ab = "Tempted by the promise of gold from the cities and wars of the humans in the west, the mercenary knight is a master swordsman, but lacks the patience to deal with traps.";
   static String[] _P = new String[]{"Glamour", "With the powers of illusion at her command, the <%0> is able to enchant a raider, causing them to glow brilliantly; any monster the raider encounters in the next room will be blinded and fight at a severe disadvantage. (Single use)"};

   final void b326(int var1, int var2, int var3) {
      if (super._F) {
         int var4 = var1 + super._t;
         int var5 = super._i + var3;
         if (this._R.b121(0, this._V)) {
            this.a075(var4, var5, super._z, (byte)105);
         }

         if (this._R._u == this._V && (6 & this._V._o) == 0) {
            this.a075(var4, var5, super._H, (byte)112);
         }

         if (wi_._ob == this && this._Y) {
            this.a075(var4, var5, super._I, (byte)-12);
         }

         if (var2 != 8187) {
            this.a075(-8, 106, (cn_)null, (byte)40);
         }

         int[] var6 = new int[4];
         gf_.a331(var6);
         gf_.e115(var4 + 5, 5 + var5, 40 + var4 - 5, 40 + var5 - 5);
         if (k_._c == this._V._b._n) {
            this._V._b.a697(40, var5, (byte)102, var4, 40);
         } else {
            this._V._b.a697(60, var5, (byte)102, var4 - 10, 60);
         }

         gf_.b331(var6);
         if (this._V._i != null) {
            qe_.a296(var4 + 38, 40 + var5 - 2, 2, this._V._i, this._V._i.length);
         }

      }
   }

   final void a599(int var1, int var2, byte var3) {
      if (super._F) {
         int var4 = super._t + var1;
         int var5 = var2 + super._i;
         if (0 == (4 & this._V._o)) {
            if (0 != (2 & this._V._o)) {
               gf_.b669(var4 + 5, 5 + var5, super._q - 10, super._x - 10, 16776960, 64);
            }
         } else {
            gf_.b669(var4 + 5, var5 + 5, super._q - 10, super._x - 10, 16711680, 64);
         }

         gf_.e050(var4, var5, 40, 40, 0);
         gf_.e050(4 + var4, 4 + var5, 32, 32, 0);
         rp_.a857(6, 32, (byte)108, 4 + var4, 32, kc_._S, 4 + var5);
      }
   }

   static final cn_[] a936(int var0, int var1, int var2, int var3) {
      return ba_.a089(var0, 3, var2, var3, 1, 1, var1, 1);
   }

   public static void f150() {
      _ab = null;
      _Z = null;
      _U = null;
      _W = null;
      _O = null;
      _X = null;
      _T = null;
      _P = null;
      _Q = null;
   }

   static final void g150() {
      fe_._k = new md_();
   }

   hj_(pj_ var1, hb_ var2, int var3, int var4) {
      super(var3, var4, 40, 40, 0);
      this._V = var2;
      this._R = var1;
      byte var5 = 20;
      int var6 = 2 * var5 + 40;
      int var7 = 40 + var5 * 2;
      jh_.c797();
      super._I = this.a028(var6, var5, 16777088, 3, var7);
      super._z = this.a028(var6, var5, 8421631, 3, var7);
      super._H = this.a028(var6, var5, 16744448, 3, var7);
      jh_.b797();
      this._Y = true;
      super._n = new fc_(this._R, this._V);
   }

   static final int a185(int var0, int var1, int var2) {
      int var3 = 16711935 & var2;
      var2 &= 65280;
      int var4 = var0 & 16711935;
      var0 &= 65280;
      var4 *= var1;
      var2 *= -var1 + 256;
      var3 *= -var1 + 256;
      var0 *= var1;
      var3 &= -16711936;
      var4 &= -16711936;
      var2 &= 16711680;
      var0 &= 16711680;
      return (var0 + var2 | var3 + var4) >>> 8;
   }

   private final cn_ a028(int var1, int var2, int var3, int var4, int var5) {
      cn_ var6 = new cn_(var1, var5);
      var6._w = -var2;
      var6._A = -var2;
      int var7 = var3 & 16711935;
      jh_.a303(var6);
      int var8 = var3 & '\uff00';

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var1 > var10; ++var10) {
            float var11 = -((float)Math.sqrt((double)((float)((var9 - (var5 >> 1)) * (var9 - (var5 >> 1)) + (-(var1 >> 1) + var10) * (var10 - (var1 >> 1))) / (float)(var1 * var1 / 4)))) + 1.0F;
            int var12 = (int)(512.0F * var11);
            if (var12 >= 0) {
               if (256 < var12) {
                  var12 = 256;
               }

               var3 = (var8 * var12 & 16711680 | -16711936 & var7 * var12) >>> 8;
               var6._B[var1 * var9 + var10] = var3;
            }
         }
      }

      jh_.b797();
      if (var4 != 3) {
         this.a075(38, 87, (cn_)null, (byte)84);
      }

      return var6;
   }

   private final void a075(int var1, int var2, cn_ var3, byte var4) {
      boolean var5 = false;
      int var8 = -(var3._v >> 1);
      int var14 = 0;
      int var15 = var3._y;
      int var16 = 0;
      if (0 > var3._A + var2) {
         var16 -= var2 + var3._A;
      }

      int var17 = var3._v;
      if (var3._w + var1 + var3._y > 640) {
         var15 = 640 - var1 - var3._w;
      }

      if (480 < var2 + var3._A + var3._v) {
         var17 = -var2 + 480 - var3._A;
      }

      if (0 > var1 + var3._w) {
         var14 -= var1 + var3._w;
      }

      var15 = -var15 + var14;

      for(int var19 = var16; var19 < var17; ++var19) {
         int var6 = var3._w + var1 + var14 + 640 * (var2 - (-var19 - var3._A));
         int var7 = var14 - (var3._y >> 1);
         int var21 = var19 * var3._y + var14;

         for(int var20 = var15; 0 > var20; ++var20) {
            int var11 = 11 * u_.a650(var7, var8) >> 6;
            int var9 = (int)(128.0 * (1.0 + te_.c503(mo_._a + var3.hashCode(), var11, 0.0078125)));
            if (var9 > 0) {
               int var10 = var3._B[var21];
               int var12;
               if (var9 < 256) {
                  var12 = var9 * (16711935 & var10);
                  var10 = (var12 & -16711936) + (-var12 + var10 * var9 & 16711680) >>> 8;
               }

               var12 = gf_._b[var6];
               int var13 = var10 + var12;
               var10 = (16711935 & var10) + (var12 & 16711935);
               var12 = (16777472 & var10) + (65536 & -var10 + var13);
               gf_._b[var6] = mp_.a080(var13 - var12, var12 - (var12 >>> 8));
            }

            ++var7;
            ++var21;
            ++var6;
         }

         ++var8;
      }

   }
}
