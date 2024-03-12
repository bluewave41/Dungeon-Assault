import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

final class kf_ extends c_ implements ImageProducer, ImageObserver {
   private ColorModel _l;
   static eh_ _j;
   static pn_ _m;
   static cn_ _k;
   static String _q = "Hell Beast";
   static String _i = "Sorceress";
   static qg_ _o;
   static nh_ _p;
   private ImageConsumer _n;

   public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }

   static final int a313(int var0, int var1, int var2) {
      return var2 > -75 ? -59 : 30;
   }

   public static void b487() {
      _q = null;
      _k = null;
      _j = null;
      _i = null;
      _o = null;
      _p = null;
      _m = null;
   }

   public final void requestTopDownLeftRightResend(ImageConsumer var1) {
   }

   public final void startProduction(ImageConsumer var1) {
      this.addConsumer(var1);
   }

   public final synchronized void addConsumer(ImageConsumer var1) {
      this._n = var1;
      var1.setDimensions(super._b, super._f);
      var1.setProperties((Hashtable)null);
      var1.setColorModel(this._l);
      var1.setHints(14);
   }

   public final synchronized boolean isConsumer(ImageConsumer var1) {
      return var1 == this._n;
   }

   private final synchronized void b150(int var1) {
      if (this._n != null) {
         this._n.setPixels(var1, 0, super._b, super._f, this._l, super._g, 0, super._b);
         this._n.imageComplete(2);
      }
   }

   public final synchronized void removeConsumer(ImageConsumer var1) {
      if (var1 == this._n) {
         this._n = null;
      }

   }

   final void a433(int var1, boolean var2, Graphics var3, int var4) {
      this.b150(0);
      var3.drawImage(super._a, var1, var4, this);
      if (!var2) {
         this.a433(-93, true, (Graphics)null, -124);
      }

   }

   final void a345(byte var1, Component var2, int var3, int var4) {
      super._b = var4;
      super._f = var3;
      super._g = new int[var4 * var3 + 1];
      this._l = new DirectColorModel(32, 16711680, 65280, 255);
      super._a = var2.createImage(this);
      this.b150(0);
      var2.prepareImage(super._a, this);
      this.b150(0);
      var2.prepareImage(super._a, this);
      this.b150(0);
      var2.prepareImage(super._a, this);
      this.a487(true);
   }
}
