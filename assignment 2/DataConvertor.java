class DataConvertor {
    public static long convertToBytes(double terabytes){
        return (long) (terabytes * 1024 * 1024*1024*1024);
    }
    public static long convertToBytes(int gigabytes){
        return (long) (gigabytes * 1024 * 1024*1024);
    }
    public static long convertToBytes(float  megabytes){
        return (long) (megabytes * 1024 * 1024);
    }

    public static void main(String[] args) {
        double tb = 1.5;
        int gb = 3;
        float mb = 5;
        
        System.out.println(convertToBytes(tb));
        System.out.println(convertToBytes(gb));
        System.out.println(convertToBytes(mb));
    }
}
