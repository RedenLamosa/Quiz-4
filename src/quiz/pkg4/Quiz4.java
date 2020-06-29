package quiz.pkg4;

import javax.swing.JOptionPane;

public class Quiz4 {

    public static void main(String[] args) {
        String Sentence = JOptionPane.showInputDialog("Enter a sentence: ");
        int Lenght = Sentence.length();
        
        while (Lenght > 0) {
            int counter = 1;
            String s = Sentence, input;
            char i;
            
            input = JOptionPane.showInputDialog("The sentence is: " + Sentence + "\n" + "Y to remove the last word or N if no: " + "\n");
            i = input.charAt(0);

            if (i == 'Y' || i == 'y') {
                Lenght = Lenght - 1;
                char ch = Sentence.charAt(Lenght);
                
                while (ch != ' ') {
                    counter++;
                    if (Lenght == 0){
                        Lenght++;
                        JOptionPane.showMessageDialog(null, "No words left");
                        return;
                    }
                    Lenght = Lenght - 1;
                    ch = Sentence.charAt(Lenght);
                }
                
                Sentence = Sentence.substring(0, Sentence.length() - counter);
                JOptionPane.showMessageDialog(null, "Original sentence:\n" + s + "\nLast word removed: \n" + Sentence);
            }
            
            else if(i == 'N' || i == 'n'){
                JOptionPane.showMessageDialog(null, "Goodbye");
                return;
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Invalid Input");
            }
        }
    }
}