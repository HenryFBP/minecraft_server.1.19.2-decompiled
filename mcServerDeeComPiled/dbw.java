import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface dbw extends BiPredicate<chp, gt> {
   Codec<dbw> b = hm.aI.p().dispatch(dbw::a, dbx::codec);
   dbw c = a(cju.a);
   dbw d = a(cju.a, cju.C);

   dbx<?> a();

   static dbw a(List<dbw> $$0) {
      return new dbu($$0);
   }

   static dbw a(dbw... $$0) {
      return a(List.of($$0));
   }

   static dbw a(dbw $$0, dbw $$1) {
      return a(List.of($$0, $$1));
   }

   static dbw b(List<dbw> $$0) {
      return new dbv($$0);
   }

   static dbw b(dbw... $$0) {
      return b(List.of($$0));
   }

   static dbw b(dbw $$0, dbw $$1) {
      return b(List.of($$0, $$1));
   }

   static dbw a(hs $$0, List<cjt> $$1) {
      return new dcc($$0, he.a(cjt::p, $$1));
   }

   static dbw c(List<cjt> $$0) {
      return a(hs.g, $$0);
   }

   static dbw a(hs $$0, cjt... $$1) {
      return a($$0, List.of($$1));
   }

   static dbw a(cjt... $$0) {
      return a(hs.g, $$0);
   }

   static dbw a(hs $$0, akz<cjt> $$1) {
      return new dcb($$0, $$1);
   }

   static dbw a(akz<cjt> $$0) {
      return a(hs.g, $$0);
   }

   static dbw b(hs $$0, List<dpu> $$1) {
      return new dcd($$0, he.a(dpu::l, $$1));
   }

   static dbw a(hs $$0, dpu... $$1) {
      return b($$0, List.of($$1));
   }

   static dbw a(dpu... $$0) {
      return a(hs.g, $$0);
   }

   static dbw a(dbw $$0) {
      return new dce($$0);
   }

   static dbw a(hs $$0) {
      return new dcf($$0);
   }

   static dbw b() {
      return a(hs.g);
   }

   static dbw a(cvo $$0, hs $$1) {
      return new dcj($$1, $$0);
   }

   static dbw a(hs $$0, gy $$1) {
      return new dbz($$0, $$1);
   }

   static dbw a(gy $$0) {
      return a(hs.g, $$0);
   }

   static dbw b(hs $$0) {
      return new dcg($$0);
   }

   static dbw c() {
      return b(hs.g);
   }

   static dbw c(hs $$0) {
      return new dca($$0);
   }

   static dbw d() {
      return dci.a;
   }
}
