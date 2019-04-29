import java.util.ArrayList;

public class BudgetList {
    ArrayList<BudgetItem> budgetList;
    
    public BudgetList(){
        this.budgetList = new ArrayList<BudgetItem>();
    }
    
    public void addItem(BudgetItem item){
        this.budgetList.add(item);
    }
    
    public void deleteItem(BudgetItem item){
        this.budgetList.remove(item);
    }

    public BudgetItem getItemAt(int i){
        return this.budgetList.get(i);
    }
        
    public boolean checkIfItemExists(BudgetItem item){
        boolean val = false;
        
        for(int i=0; i < this.budgetList.size(); i++){       
            if(item.getName().equals(this.budgetList.get(i).getName()) && item.getType().equals(this.budgetList.get(i).getType())){
                val = true;
                break;
            }
        } 
        return val;
    }    
    
    public boolean checkIfTypeExists(String type){
        boolean val = false;
        
        for(int i=0; i < this.budgetList.size(); i++){       
            if(type.equals(this.budgetList.get(i).getType())){
                val = true;
                break;
            }
        } 
        return val;
    }      
    
    public int getPriceFromType(String type){
        int val=0;
        
        for(int i=0; i < this.budgetList.size(); i++){
            BudgetItem item = this.budgetList.get(i);
            if(item.getType().equals(type))
                val += item.getPrice();
        }
        
        return val;
    }
    
    public int getTotalPrice(){
        int val=0;
        for(int i=0; i < budgetList.size(); i++){
            val += budgetList.get(i).getPrice();
        }
        
        return val;
    }
    
    public void editItemPrice(BudgetItem item){
        for(int i=0; i < this.budgetList.size(); i++){
            if(item.getName().equals(this.budgetList.get(i).getName()) && item.getType().equals(this.budgetList.get(i).getType()))
                this.budgetList.get(i).setPrice(item.getPrice());
        }
    }
    
    public int getSize(){
        return this.budgetList.size();
    }
    
    public ArrayList<String> getAllTypes(){
        ArrayList<String> types = new ArrayList<String>();
        boolean addType;
        
        for(int i=0; i < this.budgetList.size(); i++){
            addType = true;
            String type = this.budgetList.get(i).getType();
            for(int j=0; j < types.size(); j++){
                if(type.equals(types.get(j)))
                    addType = false;
            }
            if(addType == true)
                types.add(type);
        }
              
        return types;
    }    
}
