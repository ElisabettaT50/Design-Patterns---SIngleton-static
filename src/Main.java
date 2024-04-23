public class Main {

    public static void main(String[] args){

        User user1 = User.getUser();
        user1.stampaDettagli();

        User user2 = User.getUser();
        user2.setNome("Betta");
        user2.setEta(30);
        user2.stampaDettagli();

    }
}