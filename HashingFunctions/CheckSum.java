import java.io.IOException;

public class CheckSum
{
  public static void main(String[] args)
  {
    int checkSum = 0;
    try
    {
      for (int currentByte = System.in.read(); currentByte != -1; currentByte = System.in.read())
      {
        checkSum = (checkSum >> 1) + ((checkSum & 1) << 15);
        checkSum += currentByte;
        checkSum &= 0xffff; // Keep it within bounds.
      } // for
      System.out.println(checkSum);
    } // try
    catch (IOException exception)
    {
      System.err.println(exception);
    } // catch
  } // main
} // CheckSum
