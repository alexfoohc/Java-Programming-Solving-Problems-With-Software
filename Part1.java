//Finding a Gene - Using the Simplified Algorithm
public class Part1 {
    public String findSimpleGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1 ){
            return "No start codon found";
        }

        int stopIndex = dna.indexOf("TAA", startIndex);
        if ((stopIndex - startIndex)% 3 == 0){
                return dna.substring(startIndex, stopIndex + 3);
            }
        else {
            return "None";
        }
    }

    public void testSimpleGene(){
        String dnaSequence1 = "CCATTGAACATGTTACCATATTACCCACCATTACCATAACCTA";
        String dnaSequence2 = "CTAATCCGGATCCGA";
        String dnaSequence3 = "CCAGCATGCCAGTCAGCTAACAG";
        String dnaSequence4 = "CCAGCATGCCAGTAGCTAACAG";
        System.out.println("DNA sequence to test is: " + dnaSequence1 + "." + " The gene found is: " + findSimpleGene(dnaSequence1));
        System.out.println("DNA sequence to test is: " + dnaSequence2 + "." + " The gene found is: " + findSimpleGene(dnaSequence2));
        System.out.println("DNA sequence to test is: " + dnaSequence3 + "." + " The gene found is: " + findSimpleGene(dnaSequence3));
        System.out.println("DNA sequence to test is: " + dnaSequence4 + "." + " The gene found is: " + findSimpleGene(dnaSequence4));
    }
    public static void main(String[] args) throws Exception {
        Part1 newGene = new Part1();
        newGene.testSimpleGene();
    }
}
