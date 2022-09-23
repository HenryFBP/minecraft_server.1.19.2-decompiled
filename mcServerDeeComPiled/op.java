import com.google.common.collect.Lists;
import java.util.Collection;

public class op {
   public static final op a = new op();
   private final Collection<oj> b = Lists.newCopyOnWriteArrayList();

   public void a(oj $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(oj::b);
      this.b.removeIf(oj::k);
   }
}
