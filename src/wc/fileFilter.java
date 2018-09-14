/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wc;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author jakylin
 */
public class fileFilter implements FileFilter{

    @Override
    public boolean accept(File pathname) {
            String name=pathname.getName();
            if(name.endsWith(".txt")||name.endsWith(".java")||name.endsWith(".c")||name.endsWith(".cpp")||pathname.isDirectory()){
                return true;
            }else{return false;}
    }
    
}
