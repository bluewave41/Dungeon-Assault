final class ic_ extends mc_ {
   static String _A = "Empty Room";
   static String _z = "The pillar in the centre of this room is covered in mouths that will shrill and screech if they sense any raiders.<br><br>When triggered, the <%detect> of all monsters in this dungeon is increased by 3.";
   static pp_ _y;

   static final void a540(boolean var0) {
      byte var1;
      if (0 >= pb_._G) {
         if (!ed_.c491(true)) {
            var1 = 1;
         } else {
            var1 = 0;
         }
      } else {
         if (null == il_._c) {
            cm_._R = gh_.a470(0, 0, 480, i_._A, 640);
         } else {
            cm_._R = il_._c.d487(92);
            gk_.a366(2, (byte)4);
         }

         if (cm_._R != null) {
            uk_.a762(cm_._R);
            var1 = 2;
         } else {
            var1 = 3;
         }
      }

      if (il_._c == null && wo_._c) {
         ae_.a183(var0, var1, -1);
      }

   }

   ic_(int var1) {
      this(lp_._C, var1);
   }

   public static void d150() {
      _A = null;
      _z = null;
      _y = null;
   }

   static final void a871(int var0, int var1, String var2) {
      if (var1 == 27029) {
         ac_ var3 = gh_._i[var0];
         if (null != var3) {
            var3._d = tp_.a267(kf_._p, "idle", var2, var1 ^ -28249);
         }
      }
   }

   final String b424(lm_ var1, int var2) {
      if (var2 != -444136767) {
         _A = (String)null;
      }

      return cc_.a928('*', var1._w.length());
   }

   private ic_(se_ var1, int var2) {
      super(var1, var2);
   }
}
