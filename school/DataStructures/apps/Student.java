package apps;

public class Student implements Comparable<Student>
{
    private String name;
    private int ID;
    private String email;

    public Student(String name, int ID, String email)
    {
        this.name = name;
        this.ID = ID;
        this.email = email;
    }
    public Student(int ID)
    {
        this.ID = ID;
    }

    @Override
    public String toString()
    {
        return String.format("St(%s, %d, %s)", name, ID, email);
    }

    @Override
    public boolean equals(Object o)
    {
        Student s = (Student)o;
        return ID == s.ID;
    }

    public int compareTo(Student s)
    {
        return ID - s.ID;
    }
}
