import java.util.function.Consumer;

public class pa {
   private final String a;
   private final String b;
   private final String c;
   private final boolean d;
   private final int e;
   private final int f;
   private final Consumer<oi> g;
   private final int h;
   private final long i;
   private final cpw j;

   public pa(String $$0, String $$1, String $$2, int $$3, long $$4, boolean $$5, Consumer<oi> $$6) {
      this($$0, $$1, $$2, cpw.a, $$3, $$4, $$5, 1, 1, $$6);
   }

   public pa(String $$0, String $$1, String $$2, cpw $$3, int $$4, long $$5, boolean $$6, Consumer<oi> $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 1, 1, $$7);
   }

   public pa(String $$0, String $$1, String $$2, cpw $$3, int $$4, long $$5, boolean $$6, int $$7, int $$8, Consumer<oi> $$9) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.j = $$3;
      this.h = $$4;
      this.d = $$6;
      this.f = $$7;
      this.e = $$8;
      this.g = $$9;
      this.i = $$5;
   }

   public void a(oi $$0) {
      this.g.accept($$0);
   }

   public String a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public String toString() {
      return this.b;
   }

   public int c() {
      return this.h;
   }

   public boolean d() {
      return this.d;
   }

   public String e() {
      return this.a;
   }

   public long f() {
      return this.i;
   }

   public cpw g() {
      return this.j;
   }

   public boolean h() {
      return this.e > 1;
   }

   public int i() {
      return this.e;
   }

   public int j() {
      return this.f;
   }
}
