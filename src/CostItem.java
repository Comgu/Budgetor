
public class CostItem {
    String name;
    String type;
    int price;
    int quantity;
    
    public CostItem(){}
    
    public CostItem(String inputName, String inputType, int inputPrice, int inputQuantity){
        this.name = inputName;
        this.type = inputType;
        this.price = inputPrice;
        this.quantity = inputQuantity;
    }
    
    public CostItem(String inputName, int inputPrice, int inputQuantity){
        this.name = inputName;
        this.type = inputName;
        this.price = inputPrice;
        this.quantity = inputQuantity;
    }
    
    public void setName(String inputName){
        this.name = inputName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setType(String inputType){
        this.type = inputType;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void setPrice(int inputPrice){
        this.price = inputPrice;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setQuantity(int inputQuantity){
        this.quantity = inputQuantity;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
}
