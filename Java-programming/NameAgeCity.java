public class NameAgeCity {
    String name = "Utsavv";
    String city = "Noida";
    int age = 23;

    void details(){
        System.out.println("Your good name is = "+name);
        System.out.println("Your City is ="+city);
        System.out.println("And Your age is = "+age);
    }

    public static void main(String arg[]){
        NameAgeCity ob = new NameAgeCity();
        ob.details();
    }
}
