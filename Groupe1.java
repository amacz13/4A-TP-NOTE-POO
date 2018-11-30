public class Groupe {
    private List < Integer > liste = new ArrayList < Integer >() ;
    private Integer repere ;

    
    public Groupe ( String r ) {
        repere = Integer.parseInt(s) ;
    }     

    public Groupe ( Integer r ) {
        repere = r ;
    }     
    public void setMembre ( Integer m ) {
        liste . add ( m ) ;
    }
    public void setMembre ( String m ) {
        liste . add ( Integer.parseInt(s) ) ;
    }
    public void afficher () {
        for ( Integer membre : liste ) {
            if( this . isCorrect ( membre ) ) {
                System . out . println ( membre ) ;
            }
        }
    }
    private boolean isCorrect ( Integer membre ) {
        return (( membre != null ) && membre . compareTo ( repere ) > 0) ;
     }
}
            