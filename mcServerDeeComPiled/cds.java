public interface cds<T extends cdp<?>> {
   cds<cdh> a = a("crafting");
   cds<ceb> b = a("smelting");
   cds<cde> c = a("blasting");
   cds<cec> d = a("smoking");
   cds<cdg> e = a("campfire_cooking");
   cds<ced> f = a("stonecutting");
   cds<ceg> g = a("smithing");

   static <T extends cdp<?>> cds<T> a(final String $$0) {
      return hm.a(hm.ai, new abb($$0), new cds<T>() {
         public String toString() {
            return $$0;
         }
      });
   }
}
