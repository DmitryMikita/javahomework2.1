public class Main {
    public static void main(String[] args) {
        int cost = 10000; //цена билета
        int priceOneMile = 500; //стоимость одной мили в рублях
        int bonus = cost / priceOneMile;

        System.out.println("Начислено миль:" + bonus);

    }
}
