import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dlq(List<dlf> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final abb c = new abb("jigsaw");
   private static final Map<abb, abb> d = ImmutableMap.builder()
      .put(new abb("nvi"), c)
      .put(new abb("pcp"), c)
      .put(new abb("bastionremnant"), c)
      .put(new abb("runtime"), c)
      .build();

   public dlq(List<dlf> $$0) {
      this.a = List.copyOf($$0);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(gt $$0) {
      for(dlf $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public qc a(dlr $$0) {
      pp $$1 = new pp();

      for(dlf $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dlq a(pp $$0, dlr $$1) {
      List<dlf> $$2 = Lists.newArrayList();

      for(int $$3 = 0; $$3 < $$0.size(); ++$$3) {
         pj $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         abb $$6 = new abb($$5);
         abb $$7 = (abb)d.getOrDefault($$6, $$6);
         dls $$8 = hm.bd.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dlf $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dlq($$2);
   }

   public dkt b() {
      return dlf.a(this.a.stream());
   }

   public List<dlf> c() {
      return this.a;
   }
}
