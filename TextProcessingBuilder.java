public class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sbuilder = new StringBuilder("Data");
        sbuilder.append(" Processing");
        System.out.println("Modified: " + sbuilder);
        
        /* 
           Comparison: 
           StringBuffer is thread-safe (synchronized), while 
           StringBuilder is not thread-safe but faster.[cite: 1]
        */
    }
}