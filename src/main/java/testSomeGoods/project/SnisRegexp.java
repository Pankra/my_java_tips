package testSomeGoods.project;

/**
 * Hello world!
 *
 */
public class SnisRegexp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String snils = "123-123-123-11";
        System.out.println(snils);
        boolean isCorrect = false;
        
        
        isCorrect = snils.matches("^\\d{3}-\\d{3}-\\d{3}-\\d{2}$");
        
        System.out.println(isCorrect);
        
        Long inn = 123456789012L;
        boolean isInnCorrect = false;
        
        isInnCorrect = inn.toString().matches("^\\d{12}$");
        System.out.println(isInnCorrect);
        
        
    }
}
