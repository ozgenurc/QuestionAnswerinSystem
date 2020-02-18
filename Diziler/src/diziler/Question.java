/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

import java.util.Scanner;
public class Question {

    private String soru;

    public Question() {
        soru = null;
    }

    public Question(String soru) {
        this.soru = soru;
    }

    public String asqQuestion() {
        System.out.println("Diziler hakkında sorunuz nedir?(Çıkmak için 0 girin)");
        Scanner input = new Scanner(System.in);
        setSoru(input.nextLine());
        return soru;
    }

    /**
     * @return the soru
     */
    public String getSoru() {
        return soru;
    }

    /**
     * @param soru the soru to set
     */
    public void setSoru(String soru) {
        this.soru = soru;
    }
}