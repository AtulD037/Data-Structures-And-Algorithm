package A_Java_Interview_Programs;

public class GivenStringIsValidNumberOrNot {

    public static boolean isNumber(String number){
        try {
            Long.parseLong(number);
            System.out.println("This is a valid number "+number+" ");
        }
        catch (NumberFormatException e){
            System.out.println("Not a valid Number "+number+" ");
            return false;
        }
        return true;
    }

    public static boolean isValidPhoneNumber(String number){
        if (number.length()==10 && isNumber(number)){
            System.out.println("Valid Phone Number "+number);
            return true;
        }
        System.out.println("Not a valid phone number "+number);
        return false;
    }

    public static boolean isCorrectPhoneNumber(String number){
        return number.matches("\\d{10}");
    }

    public static void main(String[] args) {
        System.out.println(isNumber("45896555"));
        System.out.println(isNumber("12w"));
        System.out.println(isNumber("8219476776"));
    }

}
