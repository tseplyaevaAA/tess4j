/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
/**
 *
 * @author Настя
 */
import java.io.File;
import net.sourceforge.tess4j.*;


public class TesseractExample {

    public static void main(String[] args) {
    //  System.loadLibrary("libtesseract304");
        File imageFile = new File("tessdata\\2.tif");
        Tesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}