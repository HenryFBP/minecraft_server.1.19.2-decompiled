import com.google.gson.JsonObject;

public interface cdr<T extends cdp<?>> {
   cdr<cdu> a = a("crafting_shaped", new cdu.a());
   cdr<cdv> b = a("crafting_shapeless", new cdv.a());
   cdz<cdc> c = a("crafting_special_armordye", new cdz<>(cdc::new));
   cdz<cdf> d = a("crafting_special_bookcloning", new cdz<>(cdf::new));
   cdz<cdn> e = a("crafting_special_mapcloning", new cdz<>(cdn::new));
   cdz<cdo> f = a("crafting_special_mapextending", new cdz<>(cdo::new));
   cdz<cdj> g = a("crafting_special_firework_rocket", new cdz<>(cdj::new));
   cdz<cdl> h = a("crafting_special_firework_star", new cdz<>(cdl::new));
   cdz<cdk> i = a("crafting_special_firework_star_fade", new cdz<>(cdk::new));
   cdz<cef> j = a("crafting_special_tippedarrow", new cdz<>(cef::new));
   cdz<cdd> k = a("crafting_special_bannerduplicate", new cdz<>(cdd::new));
   cdz<cdw> l = a("crafting_special_shielddecoration", new cdz<>(cdw::new));
   cdz<cdx> m = a("crafting_special_shulkerboxcoloring", new cdz<>(cdx::new));
   cdz<cee> n = a("crafting_special_suspiciousstew", new cdz<>(cee::new));
   cdz<cdt> o = a("crafting_special_repairitem", new cdz<>(cdt::new));
   cdy<ceb> p = a("smelting", new cdy<>(ceb::new, 200));
   cdy<cde> q = a("blasting", new cdy<>(cde::new, 100));
   cdy<cec> r = a("smoking", new cdy<>(cec::new, 100));
   cdy<cdg> s = a("campfire_cooking", new cdy<>(cdg::new, 100));
   cdr<ced> t = a("stonecutting", new cea.a<>(ced::new));
   cdr<ceg> u = a("smithing", new ceg.a());

   T a(abb var1, JsonObject var2);

   T a(abb var1, qx var2);

   void a(qx var1, T var2);

   static <S extends cdr<T>, T extends cdp<?>> S a(String $$0, S $$1) {
      return hm.a(hm.aj, $$0, $$1);
   }
}
