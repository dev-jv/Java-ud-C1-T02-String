public class StringNew {
    public static void main(String[] args) {
        String course = "Programming";
        String course2 = new String("Programming");

        boolean itsEqual = course == course2;
        System.out.println("course == course 2 = " + itsEqual);

        itsEqual = course.equals(course2);
        System.out.println("course.equals(course2) = " + itsEqual);

        itsEqual = course.equalsIgnoreCase(course2);
        System.out.println("course.equalsIgnoreCase(course2) = " + itsEqual);

        String course3 = "Programming"; // Assign a reference to the existing!
        itsEqual = course == course3;
        System.out.println("course == course3 = " + itsEqual);

    }
}
