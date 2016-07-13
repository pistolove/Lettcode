package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

public class CreateSql {

    public static void main(String[] args) throws IOException {
        getMmsMessageSQL("/Users/liqqc/Desktop/white.txt", 104);
        System.err.println();
        System.err.println();
        System.err.println();
        getBroadcastWhiteListSQL("/Users/liqqc/Desktop/white.txt", 2);
    }

    public static void getMmsMessageSQL(String path, Integer actionType) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            StringBuffer buffer = null;
            String temp = "";
            while ((temp = reader.readLine()) != null) {
                buffer = new StringBuffer();
                buffer.append(
                        "insert into `MMS_CHANGE_LOG`(`id`, `object_id`, `action_type`, `process_status`, `data_status`, `p_level`) values(");
                buffer.append("\"" + UUID.randomUUID() + "\"");
                buffer.append(", " + temp);
                buffer.append(", " + actionType);
                buffer.append(", 0, 0, 1);");
                System.err.println(buffer.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    /**
     * 
     * @param path
     * @param VideoOrAlbumType 专辑：1  视频：2
     */
    public static void getBroadcastWhiteListSQL(String path, Integer VideoOrAlbumType){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            StringBuffer buffer = null;
            String temp = "";
            while ((temp = reader.readLine()) != null) {
                buffer = new StringBuffer();
                buffer.append(
                        "insert into `BROADCAST_WHITE_LIST`(`id`, `object_id`, `level`, `type`, `reason`, `broadcast`)  values(");
                buffer.append("\"" + (int)(Math.random() * 1000000) + "\"");
                buffer.append(", " + temp);
                buffer.append(", " + 1);
                buffer.append(", " + VideoOrAlbumType);
                buffer.append(", \"测试\", 2);");
                System.err.println(buffer.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
