package poly.ex.pay1;

public class FindPay {
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("csh")) {
            return new CshPay();
        } else {
            return new DefaultPay();
        }
    }
}
