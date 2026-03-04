public class StringBufferAndBuilder {

    public static void main(String args[]){

        StringBuffer sb = new StringBuffer("Yash");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // to change the data of string buffer we have to use append method
        sb.append(" Kumar");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);


        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.insert(0, "java");
        System.out.println(sb);


        sb.setLength(30);
        


    }
    
}
