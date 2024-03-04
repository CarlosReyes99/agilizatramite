package org.example;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import pdf.EmployeeDataPdf;
import pdf.FillPdf;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws DocumentException, IOException {
        System.out.println("Hola mundo");
        EmployeeDataPdf employeeDataPdf = new EmployeeDataPdf();
        employeeDataPdf.setCorreo("example@test.com");
        employeeDataPdf.setNombreEmpleado("Carlos Reyes");
        employeeDataPdf.setNumeroEmpleado("b181021");
        employeeDataPdf.setDepartamento("Software");
        employeeDataPdf.setDescEquipo("Dell 1535 RYzen 5");
        employeeDataPdf.setModelEquipo("2020");
        employeeDataPdf.setActivoEquipo("abcdfgh");
        employeeDataPdf.setNumSerie("12345");
        employeeDataPdf.setEtiquetaEquipo("etk1");




        FillPdf fillPdf = new FillPdf();
        FillPdf.llenarPdf(employeeDataPdf);


    }


}

