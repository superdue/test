package pk1;

import java.util.regex.*;
//import static net.mindview.util.Print.*;
public class Finding {
public static void main(String[] args) {
Matcher m = Pattern.compile("\\w+")
.matcher("Evening is full of the linnet¡¯s wings");
while(m.find())
	System.out.print(m.group() + ",");
System.out.print("\n");
int i = 0;
while(m.find(i)) {
System.out.print(m.group() + " ");
i++;
}
}
}