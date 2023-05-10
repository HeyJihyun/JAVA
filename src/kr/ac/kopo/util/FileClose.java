package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {

    public static void close(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(InputStream bis, InputStream fis) {
        close(bis);
        close(fis);
    }

    public static void close(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Reader fr) {
        if (fr != null) {
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Writer fw) {
        if (fw != null) {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Reader br, Reader fr) {
        close(br);
        close(fr);
    }

    public static void close(Writer bw, Writer fw) {
        close(bw);
        close(fw);
    }

    public static void close(OutputStream bos, OutputStream fos) {
        close(bos);
        close(fos);
    }

}
