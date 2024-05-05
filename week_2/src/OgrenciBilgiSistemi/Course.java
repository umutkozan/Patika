package OgrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double verbalWeight; // Sözlü notun ortalamaya etkisi yüzdesi

    public Course(String name, String code, String prefix, double verbalWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalWeight = verbalWeight;
    }

    public Course(String matematik, String mat101, String mat) {
    }

    public void addTeacher(Teacher t) {
        if (this.prefix != null && this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    // Sözlü not ve sınav notu üzerinden ortalama hesaplanması
    public double calculateAverage(int verbalNote, int examNote) {
        return (verbalNote * (verbalWeight / 100)) + (examNote * ((100 - verbalWeight) / 100));
    }
}
