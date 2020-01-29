
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
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
                int R = (int)(pixObj.getRed() * brightness);
                int G = (int)(pixObj.getGreen() * brightness);
                int B = (int)(pixObj.getBlue() * brightness);

                if (R < 255 && G < 255 && B < 255) {
                    pixObj.setRed(R);
                    pixObj.setGreen(G);
                    pixObj.setBlue(B);
                } else {
                    double maxRGB = Math.max(pixObj.getRed(), pixObj.getBlue());
                    maxRGB = Math.max(maxRGB, pixObj.getGreen());                   
                    brightness = 255/maxRGB;

                    R = (int)(pixObj.getRed() * brightness);
                    G = (int)(pixObj.getGreen() * brightness);
                    B = (int)(pixObj.getBlue() * brightness);
                    
                    pixObj.setRed(R);
                    pixObj.setGreen(G);
                    pixObj.setBlue(B);
                }
            }
        }   
        pic.explore();

    }

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        //convertToBlackAndWhite();
        adjustBrightness(1.4);
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