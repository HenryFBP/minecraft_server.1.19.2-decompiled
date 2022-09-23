import java.util.List;
import javax.annotation.Nullable;

public class byv extends cat {
   private final akz<csz> a;

   public byv(akz<csz> $$0, cat.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public akz<csz> b() {
      return this.a;
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      $$2.add(this.d().a(p.h));
   }

   public sb d() {
      return rq.c(this.a() + ".desc");
   }
}
