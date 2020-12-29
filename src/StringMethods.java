public class StringMethods {
    public static void main(String[] args) {
        String nombre = "Nick Burkhardt";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Nick Burkhardt\") = " + nombre.equals("Nick Burkhardt"));
        System.out.println("nombre.equals(\"Nick burkhardt\") = " + nombre.equals("Nick burkhardt"));
        System.out.println("nombre.equalsIgnoreCase(\"Nick Burkhardt\") = " + nombre.equalsIgnoreCase("Nick Burkhardt"));
        System.out.println("nombre.compareTo(\"Nick Burkhardt\") = " + nombre.compareTo("Nick Burkhardt"));
        System.out.println("nombre.compareTo(\"Nick\") = " + nombre.compareTo("Nick"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
    }
}



