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
    
    public int getSize(){
        return this.budgetList.size();
    }
}
