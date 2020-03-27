package utilizandoExcel;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils2 {

	public static void main(String[] args) throws Exception {

	XSSFWorkbook src = new XSSFWorkbook("src/test/java/utilizandoExcel/DadosLogin.xlsx");
		
		XSSFSheet st = src.getSheetAt(0);
		
		String data0 = st.getRow(0).getCell(0).getStringCellValue();
		String data01 = st.getRow(0).getCell(1).getStringCellValue();
		String data02 = st.getRow(1).getCell(0).getStringCellValue();
		String data03 = st.getRow(1).getCell(1).getStringCellValue();
		
		//int data03 = st.getLastRowNum();
	
		System.out.print(data0);
		System.out.print("         ");
		System.out.println(data01);
		
		System.out.print(data02);
		System.out.print("   ");
		System.out.println(data03);
		
		
		
		src.close();
	}
	
	

}
