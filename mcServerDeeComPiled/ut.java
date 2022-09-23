import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public record ut(
   int a,
   boolean b,
   cgu c,
   @Nullable cgu d,
   Set<aba<cgx>> e,
   hn.a f,
   aba<cyu> g,
   aba<cgx> h,
   long i,
   int j,
   int k,
   int l,
   boolean m,
   boolean n,
   boolean o,
   boolean p,
   Optional<hb> q
) implements tc<tf> {
   public ut(qx $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         cgu.a($$0.readByte()),
         cgu.b($$0.readByte()),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(hm.P)),
         $$0.<hn>a(hn.c).f(),
         $$0.a(hm.O),
         $$0.a(hm.P),
         $$0.readLong(),
         $$0.k(),
         $$0.k(),
         $$0.k(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(qx::i)
      );
   }

   @Override
   public void a(qx $$0) {
      $$0.writeInt(this.a);
      $$0.writeBoolean(this.b);
      $$0.writeByte(this.c.a());
      $$0.writeByte(cgu.a(this.d));
      $$0.a(this.e, qx::b);
      $$0.a(hn.c, this.f);
      $$0.b(this.g);
      $$0.b(this.h);
      $$0.writeLong(this.i);
      $$0.d(this.j);
      $$0.d(this.k);
      $$0.d(this.l);
      $$0.writeBoolean(this.m);
      $$0.writeBoolean(this.n);
      $$0.writeBoolean(this.o);
      $$0.writeBoolean(this.p);
      $$0.a(this.q, qx::a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }

   public cgu d() {
      return this.c;
   }

   @Nullable
   public cgu e() {
      return this.d;
   }

   public Set<aba<cgx>> f() {
      return this.e;
   }

   public hn.a g() {
      return this.f;
   }

   public aba<cyu> h() {
      return this.g;
   }

   public aba<cgx> i() {
      return this.h;
   }

   public long j() {
      return this.i;
   }

   public int k() {
      return this.j;
   }

   public int l() {
      return this.k;
   }

   public int m() {
      return this.l;
   }

   public boolean n() {
      return this.m;
   }

   public boolean o() {
      return this.n;
   }

   public boolean p() {
      return this.o;
   }

   public boolean q() {
      return this.p;
   }

   public Optional<hb> r() {
      return this.q;
   }
}
