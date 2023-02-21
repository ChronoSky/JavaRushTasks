package com.javarush.task.task16.task1631;


import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {


    public static ImageReader getImageReader(ImageTypes type){

        ImageReader imageReader;
        if (ImageTypes.JPG==type){
            imageReader = new JpgReader();
        }else if(ImageTypes.BMP==type){
            imageReader = new BmpReader();
        }else if(ImageTypes.PNG==type){
            imageReader = new PngReader();
        } else{
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return imageReader;
    }
}
