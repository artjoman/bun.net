package springboot.camel.base.utils;

import org.springframework.stereotype.Component;

@Component
public class ParseUtils {
	public static String getPathVariableforPary(String in) throws Exception{
		String out=null;
		///user/query/parties/12
		if(in.length()>20){
			out = (String) in.substring(20);
			
			if(!out.matches("[0-9]+")){
				throw new Exception("Unsupported value :"+out);
			}
		}
				
		return out;
	}
}
