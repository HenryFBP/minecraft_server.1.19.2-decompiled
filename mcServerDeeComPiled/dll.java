import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dll extends dlf {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected dot b;
   protected dop c;
   protected gt d;

   public dll(dls $$0, int $$1, dou $$2, abb $$3, String $$4, dop $$5, gt $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(gy.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dll(dls $$0, pj $$1, dou $$2, Function<abb, dop> $$3) {
      super($$0, $$1);
      this.a(gy.c);
      this.a = $$1.l("Template");
      this.d = new gt($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      abb $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = (dop)$$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected abb b() {
      return new abb(this.a);
   }

   @Override
   protected void a(dlr $$0, pj $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for(dot.c $$8 : this.b.a(this.d, this.c, cju.nL)) {
            if ($$8.c != null) {
               cwx $$9 = cwx.valueOf($$8.c.l("mode"));
               if ($$9 == cwx.d) {
                  this.a($$8.c.l("metadata"), $$8.a, $$0, $$3, $$4);
               }
            }
         }

         for(dot.c $$11 : this.b.a(this.d, this.c, cju.nM)) {
            if ($$11.c != null) {
               String $$12 = $$11.c.l("final_state");
               cvo $$13 = cju.a.m();

               try {
                  $$13 = ff.a(hm.V, $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a);
               }

               $$0.a($$11.a, $$13, 3);
            }
         }
      }

   }

   protected abstract void a(String var1, gt var2, chm var3, amn var4, dkt var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public cpw a() {
      return this.c.d();
   }

   public dot c() {
      return this.b;
   }

   public gt d() {
      return this.d;
   }

   public dop e() {
      return this.c;
   }
}
