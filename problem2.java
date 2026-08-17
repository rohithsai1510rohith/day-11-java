class problem2{
    static void method(){
        System.out.println("From default method : ");
    }
    static void method(String name){
        System.out.println("From siingle para method : + name");
    }static void method(String name, int sal){
        System.out.println(name + "is getting" + sal +"salary");
    }
    public static void main(String[]args){
        method();
        method("Rohith");
        method("ro" ,250000);
    }
}