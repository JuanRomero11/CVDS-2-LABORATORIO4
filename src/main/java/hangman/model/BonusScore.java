package hangman.model;
public class BonusScore implements GameScore{
	public int score=0;
	/**
	* @pre como precondicion se debe de ingresar dos variables de tipo entero
	* @param correctCount valor con la que se bonifica 10 puntos.
	* @param incorrectCount valor con la que se penaliza -5 puntos.
	* @return Retorna un numero mayor o igual a 0.
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		if(correctCount <0 || incorrectCount <0 ){
           System.out.println("Algun parametro no cumple con los estandares");
        }
        int res = 0;
        res = score - (incorrectCount*5) + (correctCount*10);
        if (res < 0){
            res = 0;
        }
        return res;
    }


}