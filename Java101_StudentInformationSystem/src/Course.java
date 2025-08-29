
public class Course {
	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
    int note;       
    int verbalNote; 
    double verbalWeight; 
	
	Course(String name, String code, String prefix, double verbalWeight ){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
        this.verbalNote = 0;
        this.verbalWeight = verbalWeight;
	}
	
	public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
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
    
    public double calcCourseAverage() {
        return (this.verbalNote * this.verbalWeight) + (this.note * (1 - this.verbalWeight));
    }



}
