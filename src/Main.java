public class Main {
    public static void main(String[] args) {
        int cost = 10000; //цена билета
        int x = 500; //стоимость одной мили в рублях
        int bonus = cost/x;

        System.out.println("Начислено миль:" + bonus);

    }
}
