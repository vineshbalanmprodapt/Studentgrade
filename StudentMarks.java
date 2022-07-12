import java.util.Scanner;

public class StudentMarks {	
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE STUDENT NAME:");
      String name=s.next();
      System.out.println("ENTER THE STUDENT'S ID:");
      int id=s.nextInt();
      System.out.println("ENTER THREE SUBJECTS MARKS:");
      
      int phy=s.nextInt();
      int che=s.nextInt();
      int mat=s.nextInt();
      if(phy>100||che>100||mat>100) {
    	  throw new Exception("Invalid Mark");
      }
      int tot=(int) (phy+che+mat);
      System.out.println("TOTAL MARKS ="+tot);
      int per=(int)(tot*0.3);
      System.out.println("PERCENTAGE="+per+"%");
      if(per>90)
    	  System.out.println("GRADE OBTAINED BY THE STUDENT IS 'O'");
      else if(per<=90&&per>=80)
    	  System.out.println("GRADE OBTAINED BY THE STUDENT IS 'A'");
      else if(per<=80&&per>=70)
    	  System.out.println("GRADE OBTAINED BY THE STUDENT IS 'B'");
      else if(per<60)
          System.out.println("GRADE OBTAINED BY THE STUDENT IS 'C'");
      else
    	  System.out.println("GRADE OBTAINED BY THE STUDENT IS 'P'");
	}
	}


