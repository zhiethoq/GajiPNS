 
public class Gaji2 {
	public static void main (String []args) {
		int JPT = 1; //Jabatan
		int gapok;
		int tjIstri = 10; //10%
		int tjAnak = 5; //5%
		String gp = "Gaji Pokok";
		String tp = "Total Pendapatan";
		String ti = "Tunjangan Istri";
		String ta = "Tunjangan Anak";
		
		if (JPT == 1) {
			gapok = 39365146;
			String namaJabatann = KodeJabatan.kdJabatan(JPT);
			int totalTunjanganIstri = HitungTunjangan.tunjanganIstri(gapok, tjIstri);
			int totalAnakk = HitungTunjangan.jumlahAnak (5);
			int totalTunjanganAnak = HitungTunjangan.tunjanganAnak(gapok, tjAnak, totalAnakk);
			int totalPendapatan = gapok + totalTunjanganIstri + totalTunjanganAnak;
			System.out.println(namaJabatann);
			System.out.println(gp + " " + gapok);
			System.out.println(ti + " " + totalTunjanganIstri);
			System.out.println(ta + " " + totalTunjanganAnak);
			System.out.println(tp + " "+ totalPendapatan); }
		
		else if (JPT == 2) { 
			gapok = 37490615;
			String namaJabatann = KodeJabatan.kdJabatan(JPT);
			int totalTunjanganIstri = HitungTunjangan.tunjanganIstri(gapok, tjIstri);
			int totalAnakk = HitungTunjangan.jumlahAnak (1);
			int totalTunjanganAnak = HitungTunjangan.tunjanganAnak(gapok, tjAnak, totalAnakk);
			int totalPendapatan = gapok + totalTunjanganIstri + totalTunjanganAnak;
			System.out.println(namaJabatann);
			System.out.println(gp + " " + gapok);
			System.out.println(ti + " " + totalTunjanganIstri);
			System.out.println(ta + " " + totalTunjanganAnak);
			System.out.println(tp + " "+ totalPendapatan); }
		
		else if (JPT == 3) { 
			gapok = 35705348;
			String namaJabatann = KodeJabatan.kdJabatan(JPT);
			int totalTunjanganIstri = HitungTunjangan.tunjanganIstri(gapok, tjIstri);
			int totalAnakk = HitungTunjangan.jumlahAnak (2);
			int totalTunjanganAnak = HitungTunjangan.tunjanganAnak(gapok, tjAnak, totalAnakk);
			int totalPendapatan = gapok + totalTunjanganIstri + totalTunjanganAnak;
			System.out.println(namaJabatann);
			System.out.println(gp + " " + gapok);
			System.out.println(ti + " " + totalTunjanganIstri);
			System.out.println(ta + " " + totalTunjanganAnak);
			System.out.println(tp + " "+ totalPendapatan); }
		
		else if (JPT == 4) { 
			gapok = 34005093;
			String namaJabatann = KodeJabatan.kdJabatan(JPT);
			int totalTunjanganIstri = HitungTunjangan.tunjanganIstri(gapok, tjIstri);
			int totalAnakk = HitungTunjangan.jumlahAnak (3);
			int totalTunjanganAnak = HitungTunjangan.tunjanganAnak(gapok, tjAnak, totalAnakk);
			int totalPendapatan = gapok + totalTunjanganIstri + totalTunjanganAnak;
			System.out.println(namaJabatann);
			System.out.println(gp + " " + gapok);
			System.out.println(ti + totalTunjanganIstri);
			System.out.println(ta + totalTunjanganAnak);
			System.out.println(tp + " "+ totalPendapatan); }
				
	}
}
class KodeJabatan {
	static String kdJabatan (int JPT) {
		String namaJabatan = "Jabatan Pemimpin Tinggi";
		if (JPT == 1) {
			namaJabatan = "Jabatan Pemimpin Tinggi 1";}
		if (JPT == 2) {
			namaJabatan = "Jabatan Pemimpin Tinggi 2";}
		if (JPT == 3) {
			namaJabatan = "Jabatan Pemimpin Tinggi 3";}
		if (JPT == 4) {
			namaJabatan = "Jabatan Pemimpin Tinggi 4";}
		return namaJabatan;
	}
}
class HitungTunjangan {
	static int tunjanganIstri (int gapok, int tjIstri) {
		int totalTjIstri = (gapok * tjIstri)/100;
		return totalTjIstri;
	}
	static int jumlahAnak (int jmlAnak) {
		int totalAnak = jmlAnak;
		if (totalAnak == 1) {
			totalAnak = 1;}
		else if (totalAnak == 2) {
			totalAnak = 2;}
		else if (totalAnak == 3) {
			totalAnak = 3;}
		else if (totalAnak > 3 ) {
			totalAnak = 3;}
		else 
			totalAnak = 0;
		return totalAnak;
	}
	
	static int tunjanganAnak (int gapok, int tjAnak, int totalAnak) {
		int totalTjAnak = ((gapok * tjAnak)/100)*totalAnak;
		return totalTjAnak;
	}
}