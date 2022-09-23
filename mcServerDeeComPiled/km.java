import java.util.Optional;
import java.util.stream.IntStream;

public class km {
   public static final kl a = a("cube", ko.c, ko.j, ko.k, ko.l, ko.m, ko.n, ko.o);
   public static final kl b = a("cube_directional", ko.c, ko.j, ko.k, ko.l, ko.m, ko.n, ko.o);
   public static final kl c = a("cube_all", ko.a);
   public static final kl d = a("cube_mirrored_all", "_mirrored", ko.a);
   public static final kl e = a("cube_north_west_mirrored_all", "_north_west_mirrored", ko.a);
   public static final kl f = a("cube_column", ko.d, ko.i);
   public static final kl g = a("cube_column_horizontal", "_horizontal", ko.d, ko.i);
   public static final kl h = a("cube_column_mirrored", "_mirrored", ko.d, ko.i);
   public static final kl i = a("cube_top", ko.f, ko.i);
   public static final kl j = a("cube_bottom_top", ko.f, ko.e, ko.i);
   public static final kl k = a("orientable", ko.f, ko.g, ko.i);
   public static final kl l = a("orientable_with_bottom", ko.f, ko.e, ko.i, ko.g);
   public static final kl m = a("orientable_vertical", "_vertical", ko.g, ko.i);
   public static final kl n = a("button", ko.b);
   public static final kl o = a("button_pressed", "_pressed", ko.b);
   public static final kl p = a("button_inventory", "_inventory", ko.b);
   public static final kl q = a("door_bottom_left", "_bottom_left", ko.f, ko.e);
   public static final kl r = a("door_bottom_left_open", "_bottom_left_open", ko.f, ko.e);
   public static final kl s = a("door_bottom_right", "_bottom_right", ko.f, ko.e);
   public static final kl t = a("door_bottom_right_open", "_bottom_right_open", ko.f, ko.e);
   public static final kl u = a("door_top_left", "_top_left", ko.f, ko.e);
   public static final kl v = a("door_top_left_open", "_top_left_open", ko.f, ko.e);
   public static final kl w = a("door_top_right", "_top_right", ko.f, ko.e);
   public static final kl x = a("door_top_right_open", "_top_right_open", ko.f, ko.e);
   public static final kl y = a("fence_post", "_post", ko.b);
   public static final kl z = a("fence_side", "_side", ko.b);
   public static final kl A = a("fence_inventory", "_inventory", ko.b);
   public static final kl B = a("template_wall_post", "_post", ko.r);
   public static final kl C = a("template_wall_side", "_side", ko.r);
   public static final kl D = a("template_wall_side_tall", "_side_tall", ko.r);
   public static final kl E = a("wall_inventory", "_inventory", ko.r);
   public static final kl F = a("template_fence_gate", ko.b);
   public static final kl G = a("template_fence_gate_open", "_open", ko.b);
   public static final kl H = a("template_fence_gate_wall", "_wall", ko.b);
   public static final kl I = a("template_fence_gate_wall_open", "_wall_open", ko.b);
   public static final kl J = a("pressure_plate_up", ko.b);
   public static final kl K = a("pressure_plate_down", "_down", ko.b);
   public static final kl L = a(ko.c);
   public static final kl M = a("slab", ko.e, ko.f, ko.i);
   public static final kl N = a("slab_top", "_top", ko.e, ko.f, ko.i);
   public static final kl O = a("leaves", ko.a);
   public static final kl P = a("stairs", ko.e, ko.f, ko.i);
   public static final kl Q = a("inner_stairs", "_inner", ko.e, ko.f, ko.i);
   public static final kl R = a("outer_stairs", "_outer", ko.e, ko.f, ko.i);
   public static final kl S = a("template_trapdoor_top", "_top", ko.b);
   public static final kl T = a("template_trapdoor_bottom", "_bottom", ko.b);
   public static final kl U = a("template_trapdoor_open", "_open", ko.b);
   public static final kl V = a("template_orientable_trapdoor_top", "_top", ko.b);
   public static final kl W = a("template_orientable_trapdoor_bottom", "_bottom", ko.b);
   public static final kl X = a("template_orientable_trapdoor_open", "_open", ko.b);
   public static final kl Y = a("pointed_dripstone", ko.p);
   public static final kl Z = a("cross", ko.p);
   public static final kl aa = a("tinted_cross", ko.p);
   public static final kl ab = a("flower_pot_cross", ko.q);
   public static final kl ac = a("tinted_flower_pot_cross", ko.q);
   public static final kl ad = a("rail_flat", ko.s);
   public static final kl ae = a("rail_curved", "_corner", ko.s);
   public static final kl af = a("template_rail_raised_ne", "_raised_ne", ko.s);
   public static final kl ag = a("template_rail_raised_sw", "_raised_sw", ko.s);
   public static final kl ah = a("carpet", ko.t);
   public static final kl ai = a("coral_fan", ko.x);
   public static final kl aj = a("coral_wall_fan", ko.x);
   public static final kl ak = a("template_glazed_terracotta", ko.u);
   public static final kl al = a("template_chorus_flower", ko.b);
   public static final kl am = a("template_daylight_detector", ko.f, ko.i);
   public static final kl an = a("template_glass_pane_noside", "_noside", ko.v);
   public static final kl ao = a("template_glass_pane_noside_alt", "_noside_alt", ko.v);
   public static final kl ap = a("template_glass_pane_post", "_post", ko.v, ko.w);
   public static final kl aq = a("template_glass_pane_side", "_side", ko.v, ko.w);
   public static final kl ar = a("template_glass_pane_side_alt", "_side_alt", ko.v, ko.w);
   public static final kl as = a("template_command_block", ko.g, ko.h, ko.i);
   public static final kl at = a("template_anvil", ko.f);
   public static final kl[] au = (kl[])IntStream.range(0, 8).mapToObj($$0 -> a("stem_growth" + $$0, "_stage" + $$0, ko.y)).toArray($$0 -> new kl[$$0]);
   public static final kl av = a("stem_fruit", ko.y, ko.z);
   public static final kl aw = a("crop", ko.A);
   public static final kl ax = a("template_farmland", ko.B, ko.f);
   public static final kl ay = a("template_fire_floor", ko.C);
   public static final kl az = a("template_fire_side", ko.C);
   public static final kl aA = a("template_fire_side_alt", ko.C);
   public static final kl aB = a("template_fire_up", ko.C);
   public static final kl aC = a("template_fire_up_alt", ko.C);
   public static final kl aD = a("template_campfire", ko.C, ko.I);
   public static final kl aE = a("template_lantern", ko.D);
   public static final kl aF = a("template_hanging_lantern", "_hanging", ko.D);
   public static final kl aG = a("template_torch", ko.G);
   public static final kl aH = a("template_torch_wall", ko.G);
   public static final kl aI = a("template_piston", ko.E, ko.e, ko.i);
   public static final kl aJ = a("template_piston_head", ko.E, ko.i, ko.F);
   public static final kl aK = a("template_piston_head_short", ko.E, ko.i, ko.F);
   public static final kl aL = a("template_seagrass", ko.b);
   public static final kl aM = a("template_turtle_egg", ko.a);
   public static final kl aN = a("template_two_turtle_eggs", ko.a);
   public static final kl aO = a("template_three_turtle_eggs", ko.a);
   public static final kl aP = a("template_four_turtle_eggs", ko.a);
   public static final kl aQ = a("template_single_face", ko.b);
   public static final kl aR = a("template_cauldron_level1", ko.L, ko.K, ko.c, ko.f, ko.e, ko.i);
   public static final kl aS = a("template_cauldron_level2", ko.L, ko.K, ko.c, ko.f, ko.e, ko.i);
   public static final kl aT = a("template_cauldron_full", ko.L, ko.K, ko.c, ko.f, ko.e, ko.i);
   public static final kl aU = a("template_azalea", ko.f, ko.i);
   public static final kl aV = a("template_potted_azalea_bush", ko.f, ko.i);
   public static final kl aW = b("generated", ko.H);
   public static final kl aX = b("handheld", ko.H);
   public static final kl aY = b("handheld_rod", ko.H);
   public static final kl aZ = b("template_shulker_box", ko.c);
   public static final kl ba = b("template_bed", ko.c);
   public static final kl bb = b("template_banner");
   public static final kl bc = b("template_skull");
   public static final kl bd = a("template_candle", ko.a, ko.c);
   public static final kl be = a("template_two_candles", ko.a, ko.c);
   public static final kl bf = a("template_three_candles", ko.a, ko.c);
   public static final kl bg = a("template_four_candles", ko.a, ko.c);
   public static final kl bh = a("template_cake_with_candle", ko.J, ko.e, ko.i, ko.f, ko.c);
   public static final kl bi = a("template_sculk_shrieker", ko.e, ko.i, ko.f, ko.c, ko.M);

   private static kl a(ko... $$0) {
      return new kl(Optional.empty(), Optional.empty(), $$0);
   }

   private static kl a(String $$0, ko... $$1) {
      return new kl(Optional.of(new abb("minecraft", "block/" + $$0)), Optional.empty(), $$1);
   }

   private static kl b(String $$0, ko... $$1) {
      return new kl(Optional.of(new abb("minecraft", "item/" + $$0)), Optional.empty(), $$1);
   }

   private static kl a(String $$0, String $$1, ko... $$2) {
      return new kl(Optional.of(new abb("minecraft", "block/" + $$0)), Optional.of($$1), $$2);
   }
}
