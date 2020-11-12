public class Main {

    public static void main(String[] args) {
        Race r1= new Race ();
        Race r2 = new Race();

        r1.setData("10.08.1999");
        r1.setPrises(true);
        r1.setMembers(33);
        System.out.println("Информация о первой гонке");
        r1.Print();

        r1.setData("10.11.2002");
        r1.setPrises(false);
        r1.setMembers(29);
        System.out.println();
        System.out.println("Информация о второй гонке" );
        r1.Print();
    }
}
