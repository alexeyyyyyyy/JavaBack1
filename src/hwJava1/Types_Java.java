package hwJava1;

public class Types_Java {

	public static void main(String[] args) {
		
		 for (String arg : args) {
	            switch (arg) {
	                case "Byte":
	                    System.out.println("Byte: Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
	                    break;
	                case "Short":
	                    System.out.println("Short: Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
	                    break;
	                case "Integer":
	                    System.out.println("Integer: Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
	                    break;
	                case "Long":
	                    System.out.println("Long: Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
	                    break;
	                case "Float":
	                    System.out.println("Float: Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
	                    break;
	                case "Double":
	                    System.out.println("Double: Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
	                    break;
	                case "Character":
	                    System.out.println("Character: Min = " + (int) Character.MIN_VALUE + ", Max = " + (int) Character.MAX_VALUE);
	                    break;
	                default:
	                    System.out.println("Unknown type: " + arg + ". Please use Byte, Short, Integer, Long, Float, Double, or Character.");
	                    break;
	            }
	    
	    }

	}

}
