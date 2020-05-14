public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int money = 1_000_000;
        float annual = 9.99f;
        int Payment12 = service.calculate(money, -12, annual);
        System.out.println(Payment12);

        int Payment24 = service.calculate(money, -24, annual);
        System.out.println(Payment24);

        int Payment36 = service.calculate(money, -36, annual);
        System.out.println(Payment36);

    }

}
