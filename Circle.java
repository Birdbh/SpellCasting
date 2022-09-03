public class Circle {
    int xlocation;
    int ylocation;
    int radius;
    
    public Circle(int xlocation, int ylocation, int radius){
        this.xlocation = xlocation;
        this.ylocation = ylocation;
        this.radius = radius;
    }

    public boolean isCollision(Circle c1, Circle c2){
        if ((c1.radius+c2.radius)>distanceBetweenCircleCenter(c1, c2)){
            return true;
        }
        else{
            return false;
        }
    }

    public double distanceBetweenCircleCenter(Circle c1, Circle c2){
        int distancex = c1.xlocation-c2.xlocation;
        int distancey = c1.ylocation-c1.ylocation;
        double distance = Math.sqrt((distancex*distancex)+(distancey*distancey));
        return distance;

    }
}
