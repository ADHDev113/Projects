package hw;

public class Student implements Comparable<Student>
{
    String name;
    int id;
    String email;

    public Student(String name, int id, String email)
    {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public Student(String email)
    {
        this.email = email;
    }

    @Override
    public boolean equals(Object o)
    {
        Student s = (Student)o;
        if (email.equals(s.email))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int compareTo(Student o)
    {
        return email.compareTo(o.email);
    }

    @Override
    public String toString()
    {
        return String.format("St(%s,%d,%s)", name, id, email);
    }
}
