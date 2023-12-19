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

}

public class App { 

    
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Line Comparison Computation Program"); 

        Point p1 = new Point(1, 2) ;
        Point p2 = new Point(4, 5) ;

        double dis = p1.distanceBetweenTwoPoints(p1, p2) ;
        System.out.println("Distance between given two point is "+dis);
    }
}
