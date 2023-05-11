public class App {
    public static void main(String[] args) {
        System.out.println("ejercicio 5, usando switch");

        String estacion = "verano";

        
        switch(estacion){
            
            case "verano":{
                System.out.println("la estacion es verano " );
                break;
            }

            case "otoño":{
                System.out.println("la estacion es otoño ");
                break;
            }

            case "invierno":{
                System.out.println("la estacion es invierno ");
                break;
            }
            case "primavera":{
                System.out.println("la estacion es primavera ");
                break;
            }
            default:{
                System.out.println("la palabra no corresponde a ninguna estacion del año");
            }

        }
        System.out.println("fin de la ejecucion");
    }
}
