class Emp {
    String name;
    int id;
    String address;

    void getdata(String name, int id, String address){
        this.name = name;
        this.id = id;
        this.address = address;
    }

    void putdata(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(address);
    }
}

// Entry point of the program
class ClassnObj {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.getdata("smith", 22, "aurangabad");
        e.putdata();
    }
}
