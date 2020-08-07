//Finding a Gene - Using the Simplified Algorithm Reorganized
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {

        if (Character.isUpperCase(dna.charAt(0))){
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        }
        else {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }

        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) {
            return "No start codon found";
        }

        int stopIndex = dna.indexOf(stopCodon, startIndex);
        if (stopIndex == -1){
            return "No stop codon found";
        }
        if ((stopIndex - startIndex) % 3 == 0) {
            return dna.substring(startIndex, stopIndex + 3);
        } else {
            return "None";
        }
    }

    public void testSimpleGene() {
        String dnaSequence1 = "CCATTGAACATGTTACCATATTACCCACCATTACCATAACCTA";
        String dnaSequence2 = "ATGGGTTAAGTC";
        String dnaSequence3 = "CCAGCATGCCAGTCAGCTAACAG";
        String dnaSequence4 = "CCAGCATGCCAGTAGCTAACAG";
        String dnaSequence5 = "gatgctataat";
        String dnaSequence6 = "ccagcatgccagtcagctaacag";
        System.out.println("DNA sequence to test is: " + dnaSequence1 + "." + " The gene found is: "
                + findSimpleGene(dnaSequence1,"ATG","TAA"));
        System.out.println("DNA sequence to test is: " + dnaSequence2 + "." + " The gene found is: "
                + findSimpleGene(dnaSequence2,"ATA","TAA"));
        System.out.println("DNA sequence to test is: " + dnaSequence3 + "." + " The gene found is: "
                + findSimpleGene(dnaSequence3,"atg","taa"));
        System.out.println("DNA sequence to test is: " + dnaSequence4 + "." + " The gene found is: "
                + findSimpleGene(dnaSequence4,"ATG","TAA"));
        System.out.println("DNA sequence to test is: " + dnaSequence5 + "." + " The gene found is: "
                + findSimpleGene(dnaSequence5,"atg","taa"));
        System.out.println("DNA sequence to test is: " + dnaSequence6 + "." + " The gene found is: "
                + findSimpleGene(dnaSequence6, "ATG", "TAA"));
    }

    public static void main(String[] args) {
        Part2 newGene = new Part2();
        newGene.testSimpleGene();
        
    }
}
