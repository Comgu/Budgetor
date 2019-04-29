import java.util.ArrayList;

public class CostList {
    ArrayList<CostItem> itemList;
    
    public CostList(){
        this.itemList = new ArrayList<CostItem>();
    }
    
    public void addItem(CostItem item){
        this.itemList.add(item);
    }
    
    public void deleteItem(CostItem item){
        this.itemList.remove(item);
    }

    public CostItem getItemAt(int i){
        return this.itemList.get(i);
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
}
