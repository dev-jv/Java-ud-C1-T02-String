public class StringImmutable {
    public static void main(String[] args) {
        String curso = "Dark Matter";
        String profesor = "Walter Bishop";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);

        System.out.println(curso == resultado);

//        String resultado2 = curso.transform(c -> {    // Java 12+
//            return c + " con " + profesor;
//        });
//        System.out.println("curso = " + curso);
//        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}



