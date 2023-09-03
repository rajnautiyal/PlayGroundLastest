package designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private double itemCost;

    private List<OderObserver> observerList=new ArrayList<>();

    private int count;

    private double discount;

    private double shippingCost;

    public Order(String id) {
        this.id=id;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public List<OderObserver> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<OderObserver> observerList) {
        this.observerList = observerList;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public double getTotal(){
        return itemCost-discount+shippingCost;
    }
    public void attach(OderObserver oderObserver){
        observerList.add(oderObserver);
    }

    public void detach(OderObserver oderObserver){
        observerList.remove(oderObserver);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addItems(double price){
        this.itemCost= price;
        this.count++;

        observerList.forEach(order->order.update(this));

    }
    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", count=" + count +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
