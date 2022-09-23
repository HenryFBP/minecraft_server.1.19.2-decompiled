import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class cvu {
   private static final Joiner a = Joiner.on(",");
   private final List<String[]> b = Lists.newArrayList();
   private final Map<Character, Predicate<cvs>> c = Maps.newHashMap();
   private int d;
   private int e;

   private cvu() {
      this.c.put(' ', (Predicate)$$0 -> true);
   }

   public cvu a(String... $$0) {
      if (!ArrayUtils.isEmpty($$0) && !StringUtils.isEmpty($$0[0])) {
         if (this.b.isEmpty()) {
            this.d = $$0.length;
            this.e = $$0[0].length();
         }

         if ($$0.length != this.d) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + $$0.length + ")");
         } else {
            for(String $$1 : $$0) {
               if ($$1.length() != this.e) {
                  throw new IllegalArgumentException(
                     "Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + $$1.length() + ")"
                  );
               }

               for(char $$2 : $$1.toCharArray()) {
                  if (!this.c.containsKey($$2)) {
                     this.c.put($$2, null);
                  }
               }
            }

            this.b.add($$0);
            return this;
         }
      } else {
         throw new IllegalArgumentException("Empty pattern for aisle");
      }
   }

   public static cvu a() {
      return new cvu();
   }

   public cvu a(char $$0, Predicate<cvs> $$1) {
      this.c.put($$0, $$1);
      return this;
   }

   public cvt b() {
      return new cvt(this.c());
   }

   private Predicate<cvs>[][][] c() {
      this.d();
      Predicate<cvs>[][][] $$0 = (Predicate[][][])Array.newInstance(Predicate.class, new int[]{this.b.size(), this.d, this.e});

      for(int $$1 = 0; $$1 < this.b.size(); ++$$1) {
         for(int $$2 = 0; $$2 < this.d; ++$$2) {
            for(int $$3 = 0; $$3 < this.e; ++$$3) {
               $$0[$$1][$$2][$$3] = (Predicate)this.c.get(((String[])this.b.get($$1))[$$2].charAt($$3));
            }
         }
      }

      return $$0;
   }

   private void d() {
      List<Character> $$0 = Lists.newArrayList();

      for(Entry<Character, Predicate<cvs>> $$1 : this.c.entrySet()) {
         if ($$1.getValue() == null) {
            $$0.add((Character)$$1.getKey());
         }
      }

      if (!$$0.isEmpty()) {
         throw new IllegalStateException("Predicates for character(s) " + a.join($$0) + " are missing");
      }
   }
}
