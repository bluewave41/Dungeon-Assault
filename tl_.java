import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

final class tl_ implements Runnable {
   private URL _h;
   private int _a;
   static nh_ _k;
   private pn_ _g;
   static cn_ _i;
   static String[] _e = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   static String _c = "You must have charged <%0> Orb of Mastery in total to earn the title of <%1>.";
   private DataInputStream _o;
   private ec_ _j;
   private pn_ _b;
   static String[] _m = new String[]{"Modifiers", "Some things are capable of changing the skill levels of your raider, or a dungeon room. If any of these effects are present on a raider or room, a symbol will be displayed in the corner of its portrait. A <col=00FF00>green</col> symbol means a skill level has <col=00FF00>increased</col>; a <col=FF0000>red</col> symbol indicates a skill level has <col=FF0000>decreased</col>. There are also other symbols you will encounter.<br><br><%command>Continue moving your party towards the hoard room.</col>"};
   private qg_ _f;
   private pn_ _n;
   static boolean _l = true;
   static boolean _d;

   static final char a771(char var0) {
      if (' ' != var0 && 160 != var0 && '_' != var0 && var0 != '-') {
         if (var0 != '[' && ']' != var0 && '#' != var0) {
            if (var0 != 224 && 225 != var0 && 226 != var0 && var0 != 228 && 227 != var0 && 192 != var0 && 193 != var0 && var0 != 194 && 196 != var0 && 195 != var0) {
               if (var0 != 232 && var0 != 233 && var0 != 234 && var0 != 235 && 200 != var0 && 201 != var0 && 202 != var0 && var0 != 203) {
                  if (237 != var0 && var0 != 238 && var0 != 239 && var0 != 205 && 206 != var0 && 207 != var0) {
                     if (var0 != 242 && var0 != 243 && var0 != 244 && 246 != var0 && 245 != var0 && 210 != var0 && var0 != 211 && 212 != var0 && var0 != 214 && var0 != 213) {
                        if (249 != var0 && 250 != var0 && 251 != var0 && 252 != var0 && var0 != 217 && 218 != var0 && 219 != var0 && var0 != 220) {
                           if (231 != var0 && 199 != var0) {
                              if (255 != var0 && 376 != var0) {
                                 if (241 != var0 && var0 != 209) {
                                    return 223 == var0 ? 'b' : Character.toLowerCase(var0);
                                 } else {
                                    return 'n';
                                 }
                              } else {
                                 return 'y';
                              }
                           } else {
                              return 'c';
                           }
                        } else {
                           return 'u';
                        }
                     } else {
                        return 'o';
                     }
                  } else {
                     return 'i';
                  }
               } else {
                  return 'e';
               }
            } else {
               return 'a';
            }
         } else {
            return var0;
         }
      } else {
         return '_';
      }
   }

   final ec_ c735(int var1) {
      return this._a == var1 ? this._j : null;
   }

   public static void a423() {
      _k = null;
      _c = null;
      _e = null;
      _i = null;
      _m = null;
   }

   protected final void finalize() {
      if (null != this._g) {
         if (this._g._f != null) {
            try {
               ((DataInputStream)this._g._f).close();
            } catch (Exception var4) {
            }
         }

         this._g = null;
      }

      if (null != this._n) {
         if (null != this._n._f) {
            try {
               ((Socket)this._n._f).close();
            } catch (Exception var3) {
            }
         }

         this._n = null;
      }

      if (null != this._o) {
         try {
            this._o.close();
         } catch (Exception var2) {
         }

         this._o = null;
      }

      this._b = null;
   }

   static final void a150(int var0) {
      if (sp_._c != null) {
         sp_._c.c150(-6624);
         sp_._c = null;
      }

   }

   public final void run() {
      while(true) {
         try {
            if (this._j._m.length > this._j._o) {
               int var1 = this._o.read(this._j._m, this._j._o, -this._j._o + this._j._m.length);
               if (0 <= var1) {
                  ec_ var10000 = this._j;
                  var10000._o += var1;
                  continue;
               }
            }

            if (this._j._m.length == this._j._o) {
               throw new Exception("HG1: " + this._j._m.length + " " + this._h);
            }

            synchronized(this) {
               this.finalize();
               this._a = 3;
            }
         } catch (Exception var6) {
            synchronized(this) {
               this.finalize();
               ++this._a;
            }
         }

         return;
      }
   }

   final synchronized boolean d154(int var1) {
      if (this._a < 2) {
         if (0 == this._a) {
            if (null == this._g) {
               this._g = this._f.a734(-18, this._h);
            }

            if (this._g._c == 0) {
               return false;
            }

            if (this._g._c != 1) {
               this._g = null;
               ++this._a;
               return false;
            }
         }

         if (1 == this._a) {
            if (null == this._n) {
               this._n = this._f.a288(-114, 443, this._h.getHost());
            }

            if (this._n._c == 0) {
               return false;
            }

            if (this._n._c != 1) {
               this._n = null;
               ++this._a;
               return false;
            }
         }

         if (null == this._o) {
            try {
               if (this._a == 0) {
                  this._o = (DataInputStream)this._g._f;
               }

               if (1 == this._a) {
                  Socket var2 = (Socket)this._n._f;
                  var2.setSoTimeout(10000);
                  OutputStream var3 = var2.getOutputStream();
                  var3.write(17);
                  var3.write(n_.a381("JAGGRAB " + this._h.getFile() + "\n\n"));
                  this._o = new DataInputStream(var2.getInputStream());
               }

               this._j._o = 0;
            } catch (IOException var4) {
               this.finalize();
               ++this._a;
            }
         }

         if (this._b == null) {
            this._b = this._f.a508(-21432, 5, this);
         }

         if (0 != this._b._c) {
            if (1 != this._b._c) {
               this.finalize();
               ++this._a;
            }

            if (var1 <= 13) {
               this.finalize();
            }

            return false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   tl_(qg_ var1, URL var2, int var3) {
      this._h = var2;
      this._f = var1;
      this._j = new ec_(var3);
   }

   static final String b738(int var0) {
      if (~dk_._c > var0) {
         return to_._g;
      } else if (ia_._U != null) {
         return ia_._U.a154(-14354) ? ki_._c : ec_._r;
      } else if (!fi_._u.a154(-14354)) {
         return qk_._c;
      } else if (!fi_._u.a213(false, "commonui")) {
         return sa_._w + " - " + fi_._u.b913("commonui", -1) + "%";
      } else if (!kg_._b.a154(var0 ^ 14355)) {
         return rf_._L;
      } else if (!kg_._b.a213(false, "commonui")) {
         return mp_._c + " - " + kg_._b.b913("commonui", var0 ^ 2) + "%";
      } else if (!ib_._b.a154(var0 - 14351)) {
         return fg_._m;
      } else {
         return ib_._b.a427((byte)59) ? p_._K : kj_._m + " - " + ib_._b.b137(100) + "%";
      }
   }
}
