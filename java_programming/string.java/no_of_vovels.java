public class no_of_vovels {
    public static void main(String[] args) {
        int count=0;
        // String r="qwertyuioopasdfghjklzxcvbnmacvavirdddfvjxiwis";
        String r="hiiamvinaykumariamdoingthistomakemeperfectandtrackmyincridibleperformance";
        for(int i=0;i<r.length();i++);{
            int i;
            String ch = String.valueOf(r.charAt(i));
            if(ch=="a" || ch=="e" || ch=="i"  || ch=="o" || ch=="u")
                {
                count++;
            }

        }
        System.out.println(count);
    }
}
