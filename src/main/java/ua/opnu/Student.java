package ua.opnu;

public class Student {
    private String name;
    private int year;
    private String[] courses;
    private int courseCount;

    public Student(String name, int year)
    {
        this.name = name;
        if (year >= 1 && year <= 4)
        {
            this.year = year;
        } else {
            System.out.println("Невірний рік навчання");
            this.year = 1;
        }
        this.courses = new String[10];
        this.courseCount = 0;
    }

    public void addCourse(String courseName)
    {
        if (courseName != null && !courseName.isEmpty())
        {
            if (courseCount < courses.length)
            {
                courses[courseCount] = courseName;
                courseCount++;
            } else
            {
                System.out.println("Не можливо додати курс: масив заповнений");
            }
        } else
        {
            System.out.println("Невірна назва курсу");
        }
    }

    public void dropAll()
    {
        courseCount = 0;
    }

    public int getCourseCount()
    {
        return courseCount;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    public int getTuition()
    {
        return year * 20000;
    }

}
