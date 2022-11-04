package curs13;

public class TrycuResurseMain {

    public static void main(String[] args) throws Exception {

        try(Resursa r1 = new Resursa("r1");Resursa r2 = new Resursa("r2")) {
            r1.folosesteResursa();
        } catch (Exception e) {
            System.out.println("s-a aruncat exceptia: " + e.getMessage());
        }

        System.out.println("------fara try with resources----------");
        Resursa r1 = null,r2 = null;
        try {
            r1 = new Resursa("r1");
            r2 = new Resursa("r2");
            r1.folosesteResursa();
        } catch (Exception e) {
            System.out.println("s-a aruncat exceptia: " + e.getMessage());
        }
        finally {
            if(r1 != null){
                //inchide resursa
                r1.close();
            }
            if(r2 != null){
                r2.close();
            }
        }
    }
}
