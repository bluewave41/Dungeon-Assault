final class mb_ extends qb_ {
   private md_ _o = new md_();
   private md_ _n = new md_();
   private int _m = 0;
   private int _p = -1;

   private final void c397(int[] var1, int var2, int var3) {
      for(qb_ var4 = (qb_)this._o.e024(-24172); var4 != null; var4 = (qb_)this._o.a024(4)) {
         var4.a397(var1, var2, var3);
      }

   }

   private final void e797() {
      if (this._m > 0) {
         for(kb_ var1 = (kb_)this._n.e024(-24172); var1 != null; var1 = (kb_)this._n.a024(4)) {
            var1._i -= this._m;
         }

         this._p -= this._m;
         this._m = 0;
      }

   }

   private final void a989(ne_ var1, kb_ var2) {
      while(var1 != this._n._c && ((kb_)var1)._i <= var2._i) {
         var1 = var1._e;
      }

      so_.a985((byte)89, var1, var2);
      this._p = ((kb_)this._n._c._e)._i;
   }

   final int a784() {
      return 0;
   }

   final qb_ c207() {
      return (qb_)this._o.a024(4);
   }

   final synchronized void a150(int var1) {
      do {
         if (this._p < 0) {
            this.d150(var1);
            return;
         }

         if (this._m + var1 < this._p) {
            this._m += var1;
            this.d150(var1);
            return;
         }

         int var2 = this._p - this._m;
         this.d150(var2);
         var1 -= var2;
         this._m += var2;
         this.e797();
         kb_ var3 = (kb_)this._n.e024(-24172);
         synchronized(var3) {
            int var5 = var3.a598(this);
            if (var5 < 0) {
               var3._i = 0;
               this.a627(var3);
            } else {
               var3._i = var5;
               this.a989(var3._e, var3);
            }
         }
      } while(var1 != 0);

   }

   final synchronized void a501(qb_ var1) {
      var1.a487(false);
   }

   final synchronized void b501(qb_ var1) {
      this._o.b865(var1, false);
   }

   private final void a627(kb_ var1) {
      var1.a487(false);
      var1.a797();
      ne_ var2 = this._n._c._e;
      if (var2 == this._n._c) {
         this._p = -1;
      } else {
         this._p = ((kb_)var2)._i;
      }

   }

   final synchronized void b397(int[] var1, int var2, int var3) {
      do {
         if (this._p < 0) {
            this.c397(var1, var2, var3);
            return;
         }

         if (this._m + var3 < this._p) {
            this._m += var3;
            this.c397(var1, var2, var3);
            return;
         }

         int var4 = this._p - this._m;
         this.c397(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this._m += var4;
         this.e797();
         kb_ var5 = (kb_)this._n.e024(-24172);
         synchronized(var5) {
            int var7 = var5.a598(this);
            if (var7 < 0) {
               var5._i = 0;
               this.a627(var5);
            } else {
               var5._i = var7;
               this.a989(var5._e, var5);
            }
         }
      } while(var3 != 0);

   }

   private final void d150(int var1) {
      for(qb_ var2 = (qb_)this._o.e024(-24172); var2 != null; var2 = (qb_)this._o.a024(4)) {
         var2.a150(var1);
      }

   }

   final qb_ d207() {
      return (qb_)this._o.e024(-24172);
   }

   public mb_() {
   }
}
