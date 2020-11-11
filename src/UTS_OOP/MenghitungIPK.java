package UTS_OOP;

import java.util.Scanner;

public class MenghitungIPK {
    
    public static void main(String[] args) {
        String nama, semester, jurusan;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Semester : ");
        semester = scanner.nextLine();
        System.out.print("Jurusan : ");
        jurusan = scanner.nextLine();
        System.out.print("Nilai OOP : ");
        int nilaioop = scanner.nextInt();
        System.out.print("Nilai basis data : ");
        int nilaibd = scanner.nextInt();
        System.out.print("Nilai jaringan komputer : ");
        int nilaijk = scanner.nextInt();
        
        int ip, totalnilaimk;
        totalnilaimk = nilaioop + nilaibd + nilaijk;
        ip = totalnilaimk / 3;
        
        System.out.println("==============================================");
        System.out.println("Nama : " + nama);
        System.out.println("Semester : " + semester);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Nilai OOP : " + nilaioop);
        System.out.println("Nilai basis data : " + nilaibd);
        System.out.println("Nilai jaringan komputer : " + nilaijk);
        System.out.println("Total nilai mata kuliah : " + totalnilaimk);
        System.out.println("Indeks prestasi : " + ip);
        
        String predikat;
        if (ip > 81 && ip < 100){
         predikat = "A";
        }
        else if (ip > 61 && ip < 80){
         predikat = "B";   
        }
        else{
         predikat = "C";   
    }
        System.out.println("PREDIKAT ANDA : " + predikat);
    }
}