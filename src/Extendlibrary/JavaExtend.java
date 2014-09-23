package Extendlibrary;

import ExtendInterface.JavaExtendInterface;
import ExtendInterface.LogInterface;


public class JavaExtend implements JavaExtendInterface{

	
	public String[] JavaMain(int Cmd, String Context , LogInterface Log ) {
		String[] Ret = new String[2];
		System.out.println(" JavaExtend Cmd recieved Cmd = " + Cmd );
		Log.LogOut( " JavaExtend Cmd recieved Cmd = " + Cmd );
		Ret[0] = "1"; //Continue
		Ret[1] = "CallJavaSuccess!";//return context
		return Ret;
	}
	/**
	 * @param args
	 */
	
}
