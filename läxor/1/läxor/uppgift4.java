package läxor;

public class uppgift4 {

    public static void main(String[] args){
        System.out.println("Ett program som beräknar summan av alla tal under 10 000 som är jämnt delbara med 7. \n" + "7, 14, 21, 28 osv");
        int summa = 0;

      // Går igenom alla tal från 10 000 till 0
      for(int i=10000; i>0; i--)
        {
        	//Den kollar ifall det talet kan delas jämnbart med 7, alltså modulus
            if(i%7 == 0){
                summa += i;
            }
        }
        
        System.out.println(summa);
    
    }
}
