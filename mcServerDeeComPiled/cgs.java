import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cgs extends drb {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   private cgs(LongSet $$0) {
      this.c = $$0;
   }

   public cgs() {
      this(new LongOpenHashSet());
   }

   public static cgs b(pj $$0) {
      return new cgs(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public pj a(pj $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet a() {
      return this.c;
   }
}
