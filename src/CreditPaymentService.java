public class CreditPaymentService {
    public int calculate(int money, int duration, float annual) {
        float monthly = annual / (12 * 100);
        float x = 1 + monthly;
        float y = (float) Math.pow(x, duration);
        int payment = (int) ((money * monthly) / (1 - y));
        return payment;
    }
}