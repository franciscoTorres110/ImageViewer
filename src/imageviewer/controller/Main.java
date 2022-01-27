package imageviewer.controller;

import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;
import java.io.File;

public class Main {
    
    public static void main(String[] args){
        File file = new File("imagenes");
        FileImageLoader loader = new FileImageLoader(file);
        Image image = loader.load();
        MainFrame mainFrame = new MainFrame(loader);
        mainFrame.getImageDisplay().show(image);
    }
    
}
