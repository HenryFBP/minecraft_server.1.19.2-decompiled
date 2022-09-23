import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.UnsignedLong;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dwi<T> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Callback";
   private static final String c = "Name";
   private static final String d = "TriggerTime";
   private final dwh<T> e;
   private final Queue<dwi.a<T>> f = new PriorityQueue(c());
   private UnsignedLong g = UnsignedLong.ZERO;
   private final Table<String, Long, dwi.a<T>> h = HashBasedTable.create();

   private static <T> Comparator<dwi.a<T>> c() {
      return Comparator.comparingLong($$0 -> $$0.a).thenComparing($$0 -> $$0.b);
   }

   public dwi(dwh<T> $$0, Stream<Dynamic<qc>> $$1) {
      this($$0);
      this.f.clear();
      this.h.clear();
      this.g = UnsignedLong.ZERO;
      $$1.forEach($$0x -> {
         if (!($$0x.getValue() instanceof pj)) {
            a.warn("Invalid format of events: {}", $$0x);
         } else {
            this.a((pj)$$0x.getValue());
         }
      });
   }

   public dwi(dwh<T> $$0) {
      this.e = $$0;
   }

   public void a(T $$0, long $$1) {
      while(true) {
         dwi.a<T> $$2 = (dwi.a)this.f.peek();
         if ($$2 == null || $$2.a > $$1) {
            return;
         }

         this.f.remove();
         this.h.remove($$2.c, $$1);
         $$2.d.handle($$0, this, $$1);
      }
   }

   public void a(String $$0, long $$1, dwg<T> $$2) {
      if (!this.h.contains($$0, $$1)) {
         this.g = this.g.plus(UnsignedLong.ONE);
         dwi.a<T> $$3 = new dwi.a<>($$1, this.g, $$0, $$2);
         this.h.put($$0, $$1, $$3);
         this.f.add($$3);
      }
   }

   public int a(String $$0) {
      Collection<dwi.a<T>> $$1 = this.h.row($$0).values();
      $$1.forEach(this.f::remove);
      int $$2 = $$1.size();
      $$1.clear();
      return $$2;
   }

   public Set<String> a() {
      return Collections.unmodifiableSet(this.h.rowKeySet());
   }

   private void a(pj $$0) {
      pj $$1 = $$0.p("Callback");
      dwg<T> $$2 = this.e.a($$1);
      if ($$2 != null) {
         String $$3 = $$0.l("Name");
         long $$4 = $$0.i("TriggerTime");
         this.a($$3, $$4, $$2);
      }

   }

   private pj a(dwi.a<T> $$0) {
      pj $$1 = new pj();
      $$1.a("Name", $$0.c);
      $$1.a("TriggerTime", $$0.a);
      $$1.a("Callback", (qc)this.e.a($$0.d));
      return $$1;
   }

   public pp b() {
      pp $$0 = new pp();
      this.f.stream().sorted(c()).map(this::a).forEach($$0::add);
      return $$0;
   }

   public static class a<T> {
      public final long a;
      public final UnsignedLong b;
      public final String c;
      public final dwg<T> d;

      a(long $$0, UnsignedLong $$1, String $$2, dwg<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }
   }
}
