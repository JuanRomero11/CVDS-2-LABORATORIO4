

import hangman.model.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestMain {
    
    /**
     * IC = Incorrect Count
     * CC = Correct Count
     * Clases de equivalencia:
     * 1. Invalidos: IC < 0 ó CC < 0
     * 2. Calculo normal: 0 <= IC <= 9
     * 3. Calculo especial: IC >= 10
     *      
     */
    @Test
    public void originalScoreTest(){
        OriginalScore score = new OriginalScore();
        assertEquals(10, score.calculateScore(5, 9));
        
        assertEquals(0, score.calculateScore(9, 20));
        
       
        
    }
    
    
    /**
     * IC = Incorrect Count
     * CC = Correct Count
     * Clases de equivalencia:
     * 1. Invalidos: IC < 0 ó CC < 0
     * 2. Calculo normal: IC*2 < CC
     * 3. Calculo especial: IC*2 >= CC
     *      
     */
    @Test
    public void bonusScoreTest(){
    	BonusScore score = new BonusScore();
		int puntaje = score.calculateScore(10,0);
        assertEquals(100,puntaje);
          
        
    }
    
    /**
     * IC = Incorrect Count
     * CC = Correct Count
     * Clases de equivalencia:
     * 1. Invalidos: IC < 0 ó CC < 0
     * 2. Calculo normal: 0 <= (5^CC) - (IC*8) < 500
     * 3. Calculo especial: 0 > (5^CC) - (IC*8)
     * 4. Calculo especial: 500 < (5^CC) - (IC*8)
     *     
     */
    @Test
    public void PowerScore(){
    	PowerScore score = new PowerScore();
		int puntaje = score.calculateScore(3,2);
        assertEquals(139,puntaje);
        
             
        
    }    

}