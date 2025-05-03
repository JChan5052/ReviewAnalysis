import java.util.ArrayList;
public class ReviewAnalysis
{
ArrayList<Review> internal;
public ReviewAnalysis(ArrayList<Review> inc)
{
    internal=inc;
}

public double getAverageRating()
{
double ret=0;
for (int i=0;i<internal.size();i++){
ret+=internal.get(i).getRating();
}
return ret/internal.size();
}

public ArrayList<String> getComments()
{
    ArrayList<String> ret=new ArrayList<String>();
    for (int i=0;i<internal.size();i++)
    {
    String temp=internal.get(i).getComment();
    if (temp.length()>0){
    for (int j=0;j<temp.length();j++){
        if ((temp.substring(j,j+1).equals("!"))) {
            ret.add(i+"-"+temp);
        }
    }
    
}
    }
return ret;
}

public String toString(){
String ret="";
for (int i=0;i<internal.size();i++)
{
    ret+=internal.get(i)+"\n";
}
return ret;
}
}