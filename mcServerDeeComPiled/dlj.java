import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dlj {
   public static final String a = "INVALID";
   public static final dlj b = new dlj(null, new cge(0, 0), 0, new dlq(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dlb d;
   private final dlq e;
   private final cge f;
   private int g;
   @Nullable
   private volatile dkt h;

   public dlj(dlb $$0, cge $$1, int $$2, dlq $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dlj a(dlr $$0, pj $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         hm<dlb> $$4 = $$0.b().d(hm.aN);
         dlb $$5 = $$4.a(new abb($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cge $$6 = new cge($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            pp $$8 = $$1.c("Children", 10);

            try {
               dlq $$9 = dlq.a($$8, $$0);
               if ($$5 instanceof dne) {
                  $$9 = dne.a($$6, $$2, $$9);
               }

               return new dlj($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dkt a() {
      dkt $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5) {
      List<dlf> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dkt $$7 = ((dlf)$$6.get(0)).f;
         gt $$8 = $$7.f();
         gt $$9 = new gt($$8.u(), $$7.h(), $$8.w());

         for(dlf $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public pj a(dlr $$0, cge $$1) {
      pj $$2 = new pj();
      if (this.b()) {
         $$2.a("id", $$0.b().d(hm.aN).b(this.d).toString());
         $$2.a("ChunkX", $$1.e);
         $$2.a("ChunkZ", $$1.f);
         $$2.a("references", this.g);
         $$2.a("Children", this.e.a($$0));
         return $$2;
      } else {
         $$2.a("id", "INVALID");
         return $$2;
      }
   }

   public boolean b() {
      return !this.e.a();
   }

   public cge c() {
      return this.f;
   }

   public boolean d() {
      return this.g < this.g();
   }

   public void e() {
      ++this.g;
   }

   public int f() {
      return this.g;
   }

   protected int g() {
      return 1;
   }

   public dlb h() {
      return this.d;
   }

   public List<dlf> i() {
      return this.e.c();
   }
}
