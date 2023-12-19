package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
            System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

            //입력한 Pay 이름에 맞는 페이 찾기
            Pay pay = FindPay.findPay(option);

            //찾은 페이에 amount 값 출력 및 result 값 반환하기
            boolean result = pay.pay(amount);

            //반환받은 result 값으로 결제 성공 유무 출력하기
            if (result) {
                System.out.println("결제가 성공했습니다.");
            } else {
                System.out.println("결제가 실패했습니다.");
            }
    }
}
