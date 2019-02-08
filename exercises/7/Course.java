

public class Course {

	private String name;
	private Student students[];
	private int NumOfStudents;

	public Course()
    {
        this.NumOfStudents = 0;
        students = new Student[10];
    }

	public boolean register(Student s) {
	    if(this.NumOfStudents==10)
	        return false;
	    this.students[NumOfStudents] = new Student(s.getFirstName(), s.getAge());
		this.NumOfStudents++;
		return true;
	}

	public int getNumOfStudents() {
		return this.NumOfStudents;
	}

	public Student[] getStudents() {
	    Student ss[] = new Student[NumOfStudents];
	    for (int i=0; i<NumOfStudents; i++)
        {
            ss[i] = this.students[i];
        }
		return ss;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

