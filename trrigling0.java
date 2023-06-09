
public class trrigling0 {
    public static String removertrling(String num){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i <num.length();i++){
            if(num.charAt(i) == '0'){
                if(num.charAt(i+1) == '0'){
                    i++;
                }else{
                    sb.append(num.charAt(i));
                }
            }else{
                sb.append(num.charAt(i));
            }
            
        }
        return sb.toString();
    }

    
    public static void main(String[] args) {
        String num = "6320000060155576064433475194277496015965584784508346180457590630139671509042003";
        String str = removertrling(num);
        System.out.println(str);
        

    }
}
    // Input: num = "51230100"
    // Output: "512301"
    // Explanation: Integer "51230100" has 2 trailing zeros, we remove them and
    // return integer "512301".