public class StringTestPerfConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long begin = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
//            c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 3ms, 10000 => 120ms, 100000 => 5600ms
//            c += a + b + "\n"; // 500 => 30ms, 1000 => 30ms, 10000 => 100ms, 100000 => 2350ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 12ms
        }

        long end = System.currentTimeMillis();


//        System.out.println("c = " + c );
        System.out.println("sb = " + sb.toString());

        System.out.println("::::::: Time ::::::: " + (end - begin));

    }
}
