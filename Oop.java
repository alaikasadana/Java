class Oop {
    int a;   // instance variable

    void sum() {
        System.out.println("sum function");
    }

    public static void main(String args[]) {
        One obj = new One();  // creating object

        obj.a = 122;          // assigning value to 'a'
        System.out.println(obj.a);  // printing 'a'

        obj.sum();            // calling sum function
    }
}