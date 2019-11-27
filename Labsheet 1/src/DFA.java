
public class DFA {
	public String Tokenize(String s) {
	String Re="";
	for(int i=0;i<s.length();i++)
	{
		if(s.substring(i,i+4)=="main")
		{
			Re=Re+"Keywords ";
			i=i+4;
		}
		if(s.substring(i,i+3)=="var")
		{
			Re=Re+"Keywords ";
			i=i+4;
		}
		if(s.substring(i,i+5)=="input") {
			Re=Re+"Input Function ";
			i=i+5;
		}
		if(s.substring(i,i+5)=="output") {
			Re=Re+"Output Function ";
			i=i+5;
		}
		if(s.substring(i,i+5)=="float") {
			Re=Re+"datatypes ";
			i=i+5;
		}
		if(s.substring(i,i+4)=="char") {
			Re=Re+"datatypes ";
			i=i+4;
		}
	}	
	return Re;
}
}