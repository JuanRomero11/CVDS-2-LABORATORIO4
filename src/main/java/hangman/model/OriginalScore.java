package hangman.model;
public class OriginalScore implements GameScore{
	int score = 100;
	/**
     * @param correctCount Cantidad de intentos correctos ademas de tener que ser mayores a cero
     * @param incorrectCount Cantidad de intentos incorrectos ademas de tener que ser mayores a cero
     * @pre El puntaje inicial debe ser igual a 100.
     * @pos El puntaje final debe ser mayor o igual a 0.
     * @return Puntaje obtenido
    */
	public int calculateScore(int correctCount, int incorrectCount ){

        if(correctCount < 0 || incorrectCount < 0){
            System.out.println("Paramteros incorrectos");
        }else if(incorrectCount >= 0 && incorrectCount <= 9 ){            
            score = 100 - (incorrectCount*10);
        }else if(incorrectCount >= 10){
            score = 0;
        }        
        return score;   
       
    }

}