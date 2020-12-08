public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación";
        String curso2 = new String("Programación");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso 2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación"; // Asigna una referencia a lo existente!
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}



