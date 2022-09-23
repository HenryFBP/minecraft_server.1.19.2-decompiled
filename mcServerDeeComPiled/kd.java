import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class kd {
   private final Map<ke, List<kf>> a = Maps.newHashMap();

   protected void a(ke $$0, List<kf> $$1) {
      List<kf> $$2 = (List)this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<ke, List<kf>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<cwr<?>> $$0 = this.b();
      Stream<ke> $$1 = Stream.of(ke.a());

      for(cwr<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<ke> $$3 = (List)$$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<cwr<?>> b();

   public static <T1 extends Comparable<T1>> kd.a<T1> a(cwr<T1> $$0) {
      return new kd.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> kd.b<T1, T2> a(cwr<T1> $$0, cwr<T2> $$1) {
      return new kd.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> kd.c<T1, T2, T3> a(cwr<T1> $$0, cwr<T2> $$1, cwr<T3> $$2) {
      return new kd.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> kd.d<T1, T2, T3, T4> a(
      cwr<T1> $$0, cwr<T2> $$1, cwr<T3> $$2, cwr<T4> $$3
   ) {
      return new kd.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> kd.e<T1, T2, T3, T4, T5> a(
      cwr<T1> $$0, cwr<T2> $$1, cwr<T3> $$2, cwr<T4> $$3, cwr<T5> $$4
   ) {
      return new kd.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends kd {
      private final cwr<T1> a;

      a(cwr<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<cwr<?>> b() {
         return ImmutableList.of(this.a);
      }

      public kd.a<T1> a(T1 $$0, List<kf> $$1) {
         ke $$2 = ke.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public kd.a<T1> a(T1 $$0, kf $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public kd a(Function<T1, kf> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, (kf)$$0.apply($$1)));
         return this;
      }

      public kd b(Function<T1, List<kf>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, (List<kf>)$$0.apply($$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends kd {
      private final cwr<T1> a;
      private final cwr<T2> b;

      b(cwr<T1> $$0, cwr<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<cwr<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public kd.b<T1, T2> a(T1 $$0, T2 $$1, List<kf> $$2) {
         ke $$3 = ke.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public kd.b<T1, T2> a(T1 $$0, T2 $$1, kf $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public kd a(BiFunction<T1, T2, kf> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, (kf)$$0.apply($$1, $$2))));
         return this;
      }

      public kd b(BiFunction<T1, T2, List<kf>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, (List<kf>)$$0.apply($$1, $$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends kd {
      private final cwr<T1> a;
      private final cwr<T2> b;
      private final cwr<T3> c;

      c(cwr<T1> $$0, cwr<T2> $$1, cwr<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<cwr<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public kd.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<kf> $$3) {
         ke $$4 = ke.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public kd.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, kf $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public kd a(kd.h<T1, T2, T3, kf> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply($$1, $$2, $$3)))));
         return this;
      }

      public kd b(kd.h<T1, T2, T3, List<kf>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (List<kf>)$$0.apply($$1, $$2, $$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends kd {
      private final cwr<T1> a;
      private final cwr<T2> b;
      private final cwr<T3> c;
      private final cwr<T4> d;

      d(cwr<T1> $$0, cwr<T2> $$1, cwr<T3> $$2, cwr<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<cwr<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public kd.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<kf> $$4) {
         ke $$5 = ke.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public kd.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, kf $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public kd a(kd.g<T1, T2, T3, T4, kf> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c.a().forEach($$3 -> this.d.a().forEach($$4 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, $$0.apply($$1, $$2, $$3, $$4))))
                     )
            );
         return this;
      }

      public kd b(kd.g<T1, T2, T3, T4, List<kf>> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach($$3 -> this.d.a().forEach($$4 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (List<kf>)$$0.apply($$1, $$2, $$3, $$4))))
                     )
            );
         return this;
      }
   }

   public static class e<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
      extends kd {
      private final cwr<T1> a;
      private final cwr<T2> b;
      private final cwr<T3> c;
      private final cwr<T4> d;
      private final cwr<T5> e;

      e(cwr<T1> $$0, cwr<T2> $$1, cwr<T3> $$2, cwr<T4> $$3, cwr<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<cwr<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public kd.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<kf> $$5) {
         ke $$6 = ke.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public kd.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, kf $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public kd a(kd.f<T1, T2, T3, T4, T5, kf> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach(
                                 $$3 -> this.d
                                       .a()
                                       .forEach(
                                          $$4 -> this.e
                                                .a()
                                                .forEach($$5 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5, $$0.apply($$1, $$2, $$3, $$4, $$5)))
                                       )
                              )
                     )
            );
         return this;
      }

      public kd b(kd.f<T1, T2, T3, T4, T5, List<kf>> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach(
                                 $$3 -> this.d
                                       .a()
                                       .forEach(
                                          $$4 -> this.e
                                                .a()
                                                .forEach(
                                                   $$5 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5, (List<kf>)$$0.apply($$1, $$2, $$3, $$4, $$5))
                                                )
                                       )
                              )
                     )
            );
         return this;
      }
   }

   @FunctionalInterface
   public interface f<P1, P2, P3, P4, P5, R> {
      R apply(P1 var1, P2 var2, P3 var3, P4 var4, P5 var5);
   }

   @FunctionalInterface
   public interface g<P1, P2, P3, P4, R> {
      R apply(P1 var1, P2 var2, P3 var3, P4 var4);
   }

   @FunctionalInterface
   public interface h<P1, P2, P3, R> {
      R apply(P1 var1, P2 var2, P3 var3);
   }
}
