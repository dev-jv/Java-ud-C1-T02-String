public class StringFileExtens {
    public static void main(String[] args) {
        String file = "any-ima.ge.jpg";

        int i = file.lastIndexOf(".");
        System.out.println("file.length() = " + file.length());
        System.out.println("file.substring(file.length()-4) = " + file.substring(i+1));

    }
}
