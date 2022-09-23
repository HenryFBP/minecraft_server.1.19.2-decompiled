import java.util.ArrayList;
import javax.annotation.Nullable;

public class cfw extends ArrayList<cfv> {
   public cfw() {
   }

   private cfw(int $$0) {
      super($$0);
   }

   public cfw(pj $$0) {
      pp $$1 = $$0.c("Recipes", 10);

      for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
         this.add(new cfv($$1.a($$2)));
      }

   }

   @Nullable
   public cfv a(cax $$0, cax $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         cfv $$3 = (cfv)this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for(int $$4 = 0; $$4 < this.size(); ++$$4) {
            cfv $$5 = (cfv)this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public void a(qx $$0) {
      $$0.a(this, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.d());
         $$0x.a($$1.c());
         $$0x.writeBoolean($$1.p());
         $$0x.writeInt($$1.g());
         $$0x.writeInt($$1.i());
         $$0x.writeInt($$1.o());
         $$0x.writeInt($$1.m());
         $$0x.writeFloat($$1.n());
         $$0x.writeInt($$1.k());
      });
   }

   public static cfw b(qx $$0) {
      return $$0.a(cfw::new, $$0x -> {
         cax $$1 = $$0x.p();
         cax $$2 = $$0x.p();
         cax $$3 = $$0x.p();
         boolean $$4 = $$0x.readBoolean();
         int $$5 = $$0x.readInt();
         int $$6 = $$0x.readInt();
         int $$7 = $$0x.readInt();
         int $$8 = $$0x.readInt();
         float $$9 = $$0x.readFloat();
         int $$10 = $$0x.readInt();
         cfv $$11 = new cfv($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
         if ($$4) {
            $$11.q();
         }

         $$11.b($$8);
         return $$11;
      });
   }

   public pj a() {
      pj $$0 = new pj();
      pp $$1 = new pp();

      for(int $$2 = 0; $$2 < this.size(); ++$$2) {
         cfv $$3 = (cfv)this.get($$2);
         $$1.add($$3.t());
      }

      $$0.a("Recipes", (qc)$$1);
      return $$0;
   }
}
