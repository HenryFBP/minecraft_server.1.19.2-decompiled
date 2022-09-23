import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ou {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<oj> f = Lists.newArrayList();
   @Nullable
   private final Collection<ok> g = Lists.newArrayList();

   public ou() {
   }

   public ou(Collection<oj> $$0) {
      this.f.addAll($$0);
   }

   public void a(oj $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(ok $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<oj> $$0) {
      this.a(new ok() {
         @Override
         public void a(oj $$0x) {
         }

         @Override
         public void b(oj $$0x) {
         }

         @Override
         public void c(oj $$0x) {
            $$0.accept($$0);
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(oj::i).filter(oj::r).count();
   }

   public int b() {
      return (int)this.f.stream().filter(oj::i).filter(oj::s).count();
   }

   public int c() {
      return (int)this.f.stream().filter(oj::k).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<oj> f() {
      return (Collection<oj>)this.f.stream().filter(oj::i).filter(oj::r).collect(Collectors.toList());
   }

   public Collection<oj> g() {
      return (Collection<oj>)this.f.stream().filter(oj::i).filter(oj::s).collect(Collectors.toList());
   }

   public int h() {
      return this.f.size();
   }

   public boolean i() {
      return this.c() == this.h();
   }

   public String j() {
      StringBuffer $$0 = new StringBuffer();
      $$0.append('[');
      this.f.forEach($$1 -> {
         if (!$$1.j()) {
            $$0.append(' ');
         } else if ($$1.h()) {
            $$0.append('+');
         } else if ($$1.i()) {
            $$0.append((char)($$1.r() ? 'X' : 'x'));
         } else {
            $$0.append('_');
         }

      });
      $$0.append(']');
      return $$0.toString();
   }

   public String toString() {
      return this.j();
   }
}
