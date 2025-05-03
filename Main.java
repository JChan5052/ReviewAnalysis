import java.util.ArrayList;
public class Main{
    
    public static void main(String[] args) 
    {
     ArrayList<Review> reviews=new ArrayList<>();
     reviews.add(new Review(4,"Good! Thx"));
     reviews.add(new Review(3,"OK site"));
     reviews.add(new Review(5,"Great!"));
     reviews.add(new Review(2,"Poor! Bad."));
     reviews.add(new Review(3,""));
     ReviewAnalysis list=new ReviewAnalysis(reviews);
     System.out.println(list);
     System.out.println(list.getAverageRating());
     System.out.println(list.getComments());
    }

}