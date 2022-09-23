import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class ccs {
   @Nullable
   private final String a;
   private final ImmutableList<bbg> b;

   public static ccs a(String $$0) {
      return hm.Z.a(abb.a($$0));
   }

   public ccs(bbg... $$0) {
      this(null, $$0);
   }

   public ccs(@Nullable String $$0, bbg... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? hm.Z.b(this).a() : this.a);
   }

   public List<bbg> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while(var1.hasNext()) {
            bbg $$0 = (bbg)var1.next();
            if ($$0.b().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
