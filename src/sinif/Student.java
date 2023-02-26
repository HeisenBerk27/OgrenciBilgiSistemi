package sinif;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    
   


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    
    void addSozluNotu(int sozluNotu1, int sozluNotu2, int sozluNotu3) {
        if (sozluNotu1 >= 0 && sozluNotu1 <= 100) {
            this.mat.sozluNotu = sozluNotu1;
  
        }
        if (sozluNotu2 >= 0 && sozluNotu2 <= 100) {
            this.fizik.sozluNotu = sozluNotu2;
            
        }
        if (sozluNotu3 >= 0 && sozluNotu3 <= 100) {
            this.kimya.sozluNotu = sozluNotu3;
            
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (0.8*(this.fizik.note)+ 0.2*(this.fizik.sozluNotu) + 0.8* (this.kimya.note) + 0.2*(this.kimya.sozluNotu) + 0.8* (this.mat.note) + 0.2*(this.mat.sozluNotu)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik sözlü notu: " + this.mat.sozluNotu);
        System.out.println("Mat sözlüsünün nota etkisi %20'dir");
        System.out.println("Fizik sözlü notu: " + this.fizik.sozluNotu);
        System.out.println("fizik sözlüsünün nota etkisi %20'dir");
        System.out.println("Kimya sözlü notu: " + this.kimya.sozluNotu);
        System.out.println("kimya sözlüsünün nota etkisi %20'dir");
    }

}
	


