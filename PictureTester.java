
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    public static void testZeroRed() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroRed();
        beach.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical() {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection() {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /* Method to convert a picture to black and white */
    public static void convertToBlackAndWhite() {
        Picture pic = new Picture("femaleLionAndHall.jpg");
        pic.explore();

        Pixel[][] pixels = pic.getPixels2D();

        for (Pixel[] rowArray: pixels) {
            for (Pixel pixObj: rowArray){  
                double average = pixObj.getAverage();
                pixObj.setRed((int)average);
                pixObj.setGreen((int)average);
                pixObj.setBlue((int)average);               
            }
        }   
        pic.explore();
    }

    /* Method to change the brightness of a picture */
    public static void adjustBrightness(double brightness) {
        Picture pic = new Picture("koala.jpg");
        pic.explore();
        Pixel[][] pixels = pic.getPixels2D();

        for (Pixel[] rowArray: pixels) {
            for (Pixel pixObj: rowArray){  
                if (pixObj.getRed()*brightness < 255 && pixObj.getGreen()*brightness < 255 && pixObj.getBlue()*brightness < 255) {
                    pixObj.setRed((int)(pixObj.getRed()*brightness));
                    pixObj.setGreen((int)(pixObj.getGreen()*brightness));
                    pixObj.setBlue((int)(pixObj.getBlue()*brightness));
                } else {
                    double maxRGB = Math.max(pixObj.getRed(), pixObj.getGreen());
                    maxRGB = Math.max(maxRGB, pixObj.getBlue());                   
                    int tbrightness = 255/(int)maxRGB;
                    pixObj.setRed((int)(pixObj.getRed()*tbrightness));
                    pixObj.setGreen((int)(pixObj.getGreen()*tbrightness));
                    pixObj.setBlue((int)(pixObj.getBlue()*tbrightness));
                }
            }
        }   
        pic.explore();
    }
    
    public static void verticalMirror() {
        Picture pic = new Picture("redMotorcycle.jpg");
        pic.explore();
       
        Pixel[][] pixels = pic.getPixels2D();
        
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length/2; c++) {
                pixels[r][(pixels[0].length-c)-1].setRed(pixels[r][c].getRed());
                pixels[r][(pixels[0].length-c)-1].setGreen(pixels[r][c].getGreen());
                pixels[r][(pixels[0].length-c)-1].setBlue(pixels[r][c].getBlue());
            }
        }
        pic.explore();
    }
    
    public static void horizontalMirror() {
        Picture pic = new Picture("redMotorcycle.jpg");
        pic.explore();
       
        Pixel[][] pixels = pic.getPixels2D();
        
        for (int r = 0; r < pixels.length/2; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                pixels[(pixels.length-r)-1][c].setRed(pixels[r][c].getRed());
                pixels[(pixels.length-r)-1][c].setGreen(pixels[r][c].getGreen());
                pixels[(pixels.length-r)-1][c].setBlue(pixels[r][c].getBlue());
            }
        }
        pic.explore();
    }
    
    public static void flipHorizontal() {
        Picture pic1 = new Picture("butterfly1.jpg");
        Picture pic2 = new Picture("butterfly1.jpg");
        pic1.explore();
       
        Pixel[][] pixels1 = pic1.getPixels2D();
        Pixel[][] pixels2 = pic2.getPixels2D();
        
        for (int r = 0; r < pixels1.length; r++) {
            for (int c = 0; c < pixels1[0].length; c++) {
                
            }
        }
        
        
        pic1.explore();
    }

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        //convertToBlackAndWhite();
        //horizontalMirror();
        flipHorizontal();
        //adjustBrightness(1.3);
        //testZeroBlue();
        //testZeroRed();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}