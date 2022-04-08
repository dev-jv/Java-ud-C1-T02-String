public class StringConcatenar {
    public static void main(String[] args) {
        String course = "Robotics";
        String teacher = "Nick Burkhardt ";

        String detail = course + " with the biologist " + teacher;
        System.out.println(detail);

        int numberA = 10;
        int numberB = 5;

        System.out.println(detail + numberA + numberB);
        System.out.println(detail + (numberA + numberB));
        System.out.println(numberA + numberB + detail);

        String detail2 = course.concat(" with ".concat(teacher));
        System.out.println("detail2 = " + detail2);

        String detail3 = course.concat(" with ").concat(teacher);
        System.out.println("detail3 = " + detail3);

    }
}
