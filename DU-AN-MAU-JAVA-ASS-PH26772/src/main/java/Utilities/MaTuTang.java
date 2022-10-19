/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.text.DecimalFormat;
import net.bytebuddy.utility.RandomString;

/**
 *
 * @author window
 */
public class MaTuTang {

    private DecimalFormat formatter = new DecimalFormat("###,###,##0");

    public static String getMaTuTang() {
        return "HD" + RandomString.make(4);
    }

    public static String maTuSinh() {
        int code = (int) Math.floor(((Math.random() * 899999) + 100000));
        return "HD" + code;
    }

    public static String gen(String ma) {
        int last = (int) Math.floor((Math.random()) * 9999);
        if (last < 1000 && last >= 100) {
            return ma + "0" + last;
        }
        if (last < 100 && last >= 10) {
            return ma + "00" + last;
        }
        if (last < 10) {
            return ma + "000" + last;
        }

        return ma + last;

    }

    public static void main(String[] args) {

    }
}
