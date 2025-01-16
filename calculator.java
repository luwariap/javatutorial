    import java.util.Scanner ;
    class calculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter  your first no for  calculation : ");
            int num1 = input.nextInt();
            System.out.println("please enter  your second no for  calculation : ");
            int num2 = input.nextInt();
            System.out.println("please give operation you want to perform in small letter as addition/ substraction/divide/multiplication/otheroprator:");
            String opr = input.next();
            float result = switch (opr) {
                case "addition" ->num1 + num2;
                case "substraction"->num1- num2;
                case "multiplication"->num1 * num2;
                case "divide"->num1 / num2;
                default -> -1 ;
                                };
            System.out.println(+num1 + "and " + num2 + " operation" + opr + " result is " + result);
        }
    }

