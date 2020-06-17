
package calcluter3;

public class programnumber {
   final  String[] hexValues = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    public static int hex_to_decimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    
    public static String hex_to_oct(String input){
    String hexdec_num;
        int dec_num, i=1, j;
        int octal_num[] = new int[100];
        
		
        
        hexdec_num = input;
        
       
        dec_num = hex_to_decimal(hexdec_num);
        
       
        
        while(dec_num != 0)
        {
            octal_num[i++] = dec_num%8;
            dec_num = dec_num/8;
        }
		
      
        String m="";
        for(j=i-1; j>0; j--)
        {
            m=m+String.valueOf(octal_num[j]);
        }
		
    
        
        return m;
    
    }
    
      
    

public  String convertBinaryToHexadecimal(String binary){
   
    String hexadecimal = "";
    int sum = 0;
    int exp = 0;
    for (int i=0; i<binary.length(); i++){
        exp = 3 - i%4;
        if((i%4)==3){
            sum = sum + Integer.parseInt(binary.charAt(i)+"")*(int)(Math.pow(2,exp));
            hexadecimal = hexadecimal + hexValues[sum];
            sum = 0;
        }
        else
        {
            sum = sum + Integer.parseInt(binary.charAt(i)+"")*(int)(Math.pow(2,exp));
        }
    }
    return hexadecimal;
}


public static String hexToBin(String hex){
    String bin = "";
    String binFragment = "";
    int iHex;
    hex = hex.trim();
    hex = hex.replaceFirst("0x", "");

    for(int i = 0; i < hex.length(); i++){
        iHex = Integer.parseInt(""+hex.charAt(i),16);
        binFragment = Integer.toBinaryString(iHex);

        while(binFragment.length() < 4){
            binFragment = "0" + binFragment;
        }
        bin += binFragment;
    }
    return bin;
}
}
