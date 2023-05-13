public class Watch {
    public static void main(String[] args) {

        int seconds = (int) (Math.random() * 28801);

        System.out.println(seconds);

        int resolt = seconds / 3600;
        System.out.println("Осталось " + resolt + " часов");
    }
}
