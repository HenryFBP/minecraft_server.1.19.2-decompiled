import java.util.List;

public record ql(List<String> a, qe<?> b, String c) {
   public ql(qe<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public ql(String $$0, qe<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public ql(String $$0, String $$1, qe<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
