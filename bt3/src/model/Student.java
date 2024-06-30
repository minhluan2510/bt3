package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luanq
 */
public class Student {
    private String idS;
    private String nameS;
    private String phoneNumberS;
    private String addressS;
    private String gioitinhS;

    public Student(String idS, String nameS, String phoneNumberS, String addressS, String gioitinhS) {
        this.idS = idS;
        this.nameS = nameS;
        this.phoneNumberS = phoneNumberS;
        this.addressS = addressS;
        this.gioitinhS = gioitinhS;
    }

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    public String getPhoneNumberS() {
        return phoneNumberS;
    }

    public void setPhoneNumberS(String phoneNumberS) {
        this.phoneNumberS = phoneNumberS;
    }

    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
    }

    public String getGioitinhS() {
        return gioitinhS;
    }

    public void setGioitinhS(String gioitinhS) {
        this.gioitinhS = gioitinhS;
    }

    @Override
    public String toString() {
        return "Hoc Sinh - " + idS + " : " + nameS + "/" + gioitinhS;
    }
}


