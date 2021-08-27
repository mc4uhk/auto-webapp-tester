package hk.mc4u.webtester.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test09 {

	@Test
	public void test01() throws Exception {
		String source_filepath = "/home/edmund/temp/archetype.txt";
		String destinaton_zip_filepath = "/home/edmund/temp/archetype.txt.gz";
		String new_source_filepath = "/home/edmund/temp/archetype.a.txt";

		Test09 gZipFile = new Test09();
		gZipFile.gzip(source_filepath, destinaton_zip_filepath);
		gZipFile.gunzip(destinaton_zip_filepath, new_source_filepath);
	}

	public void gzip(String source_filepath, String destinaton_zip_filepath) {

		byte[] buffer = new byte[1024];

		try {

			FileOutputStream fileOutputStream = new FileOutputStream(destinaton_zip_filepath);

			GZIPOutputStream gzipOuputStream = new GZIPOutputStream(fileOutputStream);

			FileInputStream fileInput = new FileInputStream(source_filepath);

			int bytes_read;

			while ((bytes_read = fileInput.read(buffer)) > 0) {
				gzipOuputStream.write(buffer, 0, bytes_read);
			}

			fileInput.close();

			gzipOuputStream.finish();
			gzipOuputStream.close();

			System.out.println("The file was compressed successfully!");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
    public void gunzip(String compressedFile, String decompressedFile) {
    	 
        byte[] buffer = new byte[1024];
 
        try {
 
            FileInputStream fileIn = new FileInputStream(compressedFile);
 
            GZIPInputStream gZIPInputStream = new GZIPInputStream(fileIn);
 
            FileOutputStream fileOutputStream = new FileOutputStream(decompressedFile);
 
            int bytes_read;
 
            while ((bytes_read = gZIPInputStream.read(buffer)) > 0) {
 
                fileOutputStream.write(buffer, 0, bytes_read);
            }
 
            gZIPInputStream.close();
            fileOutputStream.close();
 
            System.out.println("The file was decompressed successfully!");
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }	
}
