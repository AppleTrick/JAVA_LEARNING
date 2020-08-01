package class_and_method.project2;

public class FruitSalesMain2 {
    public static void main(String[] args) {

        Fruitseller seller1 = new Fruitseller(0,30,2000);
        Fruitseller seller2 = new Fruitseller(0,25,1500);

        FruitBuyer buyer = new FruitBuyer(20000,0);

        buyer.buyApple(seller1,6000);
        buyer.buyApple(seller2,3000);

        seller1.showSaleResult();
        seller2.showSaleResult();

        buyer.showBuyResult();
    }
}

class Fruitseller{
    int numOfApple;
    int myMoney;
    int APPLE_PRICE;

    public Fruitseller(int myMoney, int numOfApple, int price){
        this.numOfApple = numOfApple;
        this.myMoney = myMoney;
        APPLE_PRICE = price;
    }

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
    int myMoney;
    int numOfApple;

    public FruitBuyer(int myMoney, int numOfApple){
        this.myMoney = myMoney;
        this.numOfApple = numOfApple;
    }

    public void buyApple(Fruitseller fruitseller, int money){
        numOfApple += fruitseller.saleApple(money);
        myMoney -= money;
    }
    public void showBuyResult(){
        System.out.println("현재 잔액 : " + myMoney);
        System.out.println("사과 개수 : " + numOfApple );
    }
}

