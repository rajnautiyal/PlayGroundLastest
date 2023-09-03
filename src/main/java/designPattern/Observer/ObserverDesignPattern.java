package designPattern.Observer;

public class ObserverDesignPattern {

    public static void main(String args[]){

        Order oder=new Order("100");
        PriceObserver priceObserver=new PriceObserver();
        QuantityObserver quantityObserver=new QuantityObserver();
        oder.attach(quantityObserver);
        oder.attach(priceObserver);


        oder.addItems(150);
        System.out.println(oder);
        oder.addItems(190);
        System.out.println(oder);

        oder.setShippingCost(6);
        System.out.println(oder);

    }
}
