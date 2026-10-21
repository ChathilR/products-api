package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it inherits the common properties and behaviours of Product.


public class DigitalProduct extends Product {

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

}
