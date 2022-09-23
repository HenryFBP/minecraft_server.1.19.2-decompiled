import com.google.gson.JsonObject;
import java.util.stream.Stream;

public class ceg implements cdp<bac> {
   final cdm a;
   final cdm b;
   final cax c;
   private final abb d;

   public ceg(abb $$0, cdm $$1, cdm $$2, cax $$3) {
      this.d = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   public boolean a(bac $$0, cgx $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1));
   }

   @Override
   public cax a(bac $$0) {
      cax $$1 = this.c.o();
      pj $$2 = $$0.a(0).u();
      if ($$2 != null) {
         $$1.c($$2.g());
      }

      return $$1;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cax c() {
      return this.c;
   }

   public boolean a(cax $$0) {
      return this.b.a($$0);
   }

   @Override
   public cax h() {
      return new cax(cju.mM);
   }

   @Override
   public abb f() {
      return this.d;
   }

   @Override
   public cdr<?> U_() {
      return cdr.u;
   }

   @Override
   public cds<?> g() {
      return cds.g;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b).anyMatch($$0 -> $$0.a().length == 0);
   }

   public static class a implements cdr<ceg> {
      public ceg b(abb $$0, JsonObject $$1) {
         cdm $$2 = cdm.a(alz.t($$1, "base"));
         cdm $$3 = cdm.a(alz.t($$1, "addition"));
         cax $$4 = cdu.a(alz.t($$1, "result"));
         return new ceg($$0, $$2, $$3, $$4);
      }

      public ceg b(abb $$0, qx $$1) {
         cdm $$2 = cdm.b($$1);
         cdm $$3 = cdm.b($$1);
         cax $$4 = $$1.p();
         return new ceg($$0, $$2, $$3, $$4);
      }

      public void a(qx $$0, ceg $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$0.a($$1.c);
      }
   }
}
