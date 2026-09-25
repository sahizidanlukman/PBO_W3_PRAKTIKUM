import id.ac.polban.model.*;
import id.ac.polban.service.LayananMedisService;

public class Main {
    public static void main(String[] args) {
        Pasien pasien = new Pasien("Zidan", 19, "Padalarang");
        Dokter dokter = new Dokter("Dr. Tirta", "Dokter Umum");
        String diagnosa = "Flu";

        LayananMedisService layanan = new LayananMedisService();

        System.out.println("=== Sistem Informasi Rumah Sakit ===");

        RekamMedis rekamMedis = layanan.buatRekamMedis(pasien, dokter, diagnosa);

        Pasien pasien2 = new Pasien("Lukman", 20, "Bandung");
        RekamMedis rekamMedis2 = layanan.buatRekamMedis(pasien2, dokter, "Demam");

        System.out.println("\n=== Cetak Rekam Medis 1 ===");
        System.out.println("No. Antrian      : " + rekamMedis.getNomorAntrian());
        System.out.println("Nama Pasien      : " + rekamMedis.getPasien().getNama());
        System.out.println("Umur Pasien      : " + rekamMedis.getPasien().getUmur());
        System.out.println("Alamat Pasien    : " + rekamMedis.getPasien().getAlamat());
        System.out.println("Nama Dokter      : " + rekamMedis.getDokter().getNama());
        System.out.println("Spesialis Dokter : " + rekamMedis.getDokter().getSpesialis());
        System.out.println("Diagnosa         : " + rekamMedis.getDiagnosa());

        System.out.println("\n=== Cetak Rekam Medis 2 ===");
        System.out.println("No. Antrian      : " + rekamMedis2.getNomorAntrian());
        System.out.println("Nama Pasien      : " + rekamMedis2.getPasien().getNama());
        System.out.println("Umur Pasien      : " + rekamMedis2.getPasien().getUmur());
        System.out.println("Alamat Pasien    : " + rekamMedis2.getPasien().getAlamat());
        System.out.println("Nama Dokter      : " + rekamMedis2.getDokter().getNama());
        System.out.println("Spesialis Dokter : " + rekamMedis2.getDokter().getSpesialis());
        System.out.println("Diagnosa         : " + rekamMedis2.getDiagnosa());

        System.out.println("\nTotal Antrian Pasien saat ini: " + RekamMedis.getTotalAntrian());
        System.out.println("Program selesai. Semoga cepat sembuh!");
    }
}