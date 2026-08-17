class problem1{
    static int i = 100;
    static void method(){
        System.out.println("From static method" + i);
    }
    static{
        System.out.println("From static block");
    }
    public static void main(String[]args){
        method();
    }
}