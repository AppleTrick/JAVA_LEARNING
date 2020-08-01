package class_and_method.project1;

public class FruitSalesMain1 {

    public static void main(String[] args) {

        Fruitseller seller = new Fruitseller();
        FruitBuyer buyer = new FruitBuyer();

        buyer.buyApple(seller,1000);

        seller.showSaleResult();

        buyer.showBuyResult();
    }
}

class Fruitseller{
    int numOfApple = 20;
    int myMoney = 0;
    final int APPLE_PRICE = 1000;

    public int saleApple(int money)
    {
        int num = money / APPLE_PRICE;
        numOfApple -= num;
        myMoney += money;
        return num;
    }
    public void showSaleResult(){
        System.out.println("남은 사과 수익 : " + numOfApple );
        System.out.println("판매 수익 : " + myMoney);
    }
}

class FruitBuyer{
    int myMoney = 5000;
    int numOfApple = 0;

    public void buyApple(Fruitseller fruitseller, int money){
        numOfApple += fruitseller.saleApple(money);
        myMoney -= money;
    }
    public void showBuyResult(){
        System.out.println("현재 잔액 : " + myMoney);
        System.out.println("사과 개수 : " + numOfApple );
    }
}
