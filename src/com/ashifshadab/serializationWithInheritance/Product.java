package com.ashifshadab.serializationWithInheritance;

import java.io.*;
/**
 * Sometimes we need to extend a class that does not implement a Serializable interface.
 * If we rely on the automatic serialization behavior and the superclass has some state,
 * then they will not be converted to stream and hence not retrieved later on.
 * This is one place where readObject() and writeObject() methods really help.
 * By providing their implementation, we can save the superclass state to the stream and then retrieve it later on.

 * We can serialize superclass state even though it’s not implementing a Serializable interface.
 * This strategy comes handy when the superclass is a third-party class that we can’t change.
 * **/
public class Product extends Factory implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int productId;
    private String productName;

    public Product() {

    }

    public Product(int factoryId, String factoryName, int productId, String productName) {
        super(factoryId, factoryName);
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return super.toString() + "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }

    //Adding helper method for serialization to save/initialize super class state
    //Notice that the order of writing and reading the extra data to the stream should be the same.
    @Serial
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(getFactoryId());
        oos.writeObject(getFactoryName());
    }


    @Serial
    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        //notice the order of read and write should be same
        setFactoryId(ois.readInt());
        setFactoryName((String) ois.readObject());
    }

    // Also notice that this class is implementing an ObjectInputValidation interface.
    // By implementing the validateObject()method,
    // we can put some business validations to make sure that the data integrity is not harmed.
    public void validateObject() throws InvalidObjectException {
        //validate the object here
        if (productName == null || productName.isEmpty()) throw new
                InvalidObjectException("productName can't be null or empty");
        if (getFactoryId() <= 0) throw new InvalidObjectException("ID can't be negative or zero");
    }
}
