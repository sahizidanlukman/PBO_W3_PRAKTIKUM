package id.ac.polban.model;

public class RekamMedis {

    private static int totalAntrian = 0;
    private Pasien pasien;
    private Dokter dokter;
    private String diagnosa;
    private int nomorAntrian;

    public RekamMedis(Pasien pasien, Dokter dokter, String diagnosa) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.diagnosa = diagnosa;

        totalAntrian++;
        this.nomorAntrian = totalAntrian;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public int getNomorAntrian() {
        return nomorAntrian;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    } 
    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }
    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public static int getTotalAntrian() {
        return totalAntrian;
    }
}