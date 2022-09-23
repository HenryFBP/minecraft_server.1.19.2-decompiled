import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;

public class awv implements awy {
   private static final Logger a = LogUtils.getLogger();
   private static final axa b = new axa() {
      @Override
      public long a() {
         return 0L;
      }

      @Override
      public long b() {
         return 0L;
      }

      @Override
      public long c() {
         return 0L;
      }

      @Override
      public Object2LongMap<String> d() {
         return Object2LongMaps.emptyMap();
      }
   };
   private static final Splitter c = Splitter.on('\u001e');
   private static final Comparator<Entry<String, awv.a>> e = Entry.comparingByValue(Comparator.comparingLong($$0 -> $$0.b)).reversed();
   private final Map<String, ? extends axa> f;
   private final long g;
   private final int h;
   private final long i;
   private final int j;
   private final int k;

   public awv(Map<String, ? extends axa> $$0, long $$1, int $$2, long $$3, int $$4) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$4 - $$2;
   }

   private axa c(String $$0) {
      axa $$1 = (axa)this.f.get($$0);
      return $$1 != null ? $$1 : b;
   }

   @Override
   public List<axb> a(String $$0) {
      String $$1 = $$0;
      axa $$2 = this.c("root");
      long $$3 = $$2.a();
      axa $$4 = this.c($$0);
      long $$5 = $$4.a();
      long $$6 = $$4.c();
      List<axb> $$7 = Lists.newArrayList();
      if (!$$0.isEmpty()) {
         $$0 = $$0 + "\u001e";
      }

      long $$8 = 0L;

      for(String $$9 : this.f.keySet()) {
         if (a($$0, $$9)) {
            $$8 += this.c($$9).a();
         }
      }

      float $$10 = (float)$$8;
      if ($$8 < $$5) {
         $$8 = $$5;
      }

      if ($$3 < $$8) {
         $$3 = $$8;
      }

      for(String $$11 : this.f.keySet()) {
         if (a($$0, $$11)) {
            axa $$12 = this.c($$11);
            long $$13 = $$12.a();
            double $$14 = (double)$$13 * 100.0 / (double)$$8;
            double $$15 = (double)$$13 * 100.0 / (double)$$3;
            String $$16 = $$11.substring($$0.length());
            $$7.add(new axb($$16, $$14, $$15, $$12.c()));
         }
      }

      if ((float)$$8 > $$10) {
         $$7.add(new axb("unspecified", (double)((float)$$8 - $$10) * 100.0 / (double)$$8, (double)((float)$$8 - $$10) * 100.0 / (double)$$3, $$6));
      }

      Collections.sort($$7);
      $$7.add(0, new axb($$1, 100.0, (double)$$8 * 100.0 / (double)$$3, $$6));
      return $$7;
   }

   private static boolean a(String $$0, String $$1) {
      return $$1.length() > $$0.length() && $$1.startsWith($$0) && $$1.indexOf(30, $$0.length() + 1) < 0;
   }

   private Map<String, awv.a> h() {
      Map<String, awv.a> $$0 = Maps.newTreeMap();
      this.f.forEach(($$1, $$2) -> {
         Object2LongMap<String> $$3 = $$2.d();
         if (!$$3.isEmpty()) {
            List<String> $$4 = c.splitToList($$1);
            $$3.forEach(($$2x, $$3x) -> ((awv.a)$$0.computeIfAbsent($$2x, $$0xxx -> new awv.a())).a($$4.iterator(), $$3x));
         }

      });
      return $$0;
   }

   @Override
   public long a() {
      return this.g;
   }

   @Override
   public int b() {
      return this.h;
   }

   @Override
   public long c() {
      return this.i;
   }

   @Override
   public int d() {
      return this.j;
   }

   @Override
   public boolean a(Path $$0) {
      Writer $$1 = null;

      boolean var4;
      try {
         Files.createDirectories($$0.getParent());
         $$1 = Files.newBufferedWriter($$0, StandardCharsets.UTF_8);
         $$1.write(this.a(this.g(), this.f()));
         return true;
      } catch (Throwable var8) {
         a.error("Could not save profiler results to {}", $$0, var8);
         var4 = false;
      } finally {
         IOUtils.closeQuietly($$1);
      }

      return var4;
   }

   protected String a(long $$0, int $$1) {
      StringBuilder $$2 = new StringBuilder();
      $$2.append("---- Minecraft Profiler Results ----\n");
      $$2.append("// ");
      $$2.append(i());
      $$2.append("\n\n");
      $$2.append("Version: ").append(ab.b().getId()).append('\n');
      $$2.append("Time span: ").append($$0 / 1000000L).append(" ms\n");
      $$2.append("Tick span: ").append($$1).append(" ticks\n");
      $$2.append("// This is approximately ")
         .append(String.format(Locale.ROOT, "%.2f", (float)$$1 / ((float)$$0 / 1.0E9F)))
         .append(" ticks per second. It should be ")
         .append(20)
         .append(" ticks per second\n\n");
      $$2.append("--- BEGIN PROFILE DUMP ---\n\n");
      this.a(0, "root", $$2);
      $$2.append("--- END PROFILE DUMP ---\n\n");
      Map<String, awv.a> $$3 = this.h();
      if (!$$3.isEmpty()) {
         $$2.append("--- BEGIN COUNTER DUMP ---\n\n");
         this.a($$3, $$2, $$1);
         $$2.append("--- END COUNTER DUMP ---\n\n");
      }

      return $$2.toString();
   }

   @Override
   public String e() {
      StringBuilder $$0 = new StringBuilder();
      this.a(0, "root", $$0);
      return $$0.toString();
   }

   private static StringBuilder a(StringBuilder $$0, int $$1) {
      $$0.append(String.format(Locale.ROOT, "[%02d] ", $$1));

      for(int $$2 = 0; $$2 < $$1; ++$$2) {
         $$0.append("|   ");
      }

      return $$0;
   }

   private void a(int $$0, String $$1, StringBuilder $$2) {
      List<axb> $$3 = this.a($$1);
      Object2LongMap<String> $$4 = ((axa)ObjectUtils.firstNonNull(new axa[]{(axa)this.f.get($$1), b})).d();
      $$4.forEach(($$2x, $$3x) -> a($$2, $$0).append('#').append($$2x).append(' ').append($$3x).append('/').append($$3x / (long)this.k).append('\n'));
      if ($$3.size() >= 3) {
         for(int $$5 = 1; $$5 < $$3.size(); ++$$5) {
            axb $$6 = (axb)$$3.get($$5);
            a($$2, $$0)
               .append($$6.d)
               .append('(')
               .append($$6.c)
               .append('/')
               .append(String.format(Locale.ROOT, "%.0f", (float)$$6.c / (float)this.k))
               .append(')')
               .append(" - ")
               .append(String.format(Locale.ROOT, "%.2f", $$6.a))
               .append("%/")
               .append(String.format(Locale.ROOT, "%.2f", $$6.b))
               .append("%\n");
            if (!"unspecified".equals($$6.d)) {
               try {
                  this.a($$0 + 1, $$1 + "\u001e" + $$6.d, $$2);
               } catch (Exception var9) {
                  $$2.append("[[ EXCEPTION ").append(var9).append(" ]]");
               }
            }
         }

      }
   }

   private void a(int $$0, String $$1, awv.a $$2, int $$3, StringBuilder $$4) {
      a($$4, $$0)
         .append($$1)
         .append(" total:")
         .append($$2.a)
         .append('/')
         .append($$2.b)
         .append(" average: ")
         .append($$2.a / (long)$$3)
         .append('/')
         .append($$2.b / (long)$$3)
         .append('\n');
      $$2.c.entrySet().stream().sorted(e).forEach($$3x -> this.a($$0 + 1, (String)$$3x.getKey(), (awv.a)$$3x.getValue(), $$3, $$4));
   }

   private void a(Map<String, awv.a> $$0, StringBuilder $$1, int $$2) {
      $$0.forEach(($$2x, $$3) -> {
         $$1.append("-- Counter: ").append($$2x).append(" --\n");
         this.a(0, "root", (awv.a)$$3.c.get("root"), $$2, $$1);
         $$1.append("\n\n");
      });
   }

   private static String i() {
      String[] $$0 = new String[]{
         "I'd Rather Be Surfing",
         "Shiny numbers!",
         "Am I not running fast enough? :(",
         "I'm working as hard as I can!",
         "Will I ever be good enough for you? :(",
         "Speedy. Zoooooom!",
         "Hello world",
         "40% better than a crash report.",
         "Now with extra numbers",
         "Now with less numbers",
         "Now with the same numbers",
         "You should add flames to things, it makes them go faster!",
         "Do you feel the need for... optimization?",
         "*cracks redstone whip*",
         "Maybe if you treated it better then it'll have more motivation to work faster! Poor server."
      };

      try {
         return $$0[(int)(ad.c() % (long)$$0.length)];
      } catch (Throwable var2) {
         return "Witty comment unavailable :(";
      }
   }

   @Override
   public int f() {
      return this.k;
   }

   static class a {
      long a;
      long b;
      final Map<String, awv.a> c = Maps.newHashMap();

      public void a(Iterator<String> $$0, long $$1) {
         this.b += $$1;
         if (!$$0.hasNext()) {
            this.a += $$1;
         } else {
            ((awv.a)this.c.computeIfAbsent((String)$$0.next(), $$0x -> new awv.a())).a($$0, $$1);
         }

      }
   }
}
