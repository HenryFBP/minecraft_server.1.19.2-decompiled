public class caj<T extends bbn & bbz> extends cat {
   private final bbr<T> a;
   private final int b;

   public caj(cat.a $$0, bbr<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      if ($$0.y) {
         return bak.c($$3);
      } else {
         bbn $$4 = $$1.cQ();
         if ($$1.bI() && $$4 instanceof bbz $$5 && $$4.ad() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cax $$6 = new cax(caz.pe);
               $$6.c($$3.u());
               return bak.a($$6);
            }

            return bak.a($$3);
         }

         $$1.b(akg.c.b(this));
         return bak.c($$3);
      }
   }
}
