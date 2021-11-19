package org.wildfly;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Order implements Serializable {
    private String shippingAddress;
    private String contactDetails;
    private List<Product> productsList;

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("shippingAddress='").append(shippingAddress).append('\'');
        sb.append(", contactDetails='").append(contactDetails).append('\'');
        sb.append(", productsList=").append(productsList);
        sb.append('}');
        return sb.toString();
    }
}
