package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;

        //상품 주문 정보를 'Productorder' 타입의 변수로 받아 저장
        ProductOrder[] productOrders = new ProductOrder[]{product1, product2, product3};
        //상품 주문 정보와 최종 금액 출력
        int totalPrice = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
            totalPrice += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + totalPrice);
    }
}
