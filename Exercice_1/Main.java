/**
 * Main
 */
public class Main {

    

public static void main(String[] args) {

    System.out.println(new Main().aire(4));

    System.out.println(new Main().perimetre(4));
    
}
    
    /**
     * @param rayon
     * @return area
     */
    public String  aire (double rayon) {
        
        double aire = Math.PI * Math.pow(rayon, 2);

        return "Aire du cercle est : " + aire;
        
    }

     /**
     * @param rayon
     * @return perimetre
     */
    public String  perimetre (double rayon) {
        
        double perimetre = Math.PI * 2 * rayon;

        return "Perimetre du cercle est : " + perimetre;
        
    }

}