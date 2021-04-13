
package lab6;

public class Lab6 {

    public static void main(String[] args) {
       String[] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        
       String[][] answers = {
            {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
            {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
            {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
            {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
            {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
            {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}
        };
        
       int[] output = new int[8];
       int correct = 10;
       
       for(int i = 0; i < 8; i++) {
           for(int j = 0; j < 10; j++){
               if(answers[i][j] != key[j])
                   correct--;
            }
           output[i] = correct;
           correct = 10;
        }
       
       for(int i = 0; i < 8; i++) {
           System.out.println(String.format("Mhs %d jumlah jawaban benar adalah %d", i, output[i]));
       }
    }
}
