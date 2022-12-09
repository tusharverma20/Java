
class CharacterCounter {
     
    public static void main(String[] args) {
        String s ="TusHarR@20";
        int low=0,upp=0,dig=0,sp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            low++;
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            upp++;
            else  if(s.charAt(i)>='0' && s.charAt(i)<='9')
            dig++;
            else
            sp++;
        }
        System.out.println("Lower: "+low);
        System.out.println("Upper: "+upp);
        System.out.println("Digit: "+dig);
        System.out.println("Special: "+sp);
        
        
    }
}
