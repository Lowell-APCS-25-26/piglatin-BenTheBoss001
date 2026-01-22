package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
       for (int i = 0; i < sWord.length(); i++){
            if(sWord.substring(i, i+1).equals("a")){
            return i;
            }
            if(sWord.substring(i, i+1).equals("e")){
            return i;
            }
            if(sWord.substring(i, i+1).equals("i")){
            return i;
            }
            if(sWord.substring(i, i+1).equals("o")){
            return i;
            }
            if(sWord.substring(i, i+1).equals("u")){
            return i;
            }
        }
        return -1;
    }

    public String pigLatin(String sWord) {
        if (findFirstVowel(sWord) == -1){
            return sWord + "ay";
        } else if (findFirstVowel(sWord) == 0){
            return sWord + "way";
        } else if (sWord.substring(0,1).equals("q") && sWord.substring(1,2).equals("u")){
            return sWord.substring(2) + "quay";
        } else {
            return sWord.substring(findFirstVowel(sWord)) + sWord.substring(0,findFirstVowel(sWord)) + "ay";
        }
        //return null;
    }
}
