//Example 1:
//Input: s = "the sky is blue"
//Output: "blue is sky the"
//Example 2:
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.
//Example 3:
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

public static void main (String[] args){

    Scanner scanner = new Scanner (System.in );
    String  = scanner.nextLine();
    System.out.println(reversi(input));

    String[] testInput = new String[5];
    String testOutput = "blue is sky the";
    testInput[0] = " the sky is blue ";
    testInput[1] = "the sky is blue ";
    testInput[2] = " the sky is blue";
    testInput[3] = "the sky is blue";
    testInput[4] = "   the      sky     is      blue   ";
    
    //Unit test
    for(int i=0; i<testInput.length; i++){
        if(!reversi(testInput[i]).equals(testOutput)){
            System.out.println("failed"+i);
            System.out.println(reversi(testInput[i]));
        }
    }
    


public static String reversi(String input){
    Stack stack = new Stack(){
    String s = ""{

    
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    Stack stack = new Stack();
    
    for(int i=input.length()-1; i>=0; i--){
        char c = input.charAt(i);
        if(c!=' '){
            stack.push(c);
        }
        else{
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){

                    s+=stack.pop();
                }
                s+=" ";

                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        }

    
    if(!stack.isEmpty()){
        while(!stack.isEmpty()){
            s+=stack.pop();
        }
    }
    
    if(s.charAt(s.length()-1)==' '){
        s = s.substring(0, s.length()-1);
    }
    
    return s;
        }
    }
}


class {
    public String reverseWords(String)  {
 var arr = s.split(" ");
 var list = Arrays.stream(arr).filter(x -> !x.isEmpty()).toArray(String[]::new);
        Collections.reverse(Arrays.asList(list));
        return String.join(" ", list);
    }
}


class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int n=s.length(), i=n-1, j=n;
        while(i>=0){
            if(s.charAt(i)==' '){
                sb.append(s.substring(i+1,j)).append(" ");
                while(s.charAt(i)==' ')
                    i--;
                j=i+1;
            }
            else
                i--;
        }
        sb.append(s.substring(0,j));
        return sb.toString();
    }
}


class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int l = 0;
        while(l<s.length()){
            char ch = s.charAt(l);
            if(ch==' '){
                l++;
                continue;
            }
            StringBuilder tmp = new StringBuilder();
            int r = l+1;
            tmp.append(ch);
            while(r<s.length() && s.charAt(r)!=' '){
                tmp.append(s.charAt(r));
                r++;
            }
            tmp.append(" ");
            sb.insert(0, tmp.toString());
            l = r+1;
        }
        return sb.toString().trim();
    }
}

public class Solution {
  
    public String reverseWords(String s) {
      if (s == null) return null;
      
      char[] a = s.toCharArray();
      int n = a.length;
      
      // step 1. reverse the whole string
      reverse(a, 0, n - 1);
      // step 2. reverse each word
      reverseWords(a, n);
      // step 3. clean up spaces
      return cleanSpaces(a, n);
    }
    
    void reverseWords(char[] a, int n) {
      int i = 0, j = 0;
        
      while (i < n) {
        while (i < j || i < n && a[i] == ' ') i++; // skip spaces
        while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
        reverse(a, i, j - 1);                      // reverse the word
      }
    }
    
    // trim leading, trailing and multiple spaces
    String cleanSpaces(char[] a, int n) {
      int i = 0, j = 0;
        
      while (j < n) {
        while (j < n && a[j] == ' ') j++;             // skip spaces
        while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
        while (j < n && a[j] == ' ') j++;             // skip spaces
        if (j < n) a[i++] = ' ';                      // keep only one space
      }
    
      return new String(a).substring(0, i);
    }
    
    // reverse a[] from a[i] to a[j]
    private void reverse(char[] a, int i, int j) {
      while (i < j) {
        char t = a[i];
        a[i++] = a[j];
        a[j--] = t;
      }
    }
    
  }
  