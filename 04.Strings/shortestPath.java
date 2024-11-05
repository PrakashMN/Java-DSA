//Given a route contaning 4 directions East,West,North,South find the shortest path to reach destinstion

public class shortestPath {
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir=='W'){
                x--;
            }
            else if(dir=='E'){
                x++;
            }
            else if(dir=='S'){
                y--;
            }
            else{
                y++;
            }
        }

        int X2=x*x;
        int Y2=y*y;
        return (float) Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN"; //N : NORTH,E : EAST,S : SOUTH,W : WEST.
        System.out.println(getShortestPath(path));
    }
}
