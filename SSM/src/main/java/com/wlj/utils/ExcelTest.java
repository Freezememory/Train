package com.wlj.utils;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Wanglj
 * @date 2019/10/22 17:31
 */
public class ExcelTest {
    public  static  void main (String[] args){
        test();
    }
        public static void test(){
            try{
                jxl.Workbook wb =null;
                InputStream is = new FileInputStream("E:\\WorkFiles\\曲库流程相关\\contentPackage.xls");
                wb = Workbook.getWorkbook(is);

              //   int sheetSize = wb.getNumberOfSheets();
                Sheet sheet = wb.getSheet(0);
                int row_total = sheet.getRows();
                for (int j = 1; j < row_total; j++) {
                        Cell[] cells = ((Sheet) sheet).getRow(j);
                        System.out.println(cells[0].getContents());
                       // System.out.println(cells[1].getContents());
                      //  System.out.println(cells[2].getContents());
                }
            }catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (BiffException e){
                e.printStackTrace();
            }
        }

    }



