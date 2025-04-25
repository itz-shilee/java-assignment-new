public class student {
    public static void main(String[] args) {
        Fresher f = new Fresher();
        postgraduate pg = new postgraduate();
        undergraduate ug = new undergraduate();
        finalyear fy = new finalyear();

        System.out.println(f instanceof student);
        System.out.println(ug instanceof Fresher);
        System.out.println(pg instanceof student);
        System.out.println(fy instanceof student);
    }
}
