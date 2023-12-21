public class App { 

    
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Line Comparison Computation Program"); 
        System.out.println("***********************************************************");
        Point p1 = new Point(1, 2) ;
        Point p2 = new Point(4, 5) ;

        Line line1 = new Line(p1, p2) ; 
        double len1 = line1.getLength();
        System.out.println("Length of line 1 is "+len1); 
        System.out.println("***********************************************************");
        // Check the Two lines are equal or not 
        
        Point p3 = new Point(1, 2) ;
        Point p4= new Point(4, 6) ;

        Line line2 = new Line(p3, p4) ; 
        double len2 = line2.getLength();
        System.out.println("Length of line 2 is "+len2); 
        System.out.println("***********************************************************"); 

        if(Line.isEqual(line1,line2)){
            System.out.println("Length are equal");
        }
        else
        System.out.println("Length are not equal");

         System.out.println("***********************************************************");
 
        //   Compare the two lines  > , < or == 
        double comp = Line.compare(line1,line2) ;
        if(comp==0) {
            System.out.println("Are Equal");
        }
        else if (comp>0){
            System.out.println("Line 1 is greater than line 2");
        }
        else{
            System.out.println("Line 1 is smaller than line 2 ");
        }

    }
}
