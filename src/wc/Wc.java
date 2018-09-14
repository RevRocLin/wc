/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wc;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jakylin
 */
public class Wc {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         wcFunction function=new wcFunction();
        System.out.println("-c 返回文件 file.c 的字符数\n" +"-w 返回文件 file.c 的词的数目  \n" +"-l 返回文件 file.c 的行数");
        System.out.println("-s   递归处理目录下符合条件的文件。\n" +"-a   返回更复杂的数据（代码行 / 空行 / 注释行）。");
        System.out.println("请输入命令：（格式为：命令 文件路径）");
        while(true){
            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        String[] commond=input.split(" ");
        switch(commond[0]) {
            case "-c": 
                int num1=function.getCharNumber(commond[1]);
                System.out.println("字符数："+num1);
                break;
            case "-w":
                int num2=function.getWordNumber(commond[1]);
                System.out.println("单词数："+num2);
                break;
            case "-l":
                int num3=function.getLineNumber(commond[1]);
                System.out.println("行数："+num3);
                break;
            case "-a":
                int[] num4=function.extra_Function1(commond[1]);
                System.out.println("空行："+num4[0]+" "+"代码行："+num4[1]+" "+"注释行："+num4[2]);
                break;
            case"-s":
               function.scanFile(new File(commond[1]));
                break;
            default:
                System.out.println("命令不正确");
                break;
            }
    }
    
    }
}
