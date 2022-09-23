import java.util.Arrays;
import java.util.Collection;

public class rp {
   public static final rq a = rq.h();
   public static final rq b = rq.c("options.on");
   public static final rq c = rq.c("options.off");
   public static final rq d = rq.c("gui.done");
   public static final rq e = rq.c("gui.cancel");
   public static final rq f = rq.c("gui.yes");
   public static final rq g = rq.c("gui.no");
   public static final rq h = rq.c("gui.proceed");
   public static final rq i = rq.c("gui.back");
   public static final rq j = rq.c("gui.acknowledge");
   public static final rq k = rq.c("connect.failed");
   public static final rq l = rq.b("\n");
   public static final rq m = rq.b(". ");
   public static final rq n = rq.b("...");

   public static sb a(long $$0) {
      return rq.a("gui.days", $$0);
   }

   public static sb b(long $$0) {
      return rq.a("gui.hours", $$0);
   }

   public static sb c(long $$0) {
      return rq.a("gui.minutes", $$0);
   }

   public static rq a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static sb a(rq $$0, boolean $$1) {
      return rq.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static sb a(rq $$0, rq $$1) {
      return rq.a("options.generic_value", $$0, $$1);
   }

   public static sb b(rq $$0, rq $$1) {
      return rq.h().b($$0).b(m).b($$1);
   }

   public static rq a(rq... $$0) {
      return a(Arrays.asList($$0));
   }

   public static rq a(Collection<? extends rq> $$0) {
      return rs.a($$0, l);
   }
}
