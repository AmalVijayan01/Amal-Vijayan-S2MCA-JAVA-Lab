import java.util.*; 
class arrayjava{ 
public static void main(String args[]){
 ArrayList<String> alist=new ArrayList<String>(); 
alist.add("Ragnar"); 
alist.add("Lagartha"); 
alist.add("Ubbe");     
 alist.add("Ivar");
alist.add("Beion");    
alist.add("Athlastan"); 
//displaying elements
 System.out.println(alist); 
//Adding "Floki" at the fourth position 
alist.add(3, "Floki");
 //displaying elements
 System.out.println(alist); 
}    }
