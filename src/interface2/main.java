package interface2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // membuat objek HP
        phone redmiNote8 = new xiaomi();

        // membuat objek user
        phoneUser dian = new phoneUser(redmiNote8);

        // kita coba nyalakan HP-nya
        dian.turnOnThePhone();

        // biar enak, kita buat dalam program
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            Scanner input = new Scanner(System.in);
            aksi = input.nextLine();
            if (aksi.equalsIgnoreCase("1")) {
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                dian.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}