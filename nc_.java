import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class nc_ {
   private static String _c;
   private static boolean _b = false;
   private static int _d;
   private static String _e;
   private static Hashtable _a = new Hashtable(16);

   public static void a871(int var0, String var1) {
      _e = var1;
      _d = var0;

      try {
         _c = System.getProperty("user.home");
         if (null != _c) {
            _c = _c + "/";
         }
      } catch (Exception var3) {
      }

      if (null == _c) {
         _c = "~/";
      }

      _b = true;
   }

   public static File a384(String var0, int var1, String var2) {
      if (!_b) {
         throw new RuntimeException("");
      } else {
         File var3 = (File)_a.get(var0);
         if (null != var3) {
            return var3;
         } else {
            String[] var4 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", _c, "/tmp/", ""};
            String[] var5 = new String[]{".jagex_cache_" + var1, ".file_store_" + var1};

            for(int var6 = 0; var6 < 2; ++var6) {
               for(int var7 = 0; var5.length > var7; ++var7) {
                  for(int var8 = 0; var4.length > var8; ++var8) {
                     String var9 = var4[var8] + var5[var7] + "/" + (var2 == null ? "" : var2 + "/") + var0;
                     RandomAccessFile var10 = null;

                     try {
                        File var11 = new File(var9);
                        if (var6 != 0 || var11.exists()) {
                           String var12 = var4[var8];
                           if (1 != var6 || var12.length() <= 0 || (new File(var12)).exists()) {
                              (new File(var4[var8] + var5[var7])).mkdir();
                              if (var2 != null) {
                                 (new File(var4[var8] + var5[var7] + "/" + var2)).mkdir();
                              }

                              var10 = new RandomAccessFile(var11, "rw");
                              int var13 = var10.read();
                              var10.seek(0L);
                              var10.write(var13);
                              var10.seek(0L);
                              var10.close();
                              _a.put(var0, var11);
                              return var11;
                           }
                        }
                     } catch (Exception var15) {
                        try {
                           if (null != var10) {
                              var10.close();
                              var10 = null;
                           }
                        } catch (Exception var14) {
                        }
                     }
                  }
               }
            }

            throw new RuntimeException();
         }
      }
   }

   public static File a885(String var0) {
      return a384(var0, _d, _e);
   }

   private nc_() throws Throwable {
      throw new Error();
   }
}
