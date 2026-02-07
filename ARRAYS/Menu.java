class Food{
    String name;
    String cuisines;
    int ratings;
    Food(String n,String c,int r){
        name=n;
        cuisines=c;
        ratings=r;
    }
}
class FoodRatings{
    public FoodRatings(String foods[],String []cuisines,int [] rating){

    }
    public void changeRatings(String food,int newRating){
        
    }

    public String highestRating(String cuisine){
        return "Hello";
    }
}
public class Menu {
    public static void main(String[] args) {
        String food[]={"kimchi","miso","sushi","moussaka","ramen","bulgogi"};
        String cuisines[]={"korean","japanese","japanese","greek","japanese","korean"};
        int ratings[]={9,12,8,15,14,7};


        FoodRatings foodRatings=new FoodRatings(food, cuisines, ratings);


    }
}
