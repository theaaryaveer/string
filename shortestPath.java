public class shortestPath {
    public static double getShortestPath(String path){
        int x=0, y=0;

        for(int i=0; i< path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;

            }
            //north
            if(dir == 'N'){
                y++;
            }
            //west
            if(dir == 'W'){
                x--;
            }
            //east
            if(dir == 'E'){
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (double)Math.sqrt(Y2+X2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
    
}
