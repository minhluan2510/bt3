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
public class MonHoc {
    private String idMonHoc;
    private String tenMonHoc;

    public MonHoc(String idMonHoc, String tenMonHoc) {
        this.idMonHoc = idMonHoc;
        this.tenMonHoc = tenMonHoc;
    }

    public String getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(String idMonHoc) {
        this.idMonHoc = idMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    @Override
    public String toString() {
        return idMonHoc + " : " + tenMonHoc;
    }
}


