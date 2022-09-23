import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drm {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, drb> b = Maps.newHashMap();
   private final DataFixer c;
   private final File d;

   public drm(File $$0, DataFixer $$1) {
      this.c = $$1;
      this.d = $$0;
   }

   private File a(String $$0) {
      return new File(this.d, $$0 + ".dat");
   }

   public <T extends drb> T a(Function<pj, T> $$0, Supplier<T> $$1, String $$2) {
      T $$3 = this.a($$0, $$2);
      if ($$3 != null) {
         return $$3;
      } else {
         T $$4 = (T)$$1.get();
         this.a($$2, $$4);
         return $$4;
      }
   }

   @Nullable
   public <T extends drb> T a(Function<pj, T> $$0, String $$1) {
      drb $$2 = (drb)this.b.get($$1);
      if ($$2 == null && !this.b.containsKey($$1)) {
         $$2 = this.b($$0, $$1);
         this.b.put($$1, $$2);
      }

      return (T)$$2;
   }

   @Nullable
   private <T extends drb> T b(Function<pj, T> $$0, String $$1) {
      try {
         File $$2 = this.a($$1);
         if ($$2.exists()) {
            pj $$3 = this.a($$1, ab.b().getWorldVersion());
            return (T)$$0.apply($$3.p("data"));
         }
      } catch (Exception var5) {
         a.error("Error loading saved data: {}", $$1, var5);
      }

      return null;
   }

   public void a(String $$0, drb $$1) {
      this.b.put($$0, $$1);
   }

   public pj a(String $$0, int $$1) throws IOException {
      File $$2 = this.a($$0);
      FileInputStream $$3 = new FileInputStream($$2);

      pj var8;
      try {
         PushbackInputStream $$4 = new PushbackInputStream($$3, 2);

         try {
            pj $$5;
            if (this.a($$4)) {
               $$5 = pt.a($$4);
            } else {
               DataInputStream $$6 = new DataInputStream($$4);

               try {
                  $$5 = pt.a($$6);
               } catch (Throwable var13) {
                  try {
                     $$6.close();
                  } catch (Throwable var12) {
                     var13.addSuppressed(var12);
                  }

                  throw var13;
               }

               $$6.close();
            }

            int $$9 = $$5.b("DataVersion", 99) ? $$5.h("DataVersion") : 1343;
            var8 = pv.a(this.c, ani.h, $$5, $$9, $$1);
         } catch (Throwable var14) {
            try {
               $$4.close();
            } catch (Throwable var11) {
               var14.addSuppressed(var11);
            }

            throw var14;
         }

         $$4.close();
      } catch (Throwable var15) {
         try {
            $$3.close();
         } catch (Throwable var10) {
            var15.addSuppressed(var10);
         }

         throw var15;
      }

      $$3.close();
      return var8;
   }

   private boolean a(PushbackInputStream $$0) throws IOException {
      byte[] $$1 = new byte[2];
      boolean $$2 = false;
      int $$3 = $$0.read($$1, 0, 2);
      if ($$3 == 2) {
         int $$4 = ($$1[1] & 255) << 8 | $$1[0] & 255;
         if ($$4 == 35615) {
            $$2 = true;
         }
      }

      if ($$3 != 0) {
         $$0.unread($$1, 0, $$3);
      }

      return $$2;
   }

   public void a() {
      this.b.forEach(($$0, $$1) -> {
         if ($$1 != null) {
            $$1.a(this.a($$0));
         }

      });
   }
}
