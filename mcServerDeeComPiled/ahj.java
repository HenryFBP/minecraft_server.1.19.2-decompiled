import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ahj extends ahi {
   private static final Logger e = LogUtils.getLogger();
   public static final Splitter b = Splitter.on('/').omitEmptyStrings().limit(3);
   @Nullable
   private ZipFile f;

   public ahj(File $$0) {
      super($$0);
   }

   private ZipFile b() throws IOException {
      if (this.f == null) {
         this.f = new ZipFile(this.a);
      }

      return this.f;
   }

   @Override
   protected InputStream a(String $$0) throws IOException {
      ZipFile $$1 = this.b();
      ZipEntry $$2 = $$1.getEntry($$0);
      if ($$2 == null) {
         throw new ahn(this.a, $$0);
      } else {
         return $$1.getInputStream($$2);
      }
   }

   @Override
   public boolean c(String $$0) {
      try {
         return this.b().getEntry($$0) != null;
      } catch (IOException var3) {
         return false;
      }
   }

   @Override
   public Set<String> a(ahm $$0) {
      ZipFile $$1;
      try {
         $$1 = this.b();
      } catch (IOException var9) {
         return Collections.emptySet();
      }

      Enumeration<? extends ZipEntry> $$4 = $$1.entries();
      Set<String> $$5 = Sets.newHashSet();

      while($$4.hasMoreElements()) {
         ZipEntry $$6 = (ZipEntry)$$4.nextElement();
         String $$7 = $$6.getName();
         if ($$7.startsWith($$0.a() + "/")) {
            List<String> $$8 = Lists.newArrayList(b.split($$7));
            if ($$8.size() > 1) {
               String $$9 = (String)$$8.get(1);
               if ($$9.equals($$9.toLowerCase(Locale.ROOT))) {
                  $$5.add($$9);
               } else {
                  this.d($$9);
               }
            }
         }
      }

      return $$5;
   }

   protected void finalize() throws Throwable {
      this.close();
      super.finalize();
   }

   @Override
   public void close() {
      if (this.f != null) {
         IOUtils.closeQuietly(this.f);
         this.f = null;
      }

   }

   @Override
   public Collection<abb> a(ahm $$0, String $$1, String $$2, Predicate<abb> $$3) {
      ZipFile $$4;
      try {
         $$4 = this.b();
      } catch (IOException var14) {
         return Collections.emptySet();
      }

      Enumeration<? extends ZipEntry> $$7 = $$4.entries();
      List<abb> $$8 = Lists.newArrayList();
      String $$9 = $$0.a() + "/" + $$1 + "/";
      String $$10 = $$9 + $$2 + "/";

      while($$7.hasMoreElements()) {
         ZipEntry $$11 = (ZipEntry)$$7.nextElement();
         if (!$$11.isDirectory()) {
            String $$12 = $$11.getName();
            if (!$$12.endsWith(".mcmeta") && $$12.startsWith($$10)) {
               String $$13 = $$12.substring($$9.length());
               abb $$14 = abb.a($$1, $$13);
               if ($$14 == null) {
                  e.warn("Invalid path in datapack: {}:{}, ignoring", $$1, $$13);
               } else if ($$3.test($$14)) {
                  $$8.add($$14);
               }
            }
         }
      }

      return $$8;
   }
}
