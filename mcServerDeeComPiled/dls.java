import java.util.Locale;

public interface dls {
   dls a = a(dmx.a::new, "MSCorridor");
   dls b = a(dmx.b::new, "MSCrossing");
   dls c = a(dmx.d::new, "MSRoom");
   dls d = a(dmx.e::new, "MSStairs");
   dls e = a(dmz.a::new, "NeBCr");
   dls f = a(dmz.b::new, "NeBEF");
   dls g = a(dmz.c::new, "NeBS");
   dls h = a(dmz.d::new, "NeCCS");
   dls i = a(dmz.e::new, "NeCTB");
   dls j = a(dmz.f::new, "NeCE");
   dls k = a(dmz.g::new, "NeSCSC");
   dls l = a(dmz.h::new, "NeSCLT");
   dls m = a(dmz.i::new, "NeSC");
   dls n = a(dmz.j::new, "NeSCRT");
   dls o = a(dmz.k::new, "NeCSR");
   dls p = a(dmz.l::new, "NeMT");
   dls q = a(dmz.o::new, "NeRC");
   dls r = a(dmz.p::new, "NeSR");
   dls s = a(dmz.q::new, "NeStart");
   dls t = a(dnl.a::new, "SHCC");
   dls u = a(dnl.b::new, "SHFC");
   dls v = a(dnl.c::new, "SH5C");
   dls w = a(dnl.d::new, "SHLT");
   dls x = a(dnl.e::new, "SHLi");
   dls y = a(dnl.g::new, "SHPR");
   dls z = a(dnl.h::new, "SHPH");
   dls A = a(dnl.i::new, "SHRT");
   dls B = a(dnl.j::new, "SHRC");
   dls C = a(dnl.l::new, "SHSD");
   dls D = a(dnl.m::new, "SHStart");
   dls E = a(dnl.n::new, "SHS");
   dls F = a(dnl.o::new, "SHSSD");
   dls G = a(dmv::new, "TeJP");
   dls H = a(dnf.a::new, "ORP");
   dls I = a(dms.a::new, "Iglu");
   dls J = a(dnh::new, "RUPO");
   dls K = a(dnn::new, "TeSH");
   dls L = a(dmo::new, "TeDP");
   dls M = a(dnd.h::new, "OMB");
   dls N = a(dnd.j::new, "OMCR");
   dls O = a(dnd.k::new, "OMDXR");
   dls P = a(dnd.l::new, "OMDXYR");
   dls Q = a(dnd.m::new, "OMDYR");
   dls R = a(dnd.n::new, "OMDYZR");
   dls S = a(dnd.o::new, "OMDZR");
   dls T = a(dnd.p::new, "OMEntry");
   dls U = a(dnd.q::new, "OMPenthouse");
   dls V = a(dnd.s::new, "OMSimple");
   dls W = a(dnd.t::new, "OMSimpleT");
   dls X = a(dnd.u::new, "OMWR");
   dls Y = a(dmq.a::new, "ECP");
   dls Z = a(dnp.i::new, "WMP");
   dls aa = a(dmm.a::new, "BTP");
   dls ab = a(dnj.a::new, "Shipwreck");
   dls ac = a(dnb.a::new, "NeFos");
   dls ad = a(dkx::new, "jigsaw");

   dlf load(dlr var1, pj var2);

   private static dls a(dls $$0, String $$1) {
      return hm.a(hm.bd, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static dls a(dls.a $$0, String $$1) {
      return a((dls)$$0, $$1);
   }

   private static dls a(dls.b $$0, String $$1) {
      return a((dls)$$0, $$1);
   }

   public interface a extends dls {
      dlf load(pj var1);

      @Override
      default dlf load(dlr $$0, pj $$1) {
         return this.load($$1);
      }
   }

   public interface b extends dls {
      dlf load(dou var1, pj var2);

      @Override
      default dlf load(dlr $$0, pj $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
