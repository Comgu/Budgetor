
public class BudgetItem {
    String name;
    String type;
    int price;
    
    public BudgetItem(){}
    
    public BudgetItem(String inputName, String inputType, int inputPrice){
        this.name = inputName;
        this.type = inputType;
        this.price = inputPrice;
    }
    public BudgetItem(String inputName, int inputPrice){
    this.name = inputName;
    this.type = inputName;
    this.price = inputPrice;
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
}
