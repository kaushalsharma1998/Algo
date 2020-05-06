
public class Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nsp=7/2;
	     int nst=1;
	     for (int i=1;i<=7;i++)
	     {
	         int val=i;
	    	 if(i>7/2+1)
	    	 {
	    		 val=7-i+1;
	    	 }
	         System.out.println();
	         
	    	 for (int csp=1;csp<=nsp;csp++)
	         
	        	 System.out.print("-");
	         
	         for (int cst=1;cst<=nst; cst++)
	        	 
	         { System.out.print(val);
	         	 if(cst<=nst/2)
	         		 { val++;}
	         	 else val--;
	         }
	         	 if (i<=7/2)
	             {
	        	 
	        	 nsp--;
	             
	             nst+=2;
	             
	             }
	         
	        else  
	            {
	                nsp++;
	                nst-=2;

	            }           
	     }
	
	}

}
