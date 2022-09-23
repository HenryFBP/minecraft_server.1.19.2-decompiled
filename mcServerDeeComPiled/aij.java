import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class aij implements aim, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aid b;
   private final List<aig> c = Lists.newArrayList();
   private final ahm d;

   public aij(ahm $$0) {
      this.d = $$0;
      this.b = new aif($$0, List.of());
   }

   public void close() {
      this.b.close();
   }

   public void a(aig $$0) {
      this.c.add($$0);
   }

   public aii a(Executor $$0, Executor $$1, CompletableFuture<anf> $$2, List<ahl> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(ahl::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new aif(this.d, $$3);
      return ais.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aik> getResource(abb $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<aik> a(abb $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<abb, aik> b(String $$0, Predicate<abb> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<abb, List<aik>> c(String $$0, Predicate<abb> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<ahl> b() {
      return this.b.b();
   }
}
