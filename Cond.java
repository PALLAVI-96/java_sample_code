public class Cond{
    public static void main (String[]args){
        int naveen = 30;
        int pallavi = 28;
        int kathu = 25;
        if (naveen > pallavi && naveen > kathu) {
            System.out.println("Naveen is elder");
        } else if (pallavi > kathu) {
            System.out.println("Pallavi is elder");
        } else {
            System.out.println("kathu is younger");
        }
    }
}