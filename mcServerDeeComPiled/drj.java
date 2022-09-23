import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class drj {
   private static final String a = "command_storage_";
   private final Map<String, drj.a> b = Maps.newHashMap();
   private final drm c;

   public drj(drm $$0) {
      this.c = $$0;
   }

   private drj.a a(String $$0) {
      drj.a $$1 = new drj.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   public pj a(abb $$0) {
      String $$1 = $$0.b();
      drj.a $$2 = this.c.a($$1x -> this.a($$1).b($$1x), b($$1));
      return $$2 != null ? $$2.a($$0.a()) : new pj();
   }

   public void a(abb $$0, pj $$1) {
      String $$2 = $$0.b();
      this.c.<drj.a>a($$1x -> this.a($$2).b($$1x), () -> this.a($$2), b($$2)).a($$0.a(), $$1);
   }

   public Stream<abb> a() {
      return this.b.entrySet().stream().flatMap($$0 -> ((drj.a)$$0.getValue()).b((String)$$0.getKey()));
   }

   private static String b(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends drb {
      private static final String a = "contents";
      private final Map<String, pj> b = Maps.newHashMap();

      drj.a b(pj $$0) {
         pj $$1 = $$0.p("contents");

         for(String $$2 : $$1.d()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public pj a(pj $$0) {
         pj $$1 = new pj();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, (qc)$$2.g()));
         $$0.a("contents", (qc)$$1);
         return $$0;
      }

      public pj a(String $$0) {
         pj $$1 = (pj)this.b.get($$0);
         return $$1 != null ? $$1 : new pj();
      }

      public void a(String $$0, pj $$1) {
         if ($$1.f()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.b();
      }

      public Stream<abb> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new abb($$0, $$1));
      }
   }
}
