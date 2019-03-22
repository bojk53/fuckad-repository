import java.util.Scanner;
public class count {

	public static void main(String[] args) 
	{
		count(5);
	}
	public static int count(int n) 
    {
        int tal = 0;
        for (int i = 1; i <= n; i++) 
        {
            tal = i;
            System.out.println(tal);
        }
        return tal;
    }
}
