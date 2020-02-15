package hangman.model;
public class PowerScore implements GameScore{
	/**
	* @pre Como precondicion debe ingresar dos variables de tipo entero
	* @pre El puntaje inicial debe ser igual a 0.
	* @param correctCount sera el valor con la que se bonificara con 5^i done i es la iesima posicion puntos.
	* @pos Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
	* @param incorrectCount valor con la que se penaliza de -8 puntos.
	*@return Puntaje obtenido  
	**/
	public int score=0;
	public int calculateScore(int correctCount, int incorrectCount){
		if(correctCount <0 || incorrectCount <0 ){
            System.out.println("Parametros Invalidos.");
        }
        int respuesta = 0;
        for(int i=0; i<correctCount;i++){
            respuesta += Math.pow(5,i+1);
        }
        respuesta -= incorrectCount*8;
        if (respuesta < 0){
            respuesta = 0;
        }else if(respuesta > 500){
            respuesta = 500;
        }
        return respuesta;

        
    }


}