import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class pv {
   private static final Comparator<pp> b = Comparator.comparingInt($$0 -> $$0.e(1)).thenComparingInt($$0 -> $$0.e(0)).thenComparingInt($$0 -> $$0.e(2));
   private static final Comparator<pp> c = Comparator.comparingDouble($$0 -> $$0.h(1))
      .thenComparingDouble($$0 -> $$0.h(0))
      .thenComparingDouble($$0 -> $$0.h(2));
   public static final String a = "data";
   private static final char d = '{';
   private static final char e = '}';
   private static final String f = ",";
   private static final char g = ':';
   private static final Splitter h = Splitter.on(",");
   private static final Splitter i = Splitter.on(':').limit(2);
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 2;
   private static final int l = -1;

   private pv() {
   }

   @Nullable
   public static GameProfile a(pj $$0) {
      String $$1 = null;
      UUID $$2 = null;
      if ($$0.b("Name", 8)) {
         $$1 = $$0.l("Name");
      }

      if ($$0.b("Id")) {
         $$2 = $$0.a("Id");
      }

      try {
         GameProfile $$3 = new GameProfile($$2, $$1);
         if ($$0.b("Properties", 10)) {
            pj $$4 = $$0.p("Properties");

            for(String $$5 : $$4.d()) {
               pp $$6 = $$4.c($$5, 10);

               for(int $$7 = 0; $$7 < $$6.size(); ++$$7) {
                  pj $$8 = $$6.a($$7);
                  String $$9 = $$8.l("Value");
                  if ($$8.b("Signature", 8)) {
                     $$3.getProperties().put($$5, new Property($$5, $$9, $$8.l("Signature")));
                  } else {
                     $$3.getProperties().put($$5, new Property($$5, $$9));
                  }
               }
            }
         }

         return $$3;
      } catch (Throwable var11) {
         return null;
      }
   }

   public static pj a(pj $$0, GameProfile $$1) {
      if (!amx.b($$1.getName())) {
         $$0.a("Name", $$1.getName());
      }

      if ($$1.getId() != null) {
         $$0.a("Id", $$1.getId());
      }

      if (!$$1.getProperties().isEmpty()) {
         pj $$2 = new pj();

         for(String $$3 : $$1.getProperties().keySet()) {
            pp $$4 = new pp();

            for(Property $$5 : $$1.getProperties().get($$3)) {
               pj $$6 = new pj();
               $$6.a("Value", $$5.getValue());
               if ($$5.hasSignature()) {
                  $$6.a("Signature", $$5.getSignature());
               }

               $$4.add($$6);
            }

            $$2.a($$3, (qc)$$4);
         }

         $$0.a("Properties", (qc)$$2);
      }

      return $$0;
   }

   @VisibleForTesting
   public static boolean a(@Nullable qc $$0, @Nullable qc $$1, boolean $$2) {
      if ($$0 == $$1) {
         return true;
      } else if ($$0 == null) {
         return true;
      } else if ($$1 == null) {
         return false;
      } else if (!$$0.getClass().equals($$1.getClass())) {
         return false;
      } else if ($$0 instanceof pj $$3) {
         pj $$4 = (pj)$$1;

         for(String $$5 : $$3.d()) {
            qc $$6 = $$3.c($$5);
            if (!a($$6, $$4.c($$5), $$2)) {
               return false;
            }
         }

         return true;
      } else if ($$0 instanceof pp $$7 && $$2) {
         pp $$8 = (pp)$$1;
         if ($$7.isEmpty()) {
            return $$8.isEmpty();
         } else {
            for(int $$9 = 0; $$9 < $$7.size(); ++$$9) {
               qc $$10 = $$7.k($$9);
               boolean $$11 = false;

               for(int $$12 = 0; $$12 < $$8.size(); ++$$12) {
                  if (a($$10, $$8.k($$12), $$2)) {
                     $$11 = true;
                     break;
                  }
               }

               if (!$$11) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return $$0.equals($$1);
      }
   }

   public static pn a(UUID $$0) {
      return new pn(hr.a($$0));
   }

   public static UUID a(qc $$0) {
      if ($$0.b() != pn.a) {
         throw new IllegalArgumentException("Expected UUID-Tag to be of type " + pn.a.a() + ", but found " + $$0.b().a() + ".");
      } else {
         int[] $$1 = ((pn)$$0).f();
         if ($$1.length != 4) {
            throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + $$1.length + ".");
         } else {
            return hr.a($$1);
         }
      }
   }

   public static gt b(pj $$0) {
      return new gt($$0.h("X"), $$0.h("Y"), $$0.h("Z"));
   }

   public static pj a(gt $$0) {
      pj $$1 = new pj();
      $$1.a("X", $$0.u());
      $$1.a("Y", $$0.v());
      $$1.a("Z", $$0.w());
      return $$1;
   }

   public static cvo c(pj $$0) {
      if (!$$0.b("Name", 8)) {
         return cju.a.m();
      } else {
         cjt $$1 = hm.V.a(new abb($$0.l("Name")));
         cvo $$2 = $$1.m();
         if ($$0.b("Properties", 10)) {
            pj $$3 = $$0.p("Properties");
            cvp<cjt, cvo> $$4 = $$1.k();

            for(String $$5 : $$3.d()) {
               cwr<?> $$6 = $$4.a($$5);
               if ($$6 != null) {
                  $$2 = a($$2, $$6, $$5, $$3, $$0);
               }
            }
         }

         return $$2;
      }
   }

   private static <S extends cvq<?, S>, T extends Comparable<T>> S a(S $$0, cwr<T> $$1, String $$2, pj $$3, pj $$4) {
      Optional<T> $$5 = $$1.b($$3.l($$2));
      if ($$5.isPresent()) {
         return $$0.a($$1, (Comparable)$$5.get());
      } else {
         j.warn("Unable to read property: {} with value: {} for blockstate: {}", new Object[]{$$2, $$3.l($$2), $$4.toString()});
         return $$0;
      }
   }

   public static pj a(cvo $$0) {
      pj $$1 = new pj();
      $$1.a("Name", hm.V.b($$0.b()).toString());
      ImmutableMap<cwr<?>, Comparable<?>> $$2 = $$0.w();
      if (!$$2.isEmpty()) {
         pj $$3 = new pj();
         UnmodifiableIterator var4 = $$2.entrySet().iterator();

         while(var4.hasNext()) {
            Entry<cwr<?>, Comparable<?>> $$4 = (Entry)var4.next();
            cwr<?> $$5 = (cwr)$$4.getKey();
            $$3.a($$5.f(), a($$5, (Comparable<?>)$$4.getValue()));
         }

         $$1.a("Properties", (qc)$$3);
      }

      return $$1;
   }

   public static pj a(dpv $$0) {
      pj $$1 = new pj();
      $$1.a("Name", hm.T.b($$0.a()).toString());
      ImmutableMap<cwr<?>, Comparable<?>> $$2 = $$0.w();
      if (!$$2.isEmpty()) {
         pj $$3 = new pj();
         UnmodifiableIterator var4 = $$2.entrySet().iterator();

         while(var4.hasNext()) {
            Entry<cwr<?>, Comparable<?>> $$4 = (Entry)var4.next();
            cwr<?> $$5 = (cwr)$$4.getKey();
            $$3.a($$5.f(), a($$5, (Comparable<?>)$$4.getValue()));
         }

         $$1.a("Properties", (qc)$$3);
      }

      return $$1;
   }

   private static <T extends Comparable<T>> String a(cwr<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }

   public static String b(qc $$0) {
      return a($$0, false);
   }

   public static String a(qc $$0, boolean $$1) {
      return a(new StringBuilder(), $$0, 0, $$1).toString();
   }

   public static StringBuilder a(StringBuilder $$0, qc $$1, int $$2, boolean $$3) {
      switch($$1.a()) {
         case 0:
            break;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 8:
            $$0.append($$1);
            break;
         case 7:
            pg $$4 = (pg)$$1;
            byte[] $$5 = $$4.d();
            int $$6 = $$5.length;
            a($$2, $$0).append("byte[").append($$6).append("] {\n");
            if (!$$3) {
               a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
            } else {
               a($$2 + 1, $$0);

               for(int $$7 = 0; $$7 < $$5.length; ++$$7) {
                  if ($$7 != 0) {
                     $$0.append(',');
                  }

                  if ($$7 % 16 == 0 && $$7 / 16 > 0) {
                     $$0.append('\n');
                     if ($$7 < $$5.length) {
                        a($$2 + 1, $$0);
                     }
                  } else if ($$7 != 0) {
                     $$0.append(' ');
                  }

                  $$0.append(String.format(Locale.ROOT, "0x%02X", $$5[$$7] & 255));
               }
            }

            $$0.append('\n');
            a($$2, $$0).append('}');
            break;
         case 9:
            pp $$8 = (pp)$$1;
            int $$9 = $$8.size();
            int $$10 = $$8.e();
            String $$11 = $$10 == 0 ? "undefined" : qf.a($$10).b();
            a($$2, $$0).append("list<").append($$11).append(">[").append($$9).append("] [");
            if ($$9 != 0) {
               $$0.append('\n');
            }

            for(int $$12 = 0; $$12 < $$9; ++$$12) {
               if ($$12 != 0) {
                  $$0.append(",\n");
               }

               a($$2 + 1, $$0);
               a($$0, $$8.k($$12), $$2 + 1, $$3);
            }

            if ($$9 != 0) {
               $$0.append('\n');
            }

            a($$2, $$0).append(']');
            break;
         case 10:
            pj $$19 = (pj)$$1;
            List<String> $$20 = Lists.newArrayList($$19.d());
            Collections.sort($$20);
            a($$2, $$0).append('{');
            if ($$0.length() - $$0.lastIndexOf("\n") > 2 * ($$2 + 1)) {
               $$0.append('\n');
               a($$2 + 1, $$0);
            }

            int $$21 = $$20.stream().mapToInt(String::length).max().orElse(0);
            String $$22 = Strings.repeat(" ", $$21);

            for(int $$23 = 0; $$23 < $$20.size(); ++$$23) {
               if ($$23 != 0) {
                  $$0.append(",\n");
               }

               String $$24 = (String)$$20.get($$23);
               a($$2 + 1, $$0).append('"').append($$24).append('"').append($$22, 0, $$22.length() - $$24.length()).append(": ");
               a($$0, $$19.c($$24), $$2 + 1, $$3);
            }

            if (!$$20.isEmpty()) {
               $$0.append('\n');
            }

            a($$2, $$0).append('}');
            break;
         case 11:
            pn $$13 = (pn)$$1;
            int[] $$14 = $$13.f();
            int $$15 = 0;

            for(int $$16 : $$14) {
               $$15 = Math.max($$15, String.format(Locale.ROOT, "%X", $$16).length());
            }

            int $$17 = $$14.length;
            a($$2, $$0).append("int[").append($$17).append("] {\n");
            if (!$$3) {
               a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
            } else {
               a($$2 + 1, $$0);

               for(int $$18 = 0; $$18 < $$14.length; ++$$18) {
                  if ($$18 != 0) {
                     $$0.append(',');
                  }

                  if ($$18 % 16 == 0 && $$18 / 16 > 0) {
                     $$0.append('\n');
                     if ($$18 < $$14.length) {
                        a($$2 + 1, $$0);
                     }
                  } else if ($$18 != 0) {
                     $$0.append(' ');
                  }

                  $$0.append(String.format(Locale.ROOT, "0x%0" + $$15 + "X", $$14[$$18]));
               }
            }

            $$0.append('\n');
            a($$2, $$0).append('}');
            break;
         case 12:
            pq $$25 = (pq)$$1;
            long[] $$26 = $$25.f();
            long $$27 = 0L;

            for(long $$28 : $$26) {
               $$27 = Math.max($$27, (long)String.format(Locale.ROOT, "%X", $$28).length());
            }

            long $$29 = (long)$$26.length;
            a($$2, $$0).append("long[").append($$29).append("] {\n");
            if (!$$3) {
               a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
            } else {
               a($$2 + 1, $$0);

               for(int $$30 = 0; $$30 < $$26.length; ++$$30) {
                  if ($$30 != 0) {
                     $$0.append(',');
                  }

                  if ($$30 % 16 == 0 && $$30 / 16 > 0) {
                     $$0.append('\n');
                     if ($$30 < $$26.length) {
                        a($$2 + 1, $$0);
                     }
                  } else if ($$30 != 0) {
                     $$0.append(' ');
                  }

                  $$0.append(String.format(Locale.ROOT, "0x%0" + $$27 + "X", $$26[$$30]));
               }
            }

            $$0.append('\n');
            a($$2, $$0).append('}');
            break;
         default:
            $$0.append("<UNKNOWN :(>");
      }

      return $$0;
   }

   private static StringBuilder a(int $$0, StringBuilder $$1) {
      int $$2 = $$1.lastIndexOf("\n") + 1;
      int $$3 = $$1.length() - $$2;

      for(int $$4 = 0; $$4 < 2 * $$0 - $$3; ++$$4) {
         $$1.append(' ');
      }

      return $$1;
   }

   public static pj a(DataFixer $$0, ani $$1, pj $$2, int $$3) {
      return a($$0, $$1, $$2, $$3, ab.b().getWorldVersion());
   }

   public static pj a(DataFixer $$0, ani $$1, pj $$2, int $$3, int $$4) {
      return (pj)$$0.update($$1.a(), new Dynamic(pu.a, $$2), $$3, $$4).getValue();
   }

   public static rq c(qc $$0) {
      return new qh("", 0).a($$0);
   }

   public static String d(pj $$0) {
      return new py().a((qc)e($$0));
   }

   public static pj a(String $$0) throws CommandSyntaxException {
      return f(qd.a($$0));
   }

   @VisibleForTesting
   static pj e(pj $$0) {
      boolean $$1 = $$0.b("palettes", 9);
      pp $$2;
      if ($$1) {
         $$2 = $$0.c("palettes", 9).b(0);
      } else {
         $$2 = $$0.c("palette", 10);
      }

      pp $$4 = (pp)$$2.stream().map(pj.class::cast).map(pv::g).map(qa::a).collect(Collectors.toCollection(pp::new));
      $$0.a("palette", (qc)$$4);
      if ($$1) {
         pp $$5 = new pp();
         pp $$6 = $$0.c("palettes", 9);
         $$6.stream().map(pp.class::cast).forEach($$2 -> {
            pj $$3x = new pj();

            for(int $$4x = 0; $$4x < $$2.size(); ++$$4x) {
               $$3x.a($$4.j($$4x), g($$2.a($$4x)));
            }

            $$5.add($$3x);
         });
         $$0.a("palettes", (qc)$$5);
      }

      if ($$0.b("entities", 10)) {
         pp $$7 = $$0.c("entities", 10);
         pp $$8 = (pp)$$7.stream().map(pj.class::cast).sorted(Comparator.comparing($$0x -> $$0x.c("pos", 6), c)).collect(Collectors.toCollection(pp::new));
         $$0.a("entities", (qc)$$8);
      }

      pp $$9 = (pp)$$0.c("blocks", 10)
         .stream()
         .map(pj.class::cast)
         .sorted(Comparator.comparing($$0x -> $$0x.c("pos", 3), b))
         .peek($$1x -> $$1x.a("state", $$4.j($$1x.h("state"))))
         .collect(Collectors.toCollection(pp::new));
      $$0.a("data", (qc)$$9);
      $$0.r("blocks");
      return $$0;
   }

   @VisibleForTesting
   static pj f(pj $$0) {
      pp $$1 = $$0.c("palette", 8);
      Map<String, qc> $$2 = (Map)$$1.stream().map(qa.class::cast).map(qa::e_).collect(ImmutableMap.toImmutableMap(Function.identity(), pv::b));
      if ($$0.b("palettes", 9)) {
         $$0.a(
            "palettes",
            (qc)$$0.c("palettes", 10)
               .stream()
               .map(pj.class::cast)
               .map($$1x -> (pp)$$2.keySet().stream().map($$1x::l).map(pv::b).collect(Collectors.toCollection(pp::new)))
               .collect(Collectors.toCollection(pp::new))
         );
         $$0.r("palette");
      } else {
         $$0.a("palette", (qc)$$2.values().stream().collect(Collectors.toCollection(pp::new)));
      }

      if ($$0.b("data", 9)) {
         Object2IntMap<String> $$3 = new Object2IntOpenHashMap();
         $$3.defaultReturnValue(-1);

         for(int $$4 = 0; $$4 < $$1.size(); ++$$4) {
            $$3.put($$1.j($$4), $$4);
         }

         pp $$5 = $$0.c("data", 10);

         for(int $$6 = 0; $$6 < $$5.size(); ++$$6) {
            pj $$7 = $$5.a($$6);
            String $$8 = $$7.l("state");
            int $$9 = $$3.getInt($$8);
            if ($$9 == -1) {
               throw new IllegalStateException("Entry " + $$8 + " missing from palette");
            }

            $$7.a("state", $$9);
         }

         $$0.a("blocks", (qc)$$5);
         $$0.r("data");
      }

      return $$0;
   }

   @VisibleForTesting
   static String g(pj $$0) {
      StringBuilder $$1 = new StringBuilder($$0.l("Name"));
      if ($$0.b("Properties", 10)) {
         pj $$2 = $$0.p("Properties");
         String $$3 = (String)$$2.d().stream().sorted().map($$1x -> $$1x + ":" + $$2.c($$1x).e_()).collect(Collectors.joining(","));
         $$1.append('{').append($$3).append('}');
      }

      return $$1.toString();
   }

   @VisibleForTesting
   static pj b(String $$0) {
      pj $$1 = new pj();
      int $$2 = $$0.indexOf(123);
      String $$3;
      if ($$2 >= 0) {
         $$3 = $$0.substring(0, $$2);
         pj $$4 = new pj();
         if ($$2 + 2 <= $$0.length()) {
            String $$5 = $$0.substring($$2 + 1, $$0.indexOf(125, $$2));
            h.split($$5).forEach($$2x -> {
               List<String> $$3 = i.splitToList($$2x);
               if ($$3.size() == 2) {
                  $$4.a((String)$$3.get(0), (String)$$3.get(1));
               } else {
                  j.error("Something went wrong parsing: '{}' -- incorrect gamedata!", $$0);
               }

            });
            $$1.a("Properties", (qc)$$4);
         }
      } else {
         $$3 = $$0;
      }

      $$1.a("Name", $$3);
      return $$1;
   }
}
