/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author luanq
 */
import model.GiaoVien;
import model.Student;
import model.MonHoc;

public class main {
    public static void main(String[] args) {
        // Tạo các đối tượng
        GiaoVien giaoVien = new GiaoVien("GV01", "Nguyen Van A", "0123456789", "Hanoi");
        Student student = new Student("S01", "Le Thi B", "0987654321", "Ho Chi Minh", "Nu");
        MonHoc monHoc = new MonHoc("PRO192", "LAPTRINH");

        // Thực hành getter/setter
        giaoVien.setNameGV("Tran Van C");
        student.setGioitinhS("Nam");
        monHoc.setTenMonHoc("Ly");

        // In ra thông tin theo định dạng
        System.out.println(giaoVien);
        System.out.println(student);
        System.out.println(monHoc);
    }
}


