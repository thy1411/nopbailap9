/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author ADMIN
 */

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "sanpham.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String maso = parts[0];
                    String ten = parts[1];
                    float gia = Float.parseFloat(parts[2]);

                    SanPham sanPham = new SanPham(maso, ten, gia);
                    System.out.println(sanPham);
                }
            }
            System.out.println("Doc du lieu thanh cong!");
        } catch (IOException ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }
}
