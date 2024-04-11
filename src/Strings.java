public class Strings {
    public static void main(String[] args){
        String str = "#";
        int i = 0;
        StringBuffer buffer = new StringBuffer();
        do {i++;
            buffer.append(str);
            System.out.println(buffer);
        }while (i<20);

    }
}
