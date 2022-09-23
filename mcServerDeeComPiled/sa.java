import java.time.Instant;
import java.util.UUID;

public record sa(UUID a, Instant b, long c) {
   public sa(qx $$0) {
      this($$0.m(), $$0.t(), $$0.readLong());
   }

   public static sa a(UUID $$0) {
      return new sa($$0, Instant.now(), ali.c.a());
   }

   public static sa a() {
      return a(ad.c);
   }

   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.writeLong(this.c);
   }

   public boolean b() {
      return this.a.equals(ad.c);
   }

   public UUID c() {
      return this.a;
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
