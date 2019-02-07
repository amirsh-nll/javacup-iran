public class RepeatInString {

    public int StringInString(String one, String two)
    {
        if(one == null | two == null)
            return 0;

        if(one.equals("") | two.equals(""))
            return 0;

        String checkstr="";
        int start=0;
        int end=0;
        int result=0;
        for (int i = 0; i < one.length(); i++) {
            start = i;
            end = i + (two.length() - 1);
            if(end>one.length()-1)
                end = one.length() - 1;
            while (start <= end)
            {
                checkstr += one.charAt(start);
                start++;
            }
            if(two.equals(checkstr))
                result++;
            checkstr = "";
        }

        return result;
    }

}
