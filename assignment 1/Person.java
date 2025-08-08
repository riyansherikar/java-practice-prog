
class Person {
    String p_name,p_city;
    String p_contact;

    void accept(String name,String city,String contact){
        p_name = name;
        p_city = city;
        p_contact = contact;
    }

    void dispaly(){
        System.out.println(p_name);
        System.out.println(p_city);
        System.out.println(p_contact);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.accept("Alice", "nagar", "7643685");
        p2.accept("george", "mumbai", "8u504w58");

        p1.dispaly();
        p2.dispaly();
    }
}
