import java.util.ArrayList;
import java.time.LocalDate;

public class CostList {
    ArrayList<CostItem> itemList;
    CostItem previousItem;
    
    public CostList(){
        this.itemList = new ArrayList<CostItem>();
        this.previousItem = null;
    }
    
    public void addItem(CostItem item){
        this.itemList.add(item);
        this.previousItem = item;   
    }
    
    public void deleteItem(CostItem item){
        this.itemList.remove(item);
        if(this.previousItem == item)
            this.previousItem = null;
    }
    public void deleteItem(String name, String type, int price, int quantity,  LocalDate date){
        for(int i=0; i < itemList.size(); i++){
            if(itemList.get(i).getName().equals(name) && itemList.get(i).getType().equals(type) && itemList.get(i).getPrice() == price && itemList.get(i).getQuantity() == quantity && itemList.get(i).getDate() == date)
                deleteItem(itemList.get(i));
       }
    }      

    public CostItem getItemAt(int i){
        return this.itemList.get(i);
    }
    
    public void resetPreviousItem(){
        this.previousItem = null;
    }
    
    public ArrayList<String> getAllTypes(){
        ArrayList<String> types = new ArrayList<String>();
        boolean addType;
        
        for(int i=0; i < this.itemList.size(); i++){
            addType = true;
            String type = this.itemList.get(i).getType();
            for(int j=0; j < types.size(); j++){
                if(type.equals(types.get(j)))
                    addType = false;
            }
            if(addType == true)
                types.add(type);
        }
              
        return types;
    }
    
    public int getPriceFromType(String type){
        int val=0;
        
        for(int i=0; i < this.itemList.size(); i++){
            CostItem item = this.itemList.get(i);
            if(item.getType().equals(type))
                val += item.getPrice() * item.getQuantity();
        }
        
        return val;
    }
    
    public void undoPrevious(){
        if(this.previousItem != null){
            deleteItem(this.previousItem);
        }
    }
    
    public int getSize(){
        return this.itemList.size();        
    }    
}
