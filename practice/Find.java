public class Find {

        public  String missingChar(String str, int n){
            String input = str.substring(0, n);
            String output = str.substring(n+1, str.length());
            return input + output;
        }
        public static void main(String args[]) {
    Find mySub = new Find();
    
            mySub.missingChar("kitten", 1);
            mySub.missingChar("kitten", 0);
            mySub.missingChar("kitten", 4);
        }
    }
    
