public class Ryba {

    private String nazwa;
    private double szansaDrap, szansaNDrap;

    public Ryba(String _nazwa){
        this.nazwa = _nazwa;

        switch(this.nazwa){
            case"karp":
                this.szansaDrap = 0;
                this.szansaNDrap = 0.4;
                break;

            case"szczupak":
                this.szansaDrap = 0.3;
                this.szansaNDrap = 0;
                break;

            case"Okoń":
                this.szansaNDrap = 0.2;
                this.szansaDrap = 0.25;
                break;

            case"sum":
                this.szansaNDrap = 0.1;
                this.szansaDrap = 0.3;
                break;

            case"lin":
                this.szansaNDrap = 0.4;
                this.szansaDrap = 0;
        }
    }
}
