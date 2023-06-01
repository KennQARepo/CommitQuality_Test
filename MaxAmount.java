
public class MaxAmount{
public static void main(String[] args){
    //int x = 13, y = 7, z = 3;
    int x = 2, y = 7, z = (int)(Math.random()*10);
    System.out.println("Random number is " + z);
    int large = Math.max(x,y);
    int large2 = Math.max(y,z);
    int large3 = Math.max(x,z);
    //System.out.println(large);
    boolean maxedOut = true;
    while(maxedOut){
        if(large >= large2 && large >= large3){
            System.out.println(large +" is the max");
        }else if(large2 >= large && large2 >= large3){
            System.out.println(large2 +" is the max");
        }/*
        else if(large3 > large&&large2){
            System.out.println(large3 +" is the max");
        }*/
        else{
            System.out.println(large3 + " is the max");
        }
        maxedOut = false;
    }
    }
} 
