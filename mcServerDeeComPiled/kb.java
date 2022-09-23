import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class kb implements jz {
   private final cjt a;
   private final List<kb.b> b = Lists.newArrayList();

   private kb(cjt $$0) {
      this.a = $$0;
   }

   @Override
   public cjt a() {
      return this.a;
   }

   public static kb a(cjt $$0) {
      return new kb($$0);
   }

   public kb a(List<kf> $$0) {
      this.b.add(new kb.b($$0));
      return this;
   }

   public kb a(kf $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public kb a(ka $$0, List<kf> $$1) {
      this.b.add(new kb.a($$0, $$1));
      return this;
   }

   public kb a(ka $$0, kf... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public kb a(ka $$0, kf $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      cvp<cjt, cvo> $$0 = this.a.k();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(kb.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends kb.b {
      private final ka a;

      a(ka $$0, List<kf> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(cvp<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", (JsonElement)this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<kf> a;

      b(List<kf> $$0) {
         this.a = $$0;
      }

      public void a(cvp<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", kf.a(this.a));
         return $$0;
      }
   }
}
