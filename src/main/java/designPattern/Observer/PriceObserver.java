package designPattern.Observer;

public class PriceObserver implements OderObserver{
    @Override
    public void update(Order order) {
        if(order!=null){
                double totoalCost =order.getItemCost();
            if(totoalCost<500)
            {
                order.setDiscount(10);

            }
            if(totoalCost>200)
            {
                order.setDiscount(10);

            }
        }
    }
}
