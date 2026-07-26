package testCases;

import java.io.FileReader;

import java.util.List;

import com.opencsv.CSVReader;

public class CSVReaderUtility {

    public static List<String[]> getCSVData(String filePath) throws Exception {

        CSVReader reader = new CSVReader(new FileReader(filePath));

        List<String[]> data = reader.readAll();

        reader.close();

        data.remove(0); // Remove Header

        return data;

    }

}
