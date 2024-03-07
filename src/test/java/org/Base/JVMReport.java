package org.Base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	 
	public static void generateJVMReport(String json) {
		
		File reportLoc=new File("C:\\Users\\ekant\\Desktop\\Ekanth\\AdactinHotelBooking\\target");
		Configuration con=new Configuration(reportLoc, "AdactinHotelBooking");
		con.addClassifications("Platform", "Windows 10");
		con.addClassifications("Ekanth", "WF ConnectTech");
		List<String> jsonFile=new ArrayList<String>();
		jsonFile.add(json); 
		ReportBuilder builder=new ReportBuilder(jsonFile, con);
		builder.generateReports();
	}
}
