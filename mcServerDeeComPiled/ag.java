import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ag {
   private static final Logger a = LogUtils.getLogger();
   private final Map<abb, af> b = Maps.newHashMap();
   private final Set<af> c = Sets.newLinkedHashSet();
   private final Set<af> d = Sets.newLinkedHashSet();
   @Nullable
   private ag.a e;

   private void a(af $$0) {
      for(af $$1 : $$0.e()) {
         this.a($$1);
      }

      a.info("Forgot about advancement {}", $$0.h());
      this.b.remove($$0.h());
      if ($$0.b() == null) {
         this.c.remove($$0);
         if (this.e != null) {
            this.e.b($$0);
         }
      } else {
         this.d.remove($$0);
         if (this.e != null) {
            this.e.d($$0);
         }
      }

   }

   public void a(Set<abb> $$0) {
      for(abb $$1 : $$0) {
         af $$2 = (af)this.b.get($$1);
         if ($$2 == null) {
            a.warn("Told to remove advancement {} but I don't know what that is", $$1);
         } else {
            this.a($$2);
         }
      }

   }

   public void a(Map<abb, af.a> $$0) {
      Map<abb, af.a> $$1 = Maps.newHashMap($$0);

      while(!$$1.isEmpty()) {
         boolean $$2 = false;
         Iterator<Entry<abb, af.a>> $$3 = $$1.entrySet().iterator();

         while($$3.hasNext()) {
            Entry<abb, af.a> $$4 = (Entry)$$3.next();
            abb $$5 = (abb)$$4.getKey();
            af.a $$6 = (af.a)$$4.getValue();
            if ($$6.a(this.b::get)) {
               af $$7 = $$6.b($$5);
               this.b.put($$5, $$7);
               $$2 = true;
               $$3.remove();
               if ($$7.b() == null) {
                  this.c.add($$7);
                  if (this.e != null) {
                     this.e.a($$7);
                  }
               } else {
                  this.d.add($$7);
                  if (this.e != null) {
                     this.e.c($$7);
                  }
               }
            }
         }

         if (!$$2) {
            for(Entry<abb, af.a> $$8 : $$1.entrySet()) {
               a.error("Couldn't load advancement {}: {}", $$8.getKey(), $$8.getValue());
            }
            break;
         }
      }

      a.info("Loaded {} advancements", this.b.size());
   }

   public void a() {
      this.b.clear();
      this.c.clear();
      this.d.clear();
      if (this.e != null) {
         this.e.a();
      }

   }

   public Iterable<af> b() {
      return this.c;
   }

   public Collection<af> c() {
      return this.b.values();
   }

   @Nullable
   public af a(abb $$0) {
      return (af)this.b.get($$0);
   }

   public void a(@Nullable ag.a $$0) {
      this.e = $$0;
      if ($$0 != null) {
         for(af $$1 : this.c) {
            $$0.a($$1);
         }

         for(af $$2 : this.d) {
            $$0.c($$2);
         }
      }

   }

   public interface a {
      void a(af var1);

      void b(af var1);

      void c(af var1);

      void d(af var1);

      void a();
   }
}
