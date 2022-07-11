package kata.kyu8;

public class DnaToRna {
	    public String dnaToRna(String dna) {
	      String rna = "";
	      for(int i = 0; i < dna.length(); i++){
	        if(dna.charAt(i) == 'T'){
	          rna = rna + 'U';
	        } else {
	          rna = rna + dna.charAt(i);
	        }
	      }
	        return rna;
	    } 
}

// Another better solution can be found below:
/* public String dnaToRna(String dna){
 * return dna.replace("T", "U");
 * }
 */