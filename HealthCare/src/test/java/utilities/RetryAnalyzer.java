package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{
	private int count=0;
	private int maxtry=3;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(!result.isSuccess())
		{
			if(count<maxtry)
			{
				count++;
				return true;
			}
		}
			
		return false;
	}

}
