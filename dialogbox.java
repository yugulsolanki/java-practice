import javax.swing.JOptionPane;
import java.util.StringJoiner;
class StringOp{
	public static void main(String ar[]){
		String password = JOptionPane.showInputDialog("Enter password :");
		int result = JOptionPane.showConfirmDialog(null,"Are you sure?");
		if(result==0){
			if(password.equalsIgnoreCase("ABc")){
				int rollno = Integer.parseInt(JOptionPane.showInputDialog("Enter roll no: "));
				StringJoiner ref = new StringJoiner(",");
				ref.add("my ");
				ref.add("name ");
				ref.add("is ");
				ref.add("yugul solanki");
				System.out.println(ref);
				JOptionPane.showMessageDialog(null,ref+" "+rollno);
			}
			
		}
	}
}