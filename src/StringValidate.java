public class StringValidate {
    public static void main(String[] args) {
        String course = null;

        boolean isNull = course == null;
        System.out.println("isNull = " + isNull);

        if(isNull) {
            course =""; // "Java Course";
        }

        boolean withLength = course.length() == 0;
        System.out.println("withLength = " + withLength);

        boolean isEmptyMet = course.isEmpty(); // Java +6
        System.out.println("isEmptyMet = " + isEmptyMet);
        
        boolean isBlankMet = course.isBlank(); // JDK +11
        System.out.println("isBlankMet = " + isBlankMet);

        if(!isBlankMet) {
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to course ".concat(course));
        }

    }
}
