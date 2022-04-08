public class StringArrayMethods {
    public static void main(String[] args) {

        // -------------------------------------- <> .toCharArray()

        String property = "Reciprocity";

        char[] ary = property.toCharArray();
        System.out.println("ary = " + ary);

        int lg = ary.length;
        System.out.println("lg = " + lg);

        for (int i = 0; i < lg; i++){
            System.out.println("ary = " + ary[i]);
        }

//        for (int i = 0; i < lg; i++){
//            System.out.println(ary[i]);
//        }

        for (int i = 0; i < lg; i++){
            System.out.print(ary[i]);
        }

        System.out.println("\n");
        // -------------------------------------- <> .split()

        String[] ary2 = property.split("i");
        System.out.println("ary2 = " + ary2);

        int lg2 = ary2.length;
        System.out.println("lg2 = " + lg2);

        for(int j = 0; j < lg2; j++){
            System.out.println("ary2 = " + ary2[j]);
        }

        System.out.println("\n");

        // ---------

        String file = "any.doc.in.pdf";
                
        String[] ary3 = file.split("\\."); // [.] ...Regular exp.s
        System.out.println("ary3 = " + ary3);
        
        int lg3 = ary3.length;
        System.out.println("lg3 = " + lg3);

        for(int k = 0; k < lg3; k++ ){
            System.out.println(ary3[k]);
        }

        System.out.println("extens = " + ary3[lg3-1]);

    }
}
