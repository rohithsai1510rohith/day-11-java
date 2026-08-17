class problem3{
    static void method(){
        System.out.println("From default method : ");
    }
    static void method(String name){
        System.out.println("From siingle para method : + name");
    }static void method(String name, int sal){
        System.out.println(name + "is getting" + sal +"salary");
    }
    public static void main(String[]args){
        Main m =new Main();
        m = new Main("RO");
        m = new Main("ROH",250000);
    }
}
