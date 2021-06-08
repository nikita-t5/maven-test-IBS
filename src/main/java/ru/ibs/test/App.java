package ru.ibs.test;
import org.apache.commons.lang3.StringUtils;

public class App 
{
    public static void main( String[] args )
    {
        for (String arg:args)  
            System.out.print(StringUtils.upperCase(arg) + " ");   
	}
}
