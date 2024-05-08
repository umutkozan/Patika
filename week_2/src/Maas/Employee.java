package Maas;

import java.time.Year;

public class Employee {
    // Çalışanın adı ve soyadı
    private String name;
    // Çalışanın maaşı
    private double salary;
    // Haftalık çalışma saati
    private int workHours;
    // İşe başlangıç yılı
    private int hireYear;

    // Kurucu metod, 4 parametre alır
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Maaşa uygulanan vergiyi hesaplar
    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus ücretlerini hesaplar
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışını hesaplar
    public double raiseSalary() {
        int yearsWorked = Year.now().getValue() - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    // Vergi ve bonuslar ile birlikte toplam maaşı hesaplar
    public double totalSalary() {
        return salary + bonus() + raiseSalary() - tax();
    }

    // Çalışan bilgilerini metin olarak döndürür
    @Override
    public String toString() {
        return "Adı: " + name + "\nMaaşı: " + salary + "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear + "\nVergi: " + tax() + "\nBonus: " +
                bonus() + "\nMaaş Artışı: " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + totalSalary() +
                "\nToplam Maaş: " + (totalSalary() + tax());
    }
}