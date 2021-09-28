import com.rakib.FooRunTimeException.FooRunTimeException;

public class FileUtils {

	public int Subtract10fromLargeNumber(int number) throws FooRunTimeException {
		if (number < 10) {
			throw new FooRunTimeException("the passed number smaller then 10 ");

		}

		return number - 10;
	}

	

}
