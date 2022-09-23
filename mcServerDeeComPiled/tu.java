import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;

public class tu implements tc<tf> {
   private final int a;
   private final Suggestions b;

   public tu(int $$0, Suggestions $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public tu(qx $$0) {
      this.a = $$0.k();
      int $$1 = $$0.k();
      int $$2 = $$0.k();
      StringRange $$3 = StringRange.between($$1, $$1 + $$2);
      List<Suggestion> $$4 = $$0.a((qx.a)($$1x -> {
         String $$2x = $$1x.q();
         rq $$3x = $$1x.c(qx::j);
         return new Suggestion($$3, $$2x, $$3x);
      }));
      this.b = new Suggestions($$3, $$4);
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.d(this.b.getRange().getStart());
      $$0.d(this.b.getRange().getLength());
      $$0.a(this.b.getList(), ($$0x, $$1) -> {
         $$0x.a($$1.getText());
         $$0x.a($$1.getTooltip(), ($$0xx, $$1x) -> $$0xx.a(rs.a($$1x)));
      });
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public Suggestions c() {
      return this.b;
   }
}
