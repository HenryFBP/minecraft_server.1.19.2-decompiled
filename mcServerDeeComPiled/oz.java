import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;

public class oz {
   private static final int a = 200;
   private static final int b = 1024;
   private static final int c = 15;
   private static final int d = 200;
   private static final int e = 3;
   private static final int f = 10000;
   private static final int g = 5;
   private static final int h = 5;
   private static final int i = 5;

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a(
                                             "test"
                                          )
                                          .then(ds.a("runthis").executes($$0x -> a((dr)$$0x.getSource()))))
                                       .then(ds.a("runthese").executes($$0x -> b((dr)$$0x.getSource()))))
                                    .then(
                                       ((LiteralArgumentBuilder)ds.a("runfailed").executes($$0x -> a((dr)$$0x.getSource(), false, 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)ds.a("onlyRequiredTests", BoolArgumentType.bool())
                                                   .executes($$0x -> a((dr)$$0x.getSource(), BoolArgumentType.getBool($$0x, "onlyRequiredTests"), 0, 8)))
                                                .then(
                                                   ((RequiredArgumentBuilder)ds.a("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dr)$$0x.getSource(),
                                                                  BoolArgumentType.getBool($$0x, "onlyRequiredTests"),
                                                                  IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         ds.a("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dr)$$0x.getSource(),
                                                                     BoolArgumentType.getBool($$0x, "onlyRequiredTests"),
                                                                     IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                     IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ds.a("run")
                                       .then(
                                          ((RequiredArgumentBuilder)ds.a("testName", pb.a())
                                                .executes($$0x -> a((dr)$$0x.getSource(), pb.a($$0x, "testName"), 0)))
                                             .then(
                                                ds.a("rotationSteps", IntegerArgumentType.integer())
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            pb.a($$0x, "testName"),
                                                            IntegerArgumentType.getInteger($$0x, "rotationSteps")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("runall").executes($$0x -> a((dr)$$0x.getSource(), 0, 8)))
                                       .then(
                                          ((RequiredArgumentBuilder)ds.a("testClassName", oy.a())
                                                .executes($$0x -> a((dr)$$0x.getSource(), oy.a($$0x, "testClassName"), 0, 8)))
                                             .then(
                                                ((RequiredArgumentBuilder)ds.a("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               oy.a($$0x, "testClassName"),
                                                               IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                               8
                                                            )
                                                      ))
                                                   .then(
                                                      ds.a("testsPerRow", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dr)$$0x.getSource(),
                                                                  oy.a($$0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                                  IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ds.a("rotationSteps", IntegerArgumentType.integer())
                                             .executes($$0x -> a((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "rotationSteps"), 8)))
                                          .then(
                                             ds.a("testsPerRow", IntegerArgumentType.integer())
                                                .executes(
                                                   $$0x -> a(
                                                         (dr)$$0x.getSource(),
                                                         IntegerArgumentType.getInteger($$0x, "rotationSteps"),
                                                         IntegerArgumentType.getInteger($$0x, "testsPerRow")
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ds.a("export")
                                 .then(
                                    ds.a("testName", StringArgumentType.word())
                                       .executes($$0x -> c((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                                 )
                           ))
                        .then(ds.a("exportthis").executes($$0x -> c((dr)$$0x.getSource()))))
                     .then(
                        ds.a("import")
                           .then(
                              ds.a("testName", StringArgumentType.word())
                                 .executes($$0x -> d((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "testName")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)ds.a("pos").executes($$0x -> a((dr)$$0x.getSource(), "pos")))
                        .then(ds.a("var", StringArgumentType.word()).executes($$0x -> a((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
                  ))
               .then(
                  ds.a("create")
                     .then(
                        ((RequiredArgumentBuilder)ds.a("testName", StringArgumentType.word())
                              .executes($$0x -> a((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "testName"), 5, 5, 5)))
                           .then(
                              ((RequiredArgumentBuilder)ds.a("width", IntegerArgumentType.integer())
                                    .executes(
                                       $$0x -> a(
                                             (dr)$$0x.getSource(),
                                             StringArgumentType.getString($$0x, "testName"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "width")
                                          )
                                    ))
                                 .then(
                                    ds.a("height", IntegerArgumentType.integer())
                                       .then(
                                          ds.a("depth", IntegerArgumentType.integer())
                                             .executes(
                                                $$0x -> a(
                                                      (dr)$$0x.getSource(),
                                                      StringArgumentType.getString($$0x, "testName"),
                                                      IntegerArgumentType.getInteger($$0x, "width"),
                                                      IntegerArgumentType.getInteger($$0x, "height"),
                                                      IntegerArgumentType.getInteger($$0x, "depth")
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)ds.a("clearall").executes($$0x -> a((dr)$$0x.getSource(), 200)))
                  .then(
                     ds.a("radius", IntegerArgumentType.integer()).executes($$0x -> a((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "radius")))
                  )
            )
      );
   }

   private static int a(dr $$0, String $$1, int $$2, int $$3, int $$4) {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         agg $$5 = $$0.f();
         gt $$6 = new gt($$0.e());
         gt $$7 = new gt($$6.u(), $$0.f().a(dar.a.b, $$6).v(), $$6.w() + 3);
         ow.a($$1.toLowerCase(), $$7, new hs($$2, $$3, $$4), cpw.a, $$5);

         for(int $$8 = 0; $$8 < $$2; ++$$8) {
            for(int $$9 = 0; $$9 < $$4; ++$$9) {
               gt $$10 = new gt($$7.u() + $$8, $$7.v() + 1, $$7.w() + $$9);
               cjt $$11 = cju.h;
               fc $$12 = new fc($$11.m(), Collections.emptySet(), null);
               $$12.a($$5, $$10, 2);
            }
         }

         ow.a($$7, new gt(1, 0, -1), cpw.a, $$5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   private static int a(dr $$0, String $$1) throws CommandSyntaxException {
      dwm $$2 = (dwm)$$0.i().a(10.0, 1.0F, false);
      gt $$3 = $$2.a();
      agg $$4 = $$0.f();
      Optional<gt> $$5 = ow.a($$3, 15, $$4);
      if (!$$5.isPresent()) {
         $$5 = ow.a($$3, 200, $$4);
      }

      if (!$$5.isPresent()) {
         $$0.b(rq.b("Can't find a structure block that contains the targeted pos " + $$3));
         return 0;
      } else {
         cuo $$6 = (cuo)$$4.c_((gt)$$5.get());
         gt $$7 = $$3.b((hs)$$5.get());
         String $$8 = $$7.u() + ", " + $$7.v() + ", " + $$7.w();
         String $$9 = $$6.f();
         rq $$10 = rq.b($$8)
            .b(
               sj.a
                  .a(true)
                  .a(p.k)
                  .a(new rv(rv.a.a, rq.b("Click to copy to clipboard")))
                  .a(new ro(ro.a.f, "final BlockPos " + $$1 + " = new BlockPos(" + $$8 + ");"))
            );
         $$0.a(rq.b("Position relative to " + $$9 + ": ").b($$10), false);
         xl.a($$4, new gt($$3), $$8, -2147418368, 10000);
         return 1;
      }
   }

   private static int a(dr $$0) {
      gt $$1 = new gt($$0.e());
      agg $$2 = $$0.f();
      gt $$3 = ow.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", p.m);
         return 0;
      } else {
         om.a($$2);
         a($$2, $$3, null);
         return 1;
      }
   }

   private static int b(dr $$0) {
      gt $$1 = new gt($$0.e());
      agg $$2 = $$0.f();
      Collection<gt> $$3 = ow.c($$1, 200, $$2);
      if ($$3.isEmpty()) {
         a($$2, "Couldn't find any structure blocks within 200 block radius", p.m);
         return 1;
      } else {
         om.a($$2);
         b($$0, "Running " + $$3.size() + " tests...");
         ou $$4 = new ou();
         $$3.forEach($$2x -> a($$2, $$2x, $$4));
         return 1;
      }
   }

   private static void a(agg $$0, gt $$1, @Nullable ou $$2) {
      cuo $$3 = (cuo)$$0.c_($$1);
      String $$4 = $$3.f();
      pa $$5 = ol.f($$4);
      oj $$6 = new oj($$5, $$3.w(), $$0);
      if ($$2 != null) {
         $$2.a($$6);
         $$6.a(new oz.a($$0, $$2));
      }

      a($$5, $$0);
      dwl $$7 = ow.a($$3);
      gt $$8 = new gt($$7.a, $$7.b, $$7.c);
      om.a($$6, $$8, op.a);
   }

   static void a(agg $$0, ou $$1) {
      if ($$1.i()) {
         a($$0, "GameTest done! " + $$1.h() + " tests were run", p.p);
         if ($$1.d()) {
            a($$0, $$1.a() + " required tests failed :(", p.m);
         } else {
            a($$0, "All required tests passed :)", p.k);
         }

         if ($$1.e()) {
            a($$0, $$1.b() + " optional tests failed", p.h);
         }
      }

   }

   private static int a(dr $$0, int $$1) {
      agg $$2 = $$0.f();
      om.a($$2);
      gt $$3 = new gt($$0.e().c, (double)$$0.f().a(dar.a.b, new gt($$0.e())).v(), $$0.e().e);
      om.a($$2, $$3, op.a, ami.a($$1, 0, 1024));
      return 1;
   }

   private static int a(dr $$0, pa $$1, int $$2) {
      agg $$3 = $$0.f();
      gt $$4 = new gt($$0.e());
      int $$5 = $$0.f().a(dar.a.b, $$4).v();
      gt $$6 = new gt($$4.u(), $$5, $$4.w() + 3);
      om.a($$3);
      a($$1, $$3);
      cpw $$7 = ow.a($$2);
      oj $$8 = new oj($$1, $$7, $$3);
      om.a($$8, $$6, op.a);
      return 1;
   }

   private static void a(pa $$0, agg $$1) {
      Consumer<agg> $$2 = ol.c($$0.e());
      if ($$2 != null) {
         $$2.accept($$1);
      }

   }

   private static int a(dr $$0, int $$1, int $$2) {
      om.a($$0.f());
      Collection<pa> $$3 = ol.a();
      b($$0, "Running all " + $$3.size() + " tests...");
      ol.d();
      a($$0, $$3, $$1, $$2);
      return 1;
   }

   private static int a(dr $$0, String $$1, int $$2, int $$3) {
      Collection<pa> $$4 = ol.a($$1);
      om.a($$0.f());
      b($$0, "Running " + $$4.size() + " tests from " + $$1 + "...");
      ol.d();
      a($$0, $$4, $$2, $$3);
      return 1;
   }

   private static int a(dr $$0, boolean $$1, int $$2, int $$3) {
      Collection<pa> $$4;
      if ($$1) {
         $$4 = (Collection)ol.c().stream().filter(pa::d).collect(Collectors.toList());
      } else {
         $$4 = ol.c();
      }

      if ($$4.isEmpty()) {
         b($$0, "No failed tests to rerun");
         return 0;
      } else {
         om.a($$0.f());
         b($$0, "Rerunning " + $$4.size() + " failed tests (" + ($$1 ? "only required tests" : "including optional tests") + ")");
         a($$0, $$4, $$2, $$3);
         return 1;
      }
   }

   private static void a(dr $$0, Collection<pa> $$1, int $$2, int $$3) {
      gt $$4 = new gt($$0.e());
      gt $$5 = new gt($$4.u(), $$0.f().a(dar.a.b, $$4).v(), $$4.w() + 3);
      agg $$6 = $$0.f();
      cpw $$7 = ow.a($$2);
      Collection<oj> $$8 = om.b($$1, $$5, $$7, $$6, op.a, $$3);
      ou $$9 = new ou($$8);
      $$9.a(new oz.a($$6, $$9));
      $$9.a($$0x -> ol.a($$0x.v()));
   }

   private static void b(dr $$0, String $$1) {
      $$0.a(rq.b($$1), false);
   }

   private static int c(dr $$0) {
      gt $$1 = new gt($$0.e());
      agg $$2 = $$0.f();
      gt $$3 = ow.b($$1, 15, $$2);
      if ($$3 == null) {
         a($$2, "Couldn't find any structure block within 15 radius", p.m);
         return 0;
      } else {
         cuo $$4 = (cuo)$$2.c_($$3);
         String $$5 = $$4.f();
         return c($$0, $$5);
      }
   }

   private static int c(dr $$0, String $$1) {
      Path $$2 = Paths.get(ow.b);
      abb $$3 = new abb("minecraft", $$1);
      Path $$4 = $$0.f().p().a($$3, ".nbt");
      Path $$5 = ld.a(ix.a, $$4, $$1, $$2);
      if ($$5 == null) {
         b($$0, "Failed to export " + $$4);
         return 1;
      } else {
         try {
            Files.createDirectories($$5.getParent());
         } catch (IOException var7) {
            b($$0, "Could not create folder " + $$5.getParent());
            var7.printStackTrace();
            return 1;
         }

         b($$0, "Exported " + $$1 + " to " + $$5.toAbsolutePath());
         return 0;
      }
   }

   private static int d(dr $$0, String $$1) {
      Path $$2 = Paths.get(ow.b, $$1 + ".snbt");
      abb $$3 = new abb("minecraft", $$1);
      Path $$4 = $$0.f().p().a($$3, ".nbt");

      try {
         BufferedReader $$5 = Files.newBufferedReader($$2);
         String $$6 = IOUtils.toString($$5);
         Files.createDirectories($$4.getParent());
         OutputStream $$7 = Files.newOutputStream($$4);

         try {
            pt.a(pv.a($$6), $$7);
         } catch (Throwable var11) {
            if ($$7 != null) {
               try {
                  $$7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if ($$7 != null) {
            $$7.close();
         }

         b($$0, "Imported to " + $$4.toAbsolutePath());
         return 0;
      } catch (CommandSyntaxException | IOException var12) {
         System.err.println("Failed to load structure " + $$1);
         var12.printStackTrace();
         return 1;
      }
   }

   private static void a(agg $$0, String $$1, p $$2) {
      $$0.a((Predicate<? super agh>)($$0x -> true)).forEach($$2x -> $$2x.a(rq.b($$2 + $$1)));
   }

   static class a implements ok {
      private final agg a;
      private final ou b;

      public a(agg $$0, ou $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(oj $$0) {
      }

      @Override
      public void b(oj $$0) {
         oz.a(this.a, this.b);
      }

      @Override
      public void c(oj $$0) {
         oz.a(this.a, this.b);
      }
   }
}
