class Fibonacci {

    static void fab() {
        int fn = 0;
        int sn = 1;

        System.out.println(fn);
        System.out.println(sn);

        for (int i = 2; i < 8; i++) {
            int temp = fn + sn;
            System.out.println(temp);
            fn = sn;
            sn = temp;
        }
    }

    public static void main(String[] args) {
        fab(); 
    }
}


// class Fibonacci {

//     static int fab() {
//         int fn = 0;
//         int sn = 1;

//         System.out.println(fn);
//         System.out.println(sn);

//         for (int i = 2; i < 8; i++) {
//             int temp = fn + sn;
//             System.out.println(temp);
//             fn = sn;
//             sn = temp;
//         }
//         return 0;
//     }

//     public static void main(String[] args) {
//         fab(); 
//     }
// }
