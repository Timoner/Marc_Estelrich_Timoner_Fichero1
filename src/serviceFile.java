import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class serviceFile {

    //Method create file and get UserText.
        public void createFIle(String name){
            File file = new File(name);     //File create file.

            try {
                FileWriter witriter = new FileWriter(file, true); //Create writer onject
                BufferedWriter buffer = new BufferedWriter(witriter); //Wrtite text in file
                buffer.append("Humans are humans because they belong to the species Homo sapiens, which is characterized by certain physical and mental characteristics, such as bipedalism, a large brain relative to body size, and advanced cognitive abilities. The evolution of humans as a distinct species is thought to have begun around 300,000 years ago in Africa,\n ")
                .append("and humans have since spread to occupy nearly every corner of the world. However, the question of why humans exist, or why anything exists, is a philosophical and existential question that has puzzled humans for centuries, and remains a subject of debate and speculation among philosophers, theologians, and scientists.");
                buffer.close();
                System.out.println("File was create");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
