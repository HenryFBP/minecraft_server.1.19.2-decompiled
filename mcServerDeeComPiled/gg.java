import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Locale;
import java.util.Map;

public class gg {
   private static final Map<Class<?>, gf<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends gf.a<A>> gf<A, T> a(hm<gf<?, ?>> $$0, String $$1, Class<? extends A> $$2, gf<A, T> $$3) {
      a.put($$2, $$3);
      return hm.a($$0, $$1, $$3);
   }

   public static gf<?, ?> a(hm<gf<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, gi.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new gl());
      a($$0, "brigadier:double", DoubleArgumentType.class, new gk());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new gm());
      a($$0, "brigadier:long", LongArgumentType.class, new gn());
      a($$0, "brigadier:string", StringArgumentType.class, new go());
      a($$0, "entity", eb.class, new eb.a());
      a($$0, "game_profile", ed.class, gi.a(ed::a));
      a($$0, "block_pos", fh.class, gi.a(fh::a));
      a($$0, "column_pos", fi.class, gi.a(fi::a));
      a($$0, "vec3", fo.class, gi.a(fo::a));
      a($$0, "vec2", fn.class, gi.a(fn::a));
      a($$0, "block_state", fe.class, gi.a(fe::a));
      a($$0, "block_predicate", fd.class, gi.a(fd::a));
      a($$0, "item_stack", ft.class, gi.a(ft::a));
      a($$0, "item_predicate", fw.class, gi.a(fw::a));
      a($$0, "color", dw.class, gi.a(dw::a));
      a($$0, "component", dx.class, gi.a(dx::a));
      a($$0, "message", ef.class, gi.a(ef::a));
      a($$0, "nbt_compound_tag", dy.class, gi.a(dy::a));
      a($$0, "nbt_tag", ei.class, gi.a(ei::a));
      a($$0, "nbt_path", eh.class, gi.a(eh::a));
      a($$0, "objective", ej.class, gi.a(ej::a));
      a($$0, "objective_criteria", ek.class, gi.a(ek::a));
      a($$0, "operation", el.class, gi.a(el::a));
      a($$0, "particle", em.class, gi.a(em::a));
      a($$0, "angle", du.class, gi.a(du::a));
      a($$0, "rotation", fl.class, gi.a(fl::a));
      a($$0, "scoreboard_slot", et.class, gi.a(et::a));
      a($$0, "score_holder", es.class, new es.a());
      a($$0, "swizzle", fm.class, gi.a(fm::a));
      a($$0, "team", ex.class, gi.a(ex::a));
      a($$0, "item_slot", ev.class, gi.a(ev::a));
      a($$0, "resource_location", eq.class, gi.a(eq::a));
      a($$0, "mob_effect", eg.class, gi.a(eg::a));
      a($$0, "function", fs.class, gi.a(fs::a));
      a($$0, "entity_anchor", ea.class, gi.a(ea::a));
      a($$0, "int_range", eo.b.class, gi.a(eo::a));
      a($$0, "float_range", eo.a.class, gi.a(eo::b));
      a($$0, "item_enchantment", ee.class, gi.a(ee::a));
      a($$0, "entity_summon", ec.class, gi.a(ec::a));
      a($$0, "dimension", dz.class, gi.a(dz::a));
      a($$0, "time", fa.class, gi.a(fa::a));
      a($$0, "resource_or_tag", b(er.class), new er.a());
      a($$0, "resource", b(ep.class), new ep.a());
      a($$0, "template_mirror", ey.class, gi.a(ey::a));
      a($$0, "template_rotation", ez.class, gi.a(ez::a));
      if (ab.aL) {
         a($$0, "test_argument", pb.class, gi.a(pb::a));
         a($$0, "test_class", oy.class, gi.a(oy::a));
      }

      return a($$0, "uuid", fb.class, gi.a(fb::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> gf<A, ?> a(A $$0) {
      gf<?, ?> $$1 = (gf)a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return $$1;
      }
   }

   public static <A extends ArgumentType<?>> gf.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
