import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bcj {
   String a_ = "AngerTime";
   String b_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void c(pj $$0) {
      $$0.a("AngerTime", this.a());
      if (this.b() != null) {
         $$0.a("AngryAt", this.b());
      }

   }

   default void a(cgx $$0, pj $$1) {
      this.a($$1.h("AngerTime"));
      if ($$0 instanceof agg) {
         if (!$$1.b("AngryAt")) {
            this.a(null);
         } else {
            UUID $$2 = $$1.a("AngryAt");
            this.a($$2);
            bbn $$3 = ((agg)$$0).a($$2);
            if ($$3 != null) {
               if ($$3 instanceof bce) {
                  this.a((bce)$$3);
               }

               if ($$3.ad() == bbr.bn) {
                  this.d((buc)$$3);
               }

            }
         }
      }
   }

   default void a(agg $$0, boolean $$1) {
      bcc $$2 = this.G();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eg()) && $$3 != null && $$0.a($$3) instanceof bce) {
         this.H_();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.co())) {
            this.a($$2.co());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ad() != bbr.bn || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.H_();
            }
         }

      }
   }

   default boolean a_(bcc $$0) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ad() == bbr.bn && this.b($$0.s) ? true : $$0.co().equals(this.b());
      }
   }

   default boolean b(cgx $$0) {
      return $$0.W().b(cgt.J) && this.I_() && this.b() == null;
   }

   default boolean I_() {
      return this.a() > 0;
   }

   default void a_(buc $$0) {
      if ($$0.s.W().b(cgt.I)) {
         if ($$0.co().equals(this.b())) {
            this.H_();
         }
      }
   }

   default void J_() {
      this.H_();
      this.c();
   }

   default void H_() {
      this.a(null);
      this.a(null);
      this.h(null);
      this.a(0);
   }

   @Nullable
   bcc dR();

   void a(@Nullable bcc var1);

   void d(@Nullable buc var1);

   void h(@Nullable bcc var1);

   boolean c(bcc var1);

   @Nullable
   bcc G();
}
