package ua.opnu;

public class Main
{
    public static void main(String[] args)
    {
        Student st = new Student("Fedir", 2);
        st.addCourse("Math");
        st.addCourse("Programming");

        System.out.println(st.getName() +
                ": кількість вивчаємих дисциплін - " + st.getCourseCount());
        System.out.println(st.getName() +
                ": рік навчання - " + st.getYear());
        System.out.println(st.getName() +
                ": заплатив за навчання - " + st.getTuition());
    }
}
