package id.ac.polban.service;

import id.ac.polban.model.Dokter;
import id.ac.polban.model.Pasien;
import id.ac.polban.model.RekamMedis;

public class LayananMedisService {

    public RekamMedis buatRekamMedis(Pasien pasien, Dokter dokter, String diagnosa) 
    {
        System.out.println("[Service] Memproses pendaftaran pasien " + pasien.getNama()
                + " ke " + dokter.getNama() + "...");
        return new RekamMedis(pasien, dokter, diagnosa);
    }
}