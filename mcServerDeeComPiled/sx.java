import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class sx implements rr {
   private static final Object[] b = new Object[0];
   private static final ru c = ru.e("%");
   private static final ru d = ru.e("null");
   private final String e;
   private final Object[] f;
   @Nullable
   private pe g;
   private List<ru> h = ImmutableList.of();
   private static final Pattern i = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

   public sx(String $$0) {
      this.e = $$0;
      this.f = b;
   }

   public sx(String $$0, Object... $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private void c() {
      pe $$0 = pe.a();
      if ($$0 != this.g) {
         this.g = $$0;
         String $$1 = $$0.a(this.e);

         try {
            Builder<ru> $$2 = ImmutableList.builder();
            this.a($$1, $$2::add);
            this.h = $$2.build();
         } catch (sy var4) {
            this.h = ImmutableList.of(ru.e($$1));
         }

      }
   }

   private void a(String $$0, Consumer<ru> $$1) {
      Matcher $$2 = i.matcher($$0);

      try {
         int $$3 = 0;

         int $$4;
         int $$6;
         for($$4 = 0; $$2.find($$4); $$4 = $$6) {
            int $$5 = $$2.start();
            $$6 = $$2.end();
            if ($$5 > $$4) {
               String $$7 = $$0.substring($$4, $$5);
               if ($$7.indexOf(37) != -1) {
                  throw new IllegalArgumentException();
               }

               $$1.accept(ru.e($$7));
            }

            String $$8 = $$2.group(2);
            String $$9 = $$0.substring($$5, $$6);
            if ("%".equals($$8) && "%%".equals($$9)) {
               $$1.accept(c);
            } else {
               if (!"s".equals($$8)) {
                  throw new sy(this, "Unsupported format: '" + $$9 + "'");
               }

               String $$10 = $$2.group(1);
               int $$11 = $$10 != null ? Integer.parseInt($$10) - 1 : $$3++;
               if ($$11 < this.f.length) {
                  $$1.accept(this.a($$11));
               }
            }
         }

         if ($$4 < $$0.length()) {
            String $$12 = $$0.substring($$4);
            if ($$12.indexOf(37) != -1) {
               throw new IllegalArgumentException();
            }

            $$1.accept(ru.e($$12));
         }

      } catch (IllegalArgumentException var12) {
         throw new sy(this, var12);
      }
   }

   private ru a(int $$0) {
      if ($$0 >= this.f.length) {
         throw new sy(this, $$0);
      } else {
         Object $$1 = this.f[$$0];
         if ($$1 instanceof rq) {
            return (rq)$$1;
         } else {
            return $$1 == null ? d : ru.e($$1.toString());
         }
      }
   }

   @Override
   public <T> Optional<T> a(ru.b<T> $$0, sj $$1) {
      this.c();

      for(ru $$2 : this.h) {
         Optional<T> $$3 = $$2.a($$0, $$1);
         if ($$3.isPresent()) {
            return $$3;
         }
      }

      return Optional.empty();
   }

   @Override
   public <T> Optional<T> a(ru.a<T> $$0) {
      this.c();

      for(ru $$1 : this.h) {
         Optional<T> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   @Override
   public sb a(@Nullable dr $$0, @Nullable bbn $$1, int $$2) throws CommandSyntaxException {
      Object[] $$3 = new Object[this.f.length];

      for(int $$4 = 0; $$4 < $$3.length; ++$$4) {
         Object $$5 = this.f[$$4];
         if ($$5 instanceof rq) {
            $$3[$$4] = rs.a($$0, (rq)$$5, $$1, $$2);
         } else {
            $$3[$$4] = $$5;
         }
      }

      return sb.a(new sx(this.e, $$3));
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof sx $$1 && this.e.equals($$1.e) && Arrays.equals(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   public int hashCode() {
      int $$0 = this.e.hashCode();
      return 31 * $$0 + Arrays.hashCode(this.f);
   }

   public String toString() {
      return "translation{key='" + this.e + "', args=" + Arrays.toString(this.f) + "}";
   }

   public String a() {
      return this.e;
   }

   public Object[] b() {
      return this.f;
   }
}
