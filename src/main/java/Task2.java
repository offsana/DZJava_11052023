public class Task2 {
    public static void main(String[] args) {
        //isEdekaOpen и isReweOpen
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;

        boolean canBuy = (isEdekaOpen || isReweOpen);
        System.out.println("Я могу купить еду: " + canBuy);
    }
}
