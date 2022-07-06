package AnimalRescuer;

public class DogFood {
    private String name;
    private double priceron ;
    private double quantitypcs ;
    private double stockavailabilitypcs ;

    public String getName(){
        return name;
    }

    public void setName(String dogfoodname) {
        this.name = dogfoodname;
    }

    public double getPriceron() {
        return priceron;
    }

    public void setPriceron(double dogfoodpriceron) {
        this.priceron =  dogfoodpriceron;
    }

    public double getQuantitypcs() {
        return quantitypcs;
    }

    public void setQuantitypcs(double dogfoodquantitypcs) {
        this.quantitypcs = dogfoodquantitypcs;
    }

    public double getStockavailabilitypcs() {
        return stockavailabilitypcs;
    }

    public void setStockavailabilitypcs(double dogfoodstockavailabilitypcs) {
        this.stockavailabilitypcs = dogfoodstockavailabilitypcs;
    }
}
