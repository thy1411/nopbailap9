/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author ThyThy
 */

public class WriteTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "sanpham.txt";

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");

                System.out.print("Mã số: ");
                String maso = scanner.nextLine();

                System.out.print("Tên sản phẩm: ");
                String ten = scanner.nextLine();

                System.out.print("Giá: ");
                float gia = Float.parseFloat(scanner.nextLine());

                SanPham sanPham = new SanPham(maso, ten, gia);
                fileWriter.write(sanPham.toString() + "\n");
            }
            System.out.println("Dữ liệu đã được ghi vào file 'sanpham.txt'.");
        } catch (IOException e) {
        }
    }
}
