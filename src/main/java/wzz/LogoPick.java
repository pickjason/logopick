package wzz;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/**
 * @program: logopick
 * @description: 自定义启动logo
 * @author: wzz
 * @create: 2019-05-08 17:40
 */

public class LogoPick {

    //自定义的logo字符地址
    private String logoPath;

    public LogoPick(String logoPath){
        this.logoPath=logoPath;
    }

    public LogoPick(){


    }

   public static void  DrawLogo(String logoPath)throws Exception{

       try {
           FileReader fileReader = new FileReader(logoPath);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String str;
           while ((str=bufferedReader.readLine())!=null){
               System.out.print(str+"\n");

           }

       }
       catch (Exception e){
           throw new Exception("没有找到这个文件？搞错了吗");

       }
    }

    public static void DrawLogo()throws Exception{
        String wzz="http://172.96.250.89/logopick/logo.txt";
            int HttpResult; // 服务器返回的状态
            try
            {
                URL url =new URL(wzz); // 创建URL
                URLConnection urlconn = url.openConnection(); // 试图连接并取得返回状态码
                urlconn.connect();
                HttpURLConnection httpconn =(HttpURLConnection)urlconn;
                HttpResult = httpconn.getResponseCode();
                if(HttpResult != HttpURLConnection.HTTP_OK) {
                    System.out.print("无法连接到");
                } else {
                    int filesize = urlconn.getContentLength(); // 取数据长度
                    InputStreamReader isReader = new InputStreamReader(urlconn.getInputStream(),"UTF-8");
                    BufferedReader reader = new BufferedReader(isReader);
                    StringBuffer buffer = new StringBuffer();
                    String line; // 用来保存每行读取的内容
                    line = reader.readLine(); // 读取第一行
                    while (line != null) { // 如果 line 为空说明读完了
                        buffer.append(line); // 将读到的内容添加到 buffer 中
                        buffer.append("\n"); // 添加换行符
                        line = reader.readLine(); // 读取下一行
                    }
                    System.out.print(buffer.toString());

                }
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

    }

    public static void Model(String target){
        if (!target.isEmpty()){

            Map<String,String> map = Model.toMap();
            char[] chars = target.toUpperCase().toCharArray();
            StringBuffer stringBuffer = new StringBuffer();
            for (char c:chars){
                String s = map.get((int) c+"".trim());
               stringBuffer.append(s);

            }
            System.out.print(stringBuffer.toString());


        }

    }




}
