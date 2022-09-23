import org.jetbrains.annotations.Nullable;

public record ts(int a, @Nullable rq b) implements tc<tf> {
   public ts(qx $$0) {
      this($$0.readInt(), $$0.c(qx::j));
   }

   @Override
   public void a(qx $$0) {
      $$0.writeInt(this.a);
      $$0.a(this.b, qx::a);
   }

   @Override
   public boolean a() {
      return true;
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   @Nullable
   public rq c() {
      return this.b;
   }
}
