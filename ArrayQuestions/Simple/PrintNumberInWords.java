public class PrintNumberInWords {
    public static String numberToWords(int number) {
        String words = "";
        String unitsArray[] = { "", "One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
                "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
                "Nineteen", "Twenty" };
        String tensArray[] = { "", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety" };

        if (number == 0) {
            return "Zero";
        }

        if (number < 20) {
            words += unitsArray[number];
        } else {
            words += tensArray[number % 10];
            if ((number % 10) > 0) {
                words += "-" + unitsArray[number % 10];
            }
        }

        if (number >= 1000) {
            int thousands = number / 1000;
            words = numberToWords(thousands) + " Thousand " + words;
        }

        if (number >= 100) {
            int hundreds = (number % 1000) / 100;
            words = numberToWords(hundreds) + " Hundred " + words;
        }

        return words;
    }
    public static void main(String[] args) {
        int number = 1234;
        int num = 0;
        String[] arr = new String[]{};
        arr[0] ="234";
        // {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};


        while (number != 0) {
            int rev = number %10;
            num = num * 10 + rev;
            number /= 10;
        }

        while (num != 0) {
            int rev = num %10;
            System.out.print(arr[rev] +" ");
            num/=10;
        }
    }
}


