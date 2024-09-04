/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;
import Bai1.SanPham;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class WriteObject {
    public static void main(String[] args) throws IOException {
        // Tạo danh sách sản phẩm
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);



        // Ghi danh sách sản phẩm vào file nhị phân
        try {
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(int i = 0; i<3;i++){
            System.out.println("Thong tin san pham thu " +(i+1));
            System.out.print("Nhap ma so: ");
            String maso = sc.nextLine();
            System.out.print("Nhap ten: ");
            String ten = sc.nextLine();
            System.out.print("Nhap gia: ");
            float gia = sc.nextFloat();
            sc.nextLine();
            SanPham sp = new SanPham(maso, ten, gia);
            ds.add(sp);
        }
            oos.writeObject(ds);
            oos.close();
            
            System.out.println("\n Da ghi xong");
        } catch (IOException ex)
                {
                System.out.println("Loi xay ra: " +ex.toString());
        
    }
    }
}


