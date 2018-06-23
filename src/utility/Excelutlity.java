package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutlity {
    
       private  static XSSFWorkbook wbo;
       private static XSSFSheet wso;
       private static XSSFRow Row;
       private static XSSFCell Cell;
       
       public static void setExcelFile(String Path,String SheetName) throws Exception{
    	  try {
		FileInputStream	fis=new FileInputStream(Path);
			wbo=new XSSFWorkbook(fis);
			wso=wbo.getSheet(SheetName);
		} catch (Exception e) {
		   throw(e);
		} 
       }
     public static  String GetCellData(int RowNum,int CellNum)throws Exception{
    	 try {
			Cell=wso.getRow(RowNum).getCell(CellNum);
			String Celldata=Cell.getStringCellValue();
			return Celldata;
		} catch (Exception e) {
			return"";
		}
    	 
     }
   public static void setcelldata(String Result,int RowNum,int CellNum) throws Exception{
	  try {
		  Row=wso.getRow(RowNum);
		   Cell=Row.getCell(CellNum);
		   if (Cell==null) {
			Cell=Row.createCell(CellNum);
			Cell.setCellValue(Result);
		} else {
			Cell.setCellValue(Result);
		} 
	  FileOutputStream fo=new FileOutputStream(Constant.Excel_path+Constant.testdata_path);
	  wbo.write(fo);
	  fo.flush();
	  fo.close();
	} catch (Exception e) {
      throw(e);
	}
	  
}
}
