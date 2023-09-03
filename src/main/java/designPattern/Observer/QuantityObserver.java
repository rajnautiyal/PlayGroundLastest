package designPattern.Observer;

public class QuantityObserver implements OderObserver{
    @Override
    public void update(Order order) {
            double quantity =order.getCount();
            if(quantity>5)
            {
                order.setShippingCost(10);

            }else{

                order.setShippingCost(5);
        }
    }
}
