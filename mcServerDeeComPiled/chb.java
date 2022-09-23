import com.mojang.serialization.Dynamic;

public final class chb {
   private final String a;
   private final cgu b;
   private final boolean c;
   private final bag d;
   private final boolean e;
   private final cgt f;
   private final cgl g;

   public chb(String $$0, cgu $$1, boolean $$2, bag $$3, boolean $$4, cgt $$5, cgl $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static chb a(Dynamic<?> $$0, cgl $$1) {
      cgu $$2 = cgu.a($$0.get("GameType").asInt(0));
      return new chb(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         (bag)$$0.get("Difficulty").asNumber().map($$0x -> bag.a($$0x.byteValue())).result().orElse(bag.c),
         $$0.get("allowCommands").asBoolean($$2 == cgu.b),
         new cgt($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cgu b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bag d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cgt f() {
      return this.f;
   }

   public cgl g() {
      return this.g;
   }

   public chb a(cgu $$0) {
      return new chb(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public chb a(bag $$0) {
      return new chb(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public chb a(cgl $$0) {
      return new chb(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public chb h() {
      return new chb(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
