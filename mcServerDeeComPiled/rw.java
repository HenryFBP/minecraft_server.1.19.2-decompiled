import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public record rw(List<rw.a> c) {
   public static rw a = new rw(List.of());
   public static final int b = 5;

   public rw(qx $$0) {
      this($$0.a(qx.a(ArrayList::new, 5), rw.a::new));
   }

   public void a(qx $$0) {
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(DataOutput $$0) throws IOException {
      for(rw.a $$1 : this.c) {
         UUID $$2 = $$1.a();
         rz $$3 = $$1.b();
         $$0.writeByte(70);
         $$0.writeLong($$2.getMostSignificantBits());
         $$0.writeLong($$2.getLeastSignificantBits());
         $$0.write($$3.c());
      }

   }

   public List<rw.a> a() {
      return this.c;
   }

   public static record a(UUID a, rz b) {
      public a(qx $$0) {
         this($$0.m(), new rz($$0));
      }

      public void a(qx $$0) {
         $$0.a(this.a);
         this.b.a($$0);
      }
   }

   public static record b(rw a, Optional<rw.a> b) {
      public b(qx $$0) {
         this(new rw($$0), $$0.b(rw.a::new));
      }

      public void a(qx $$0) {
         this.a.a($$0);
         $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
      }
   }
}
