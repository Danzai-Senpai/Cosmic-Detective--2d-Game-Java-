package com.pFiction.gfx;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageUttils {

    public static BufferedImage loadImage(String filePath) {
        try {
            return ImageIO.read(ImageUttils.class.getResource(filePath));
        } catch (IOException e){
            System.out.println("O Covid não deixou a imagem ser renderizada. Adeus a mais uma vitima: " + filePath);
        }

        return null;
    }

}
