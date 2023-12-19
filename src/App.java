class Point{
    double x ,y ;
   public Point(double x,double y){
      
    this.x =x ;
    this.y =y ;
   
    }
    
     double distanceBetweenTwoPoints(Point p1 , Point p2){
        
        double x1 =p1.x ;
        double y1 =p1.y ;
        double x2 =p2.x ;
        double y2 =p2.y ;
        double sumOfSquare = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) ;
        double ans = Math.sqrt(sumOfSquare) ;
       return ans;

     }

     boolean isEqualTwoLine(double dis1,double dis2){
         return dis1==dis2 ;
     }

}

public class App { 

    
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Line Comparison Computation Program"); 
        System.out.println("***********************************************************");
        Point p1 = new Point(1, 2) ;
        Point p2 = new Point(4, 5) ;

        double dis1 = p1.distanceBetweenTwoPoints(p1, p2) ;
        System.out.println("Distance between given two point is "+dis1); 
        System.out.println("***********************************************************");
        // Check the Two lines are equal or not 
        
        Point p3 = new Point(1, 2) ;
        Point p4= new Point(4, 5) ;

        double dis2 = p2.distanceBetweenTwoPoints(p3, p4) ;
        System.out.println("Distance between given two point is "+dis2); 
        
        if(p1.isEqualTwoLine(dis1, dis2)){
            System.out.println("Length are equal");
        }
        else
        System.out.println("Length are not equal");

         System.out.println("***********************************************************");
 
        //   Compare the two lines  > , < or == 
        
        if(dis1==dis2) {
            System.out.println("Are Equal");
        }
        else if (dis1 > dis2){
            System.out.println("Line 1 is greater than line 2");
        }
        else{
            System.out.println("Line 1 is smaller than line 2 ");
        }

    }
}
