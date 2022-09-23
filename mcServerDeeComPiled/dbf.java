import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public final class dbf {
   final dbe a;
   private final long b;
   private final hm<dpa.a> c;
   private final dax d;
   private final cic.f e;
   private final dbj f;
   private final dbe g;
   private final dbe h;
   private final Map<aba<dpa.a>, dpa> i;
   private final Map<abb, dbe> j;

   public static dbf a(hn $$0, aba<daw> $$1, long $$2) {
      return a((daw)$$0.d(hm.aJ).g($$1), $$0.d(hm.aS), $$2);
   }

   public static dbf a(daw $$0, hm<dpa.a> $$1, long $$2) {
      return new dbf($$0, $$1, $$2);
   }

   private dbf(daw $$0, hm<dpa.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$2;
      this.c = $$1;
      this.g = this.a.a(new abb("aquifer")).e();
      this.h = this.a.a(new abb("ore")).e();
      this.i = new ConcurrentHashMap();
      this.j = new ConcurrentHashMap();
      this.f = new dbj(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dak.f {
         private final Map<dak, dak> d = new HashMap();

         private amn a(long $$0) {
            return new das($$2 + $$0);
         }

         @Override
         public dak.c a(dak.c $$0) {
            hc<dpa.a> $$1 = $$0.b();
            if ($$3) {
               if (Objects.equals($$1.e(), Optional.of(dba.a))) {
                  dpa $$2 = dpa.a(this.a(0L), new dpa.a(-7, 1.0, 1.0));
                  return new dak.c($$1, $$2);
               }

               if (Objects.equals($$1.e(), Optional.of(dba.b))) {
                  dpa $$3 = dpa.a(this.a(1L), new dpa.a(-7, 1.0, 1.0));
                  return new dak.c($$1, $$3);
               }

               if (Objects.equals($$1.e(), Optional.of(dba.j))) {
                  dpa $$4 = dpa.b(dbf.this.a.a(dba.j.a()), new dpa.a(0, 0.0));
                  return new dak.c($$1, $$4);
               }
            }

            dpa $$5 = dbf.this.a((aba<dpa.a>)$$1.e().orElseThrow());
            return new dak.c($$1, $$5);
         }

         private dak a(dak $$0) {
            if ($$0 instanceof dox $$1) {
               amn $$2 = $$3 ? this.a(0L) : dbf.this.a.a(new abb("terrain"));
               return $$1.a($$2);
            } else {
               return (dak)($$0 instanceof dal.i ? new dal.i($$2) : $$0);
            }
         }

         @Override
         public dak apply(dak $$0) {
            return (dak)this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.d = $$0.i().a(new a());
      this.e = new cic.f(this.d.e(), this.d.f(), this.d.g(), this.d.h(), this.d.i(), this.d.j(), $$0.k());
   }

   public dpa a(aba<dpa.a> $$0) {
      return (dpa)this.i.computeIfAbsent($$0, $$1 -> dba.a(this.c, this.a, $$0));
   }

   public dbe a(abb $$0) {
      return (dbe)this.j.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public long a() {
      return this.b;
   }

   public dax b() {
      return this.d;
   }

   public cic.f c() {
      return this.e;
   }

   public dbj d() {
      return this.f;
   }

   public dbe e() {
      return this.g;
   }

   public dbe f() {
      return this.h;
   }
}
