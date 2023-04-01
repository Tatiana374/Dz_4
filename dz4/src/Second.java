
public class  Second {

    public int grade  = 10;
    public String print(){
        String updatedValue = String.format("\"---<%d>---\"%n",grade);
        System.out.println(updatedValue);
        return updatedValue;
    }


}