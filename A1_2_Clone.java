package classques;

public class Employee implements Cloneable{
    String name;
    int id;
    
    public Object clone()throws CloneNotSupportedException{  
    	return super.clone();  
    	}  

	void Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    public static void main(String[] args) {
    	try {
        Employee e1= new Employee();
        Employee e2 = (Employee)e1.clone();
        
        System.out.println(e1);
         System.out.println(e2);
    
    
    
  }catch(CloneNotSupportedException c){}  
    
}
}
