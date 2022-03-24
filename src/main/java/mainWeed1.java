public class mainWeed1 {
    public static void main(String[] args) {

        System.out.println(sayName("Marlin"));
        System.out.println("Hallo "+nameL00p("Stefan")+"!");
        System.out.println(greaterZero(3));
        System.out.println(greaterZero(-1));
    }

    public static String sayName(String name) {
        return "Hello " + name + "!";
    }

    public static String nameL00p(String name) {
        String names = "";
        for (int i = 0; i < 5; i++) {
            names = names + name;
        }
        return names;

    }

    public static boolean greaterZero(int i) {
        if (i > 0){
            return true;
        } else {
            return false;
        }
    }
}
