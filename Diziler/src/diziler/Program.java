
package diziler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

    public static void main(String[] args) throws SQLException {

        String URL = "jdbc:derby://localhost:1527/diziler";
        String USER = "ozgenurc";
        String PASS = "12345";
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        Diziler dizi = new Diziler();
        String soru;

        do {
            Question qa = new Question();
            soru = qa.asqQuestion();
            Pattern ptn = Pattern.compile("(dizisi)");
            String[] part = ptn.split(soru);
            dizi.diziAdi = part[0];
            String sql = "select * from diziler where diziAdi='" + dizi.diziAdi + "'";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                dizi.sezonSayisi = resultSet.getString("sezonSayisi");
                dizi.bolumSayisi = resultSet.getString("bolumSayisi");
                dizi.sure = resultSet.getString("sure");
                dizi.tur = resultSet.getString("tur");
                dizi.yaratici = resultSet.getString("yaratici");
                dizi.oyuncular = resultSet.getString("oyuncular");
                dizi.cikisTarihi = resultSet.getString("cikisTarihi");
                dizi.yayinlandigiKanal = resultSet.getString("yayinlandigiKanal");
                dizi.cekildigiYer = resultSet.getString("cekildigiYer");
                dizi.imdbPuani = resultSet.getString("imdbPuani");
                dizi.bittiMi = resultSet.getString("bittiMi");
                dizi.odulluMu = resultSet.getString("odulluMu");
                dizi.uyarlamaMi = resultSet.getString("uyarlamaMi");
                dizi.konu = resultSet.getString("konu");
            }

            Pattern p1 = Pattern.compile(".*(sezon).*", Pattern.CASE_INSENSITIVE);
            Matcher m1 = p1.matcher(soru);
            boolean b1 = m1.matches();
            if (b1 == true) {
                System.out.println(dizi.sezonSayisi);
            }

            Pattern p2 = Pattern.compile(".*(bolum).*", Pattern.CASE_INSENSITIVE);
            Matcher m2 = p2.matcher(soru);
            boolean b2 = m2.matches();
            if (b2 == true) {
                System.out.println(dizi.bolumSayisi);
            }

            Pattern p3 = Pattern.compile(".*(sure|dakika).*", Pattern.CASE_INSENSITIVE);
            Matcher m3 = p3.matcher(soru);
            boolean b3 = m3.matches();
            if (b3 == true) {
                System.out.println(dizi.sure);
            }

            Pattern p4 = Pattern.compile(".*(tur).*", Pattern.CASE_INSENSITIVE);
            Matcher m4 = p4.matcher(soru);
            boolean b4 = m4.matches();
            if (b4 == true) {
                System.out.println(dizi.tur);
            }

            Pattern p5 = Pattern.compile(".*(yaratici).*", Pattern.CASE_INSENSITIVE);
            Matcher m5 = p5.matcher(soru);
            boolean b5 = m5.matches();
            if (b5 == true) {
                System.out.println(dizi.yaratici);
            }

            Pattern p6 = Pattern.compile(".*(oyuncu|oynu).*", Pattern.CASE_INSENSITIVE);
            Matcher m6 = p6.matcher(soru);
            boolean b6 = m6.matches();
            if (b6 == true) {
                System.out.println(dizi.oyuncular);
            }

            Pattern p7 = Pattern.compile(".*(cik|bas).*", Pattern.CASE_INSENSITIVE);
            Matcher m7 = p7.matcher(soru);
            boolean b7 = m7.matches();
            if (b7 == true) {
                System.out.println(dizi.cikisTarihi);
            }

            Pattern p8 = Pattern.compile(".*(yayin).*", Pattern.CASE_INSENSITIVE);
            Matcher m8 = p8.matcher(soru);
            boolean b8 = m8.matches();
            if (b8 == true) {
                System.out.println(dizi.yayinlandigiKanal);
            }

            Pattern p9 = Pattern.compile(".*(cekil).*", Pattern.CASE_INSENSITIVE);
            Matcher m9 = p9.matcher(soru);
            boolean b9 = m9.matches();
            if (b9 == true) {
                System.out.println(dizi.cekildigiYer);
            }
            Pattern p10 = Pattern.compile(".*(puan).*", Pattern.CASE_INSENSITIVE);
            Matcher m10 = p10.matcher(soru);
            boolean b10 = m10.matches();
            if (b10 == true) {
                System.out.println(dizi.imdbPuani);
            }
            Pattern p11 = Pattern.compile(".*(bit|devam).*", Pattern.CASE_INSENSITIVE);
            Matcher m11 = p11.matcher(soru);
            boolean b11 = m11.matches();
            if (b11 == true) {
                System.out.println(dizi.bittiMi);
            }
            Pattern p12 = Pattern.compile(".*(odul).*", Pattern.CASE_INSENSITIVE);
            Matcher m12 = p12.matcher(soru);
            boolean b12 = m12.matches();
            if (b12 == true) {
                System.out.println(dizi.odulluMu);
            }
            Pattern p13 = Pattern.compile(".*(uyarlama|alinti).*", Pattern.CASE_INSENSITIVE);
            Matcher m13 = p13.matcher(soru);
            boolean b13 = m13.matches();
            if (b13 == true) {
                System.out.println(dizi.uyarlamaMi);
            }
            Pattern p14 = Pattern.compile(".*(konu).*", Pattern.CASE_INSENSITIVE);
            Matcher m14 = p14.matcher(soru);
            boolean b14 = m14.matches();
            if (b14 == true) {
                System.out.println(dizi.konu);
            }
            
            if ("0".equals(soru) ){
                System.out.println("Sistemden çıkılıyor...");
            }
        } while (soru.compareTo("0") != 0);
    }
}
