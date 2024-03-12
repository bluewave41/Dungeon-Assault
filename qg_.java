import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class qg_ implements Runnable {
   private boolean _w = false;
   static String _p;
   private static String _r;
   private static volatile long _a = 0L;
   private static String _k;
   private Object _b;
   private pn_ _u = null;
   static String _c;
   static String _n;
   private ma_ _m;
   qp_[] _v;
   private Thread _f;
   private static String _i;
   private on_ _l;
   boolean _j = false;
   private static int _t;
   qp_ _h = null;
   static Method _g;
   EventQueue _e;
   private Object _s;
   qp_ _q = null;
   qp_ _x = null;
   private boolean _d = false;
   private pn_ _o = null;

   private static final qp_ a237(String var0, String var1, int var2, int var3) {
      String var4;
      if (var3 != 33) {
         if (var3 != 34) {
            var4 = "jagex_" + var1 + "_preferences" + var0 + ".dat";
         } else {
            var4 = "jagex_" + var1 + "_preferences" + var0 + "_wip.dat";
         }
      } else {
         var4 = "jagex_" + var1 + "_preferences" + var0 + "_rc.dat";
      }

      String[] var5 = new String[]{"c:/rscache/", "/rscache/", _r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
      int var6 = 0;
      if (var2 != -35) {
         a237((String)null, (String)null, -3, -52);
      }

      for(; var6 < var5.length; ++var6) {
         String var7 = var5[var6];
         if (0 >= var7.length() || (new File(var7)).exists()) {
            try {
               qp_ var8 = new qp_(new File(var7, var4), "rw", 10000L);
               return var8;
            } catch (Exception var9) {
            }
         }
      }

      return null;
   }

   public final void run() {
      while(true) {
         pn_ var1;
         synchronized(this) {
            while(true) {
               if (this._w) {
                  return;
               }

               if (this._o != null) {
                  var1 = this._o;
                  this._o = this._o._a;
                  if (this._o == null) {
                     this._u = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         try {
            int var2 = var1._e;
            if (1 == var2) {
               if (kd_.c138(-2456) < _a) {
                  throw new IOException();
               }

               var1._f = new Socket(InetAddress.getByName((String)var1._d), var1._g);
            } else if (var2 != 22) {
               if (2 == var2) {
                  Thread var24 = new Thread((Runnable)var1._d);
                  var24.setDaemon(true);
                  var24.start();
                  var24.setPriority(var1._g);
                  var1._f = var24;
               } else if (4 == var2) {
                  if (_a > kd_.c138(-2456)) {
                     throw new IOException();
                  }

                  var1._f = new DataInputStream(((URL)var1._d).openStream());
               } else {
                  Object[] var3;
                  if (var2 == 8) {
                     var3 = (Object[])((Object[])var1._d);
                     if (this._j && ((Class)var3[0]).getClassLoader() == null) {
                        throw new SecurityException();
                     }

                     var1._f = ((Class)var3[0]).getDeclaredMethod((String)var3[1], (Class[])((Class[])var3[2]));
                  } else if (9 != var2) {
                     if (18 == var2) {
                        Clipboard var23 = Toolkit.getDefaultToolkit().getSystemClipboard();
                        var1._f = var23.getContents((Object)null);
                     } else if (var2 != 19) {
                        if (!this._j) {
                           throw new Exception("");
                        }

                        String var16;
                        if (var2 == 3) {
                           if (kd_.c138(-2456) < _a) {
                              throw new IOException();
                           }

                           var16 = (255 & var1._g >> 24) + "." + (255 & var1._g >> 16) + "." + (255 & var1._g >> 8) + "." + (255 & var1._g);
                           var1._f = InetAddress.getByName(var16).getHostName();
                        } else if (21 == var2) {
                           if (kd_.c138(-2456) < _a) {
                              throw new IOException();
                           }

                           var1._f = InetAddress.getByName((String)var1._d).getAddress();
                        } else if (5 != var2) {
                           if (6 == var2) {
                              Frame var22 = new Frame("Jagex Full Screen");
                              var1._f = var22;
                              var22.setResizable(false);
                              if (!this._d) {
                                 eo_.class.getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this._b, var22, new Integer(var1._g >>> 16), new Integer('\uffff' & var1._g), new Integer(var1._b >> 16), new Integer(var1._b & '\uffff'));
                              } else {
                                 this._m.a121((byte)6, var22, var1._g >>> 16, var1._g & '\uffff', var1._b >> 16, '\uffff' & var1._b);
                              }
                           } else if (7 != var2) {
                              qp_ var15;
                              if (var2 == 12) {
                                 var15 = a237((String)var1._d, _k, -35, _t);
                                 var1._f = var15;
                              } else if (var2 != 13) {
                                 if (this._j && 14 == var2) {
                                    int var20 = var1._g;
                                    int var21 = var1._b;
                                    if (this._d) {
                                       this._l.a773(var20, true, var21);
                                    } else {
                                       w_.class.getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this._s, new Integer(var20), new Integer(var21));
                                    }
                                 } else if (this._j && 15 == var2) {
                                    boolean var18 = var1._g != 0;
                                    Component var19 = (Component)var1._d;
                                    if (!this._d) {
                                       w_.class.getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this._s, var19, new Boolean(var18));
                                    } else {
                                       this._l.a834(-14677, var19, var18);
                                    }
                                 } else if (!this._d && var2 == 17) {
                                    var3 = (Object[])((Object[])var1._d);
                                    w_.class.getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this._s, var3[0], var3[1], new Integer(var1._g), new Integer(var1._b), var3[2]);
                                 } else {
                                    if (16 != var2) {
                                       throw new Exception("");
                                    }

                                    try {
                                       if (!_n.startsWith("win")) {
                                          throw new Exception();
                                       }

                                       var16 = (String)var1._d;
                                       if (!var16.startsWith("http://") && !var16.startsWith("https://")) {
                                          throw new Exception();
                                       }

                                       String var17 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                                       for(int var5 = 0; var16.length() > var5; ++var5) {
                                          if (var17.indexOf(var16.charAt(var5)) == -1) {
                                             throw new Exception();
                                          }
                                       }

                                       Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var16 + "\"");
                                       var1._f = null;
                                    } catch (Exception var10) {
                                       var1._f = var10;
                                       throw var10;
                                    }
                                 }
                              } else {
                                 var15 = a237((String)var1._d, "", -35, _t);
                                 var1._f = var15;
                              }
                           } else if (!this._d) {
                              eo_.class.getMethod("exit").invoke(this._b);
                           } else {
                              this._m.a266(42, (Frame)var1._d);
                           }
                        } else if (!this._d) {
                           var1._f = eo_.class.getMethod("listmodes").invoke(this._b);
                        } else {
                           var1._f = this._m.a878(10127);
                        }
                     } else {
                        Transferable var14 = (Transferable)var1._d;
                        Clipboard var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
                        var4.setContents(var14, (ClipboardOwner)null);
                     }
                  } else {
                     var3 = (Object[])((Object[])var1._d);
                     if (this._j && null == ((Class)var3[0]).getClassLoader()) {
                        throw new SecurityException();
                     }

                     var1._f = ((Class)var3[0]).getDeclaredField((String)var3[1]);
                  }
               }
            } else {
               if (_a > kd_.c138(-2456)) {
                  throw new IOException();
               }

               try {
                  var1._f = bp_.a243(var1._g, (String)var1._d).b693(13905);
               } catch (wl_ var8) {
                  var1._f = var8.getMessage();
                  throw var8;
               }
            }

            var1._c = 1;
         } catch (ThreadDeath var11) {
            throw var11;
         } catch (Throwable var12) {
            var1._c = 2;
         }

         synchronized(var1) {
            var1.notify();
         }
      }
   }

   final pn_ a734(int var1, URL var2) {
      return var1 != -18 ? (pn_)null : this.a626(0, var2, 6, 4, 0);
   }

   final boolean a154(int var1) {
      if (!this._j) {
         return false;
      } else {
         if (var1 < 25) {
            this.a200((Frame)null, (byte)-13);
         }

         if (!this._d) {
            return this._b != null;
         } else {
            return this._m != null;
         }
      }
   }

   private final pn_ a626(int var1, Object var2, int var3, int var4, int var5) {
      if (var3 != 6) {
         this.a288(91, 66, (String)null);
      }

      pn_ var6 = new pn_();
      var6._d = var2;
      var6._g = var1;
      var6._e = var4;
      var6._b = var5;
      synchronized(this) {
         if (null != this._u) {
            this._u._a = var6;
            this._u = var6;
         } else {
            this._u = this._o = var6;
         }

         this.notify();
         return var6;
      }
   }

   final pn_ a288(int var1, int var2, String var3) {
      return var1 >= -68 ? (pn_)null : this.a570(false, var3, var2, 1);
   }

   final void a423(byte var1) {
      synchronized(this) {
         this._w = true;
         this.notifyAll();
      }

      try {
         this._f.join();
      } catch (InterruptedException var8) {
      }

      if (this._x != null) {
         try {
            this._x.a150(var1 ^ -119);
         } catch (IOException var7) {
         }
      }

      if (var1 != -119) {
         _i = (String)null;
      }

      if (this._q != null) {
         try {
            this._q.a150(0);
         } catch (IOException var6) {
         }
      }

      if (null != this._v) {
         for(int var2 = 0; var2 < this._v.length; ++var2) {
            if (null != this._v[var2]) {
               try {
                  this._v[var2].a150(0);
               } catch (IOException var5) {
               }
            }
         }
      }

      if (null != this._h) {
         try {
            this._h.a150(var1 ^ -119);
         } catch (IOException var4) {
         }
      }

   }

   final pn_ a508(int var1, int var2, Runnable var3) {
      return var1 != -21432 ? (pn_)null : this.a626(var2, var3, 6, 2, 0);
   }

   final pn_ a240(byte var1, int var2, int var3, int var4, int var5) {
      if (var1 >= -10) {
         this.a508(-77, -50, (Runnable)null);
      }

      return this.a626((var3 << 16) + var5, (Object)null, 6, 6, var2 + (var4 << 16));
   }

   final pn_ a238(Component var1, byte var2, boolean var3) {
      if (var2 < 13) {
         this._v = (qp_[])null;
      }

      return this.a626(!var3 ? 0 : 1, var1, 6, 15, 0);
   }

   final pn_ a534(int var1, Class var2, String var3) {
      if (var1 != 65535) {
         this.a626(21, (Object)null, -63, 47, 126);
      }

      return this.a626(0, new Object[]{var2, var3}, 6, 9, 0);
   }

   final pn_ a256(boolean var1) {
      if (var1) {
         _a = 9L;
      }

      return this.a626(0, (Object)null, 6, 5, 0);
   }

   final pn_ a200(Frame var1, byte var2) {
      if (var2 > -36) {
         _c = (String)null;
      }

      return this.a626(0, var1, 6, 7, 0);
   }

   final pn_ a594(Class[] var1, Class var2, int var3, String var4) {
      return var3 != -1 ? (pn_)null : this.a626(0, new Object[]{var2, var4, var1}, 6, 8, 0);
   }

   private final pn_ a570(boolean var1, String var2, int var3, int var4) {
      if (var4 != 1) {
         this._m = (ma_)null;
      }

      return this.a626(var3, var2, 6, var1 ? 22 : 1, 0);
   }

   qg_(int var1, String var2, int var3, boolean var4) throws Exception {
      this._j = var4;
      _c = "Unknown";
      _k = var2;
      _t = var1;
      _p = "1.1";

      try {
         _c = System.getProperty("java.vendor");
         _p = System.getProperty("java.version");
      } catch (Exception var16) {
      }

      if (-1 != _c.toLowerCase().indexOf("microsoft")) {
         this._d = true;
      }

      try {
         _i = System.getProperty("os.name");
      } catch (Exception var15) {
         _i = "Unknown";
      }

      _n = _i.toLowerCase();

      try {
         System.getProperty("os.arch").toLowerCase();
      } catch (Exception var14) {
      }

      try {
         System.getProperty("os.version").toLowerCase();
      } catch (Exception var13) {
      }

      try {
         _r = System.getProperty("user.home");
         if (null != _r) {
            _r = _r + "/";
         }
      } catch (Exception var12) {
      }

      if (_r == null) {
         _r = "~/";
      }

      try {
         this._e = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var11) {
      }

      if (!this._d) {
         try {
            Component.class.getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
         } catch (Exception var10) {
         }

         try {
            _g = Container.class.getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
         } catch (Exception var9) {
         }
      }

      nc_.a871(_t, _k);
      if (this._j) {
         this._h = new qp_(nc_.a384("random.dat", _t, (String)null), "rw", 25L);
         this._x = new qp_(nc_.a885("main_file_cache.dat2"), "rw", 314572800L);
         this._q = new qp_(nc_.a885("main_file_cache.idx255"), "rw", 1048576L);
         this._v = new qp_[var3];

         for(int var5 = 0; var3 > var5; ++var5) {
            this._v[var5] = new qp_(nc_.a885("main_file_cache.idx" + var5), "rw", 1048576L);
         }

         if (this._d) {
            try {
               pl_.class.newInstance();
            } catch (Throwable var8) {
            }
         }

         try {
            if (this._d) {
               this._m = new ma_();
            } else {
               this._b = eo_.class.newInstance();
            }
         } catch (Throwable var7) {
         }

         try {
            if (this._d) {
               this._l = new on_();
            } else {
               this._s = w_.class.newInstance();
            }
         } catch (Throwable var6) {
         }
      }

      this._w = false;
      this._f = new Thread(this);
      this._f.setPriority(10);
      this._f.setDaemon(true);
      this._f.start();
   }
}
