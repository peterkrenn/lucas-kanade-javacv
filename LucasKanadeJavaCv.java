import com.googlecode.javacv.*;
// import com.googlecode.javacv.cpp.*;
// import static com.googlecode.javacv.cpp.opencv_core.*;
// import static com.googlecode.javacv.cpp.opencv_imgproc.*;
import static com.googlecode.javacv.cpp.opencv_highgui.*;

public class LucasKanadeJavaCv {
  private static final String APP_NAME = "LucasKanadeJavaCv";
  private static final String OUTPUT_FILE_NAME =  "output.avi";
  private static final int FOURCC =  CV_FOURCC('X', 'V', 'I', 'D');
  private static final int MAX_CORNERS = 500;
  private static final int WINDOW_SIZE = 10;

  public static void main(String[] args) throws Exception {
    // Check parameters
    if (args.length < 1) {
      System.err.printf("%s: %s\n", APP_NAME, "No video name given");
      System.err.printf("Usage: java %s <video file name> [output file name]\n", APP_NAME);

      System.exit(1);
    }

    String outputFileName;
    if (args.length == 2) {
      outputFileName = args[1];
    }
    else
    {
      outputFileName = OUTPUT_FILE_NAME;
    }

    // Load Video
    String fileName = args[0];
    FrameGrabber grabber = new OpenCVFrameGrabber(fileName);
    grabber.start();
  }
}
