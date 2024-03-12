import java.applet.Applet;

abstract class m_ implements dp_ {
   static md_ _a = new md_();
   private long _b;
   static String _f = "Unfortunately we are unable to create an account for you at this time.";
   static ad_ _d = new ad_(4, 1, 1, 1);
   static en_ _e;
   static String _g = "OK";
   static cn_ _c;

   public final String a791(boolean var1) {
      if (!this.a154(96)) {
         if (!var1) {
            this._b = 122L;
         }

         return 350L + this._b <= kd_.c138(-2456) ? this.c738(63) : null;
      } else {
         return null;
      }
   }

   static final void a430(int var0, boolean var1) {
      bl_._c = 0;
      if (var0 < 82) {
         _d = (ad_)null;
      }

      me_._f = 0;
      wf_._x = am_._g;
      jc_._e = 0;
      o_._i = new ae_(2);
      o_._i.a691(false, var1, -1, f_.a313(hj_._S, eh_._h, 1));
   }

   public final od_ a151(byte var1) {
      if (this.a154(-51)) {
         return hd_._g;
      } else if (350L + this._b <= kd_.c138(-2456)) {
         if (var1 > -91) {
            c372(false);
         }

         return this.b527(false);
      } else {
         return ub_._s;
      }
   }

   public static void d150(int var0) {
      _a = null;
      if (var0 != -1) {
         _a = (md_)null;
      }

      _g = null;
      _d = null;
      _f = null;
      _c = null;
      _e = null;
   }

   public final void b150(int var1) {
      this._b = kd_.c138(-2456);
      if (var1 != 2899) {
         d150(6);
      }

   }

   static final void b423() {
      if (224 > oo_._d) {
         int var0 = oo_._d % 32;
         sf_.d093(-var0 + 32 + oo_._d);
      } else {
         sf_.d093(256);
      }

   }

   abstract String c738(int var1);

   static final Applet c372(boolean var0) {
      if (!var0) {
         return (Applet)null;
      } else {
         return (Applet)(null != rc_._b ? rc_._b : ba_._c);
      }
   }

   abstract od_ b527(boolean var1);
}
