public interface ctz extends bac {
   dxj k_ = cjt.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   dxj u_ = cjt.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   dxj v_ = dxg.a(k_, u_);

   default dxj N_() {
      return v_;
   }

   double E();

   double F();

   double G();
}
