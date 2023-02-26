class  calculator{
    public static void main(String args[]) {
        //Scanner sc= new Scanner(System.in);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        String operator = args[1];
        int result = 0 ;
        switch(operator){
            case "+": result = a+b;break;
            case "-": result = a-b;break;
           case "*": result = a*b;break;
            case "/": result = a/b;break;
            case "%": result = a%b;break;
            default:System.out.println("Invalid operator");
        }
        System.out.println("Result is : "+result);
    }
}