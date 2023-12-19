package poly.ex.pay1;

public class FindPay {
    public static Pay findPay(String option) {
        return switch (option) {
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            case "csh" -> new CshPay();
            default -> new DefaultPay();
        };
    }
}
