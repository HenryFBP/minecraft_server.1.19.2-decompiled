import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ol {
   private static final Collection<pa> a = Lists.newArrayList();
   private static final Set<String> b = Sets.newHashSet();
   private static final Map<String, Consumer<agg>> c = Maps.newHashMap();
   private static final Map<String, Consumer<agg>> d = Maps.newHashMap();
   private static final Collection<pa> e = Sets.newHashSet();

   public static void a(Class<?> $$0) {
      Arrays.stream($$0.getDeclaredMethods()).forEach(ol::a);
   }

   public static void a(Method $$0) {
      String $$1 = $$0.getDeclaringClass().getSimpleName();
      ob $$2 = (ob)$$0.getAnnotation(ob.class);
      if ($$2 != null) {
         a.add(c($$0));
         b.add($$1);
      }

      oh $$3 = (oh)$$0.getAnnotation(oh.class);
      if ($$3 != null) {
         a.addAll(b($$0));
         b.add($$1);
      }

      a($$0, nz.class, nz::a, c);
      a($$0, ny.class, ny::a, d);
   }

   private static <T extends Annotation> void a(Method $$0, Class<T> $$1, Function<T, String> $$2, Map<String, Consumer<agg>> $$3) {
      T $$4 = $$0.getAnnotation($$1);
      if ($$4 != null) {
         String $$5 = (String)$$2.apply($$4);
         Consumer<agg> $$6 = (Consumer)$$3.putIfAbsent($$5, d($$0));
         if ($$6 != null) {
            throw new RuntimeException("Hey, there should only be one " + $$1 + " method per batch. Batch '" + $$5 + "' has more than one!");
         }
      }

   }

   public static Collection<pa> a(String $$0) {
      return (Collection<pa>)a.stream().filter($$1 -> a($$1, $$0)).collect(Collectors.toList());
   }

   public static Collection<pa> a() {
      return a;
   }

   public static Collection<String> b() {
      return b;
   }

   public static boolean b(String $$0) {
      return b.contains($$0);
   }

   @Nullable
   public static Consumer<agg> c(String $$0) {
      return (Consumer<agg>)c.get($$0);
   }

   @Nullable
   public static Consumer<agg> d(String $$0) {
      return (Consumer<agg>)d.get($$0);
   }

   public static Optional<pa> e(String $$0) {
      return a().stream().filter($$1 -> $$1.a().equalsIgnoreCase($$0)).findFirst();
   }

   public static pa f(String $$0) {
      Optional<pa> $$1 = e($$0);
      if (!$$1.isPresent()) {
         throw new IllegalArgumentException("Can't find the test function for " + $$0);
      } else {
         return (pa)$$1.get();
      }
   }

   private static Collection<pa> b(Method $$0) {
      try {
         Object $$1 = $$0.getDeclaringClass().newInstance();
         return (Collection<pa>)$$0.invoke($$1);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   private static pa c(Method $$0) {
      ob $$1 = (ob)$$0.getAnnotation(ob.class);
      String $$2 = $$0.getDeclaringClass().getSimpleName();
      String $$3 = $$2.toLowerCase();
      String $$4 = $$3 + "." + $$0.getName().toLowerCase();
      String $$5 = $$1.e().isEmpty() ? $$4 : $$3 + "." + $$1.e();
      String $$6 = $$1.b();
      cpw $$7 = ow.a($$1.c());
      return new pa($$6, $$4, $$5, $$7, $$1.a(), $$1.f(), $$1.d(), $$1.h(), $$1.g(), d($$0));
   }

   private static Consumer<?> d(Method $$0) {
      return $$1 -> {
         try {
            Object $$2 = $$0.getDeclaringClass().newInstance();
            $$0.invoke($$2, $$1);
         } catch (InvocationTargetException var3) {
            if (var3.getCause() instanceof RuntimeException) {
               throw (RuntimeException)var3.getCause();
            } else {
               throw new RuntimeException(var3.getCause());
            }
         } catch (ReflectiveOperationException var4) {
            throw new RuntimeException(var4);
         }
      };
   }

   private static boolean a(pa $$0, String $$1) {
      return $$0.a().toLowerCase().startsWith($$1.toLowerCase() + ".");
   }

   public static Collection<pa> c() {
      return e;
   }

   public static void a(pa $$0) {
      e.add($$0);
   }

   public static void d() {
      e.clear();
   }
}
