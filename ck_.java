import java.util.Hashtable;

class ck_ extends lm_ {
   private boolean _C;
   boolean _B;
   static cn_ _G;
   static fm_ _H;
   static String _D = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
   boolean _E;
   private boolean _F;

   final StringBuilder a481(int var1, Hashtable var2, StringBuilder var3, byte var4) {
      if (this.a597(var2, var1, 108, var3)) {
         this.a801(var1, var3, var2, 1);
         if (this._E) {
            var3.append(" active");
         }

         if (!this._B) {
            var3.append(" disabled");
         }
      }

      if (var4 > -76) {
         e423((byte)58);
      }

      return var3;
   }

   ck_(String var1, ca_ var2, pg_ var3) {
      super(var1, var2, var3);
      this._C = true;
      this._B = true;
      this._F = false;
   }

   static final void h150() {
      jb_.k423();
   }

   final void e150(int var1) {
      if (this._F) {
         this._F = false;
         if (null != super._n && super._n instanceof io_) {
            ((io_)super._n).a002(this._F, 124, this);
         }
      }

      if (var1 <= 1) {
         a018((String)null, 62, (String)null);
      }

   }

   boolean a336(int var1, lm_ var2) {
      if (var1 != 34) {
         this._E = true;
      }

      if (this._B && this._C) {
         var2.e150(53);
         this._F = true;
         if (super._n != null && super._n instanceof io_) {
            ((io_)super._n).a002(this._F, -71, this);
         }

         return true;
      } else {
         return false;
      }
   }

   boolean a946(lm_ var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      if (this._B && this.a046(var5, var4, var7, -1, var3)) {
         this.a336(34, var1);
         super._y = var2;
         if (super._n != null && super._n instanceof si_) {
            ((si_)super._n).a394(var3, this, var4, -100, var2, var7, var5);
         }

         return true;
      } else {
         return false;
      }
   }

   void a319(int var1, int var2, lm_ var3, boolean var4) {
      super.a319(var1, var2, var3, var4);
      if (super._y != 0 && la_._g != super._y) {
         if (this.a046(hj_._S, var1, var2, -1, eh_._h) && 0 == la_._g) {
            this.b115(-var2 + eh_._h, super._y, 1, -var1 + hj_._S);
         }

         this.a277(var2, true, eh_._h, var3, var1, hj_._S);
      }

   }

   ck_(String var1, pg_ var2) {
      this(var1, hl_._a._o, var2);
   }

   boolean a401(lm_ var1, char var2, int var3, byte var4) {
      if (!this.a427((byte)93) || var3 != 84 && var3 != 83) {
         if (var4 <= 55) {
            this.b115(56, -107, -73, -111);
         }

         return false;
      } else {
         this.b115(-1, 1, 1, -1);
         return true;
      }
   }

   static final void e423(byte var0) {
      re_.b797();
      jk_._Bb = new int[260];
      lh_._t = 11;
      if (var0 == 65) {
         int var1;
         for(var1 = 0; var1 < 256; ++var1) {
            double var2 = 15.0;
            jk_._Bb[var1] = (int)(Math.pow((double)((float)var1 / 256.0F), var2) * 255.0);
         }

         for(var1 = 256; var1 < jk_._Bb.length; ++var1) {
            jk_._Bb[var1] = 255;
         }

      }
   }

   final void a277(int var1, boolean var2, int var3, lm_ var4, int var5, int var6) {
      if (super._n != null && super._n instanceof si_) {
         ((si_)super._n).a368((byte)42, var3, var1, var5, this, var6);
      }

      if (var2) {
         super._y = 0;
      }
   }

   final boolean a427(byte var1) {
      if (var1 <= 6) {
         this.a427((byte)-101);
      }

      return this._F;
   }

   static final void a018(String var0, int var1, String var2) {
      if (var1 != 11) {
         _D = (String)null;
      }

      lp_.a178(var0, false, var2);
   }

   public static void b487(boolean var0) {
      _D = null;
      if (!var0) {
         g154(50);
      }

      _G = null;
      _H = null;
   }

   void b115(int var1, int var2, int var3, int var4) {
      if (var3 != 1) {
         this._C = false;
      }

      if (super._n != null && super._n instanceof vg_) {
         ((vg_)super._n).a475(this, (byte)98, var2, var1, var4);
      }

   }

   static final boolean g154(int var0) {
      if (var0 != -1) {
         return true;
      } else {
         return nk_._Ib != null || td_._c;
      }
   }

   protected ck_() {
      this._C = true;
      this._B = true;
      this._F = false;
      super._o = hl_._a._d;
   }
}
