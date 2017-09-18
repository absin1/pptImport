/**
 * 
 */
package pptImport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFBackground;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;

/**
 * @author ab
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			extracted();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.exit(0);
	}

	private static void extracted() throws IOException, FileNotFoundException {
		File file = new File("/home/ab/Downloads/Egg Drop.pptx");
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(file));
		List<XSLFSlide> slides = ppt.getSlides();
		/*for (XSLFSlide slide : slides) {
			XSLFSlideLayout slideLayout = slide.getSlideLayout();
			System.out.println("Title for slide number " + slide.getSlideNumber() + "- " + slide.getTitle()
					+ " and template " + slideLayout.getName());

		}*/
		XSLFSlide firstSlide = slides.get(0);
		firstSlide.get
		System.err.println(firstSlide.getXmlObject().toString());
	}

}
