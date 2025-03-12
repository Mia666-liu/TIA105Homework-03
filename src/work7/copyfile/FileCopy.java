package work7.copyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	    public static void main(String[] args) {
	        
	        String fileFrom = "C:/TIA105_Workspace/TIA105Homework-03/src/work7/copyfile/copyfrom.txt";
	        String fileTo = "C:/TIA105_Workspace/TIA105Homework-03/src/work7/copyfile/copyto.txt";

	        // 呼叫copyFile 方法
	        try {
	        	copyFile(fileFrom, fileTo);
	        	System.out.println("檔案複製成功：" + fileTo);
	        } catch (IOException e) {
	        	 System.err.println("檔案複製失敗：" + e.getMessage());
	        }
	    }

	    // 使用資料流 (Stream) 來複製檔案
	    public static void copyFile(String filePath1, String filePath2) throws IOException {
	        File file1 = new File(filePath1);
	        File file2 = new File(filePath2);

	        // 確保來源檔案存在
	        if (!file1.exists()) {
	            throw new FileNotFoundException("來源檔案不存在：" + filePath1);
	        }

	        // try-with-resources來確保資源正確關閉
	        try (FileInputStream fis = new FileInputStream(file1);
	             FileOutputStream fos = new FileOutputStream(file2)) {
	             
	        	// 每次讀取 1KB的資料，避免一次讀取整個檔案造成記憶體消耗過大
	            byte[] buf = new byte[1024]; // 1KB緩衝區
	            int Read;

	            // 讀取來源檔案並寫入到目標檔案
	            while ((Read = fis.read(buf)) != -1) {
	                fos.write(buf, 0, Read);
	                //從buf[0] 開始寫入bytesRead個位元組到fos
	            }
	        }
	    }
	}
