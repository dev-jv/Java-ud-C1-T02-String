public class StringMethods {
    public static void main(String[] args) {
        String name = "Nick Burkhardt";

        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Nick Burkhardt\") = " + name.equals("Nick Burkhardt"));
        System.out.println("name.equals(\"Nick burkhardt\") = " + name.equals("Nick burkhardt"));
        System.out.println("name.equalsIgnoreCase(\"Nick Burkhardt\") = " + name.equalsIgnoreCase("Nick Burkhardt"));
        System.out.println("name.compareTo(\"Nick Burkhardt\") = " + name.compareTo("Nick Burkhardt"));
        System.out.println("name.compareTo(\"Nick\") = " + name.compareTo("Nick"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(1) = " + name.charAt(1));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));
        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(1, 4) = " + name.substring(1, 4));
        System.out.println("name.substring(name.length()-2) = " + name.substring(name.length()-2));

        String property = "Reciprocity";

        System.out.println("property.replace(\"R\",\"r\") = " + property.replace("R","r"));
        System.out.println("property = " + property);
        System.out.println("property.indexOf('1') = " + property.indexOf('i'));
        System.out.println("property.lastIndexOf('i') = " + property.lastIndexOf('i'));
        System.out.println("property.indexOf(\"o\") = " + property.indexOf("o"));
        System.out.println("property.indexOf(\"city\") = " + property.indexOf("city"));
        System.out.println("property.contains(\"city\") = " + property.contains("city"));
        System.out.println("property.startsWith(\"city\") = " + property.startsWith("city"));
        System.out.println("property.endsWith(\"city\") = " + property.endsWith("city"));
        System.out.println(" property ");
        System.out.println(" property ".trim());

    }
}
