package diziler;

public class Diziler {

    String diziAdi;
    String sezonSayisi;
    String bolumSayisi;
    String sure;
    String tur;
    String yaratici;
    String oyuncular;
    String cikisTarihi;
    String yayinlandigiKanal;
    String cekildigiYer;
    String imdbPuani;
    String bittiMi;
    String odulluMu;
    String uyarlamaMi;
    String konu;

    public Diziler() {
        //Parametresiz constructor
        diziAdi = null;
        sezonSayisi = null;
        bolumSayisi = null;
        sure = null;
        tur = null;
        yaratici = null;
        oyuncular = null;
        cikisTarihi = null;
        yayinlandigiKanal = null;
        cekildigiYer = null;
        imdbPuani = null;
        bittiMi = null;
        odulluMu = null;
        uyarlamaMi = null;
        konu = null;
    }

    public Diziler(String diziAdi, String sezonSayisi, String bolumSayisi, String sure, String tur, String yaratici, String oyuncular, String cikisTarihi,
            String yayinlandigiKanal, String cekildigiYer, String imdbPuani, String bittiMi, String odulluMu, String uyarlamaMi, String konu) {
        //Parametreli constructor
        this.diziAdi = diziAdi;
        this.sezonSayisi = sezonSayisi;
        this.bolumSayisi = bolumSayisi;
        this.sure = sure;
        this.tur = tur;
        this.yaratici = yaratici;
        this.oyuncular = oyuncular;
        this.cikisTarihi = cikisTarihi;
        this.yayinlandigiKanal = yayinlandigiKanal;
        this.cekildigiYer = cekildigiYer;
        this.imdbPuani = imdbPuani;
        this.bittiMi = bittiMi;
        this.odulluMu = odulluMu;
        this.uyarlamaMi = uyarlamaMi;
        this.konu = konu;
    }

}
