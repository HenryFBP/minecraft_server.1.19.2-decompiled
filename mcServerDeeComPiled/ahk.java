import com.google.common.base.CharMatcher;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.slf4j.Logger;

public class ahk extends ahi {
   private static final Logger b = LogUtils.getLogger();
   private static final boolean e = ad.j() == ad.b.c;
   private static final CharMatcher f = CharMatcher.is('\\');

   public ahk(File $$0) {
      super($$0);
   }

   public static boolean a(File $$0, String $$1) throws IOException {
      String $$2 = $$0.getCanonicalPath();
      if (e) {
         $$2 = f.replaceFrom($$2, '/');
      }

      return $$2.endsWith($$1);
   }

   @Override
   protected InputStream a(String $$0) throws IOException {
      File $$1 = this.e($$0);
      if ($$1 == null) {
         throw new ahn(this.a, $$0);
      } else {
         return new FileInputStream($$1);
      }
   }

   @Override
   protected boolean c(String $$0) {
      return this.e($$0) != null;
   }

   @Nullable
   private File e(String $$0) {
      try {
         File $$1 = new File(this.a, $$0);
         if ($$1.isFile() && a($$1, $$0)) {
            return $$1;
         }
      } catch (IOException var3) {
      }

      return null;
   }

   @Override
   public Set<String> a(ahm $$0) {
      Set<String> $$1 = Sets.newHashSet();
      File $$2 = new File(this.a, $$0.a());
      File[] $$3 = $$2.listFiles(DirectoryFileFilter.DIRECTORY);
      if ($$3 != null) {
         for(File $$4 : $$3) {
            String $$5 = a($$2, $$4);
            if ($$5.equals($$5.toLowerCase(Locale.ROOT))) {
               $$1.add($$5.substring(0, $$5.length() - 1));
            } else {
               this.d($$5);
            }
         }
      }

      return $$1;
   }

   @Override
   public void close() {
   }

   @Override
   public Collection<abb> a(ahm $$0, String $$1, String $$2, Predicate<abb> $$3) {
      File $$4 = new File(this.a, $$0.a());
      List<abb> $$5 = Lists.newArrayList();
      this.a(new File(new File($$4, $$1), $$2), $$1, $$5, $$2 + "/", $$3);
      return $$5;
   }

   private void a(File $$0, String $$1, List<abb> $$2, String $$3, Predicate<abb> $$4) {
      File[] $$5 = $$0.listFiles();
      if ($$5 != null) {
         for(File $$6 : $$5) {
            if ($$6.isDirectory()) {
               this.a($$6, $$1, $$2, $$3 + $$6.getName() + "/", $$4);
            } else if (!$$6.getName().endsWith(".mcmeta")) {
               try {
                  String $$7 = $$3 + $$6.getName();
                  abb $$8 = abb.a($$1, $$7);
                  if ($$8 == null) {
                     b.warn("Invalid path in datapack: {}:{}, ignoring", $$1, $$7);
                  } else if ($$4.test($$8)) {
                     $$2.add($$8);
                  }
               } catch (aa var13) {
                  b.error(var13.getMessage());
               }
            }
         }
      }

   }
}
