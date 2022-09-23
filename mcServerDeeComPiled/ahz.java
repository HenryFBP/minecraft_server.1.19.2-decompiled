public interface ahz {
   ahz a = a();
   ahz b = a("pack.source.builtin");
   ahz c = a("pack.source.world");
   ahz d = a("pack.source.server");

   rq decorate(rq var1);

   static ahz a() {
      return $$0 -> $$0;
   }

   static ahz a(String $$0) {
      rq $$1 = rq.c($$0);
      return $$1x -> rq.a("pack.nameAndSource", $$1x, $$1).a(p.h);
   }
}
