public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3) {
            return "Error: Invalid number of arguments";
        }

        int leftOperand;
        int rightOperand;

        try {
            leftOperand = Integer.parseInt(args[0]);
            rightOperand = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            return "Error: Invalid operand";
        }

        switch (args[1]) {
            case "+":
                return Integer.toString(leftOperand + rightOperand);
            case "-":
                return Integer.toString(leftOperand - rightOperand);
            case "*":
                return Integer.toString(leftOperand * rightOperand);
            case "/":
                if (rightOperand == 0) {
                    return "Error: Division by zero";
                }
                return Integer.toString(leftOperand / rightOperand);
            case "%":
                if (rightOperand == 0) {
                    return "Error: Division by zero";
                }
                return Integer.toString(leftOperand % rightOperand);
            default:
                return "Error: Invalid operator";
        }
    }
}