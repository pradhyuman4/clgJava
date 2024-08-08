class as8_lengthofnullstring{
    public static void main(String[] args) {
        String s1 = "";
        String s2 = null ;
        System.out.println(s1.length());
        // System.out.println(s2.length());      ---> gives an error  
        //cannot print length of null 
    }
}