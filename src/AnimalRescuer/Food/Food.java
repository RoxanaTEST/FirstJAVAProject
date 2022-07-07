package AnimalRescuer.Food;

public class Food {

    private String name;
    private double priceron ;
    private double quantitypcs ;
    private double stockavailabilitypcs ;
    public String getName(){
        return name;
    }

    public void setName(String foodname) {
        this.name = foodname;
    }

    public double getPriceron() {
        return priceron;
    }

    public void setPriceron(double foodpriceron) {
        this.priceron =  foodpriceron;
    }

    public double getQuantitypcs() {
        return quantitypcs;
    }

    public void setQuantitypcs(double foodquantitypcs) {
        this.quantitypcs = foodquantitypcs;
    }

    public double getStockavailabilitypcs() {
        return stockavailabilitypcs;
    }

    public void setStockavailabilitypcs(double foodstockavailabilitypcs) {
        this.stockavailabilitypcs = foodstockavailabilitypcs;
    }
}
