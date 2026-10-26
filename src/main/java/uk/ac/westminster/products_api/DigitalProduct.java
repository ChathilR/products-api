package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it inherits the common properties and behaviours of Product.


public class DigitalProduct extends Product implements Discountable {

    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(){}

    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB ){

        super(id, name, price);

        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;

    }

    public String getDownloadUrl(){
        return downloadUrl;
    }


    public double getFileSizeMB(){
        return fileSizeMB;
    }

    //   @Override
    public String getSummary(){
        return "Product : " + getName() + "| Price : " + getPrice() + " | Download URL : " + getDownloadUrl();
    }


    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        applyDiscount(0.2);
        return discountedPrice;
    }
}
