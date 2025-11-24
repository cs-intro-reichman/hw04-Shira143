public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[] lowerSen = new String[sentences.length];
        String[] lowerKey = new String[keywords.length];
        for (int i = 0; i < sentences.length; i++) {
            lowerSen[i] =  sentences[i].toLowerCase();
        }
        for (int w = 0; w < keywords.length; w++) {
            lowerKey[w] = keywords[w].toLowerCase();
        }
        for (int l = 0; l <sentences.length ; l++) {
                 for (int r = 0; r < keywords.length; r++) {
                     if (lowerSen[l].contains(lowerKey[r])){
                        System.out.println(sentences[l]);
                        break;
                     }
                      
                 }
                }
            }
        }
        
        
    

