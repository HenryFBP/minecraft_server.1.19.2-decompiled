import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class cyo implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<cyn> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   cyo(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private cyn b(cge $$0) throws IOException {
      long $$1 = cge.c($$0.h(), $$0.i());
      cyn $$2 = (cyn)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((cyn)this.c.removeLast()).close();
         }

         Files.createDirectories(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         cyn $$4 = new cyn($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public pj a(cge $$0) throws IOException {
      cyn $$1 = this.b($$0);
      DataInputStream $$2 = $$1.a($$0);

      pj var8;
      label43: {
         try {
            if ($$2 == null) {
               var8 = null;
               break label43;
            }

            var8 = pt.a($$2);
         } catch (Throwable var7) {
            if ($$2 != null) {
               try {
                  $$2.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if ($$2 != null) {
            $$2.close();
         }

         return var8;
      }

      if ($$2 != null) {
         $$2.close();
      }

      return var8;
   }

   public void a(cge $$0, pz $$1) throws IOException {
      cyn $$2 = this.b($$0);
      DataInputStream $$3 = $$2.a($$0);

      try {
         if ($$3 != null) {
            pt.a($$3, $$1);
         }
      } catch (Throwable var8) {
         if ($$3 != null) {
            try {
               $$3.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if ($$3 != null) {
         $$3.close();
      }

   }

   protected void a(cge $$0, @Nullable pj $$1) throws IOException {
      cyn $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         DataOutputStream $$3 = $$2.c($$0);

         try {
            pt.a($$1, $$3);
         } catch (Throwable var8) {
            if ($$3 != null) {
               try {
                  $$3.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if ($$3 != null) {
            $$3.close();
         }
      }

   }

   public void close() throws IOException {
      alp<IOException> $$0 = new alp();
      ObjectIterator var2 = this.c.values().iterator();

      while(var2.hasNext()) {
         cyn $$1 = (cyn)var2.next();

         try {
            $$1.close();
         } catch (IOException var5) {
            $$0.a(var5);
         }
      }

      $$0.a();
   }

   public void a() throws IOException {
      ObjectIterator var1 = this.c.values().iterator();

      while(var1.hasNext()) {
         cyn $$0 = (cyn)var1.next();
         $$0.a();
      }

   }
}
