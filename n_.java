final class n_ {
   static q_ _e;
   static cn_ _b;
   static int[] _f = new int[4];
   static se_ _c;
   static int _d;
   static String _a = "<%0> <img=0><img=0><img=0>";
   static int[] _g;

   static final boolean a427() {
      return qc_._t;
   }

   public static void a150() {
      _b = null;
      _e = null;
      _c = null;
      _f = null;
      _a = null;
      _g = null;
   }

   static final byte[] a381(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var1 > var3; ++var3) {
         char var4 = var0.charAt(var3);
         if ((0 >= var4 || var4 >= 128) && (var4 < 160 || var4 > 255)) {
            if (var4 == 8364) {
               var2[var3] = -128;
            } else if (var4 == 8218) {
               var2[var3] = -126;
            } else if (var4 != 402) {
               if (8222 == var4) {
                  var2[var3] = -124;
               } else if (var4 != 8230) {
                  if (var4 == 8224) {
                     var2[var3] = -122;
                  } else if (8225 == var4) {
                     var2[var3] = -121;
                  } else if (710 != var4) {
                     if (8240 != var4) {
                        if (352 != var4) {
                           if (8249 != var4) {
                              if (338 != var4) {
                                 if (381 != var4) {
                                    if (var4 == 8216) {
                                       var2[var3] = -111;
                                    } else if (8217 != var4) {
                                       if (var4 == 8220) {
                                          var2[var3] = -109;
                                       } else if (var4 != 8221) {
                                          if (8226 == var4) {
                                             var2[var3] = -107;
                                          } else if (var4 != 8211) {
                                             if (var4 == 8212) {
                                                var2[var3] = -105;
                                             } else if (732 == var4) {
                                                var2[var3] = -104;
                                             } else if (var4 != 8482) {
                                                if (var4 == 353) {
                                                   var2[var3] = -102;
                                                } else if (8250 != var4) {
                                                   if (339 == var4) {
                                                      var2[var3] = -100;
                                                   } else if (382 != var4) {
                                                      if (var4 == 376) {
                                                         var2[var3] = -97;
                                                      } else {
                                                         var2[var3] = 63;
                                                      }
                                                   } else {
                                                      var2[var3] = -98;
                                                   }
                                                } else {
                                                   var2[var3] = -101;
                                                }
                                             } else {
                                                var2[var3] = -103;
                                             }
                                          } else {
                                             var2[var3] = -106;
                                          }
                                       } else {
                                          var2[var3] = -108;
                                       }
                                    } else {
                                       var2[var3] = -110;
                                    }
                                 } else {
                                    var2[var3] = -114;
                                 }
                              } else {
                                 var2[var3] = -116;
                              }
                           } else {
                              var2[var3] = -117;
                           }
                        } else {
                           var2[var3] = -118;
                        }
                     } else {
                        var2[var3] = -119;
                     }
                  } else {
                     var2[var3] = -120;
                  }
               } else {
                  var2[var3] = -123;
               }
            } else {
               var2[var3] = -125;
            }
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }
}
