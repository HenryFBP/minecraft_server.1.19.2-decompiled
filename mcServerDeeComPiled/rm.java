import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record rm(rn j, rn k) {
   public static final Codec<rm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(rn.a.fieldOf("chat").forGetter(rm::a), rn.a.fieldOf("narration").forGetter(rm::b)).apply($$0, rm::new)
   );
   public static final rn b = rn.a("chat.type.text");
   public static final aba<rm> c = a("chat");
   public static final aba<rm> d = a("say_command");
   public static final aba<rm> e = a("msg_command_incoming");
   public static final aba<rm> f = a("msg_command_outgoing");
   public static final aba<rm> g = a("team_msg_command_incoming");
   public static final aba<rm> h = a("team_msg_command_outgoing");
   public static final aba<rm> i = a("emote_command");

   private static aba<rm> a(String $$0) {
      return aba.a(hm.bI, new abb($$0));
   }

   public static hc<rm> a(hm<rm> $$0) {
      iw.a($$0, c, new rm(b, rn.a("chat.type.text.narrate")));
      iw.a($$0, d, new rm(rn.a("chat.type.announcement"), rn.a("chat.type.text.narrate")));
      iw.a($$0, e, new rm(rn.b("commands.message.display.incoming"), rn.a("chat.type.text.narrate")));
      iw.a($$0, f, new rm(rn.c("commands.message.display.outgoing"), rn.a("chat.type.text.narrate")));
      iw.a($$0, g, new rm(rn.d("chat.type.team.text"), rn.a("chat.type.text.narrate")));
      iw.a($$0, h, new rm(rn.d("chat.type.team.sent"), rn.a("chat.type.text.narrate")));
      return iw.a($$0, i, new rm(rn.a("chat.type.emote"), rn.a("chat.type.emote")));
   }

   public static rm.a a(aba<rm> $$0, bbn $$1) {
      return a($$0, $$1.s.s(), $$1.C_());
   }

   public static rm.a a(aba<rm> $$0, dr $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static rm.a a(aba<rm> $$0, hn $$1, rq $$2) {
      hm<rm> $$3 = $$1.d(hm.bI);
      return ((rm)$$3.g($$0)).a($$2);
   }

   public rm.a a(rq $$0) {
      return new rm.a(this, $$0);
   }

   public rn a() {
      return this.j;
   }

   public rn b() {
      return this.k;
   }

   public static record a(rm a, rq b, @Nullable rq c) {
      a(rm $$0, rq $$1) {
         this($$0, $$1, null);
      }

      public rq a(rq $$0) {
         return this.a.a().a($$0, this);
      }

      public rq b(rq $$0) {
         return this.a.b().a($$0, this);
      }

      public rm.a c(rq $$0) {
         return new rm.a(this.a, this.b, $$0);
      }

      public rm.b a(hn $$0) {
         hm<rm> $$1 = $$0.d(hm.bI);
         return new rm.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, rq b, @Nullable rq c) {
      public b(qx $$0) {
         this($$0.k(), $$0.j(), $$0.c(qx::j));
      }

      public void a(qx $$0) {
         $$0.d(this.a);
         $$0.a(this.b);
         $$0.a(this.c, qx::a);
      }

      public Optional<rm.a> a(hn $$0) {
         hm<rm> $$1 = $$0.d(hm.bI);
         rm $$2 = (rm)$$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new rm.a($$0x, this.b, this.c));
      }
   }
}
