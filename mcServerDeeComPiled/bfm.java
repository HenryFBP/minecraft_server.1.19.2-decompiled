import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class bfm<E extends bcc> extends bec<E> {
   public bfm(List<Pair<bdo<? super E>, Integer>> $$0) {
      this(ImmutableMap.of(), $$0);
   }

   public bfm(Map<bku<?>, bkv> $$0, List<Pair<bdo<? super E>, Integer>> $$1) {
      super($$0, ImmutableSet.of(), bec.a.b, bec.b.a, $$1);
   }
}
