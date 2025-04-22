package CommonUtils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class TakesScreenShot {

	public boolean CompareTwoScreenShots (String actualScreeShot, String ExpectedScreenshot) throws IOException {

		BufferedImage ActualImg = ImageIO.read(new File(actualScreeShot)); 
		BufferedImage ExpectedImg = ImageIO.read(new File(ExpectedScreenshot));

		ImageDiffer imgdiff = new ImageDiffer();

		ImageDiff imgdifferance = imgdiff.makeDiff(ExpectedImg, ActualImg);

		return imgdifferance.hasDiff();
	}
}
