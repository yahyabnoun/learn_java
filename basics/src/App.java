// import java.math.BigDecimal;

// import java.lang.reflect.Array;
// import java.util.Arrays;

// import java.text.NumberFormat;

// import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        // short b = 127;
        // System.out.println("value of b is : "+ b);
        // b++;
        // System.out.println("value of b is : "+ Short.MAX_VALUE);
        // System.out.println("value of b is : "+ Short.MIN_VALUE);

        // -------------------------------- BigDecimal ------------------------------------------

        // Double valueOf = .15;
        // String TextOfValue = Double.toString(valueOf);

        // BigDecimal CreateBigTotalValueOf = new BigDecimal(TextOfValue);
        // BigDecimal TotalValueOf = CreateBigTotalValueOf.add(CreateBigTotalValueOf.add(CreateBigTotalValueOf));

        // System.out.println("value of b is : " + TextOfValue);
        // System.out.println("value of b is : " + TotalValueOf);

        // -------------------------------- casting ------------------------------------------

        // long Valuerx = 1024;
        // System.out.println("long value  is : " +Valuerx);


        // int Valuerxint = (int) Valuerx;
        // System.out.println("int value  is : " +Valuerxint);

        // short Valuerxshort = (short) Valuerx;
        // System.out.println("short value  is : " +Valuerxshort);

        // byte Valuerxbyte = (byte) Valuerx;
        // System.out.println("byte value is : " +Valuerxbyte);


        // --------------------------------  Booleans  ------------------------------------------  
        
        
        // boolean Valuerx = false;

        // System.out.println("boolean value is : " + Valuerx);


        // String textboolean = "false";
        // boolean convertToBoolean = Boolean.parseBoolean(textboolean) ;

        // System.out.println("boolean value is : " + !convertToBoolean);



        // --------------------------------  Characters   ------------------------------------------  

        // char b = 'b';
        // char c = 'c';
        // char unicode_at = '\u0040';
        // char unicode_dollar = '\u0024';


        // System.out.println("char value toupper is : " + Character.toUpperCase(b));
        // System.out.println("char value toupper is : " + Character.toUpperCase(c));
        
        // System.out.println("char value is : " + b);
        // System.out.println("char value is : " + c);

        // System.out.println("char value is : " + unicode_at);
        // System.out.println("char value is : " + unicode_dollar);
        
        

        // --------------------------------  Arrays  ------------------------------------------ 

        // int arr[]  = {1,4,5,12};

        
        // System.out.println("length of array is : " + arr.length);
        // System.out.println("length of array is : " + arr[2]);


        // --------------------------------  Arrays sort()  ------------------------------------------ 
        
        // int arr[]  = {1,4,5,12};
        
        // Arrays.sort(arr);

        // System.out.println("index 0 array is : " + arr[0]);
        // System.out.println("index 1 array is : " + arr[1]);
        // System.out.println("index 2 array is : " + arr[2]);
        // System.out.println("index 3 array is : " + arr[3]);




        // --------------------------------  Arraycopy()  ------------------------------------------ 



        // int oreginal[]  = {1,4,5,12};
        // int copy[]  = {1,4,5,12};
        
        // System.arraycopy(oreginal, 0, copy, 0, 0);;

        // System.out.println("index 0 array is : " + copy[0]);
        // System.out.println("index 1 array is : " + copy[1]);
        // System.out.println("index 2 array is : " + copy[2]);
        // System.out.println("index 3 array is : " + copy[3]);


        // --------------------------------  Do while  ------------------------------------------ 

        // int num = 0 , qeustion = 0;
        // do {
        //     System.out.println("number of qeustion : " + num);
        //     num++;
        // } while (num<3 && qeustion==1);


        // --------------------------------  Convert primitive to string  ------------------------------------------ 

        // boolean b1 = true;
        // String txtToString = Boolean.toString(b1);
        // System.out.println("txt To String is : " + txtToString);

        // int int1 = 12;
        // String intToString = Integer.toString(int1);
        // System.out.println("txt To String is : " + intToString);       

        // long long2 = 35_541_984;
        // NumberFormat longToString = NumberFormat.getNumberInstance();
        // String formatvalue = longToString.format(long2);
        // System.out.println("txt To String is : " + formatvalue);  



        // --------------------------------  StringBuilder   ------------------------------------------ 

        // StringBuilder str1 = new StringBuilder("Hello")
        // .append(", ")        
        // .append("students")        
        // .append("!");


        // System.out.println(str1); 
        // str1.delete(0, str1.length());
        // System.out.println(str1); 

        // --------------------------------  Comparing strings  ------------------------------------------ 


        // String str1 = "hi ";
        // String str2 = "five";
        // String str3 = str1 + str2 ;
        // String str4 = "HI FIVE";

        // if (str3.equals(str4))
        //     System.out.println("they're equal" );  
        // else
        //     System.out.println("they're not equal" );  


        // if (str3.equalsIgnoreCase(str4))
        //     System.out.println("they're equal" );  
        // else
        //     System.out.println("they're not equal" ); 



        // --------------------------------  User input  ------------------------------------------ 

        // --------------------------------  Formatting numeric values (search fot this) ------------------------------------------ 

        // --------------------------------  Count, search and cut strings  ------------------------------------------ 
        
        // String str1 = "Hello beatiful people";
        
        // System.out.println(str1.length());
        
        // int position = str1.indexOf("bea");
        // System.out.println(position);
        
        // System.out.println(str1.substring(position));
        
        // --------------------------------  Remove white space in strings  ------------------------------------------ 
        
        String str1 = "yahya     ";
        System.out.println(str1.length());
        
        str1 = str1.trim();
        System.out.println(str1.length());
        
        
        // --------------------------------  Date / Time (Gregorian Calendar)  ------------------------------------------ 









    }
}
