package poly.ex.pay0;

public class FindPay {
    public boolean findPay(String option, int amount) {
        Pay pay = switch (option) {
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            case "csh" -> new CshPay();
            default -> new DefaultPay();
        };
        return pay.pay(amount);
    }
}
