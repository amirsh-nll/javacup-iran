

public class CodeConventionUtil {

    public String getFieldsName(String... params){
        String result = "";
        String result2= "";
        boolean whitespace = false;

        for (int i = 0; i < params.length; i++) {
            result += params[i].toLowerCase() + " ";
        }

        char ch;
        for (int i = 0; i < result.length(); i++) {
            ch = result.charAt(i);
            if(Character.isWhitespace(ch))
            {
                whitespace = true;
                continue;
            }
            if(whitespace == true)
            {
                result2 += String.valueOf(ch).toUpperCase();
                whitespace = false;
            }
            else
                result2 += String.valueOf(ch);
        }
        return result2;
    }

    public String getMethodsName(String... params){
        String result = "";
        String result2= "";
        boolean whitespace = false;

        for (int i = 0; i < params.length; i++) {
            result += params[i].toLowerCase() + " ";
        }

        char ch;
        for (int i = 0; i < result.length(); i++) {
            ch = result.charAt(i);
            if(Character.isWhitespace(ch))
            {
                whitespace = true;
                continue;
            }
            if(whitespace == true)
            {
                result2 += String.valueOf(ch).toUpperCase();
                whitespace = false;
            }
            else
                result2 += String.valueOf(ch);
        }
        return result2;
    }

    public String getClassName(String... params){
        String result = "";
        String result2= "";
        boolean whitespace = true;

        for (int i = 0; i < params.length; i++) {
            result += params[i].toLowerCase() + " ";
        }

        char ch;
        for (int i = 0; i < result.length(); i++) {
            ch = result.charAt(i);
            if(Character.isWhitespace(ch))
            {
                whitespace = true;
                continue;
            }
            if(whitespace == true)
            {
                result2 += String.valueOf(ch).toUpperCase();
                whitespace = false;
            }
            else
                result2 += String.valueOf(ch);
        }
        return result2;
    }

    public String getConstantsName(String... params){
        String result = "";
        for (int i = 0; i < params.length; i++) {
            result += params[i].replaceAll("\\s+","").toUpperCase();
            if(i!=params.length-1)
                result += "_";
        }
        return result;
    }

}